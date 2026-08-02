package androidx.media3.common.audio;

/* loaded from: classes7.dex */
class SynchronizedSonicAudioProcessor implements androidx.media3.common.audio.AudioProcessor {
    final androidx.media3.common.audio.SonicAudioProcessor getHighSpeedVideoFpsRanges = new androidx.media3.common.audio.SonicAudioProcessor(true);
    final java.lang.Object getHighSpeedVideoSizes;

    public SynchronizedSonicAudioProcessor(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
    }

    private long getHighSpeedVideoFpsRanges(long j) {
        long playoutDuration;
        synchronized (this.getHighSpeedVideoSizes) {
            playoutDuration = this.getHighSpeedVideoFpsRanges.getPlayoutDuration(j);
        }
        return playoutDuration;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j) {
        return getHighSpeedVideoFpsRanges(j);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        androidx.media3.common.audio.AudioProcessor.AudioFormat configure;
        synchronized (this.getHighSpeedVideoSizes) {
            configure = this.getHighSpeedVideoFpsRanges.configure(audioFormat);
        }
        return configure;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        boolean isActive;
        synchronized (this.getHighSpeedVideoSizes) {
            isActive = this.getHighSpeedVideoFpsRanges.isActive();
        }
        return isActive;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(java.nio.ByteBuffer byteBuffer) {
        synchronized (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRanges.queueInput(byteBuffer);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        synchronized (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRanges.queueEndOfStream();
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final java.nio.ByteBuffer getOutput() {
        java.nio.ByteBuffer output;
        synchronized (this.getHighSpeedVideoSizes) {
            output = this.getHighSpeedVideoFpsRanges.getOutput();
        }
        return output;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        boolean isEnded;
        synchronized (this.getHighSpeedVideoSizes) {
            isEnded = this.getHighSpeedVideoFpsRanges.isEnded();
        }
        return isEnded;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        synchronized (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRanges.flush(streamMetadata);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        synchronized (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRanges.reset();
        }
    }
}
