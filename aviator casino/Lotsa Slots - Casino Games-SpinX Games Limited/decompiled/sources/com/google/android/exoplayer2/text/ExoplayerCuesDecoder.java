package com.google.android.exoplayer2.text;

/* loaded from: classes3.dex */
public final class ExoplayerCuesDecoder implements com.google.android.exoplayer2.text.SubtitleDecoder {
    private static final int INPUT_BUFFER_AVAILABLE = 0;
    private static final int INPUT_BUFFER_DEQUEUED = 1;
    private static final int INPUT_BUFFER_QUEUED = 2;
    private static final int OUTPUT_BUFFERS_COUNT = 2;
    private int inputBufferState;
    private boolean released;
    private final com.google.android.exoplayer2.text.CueDecoder cueDecoder = new com.google.android.exoplayer2.text.CueDecoder();
    private final com.google.android.exoplayer2.text.SubtitleInputBuffer inputBuffer = new com.google.android.exoplayer2.text.SubtitleInputBuffer();
    private final java.util.Deque<com.google.android.exoplayer2.text.SubtitleOutputBuffer> availableOutputBuffers = new java.util.ArrayDeque();

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j) {
    }

    public ExoplayerCuesDecoder() {
        for (int i = 0; i < 2; i++) {
            this.availableOutputBuffers.addFirst(new com.google.android.exoplayer2.text.SubtitleOutputBuffer() { // from class: com.google.android.exoplayer2.text.ExoplayerCuesDecoder.1
                @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
                public void release() {
                    com.google.android.exoplayer2.text.ExoplayerCuesDecoder.this.releaseOutputBuffer(this);
                }
            });
        }
        this.inputBufferState = 0;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public java.lang.String getName() {
        return "ExoplayerCuesDecoder";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public com.google.android.exoplayer2.text.SubtitleInputBuffer dequeueInputBuffer() throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        if (this.inputBufferState != 0) {
            return null;
        }
        this.inputBufferState = 1;
        return this.inputBuffer;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void queueInputBuffer(com.google.android.exoplayer2.text.SubtitleInputBuffer subtitleInputBuffer) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        com.google.android.exoplayer2.util.Assertions.checkState(this.inputBufferState == 1);
        com.google.android.exoplayer2.util.Assertions.checkArgument(this.inputBuffer == subtitleInputBuffer);
        this.inputBufferState = 2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public com.google.android.exoplayer2.text.SubtitleOutputBuffer dequeueOutputBuffer() throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        if (this.inputBufferState != 2 || this.availableOutputBuffers.isEmpty()) {
            return null;
        }
        com.google.android.exoplayer2.text.SubtitleOutputBuffer removeFirst = this.availableOutputBuffers.removeFirst();
        if (this.inputBuffer.isEndOfStream()) {
            removeFirst.addFlag(4);
        } else {
            removeFirst.setContent(this.inputBuffer.timeUs, new com.google.android.exoplayer2.text.ExoplayerCuesDecoder.SingleEventSubtitle(this.inputBuffer.timeUs, this.cueDecoder.decode(((java.nio.ByteBuffer) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.inputBuffer.data)).array())), 0L);
        }
        this.inputBuffer.clear();
        this.inputBufferState = 0;
        return removeFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.released);
        this.inputBuffer.clear();
        this.inputBufferState = 0;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
        this.released = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseOutputBuffer(com.google.android.exoplayer2.text.SubtitleOutputBuffer subtitleOutputBuffer) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.availableOutputBuffers.size() < 2);
        com.google.android.exoplayer2.util.Assertions.checkArgument(!this.availableOutputBuffers.contains(subtitleOutputBuffer));
        subtitleOutputBuffer.clear();
        this.availableOutputBuffers.addFirst(subtitleOutputBuffer);
    }

    private static final class SingleEventSubtitle implements com.google.android.exoplayer2.text.Subtitle {
        private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> cues;
        private final long timeUs;

        @Override // com.google.android.exoplayer2.text.Subtitle
        public int getEventTimeCount() {
            return 1;
        }

        public SingleEventSubtitle(long j, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> immutableList) {
            this.timeUs = j;
            this.cues = immutableList;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public int getNextEventTimeIndex(long j) {
            return this.timeUs > j ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public long getEventTime(int i) {
            com.google.android.exoplayer2.util.Assertions.checkArgument(i == 0);
            return this.timeUs;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long j) {
            return j >= this.timeUs ? this.cues : com.google.common.collect.ImmutableList.of();
        }
    }
}
