package com.google.android.exoplayer2.text;

/* loaded from: classes3.dex */
public class SubtitleExtractor implements com.google.android.exoplayer2.extractor.Extractor {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private static final int STATE_CREATED = 0;
    private static final int STATE_EXTRACTING = 2;
    private static final int STATE_FINISHED = 4;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 5;
    private static final int STATE_SEEKING = 3;
    private int bytesRead;
    private com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
    private final com.google.android.exoplayer2.Format format;
    private final com.google.android.exoplayer2.text.SubtitleDecoder subtitleDecoder;
    private com.google.android.exoplayer2.extractor.TrackOutput trackOutput;
    private final com.google.android.exoplayer2.text.CueEncoder cueEncoder = new com.google.android.exoplayer2.text.CueEncoder();
    private final com.google.android.exoplayer2.util.ParsableByteArray subtitleData = new com.google.android.exoplayer2.util.ParsableByteArray();
    private final java.util.List<java.lang.Long> timestamps = new java.util.ArrayList();
    private final java.util.List<com.google.android.exoplayer2.util.ParsableByteArray> samples = new java.util.ArrayList();
    private int state = 0;
    private long seekTimeUs = -9223372036854775807L;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return true;
    }

    public SubtitleExtractor(com.google.android.exoplayer2.text.SubtitleDecoder subtitleDecoder, com.google.android.exoplayer2.Format format) {
        this.subtitleDecoder = subtitleDecoder;
        this.format = format.buildUpon().setSampleMimeType(com.google.android.exoplayer2.util.MimeTypes.TEXT_EXOPLAYER_CUES).setCodecs(format.sampleMimeType).build();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.state == 0);
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 3);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new com.google.android.exoplayer2.extractor.IndexSeekMap(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.trackOutput.format(this.format);
        this.state = 1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException {
        int i = this.state;
        com.google.android.exoplayer2.util.Assertions.checkState((i == 0 || i == 5) ? false : true);
        if (this.state == 1) {
            this.subtitleData.reset(extractorInput.getLength() != -1 ? com.google.common.primitives.Ints.checkedCast(extractorInput.getLength()) : 1024);
            this.bytesRead = 0;
            this.state = 2;
        }
        if (this.state == 2 && readFromInput(extractorInput)) {
            decode();
            writeToOutput();
            this.state = 4;
        }
        if (this.state == 3 && skipInput(extractorInput)) {
            writeToOutput();
            this.state = 4;
        }
        return this.state == 4 ? -1 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        int i = this.state;
        com.google.android.exoplayer2.util.Assertions.checkState((i == 0 || i == 5) ? false : true);
        this.seekTimeUs = j2;
        if (this.state == 2) {
            this.state = 1;
        }
        if (this.state == 4) {
            this.state = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
        if (this.state == 5) {
            return;
        }
        this.subtitleDecoder.release();
        this.state = 5;
    }

    private boolean skipInput(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        return extractorInput.skip((extractorInput.getLength() > (-1L) ? 1 : (extractorInput.getLength() == (-1L) ? 0 : -1)) != 0 ? com.google.common.primitives.Ints.checkedCast(extractorInput.getLength()) : 1024) == -1;
    }

    private boolean readFromInput(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int capacity = this.subtitleData.capacity();
        int i = this.bytesRead;
        if (capacity == i) {
            this.subtitleData.ensureCapacity(i + 1024);
        }
        int read = extractorInput.read(this.subtitleData.getData(), this.bytesRead, this.subtitleData.capacity() - this.bytesRead);
        if (read != -1) {
            this.bytesRead += read;
        }
        long length = extractorInput.getLength();
        return (length != -1 && ((long) this.bytesRead) == length) || read == -1;
    }

    private void decode() throws java.io.IOException {
        try {
            com.google.android.exoplayer2.text.SubtitleInputBuffer dequeueInputBuffer = this.subtitleDecoder.dequeueInputBuffer();
            while (dequeueInputBuffer == null) {
                java.lang.Thread.sleep(5L);
                dequeueInputBuffer = this.subtitleDecoder.dequeueInputBuffer();
            }
            dequeueInputBuffer.ensureSpaceForWrite(this.bytesRead);
            dequeueInputBuffer.data.put(this.subtitleData.getData(), 0, this.bytesRead);
            dequeueInputBuffer.data.limit(this.bytesRead);
            this.subtitleDecoder.queueInputBuffer(dequeueInputBuffer);
            com.google.android.exoplayer2.text.SubtitleOutputBuffer dequeueOutputBuffer = this.subtitleDecoder.dequeueOutputBuffer();
            while (dequeueOutputBuffer == null) {
                java.lang.Thread.sleep(5L);
                dequeueOutputBuffer = this.subtitleDecoder.dequeueOutputBuffer();
            }
            for (int i = 0; i < dequeueOutputBuffer.getEventTimeCount(); i++) {
                byte[] encode = this.cueEncoder.encode(dequeueOutputBuffer.getCues(dequeueOutputBuffer.getEventTime(i)));
                this.timestamps.add(java.lang.Long.valueOf(dequeueOutputBuffer.getEventTime(i)));
                this.samples.add(new com.google.android.exoplayer2.util.ParsableByteArray(encode));
            }
            dequeueOutputBuffer.release();
        } catch (com.google.android.exoplayer2.text.SubtitleDecoderException e) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("SubtitleDecoder failed.", e);
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException();
        }
    }

    private void writeToOutput() {
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.trackOutput);
        com.google.android.exoplayer2.util.Assertions.checkState(this.timestamps.size() == this.samples.size());
        long j = this.seekTimeUs;
        for (int binarySearchFloor = j == -9223372036854775807L ? 0 : com.google.android.exoplayer2.util.Util.binarySearchFloor((java.util.List<? extends java.lang.Comparable<? super java.lang.Long>>) this.timestamps, java.lang.Long.valueOf(j), true, true); binarySearchFloor < this.samples.size(); binarySearchFloor++) {
            com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = this.samples.get(binarySearchFloor);
            parsableByteArray.setPosition(0);
            int length = parsableByteArray.getData().length;
            this.trackOutput.sampleData(parsableByteArray, length);
            this.trackOutput.sampleMetadata(this.timestamps.get(binarySearchFloor).longValue(), 1, length, 0, null);
        }
    }
}
