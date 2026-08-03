package com.google.android.exoplayer2.audio;

/* loaded from: classes3.dex */
public abstract class BaseAudioProcessor implements com.google.android.exoplayer2.audio.AudioProcessor {
    private boolean inputEnded;
    private java.nio.ByteBuffer buffer = EMPTY_BUFFER;
    private java.nio.ByteBuffer outputBuffer = EMPTY_BUFFER;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat pendingInputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat pendingOutputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
    protected com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat inputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
    protected com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat outputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;

    protected void onFlush() {
    }

    protected void onQueueEndOfStream() {
    }

    protected void onReset() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat configure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat audioFormat) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException {
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = onConfigure(audioFormat);
        return isActive() ? this.pendingOutputAudioFormat : com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.pendingOutputAudioFormat != com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.inputEnded = true;
        onQueueEndOfStream();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public java.nio.ByteBuffer getOutput() {
        java.nio.ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        return this.inputEnded && this.outputBuffer == EMPTY_BUFFER;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.outputBuffer = EMPTY_BUFFER;
        this.inputEnded = false;
        this.inputAudioFormat = this.pendingInputAudioFormat;
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        onFlush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.buffer = EMPTY_BUFFER;
        this.pendingInputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.pendingOutputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.inputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
        onReset();
    }

    protected final java.nio.ByteBuffer replaceOutputBuffer(int i) {
        if (this.buffer.capacity() < i) {
            this.buffer = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        java.nio.ByteBuffer byteBuffer = this.buffer;
        this.outputBuffer = byteBuffer;
        return byteBuffer;
    }

    protected final boolean hasPendingOutput() {
        return this.outputBuffer.hasRemaining();
    }

    protected com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat onConfigure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat audioFormat) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException {
        return com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
    }
}
