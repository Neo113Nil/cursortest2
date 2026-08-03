package com.google.android.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class TsExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final long AC3_FORMAT_IDENTIFIER = 1094921523;
    private static final long AC4_FORMAT_IDENTIFIER = 1094921524;
    private static final int BUFFER_SIZE = 9400;
    public static final int DEFAULT_TIMESTAMP_SEARCH_BYTES = 112800;
    private static final long E_AC3_FORMAT_IDENTIFIER = 1161904947;
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = new com.google.android.exoplayer2.extractor.ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.ts.TsExtractor$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final com.google.android.exoplayer2.extractor.Extractor[] createExtractors() {
            return com.google.android.exoplayer2.extractor.ts.TsExtractor.lambda$static$0();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map map) {
            com.google.android.exoplayer2.extractor.Extractor[] createExtractors;
            createExtractors = createExtractors();
            return createExtractors;
        }
    };
    private static final long HEVC_FORMAT_IDENTIFIER = 1212503619;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    public static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_AC4 = 172;
    public static final int TS_STREAM_TYPE_AIT = 257;
    public static final int TS_STREAM_TYPE_DC2_H262 = 128;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H263 = 16;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    public static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final android.util.SparseIntArray continuityCounters;
    private final com.google.android.exoplayer2.extractor.ts.TsDurationReader durationReader;
    private boolean hasOutputSeekMap;
    private com.google.android.exoplayer2.extractor.ts.TsPayloadReader id3Reader;
    private final int mode;
    private com.google.android.exoplayer2.extractor.ExtractorOutput output;
    private final com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory payloadReaderFactory;
    private int pcrPid;
    private boolean pendingSeekToStart;
    private int remainingPmts;
    private final java.util.List<com.google.android.exoplayer2.util.TimestampAdjuster> timestampAdjusters;
    private final int timestampSearchBytes;
    private final android.util.SparseBooleanArray trackIds;
    private final android.util.SparseBooleanArray trackPids;
    private boolean tracksEnded;
    private com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker tsBinarySearchSeeker;
    private final com.google.android.exoplayer2.util.ParsableByteArray tsPacketBuffer;
    private final android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> tsPayloadReaders;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ int access$108(com.google.android.exoplayer2.extractor.ts.TsExtractor tsExtractor) {
        int i = tsExtractor.remainingPmts;
        tsExtractor.remainingPmts = i + 1;
        return i;
    }

    static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
        return new com.google.android.exoplayer2.extractor.Extractor[]{new com.google.android.exoplayer2.extractor.ts.TsExtractor()};
    }

    public TsExtractor() {
        this(0);
    }

    public TsExtractor(int i) {
        this(1, i, 112800);
    }

    public TsExtractor(int i, int i2, int i3) {
        this(i, new com.google.android.exoplayer2.util.TimestampAdjuster(0L), new com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory(i2), i3);
    }

    public TsExtractor(int i, com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory factory) {
        this(i, timestampAdjuster, factory, 112800);
    }

    public TsExtractor(int i, com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory factory, int i2) {
        this.payloadReaderFactory = (com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory) com.google.android.exoplayer2.util.Assertions.checkNotNull(factory);
        this.timestampSearchBytes = i2;
        this.mode = i;
        if (i == 1 || i == 2) {
            this.timestampAdjusters = java.util.Collections.singletonList(timestampAdjuster);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.timestampAdjusters = arrayList;
            arrayList.add(timestampAdjuster);
        }
        this.tsPacketBuffer = new com.google.android.exoplayer2.util.ParsableByteArray(new byte[BUFFER_SIZE], 0);
        this.trackIds = new android.util.SparseBooleanArray();
        this.trackPids = new android.util.SparseBooleanArray();
        this.tsPayloadReaders = new android.util.SparseArray<>();
        this.continuityCounters = new android.util.SparseIntArray();
        this.durationReader = new com.google.android.exoplayer2.extractor.ts.TsDurationReader(i2);
        this.output = com.google.android.exoplayer2.extractor.ExtractorOutput.PLACEHOLDER;
        this.pcrPid = -1;
        resetPayloadReaders();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        byte[] data = this.tsPacketBuffer.getData();
        extractorInput.peekFully(data, 0, 940);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (data[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            extractorInput.skipFully(i);
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        int i;
        com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker tsBinarySearchSeeker;
        com.google.android.exoplayer2.util.Assertions.checkState(this.mode != 2);
        int size = this.timestampAdjusters.size();
        while (i < size) {
            com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster = this.timestampAdjusters.get(i);
            boolean z = timestampAdjuster.getTimestampOffsetUs() == -9223372036854775807L;
            if (!z) {
                long firstSampleTimestampUs = timestampAdjuster.getFirstSampleTimestampUs();
                if (firstSampleTimestampUs != -9223372036854775807L) {
                    if (firstSampleTimestampUs != 0) {
                        if (firstSampleTimestampUs == j2) {
                        }
                        timestampAdjuster.reset(j2);
                    }
                }
            } else {
                i = z ? 0 : i + 1;
                timestampAdjuster.reset(j2);
            }
        }
        if (j2 != 0 && (tsBinarySearchSeeker = this.tsBinarySearchSeeker) != null) {
            tsBinarySearchSeeker.setSeekTargetUs(j2);
        }
        this.tsPacketBuffer.reset(0);
        this.continuityCounters.clear();
        for (int i2 = 0; i2 < this.tsPayloadReaders.size(); i2++) {
            this.tsPayloadReaders.valueAt(i2).seek();
        }
        this.bytesSinceLastSync = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException {
        long length = extractorInput.getLength();
        if (this.tracksEnded) {
            if (length != -1 && this.mode != 2 && !this.durationReader.isDurationReadFinished()) {
                return this.durationReader.readDuration(extractorInput, positionHolder, this.pcrPid);
            }
            maybeOutputSeekMap(length);
            if (this.pendingSeekToStart) {
                this.pendingSeekToStart = false;
                seek(0L, 0L);
                if (extractorInput.getPosition() != 0) {
                    positionHolder.position = 0L;
                    return 1;
                }
            }
            com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker tsBinarySearchSeeker = this.tsBinarySearchSeeker;
            if (tsBinarySearchSeeker != null && tsBinarySearchSeeker.isSeeking()) {
                return this.tsBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
            }
        }
        if (!fillBufferWithAtLeastOnePacket(extractorInput)) {
            return -1;
        }
        int findEndOfFirstTsPacketInBuffer = findEndOfFirstTsPacketInBuffer();
        int limit = this.tsPacketBuffer.limit();
        if (findEndOfFirstTsPacketInBuffer > limit) {
            return 0;
        }
        int readInt = this.tsPacketBuffer.readInt();
        if ((8388608 & readInt) != 0) {
            this.tsPacketBuffer.setPosition(findEndOfFirstTsPacketInBuffer);
            return 0;
        }
        int i = (4194304 & readInt) != 0 ? 1 : 0;
        int i2 = (2096896 & readInt) >> 8;
        boolean z = (readInt & 32) != 0;
        com.google.android.exoplayer2.extractor.ts.TsPayloadReader tsPayloadReader = (readInt & 16) != 0 ? this.tsPayloadReaders.get(i2) : null;
        if (tsPayloadReader == null) {
            this.tsPacketBuffer.setPosition(findEndOfFirstTsPacketInBuffer);
            return 0;
        }
        if (this.mode != 2) {
            int i3 = readInt & 15;
            int i4 = this.continuityCounters.get(i2, i3 - 1);
            this.continuityCounters.put(i2, i3);
            if (i4 == i3) {
                this.tsPacketBuffer.setPosition(findEndOfFirstTsPacketInBuffer);
                return 0;
            }
            if (i3 != ((i4 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        }
        if (z) {
            int readUnsignedByte = this.tsPacketBuffer.readUnsignedByte();
            i |= (this.tsPacketBuffer.readUnsignedByte() & 64) != 0 ? 2 : 0;
            this.tsPacketBuffer.skipBytes(readUnsignedByte - 1);
        }
        boolean z2 = this.tracksEnded;
        if (shouldConsumePacketPayload(i2)) {
            this.tsPacketBuffer.setLimit(findEndOfFirstTsPacketInBuffer);
            tsPayloadReader.consume(this.tsPacketBuffer, i);
            this.tsPacketBuffer.setLimit(limit);
        }
        if (this.mode != 2 && !z2 && this.tracksEnded && length != -1) {
            this.pendingSeekToStart = true;
        }
        this.tsPacketBuffer.setPosition(findEndOfFirstTsPacketInBuffer);
        return 0;
    }

    private void maybeOutputSeekMap(long j) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.getDurationUs() != -9223372036854775807L) {
            com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker tsBinarySearchSeeker = new com.google.android.exoplayer2.extractor.ts.TsBinarySearchSeeker(this.durationReader.getPcrTimestampAdjuster(), this.durationReader.getDurationUs(), j, this.pcrPid, this.timestampSearchBytes);
            this.tsBinarySearchSeeker = tsBinarySearchSeeker;
            this.output.seekMap(tsBinarySearchSeeker.getSeekMap());
            return;
        }
        this.output.seekMap(new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(this.durationReader.getDurationUs()));
    }

    private boolean fillBufferWithAtLeastOnePacket(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        byte[] data = this.tsPacketBuffer.getData();
        if (9400 - this.tsPacketBuffer.getPosition() < 188) {
            int bytesLeft = this.tsPacketBuffer.bytesLeft();
            if (bytesLeft > 0) {
                java.lang.System.arraycopy(data, this.tsPacketBuffer.getPosition(), data, 0, bytesLeft);
            }
            this.tsPacketBuffer.reset(data, bytesLeft);
        }
        while (this.tsPacketBuffer.bytesLeft() < 188) {
            int limit = this.tsPacketBuffer.limit();
            int read = extractorInput.read(data, limit, 9400 - limit);
            if (read == -1) {
                return false;
            }
            this.tsPacketBuffer.setLimit(limit + read);
        }
        return true;
    }

    private int findEndOfFirstTsPacketInBuffer() throws com.google.android.exoplayer2.ParserException {
        int position = this.tsPacketBuffer.getPosition();
        int limit = this.tsPacketBuffer.limit();
        int findSyncBytePosition = com.google.android.exoplayer2.extractor.ts.TsUtil.findSyncBytePosition(this.tsPacketBuffer.getData(), position, limit);
        this.tsPacketBuffer.setPosition(findSyncBytePosition);
        int i = findSyncBytePosition + 188;
        if (i > limit) {
            int i2 = this.bytesSinceLastSync + (findSyncBytePosition - position);
            this.bytesSinceLastSync = i2;
            if (this.mode == 2 && i2 > 376) {
                throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.bytesSinceLastSync = 0;
        }
        return i;
    }

    private boolean shouldConsumePacketPayload(int i) {
        return this.mode == 2 || this.tracksEnded || !this.trackPids.get(i, false);
    }

    private void resetPayloadReaders() {
        this.trackIds.clear();
        this.tsPayloadReaders.clear();
        android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> createInitialPayloadReaders = this.payloadReaderFactory.createInitialPayloadReaders();
        int size = createInitialPayloadReaders.size();
        for (int i = 0; i < size; i++) {
            this.tsPayloadReaders.put(createInitialPayloadReaders.keyAt(i), createInitialPayloadReaders.valueAt(i));
        }
        this.tsPayloadReaders.put(0, new com.google.android.exoplayer2.extractor.ts.SectionReader(new com.google.android.exoplayer2.extractor.ts.TsExtractor.PatReader()));
        this.id3Reader = null;
    }

    private class PatReader implements com.google.android.exoplayer2.extractor.ts.SectionPayloadReader {
        private final com.google.android.exoplayer2.util.ParsableBitArray patScratch = new com.google.android.exoplayer2.util.ParsableBitArray(new byte[4]);

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster, com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }

        public PatReader() {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
            if (parsableByteArray.readUnsignedByte() == 0 && (parsableByteArray.readUnsignedByte() & 128) != 0) {
                parsableByteArray.skipBytes(6);
                int bytesLeft = parsableByteArray.bytesLeft() / 4;
                for (int i = 0; i < bytesLeft; i++) {
                    parsableByteArray.readBytes(this.patScratch, 4);
                    int readBits = this.patScratch.readBits(16);
                    this.patScratch.skipBits(3);
                    if (readBits == 0) {
                        this.patScratch.skipBits(13);
                    } else {
                        int readBits2 = this.patScratch.readBits(13);
                        if (com.google.android.exoplayer2.extractor.ts.TsExtractor.this.tsPayloadReaders.get(readBits2) == null) {
                            com.google.android.exoplayer2.extractor.ts.TsExtractor.this.tsPayloadReaders.put(readBits2, new com.google.android.exoplayer2.extractor.ts.SectionReader(com.google.android.exoplayer2.extractor.ts.TsExtractor.this.new PmtReader(readBits2)));
                            com.google.android.exoplayer2.extractor.ts.TsExtractor.access$108(com.google.android.exoplayer2.extractor.ts.TsExtractor.this);
                        }
                    }
                }
                if (com.google.android.exoplayer2.extractor.ts.TsExtractor.this.mode != 2) {
                    com.google.android.exoplayer2.extractor.ts.TsExtractor.this.tsPayloadReaders.remove(0);
                }
            }
        }
    }

    private class PmtReader implements com.google.android.exoplayer2.extractor.ts.SectionPayloadReader {
        private static final int TS_PMT_DESC_AC3 = 106;
        private static final int TS_PMT_DESC_AIT = 111;
        private static final int TS_PMT_DESC_DTS = 123;
        private static final int TS_PMT_DESC_DVBSUBS = 89;
        private static final int TS_PMT_DESC_DVB_EXT = 127;
        private static final int TS_PMT_DESC_DVB_EXT_AC4 = 21;
        private static final int TS_PMT_DESC_EAC3 = 122;
        private static final int TS_PMT_DESC_ISO639_LANG = 10;
        private static final int TS_PMT_DESC_REGISTRATION = 5;
        private final int pid;
        private final com.google.android.exoplayer2.util.ParsableBitArray pmtScratch = new com.google.android.exoplayer2.util.ParsableBitArray(new byte[5]);
        private final android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> trackIdToReaderScratch = new android.util.SparseArray<>();
        private final android.util.SparseIntArray trackIdToPidScratch = new android.util.SparseIntArray();

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster, com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }

        public PmtReader(int i) {
            this.pid = i;
        }

        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
            com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;
            if (parsableByteArray.readUnsignedByte() != 2) {
                return;
            }
            if (com.google.android.exoplayer2.extractor.ts.TsExtractor.this.mode == 1 || com.google.android.exoplayer2.extractor.ts.TsExtractor.this.mode == 2 || com.google.android.exoplayer2.extractor.ts.TsExtractor.this.remainingPmts == 1) {
                timestampAdjuster = (com.google.android.exoplayer2.util.TimestampAdjuster) com.google.android.exoplayer2.extractor.ts.TsExtractor.this.timestampAdjusters.get(0);
            } else {
                timestampAdjuster = new com.google.android.exoplayer2.util.TimestampAdjuster(((com.google.android.exoplayer2.util.TimestampAdjuster) com.google.android.exoplayer2.extractor.ts.TsExtractor.this.timestampAdjusters.get(0)).getFirstSampleTimestampUs());
                com.google.android.exoplayer2.extractor.ts.TsExtractor.this.timestampAdjusters.add(timestampAdjuster);
            }
            if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
                return;
            }
            parsableByteArray.skipBytes(1);
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            int i = 3;
            parsableByteArray.skipBytes(3);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            this.pmtScratch.skipBits(3);
            int i2 = 13;
            com.google.android.exoplayer2.extractor.ts.TsExtractor.this.pcrPid = this.pmtScratch.readBits(13);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            int i3 = 4;
            this.pmtScratch.skipBits(4);
            parsableByteArray.skipBytes(this.pmtScratch.readBits(12));
            if (com.google.android.exoplayer2.extractor.ts.TsExtractor.this.mode == 2 && com.google.android.exoplayer2.extractor.ts.TsExtractor.this.id3Reader == null) {
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo esInfo = new com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo(21, null, null, com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY);
                com.google.android.exoplayer2.extractor.ts.TsExtractor tsExtractor = com.google.android.exoplayer2.extractor.ts.TsExtractor.this;
                tsExtractor.id3Reader = tsExtractor.payloadReaderFactory.createPayloadReader(21, esInfo);
                if (com.google.android.exoplayer2.extractor.ts.TsExtractor.this.id3Reader != null) {
                    com.google.android.exoplayer2.extractor.ts.TsExtractor.this.id3Reader.init(timestampAdjuster, com.google.android.exoplayer2.extractor.ts.TsExtractor.this.output, new com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator(readUnsignedShort, 21, 8192));
                }
            }
            this.trackIdToReaderScratch.clear();
            this.trackIdToPidScratch.clear();
            int bytesLeft = parsableByteArray.bytesLeft();
            while (bytesLeft > 0) {
                parsableByteArray.readBytes(this.pmtScratch, 5);
                int readBits = this.pmtScratch.readBits(8);
                this.pmtScratch.skipBits(i);
                int readBits2 = this.pmtScratch.readBits(i2);
                this.pmtScratch.skipBits(i3);
                int readBits3 = this.pmtScratch.readBits(12);
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo readEsInfo = readEsInfo(parsableByteArray, readBits3);
                if (readBits == 6 || readBits == 5) {
                    readBits = readEsInfo.streamType;
                }
                bytesLeft -= readBits3 + 5;
                int i4 = com.google.android.exoplayer2.extractor.ts.TsExtractor.this.mode == 2 ? readBits : readBits2;
                if (!com.google.android.exoplayer2.extractor.ts.TsExtractor.this.trackIds.get(i4)) {
                    com.google.android.exoplayer2.extractor.ts.TsPayloadReader createPayloadReader = (com.google.android.exoplayer2.extractor.ts.TsExtractor.this.mode == 2 && readBits == 21) ? com.google.android.exoplayer2.extractor.ts.TsExtractor.this.id3Reader : com.google.android.exoplayer2.extractor.ts.TsExtractor.this.payloadReaderFactory.createPayloadReader(readBits, readEsInfo);
                    if (com.google.android.exoplayer2.extractor.ts.TsExtractor.this.mode != 2 || readBits2 < this.trackIdToPidScratch.get(i4, 8192)) {
                        this.trackIdToPidScratch.put(i4, readBits2);
                        this.trackIdToReaderScratch.put(i4, createPayloadReader);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.trackIdToPidScratch.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = this.trackIdToPidScratch.keyAt(i5);
                int valueAt = this.trackIdToPidScratch.valueAt(i5);
                com.google.android.exoplayer2.extractor.ts.TsExtractor.this.trackIds.put(keyAt, true);
                com.google.android.exoplayer2.extractor.ts.TsExtractor.this.trackPids.put(valueAt, true);
                com.google.android.exoplayer2.extractor.ts.TsPayloadReader valueAt2 = this.trackIdToReaderScratch.valueAt(i5);
                if (valueAt2 != null) {
                    if (valueAt2 != com.google.android.exoplayer2.extractor.ts.TsExtractor.this.id3Reader) {
                        valueAt2.init(timestampAdjuster, com.google.android.exoplayer2.extractor.ts.TsExtractor.this.output, new com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator(readUnsignedShort, keyAt, 8192));
                    }
                    com.google.android.exoplayer2.extractor.ts.TsExtractor.this.tsPayloadReaders.put(valueAt, valueAt2);
                }
            }
            if (com.google.android.exoplayer2.extractor.ts.TsExtractor.this.mode == 2) {
                if (com.google.android.exoplayer2.extractor.ts.TsExtractor.this.tracksEnded) {
                    return;
                }
                com.google.android.exoplayer2.extractor.ts.TsExtractor.this.output.endTracks();
                com.google.android.exoplayer2.extractor.ts.TsExtractor.this.remainingPmts = 0;
                com.google.android.exoplayer2.extractor.ts.TsExtractor.this.tracksEnded = true;
                return;
            }
            com.google.android.exoplayer2.extractor.ts.TsExtractor.this.tsPayloadReaders.remove(this.pid);
            com.google.android.exoplayer2.extractor.ts.TsExtractor tsExtractor2 = com.google.android.exoplayer2.extractor.ts.TsExtractor.this;
            tsExtractor2.remainingPmts = tsExtractor2.mode == 1 ? 0 : com.google.android.exoplayer2.extractor.ts.TsExtractor.this.remainingPmts - 1;
            if (com.google.android.exoplayer2.extractor.ts.TsExtractor.this.remainingPmts == 0) {
                com.google.android.exoplayer2.extractor.ts.TsExtractor.this.output.endTracks();
                com.google.android.exoplayer2.extractor.ts.TsExtractor.this.tracksEnded = true;
            }
        }

        private com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo readEsInfo(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) {
            int position = parsableByteArray.getPosition();
            int i2 = i + position;
            int i3 = -1;
            java.lang.String str = null;
            java.util.ArrayList arrayList = null;
            while (parsableByteArray.getPosition() < i2) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                int position2 = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
                if (position2 > i2) {
                    break;
                }
                if (readUnsignedByte == 5) {
                    long readUnsignedInt = parsableByteArray.readUnsignedInt();
                    if (readUnsignedInt != com.google.android.exoplayer2.extractor.ts.TsExtractor.AC3_FORMAT_IDENTIFIER) {
                        if (readUnsignedInt != com.google.android.exoplayer2.extractor.ts.TsExtractor.E_AC3_FORMAT_IDENTIFIER) {
                            if (readUnsignedInt != com.google.android.exoplayer2.extractor.ts.TsExtractor.AC4_FORMAT_IDENTIFIER) {
                                if (readUnsignedInt == com.google.android.exoplayer2.extractor.ts.TsExtractor.HEVC_FORMAT_IDENTIFIER) {
                                    i3 = 36;
                                }
                            }
                            i3 = 172;
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                } else {
                    if (readUnsignedByte != 106) {
                        if (readUnsignedByte != 122) {
                            if (readUnsignedByte == 127) {
                                if (parsableByteArray.readUnsignedByte() != 21) {
                                }
                                i3 = 172;
                            } else if (readUnsignedByte == 123) {
                                i3 = 138;
                            } else if (readUnsignedByte == 10) {
                                str = parsableByteArray.readString(3).trim();
                            } else if (readUnsignedByte == 89) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                while (parsableByteArray.getPosition() < position2) {
                                    java.lang.String trim = parsableByteArray.readString(3).trim();
                                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                                    byte[] bArr = new byte[4];
                                    parsableByteArray.readBytes(bArr, 0, 4);
                                    arrayList2.add(new com.google.android.exoplayer2.extractor.ts.TsPayloadReader.DvbSubtitleInfo(trim, readUnsignedByte2, bArr));
                                }
                                arrayList = arrayList2;
                                i3 = 89;
                            } else if (readUnsignedByte == 111) {
                                i3 = 257;
                            }
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                }
                parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
            }
            parsableByteArray.setPosition(i2);
            return new com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo(i3, str, arrayList, java.util.Arrays.copyOfRange(parsableByteArray.getData(), position, i2));
        }
    }
}
