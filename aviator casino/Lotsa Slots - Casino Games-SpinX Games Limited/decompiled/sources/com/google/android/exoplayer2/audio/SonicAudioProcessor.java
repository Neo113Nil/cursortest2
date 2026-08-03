package com.google.android.exoplayer2.audio;

/* loaded from: classes3.dex */
public final class SonicAudioProcessor implements com.google.android.exoplayer2.audio.AudioProcessor {
    private static final float CLOSE_THRESHOLD = 1.0E-4f;
    private static final int MIN_BYTES_FOR_DURATION_SCALING_CALCULATION = 1024;
    public static final int SAMPLE_RATE_NO_CHANGE = -1;
    private java.nio.ByteBuffer buffer;
    private long inputBytes;
    private boolean inputEnded;
    private java.nio.ByteBuffer outputBuffer;
    private long outputBytes;
    private int pendingOutputSampleRate;
    private boolean pendingSonicRecreation;
    private java.nio.ShortBuffer shortBuffer;
    private com.google.android.exoplayer2.audio.Sonic sonic;
    private float speed = 1.0f;
    private float pitch = 1.0f;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat pendingInputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat pendingOutputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat inputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
    private com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat outputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;

    public SonicAudioProcessor() {
        java.nio.ByteBuffer byteBuffer = EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = EMPTY_BUFFER;
        this.pendingOutputSampleRate = -1;
    }

    public void setSpeed(float f) {
        if (this.speed != f) {
            this.speed = f;
            this.pendingSonicRecreation = true;
        }
    }

    public void setPitch(float f) {
        if (this.pitch != f) {
            this.pitch = f;
            this.pendingSonicRecreation = true;
        }
    }

    public void setOutputSampleRateHz(int i) {
        this.pendingOutputSampleRate = i;
    }

    public long getMediaDuration(long j) {
        if (this.outputBytes >= 1024) {
            long pendingInputBytes = this.inputBytes - ((com.google.android.exoplayer2.audio.Sonic) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.sonic)).getPendingInputBytes();
            if (this.outputAudioFormat.sampleRate == this.inputAudioFormat.sampleRate) {
                return com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j, pendingInputBytes, this.outputBytes);
            }
            return com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(j, pendingInputBytes * this.outputAudioFormat.sampleRate, this.outputBytes * this.inputAudioFormat.sampleRate);
        }
        return (long) (this.speed * j);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat configure(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat audioFormat) throws com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2) {
            throw new com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i = this.pendingOutputSampleRate;
        if (i == -1) {
            i = audioFormat.sampleRate;
        }
        this.pendingInputAudioFormat = audioFormat;
        com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat audioFormat2 = new com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat(i, audioFormat.channelCount, 2);
        this.pendingOutputAudioFormat = audioFormat2;
        this.pendingSonicRecreation = true;
        return audioFormat2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.pendingOutputAudioFormat.sampleRate != -1 && (java.lang.Math.abs(this.speed - 1.0f) >= CLOSE_THRESHOLD || java.lang.Math.abs(this.pitch - 1.0f) >= CLOSE_THRESHOLD || this.pendingOutputAudioFormat.sampleRate != this.pendingInputAudioFormat.sampleRate);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            com.google.android.exoplayer2.audio.Sonic sonic = (com.google.android.exoplayer2.audio.Sonic) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.sonic);
            java.nio.ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.inputBytes += remaining;
            sonic.queueInput(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueEndOfStream() {
        com.google.android.exoplayer2.audio.Sonic sonic = this.sonic;
        if (sonic != null) {
            sonic.queueEndOfStream();
        }
        this.inputEnded = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public java.nio.ByteBuffer getOutput() {
        int outputSize;
        com.google.android.exoplayer2.audio.Sonic sonic = this.sonic;
        if (sonic != null && (outputSize = sonic.getOutputSize()) > 0) {
            if (this.buffer.capacity() < outputSize) {
                java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(outputSize).order(java.nio.ByteOrder.nativeOrder());
                this.buffer = order;
                this.shortBuffer = order.asShortBuffer();
            } else {
                this.buffer.clear();
                this.shortBuffer.clear();
            }
            sonic.getOutput(this.shortBuffer);
            this.outputBytes += outputSize;
            this.buffer.limit(outputSize);
            this.outputBuffer = this.buffer;
        }
        java.nio.ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        com.google.android.exoplayer2.audio.Sonic sonic;
        return this.inputEnded && ((sonic = this.sonic) == null || sonic.getOutputSize() == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat audioFormat = this.pendingInputAudioFormat;
            this.inputAudioFormat = audioFormat;
            this.outputAudioFormat = this.pendingOutputAudioFormat;
            if (this.pendingSonicRecreation) {
                this.sonic = new com.google.android.exoplayer2.audio.Sonic(audioFormat.sampleRate, this.inputAudioFormat.channelCount, this.speed, this.pitch, this.outputAudioFormat.sampleRate);
            } else {
                com.google.android.exoplayer2.audio.Sonic sonic = this.sonic;
                if (sonic != null) {
                    sonic.flush();
                }
            }
        }
        this.outputBuffer = EMPTY_BUFFER;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        this.pendingInputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.pendingOutputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.inputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat.NOT_SET;
        java.nio.ByteBuffer byteBuffer = EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = EMPTY_BUFFER;
        this.pendingOutputSampleRate = -1;
        this.pendingSonicRecreation = false;
        this.sonic = null;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }
}
