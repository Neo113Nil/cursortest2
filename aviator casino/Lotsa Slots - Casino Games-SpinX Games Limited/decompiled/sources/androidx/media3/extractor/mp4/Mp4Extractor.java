package androidx.media3.extractor.mp4;

/* loaded from: classes2.dex */
public final class Mp4Extractor implements androidx.media3.extractor.Extractor, androidx.media3.extractor.SeekMap {

    @java.lang.Deprecated
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda2
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final androidx.media3.extractor.Extractor[] createExtractors() {
            return androidx.media3.extractor.mp4.Mp4Extractor.lambda$static$1();
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
    private static final int FILE_TYPE_HEIC = 2;
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 16;
    public static final int FLAG_MARK_FIRST_VIDEO_TRACK_WITH_MAIN_ROLE = 8;
    public static final int FLAG_READ_MOTION_PHOTO_METADATA = 2;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;
    private androidx.media3.common.util.ParsableByteArray atomData;
    private final androidx.media3.common.util.ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final java.util.ArrayDeque<androidx.media3.extractor.mp4.Atom.ContainerAtom> containerAtoms;
    private long durationUs;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private int fileType;
    private int firstVideoTrackIndex;
    private final int flags;
    private com.google.common.collect.ImmutableList<androidx.media3.extractor.SniffFailure> lastSniffFailures;
    private androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata motionPhotoMetadata;
    private final androidx.media3.common.util.ParsableByteArray nalLength;
    private final androidx.media3.common.util.ParsableByteArray nalStartCode;
    private int parserState;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleTrackIndex;
    private final androidx.media3.common.util.ParsableByteArray scratch;
    private boolean seenFtypAtom;
    private final androidx.media3.extractor.mp4.SefReader sefReader;
    private final java.util.List<androidx.media3.common.Metadata.Entry> slowMotionMetadataEntries;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
    private androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] tracks;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static int brandToFileType(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    static /* synthetic */ androidx.media3.extractor.mp4.Track lambda$processMoovAtom$2(androidx.media3.extractor.mp4.Track track) {
        return track;
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ androidx.media3.extractor.Extractor getUnderlyingImplementation() {
        return androidx.media3.extractor.Extractor.CC.$default$getUnderlyingImplementation(this);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$newFactory$0(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.mp4.Mp4Extractor(factory)};
    }

    public static androidx.media3.extractor.ExtractorsFactory newFactory(final androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda1
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final androidx.media3.extractor.Extractor[] createExtractors() {
                return androidx.media3.extractor.mp4.Mp4Extractor.lambda$newFactory$0(androidx.media3.extractor.text.SubtitleParser.Factory.this);
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
            public /* synthetic */ androidx.media3.extractor.ExtractorsFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory2) {
                return androidx.media3.extractor.ExtractorsFactory.CC.$default$setSubtitleParserFactory(this, factory2);
            }
        };
    }

    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$1() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.mp4.Mp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, 16)};
    }

    @java.lang.Deprecated
    public Mp4Extractor() {
        this(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, 16);
    }

    public Mp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this(factory, 0);
    }

    @java.lang.Deprecated
    public Mp4Extractor(int i) {
        this(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, i);
    }

    public Mp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory factory, int i) {
        this.subtitleParserFactory = factory;
        this.flags = i;
        this.lastSniffFailures = com.google.common.collect.ImmutableList.of();
        this.parserState = (i & 4) != 0 ? 3 : 0;
        this.sefReader = new androidx.media3.extractor.mp4.SefReader();
        this.slowMotionMetadataEntries = new java.util.ArrayList();
        this.atomHeader = new androidx.media3.common.util.ParsableByteArray(16);
        this.containerAtoms = new java.util.ArrayDeque<>();
        this.nalStartCode = new androidx.media3.common.util.ParsableByteArray(androidx.media3.container.NalUnitUtil.NAL_START_CODE);
        this.nalLength = new androidx.media3.common.util.ParsableByteArray(4);
        this.scratch = new androidx.media3.common.util.ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = androidx.media3.extractor.ExtractorOutput.PLACEHOLDER;
        this.tracks = new androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[0];
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.SniffFailure sniffUnfragmented = androidx.media3.extractor.mp4.Sniffer.sniffUnfragmented(extractorInput, (this.flags & 2) != 0);
        this.lastSniffFailures = sniffUnfragmented != null ? com.google.common.collect.ImmutableList.of(sniffUnfragmented) : com.google.common.collect.ImmutableList.of();
        return sniffUnfragmented == null;
    }

    @Override // androidx.media3.extractor.Extractor
    public com.google.common.collect.ImmutableList<androidx.media3.extractor.SniffFailure> getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        if ((this.flags & 16) == 0) {
            extractorOutput = new androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        if (j == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.sefReader.reset();
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        for (androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track mp4Track : this.tracks) {
            updateSampleIndex(mp4Track, j2);
            if (mp4Track.trueHdSampleRechunker != null) {
                mp4Track.trueHdSampleRechunker.reset();
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        while (true) {
            int i = this.parserState;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    if (i == 3) {
                        return readSefData(extractorInput, positionHolder);
                    }
                    throw new java.lang.IllegalStateException();
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        return getSeekPoints(j, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j, int i) {
        long j2;
        long j3;
        long j4;
        long j5;
        int indexOfLaterOrEqualSynchronizationSample;
        androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] mp4TrackArr = this.tracks;
        if (mp4TrackArr.length == 0) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(androidx.media3.extractor.SeekPoint.START);
        }
        int i2 = i != -1 ? i : this.firstVideoTrackIndex;
        if (i2 != -1) {
            androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable = mp4TrackArr[i2].sampleTable;
            int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j);
            if (synchronizationSampleIndex == -1) {
                return new androidx.media3.extractor.SeekMap.SeekPoints(androidx.media3.extractor.SeekPoint.START);
            }
            j3 = trackSampleTable.timestampsUs[synchronizationSampleIndex];
            j2 = trackSampleTable.offsets[synchronizationSampleIndex];
            if (j3 < j && synchronizationSampleIndex < trackSampleTable.sampleCount - 1 && (indexOfLaterOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j)) != -1 && indexOfLaterOrEqualSynchronizationSample != synchronizationSampleIndex) {
                j5 = trackSampleTable.timestampsUs[indexOfLaterOrEqualSynchronizationSample];
                j4 = trackSampleTable.offsets[indexOfLaterOrEqualSynchronizationSample];
                if (i == -1) {
                    int i3 = 0;
                    while (true) {
                        androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] mp4TrackArr2 = this.tracks;
                        if (i3 >= mp4TrackArr2.length) {
                            break;
                        }
                        if (i3 != this.firstVideoTrackIndex) {
                            androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable2 = mp4TrackArr2[i3].sampleTable;
                            j2 = maybeAdjustSeekOffset(trackSampleTable2, j3, j2);
                            if (j5 != -9223372036854775807L) {
                                j4 = maybeAdjustSeekOffset(trackSampleTable2, j5, j4);
                            }
                        }
                        i3++;
                    }
                }
                androidx.media3.extractor.SeekPoint seekPoint = new androidx.media3.extractor.SeekPoint(j3, j2);
                if (j5 != -9223372036854775807L) {
                    return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
                }
                return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(j5, j4));
            }
        } else {
            j2 = Long.MAX_VALUE;
            j3 = j;
        }
        j4 = -1;
        j5 = -9223372036854775807L;
        if (i == -1) {
        }
        androidx.media3.extractor.SeekPoint seekPoint2 = new androidx.media3.extractor.SeekPoint(j3, j2);
        if (j5 != -9223372036854775807L) {
        }
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private boolean readAtomHeader(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.extractor.mp4.Atom.ContainerAtom peek;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j = this.atomSize;
        if (j == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && (peek = this.containerAtoms.peek()) != null) {
                length = peek.endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position = extractorInput.getPosition();
            long j2 = this.atomSize;
            int i = this.atomHeaderBytesRead;
            long j3 = (position + j2) - i;
            if (j2 != i && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new androidx.media3.extractor.mp4.Atom.ContainerAtom(this.atomType, j3));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j3);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            androidx.media3.common.util.Assertions.checkState(this.atomHeaderBytesRead == 8);
            androidx.media3.common.util.Assertions.checkState(this.atomSize <= 2147483647L);
            androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray((int) this.atomSize);
            java.lang.System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            processUnparsedAtom(extractorInput.getPosition() - this.atomHeaderBytesRead);
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private boolean readAtomPayload(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        boolean z;
        long j = this.atomSize - this.atomHeaderBytesRead;
        long position = extractorInput.getPosition() + j;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), this.atomHeaderBytesRead, (int) j);
            if (this.atomType == 1718909296) {
                this.seenFtypAtom = true;
                this.fileType = processFtypAtom(parsableByteArray);
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(new androidx.media3.extractor.mp4.Atom.LeafAtom(this.atomType, parsableByteArray));
            }
        } else {
            if (!this.seenFtypAtom && this.atomType == 1835295092) {
                this.fileType = 1;
            }
            if (j < 262144) {
                extractorInput.skipFully((int) j);
            } else {
                positionHolder.position = extractorInput.getPosition() + j;
                z = true;
                processAtomEnded(position);
                return (z || this.parserState == 2) ? false : true;
            }
        }
        z = false;
        processAtomEnded(position);
        if (z) {
        }
    }

    private int readSefData(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        int read = this.sefReader.read(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (read == 1 && positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return read;
    }

    private void processAtomEnded(long j) throws androidx.media3.common.ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j) {
            androidx.media3.extractor.mp4.Atom.ContainerAtom pop = this.containerAtoms.pop();
            if (pop.type == 1836019574) {
                processMoovAtom(pop);
                this.containerAtoms.clear();
                this.parserState = 2;
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(pop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private void processMoovAtom(androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtom) throws androidx.media3.common.ParserException {
        androidx.media3.common.Metadata metadata;
        androidx.media3.common.Metadata metadata2;
        int i;
        int i2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = this.fileType == 1;
        androidx.media3.extractor.GaplessInfoHolder gaplessInfoHolder = new androidx.media3.extractor.GaplessInfoHolder();
        androidx.media3.extractor.mp4.Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1969517665);
        if (leafAtomOfType != null) {
            androidx.media3.common.Metadata parseUdta = androidx.media3.extractor.mp4.AtomParsers.parseUdta(leafAtomOfType);
            gaplessInfoHolder.setFromMetadata(parseUdta);
            metadata = parseUdta;
        } else {
            metadata = null;
        }
        androidx.media3.extractor.mp4.Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(1835365473);
        androidx.media3.common.Metadata parseMdtaFromMeta = containerAtomOfType != null ? androidx.media3.extractor.mp4.AtomParsers.parseMdtaFromMeta(containerAtomOfType) : null;
        androidx.media3.common.Metadata metadata3 = new androidx.media3.common.Metadata(androidx.media3.extractor.mp4.AtomParsers.parseMvhd(((androidx.media3.extractor.mp4.Atom.LeafAtom) androidx.media3.common.util.Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1836476516))).data));
        long j = -9223372036854775807L;
        java.util.List<androidx.media3.extractor.mp4.TrackSampleTable> parseTraks = androidx.media3.extractor.mp4.AtomParsers.parseTraks(containerAtom, gaplessInfoHolder, -9223372036854775807L, null, (this.flags & 1) != 0, z, new com.google.common.base.Function() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.media3.extractor.mp4.Mp4Extractor.lambda$processMoovAtom$2((androidx.media3.extractor.mp4.Track) obj);
            }
        });
        long j2 = -9223372036854775807L;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (i3 < parseTraks.size()) {
            androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable = parseTraks.get(i3);
            if (trackSampleTable.sampleCount == 0) {
                i = i5;
                metadata2 = metadata;
            } else {
                androidx.media3.extractor.mp4.Track track = trackSampleTable.track;
                metadata2 = metadata;
                androidx.media3.common.Metadata metadata4 = parseMdtaFromMeta;
                long j3 = track.durationUs != j ? track.durationUs : trackSampleTable.durationUs;
                j2 = java.lang.Math.max(j2, j3);
                i = i5 + 1;
                androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track mp4Track = new androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track(track, trackSampleTable, this.extractorOutput.track(i5, track.type));
                if ("audio/true-hd".equals(track.format.sampleMimeType)) {
                    i2 = trackSampleTable.maximumSize * 16;
                } else {
                    i2 = trackSampleTable.maximumSize + 30;
                }
                androidx.media3.common.Format.Builder buildUpon = track.format.buildUpon();
                buildUpon.setMaxInputSize(i2);
                if (track.type == 2) {
                    if ((this.flags & 8) != 0) {
                        buildUpon.setRoleFlags(track.format.roleFlags | (i4 == -1 ? 1 : 2));
                    }
                    if (j3 > 0 && trackSampleTable.sampleCount > 0) {
                        buildUpon.setFrameRate(trackSampleTable.sampleCount / (j3 / 1000000.0f));
                    }
                }
                androidx.media3.extractor.mp4.MetadataUtil.setFormatGaplessInfo(track.type, gaplessInfoHolder, buildUpon);
                int i6 = track.type;
                androidx.media3.common.Metadata[] metadataArr = new androidx.media3.common.Metadata[3];
                metadataArr[0] = this.slowMotionMetadataEntries.isEmpty() ? null : new androidx.media3.common.Metadata(this.slowMotionMetadataEntries);
                metadataArr[1] = metadata2;
                metadataArr[2] = metadata3;
                parseMdtaFromMeta = metadata4;
                androidx.media3.extractor.mp4.MetadataUtil.setFormatMetadata(i6, parseMdtaFromMeta, buildUpon, metadataArr);
                mp4Track.trackOutput.format(buildUpon.build());
                if (track.type == 2 && i4 == -1) {
                    i4 = arrayList.size();
                }
                arrayList.add(mp4Track);
            }
            i3++;
            metadata = metadata2;
            i5 = i;
            j = -9223372036854775807L;
        }
        this.firstVideoTrackIndex = i4;
        this.durationUs = j2;
        androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] mp4TrackArr = (androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[]) arrayList.toArray(new androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[0]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(mp4TrackArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private int readSample(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        int i;
        androidx.media3.extractor.PositionHolder positionHolder2;
        int i2;
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track mp4Track = this.tracks[this.sampleTrackIndex];
        androidx.media3.extractor.TrackOutput trackOutput = mp4Track.trackOutput;
        int i3 = mp4Track.sampleIndex;
        long j = mp4Track.sampleTable.offsets[i3];
        int i4 = mp4Track.sampleTable.sizes[i3];
        androidx.media3.extractor.TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
        long j2 = (j - position) + this.sampleBytesRead;
        if (j2 < 0) {
            i = 1;
            positionHolder2 = positionHolder;
        } else {
            if (j2 < 262144) {
                if (mp4Track.track.sampleTransformation == 1) {
                    j2 += 8;
                    i4 -= 8;
                }
                extractorInput.skipFully((int) j2);
                if (mp4Track.track.nalUnitLengthFieldLength != 0) {
                    byte[] data = this.nalLength.getData();
                    data[0] = 0;
                    data[1] = 0;
                    data[2] = 0;
                    int i5 = mp4Track.track.nalUnitLengthFieldLength;
                    int i6 = 4;
                    int i7 = 4 - mp4Track.track.nalUnitLengthFieldLength;
                    while (this.sampleBytesWritten < i4) {
                        int i8 = this.sampleCurrentNalBytesRemaining;
                        if (i8 == 0) {
                            extractorInput.readFully(data, i7, i5);
                            this.sampleBytesRead += i5;
                            this.nalLength.setPosition(0);
                            int readInt = this.nalLength.readInt();
                            if (readInt < 0) {
                                throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid NAL length", null);
                            }
                            this.sampleCurrentNalBytesRemaining = readInt;
                            this.nalStartCode.setPosition(0);
                            trackOutput.sampleData(this.nalStartCode, i6);
                            this.sampleBytesWritten += i6;
                            i4 += i7;
                        } else {
                            int sampleData = trackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, i8, false);
                            this.sampleBytesRead += sampleData;
                            this.sampleBytesWritten += sampleData;
                            this.sampleCurrentNalBytesRemaining -= sampleData;
                            i6 = 4;
                        }
                    }
                } else {
                    if ("audio/ac4".equals(mp4Track.track.format.sampleMimeType)) {
                        if (this.sampleBytesWritten == 0) {
                            androidx.media3.extractor.Ac4Util.getAc4SampleHeader(i4, this.scratch);
                            trackOutput.sampleData(this.scratch, 7);
                            this.sampleBytesWritten += 7;
                        }
                        i4 += 7;
                    } else if (trueHdSampleRechunker != null) {
                        trueHdSampleRechunker.startSample(extractorInput);
                    }
                    while (true) {
                        int i9 = this.sampleBytesWritten;
                        if (i9 >= i4) {
                            break;
                        }
                        int sampleData2 = trackOutput.sampleData((androidx.media3.common.DataReader) extractorInput, i4 - i9, false);
                        this.sampleBytesRead += sampleData2;
                        this.sampleBytesWritten += sampleData2;
                        this.sampleCurrentNalBytesRemaining -= sampleData2;
                    }
                }
                int i10 = i4;
                long j3 = mp4Track.sampleTable.timestampsUs[i3];
                int i11 = mp4Track.sampleTable.flags[i3];
                if (trueHdSampleRechunker != null) {
                    trueHdSampleRechunker.sampleMetadata(trackOutput, j3, i11, i10, 0, null);
                    if (i3 + 1 == mp4Track.sampleTable.sampleCount) {
                        trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
                    }
                    i2 = 0;
                } else {
                    i2 = 0;
                    trackOutput.sampleMetadata(j3, i11, i10, 0, null);
                }
                mp4Track.sampleIndex++;
                this.sampleTrackIndex = -1;
                this.sampleBytesRead = i2;
                this.sampleBytesWritten = i2;
                this.sampleCurrentNalBytesRemaining = i2;
                return i2;
            }
            positionHolder2 = positionHolder;
            i = 1;
        }
        positionHolder2.position = j;
        return i;
    }

    private int getTrackIndexOfNextReadSample(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] mp4TrackArr = this.tracks;
            if (i3 >= mp4TrackArr.length) {
                break;
            }
            androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track mp4Track = mp4TrackArr[i3];
            int i4 = mp4Track.sampleIndex;
            if (i4 != mp4Track.sampleTable.sampleCount) {
                long j5 = mp4Track.sampleTable.offsets[i4];
                long j6 = ((long[][]) androidx.media3.common.util.Util.castNonNull(this.accumulatedSampleSizes))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + MAXIMUM_READ_AHEAD_BYTES_STREAM) ? i2 : i;
    }

    private void updateSampleIndex(androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track mp4Track, long j) {
        androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j);
        }
        mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.fileType != 2 || (this.flags & 2) == 0) {
            return;
        }
        this.extractorOutput.track(0, 4).format(new androidx.media3.common.Format.Builder().setMetadata(this.motionPhotoMetadata == null ? null : new androidx.media3.common.Metadata(this.motionPhotoMetadata)).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(-9223372036854775807L));
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        androidx.media3.extractor.mp4.AtomParsers.maybeSkipRemainingMetaAtomHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    private void processUnparsedAtom(long j) {
        if (this.atomType == 1836086884) {
            int i = this.atomHeaderBytesRead;
            this.motionPhotoMetadata = new androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata(0L, j, -9223372036854775807L, j + i, this.atomSize - i);
        }
    }

    private static long[][] calculateAccumulatedSampleSizes(androidx.media3.extractor.mp4.Mp4Extractor.Mp4Track[] mp4TrackArr) {
        long[][] jArr = new long[mp4TrackArr.length][];
        int[] iArr = new int[mp4TrackArr.length];
        long[] jArr2 = new long[mp4TrackArr.length];
        boolean[] zArr = new boolean[mp4TrackArr.length];
        for (int i = 0; i < mp4TrackArr.length; i++) {
            jArr[i] = new long[mp4TrackArr[i].sampleTable.sampleCount];
            jArr2[i] = mp4TrackArr[i].sampleTable.timestampsUs[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < mp4TrackArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < mp4TrackArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += mp4TrackArr[i3].sampleTable.sizes[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = mp4TrackArr[i3].sampleTable.timestampsUs[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private static long maybeAdjustSeekOffset(androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable, long j, long j2) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j);
        return synchronizationSampleIndex == -1 ? j2 : java.lang.Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j2);
    }

    private static int getSynchronizationSampleIndex(androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable, long j) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j) : indexOfEarlierOrEqualSynchronizationSample;
    }

    private static int processFtypAtom(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int brandToFileType = brandToFileType(parsableByteArray.readInt());
        if (brandToFileType != 0) {
            return brandToFileType;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            int brandToFileType2 = brandToFileType(parsableByteArray.readInt());
            if (brandToFileType2 != 0) {
                return brandToFileType2;
            }
        }
        return 0;
    }

    private static final class Mp4Track {
        public int sampleIndex;
        public final androidx.media3.extractor.mp4.TrackSampleTable sampleTable;
        public final androidx.media3.extractor.mp4.Track track;
        public final androidx.media3.extractor.TrackOutput trackOutput;
        public final androidx.media3.extractor.TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(androidx.media3.extractor.mp4.Track track, androidx.media3.extractor.mp4.TrackSampleTable trackSampleTable, androidx.media3.extractor.TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
            this.trueHdSampleRechunker = "audio/true-hd".equals(track.format.sampleMimeType) ? new androidx.media3.extractor.TrueHdSampleRechunker() : null;
        }
    }
}
