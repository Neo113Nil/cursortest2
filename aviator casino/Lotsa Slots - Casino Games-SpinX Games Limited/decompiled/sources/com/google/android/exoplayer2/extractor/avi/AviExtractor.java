package com.google.android.exoplayer2.extractor.avi;

/* loaded from: classes3.dex */
public final class AviExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final int AVIIF_KEYFRAME = 16;
    public static final int FOURCC_AVI_ = 541677121;
    public static final int FOURCC_JUNK = 1263424842;
    public static final int FOURCC_LIST = 1414744396;
    public static final int FOURCC_RIFF = 1179011410;
    public static final int FOURCC_auds = 1935963489;
    public static final int FOURCC_avih = 1751742049;
    public static final int FOURCC_hdrl = 1819436136;
    public static final int FOURCC_idx1 = 829973609;
    public static final int FOURCC_movi = 1769369453;
    public static final int FOURCC_strf = 1718776947;
    public static final int FOURCC_strh = 1752331379;
    public static final int FOURCC_strl = 1819440243;
    public static final int FOURCC_strn = 1852994675;
    public static final int FOURCC_txts = 1937012852;
    public static final int FOURCC_vids = 1935960438;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_FINDING_IDX1_HEADER = 4;
    private static final int STATE_FINDING_MOVI_HEADER = 3;
    private static final int STATE_READING_HDRL_BODY = 2;
    private static final int STATE_READING_HDRL_HEADER = 1;
    private static final int STATE_READING_IDX1_BODY = 5;
    private static final int STATE_READING_SAMPLES = 6;
    private static final int STATE_SKIPPING_TO_HDRL = 0;
    private static final java.lang.String TAG = "AviExtractor";
    private com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk aviHeader;
    private com.google.android.exoplayer2.extractor.avi.ChunkReader currentChunkReader;
    private int idx1BodySize;
    private long pendingReposition;
    private boolean seekMapHasBeenOutput;
    private int state;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch = new com.google.android.exoplayer2.util.ParsableByteArray(12);
    private final com.google.android.exoplayer2.extractor.avi.AviExtractor.ChunkHeaderHolder chunkHeaderHolder = new com.google.android.exoplayer2.extractor.avi.AviExtractor.ChunkHeaderHolder();
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput = new com.google.android.exoplayer2.extractor.DummyExtractorOutput();
    private com.google.android.exoplayer2.extractor.avi.ChunkReader[] chunkReaders = new com.google.android.exoplayer2.extractor.avi.ChunkReader[0];
    private long moviStart = -1;
    private long moviEnd = -1;
    private int hdrlSize = -1;
    private long durationUs = -9223372036854775807L;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput) {
        this.state = 0;
        this.extractorOutput = extractorOutput;
        this.pendingReposition = -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        extractorInput.peekFully(this.scratch.getData(), 0, 12);
        this.scratch.setPosition(0);
        if (this.scratch.readLittleEndianInt() != 1179011410) {
            return false;
        }
        this.scratch.skipBytes(4);
        return this.scratch.readLittleEndianInt() == 541677121;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException {
        if (resolvePendingReposition(extractorInput, positionHolder)) {
            return 1;
        }
        switch (this.state) {
            case 0:
                if (sniff(extractorInput)) {
                    extractorInput.skipFully(12);
                    this.state = 1;
                    return 0;
                }
                throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("AVI Header List not found", null);
            case 1:
                extractorInput.readFully(this.scratch.getData(), 0, 12);
                this.scratch.setPosition(0);
                this.chunkHeaderHolder.populateWithListHeaderFrom(this.scratch);
                if (this.chunkHeaderHolder.listType != 1819436136) {
                    throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("hdrl expected, found: " + this.chunkHeaderHolder.listType, null);
                }
                this.hdrlSize = this.chunkHeaderHolder.size;
                this.state = 2;
                return 0;
            case 2:
                int i = this.hdrlSize - 4;
                com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = new com.google.android.exoplayer2.util.ParsableByteArray(i);
                extractorInput.readFully(parsableByteArray.getData(), 0, i);
                parseHdrlBody(parsableByteArray);
                this.state = 3;
                return 0;
            case 3:
                if (this.moviStart != -1) {
                    long position = extractorInput.getPosition();
                    long j = this.moviStart;
                    if (position != j) {
                        this.pendingReposition = j;
                        return 0;
                    }
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 12);
                extractorInput.resetPeekPosition();
                this.scratch.setPosition(0);
                this.chunkHeaderHolder.populateFrom(this.scratch);
                int readLittleEndianInt = this.scratch.readLittleEndianInt();
                if (this.chunkHeaderHolder.chunkType == 1179011410) {
                    extractorInput.skipFully(12);
                    return 0;
                }
                if (this.chunkHeaderHolder.chunkType != 1414744396 || readLittleEndianInt != 1769369453) {
                    this.pendingReposition = extractorInput.getPosition() + this.chunkHeaderHolder.size + 8;
                    return 0;
                }
                long position2 = extractorInput.getPosition();
                this.moviStart = position2;
                this.moviEnd = position2 + this.chunkHeaderHolder.size + 8;
                if (!this.seekMapHasBeenOutput) {
                    if (((com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.aviHeader)).hasIndex()) {
                        this.state = 4;
                        this.pendingReposition = this.moviEnd;
                        return 0;
                    }
                    this.extractorOutput.seekMap(new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(this.durationUs));
                    this.seekMapHasBeenOutput = true;
                }
                this.pendingReposition = extractorInput.getPosition() + 12;
                this.state = 6;
                return 0;
            case 4:
                extractorInput.readFully(this.scratch.getData(), 0, 8);
                this.scratch.setPosition(0);
                int readLittleEndianInt2 = this.scratch.readLittleEndianInt();
                int readLittleEndianInt3 = this.scratch.readLittleEndianInt();
                if (readLittleEndianInt2 == 829973609) {
                    this.state = 5;
                    this.idx1BodySize = readLittleEndianInt3;
                } else {
                    this.pendingReposition = extractorInput.getPosition() + readLittleEndianInt3;
                }
                return 0;
            case 5:
                com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray2 = new com.google.android.exoplayer2.util.ParsableByteArray(this.idx1BodySize);
                extractorInput.readFully(parsableByteArray2.getData(), 0, this.idx1BodySize);
                parseIdx1Body(parsableByteArray2);
                this.state = 6;
                this.pendingReposition = this.moviStart;
                return 0;
            case 6:
                return readMoviChunks(extractorInput);
            default:
                throw new java.lang.AssertionError();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        this.pendingReposition = -1L;
        this.currentChunkReader = null;
        for (com.google.android.exoplayer2.extractor.avi.ChunkReader chunkReader : this.chunkReaders) {
            chunkReader.seekToPosition(j);
        }
        if (j == 0) {
            if (this.chunkReaders.length == 0) {
                this.state = 0;
                return;
            } else {
                this.state = 3;
                return;
            }
        }
        this.state = 6;
    }

    private boolean resolvePendingReposition(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException {
        boolean z;
        if (this.pendingReposition != -1) {
            long position = extractorInput.getPosition();
            long j = this.pendingReposition;
            if (j < position || j > 262144 + position) {
                positionHolder.position = j;
                z = true;
                this.pendingReposition = -1L;
                return z;
            }
            extractorInput.skipFully((int) (j - position));
        }
        z = false;
        this.pendingReposition = -1L;
        return z;
    }

    private void parseHdrlBody(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) throws java.io.IOException {
        com.google.android.exoplayer2.extractor.avi.ListChunk parseFrom = com.google.android.exoplayer2.extractor.avi.ListChunk.parseFrom(1819436136, parsableByteArray);
        if (parseFrom.getType() != 1819436136) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Unexpected header list type " + parseFrom.getType(), null);
        }
        com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk aviMainHeaderChunk = (com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk) parseFrom.getChild(com.google.android.exoplayer2.extractor.avi.AviMainHeaderChunk.class);
        if (aviMainHeaderChunk == null) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("AviHeader not found", null);
        }
        this.aviHeader = aviMainHeaderChunk;
        this.durationUs = aviMainHeaderChunk.totalFrames * aviMainHeaderChunk.frameDurationUs;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.common.collect.UnmodifiableIterator<com.google.android.exoplayer2.extractor.avi.AviChunk> it = parseFrom.children.iterator();
        int i = 0;
        while (it.hasNext()) {
            com.google.android.exoplayer2.extractor.avi.AviChunk next = it.next();
            if (next.getType() == 1819440243) {
                int i2 = i + 1;
                com.google.android.exoplayer2.extractor.avi.ChunkReader processStreamList = processStreamList((com.google.android.exoplayer2.extractor.avi.ListChunk) next, i);
                if (processStreamList != null) {
                    arrayList.add(processStreamList);
                }
                i = i2;
            }
        }
        this.chunkReaders = (com.google.android.exoplayer2.extractor.avi.ChunkReader[]) arrayList.toArray(new com.google.android.exoplayer2.extractor.avi.ChunkReader[0]);
        this.extractorOutput.endTracks();
    }

    private void parseIdx1Body(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        long peekSeekOffset = peekSeekOffset(parsableByteArray);
        while (parsableByteArray.bytesLeft() >= 16) {
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            int readLittleEndianInt2 = parsableByteArray.readLittleEndianInt();
            long readLittleEndianInt3 = parsableByteArray.readLittleEndianInt() + peekSeekOffset;
            parsableByteArray.readLittleEndianInt();
            com.google.android.exoplayer2.extractor.avi.ChunkReader chunkReader = getChunkReader(readLittleEndianInt);
            if (chunkReader != null) {
                if ((readLittleEndianInt2 & 16) == 16) {
                    chunkReader.appendKeyFrameToIndex(readLittleEndianInt3);
                }
                chunkReader.incrementIndexChunkCount();
            }
        }
        for (com.google.android.exoplayer2.extractor.avi.ChunkReader chunkReader2 : this.chunkReaders) {
            chunkReader2.compactIndex();
        }
        this.seekMapHasBeenOutput = true;
        this.extractorOutput.seekMap(new com.google.android.exoplayer2.extractor.avi.AviExtractor.AviSeekMap(this.durationUs));
    }

    private long peekSeekOffset(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 16) {
            return 0L;
        }
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(8);
        long readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        long j = this.moviStart;
        long j2 = readLittleEndianInt <= j ? j + 8 : 0L;
        parsableByteArray.setPosition(position);
        return j2;
    }

    private com.google.android.exoplayer2.extractor.avi.ChunkReader getChunkReader(int i) {
        for (com.google.android.exoplayer2.extractor.avi.ChunkReader chunkReader : this.chunkReaders) {
            if (chunkReader.handlesChunkId(i)) {
                return chunkReader;
            }
        }
        return null;
    }

    private int readMoviChunks(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (extractorInput.getPosition() >= this.moviEnd) {
            return -1;
        }
        com.google.android.exoplayer2.extractor.avi.ChunkReader chunkReader = this.currentChunkReader;
        if (chunkReader != null) {
            if (chunkReader.onChunkData(extractorInput)) {
                this.currentChunkReader = null;
            }
        } else {
            alignInputToEvenPosition(extractorInput);
            extractorInput.peekFully(this.scratch.getData(), 0, 12);
            this.scratch.setPosition(0);
            int readLittleEndianInt = this.scratch.readLittleEndianInt();
            if (readLittleEndianInt == 1414744396) {
                this.scratch.setPosition(8);
                extractorInput.skipFully(this.scratch.readLittleEndianInt() != 1769369453 ? 8 : 12);
                extractorInput.resetPeekPosition();
                return 0;
            }
            int readLittleEndianInt2 = this.scratch.readLittleEndianInt();
            if (readLittleEndianInt == 1263424842) {
                this.pendingReposition = extractorInput.getPosition() + readLittleEndianInt2 + 8;
                return 0;
            }
            extractorInput.skipFully(8);
            extractorInput.resetPeekPosition();
            com.google.android.exoplayer2.extractor.avi.ChunkReader chunkReader2 = getChunkReader(readLittleEndianInt);
            if (chunkReader2 == null) {
                this.pendingReposition = extractorInput.getPosition() + readLittleEndianInt2;
                return 0;
            }
            chunkReader2.onChunkStart(readLittleEndianInt2);
            this.currentChunkReader = chunkReader2;
        }
        return 0;
    }

    private com.google.android.exoplayer2.extractor.avi.ChunkReader processStreamList(com.google.android.exoplayer2.extractor.avi.ListChunk listChunk, int i) {
        com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk aviStreamHeaderChunk = (com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk) listChunk.getChild(com.google.android.exoplayer2.extractor.avi.AviStreamHeaderChunk.class);
        com.google.android.exoplayer2.extractor.avi.StreamFormatChunk streamFormatChunk = (com.google.android.exoplayer2.extractor.avi.StreamFormatChunk) listChunk.getChild(com.google.android.exoplayer2.extractor.avi.StreamFormatChunk.class);
        if (aviStreamHeaderChunk == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Missing Stream Header");
            return null;
        }
        if (streamFormatChunk == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Missing Stream Format");
            return null;
        }
        long durationUs = aviStreamHeaderChunk.getDurationUs();
        com.google.android.exoplayer2.Format format = streamFormatChunk.format;
        com.google.android.exoplayer2.Format.Builder buildUpon = format.buildUpon();
        buildUpon.setId(i);
        int i2 = aviStreamHeaderChunk.suggestedBufferSize;
        if (i2 != 0) {
            buildUpon.setMaxInputSize(i2);
        }
        com.google.android.exoplayer2.extractor.avi.StreamNameChunk streamNameChunk = (com.google.android.exoplayer2.extractor.avi.StreamNameChunk) listChunk.getChild(com.google.android.exoplayer2.extractor.avi.StreamNameChunk.class);
        if (streamNameChunk != null) {
            buildUpon.setLabel(streamNameChunk.name);
        }
        int trackType = com.google.android.exoplayer2.util.MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != 1 && trackType != 2) {
            return null;
        }
        com.google.android.exoplayer2.extractor.TrackOutput track = this.extractorOutput.track(i, trackType);
        track.format(buildUpon.build());
        com.google.android.exoplayer2.extractor.avi.ChunkReader chunkReader = new com.google.android.exoplayer2.extractor.avi.ChunkReader(i, trackType, durationUs, aviStreamHeaderChunk.length, track);
        this.durationUs = durationUs;
        return chunkReader;
    }

    private static void alignInputToEvenPosition(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if ((extractorInput.getPosition() & 1) == 1) {
            extractorInput.skipFully(1);
        }
    }

    private class AviSeekMap implements com.google.android.exoplayer2.extractor.SeekMap {
        private final long durationUs;

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public AviSeekMap(long j) {
            this.durationUs = j;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
            com.google.android.exoplayer2.extractor.SeekMap.SeekPoints seekPoints = com.google.android.exoplayer2.extractor.avi.AviExtractor.this.chunkReaders[0].getSeekPoints(j);
            for (int i = 1; i < com.google.android.exoplayer2.extractor.avi.AviExtractor.this.chunkReaders.length; i++) {
                com.google.android.exoplayer2.extractor.SeekMap.SeekPoints seekPoints2 = com.google.android.exoplayer2.extractor.avi.AviExtractor.this.chunkReaders[i].getSeekPoints(j);
                if (seekPoints2.first.position < seekPoints.first.position) {
                    seekPoints = seekPoints2;
                }
            }
            return seekPoints;
        }
    }

    private static class ChunkHeaderHolder {
        public int chunkType;
        public int listType;
        public int size;

        private ChunkHeaderHolder() {
        }

        public void populateWithListHeaderFrom(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) throws com.google.android.exoplayer2.ParserException {
            populateFrom(parsableByteArray);
            if (this.chunkType != 1414744396) {
                throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("LIST expected, found: " + this.chunkType, null);
            }
            this.listType = parsableByteArray.readLittleEndianInt();
        }

        public void populateFrom(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
            this.chunkType = parsableByteArray.readLittleEndianInt();
            this.size = parsableByteArray.readLittleEndianInt();
            this.listType = 0;
        }
    }
}
