package androidx.camera.video.internal.audio;

/* loaded from: classes6.dex */
public class SilentAudioStream implements androidx.camera.video.internal.audio.AudioStream {
    private final int Camera2StreamConfigurationMap;
    private long getHighSpeedVideoFpsRanges;
    private java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;
    private androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private final int getOutputFormats;
    private final java.util.concurrent.atomic.AtomicBoolean getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);

    public SilentAudioStream(androidx.camera.video.internal.audio.AudioSettings audioSettings) {
        this.Camera2StreamConfigurationMap = audioSettings.getBytesPerFrame();
        this.getOutputFormats = audioSettings.getCaptureSampleRate();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback audioStreamCallback, java.util.concurrent.Executor executor) {
        boolean z = true;
        androidx.core.util.Preconditions.checkState(!this.getInputSizeshNQ4ISI.get(), "AudioStream can not be started when setCallback.");
        androidx.core.util.Preconditions.checkState(!this.getHighResolutionOutputSizeshNQ4ISI.get(), "AudioStream has been released.");
        if (audioStreamCallback != null && executor == null) {
            z = false;
        }
        androidx.core.util.Preconditions.checkArgument(z, "executor can't be null with non-null callback.");
        this.getHighSpeedVideoSizes = audioStreamCallback;
        this.getHighSpeedVideoFpsRangesFor = executor;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(true);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public androidx.camera.video.internal.audio.AudioStream.PacketInfo read(java.nio.ByteBuffer byteBuffer) {
        androidx.core.util.Preconditions.checkState(!this.getHighResolutionOutputSizeshNQ4ISI.get(), "AudioStream has been released.");
        androidx.core.util.Preconditions.checkState(this.getInputSizeshNQ4ISI.get(), "AudioStream has not been started.");
        long sizeToFrameCount = androidx.camera.video.internal.audio.AudioUtils.sizeToFrameCount(byteBuffer.remaining(), this.Camera2StreamConfigurationMap);
        int frameCountToSize = (int) androidx.camera.video.internal.audio.AudioUtils.frameCountToSize(sizeToFrameCount, this.Camera2StreamConfigurationMap);
        if (frameCountToSize <= 0) {
            return androidx.camera.video.internal.audio.AudioStream.PacketInfo.of(0, this.getHighSpeedVideoFpsRanges);
        }
        long frameCountToDurationNs = this.getHighSpeedVideoFpsRanges + androidx.camera.video.internal.audio.AudioUtils.frameCountToDurationNs(sizeToFrameCount, this.getOutputFormats);
        long nanoTime = frameCountToDurationNs - java.lang.System.nanoTime();
        if (nanoTime > 0) {
            try {
                java.lang.Thread.sleep(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanoTime));
            } catch (java.lang.InterruptedException e) {
                androidx.camera.core.Logger.w("SilentAudioStream", "Ignore interruption", e);
            }
        }
        androidx.core.util.Preconditions.checkState(frameCountToSize <= byteBuffer.remaining());
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        if (bArr == null || bArr.length < frameCountToSize) {
            this.getHighSpeedVideoSizesFor = new byte[frameCountToSize];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.getHighSpeedVideoSizesFor, 0, frameCountToSize).limit(frameCountToSize + position).position(position);
        androidx.camera.video.internal.audio.AudioStream.PacketInfo of = androidx.camera.video.internal.audio.AudioStream.PacketInfo.of(frameCountToSize, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges = frameCountToDurationNs;
        return of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() {
        androidx.core.util.Preconditions.checkState(!this.getHighResolutionOutputSizeshNQ4ISI.get(), "AudioStream has been released.");
        if (this.getInputSizeshNQ4ISI.getAndSet(true)) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = java.lang.System.nanoTime();
        final androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback audioStreamCallback = this.getHighSpeedVideoSizes;
        java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRangesFor;
        if (audioStreamCallback == null || executor == null) {
            return;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.SilentAudioStream$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback.this.onSilenceStateChanged(true);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        androidx.core.util.Preconditions.checkState(!this.getHighResolutionOutputSizeshNQ4ISI.get(), "AudioStream has been released.");
        this.getInputSizeshNQ4ISI.set(false);
    }
}
