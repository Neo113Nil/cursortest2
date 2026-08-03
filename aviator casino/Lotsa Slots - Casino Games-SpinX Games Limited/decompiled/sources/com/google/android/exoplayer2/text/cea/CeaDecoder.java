package com.google.android.exoplayer2.text.cea;

/* loaded from: classes3.dex */
abstract class CeaDecoder implements com.google.android.exoplayer2.text.SubtitleDecoder {
    private static final int NUM_INPUT_BUFFERS = 10;
    private static final int NUM_OUTPUT_BUFFERS = 2;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer> availableInputBuffers = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> availableOutputBuffers;
    private com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer dequeuedInputBuffer;
    private long playbackPositionUs;
    private long queuedInputBufferCount;
    private final java.util.PriorityQueue<com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer> queuedInputBuffers;

    protected abstract com.google.android.exoplayer2.text.Subtitle createSubtitle();

    protected abstract void decode(com.google.android.exoplayer2.text.SubtitleInputBuffer subtitleInputBuffer);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public abstract java.lang.String getName();

    protected abstract boolean isNewSubtitleDataAvailable();

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    public CeaDecoder() {
        for (int i = 0; i < 10; i++) {
            this.availableInputBuffers.add(new com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer());
        }
        this.availableOutputBuffers = new java.util.ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.availableOutputBuffers.add(new com.google.android.exoplayer2.text.cea.CeaDecoder.CeaOutputBuffer(new com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner() { // from class: com.google.android.exoplayer2.text.cea.CeaDecoder$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner
                public final void releaseOutputBuffer(com.google.android.exoplayer2.decoder.DecoderOutputBuffer decoderOutputBuffer) {
                    com.google.android.exoplayer2.text.cea.CeaDecoder.this.releaseOutputBuffer((com.google.android.exoplayer2.text.cea.CeaDecoder.CeaOutputBuffer) decoderOutputBuffer);
                }
            }));
        }
        this.queuedInputBuffers = new java.util.PriorityQueue<>();
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j) {
        this.playbackPositionUs = j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public com.google.android.exoplayer2.text.SubtitleInputBuffer dequeueInputBuffer() throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        com.google.android.exoplayer2.util.Assertions.checkState(this.dequeuedInputBuffer == null);
        if (this.availableInputBuffers.isEmpty()) {
            return null;
        }
        com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer pollFirst = this.availableInputBuffers.pollFirst();
        this.dequeuedInputBuffer = pollFirst;
        return pollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void queueInputBuffer(com.google.android.exoplayer2.text.SubtitleInputBuffer subtitleInputBuffer) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        com.google.android.exoplayer2.util.Assertions.checkArgument(subtitleInputBuffer == this.dequeuedInputBuffer);
        com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer ceaInputBuffer = (com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) subtitleInputBuffer;
        if (ceaInputBuffer.isDecodeOnly()) {
            releaseInputBuffer(ceaInputBuffer);
        } else {
            long j = this.queuedInputBufferCount;
            this.queuedInputBufferCount = 1 + j;
            ceaInputBuffer.queuedInputBufferCount = j;
            this.queuedInputBuffers.add(ceaInputBuffer);
        }
        this.dequeuedInputBuffer = null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public com.google.android.exoplayer2.text.SubtitleOutputBuffer dequeueOutputBuffer() throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        if (this.availableOutputBuffers.isEmpty()) {
            return null;
        }
        while (!this.queuedInputBuffers.isEmpty() && ((com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) com.google.android.exoplayer2.util.Util.castNonNull(this.queuedInputBuffers.peek())).timeUs <= this.playbackPositionUs) {
            com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer ceaInputBuffer = (com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) com.google.android.exoplayer2.util.Util.castNonNull(this.queuedInputBuffers.poll());
            if (ceaInputBuffer.isEndOfStream()) {
                com.google.android.exoplayer2.text.SubtitleOutputBuffer subtitleOutputBuffer = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) com.google.android.exoplayer2.util.Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer.addFlag(4);
                releaseInputBuffer(ceaInputBuffer);
                return subtitleOutputBuffer;
            }
            decode(ceaInputBuffer);
            if (isNewSubtitleDataAvailable()) {
                com.google.android.exoplayer2.text.Subtitle createSubtitle = createSubtitle();
                com.google.android.exoplayer2.text.SubtitleOutputBuffer subtitleOutputBuffer2 = (com.google.android.exoplayer2.text.SubtitleOutputBuffer) com.google.android.exoplayer2.util.Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer2.setContent(ceaInputBuffer.timeUs, createSubtitle, Long.MAX_VALUE);
                releaseInputBuffer(ceaInputBuffer);
                return subtitleOutputBuffer2;
            }
            releaseInputBuffer(ceaInputBuffer);
        }
        return null;
    }

    private void releaseInputBuffer(com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer ceaInputBuffer) {
        ceaInputBuffer.clear();
        this.availableInputBuffers.add(ceaInputBuffer);
    }

    protected void releaseOutputBuffer(com.google.android.exoplayer2.text.SubtitleOutputBuffer subtitleOutputBuffer) {
        subtitleOutputBuffer.clear();
        this.availableOutputBuffers.add(subtitleOutputBuffer);
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        this.queuedInputBufferCount = 0L;
        this.playbackPositionUs = 0L;
        while (!this.queuedInputBuffers.isEmpty()) {
            releaseInputBuffer((com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer) com.google.android.exoplayer2.util.Util.castNonNull(this.queuedInputBuffers.poll()));
        }
        com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer ceaInputBuffer = this.dequeuedInputBuffer;
        if (ceaInputBuffer != null) {
            releaseInputBuffer(ceaInputBuffer);
            this.dequeuedInputBuffer = null;
        }
    }

    protected final com.google.android.exoplayer2.text.SubtitleOutputBuffer getAvailableOutputBuffer() {
        return this.availableOutputBuffers.pollFirst();
    }

    protected final long getPositionUs() {
        return this.playbackPositionUs;
    }

    private static final class CeaInputBuffer extends com.google.android.exoplayer2.text.SubtitleInputBuffer implements java.lang.Comparable<com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer> {
        private long queuedInputBufferCount;

        private CeaInputBuffer() {
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer ceaInputBuffer) {
            if (isEndOfStream() != ceaInputBuffer.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j = this.timeUs - ceaInputBuffer.timeUs;
            if (j == 0) {
                j = this.queuedInputBufferCount - ceaInputBuffer.queuedInputBufferCount;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class CeaOutputBuffer extends com.google.android.exoplayer2.text.SubtitleOutputBuffer {
        private com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner<com.google.android.exoplayer2.text.cea.CeaDecoder.CeaOutputBuffer> owner;

        public CeaOutputBuffer(com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner<com.google.android.exoplayer2.text.cea.CeaDecoder.CeaOutputBuffer> owner) {
            this.owner = owner;
        }

        @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
        public final void release() {
            this.owner.releaseOutputBuffer(this);
        }
    }
}
