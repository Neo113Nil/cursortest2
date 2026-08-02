package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public abstract class BaseAudioProcessor implements androidx.media3.common.audio.AudioProcessor {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor = EMPTY_BUFFER;
    private java.nio.ByteBuffer getHighSpeedVideoFpsRanges = EMPTY_BUFFER;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat Camera2StreamConfigurationMap = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat getHighSpeedVideoSizes = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    protected androidx.media3.common.audio.AudioProcessor.AudioFormat inputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    protected androidx.media3.common.audio.AudioProcessor.AudioFormat outputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;

    @java.lang.Deprecated
    protected void onFlush() {
    }

    protected void onQueueEndOfStream() {
    }

    protected void onReset() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        this.Camera2StreamConfigurationMap = audioFormat;
        this.getHighSpeedVideoSizes = onConfigure(audioFormat);
        return isActive() ? this.getHighSpeedVideoSizes : androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.getHighSpeedVideoSizes != androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        onQueueEndOfStream();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public java.nio.ByteBuffer getOutput() {
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges == EMPTY_BUFFER;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @java.lang.Deprecated
    public final void flush() {
        flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata.DEFAULT);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        this.getHighSpeedVideoFpsRanges = EMPTY_BUFFER;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.inputAudioFormat = this.Camera2StreamConfigurationMap;
        this.outputAudioFormat = this.getHighSpeedVideoSizes;
        onFlush(streamMetadata);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.getHighSpeedVideoFpsRanges = EMPTY_BUFFER;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRangesFor = EMPTY_BUFFER;
        this.Camera2StreamConfigurationMap = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.getHighSpeedVideoSizes = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.inputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        onReset();
    }

    protected final java.nio.ByteBuffer replaceOutputBuffer(int i) {
        if (this.getHighSpeedVideoFpsRangesFor.capacity() < i) {
            this.getHighSpeedVideoFpsRangesFor = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.getHighSpeedVideoFpsRangesFor.clear();
        }
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = byteBuffer;
        return byteBuffer;
    }

    protected final boolean hasPendingOutput() {
        return this.getHighSpeedVideoFpsRanges.hasRemaining();
    }

    protected androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        return androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    protected void onFlush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        onFlush();
    }
}
