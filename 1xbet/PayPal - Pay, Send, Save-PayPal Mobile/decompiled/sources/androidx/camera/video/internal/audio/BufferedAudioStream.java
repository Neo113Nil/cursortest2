package androidx.camera.video.internal.audio;

/* loaded from: classes6.dex */
public class BufferedAudioStream implements androidx.camera.video.internal.audio.AudioStream {
    final int Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final androidx.camera.video.internal.audio.AudioStream getHighSpeedVideoSizes;
    private final int getOutputSizes;
    private final int getOutputStallDuration;
    private final java.util.concurrent.atomic.AtomicBoolean getOutputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.util.concurrent.BlockingQueue<androidx.camera.video.internal.audio.BufferedAudioStream.AudioData> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.LinkedBlockingQueue();
    private final java.util.concurrent.Executor getHighSpeedVideoSizesFor = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(androidx.camera.core.impl.utils.executor.CameraXExecutors.audioExecutor());
    final java.lang.Object getInputFormats = new java.lang.Object();
    androidx.camera.video.internal.audio.BufferedAudioStream.AudioData getHighResolutionOutputSizeshNQ4ISI = null;
    final java.util.concurrent.atomic.AtomicBoolean getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);

    public BufferedAudioStream(androidx.camera.video.internal.audio.AudioStream audioStream, androidx.camera.video.internal.audio.AudioSettings audioSettings) {
        this.getHighSpeedVideoSizes = audioStream;
        int bytesPerFrame = audioSettings.getBytesPerFrame();
        this.Camera2StreamConfigurationMap = bytesPerFrame;
        int captureSampleRate = audioSettings.getCaptureSampleRate();
        this.getOutputStallDuration = captureSampleRate;
        androidx.core.util.Preconditions.checkArgument(((long) bytesPerFrame) > 0, "mBytesPerFrame must be greater than 0.");
        androidx.core.util.Preconditions.checkArgument(((long) captureSampleRate) > 0, "mSampleRate must be greater than 0.");
        this.getOutputSizes = 500;
        this.getHighSpeedVideoFpsRanges = bytesPerFrame * 1024;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        if (this.getOutputMinFrameDuration.getAndSet(true)) {
            return;
        }
        this.getHighSpeedVideoSizesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.BufferedAudioStream bufferedAudioStream = androidx.camera.video.internal.audio.BufferedAudioStream.this;
                bufferedAudioStream.getInputSizeshNQ4ISI.set(false);
                bufferedAudioStream.getHighSpeedVideoSizes.release();
                bufferedAudioStream.getHighSpeedVideoFpsRangesFor.clear();
                synchronized (bufferedAudioStream.getInputFormats) {
                    bufferedAudioStream.getHighResolutionOutputSizeshNQ4ISI = null;
                }
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(final androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback audioStreamCallback, final java.util.concurrent.Executor executor) {
        boolean z = true;
        androidx.core.util.Preconditions.checkState(!this.getOutputFormats.get(), "AudioStream can not be started when setCallback.");
        androidx.core.util.Preconditions.checkState(!this.getOutputMinFrameDuration.get(), "AudioStream has been released.");
        if (audioStreamCallback != null && executor == null) {
            z = false;
        }
        androidx.core.util.Preconditions.checkArgument(z, "executor can't be null with non-null callback.");
        this.getHighSpeedVideoSizesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.BufferedAudioStream bufferedAudioStream = androidx.camera.video.internal.audio.BufferedAudioStream.this;
                bufferedAudioStream.getHighSpeedVideoSizes.setCallback(audioStreamCallback, executor);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getInputSizeshNQ4ISI.get()) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.getHighSpeedVideoFpsRanges);
            if (!this.getHighSpeedVideoFpsRangesFor.offer(new androidx.camera.video.internal.audio.BufferedAudioStream.AudioData(allocateDirect, this.getHighSpeedVideoSizes.read(allocateDirect), this.Camera2StreamConfigurationMap, this.getOutputStallDuration))) {
                androidx.camera.core.Logger.w("BufferedAudioStream", "Failed to offer audio data to queue.");
            }
            while (this.getHighSpeedVideoFpsRangesFor.size() > this.getOutputSizes) {
                this.getHighSpeedVideoFpsRangesFor.poll();
                androidx.camera.core.Logger.w("BufferedAudioStream", "Drop audio data due to full of queue.");
            }
            if (this.getInputSizeshNQ4ISI.get()) {
                this.getHighSpeedVideoSizesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.video.internal.audio.BufferedAudioStream.this.getHighResolutionOutputSizeshNQ4ISI();
                    }
                });
            }
        }
    }

    static class AudioData {
        long getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;

        AudioData(java.nio.ByteBuffer byteBuffer, androidx.camera.video.internal.audio.AudioStream.PacketInfo packetInfo, int i, int i2) {
            byteBuffer.rewind();
            int limit = byteBuffer.limit() - byteBuffer.position();
            if (limit != packetInfo.getSizeInBytes()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Byte buffer size is not match with packet info: ");
                sb.append(limit);
                sb.append(" != ");
                sb.append(packetInfo.getSizeInBytes());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoSizes = i2;
            this.getHighSpeedVideoFpsRangesFor = byteBuffer;
            this.getHighResolutionOutputSizeshNQ4ISI = packetInfo.getTimestampNs();
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public androidx.camera.video.internal.audio.AudioStream.PacketInfo read(java.nio.ByteBuffer byteBuffer) {
        androidx.camera.video.internal.audio.BufferedAudioStream.AudioData audioData;
        int remaining;
        androidx.core.util.Preconditions.checkState(!this.getOutputMinFrameDuration.get(), "AudioStream has been released.");
        androidx.core.util.Preconditions.checkState(this.getOutputFormats.get(), "AudioStream has not been started.");
        final int remaining2 = byteBuffer.remaining();
        this.getHighSpeedVideoSizesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.BufferedAudioStream bufferedAudioStream = androidx.camera.video.internal.audio.BufferedAudioStream.this;
                int i = remaining2;
                int i2 = bufferedAudioStream.getHighSpeedVideoFpsRanges;
                if (i2 != i) {
                    int i3 = bufferedAudioStream.Camera2StreamConfigurationMap;
                    bufferedAudioStream.getHighSpeedVideoFpsRanges = (i / i3) * i3;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Update buffer size from ");
                    sb.append(i2);
                    sb.append(" to ");
                    sb.append(bufferedAudioStream.getHighSpeedVideoFpsRanges);
                    androidx.camera.core.Logger.d("BufferedAudioStream", sb.toString());
                }
            }
        });
        synchronized (this.getInputFormats) {
            audioData = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        if (audioData == null) {
            while (this.getOutputFormats.get() && !this.getOutputMinFrameDuration.get()) {
                try {
                    audioData = this.getHighSpeedVideoFpsRangesFor.poll(100L, java.util.concurrent.TimeUnit.MILLISECONDS);
                    if (audioData != null) {
                        break;
                    }
                } catch (java.lang.InterruptedException e) {
                    androidx.camera.core.Logger.w("BufferedAudioStream", "Interruption while waiting for audio data", e);
                    return androidx.camera.video.internal.audio.AudioStream.PacketInfo.of(0, 0L);
                }
            }
        }
        if (audioData == null) {
            return androidx.camera.video.internal.audio.AudioStream.PacketInfo.of(0, 0L);
        }
        long j = audioData.getHighResolutionOutputSizeshNQ4ISI;
        int position = audioData.getHighSpeedVideoFpsRangesFor.position();
        int position2 = byteBuffer.position();
        if (audioData.getHighSpeedVideoFpsRangesFor.remaining() > byteBuffer.remaining()) {
            remaining = byteBuffer.remaining();
            audioData.getHighResolutionOutputSizeshNQ4ISI += androidx.camera.video.internal.audio.AudioUtils.frameCountToDurationNs(androidx.camera.video.internal.audio.AudioUtils.sizeToFrameCount(remaining, audioData.getHighSpeedVideoFpsRanges), audioData.getHighSpeedVideoSizes);
            java.nio.ByteBuffer duplicate = audioData.getHighSpeedVideoFpsRangesFor.duplicate();
            duplicate.position(position).limit(position + remaining);
            byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
        } else {
            remaining = audioData.getHighSpeedVideoFpsRangesFor.remaining();
            byteBuffer.put(audioData.getHighSpeedVideoFpsRangesFor).limit(position2 + remaining).position(position2);
        }
        audioData.getHighSpeedVideoFpsRangesFor.position(position + remaining);
        androidx.camera.video.internal.audio.AudioStream.PacketInfo of = androidx.camera.video.internal.audio.AudioStream.PacketInfo.of(remaining, j);
        if (audioData.getHighSpeedVideoFpsRangesFor.remaining() <= 0) {
            return of;
        }
        synchronized (this.getInputFormats) {
            this.getHighResolutionOutputSizeshNQ4ISI = audioData;
        }
        return of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws androidx.camera.video.internal.audio.AudioStream.AudioStreamException, java.lang.IllegalStateException {
        androidx.core.util.Preconditions.checkState(!this.getOutputMinFrameDuration.get(), "AudioStream has been released.");
        if (this.getOutputFormats.getAndSet(true)) {
            return;
        }
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.BufferedAudioStream bufferedAudioStream = androidx.camera.video.internal.audio.BufferedAudioStream.this;
                try {
                    bufferedAudioStream.getHighSpeedVideoSizes.start();
                    if (bufferedAudioStream.getInputSizeshNQ4ISI.getAndSet(true)) {
                        return;
                    }
                    bufferedAudioStream.getHighResolutionOutputSizeshNQ4ISI();
                } catch (androidx.camera.video.internal.audio.AudioStream.AudioStreamException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }, null);
        this.getHighSpeedVideoSizesFor.execute(futureTask);
        try {
            futureTask.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.getOutputFormats.set(false);
            throw new androidx.camera.video.internal.audio.AudioStream.AudioStreamException(e);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() throws java.lang.IllegalStateException {
        androidx.core.util.Preconditions.checkState(!this.getOutputMinFrameDuration.get(), "AudioStream has been released.");
        if (this.getOutputFormats.getAndSet(false)) {
            this.getHighSpeedVideoSizesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.internal.audio.BufferedAudioStream bufferedAudioStream = androidx.camera.video.internal.audio.BufferedAudioStream.this;
                    bufferedAudioStream.getInputSizeshNQ4ISI.set(false);
                    bufferedAudioStream.getHighSpeedVideoSizes.stop();
                    bufferedAudioStream.getHighSpeedVideoFpsRangesFor.clear();
                    synchronized (bufferedAudioStream.getInputFormats) {
                        bufferedAudioStream.getHighResolutionOutputSizeshNQ4ISI = null;
                    }
                }
            });
        }
    }
}
