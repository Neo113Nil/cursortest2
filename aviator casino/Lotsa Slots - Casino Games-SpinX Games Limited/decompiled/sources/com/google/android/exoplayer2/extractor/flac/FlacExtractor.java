package com.google.android.exoplayer2.extractor.flac;

/* loaded from: classes3.dex */
public final class FlacExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final int BUFFER_LENGTH = 32768;
    public static final com.google.android.exoplayer2.extractor.ExtractorsFactory FACTORY = new com.google.android.exoplayer2.extractor.ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.flac.FlacExtractor$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final com.google.android.exoplayer2.extractor.Extractor[] createExtractors() {
            return com.google.android.exoplayer2.extractor.flac.FlacExtractor.lambda$static$0();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map map) {
            com.google.android.exoplayer2.extractor.Extractor[] createExtractors;
            createExtractors = createExtractors();
            return createExtractors;
        }
    };
    public static final int FLAG_DISABLE_ID3_METADATA = 1;
    private static final int SAMPLE_NUMBER_UNKNOWN = -1;
    private static final int STATE_GET_FRAME_START_MARKER = 4;
    private static final int STATE_GET_STREAM_MARKER_AND_INFO_BLOCK_BYTES = 1;
    private static final int STATE_READ_FRAMES = 5;
    private static final int STATE_READ_ID3_METADATA = 0;
    private static final int STATE_READ_METADATA_BLOCKS = 3;
    private static final int STATE_READ_STREAM_MARKER = 2;
    private com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker binarySearchSeeker;
    private final com.google.android.exoplayer2.util.ParsableByteArray buffer;
    private int currentFrameBytesWritten;
    private long currentFrameFirstSampleNumber;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private com.google.android.exoplayer2.extractor.FlacStreamMetadata flacStreamMetadata;
    private int frameStartMarker;
    private com.google.android.exoplayer2.metadata.Metadata id3Metadata;
    private final boolean id3MetadataDisabled;
    private int minFrameSize;
    private final com.google.android.exoplayer2.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder;
    private int state;
    private final byte[] streamMarkerAndInfoBlock;
    private com.google.android.exoplayer2.extractor.TrackOutput trackOutput;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    static /* synthetic */ com.google.android.exoplayer2.extractor.Extractor[] lambda$static$0() {
        return new com.google.android.exoplayer2.extractor.Extractor[]{new com.google.android.exoplayer2.extractor.flac.FlacExtractor()};
    }

    public FlacExtractor() {
        this(0);
    }

    public FlacExtractor(int i) {
        this.streamMarkerAndInfoBlock = new byte[42];
        this.buffer = new com.google.android.exoplayer2.util.ParsableByteArray(new byte[32768], 0);
        this.id3MetadataDisabled = (i & 1) != 0;
        this.sampleNumberHolder = new com.google.android.exoplayer2.extractor.FlacFrameReader.SampleNumberHolder();
        this.state = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        com.google.android.exoplayer2.extractor.FlacMetadataReader.peekId3Metadata(extractorInput, false);
        return com.google.android.exoplayer2.extractor.FlacMetadataReader.checkAndPeekStreamMarker(extractorInput);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException {
        int i = this.state;
        if (i == 0) {
            readId3Metadata(extractorInput);
            return 0;
        }
        if (i == 1) {
            getStreamMarkerAndInfoBlockBytes(extractorInput);
            return 0;
        }
        if (i == 2) {
            readStreamMarker(extractorInput);
            return 0;
        }
        if (i == 3) {
            readMetadataBlocks(extractorInput);
            return 0;
        }
        if (i == 4) {
            getFrameStartMarker(extractorInput);
            return 0;
        }
        if (i == 5) {
            return readFrames(extractorInput, positionHolder);
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        if (j == 0) {
            this.state = 0;
        } else {
            com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker flacBinarySearchSeeker = this.binarySearchSeeker;
            if (flacBinarySearchSeeker != null) {
                flacBinarySearchSeeker.setSeekTargetUs(j2);
            }
        }
        this.currentFrameFirstSampleNumber = j2 != 0 ? -1L : 0L;
        this.currentFrameBytesWritten = 0;
        this.buffer.reset(0);
    }

    private void readId3Metadata(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.id3Metadata = com.google.android.exoplayer2.extractor.FlacMetadataReader.readId3Metadata(extractorInput, !this.id3MetadataDisabled);
        this.state = 1;
    }

    private void getStreamMarkerAndInfoBlockBytes(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        byte[] bArr = this.streamMarkerAndInfoBlock;
        extractorInput.peekFully(bArr, 0, bArr.length);
        extractorInput.resetPeekPosition();
        this.state = 2;
    }

    private void readStreamMarker(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        com.google.android.exoplayer2.extractor.FlacMetadataReader.readStreamMarker(extractorInput);
        this.state = 3;
    }

    private void readMetadataBlocks(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        com.google.android.exoplayer2.extractor.FlacMetadataReader.FlacStreamMetadataHolder flacStreamMetadataHolder = new com.google.android.exoplayer2.extractor.FlacMetadataReader.FlacStreamMetadataHolder(this.flacStreamMetadata);
        boolean z = false;
        while (!z) {
            z = com.google.android.exoplayer2.extractor.FlacMetadataReader.readMetadataBlock(extractorInput, flacStreamMetadataHolder);
            this.flacStreamMetadata = (com.google.android.exoplayer2.extractor.FlacStreamMetadata) com.google.android.exoplayer2.util.Util.castNonNull(flacStreamMetadataHolder.flacStreamMetadata);
        }
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.flacStreamMetadata);
        this.minFrameSize = java.lang.Math.max(this.flacStreamMetadata.minFrameSize, 6);
        ((com.google.android.exoplayer2.extractor.TrackOutput) com.google.android.exoplayer2.util.Util.castNonNull(this.trackOutput)).format(this.flacStreamMetadata.getFormat(this.streamMarkerAndInfoBlock, this.id3Metadata));
        this.state = 4;
    }

    private void getFrameStartMarker(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.frameStartMarker = com.google.android.exoplayer2.extractor.FlacMetadataReader.getFrameStartMarker(extractorInput);
        ((com.google.android.exoplayer2.extractor.ExtractorOutput) com.google.android.exoplayer2.util.Util.castNonNull(this.extractorOutput)).seekMap(getSeekMap(extractorInput.getPosition(), extractorInput.getLength()));
        this.state = 5;
    }

    private int readFrames(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException {
        boolean z;
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.trackOutput);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.flacStreamMetadata);
        com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker flacBinarySearchSeeker = this.binarySearchSeeker;
        if (flacBinarySearchSeeker != null && flacBinarySearchSeeker.isSeeking()) {
            return this.binarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
        }
        if (this.currentFrameFirstSampleNumber == -1) {
            this.currentFrameFirstSampleNumber = com.google.android.exoplayer2.extractor.FlacFrameReader.getFirstSampleNumber(extractorInput, this.flacStreamMetadata);
            return 0;
        }
        int limit = this.buffer.limit();
        if (limit < 32768) {
            int read = extractorInput.read(this.buffer.getData(), limit, 32768 - limit);
            z = read == -1;
            if (!z) {
                this.buffer.setLimit(limit + read);
            } else if (this.buffer.bytesLeft() == 0) {
                outputSampleMetadata();
                return -1;
            }
        } else {
            z = false;
        }
        int position = this.buffer.getPosition();
        int i = this.currentFrameBytesWritten;
        int i2 = this.minFrameSize;
        if (i < i2) {
            com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = this.buffer;
            parsableByteArray.skipBytes(java.lang.Math.min(i2 - i, parsableByteArray.bytesLeft()));
        }
        long findFrame = findFrame(this.buffer, z);
        int position2 = this.buffer.getPosition() - position;
        this.buffer.setPosition(position);
        this.trackOutput.sampleData(this.buffer, position2);
        this.currentFrameBytesWritten += position2;
        if (findFrame != -1) {
            outputSampleMetadata();
            this.currentFrameBytesWritten = 0;
            this.currentFrameFirstSampleNumber = findFrame;
        }
        if (this.buffer.bytesLeft() < 16) {
            int bytesLeft = this.buffer.bytesLeft();
            java.lang.System.arraycopy(this.buffer.getData(), this.buffer.getPosition(), this.buffer.getData(), 0, bytesLeft);
            this.buffer.setPosition(0);
            this.buffer.setLimit(bytesLeft);
        }
        return 0;
    }

    private com.google.android.exoplayer2.extractor.SeekMap getSeekMap(long j, long j2) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.flacStreamMetadata);
        if (this.flacStreamMetadata.seekTable != null) {
            return new com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap(this.flacStreamMetadata, j);
        }
        if (j2 != -1 && this.flacStreamMetadata.totalSamples > 0) {
            com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker flacBinarySearchSeeker = new com.google.android.exoplayer2.extractor.flac.FlacBinarySearchSeeker(this.flacStreamMetadata, this.frameStartMarker, j, j2);
            this.binarySearchSeeker = flacBinarySearchSeeker;
            return flacBinarySearchSeeker.getSeekMap();
        }
        return new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(this.flacStreamMetadata.getDurationUs());
    }

    private long findFrame(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, boolean z) {
        boolean z2;
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.flacStreamMetadata);
        int position = parsableByteArray.getPosition();
        while (position <= parsableByteArray.limit() - 16) {
            parsableByteArray.setPosition(position);
            if (com.google.android.exoplayer2.extractor.FlacFrameReader.checkAndReadFrameHeader(parsableByteArray, this.flacStreamMetadata, this.frameStartMarker, this.sampleNumberHolder)) {
                parsableByteArray.setPosition(position);
                return this.sampleNumberHolder.sampleNumber;
            }
            position++;
        }
        if (z) {
            while (position <= parsableByteArray.limit() - this.minFrameSize) {
                parsableByteArray.setPosition(position);
                try {
                    z2 = com.google.android.exoplayer2.extractor.FlacFrameReader.checkAndReadFrameHeader(parsableByteArray, this.flacStreamMetadata, this.frameStartMarker, this.sampleNumberHolder);
                } catch (java.lang.IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (parsableByteArray.getPosition() <= parsableByteArray.limit() && z2) {
                    parsableByteArray.setPosition(position);
                    return this.sampleNumberHolder.sampleNumber;
                }
                position++;
            }
            parsableByteArray.setPosition(parsableByteArray.limit());
            return -1L;
        }
        parsableByteArray.setPosition(position);
        return -1L;
    }

    private void outputSampleMetadata() {
        ((com.google.android.exoplayer2.extractor.TrackOutput) com.google.android.exoplayer2.util.Util.castNonNull(this.trackOutput)).sampleMetadata((this.currentFrameFirstSampleNumber * 1000000) / ((com.google.android.exoplayer2.extractor.FlacStreamMetadata) com.google.android.exoplayer2.util.Util.castNonNull(this.flacStreamMetadata)).sampleRate, 1, this.currentFrameBytesWritten, 0, null);
    }
}
