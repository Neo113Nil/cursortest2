package androidx.media3.extractor.mp3;

/* loaded from: classes2.dex */
public final class Mp3Extractor implements androidx.media3.extractor.Extractor {
    public static final int FLAG_DISABLE_ID3_METADATA = 8;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    public static final int FLAG_ENABLE_INDEX_SEEKING = 4;
    private static final int MAX_SNIFF_BYTES = 32768;
    private static final int MAX_SYNC_BYTES = 131072;
    private static final int MPEG_AUDIO_HEADER_MASK = -128000;
    private static final int SCRATCH_LENGTH = 10;
    private static final int SEEK_HEADER_INFO = 1231971951;
    private static final int SEEK_HEADER_UNSET = 0;
    private static final int SEEK_HEADER_VBRI = 1447187017;
    private static final int SEEK_HEADER_XING = 1483304551;
    private static final java.lang.String TAG = "Mp3Extractor";
    private long basisTimeUs;
    private androidx.media3.extractor.TrackOutput currentTrackOutput;
    private boolean disableSeeking;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private final int flags;
    private final long forcedFirstSampleTimestampUs;
    private final androidx.media3.extractor.GaplessInfoHolder gaplessInfoHolder;
    private final androidx.media3.extractor.Id3Peeker id3Peeker;
    private boolean isSeekInProgress;
    private androidx.media3.common.Metadata metadata;
    private androidx.media3.extractor.TrackOutput realTrackOutput;
    private int sampleBytesRemaining;
    private long samplesRead;
    private final androidx.media3.common.util.ParsableByteArray scratch;
    private long seekTimeUs;
    private androidx.media3.extractor.mp3.Seeker seeker;
    private final androidx.media3.extractor.TrackOutput skippingTrackOutput;
    private final androidx.media3.extractor.MpegAudioUtil.Header synchronizedHeader;
    private int synchronizedHeaderData;
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.mp3.Mp3Extractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.mp3.Mp3Extractor.lambda$static$0();
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ androidx.media3.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map map) {
            androidx.media3.extractor.Extractor[] createExtractors;
            createExtractors = createExtractors();
            return createExtractors;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ androidx.media3.extractor.ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
            return androidx.media3.extractor.ExtractorsFactory.CC.$default$experimentalSetTextTrackTranscodingEnabled(this, z);
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ androidx.media3.extractor.ExtractorsFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            return androidx.media3.extractor.ExtractorsFactory.CC.$default$setSubtitleParserFactory(this, factory);
        }
    };
    private static final androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate REQUIRED_ID3_FRAME_PREDICATE = new androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate() { // from class: androidx.media3.extractor.mp3.Mp3Extractor$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return androidx.media3.extractor.mp3.Mp3Extractor.lambda$static$1(i, i2, i3, i4, i5);
        }
    };

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static boolean headersMatch(int i, long j) {
        return ((long) (i & MPEG_AUDIO_HEADER_MASK)) == (j & (-128000));
    }

    static /* synthetic */ boolean lambda$static$1(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ java.util.List getSniffFailureDetails() {
        java.util.List of;
        of = com.google.common.collect.ImmutableList.of();
        return of;
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ androidx.media3.extractor.Extractor getUnderlyingImplementation() {
        return androidx.media3.extractor.Extractor.CC.$default$getUnderlyingImplementation(this);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.mp3.Mp3Extractor()};
    }

    public Mp3Extractor() {
        this(0);
    }

    public Mp3Extractor(int i) {
        this(i, -9223372036854775807L);
    }

    public Mp3Extractor(int i, long j) {
        this.flags = (i & 2) != 0 ? i | 1 : i;
        this.forcedFirstSampleTimestampUs = j;
        this.scratch = new androidx.media3.common.util.ParsableByteArray(10);
        this.synchronizedHeader = new androidx.media3.extractor.MpegAudioUtil.Header();
        this.gaplessInfoHolder = new androidx.media3.extractor.GaplessInfoHolder();
        this.basisTimeUs = -9223372036854775807L;
        this.id3Peeker = new androidx.media3.extractor.Id3Peeker();
        androidx.media3.extractor.DiscardingTrackOutput discardingTrackOutput = new androidx.media3.extractor.DiscardingTrackOutput();
        this.skippingTrackOutput = discardingTrackOutput;
        this.currentTrackOutput = discardingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return synchronize(extractorInput, true);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        androidx.media3.extractor.TrackOutput track = extractorOutput.track(0, 1);
        this.realTrackOutput = track;
        this.currentTrackOutput = track;
        this.extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.synchronizedHeaderData = 0;
        this.basisTimeUs = -9223372036854775807L;
        this.samplesRead = 0L;
        this.sampleBytesRemaining = 0;
        this.seekTimeUs = j2;
        androidx.media3.extractor.mp3.Seeker seeker = this.seeker;
        if (!(seeker instanceof androidx.media3.extractor.mp3.IndexSeeker) || ((androidx.media3.extractor.mp3.IndexSeeker) seeker).isTimeUsInIndex(j2)) {
            return;
        }
        this.isSeekInProgress = true;
        this.currentTrackOutput = this.skippingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        assertInitialized();
        int readInternal = readInternal(extractorInput);
        if (readInternal == -1 && (this.seeker instanceof androidx.media3.extractor.mp3.IndexSeeker)) {
            long computeTimeUs = computeTimeUs(this.samplesRead);
            if (this.seeker.getDurationUs() != computeTimeUs) {
                ((androidx.media3.extractor.mp3.IndexSeeker) this.seeker).setDurationUs(computeTimeUs);
                this.extractorOutput.seekMap(this.seeker);
            }
        }
        return readInternal;
    }

    public void disableSeeking() {
        this.disableSeeking = true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int readInternal(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (this.synchronizedHeaderData == 0) {
            try {
                synchronize(extractorInput, false);
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        if (this.seeker == null) {
            androidx.media3.extractor.mp3.Seeker computeSeeker = computeSeeker(extractorInput);
            this.seeker = computeSeeker;
            this.extractorOutput.seekMap(computeSeeker);
            androidx.media3.common.Format.Builder metadata = new androidx.media3.common.Format.Builder().setSampleMimeType(this.synchronizedHeader.mimeType).setMaxInputSize(4096).setChannelCount(this.synchronizedHeader.channels).setSampleRate(this.synchronizedHeader.sampleRate).setEncoderDelay(this.gaplessInfoHolder.encoderDelay).setEncoderPadding(this.gaplessInfoHolder.encoderPadding).setMetadata((this.flags & 8) != 0 ? null : this.metadata);
            if (this.seeker.getAverageBitrate() != -2147483647) {
                metadata.setAverageBitrate(this.seeker.getAverageBitrate());
            }
            this.currentTrackOutput.format(metadata.build());
            this.firstSamplePosition = extractorInput.getPosition();
        } else if (this.firstSamplePosition != 0) {
            long position = extractorInput.getPosition();
            long j = this.firstSamplePosition;
            if (position < j) {
                extractorInput.skipFully((int) (j - position));
            }
        }
        return readSample(extractorInput);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"realTrackOutput", "seeker"})
    private int readSample(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (this.sampleBytesRemaining == 0) {
            extractorInput.resetPeekPosition();
            if (peekEndOfStreamOrHeader(extractorInput)) {
                return -1;
            }
            this.scratch.setPosition(0);
            int readInt = this.scratch.readInt();
            if (!headersMatch(readInt, this.synchronizedHeaderData) || androidx.media3.extractor.MpegAudioUtil.getFrameSize(readInt) == -1) {
                extractorInput.skipFully(1);
                this.synchronizedHeaderData = 0;
                return 0;
            }
            this.synchronizedHeader.setForHeaderData(readInt);
            if (this.basisTimeUs == -9223372036854775807L) {
                this.basisTimeUs = this.seeker.getTimeUs(extractorInput.getPosition());
                if (this.forcedFirstSampleTimestampUs != -9223372036854775807L) {
                    this.basisTimeUs += this.forcedFirstSampleTimestampUs - this.seeker.getTimeUs(0L);
                }
            }
            this.sampleBytesRemaining = this.synchronizedHeader.frameSize;
            androidx.media3.extractor.mp3.Seeker seeker = this.seeker;
            if (seeker instanceof androidx.media3.extractor.mp3.IndexSeeker) {
                androidx.media3.extractor.mp3.IndexSeeker indexSeeker = (androidx.media3.extractor.mp3.IndexSeeker) seeker;
                indexSeeker.maybeAddSeekPoint(computeTimeUs(this.samplesRead + this.synchronizedHeader.samplesPerFrame), extractorInput.getPosition() + this.synchronizedHeader.frameSize);
                if (this.isSeekInProgress && indexSeeker.isTimeUsInIndex(this.seekTimeUs)) {
                    this.isSeekInProgress = false;
                    this.currentTrackOutput = this.realTrackOutput;
                }
            }
        }
        int sampleData = this.currentTrackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, this.sampleBytesRemaining, true);
        if (sampleData == -1) {
            return -1;
        }
        int i = this.sampleBytesRemaining - sampleData;
        this.sampleBytesRemaining = i;
        if (i > 0) {
            return 0;
        }
        this.currentTrackOutput.sampleMetadata(computeTimeUs(this.samplesRead), 1, this.synchronizedHeader.frameSize, 0, null);
        this.samplesRead += this.synchronizedHeader.samplesPerFrame;
        this.sampleBytesRemaining = 0;
        return 0;
    }

    private long computeTimeUs(long j) {
        return this.basisTimeUs + ((j * 1000000) / this.synchronizedHeader.sampleRate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
    
        if (r13 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        r12.skipFully(r2 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        r11.synchronizedHeaderData = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a0, code lost:
    
        r12.resetPeekPosition();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean synchronize(androidx.media3.extractor.ExtractorInput extractorInput, boolean z) throws java.io.IOException {
        int i;
        int i2;
        int frameSize;
        int i3 = z ? 32768 : 131072;
        extractorInput.resetPeekPosition();
        if (extractorInput.getPosition() == 0) {
            androidx.media3.common.Metadata peekId3Data = this.id3Peeker.peekId3Data(extractorInput, (this.flags & 8) == 0 ? null : REQUIRED_ID3_FRAME_PREDICATE);
            this.metadata = peekId3Data;
            if (peekId3Data != null) {
                this.gaplessInfoHolder.setFromMetadata(peekId3Data);
            }
            i2 = (int) extractorInput.getPeekPosition();
            if (!z) {
                extractorInput.skipFully(i2);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!peekEndOfStreamOrHeader(extractorInput)) {
                this.scratch.setPosition(0);
                int readInt = this.scratch.readInt();
                if ((i == 0 || headersMatch(readInt, i)) && (frameSize = androidx.media3.extractor.MpegAudioUtil.getFrameSize(readInt)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.synchronizedHeader.setForHeaderData(readInt);
                        i = readInt;
                    }
                    extractorInput.advancePeekPosition(frameSize - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw androidx.media3.common.ParserException.createForMalformedContainer("Searched too many bytes.", null);
                    }
                    if (z) {
                        extractorInput.resetPeekPosition();
                        extractorInput.advancePeekPosition(i2 + i6);
                    } else {
                        extractorInput.skipFully(1);
                    }
                    i5 = i6;
                    i = 0;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new java.io.EOFException();
            }
        }
    }

    private boolean peekEndOfStreamOrHeader(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.mp3.Seeker seeker = this.seeker;
        if (seeker != null) {
            long dataEndPosition = seeker.getDataEndPosition();
            if (dataEndPosition != -1 && extractorInput.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.peekFully(this.scratch.getData(), 0, 4, true);
        } catch (java.io.EOFException unused) {
            return true;
        }
    }

    private androidx.media3.extractor.mp3.Seeker computeSeeker(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        long id3TlenUs;
        long j;
        androidx.media3.extractor.mp3.Seeker maybeReadSeekFrame = maybeReadSeekFrame(extractorInput);
        androidx.media3.extractor.mp3.MlltSeeker maybeHandleSeekMetadata = maybeHandleSeekMetadata(this.metadata, extractorInput.getPosition());
        if (this.disableSeeking) {
            return new androidx.media3.extractor.mp3.Seeker.UnseekableSeeker();
        }
        if ((this.flags & 4) != 0) {
            if (maybeHandleSeekMetadata != null) {
                id3TlenUs = maybeHandleSeekMetadata.getDurationUs();
                j = maybeHandleSeekMetadata.getDataEndPosition();
            } else if (maybeReadSeekFrame != null) {
                id3TlenUs = maybeReadSeekFrame.getDurationUs();
                j = maybeReadSeekFrame.getDataEndPosition();
            } else {
                id3TlenUs = getId3TlenUs(this.metadata);
                j = -1;
            }
            maybeReadSeekFrame = new androidx.media3.extractor.mp3.IndexSeeker(id3TlenUs, extractorInput.getPosition(), j);
        } else if (maybeHandleSeekMetadata != null) {
            maybeReadSeekFrame = maybeHandleSeekMetadata;
        } else if (maybeReadSeekFrame == null) {
            maybeReadSeekFrame = null;
        }
        if (maybeReadSeekFrame == null || !(maybeReadSeekFrame.isSeekable() || (this.flags & 1) == 0)) {
            return getConstantBitrateSeeker(extractorInput, (this.flags & 2) != 0);
        }
        return maybeReadSeekFrame;
    }

    private androidx.media3.extractor.mp3.Seeker maybeReadSeekFrame(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(this.synchronizedHeader.frameSize);
        extractorInput.peekFully(parsableByteArray.getData(), 0, this.synchronizedHeader.frameSize);
        int i = 21;
        if ((this.synchronizedHeader.version & 1) != 0) {
            if (this.synchronizedHeader.channels != 1) {
                i = 36;
            }
        } else if (this.synchronizedHeader.channels == 1) {
            i = 13;
        }
        int seekFrameHeader = getSeekFrameHeader(parsableByteArray, i);
        if (seekFrameHeader != SEEK_HEADER_INFO) {
            if (seekFrameHeader == SEEK_HEADER_VBRI) {
                androidx.media3.extractor.mp3.VbriSeeker create = androidx.media3.extractor.mp3.VbriSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
                extractorInput.skipFully(this.synchronizedHeader.frameSize);
                return create;
            }
            if (seekFrameHeader != SEEK_HEADER_XING) {
                extractorInput.resetPeekPosition();
                return null;
            }
        }
        androidx.media3.extractor.mp3.XingFrame parse = androidx.media3.extractor.mp3.XingFrame.parse(this.synchronizedHeader, parsableByteArray);
        if (!this.gaplessInfoHolder.hasGaplessInfo() && parse.encoderDelay != -1 && parse.encoderPadding != -1) {
            this.gaplessInfoHolder.encoderDelay = parse.encoderDelay;
            this.gaplessInfoHolder.encoderPadding = parse.encoderPadding;
        }
        long position = extractorInput.getPosition();
        if (extractorInput.getLength() != -1 && parse.dataSize != -1 && extractorInput.getLength() != parse.dataSize + position) {
            androidx.media3.common.util.Log.i(TAG, "Data size mismatch between stream (" + extractorInput.getLength() + ") and Xing frame (" + (parse.dataSize + position) + "), using Xing value.");
        }
        extractorInput.skipFully(this.synchronizedHeader.frameSize);
        if (seekFrameHeader == SEEK_HEADER_XING) {
            return androidx.media3.extractor.mp3.XingSeeker.create(parse, position);
        }
        return getConstantBitrateSeeker(position, parse, extractorInput.getLength());
    }

    private androidx.media3.extractor.mp3.Seeker getConstantBitrateSeeker(androidx.media3.extractor.ExtractorInput extractorInput, boolean z) throws java.io.IOException {
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        this.synchronizedHeader.setForHeaderData(this.scratch.readInt());
        return new androidx.media3.extractor.mp3.ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, z);
    }

    private androidx.media3.extractor.mp3.Seeker getConstantBitrateSeeker(long j, androidx.media3.extractor.mp3.XingFrame xingFrame, long j2) {
        long j3;
        long j4;
        long computeDurationUs = xingFrame.computeDurationUs();
        if (computeDurationUs == -9223372036854775807L) {
            return null;
        }
        if (xingFrame.dataSize != -1) {
            long j5 = j + xingFrame.dataSize;
            j3 = xingFrame.dataSize - xingFrame.header.frameSize;
            j4 = j5;
        } else {
            if (j2 == -1) {
                return null;
            }
            j3 = (j2 - j) - xingFrame.header.frameSize;
            j4 = j2;
        }
        long j6 = j3;
        return new androidx.media3.extractor.mp3.ConstantBitrateSeeker(j4, j + xingFrame.header.frameSize, com.google.common.primitives.Ints.checkedCast(androidx.media3.common.util.Util.scaleLargeValue(j6, 8000000L, computeDurationUs, java.math.RoundingMode.HALF_UP)), com.google.common.primitives.Ints.checkedCast(com.google.common.math.LongMath.divide(j6, xingFrame.frameCount, java.math.RoundingMode.HALF_UP)), false);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void assertInitialized() {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.realTrackOutput);
        androidx.media3.common.util.Util.castNonNull(this.extractorOutput);
    }

    private static int getSeekFrameHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        if (parsableByteArray.limit() >= i + 4) {
            parsableByteArray.setPosition(i);
            int readInt = parsableByteArray.readInt();
            if (readInt == SEEK_HEADER_XING || readInt == SEEK_HEADER_INFO) {
                return readInt;
            }
        }
        if (parsableByteArray.limit() < 40) {
            return 0;
        }
        parsableByteArray.setPosition(36);
        if (parsableByteArray.readInt() == SEEK_HEADER_VBRI) {
            return SEEK_HEADER_VBRI;
        }
        return 0;
    }

    private static androidx.media3.extractor.mp3.MlltSeeker maybeHandleSeekMetadata(androidx.media3.common.Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            androidx.media3.common.Metadata.Entry entry = metadata.get(i);
            if (entry instanceof androidx.media3.extractor.metadata.id3.MlltFrame) {
                return androidx.media3.extractor.mp3.MlltSeeker.create(j, (androidx.media3.extractor.metadata.id3.MlltFrame) entry, getId3TlenUs(metadata));
            }
        }
        return null;
    }

    private static long getId3TlenUs(androidx.media3.common.Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            androidx.media3.common.Metadata.Entry entry = metadata.get(i);
            if (entry instanceof androidx.media3.extractor.metadata.id3.TextInformationFrame) {
                androidx.media3.extractor.metadata.id3.TextInformationFrame textInformationFrame = (androidx.media3.extractor.metadata.id3.TextInformationFrame) entry;
                if (textInformationFrame.id.equals("TLEN")) {
                    return androidx.media3.common.util.Util.msToUs(java.lang.Long.parseLong(textInformationFrame.values.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }
}
