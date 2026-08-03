package com.google.android.exoplayer2.extractor.jpeg;

/* loaded from: classes3.dex */
public final class JpegExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final long EXIF_HEADER = 1165519206;
    private static final int EXIF_ID_CODE_LENGTH = 6;
    private static final java.lang.String HEADER_XMP_APP1 = "http://ns.adobe.com/xap/1.0/";
    private static final int IMAGE_TRACK_ID = 1024;
    private static final int MARKER_APP0 = 65504;
    private static final int MARKER_APP1 = 65505;
    private static final int MARKER_SOI = 65496;
    private static final int MARKER_SOS = 65498;
    private static final int STATE_ENDED = 6;
    private static final int STATE_READING_MARKER = 0;
    private static final int STATE_READING_MOTION_PHOTO_VIDEO = 5;
    private static final int STATE_READING_SEGMENT = 2;
    private static final int STATE_READING_SEGMENT_LENGTH = 1;
    private static final int STATE_SNIFFING_MOTION_PHOTO_VIDEO = 4;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private com.google.android.exoplayer2.extractor.ExtractorInput lastExtractorInput;
    private int marker;
    private com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata motionPhotoMetadata;
    private com.google.android.exoplayer2.extractor.mp4.Mp4Extractor mp4Extractor;
    private com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorInput mp4ExtractorStartOffsetExtractorInput;
    private int segmentLength;
    private int state;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch = new com.google.android.exoplayer2.util.ParsableByteArray(6);
    private long mp4StartPosition = -1;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (peekMarker(extractorInput) != MARKER_SOI) {
            return false;
        }
        int peekMarker = peekMarker(extractorInput);
        this.marker = peekMarker;
        if (peekMarker == MARKER_APP0) {
            advancePeekPositionToNextSegment(extractorInput);
            this.marker = peekMarker(extractorInput);
        }
        if (this.marker != MARKER_APP1) {
            return false;
        }
        extractorInput.advancePeekPosition(2);
        this.scratch.reset(6);
        extractorInput.peekFully(this.scratch.getData(), 0, 6);
        return this.scratch.readUnsignedInt() == EXIF_HEADER && this.scratch.readUnsignedShort() == 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException {
        int i = this.state;
        if (i == 0) {
            readMarker(extractorInput);
            return 0;
        }
        if (i == 1) {
            readSegmentLength(extractorInput);
            return 0;
        }
        if (i == 2) {
            readSegment(extractorInput);
            return 0;
        }
        if (i == 4) {
            long position = extractorInput.getPosition();
            long j = this.mp4StartPosition;
            if (position != j) {
                positionHolder.position = j;
                return 1;
            }
            sniffMotionPhotoVideo(extractorInput);
            return 0;
        }
        if (i != 5) {
            if (i == 6) {
                return -1;
            }
            throw new java.lang.IllegalStateException();
        }
        if (this.mp4ExtractorStartOffsetExtractorInput == null || extractorInput != this.lastExtractorInput) {
            this.lastExtractorInput = extractorInput;
            this.mp4ExtractorStartOffsetExtractorInput = new com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorInput(extractorInput, this.mp4StartPosition);
        }
        int read = ((com.google.android.exoplayer2.extractor.mp4.Mp4Extractor) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.mp4Extractor)).read(this.mp4ExtractorStartOffsetExtractorInput, positionHolder);
        if (read == 1) {
            positionHolder.position += this.mp4StartPosition;
        }
        return read;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        if (j == 0) {
            this.state = 0;
            this.mp4Extractor = null;
        } else if (this.state == 5) {
            ((com.google.android.exoplayer2.extractor.mp4.Mp4Extractor) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.mp4Extractor)).seek(j, j2);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
        com.google.android.exoplayer2.extractor.mp4.Mp4Extractor mp4Extractor = this.mp4Extractor;
        if (mp4Extractor != null) {
            mp4Extractor.release();
        }
    }

    private int peekMarker(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.scratch.reset(2);
        extractorInput.peekFully(this.scratch.getData(), 0, 2);
        return this.scratch.readUnsignedShort();
    }

    private void advancePeekPositionToNextSegment(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.scratch.reset(2);
        extractorInput.peekFully(this.scratch.getData(), 0, 2);
        extractorInput.advancePeekPosition(this.scratch.readUnsignedShort() - 2);
    }

    private void readMarker(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.scratch.reset(2);
        extractorInput.readFully(this.scratch.getData(), 0, 2);
        int readUnsignedShort = this.scratch.readUnsignedShort();
        this.marker = readUnsignedShort;
        if (readUnsignedShort == MARKER_SOS) {
            if (this.mp4StartPosition != -1) {
                this.state = 4;
                return;
            } else {
                endReadingWithImageTrack();
                return;
            }
        }
        if ((readUnsignedShort < 65488 || readUnsignedShort > 65497) && readUnsignedShort != 65281) {
            this.state = 1;
        }
    }

    private void readSegmentLength(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        this.scratch.reset(2);
        extractorInput.readFully(this.scratch.getData(), 0, 2);
        this.segmentLength = this.scratch.readUnsignedShort() - 2;
        this.state = 2;
    }

    private void readSegment(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        java.lang.String readNullTerminatedString;
        if (this.marker == MARKER_APP1) {
            com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = new com.google.android.exoplayer2.util.ParsableByteArray(this.segmentLength);
            extractorInput.readFully(parsableByteArray.getData(), 0, this.segmentLength);
            if (this.motionPhotoMetadata == null && HEADER_XMP_APP1.equals(parsableByteArray.readNullTerminatedString()) && (readNullTerminatedString = parsableByteArray.readNullTerminatedString()) != null) {
                com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata motionPhotoMetadata = getMotionPhotoMetadata(readNullTerminatedString, extractorInput.getLength());
                this.motionPhotoMetadata = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                    this.mp4StartPosition = motionPhotoMetadata.videoStartPosition;
                }
            }
        } else {
            extractorInput.skipFully(this.segmentLength);
        }
        this.state = 0;
    }

    private void sniffMotionPhotoVideo(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (!extractorInput.peekFully(this.scratch.getData(), 0, 1, true)) {
            endReadingWithImageTrack();
            return;
        }
        extractorInput.resetPeekPosition();
        if (this.mp4Extractor == null) {
            this.mp4Extractor = new com.google.android.exoplayer2.extractor.mp4.Mp4Extractor();
        }
        com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorInput startOffsetExtractorInput = new com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorInput(extractorInput, this.mp4StartPosition);
        this.mp4ExtractorStartOffsetExtractorInput = startOffsetExtractorInput;
        if (this.mp4Extractor.sniff(startOffsetExtractorInput)) {
            this.mp4Extractor.init(new com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput(this.mp4StartPosition, (com.google.android.exoplayer2.extractor.ExtractorOutput) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.extractorOutput)));
            startReadingMotionPhoto();
        } else {
            endReadingWithImageTrack();
        }
    }

    private void startReadingMotionPhoto() {
        outputImageTrack((com.google.android.exoplayer2.metadata.Metadata.Entry) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.motionPhotoMetadata));
        this.state = 5;
    }

    private void endReadingWithImageTrack() {
        outputImageTrack(new com.google.android.exoplayer2.metadata.Metadata.Entry[0]);
        ((com.google.android.exoplayer2.extractor.ExtractorOutput) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.extractorOutput)).endTracks();
        this.extractorOutput.seekMap(new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(-9223372036854775807L));
        this.state = 6;
    }

    private void outputImageTrack(com.google.android.exoplayer2.metadata.Metadata.Entry... entryArr) {
        ((com.google.android.exoplayer2.extractor.ExtractorOutput) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.extractorOutput)).track(1024, 4).format(new com.google.android.exoplayer2.Format.Builder().setContainerMimeType("image/jpeg").setMetadata(new com.google.android.exoplayer2.metadata.Metadata(entryArr)).build());
    }

    private static com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata getMotionPhotoMetadata(java.lang.String str, long j) throws java.io.IOException {
        com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription parse;
        if (j == -1 || (parse = com.google.android.exoplayer2.extractor.jpeg.XmpMotionPhotoDescriptionParser.parse(str)) == null) {
            return null;
        }
        return parse.getMotionPhotoMetadata(j);
    }
}
