package com.google.android.exoplayer2.extractor.mp4;

/* loaded from: classes3.dex */
public class FragmentedMp4Extractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final int EXTRA_TRACKS_BASE_ID = 100;
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final int SAMPLE_GROUP_TYPE_seig = 1936025959;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final java.lang.String TAG = "FragmentedMp4Extractor";
    private final com.google.android.exoplayer2.extractor.TrackOutput additionalEmsgTrackOutput;
    private com.google.android.exoplayer2.util.ParsableByteArray atomData;
    private final com.google.android.exoplayer2.util.ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private com.google.android.exoplayer2.extractor.TrackOutput[] ceaTrackOutputs;
    private final java.util.List<com.google.android.exoplayer2.Format> closedCaptionFormats;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom> containerAtoms;
    private com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle currentTrackBundle;
    private long durationUs;
    private com.google.android.exoplayer2.extractor.TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder eventMessageEncoder;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalBuffer;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalPrefix;
    private final com.google.android.exoplayer2.util.ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long segmentIndexEarliestPresentationTimeUs;
    private final com.google.android.exoplayer2.extractor.mp4.Track sideloadedTrack;
    private final com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;
    private final android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle> trackBundles;
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = new com.google.android.exoplayer2.extractor.ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final com.google.android.exoplayer2.extractor.Extractor[] createExtractors() {
            return com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.lambda$static$0();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map map) {
            com.google.android.exoplayer2.extractor.Extractor[] createExtractors;
            createExtractors = createExtractors();
            return createExtractors;
        }
    };
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, com.google.common.base.Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final com.google.android.exoplayer2.Format EMSG_FORMAT = new com.google.android.exoplayer2.Format.Builder().setSampleMimeType("application/x-emsg").build();

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    protected com.google.android.exoplayer2.extractor.mp4.Track modifyTrack(com.google.android.exoplayer2.extractor.mp4.Track track) {
        return track;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
        return new com.google.android.exoplayer2.extractor.Extractor[]{new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor()};
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    public FragmentedMp4Extractor(int i) {
        this(i, null);
    }

    public FragmentedMp4Extractor(int i, com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster) {
        this(i, timestampAdjuster, null, java.util.Collections.emptyList());
    }

    public FragmentedMp4Extractor(int i, com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster, com.google.android.exoplayer2.extractor.mp4.Track track) {
        this(i, timestampAdjuster, track, java.util.Collections.emptyList());
    }

    public FragmentedMp4Extractor(int i, com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster, com.google.android.exoplayer2.extractor.mp4.Track track, java.util.List<com.google.android.exoplayer2.Format> list) {
        this(i, timestampAdjuster, track, list, null);
    }

    public FragmentedMp4Extractor(int i, com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster, com.google.android.exoplayer2.extractor.mp4.Track track, java.util.List<com.google.android.exoplayer2.Format> list, com.google.android.exoplayer2.extractor.TrackOutput trackOutput) {
        this.flags = i;
        this.timestampAdjuster = timestampAdjuster;
        this.sideloadedTrack = track;
        this.closedCaptionFormats = java.util.Collections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.eventMessageEncoder = new com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder();
        this.atomHeader = new com.google.android.exoplayer2.util.ParsableByteArray(16);
        this.nalStartCode = new com.google.android.exoplayer2.util.ParsableByteArray(com.google.android.exoplayer2.util.NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new com.google.android.exoplayer2.util.ParsableByteArray(5);
        this.nalBuffer = new com.google.android.exoplayer2.util.ParsableByteArray();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.scratch = new com.google.android.exoplayer2.util.ParsableByteArray(bArr);
        this.containerAtoms = new java.util.ArrayDeque<>();
        this.pendingMetadataSampleInfos = new java.util.ArrayDeque<>();
        this.trackBundles = new android.util.SparseArray<>();
        this.durationUs = -9223372036854775807L;
        this.pendingSeekTimeUs = -9223372036854775807L;
        this.segmentIndexEarliestPresentationTimeUs = -9223372036854775807L;
        this.extractorOutput = com.google.android.exoplayer2.extractor.ExtractorOutput.PLACEHOLDER;
        this.emsgTrackOutputs = new com.google.android.exoplayer2.extractor.TrackOutput[0];
        this.ceaTrackOutputs = new com.google.android.exoplayer2.extractor.TrackOutput[0];
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return com.google.android.exoplayer2.extractor.mp4.Sniffer.sniffFragmented(extractorInput);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        enterReadingAtomHeaderState();
        initExtraTracks();
        com.google.android.exoplayer2.extractor.mp4.Track track = this.sideloadedTrack;
        if (track != null) {
            this.trackBundles.put(0, new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle(extractorOutput.track(0, track.type), new com.google.android.exoplayer2.extractor.mp4.TrackSampleTable(this.sideloadedTrack, new long[0], new int[0], 0, new long[0], new int[0], 0L), new com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues(0, 0, 0, 0)));
            this.extractorOutput.endTracks();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        int size = this.trackBundles.size();
        for (int i = 0; i < size; i++) {
            this.trackBundles.valueAt(i).resetFragmentInfo();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.pendingSeekTimeUs = j2;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException {
        while (true) {
            int i = this.parserState;
            if (i != 0) {
                if (i == 1) {
                    readAtomPayload(extractorInput);
                } else if (i == 2) {
                    readEncryptionData(extractorInput);
                } else if (readSample(extractorInput)) {
                    return 0;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private boolean readAtomHeader(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
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
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = extractorInput.getPosition() - this.atomHeaderBytesRead;
        int i = this.atomType;
        if ((i == 1836019558 || i == 1835295092) && !this.haveOutputSeekMap) {
            this.extractorOutput.seekMap(new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(this.durationUs, position));
            this.haveOutputSeekMap = true;
        }
        if (this.atomType == 1836019558) {
            int size = this.trackBundles.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.google.android.exoplayer2.extractor.mp4.TrackFragment trackFragment = this.trackBundles.valueAt(i2).fragment;
                trackFragment.atomPosition = position;
                trackFragment.auxiliaryDataPosition = position;
                trackFragment.dataPosition = position;
            }
        }
        int i3 = this.atomType;
        if (i3 == 1835295092) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = position + this.atomSize;
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(i3)) {
            long position2 = (extractorInput.getPosition() + this.atomSize) - 8;
            this.containerAtoms.push(new com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom(this.atomType, position2));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(position2);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            if (this.atomHeaderBytesRead != 8) {
                throw com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.atomSize > 2147483647L) {
                throw com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = new com.google.android.exoplayer2.util.ParsableByteArray((int) this.atomSize);
            java.lang.System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            if (this.atomSize > 2147483647L) {
                throw com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private void readAtomPayload(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int i = ((int) this.atomSize) - this.atomHeaderBytesRead;
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), 8, i);
            onLeafAtomRead(new com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom(this.atomType, parsableByteArray), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void processAtomEnded(long j) throws com.google.android.exoplayer2.ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private void onLeafAtomRead(com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom, long j) throws com.google.android.exoplayer2.ParserException {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(leafAtom);
            return;
        }
        if (leafAtom.type == 1936286840) {
            android.util.Pair<java.lang.Long, com.google.android.exoplayer2.extractor.ChunkIndex> parseSidx = parseSidx(leafAtom.data, j);
            this.segmentIndexEarliestPresentationTimeUs = ((java.lang.Long) parseSidx.first).longValue();
            this.extractorOutput.seekMap((com.google.android.exoplayer2.extractor.SeekMap) parseSidx.second);
            this.haveOutputSeekMap = true;
            return;
        }
        if (leafAtom.type == 1701671783) {
            onEmsgLeafAtomRead(leafAtom.data);
        }
    }

    private void onContainerAtomRead(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom) throws com.google.android.exoplayer2.ParserException {
        if (containerAtom.type == 1836019574) {
            onMoovContainerAtomRead(containerAtom);
        } else if (containerAtom.type == 1836019558) {
            onMoofContainerAtomRead(containerAtom);
        } else {
            if (this.containerAtoms.isEmpty()) {
                return;
            }
            this.containerAtoms.peek().add(containerAtom);
        }
    }

    private void onMoovContainerAtomRead(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom) throws com.google.android.exoplayer2.ParserException {
        int i = 0;
        com.google.android.exoplayer2.util.Assertions.checkState(this.sideloadedTrack == null, "Unexpected moov box.");
        com.google.android.exoplayer2.drm.DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerAtom.leafChildren);
        com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom2 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom.getContainerAtomOfType(1836475768));
        android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues> sparseArray = new android.util.SparseArray<>();
        int size = containerAtom2.leafChildren.size();
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom = containerAtom2.leafChildren.get(i2);
            if (leafAtom.type == 1953654136) {
                android.util.Pair<java.lang.Integer, com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues> parseTrex = parseTrex(leafAtom.data);
                sparseArray.put(((java.lang.Integer) parseTrex.first).intValue(), (com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) parseTrex.second);
            } else if (leafAtom.type == 1835362404) {
                j = parseMehd(leafAtom.data);
            }
        }
        java.util.List<com.google.android.exoplayer2.extractor.mp4.TrackSampleTable> parseTraks = com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseTraks(containerAtom, new com.google.android.exoplayer2.extractor.GaplessInfoHolder(), j, drmInitDataFromAtoms, (this.flags & 16) != 0, false, new com.google.common.base.Function() { // from class: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.this.modifyTrack((com.google.android.exoplayer2.extractor.mp4.Track) obj);
            }
        });
        int size2 = parseTraks.size();
        if (this.trackBundles.size() == 0) {
            while (i < size2) {
                com.google.android.exoplayer2.extractor.mp4.TrackSampleTable trackSampleTable = parseTraks.get(i);
                com.google.android.exoplayer2.extractor.mp4.Track track = trackSampleTable.track;
                this.trackBundles.put(track.id, new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle(this.extractorOutput.track(i, track.type), trackSampleTable, getDefaultSampleValues(sparseArray, track.id)));
                this.durationUs = java.lang.Math.max(this.durationUs, track.durationUs);
                i++;
            }
            this.extractorOutput.endTracks();
            return;
        }
        com.google.android.exoplayer2.util.Assertions.checkState(this.trackBundles.size() == size2);
        while (i < size2) {
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable trackSampleTable2 = parseTraks.get(i);
            com.google.android.exoplayer2.extractor.mp4.Track track2 = trackSampleTable2.track;
            this.trackBundles.get(track2.id).reset(trackSampleTable2, getDefaultSampleValues(sparseArray, track2.id));
            i++;
        }
    }

    private com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues getDefaultSampleValues(android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) com.google.android.exoplayer2.util.Assertions.checkNotNull(sparseArray.get(i));
    }

    private void onMoofContainerAtomRead(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom) throws com.google.android.exoplayer2.ParserException {
        parseMoof(containerAtom, this.trackBundles, this.sideloadedTrack != null, this.flags, this.scratchBytes);
        com.google.android.exoplayer2.drm.DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerAtom.leafChildren);
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i = 0; i < size; i++) {
                this.trackBundles.valueAt(i).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != -9223372036854775807L) {
            int size2 = this.trackBundles.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.trackBundles.valueAt(i2).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = -9223372036854775807L;
        }
    }

    private void initExtraTracks() {
        int i;
        com.google.android.exoplayer2.extractor.TrackOutput[] trackOutputArr = new com.google.android.exoplayer2.extractor.TrackOutput[2];
        this.emsgTrackOutputs = trackOutputArr;
        com.google.android.exoplayer2.extractor.TrackOutput trackOutput = this.additionalEmsgTrackOutput;
        int i2 = 0;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.flags & 4) != 0) {
            trackOutputArr[i] = this.extractorOutput.track(100, 5);
            i3 = 101;
            i++;
        }
        com.google.android.exoplayer2.extractor.TrackOutput[] trackOutputArr2 = (com.google.android.exoplayer2.extractor.TrackOutput[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(this.emsgTrackOutputs, i);
        this.emsgTrackOutputs = trackOutputArr2;
        for (com.google.android.exoplayer2.extractor.TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.format(EMSG_FORMAT);
        }
        this.ceaTrackOutputs = new com.google.android.exoplayer2.extractor.TrackOutput[this.closedCaptionFormats.size()];
        while (i2 < this.ceaTrackOutputs.length) {
            com.google.android.exoplayer2.extractor.TrackOutput track = this.extractorOutput.track(i3, 3);
            track.format(this.closedCaptionFormats.get(i2));
            this.ceaTrackOutputs[i2] = track;
            i2++;
            i3++;
        }
    }

    private void onEmsgLeafAtomRead(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        long scaleLargeTimestamp;
        java.lang.String str;
        long scaleLargeTimestamp2;
        java.lang.String str2;
        long readUnsignedInt;
        long j;
        if (this.emsgTrackOutputs.length == 0) {
            return;
        }
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
        if (parseFullAtomVersion == 0) {
            java.lang.String str3 = (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            java.lang.String str4 = (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
            scaleLargeTimestamp = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, readUnsignedInt2);
            long j2 = this.segmentIndexEarliestPresentationTimeUs;
            long j3 = j2 != -9223372036854775807L ? j2 + scaleLargeTimestamp : -9223372036854775807L;
            str = str3;
            scaleLargeTimestamp2 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, readUnsignedInt2);
            str2 = str4;
            readUnsignedInt = parsableByteArray.readUnsignedInt();
            j = j3;
        } else {
            if (parseFullAtomVersion != 1) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Skipping unsupported emsg version: " + parseFullAtomVersion);
                return;
            }
            long readUnsignedInt3 = parsableByteArray.readUnsignedInt();
            j = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(parsableByteArray.readUnsignedLongToLong(), 1000000L, readUnsignedInt3);
            long scaleLargeTimestamp3 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, readUnsignedInt3);
            long readUnsignedInt4 = parsableByteArray.readUnsignedInt();
            str = (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            scaleLargeTimestamp2 = scaleLargeTimestamp3;
            readUnsignedInt = readUnsignedInt4;
            str2 = (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            scaleLargeTimestamp = -9223372036854775807L;
        }
        byte[] bArr = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr, 0, parsableByteArray.bytesLeft());
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray2 = new com.google.android.exoplayer2.util.ParsableByteArray(this.eventMessageEncoder.encode(new com.google.android.exoplayer2.metadata.emsg.EventMessage(str, str2, scaleLargeTimestamp2, readUnsignedInt, bArr)));
        int bytesLeft = parsableByteArray2.bytesLeft();
        for (com.google.android.exoplayer2.extractor.TrackOutput trackOutput : this.emsgTrackOutputs) {
            parsableByteArray2.setPosition(0);
            trackOutput.sampleData(parsableByteArray2, bytesLeft);
        }
        if (j == -9223372036854775807L) {
            this.pendingMetadataSampleInfos.addLast(new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo(scaleLargeTimestamp, true, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
            return;
        }
        if (!this.pendingMetadataSampleInfos.isEmpty()) {
            this.pendingMetadataSampleInfos.addLast(new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo(j, false, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
            return;
        }
        com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            j = timestampAdjuster.adjustSampleTimestamp(j);
        }
        for (com.google.android.exoplayer2.extractor.TrackOutput trackOutput2 : this.emsgTrackOutputs) {
            trackOutput2.sampleMetadata(j, 1, bytesLeft, 0, null);
        }
    }

    private static android.util.Pair<java.lang.Integer, com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues> parseTrex(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return android.util.Pair.create(java.lang.Integer.valueOf(parsableByteArray.readInt()), new com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues(parsableByteArray.readInt() - 1, parsableByteArray.readInt(), parsableByteArray.readInt(), parsableByteArray.readInt()));
    }

    private static long parseMehd(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom, android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle> sparseArray, boolean z, int i, byte[] bArr) throws com.google.android.exoplayer2.ParserException {
        int size = containerAtom.containerChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i2);
            if (containerAtom2.type == 1953653094) {
                parseTraf(containerAtom2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void parseTraf(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom, android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle> sparseArray, boolean z, int i, byte[] bArr) throws com.google.android.exoplayer2.ParserException {
        com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle parseTfhd = parseTfhd(((com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) com.google.android.exoplayer2.util.Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1952868452))).data, sparseArray, z);
        if (parseTfhd == null) {
            return;
        }
        com.google.android.exoplayer2.extractor.mp4.TrackFragment trackFragment = parseTfhd.fragment;
        long j = trackFragment.nextFragmentDecodeTime;
        boolean z2 = trackFragment.nextFragmentDecodeTimeIncludesMoov;
        parseTfhd.resetFragmentInfo();
        parseTfhd.currentlyInFragment = true;
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1952867444);
        if (leafAtomOfType != null && (i & 2) == 0) {
            trackFragment.nextFragmentDecodeTime = parseTfdt(leafAtomOfType.data);
            trackFragment.nextFragmentDecodeTimeIncludesMoov = true;
        } else {
            trackFragment.nextFragmentDecodeTime = j;
            trackFragment.nextFragmentDecodeTimeIncludesMoov = z2;
        }
        parseTruns(containerAtom, parseTfhd, i);
        com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox sampleDescriptionEncryptionBox = parseTfhd.moovSampleTable.track.getSampleDescriptionEncryptionBox(((com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) com.google.android.exoplayer2.util.Assertions.checkNotNull(trackFragment.header)).sampleDescriptionIndex);
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1935763834);
        if (leafAtomOfType2 != null) {
            parseSaiz((com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) com.google.android.exoplayer2.util.Assertions.checkNotNull(sampleDescriptionEncryptionBox), leafAtomOfType2.data, trackFragment);
        }
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1935763823);
        if (leafAtomOfType3 != null) {
            parseSaio(leafAtomOfType3.data, trackFragment);
        }
        com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(1936027235);
        if (leafAtomOfType4 != null) {
            parseSenc(leafAtomOfType4.data, trackFragment);
        }
        parseSampleGroups(containerAtom, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null, trackFragment);
        int size = containerAtom.leafChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom = containerAtom.leafChildren.get(i2);
            if (leafAtom.type == 1970628964) {
                parseUuid(leafAtom.data, trackFragment, bArr);
            }
        }
    }

    private static void parseTruns(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom, com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundle, int i) throws com.google.android.exoplayer2.ParserException {
        java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom> list = containerAtom.leafChildren;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom = list.get(i4);
            if (leafAtom.type == 1953658222) {
                com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = leafAtom.data;
                parsableByteArray.setPosition(12);
                int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (readUnsignedIntToInt > 0) {
                    i3 += readUnsignedIntToInt;
                    i2++;
                }
            }
        }
        trackBundle.currentTrackRunIndex = 0;
        trackBundle.currentSampleInTrackRun = 0;
        trackBundle.currentSampleIndex = 0;
        trackBundle.fragment.initTables(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom2 = list.get(i7);
            if (leafAtom2.type == 1953658222) {
                i6 = parseTrun(trackBundle, i5, i, leafAtom2.data, i6);
                i5++;
            }
        }
    }

    private static void parseSaiz(com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox trackEncryptionBox, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, com.google.android.exoplayer2.extractor.mp4.TrackFragment trackFragment) throws com.google.android.exoplayer2.ParserException {
        int i;
        int i2 = trackEncryptionBox.perSampleIvSize;
        parsableByteArray.setPosition(8);
        if ((com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt > trackFragment.sampleCount) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Saiz sample count " + readUnsignedIntToInt + " is greater than fragment sample count" + trackFragment.sampleCount, null);
        }
        if (readUnsignedByte == 0) {
            boolean[] zArr = trackFragment.sampleHasSubsampleEncryptionTable;
            i = 0;
            for (int i3 = 0; i3 < readUnsignedIntToInt; i3++) {
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                i += readUnsignedByte2;
                zArr[i3] = readUnsignedByte2 > i2;
            }
        } else {
            i = readUnsignedByte * readUnsignedIntToInt;
            java.util.Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, readUnsignedByte > i2);
        }
        java.util.Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, readUnsignedIntToInt, trackFragment.sampleCount, false);
        if (i > 0) {
            trackFragment.initEncryptionData(i);
        }
    }

    private static void parseSaio(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, com.google.android.exoplayer2.extractor.mp4.TrackFragment trackFragment) throws com.google.android.exoplayer2.ParserException {
        parsableByteArray.setPosition(8);
        int readInt = parsableByteArray.readInt();
        if ((com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(readInt) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt != 1) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Unexpected saio entry count: " + readUnsignedIntToInt, null);
        }
        trackFragment.auxiliaryDataPosition += com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(readInt) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle parseTfhd(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle> sparseArray, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        parsableByteArray.setPosition(8);
        int parseFullAtomFlags = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(parsableByteArray.readInt());
        com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle valueAt = z ? sparseArray.valueAt(0) : sparseArray.get(parsableByteArray.readInt());
        if (valueAt == null) {
            return null;
        }
        if ((parseFullAtomFlags & 1) != 0) {
            long readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            valueAt.fragment.dataPosition = readUnsignedLongToLong;
            valueAt.fragment.auxiliaryDataPosition = readUnsignedLongToLong;
        }
        com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues defaultSampleValues = valueAt.defaultSampleValues;
        if ((parseFullAtomFlags & 2) != 0) {
            i = parsableByteArray.readInt() - 1;
        } else {
            i = defaultSampleValues.sampleDescriptionIndex;
        }
        if ((parseFullAtomFlags & 8) != 0) {
            i2 = parsableByteArray.readInt();
        } else {
            i2 = defaultSampleValues.duration;
        }
        if ((parseFullAtomFlags & 16) != 0) {
            i3 = parsableByteArray.readInt();
        } else {
            i3 = defaultSampleValues.size;
        }
        if ((parseFullAtomFlags & 32) != 0) {
            i4 = parsableByteArray.readInt();
        } else {
            i4 = defaultSampleValues.flags;
        }
        valueAt.fragment.header = new com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues(i, i2, i3, i4);
        return valueAt;
    }

    private static long parseTfdt(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    private static int parseTrun(com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundle, int i, int i2, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i3) throws com.google.android.exoplayer2.ParserException {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6;
        com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundle2 = trackBundle;
        parsableByteArray.setPosition(8);
        int parseFullAtomFlags = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(parsableByteArray.readInt());
        com.google.android.exoplayer2.extractor.mp4.Track track = trackBundle2.moovSampleTable.track;
        com.google.android.exoplayer2.extractor.mp4.TrackFragment trackFragment = trackBundle2.fragment;
        com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues defaultSampleValues = (com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) com.google.android.exoplayer2.util.Util.castNonNull(trackFragment.header);
        trackFragment.trunLength[i] = parsableByteArray.readUnsignedIntToInt();
        trackFragment.trunDataPosition[i] = trackFragment.dataPosition;
        if ((parseFullAtomFlags & 1) != 0) {
            long[] jArr = trackFragment.trunDataPosition;
            jArr[i] = jArr[i] + parsableByteArray.readInt();
        }
        boolean z6 = (parseFullAtomFlags & 4) != 0;
        int i7 = defaultSampleValues.flags;
        if (z6) {
            i7 = parsableByteArray.readInt();
        }
        boolean z7 = (parseFullAtomFlags & 256) != 0;
        boolean z8 = (parseFullAtomFlags & 512) != 0;
        boolean z9 = (parseFullAtomFlags & 1024) != 0;
        boolean z10 = (parseFullAtomFlags & 2048) != 0;
        long j = 0;
        if (track.editListDurations != null && track.editListDurations.length == 1 && track.editListDurations[0] == 0) {
            j = ((long[]) com.google.android.exoplayer2.util.Util.castNonNull(track.editListMediaTimes))[0];
        }
        int[] iArr = trackFragment.sampleSizeTable;
        long[] jArr2 = trackFragment.samplePresentationTimesUs;
        boolean[] zArr = trackFragment.sampleIsSyncFrameTable;
        int i8 = i7;
        boolean z11 = track.type == 2 && (i2 & 1) != 0;
        int i9 = i3 + trackFragment.trunLength[i];
        boolean z12 = z11;
        long j2 = track.timescale;
        long j3 = trackFragment.nextFragmentDecodeTime;
        int i10 = i3;
        while (i10 < i9) {
            int checkNonNegative = checkNonNegative(z7 ? parsableByteArray.readInt() : defaultSampleValues.duration);
            if (z8) {
                i4 = parsableByteArray.readInt();
                z = z7;
            } else {
                z = z7;
                i4 = defaultSampleValues.size;
            }
            int checkNonNegative2 = checkNonNegative(i4);
            if (z9) {
                z2 = z6;
                i5 = parsableByteArray.readInt();
            } else if (i10 == 0 && z6) {
                z2 = z6;
                i5 = i8;
            } else {
                z2 = z6;
                i5 = defaultSampleValues.flags;
            }
            if (z10) {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                i6 = parsableByteArray.readInt();
            } else {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                i6 = 0;
            }
            jArr2[i10] = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp((i6 + j3) - j, 1000000L, j2);
            if (!trackFragment.nextFragmentDecodeTimeIncludesMoov) {
                jArr2[i10] = jArr2[i10] + trackBundle2.moovSampleTable.durationUs;
            }
            iArr[i10] = checkNonNegative2;
            zArr[i10] = ((i5 >> 16) & 1) == 0 && (!z12 || i10 == 0);
            j3 += checkNonNegative;
            i10++;
            trackBundle2 = trackBundle;
            z7 = z;
            z6 = z2;
            z10 = z3;
            z8 = z4;
            z9 = z5;
        }
        trackFragment.nextFragmentDecodeTime = j3;
        return i9;
    }

    private static int checkNonNegative(int i) throws com.google.android.exoplayer2.ParserException {
        if (i >= 0) {
            return i;
        }
        throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Unexpected negative value: " + i, null);
    }

    private static void parseUuid(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, com.google.android.exoplayer2.extractor.mp4.TrackFragment trackFragment, byte[] bArr) throws com.google.android.exoplayer2.ParserException {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (java.util.Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, trackFragment);
        }
    }

    private static void parseSenc(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, com.google.android.exoplayer2.extractor.mp4.TrackFragment trackFragment) throws com.google.android.exoplayer2.ParserException {
        parseSenc(parsableByteArray, 0, trackFragment);
    }

    private static void parseSenc(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, com.google.android.exoplayer2.extractor.mp4.TrackFragment trackFragment) throws com.google.android.exoplayer2.ParserException {
        parsableByteArray.setPosition(i + 8);
        int parseFullAtomFlags = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(parsableByteArray.readInt());
        if ((parseFullAtomFlags & 1) != 0) {
            throw com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (parseFullAtomFlags & 2) != 0;
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt == 0) {
            java.util.Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, trackFragment.sampleCount, false);
            return;
        }
        if (readUnsignedIntToInt != trackFragment.sampleCount) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Senc sample count " + readUnsignedIntToInt + " is different from fragment sample count" + trackFragment.sampleCount, null);
        }
        java.util.Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, z);
        trackFragment.initEncryptionData(parsableByteArray.bytesLeft());
        trackFragment.fillEncryptionData(parsableByteArray);
    }

    private static void parseSampleGroups(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom containerAtom, java.lang.String str, com.google.android.exoplayer2.extractor.mp4.TrackFragment trackFragment) throws com.google.android.exoplayer2.ParserException {
        byte[] bArr = null;
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = null;
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray2 = null;
        for (int i = 0; i < containerAtom.leafChildren.size(); i++) {
            com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom = containerAtom.leafChildren.get(i);
            com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray3 = leafAtom.data;
            if (leafAtom.type == 1935828848) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray = parsableByteArray3;
                }
            } else if (leafAtom.type == 1936158820) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray2 = parsableByteArray3;
                }
            }
        }
        if (parsableByteArray == null || parsableByteArray2 == null) {
            return;
        }
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        if (parseFullAtomVersion == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int parseFullAtomVersion2 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray2.readInt());
        parsableByteArray2.skipBytes(4);
        if (parseFullAtomVersion2 == 1) {
            if (parsableByteArray2.readUnsignedInt() == 0) {
                throw com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (parseFullAtomVersion2 >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw com.google.android.exoplayer2.ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        parsableByteArray2.skipBytes(1);
        int readUnsignedByte = parsableByteArray2.readUnsignedByte();
        int i2 = (readUnsignedByte & 240) >> 4;
        int i3 = readUnsignedByte & 15;
        boolean z = parsableByteArray2.readUnsignedByte() == 1;
        if (z) {
            int readUnsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (readUnsignedByte2 == 0) {
                int readUnsignedByte3 = parsableByteArray2.readUnsignedByte();
                bArr = new byte[readUnsignedByte3];
                parsableByteArray2.readBytes(bArr, 0, readUnsignedByte3);
            }
            trackFragment.definesEncryptionData = true;
            trackFragment.trackEncryptionBox = new com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i2, i3, bArr);
        }
    }

    private static android.util.Pair<java.lang.Long, com.google.android.exoplayer2.extractor.ChunkIndex> parseSidx(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, long j) throws com.google.android.exoplayer2.ParserException {
        long readUnsignedLongToLong;
        long readUnsignedLongToLong2;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullAtomVersion == 0) {
            readUnsignedLongToLong = parsableByteArray.readUnsignedInt();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j2 = readUnsignedLongToLong;
        long j3 = j + readUnsignedLongToLong2;
        long scaleLargeTimestamp = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j2, 1000000L, readUnsignedInt);
        parsableByteArray.skipBytes(2);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[readUnsignedShort];
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        long[] jArr3 = new long[readUnsignedShort];
        long j4 = j2;
        long j5 = scaleLargeTimestamp;
        int i = 0;
        while (i < readUnsignedShort) {
            int readInt = parsableByteArray.readInt();
            if ((readInt & Integer.MIN_VALUE) != 0) {
                throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr[i] = readInt & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j5;
            long j6 = j4 + readUnsignedInt2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i2 = readUnsignedShort;
            long scaleLargeTimestamp2 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j6, 1000000L, readUnsignedInt);
            jArr4[i] = scaleLargeTimestamp2 - jArr5[i];
            parsableByteArray.skipBytes(4);
            j3 += r1[i];
            i++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            readUnsignedShort = i2;
            j4 = j6;
            j5 = scaleLargeTimestamp2;
        }
        return android.util.Pair.create(java.lang.Long.valueOf(scaleLargeTimestamp), new com.google.android.exoplayer2.extractor.ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private void readEncryptionData(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int size = this.trackBundles.size();
        long j = Long.MAX_VALUE;
        com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundle = null;
        for (int i = 0; i < size; i++) {
            com.google.android.exoplayer2.extractor.mp4.TrackFragment trackFragment = this.trackBundles.valueAt(i).fragment;
            if (trackFragment.sampleEncryptionDataNeedsFill && trackFragment.auxiliaryDataPosition < j) {
                j = trackFragment.auxiliaryDataPosition;
                trackBundle = this.trackBundles.valueAt(i);
            }
        }
        if (trackBundle == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j - extractorInput.getPosition());
        if (position < 0) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        extractorInput.skipFully(position);
        trackBundle.fragment.fillEncryptionData(extractorInput);
    }

    private boolean readSample(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int sampleData;
        com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundle = this.currentTrackBundle;
        java.lang.Throwable th = null;
        if (trackBundle == null) {
            trackBundle = getNextTrackBundle(this.trackBundles);
            if (trackBundle == null) {
                int position = (int) (this.endOfMdatPosition - extractorInput.getPosition());
                if (position < 0) {
                    throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                extractorInput.skipFully(position);
                enterReadingAtomHeaderState();
                return false;
            }
            int currentSampleOffset = (int) (trackBundle.getCurrentSampleOffset() - extractorInput.getPosition());
            if (currentSampleOffset < 0) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring negative offset to sample data.");
                currentSampleOffset = 0;
            }
            extractorInput.skipFully(currentSampleOffset);
            this.currentTrackBundle = trackBundle;
        }
        int i = 4;
        int i2 = 1;
        if (this.parserState == 3) {
            this.sampleSize = trackBundle.getCurrentSampleSize();
            if (trackBundle.currentSampleIndex < trackBundle.firstSampleToOutputIndex) {
                extractorInput.skipFully(this.sampleSize);
                trackBundle.skipSampleEncryptionData();
                if (!trackBundle.next()) {
                    this.currentTrackBundle = null;
                }
                this.parserState = 3;
                return true;
            }
            if (trackBundle.moovSampleTable.track.sampleTransformation == 1) {
                this.sampleSize -= 8;
                extractorInput.skipFully(8);
            }
            if ("audio/ac4".equals(trackBundle.moovSampleTable.track.format.sampleMimeType)) {
                this.sampleBytesWritten = trackBundle.outputSampleEncryptionData(this.sampleSize, 7);
                com.google.android.exoplayer2.audio.Ac4Util.getAc4SampleHeader(this.sampleSize, this.scratch);
                trackBundle.output.sampleData(this.scratch, 7);
                this.sampleBytesWritten += 7;
            } else {
                this.sampleBytesWritten = trackBundle.outputSampleEncryptionData(this.sampleSize, 0);
            }
            this.sampleSize += this.sampleBytesWritten;
            this.parserState = 4;
            this.sampleCurrentNalBytesRemaining = 0;
        }
        com.google.android.exoplayer2.extractor.mp4.Track track = trackBundle.moovSampleTable.track;
        com.google.android.exoplayer2.extractor.TrackOutput trackOutput = trackBundle.output;
        long currentSamplePresentationTimeUs = trackBundle.getCurrentSamplePresentationTimeUs();
        com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            currentSamplePresentationTimeUs = timestampAdjuster.adjustSampleTimestamp(currentSamplePresentationTimeUs);
        }
        long j = currentSamplePresentationTimeUs;
        if (track.nalUnitLengthFieldLength == 0) {
            while (true) {
                int i3 = this.sampleBytesWritten;
                int i4 = this.sampleSize;
                if (i3 >= i4) {
                    break;
                }
                this.sampleBytesWritten += trackOutput.sampleData((com.google.android.exoplayer2.upstream.DataReader) extractorInput, i4 - i3, false);
            }
        } else {
            byte[] data = this.nalPrefix.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i5 = track.nalUnitLengthFieldLength + 1;
            int i6 = 4 - track.nalUnitLengthFieldLength;
            while (this.sampleBytesWritten < this.sampleSize) {
                int i7 = this.sampleCurrentNalBytesRemaining;
                if (i7 == 0) {
                    extractorInput.readFully(data, i6, i5);
                    this.nalPrefix.setPosition(0);
                    int readInt = this.nalPrefix.readInt();
                    if (readInt < i2) {
                        throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Invalid NAL length", th);
                    }
                    this.sampleCurrentNalBytesRemaining = readInt - 1;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, i);
                    trackOutput.sampleData(this.nalPrefix, i2);
                    this.processSeiNalUnitPayload = this.ceaTrackOutputs.length > 0 && com.google.android.exoplayer2.util.NalUnitUtil.isNalUnitSei(track.format.sampleMimeType, data[i]);
                    this.sampleBytesWritten += 5;
                    this.sampleSize += i6;
                } else {
                    if (this.processSeiNalUnitPayload) {
                        this.nalBuffer.reset(i7);
                        extractorInput.readFully(this.nalBuffer.getData(), 0, this.sampleCurrentNalBytesRemaining);
                        trackOutput.sampleData(this.nalBuffer, this.sampleCurrentNalBytesRemaining);
                        sampleData = this.sampleCurrentNalBytesRemaining;
                        int unescapeStream = com.google.android.exoplayer2.util.NalUnitUtil.unescapeStream(this.nalBuffer.getData(), this.nalBuffer.limit());
                        this.nalBuffer.setPosition("video/hevc".equals(track.format.sampleMimeType) ? 1 : 0);
                        this.nalBuffer.setLimit(unescapeStream);
                        com.google.android.exoplayer2.extractor.CeaUtil.consume(j, this.nalBuffer, this.ceaTrackOutputs);
                    } else {
                        sampleData = trackOutput.sampleData((com.google.android.exoplayer2.upstream.DataReader) extractorInput, i7, false);
                    }
                    this.sampleBytesWritten += sampleData;
                    this.sampleCurrentNalBytesRemaining -= sampleData;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int currentSampleFlags = trackBundle.getCurrentSampleFlags();
        com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox encryptionBoxIfEncrypted = trackBundle.getEncryptionBoxIfEncrypted();
        trackOutput.sampleMetadata(j, currentSampleFlags, this.sampleSize, 0, encryptionBoxIfEncrypted != null ? encryptionBoxIfEncrypted.cryptoData : null);
        outputPendingMetadataSamples(j);
        if (!trackBundle.next()) {
            this.currentTrackBundle = null;
        }
        this.parserState = 3;
        return true;
    }

    private void outputPendingMetadataSamples(long j) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.MetadataSampleInfo removeFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= removeFirst.size;
            long j2 = removeFirst.sampleTimeUs;
            if (removeFirst.sampleTimeIsRelative) {
                j2 += j;
            }
            com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                j2 = timestampAdjuster.adjustSampleTimestamp(j2);
            }
            for (com.google.android.exoplayer2.extractor.TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(j2, 1, removeFirst.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle getNextTrackBundle(android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle> sparseArray) {
        int size = sparseArray.size();
        com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle trackBundle = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle valueAt = sparseArray.valueAt(i);
            if ((valueAt.currentlyInFragment || valueAt.currentSampleIndex != valueAt.moovSampleTable.sampleCount) && (!valueAt.currentlyInFragment || valueAt.currentTrackRunIndex != valueAt.fragment.trunCount)) {
                long currentSampleOffset = valueAt.getCurrentSampleOffset();
                if (currentSampleOffset < j) {
                    trackBundle = valueAt;
                    j = currentSampleOffset;
                }
            }
        }
        return trackBundle;
    }

    private static com.google.android.exoplayer2.drm.DrmInitData getDrmInitDataFromAtoms(java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom> list) {
        int size = list.size();
        java.util.ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom leafAtom = list.get(i);
            if (leafAtom.type == 1886614376) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                byte[] data = leafAtom.data.getData();
                java.util.UUID parseUuid = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseUuid(data);
                if (parseUuid == null) {
                    com.google.android.exoplayer2.util.Log.w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new com.google.android.exoplayer2.drm.DrmInitData.SchemeData(parseUuid, "video/mp4", data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.google.android.exoplayer2.drm.DrmInitData(arrayList);
    }

    private static final class MetadataSampleInfo {
        public final boolean sampleTimeIsRelative;
        public final long sampleTimeUs;
        public final int size;

        public MetadataSampleInfo(long j, boolean z, int i) {
            this.sampleTimeUs = j;
            this.sampleTimeIsRelative = z;
            this.size = i;
        }
    }

    private static final class TrackBundle {
        private static final int SINGLE_SUBSAMPLE_ENCRYPTION_DATA_LENGTH = 8;
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        private boolean currentlyInFragment;
        public com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues defaultSampleValues;
        public int firstSampleToOutputIndex;
        public com.google.android.exoplayer2.extractor.mp4.TrackSampleTable moovSampleTable;
        public final com.google.android.exoplayer2.extractor.TrackOutput output;
        public final com.google.android.exoplayer2.extractor.mp4.TrackFragment fragment = new com.google.android.exoplayer2.extractor.mp4.TrackFragment();
        public final com.google.android.exoplayer2.util.ParsableByteArray scratch = new com.google.android.exoplayer2.util.ParsableByteArray();
        private final com.google.android.exoplayer2.util.ParsableByteArray encryptionSignalByte = new com.google.android.exoplayer2.util.ParsableByteArray(1);
        private final com.google.android.exoplayer2.util.ParsableByteArray defaultInitializationVector = new com.google.android.exoplayer2.util.ParsableByteArray();

        public TrackBundle(com.google.android.exoplayer2.extractor.TrackOutput trackOutput, com.google.android.exoplayer2.extractor.mp4.TrackSampleTable trackSampleTable, com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues defaultSampleValues) {
            this.output = trackOutput;
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            reset(trackSampleTable, defaultSampleValues);
        }

        public void reset(com.google.android.exoplayer2.extractor.mp4.TrackSampleTable trackSampleTable, com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues defaultSampleValues) {
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            this.output.format(trackSampleTable.track.format);
            resetFragmentInfo();
        }

        public void updateDrmInitData(com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(((com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) com.google.android.exoplayer2.util.Util.castNonNull(this.fragment.header)).sampleDescriptionIndex);
            this.output.format(this.moovSampleTable.track.format.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)).build());
        }

        public void resetFragmentInfo() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
            this.currentlyInFragment = false;
        }

        public void seek(long j) {
            for (int i = this.currentSampleIndex; i < this.fragment.sampleCount && this.fragment.getSamplePresentationTimeUs(i) < j; i++) {
                if (this.fragment.sampleIsSyncFrameTable[i]) {
                    this.firstSampleToOutputIndex = i;
                }
            }
        }

        public long getCurrentSamplePresentationTimeUs() {
            if (!this.currentlyInFragment) {
                return this.moovSampleTable.timestampsUs[this.currentSampleIndex];
            }
            return this.fragment.getSamplePresentationTimeUs(this.currentSampleIndex);
        }

        public long getCurrentSampleOffset() {
            if (!this.currentlyInFragment) {
                return this.moovSampleTable.offsets[this.currentSampleIndex];
            }
            return this.fragment.trunDataPosition[this.currentTrackRunIndex];
        }

        public int getCurrentSampleSize() {
            if (!this.currentlyInFragment) {
                return this.moovSampleTable.sizes[this.currentSampleIndex];
            }
            return this.fragment.sampleSizeTable[this.currentSampleIndex];
        }

        public int getCurrentSampleFlags() {
            int i;
            if (!this.currentlyInFragment) {
                i = this.moovSampleTable.flags[this.currentSampleIndex];
            } else {
                i = this.fragment.sampleIsSyncFrameTable[this.currentSampleIndex] ? 1 : 0;
            }
            return getEncryptionBoxIfEncrypted() != null ? i | 1073741824 : i;
        }

        public boolean next() {
            this.currentSampleIndex++;
            if (!this.currentlyInFragment) {
                return false;
            }
            int i = this.currentSampleInTrackRun + 1;
            this.currentSampleInTrackRun = i;
            int[] iArr = this.fragment.trunLength;
            int i2 = this.currentTrackRunIndex;
            if (i != iArr[i2]) {
                return true;
            }
            this.currentTrackRunIndex = i2 + 1;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public int outputSampleEncryptionData(int i, int i2) {
            com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray;
            int length;
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            if (encryptionBoxIfEncrypted.perSampleIvSize != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
                length = encryptionBoxIfEncrypted.perSampleIvSize;
            } else {
                byte[] bArr = (byte[]) com.google.android.exoplayer2.util.Util.castNonNull(encryptionBoxIfEncrypted.defaultInitializationVector);
                this.defaultInitializationVector.reset(bArr, bArr.length);
                parsableByteArray = this.defaultInitializationVector;
                length = bArr.length;
            }
            boolean sampleHasSubsampleEncryptionTable = this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex);
            boolean z = sampleHasSubsampleEncryptionTable || i2 != 0;
            this.encryptionSignalByte.getData()[0] = (byte) ((z ? 128 : 0) | length);
            this.encryptionSignalByte.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1, 1);
            this.output.sampleData(parsableByteArray, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!sampleHasSubsampleEncryptionTable) {
                this.scratch.reset(8);
                byte[] data = this.scratch.getData();
                data[0] = 0;
                data[1] = 1;
                data[2] = (byte) ((i2 >> 8) & 255);
                data[3] = (byte) (i2 & 255);
                data[4] = (byte) ((i >> 24) & 255);
                data[5] = (byte) ((i >> 16) & 255);
                data[6] = (byte) ((i >> 8) & 255);
                data[7] = (byte) (i & 255);
                this.output.sampleData(this.scratch, 8, 1);
                return length + 9;
            }
            com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray2 = this.fragment.sampleEncryptionData;
            int readUnsignedShort = parsableByteArray2.readUnsignedShort();
            parsableByteArray2.skipBytes(-2);
            int i3 = (readUnsignedShort * 6) + 2;
            if (i2 != 0) {
                this.scratch.reset(i3);
                byte[] data2 = this.scratch.getData();
                parsableByteArray2.readBytes(data2, 0, i3);
                int i4 = (((data2[2] & 255) << 8) | (data2[3] & 255)) + i2;
                data2[2] = (byte) ((i4 >> 8) & 255);
                data2[3] = (byte) (i4 & 255);
                parsableByteArray2 = this.scratch;
            }
            this.output.sampleData(parsableByteArray2, i3, 1);
            return length + 1 + i3;
        }

        public void skipSampleEncryptionData() {
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = this.fragment.sampleEncryptionData;
            if (encryptionBoxIfEncrypted.perSampleIvSize != 0) {
                parsableByteArray.skipBytes(encryptionBoxIfEncrypted.perSampleIvSize);
            }
            if (this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex)) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
            }
        }

        public com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox getEncryptionBoxIfEncrypted() {
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox sampleDescriptionEncryptionBox;
            if (!this.currentlyInFragment) {
                return null;
            }
            int i = ((com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues) com.google.android.exoplayer2.util.Util.castNonNull(this.fragment.header)).sampleDescriptionIndex;
            if (this.fragment.trackEncryptionBox != null) {
                sampleDescriptionEncryptionBox = this.fragment.trackEncryptionBox;
            } else {
                sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(i);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.isEncrypted) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }
    }
}
