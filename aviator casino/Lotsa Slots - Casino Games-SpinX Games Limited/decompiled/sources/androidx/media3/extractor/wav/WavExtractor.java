package androidx.media3.extractor.wav;

/* loaded from: classes2.dex */
public final class WavExtractor implements androidx.media3.extractor.Extractor {
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.wav.WavExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.wav.WavExtractor.lambda$static$0();
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
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final java.lang.String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private androidx.media3.extractor.wav.WavExtractor.OutputWriter outputWriter;
    private androidx.media3.extractor.TrackOutput trackOutput;
    private int state = 0;
    private long rf64SampleDataSize = -1;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    private interface OutputWriter {
        void init(int i, long j) throws androidx.media3.common.ParserException;

        void reset(long j);

        boolean sampleData(androidx.media3.extractor.ExtractorInput extractorInput, long j) throws java.io.IOException;
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
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.wav.WavExtractor()};
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return androidx.media3.extractor.wav.WavHeaderReader.checkFileType(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.state = j == 0 ? 0 : 4;
        androidx.media3.extractor.wav.WavExtractor.OutputWriter outputWriter = this.outputWriter;
        if (outputWriter != null) {
            outputWriter.reset(j2);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        assertInitialized();
        int i = this.state;
        if (i == 0) {
            readFileType(extractorInput);
            return 0;
        }
        if (i == 1) {
            readRf64SampleDataSize(extractorInput);
            return 0;
        }
        if (i == 2) {
            readFormat(extractorInput);
            return 0;
        }
        if (i == 3) {
            skipToSampleData(extractorInput);
            return 0;
        }
        if (i == 4) {
            return readSampleData(extractorInput);
        }
        throw new java.lang.IllegalStateException();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.trackOutput);
        androidx.media3.common.util.Util.castNonNull(this.extractorOutput);
    }

    private void readFileType(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkState(extractorInput.getPosition() == 0);
        int i = this.dataStartPosition;
        if (i != -1) {
            extractorInput.skipFully(i);
            this.state = 4;
        } else {
            if (!androidx.media3.extractor.wav.WavHeaderReader.checkFileType(extractorInput)) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
            this.state = 1;
        }
    }

    private void readRf64SampleDataSize(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.rf64SampleDataSize = androidx.media3.extractor.wav.WavHeaderReader.readRf64SampleDataSize(extractorInput);
        this.state = 2;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "trackOutput"})
    private void readFormat(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.wav.WavFormat readFormat = androidx.media3.extractor.wav.WavHeaderReader.readFormat(extractorInput);
        if (readFormat.formatType == 17) {
            this.outputWriter = new androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, readFormat);
        } else if (readFormat.formatType == 6) {
            this.outputWriter = new androidx.media3.extractor.wav.WavExtractor.PassthroughOutputWriter(this.extractorOutput, this.trackOutput, readFormat, "audio/g711-alaw", -1);
        } else if (readFormat.formatType == 7) {
            this.outputWriter = new androidx.media3.extractor.wav.WavExtractor.PassthroughOutputWriter(this.extractorOutput, this.trackOutput, readFormat, "audio/g711-mlaw", -1);
        } else {
            int pcmEncodingForType = androidx.media3.extractor.WavUtil.getPcmEncodingForType(readFormat.formatType, readFormat.bitsPerSample);
            if (pcmEncodingForType == 0) {
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + readFormat.formatType);
            }
            this.outputWriter = new androidx.media3.extractor.wav.WavExtractor.PassthroughOutputWriter(this.extractorOutput, this.trackOutput, readFormat, "audio/raw", pcmEncodingForType);
        }
        this.state = 3;
    }

    private void skipToSampleData(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        android.util.Pair<java.lang.Long, java.lang.Long> skipToSampleData = androidx.media3.extractor.wav.WavHeaderReader.skipToSampleData(extractorInput);
        this.dataStartPosition = ((java.lang.Long) skipToSampleData.first).intValue();
        long longValue = ((java.lang.Long) skipToSampleData.second).longValue();
        long j = this.rf64SampleDataSize;
        if (j != -1 && longValue == 4294967295L) {
            longValue = j;
        }
        this.dataEndPosition = this.dataStartPosition + longValue;
        long length = extractorInput.getLength();
        if (length != -1 && this.dataEndPosition > length) {
            androidx.media3.common.util.Log.w(TAG, "Data exceeds input length: " + this.dataEndPosition + ", " + length);
            this.dataEndPosition = length;
        }
        ((androidx.media3.extractor.wav.WavExtractor.OutputWriter) androidx.media3.common.util.Assertions.checkNotNull(this.outputWriter)).init(this.dataStartPosition, this.dataEndPosition);
        this.state = 4;
    }

    private int readSampleData(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkState(this.dataEndPosition != -1);
        return ((androidx.media3.extractor.wav.WavExtractor.OutputWriter) androidx.media3.common.util.Assertions.checkNotNull(this.outputWriter)).sampleData(extractorInput, this.dataEndPosition - extractorInput.getPosition()) ? -1 : 0;
    }

    private static final class PassthroughOutputWriter implements androidx.media3.extractor.wav.WavExtractor.OutputWriter {
        private final androidx.media3.extractor.ExtractorOutput extractorOutput;
        private final androidx.media3.common.Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final androidx.media3.extractor.TrackOutput trackOutput;
        private final androidx.media3.extractor.wav.WavFormat wavFormat;

        public PassthroughOutputWriter(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.extractor.wav.WavFormat wavFormat, java.lang.String str, int i) throws androidx.media3.common.ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int i2 = (wavFormat.numChannels * wavFormat.bitsPerSample) / 8;
            if (wavFormat.blockSize != i2) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Expected block size: " + i2 + "; got: " + wavFormat.blockSize, null);
            }
            int i3 = wavFormat.frameRateHz * i2 * 8;
            int max = java.lang.Math.max(i2, (wavFormat.frameRateHz * i2) / 10);
            this.targetSampleSizeBytes = max;
            this.format = new androidx.media3.common.Format.Builder().setSampleMimeType(str).setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(max).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(i).build();
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j) {
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int i, long j) {
            this.extractorOutput.seekMap(new androidx.media3.extractor.wav.WavSeekMap(this.wavFormat, 1, i, j));
            this.trackOutput.format(this.format);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(androidx.media3.extractor.ExtractorInput extractorInput, long j) throws java.io.IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.pendingOutputBytes) < (i2 = this.targetSampleSizeBytes)) {
                int sampleData = this.trackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, (int) java.lang.Math.min(i2 - i, j2), true);
                if (sampleData == -1) {
                    j2 = 0;
                } else {
                    this.pendingOutputBytes += sampleData;
                    j2 -= sampleData;
                }
            }
            int i3 = this.wavFormat.blockSize;
            int i4 = this.pendingOutputBytes / i3;
            if (i4 > 0) {
                long scaleLargeTimestamp = this.startTimeUs + androidx.media3.common.util.Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
                int i5 = i4 * i3;
                int i6 = this.pendingOutputBytes - i5;
                this.trackOutput.sampleMetadata(scaleLargeTimestamp, 1, i5, i6, null);
                this.outputFrameCount += i4;
                this.pendingOutputBytes = i6;
            }
            return j2 <= 0;
        }
    }

    private static final class ImaAdPcmOutputWriter implements androidx.media3.extractor.wav.WavExtractor.OutputWriter {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, com.ironsource.InterfaceC3141l1.a.b.h, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, androidx.compose.ui.layout.LayoutKt.LargeDimension};
        private final androidx.media3.common.util.ParsableByteArray decodedData;
        private final androidx.media3.extractor.ExtractorOutput extractorOutput;
        private final androidx.media3.common.Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final androidx.media3.extractor.TrackOutput trackOutput;
        private final androidx.media3.extractor.wav.WavFormat wavFormat;

        private static int numOutputFramesToBytes(int i, int i2) {
            return i * 2 * i2;
        }

        public ImaAdPcmOutputWriter(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.extractor.wav.WavFormat wavFormat) throws androidx.media3.common.ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int max = java.lang.Math.max(1, wavFormat.frameRateHz / 10);
            this.targetSampleSizeFrames = max;
            androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(wavFormat.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = readLittleEndianUnsignedShort;
            int i = wavFormat.numChannels;
            int i2 = (((wavFormat.blockSize - (i * 4)) * 8) / (wavFormat.bitsPerSample * i)) + 1;
            if (readLittleEndianUnsignedShort != i2) {
                throw androidx.media3.common.ParserException.createForMalformedContainer("Expected frames per block: " + i2 + "; got: " + readLittleEndianUnsignedShort, null);
            }
            int ceilDivide = androidx.media3.common.util.Util.ceilDivide(max, readLittleEndianUnsignedShort);
            this.inputData = new byte[wavFormat.blockSize * ceilDivide];
            this.decodedData = new androidx.media3.common.util.ParsableByteArray(ceilDivide * numOutputFramesToBytes(readLittleEndianUnsignedShort, i));
            int i3 = ((wavFormat.frameRateHz * wavFormat.blockSize) * 8) / readLittleEndianUnsignedShort;
            this.format = new androidx.media3.common.Format.Builder().setSampleMimeType("audio/raw").setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(numOutputFramesToBytes(max, i)).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(2).build();
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public void init(int i, long j) {
            this.extractorOutput.seekMap(new androidx.media3.extractor.wav.WavSeekMap(this.wavFormat, this.framesPerBlock, i, j));
            this.trackOutput.format(this.format);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0036 -> B:3:0x001c). Please report as a decompilation issue!!! */
        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean sampleData(androidx.media3.extractor.ExtractorInput extractorInput, long j) throws java.io.IOException {
            boolean z;
            int i;
            int numOutputBytesToFrames;
            int ceilDivide = androidx.media3.common.util.Util.ceilDivide(this.targetSampleSizeFrames - numOutputBytesToFrames(this.pendingOutputBytes), this.framesPerBlock) * this.wavFormat.blockSize;
            if (j != 0) {
                z = false;
                while (!z) {
                    if (this.pendingInputBytes >= ceilDivide) {
                        break;
                    }
                    int read = extractorInput.read(this.inputData, this.pendingInputBytes, (int) java.lang.Math.min(ceilDivide - r2, j));
                    if (read != -1) {
                        this.pendingInputBytes += read;
                    }
                }
                i = this.pendingInputBytes / this.wavFormat.blockSize;
                if (i > 0) {
                    decode(this.inputData, i, this.decodedData);
                    this.pendingInputBytes -= i * this.wavFormat.blockSize;
                    int limit = this.decodedData.limit();
                    this.trackOutput.sampleData(this.decodedData, limit);
                    int i2 = this.pendingOutputBytes + limit;
                    this.pendingOutputBytes = i2;
                    int numOutputBytesToFrames2 = numOutputBytesToFrames(i2);
                    int i3 = this.targetSampleSizeFrames;
                    if (numOutputBytesToFrames2 >= i3) {
                        writeSampleMetadata(i3);
                    }
                }
                if (z && (numOutputBytesToFrames = numOutputBytesToFrames(this.pendingOutputBytes)) > 0) {
                    writeSampleMetadata(numOutputBytesToFrames);
                }
                return z;
            }
            z = true;
            while (!z) {
            }
            i = this.pendingInputBytes / this.wavFormat.blockSize;
            if (i > 0) {
            }
            if (z) {
                writeSampleMetadata(numOutputBytesToFrames);
            }
            return z;
        }

        private void writeSampleMetadata(int i) {
            long scaleLargeTimestamp = this.startTimeUs + androidx.media3.common.util.Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
            int numOutputFramesToBytes = numOutputFramesToBytes(i);
            this.trackOutput.sampleMetadata(scaleLargeTimestamp, 1, numOutputFramesToBytes, this.pendingOutputBytes - numOutputFramesToBytes, null);
            this.outputFrameCount += i;
            this.pendingOutputBytes -= numOutputFramesToBytes;
        }

        private void decode(byte[] bArr, int i, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.wavFormat.numChannels; i3++) {
                    decodeBlockForChannel(bArr, i2, i3, parsableByteArray.getData());
                }
            }
            int numOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(numOutputFramesToBytes);
        }

        private void decodeBlockForChannel(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3 = this.wavFormat.blockSize;
            int i4 = this.wavFormat.numChannels;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int i8 = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int min = java.lang.Math.min(bArr[i5 + 2] & 255, 88);
            int i9 = STEP_TABLE[min];
            int i10 = ((i * this.framesPerBlock * i4) + i2) * 2;
            bArr2[i10] = (byte) (i8 & 255);
            bArr2[i10 + 1] = (byte) (i8 >> 8);
            for (int i11 = 0; i11 < i7 * 2; i11++) {
                byte b = bArr[((i11 / 8) * i4 * 4) + i6 + ((i11 / 2) % 4)];
                int i12 = i11 % 2 == 0 ? b & com.google.common.base.Ascii.SI : (b & 255) >> 4;
                int i13 = ((((i12 & 7) * 2) + 1) * i9) >> 3;
                if ((i12 & 8) != 0) {
                    i13 = -i13;
                }
                i8 = androidx.media3.common.util.Util.constrainValue(i8 + i13, -32768, androidx.compose.ui.layout.LayoutKt.LargeDimension);
                i10 += i4 * 2;
                bArr2[i10] = (byte) (i8 & 255);
                bArr2[i10 + 1] = (byte) (i8 >> 8);
                int i14 = min + INDEX_TABLE[i12];
                int[] iArr = STEP_TABLE;
                min = androidx.media3.common.util.Util.constrainValue(i14, 0, iArr.length - 1);
                i9 = iArr[min];
            }
        }

        private int numOutputBytesToFrames(int i) {
            return i / (this.wavFormat.numChannels * 2);
        }

        private int numOutputFramesToBytes(int i) {
            return numOutputFramesToBytes(i, this.wavFormat.numChannels);
        }
    }
}
