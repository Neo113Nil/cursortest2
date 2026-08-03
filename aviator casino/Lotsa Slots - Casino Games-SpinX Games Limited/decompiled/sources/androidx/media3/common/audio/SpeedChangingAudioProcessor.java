package androidx.media3.common.audio;

/* loaded from: classes2.dex */
public final class SpeedChangingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private long bytesRead;
    private float currentSpeed;
    private boolean endOfStreamQueuedToSonic;
    private androidx.media3.common.util.LongArray inputSegmentStartTimesUs;
    private long lastProcessedInputTimeUs;
    private long lastSpeedAdjustedInputTimeUs;
    private long lastSpeedAdjustedOutputTimeUs;
    private final java.lang.Object lock;
    private androidx.media3.common.util.LongArray outputSegmentStartTimesUs;
    private final androidx.media3.common.util.LongArrayQueue pendingCallbackInputTimesUs;
    private final java.util.Queue<androidx.media3.common.util.TimestampConsumer> pendingCallbacks;
    private final androidx.media3.common.audio.SynchronizedSonicAudioProcessor sonicAudioProcessor;
    private long speedAdjustedTimeAsyncInputTimeUs;
    private final androidx.media3.common.audio.SpeedProvider speedProvider;

    private static double divide(long j, long j2) {
        return j / j2;
    }

    public SpeedChangingAudioProcessor(androidx.media3.common.audio.SpeedProvider speedProvider) {
        this.speedProvider = speedProvider;
        java.lang.Object obj = new java.lang.Object();
        this.lock = obj;
        this.sonicAudioProcessor = new androidx.media3.common.audio.SynchronizedSonicAudioProcessor(obj);
        this.pendingCallbackInputTimesUs = new androidx.media3.common.util.LongArrayQueue();
        this.pendingCallbacks = new java.util.ArrayDeque();
        this.speedAdjustedTimeAsyncInputTimeUs = -9223372036854775807L;
        resetState();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j) {
        return androidx.media3.common.util.SpeedProviderUtil.getDurationAfterSpeedProviderApplied(this.speedProvider, j);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        return this.sonicAudioProcessor.configure(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        int i;
        long scaleLargeTimestamp = androidx.media3.common.util.Util.scaleLargeTimestamp(this.bytesRead, 1000000L, this.inputAudioFormat.bytesPerFrame * this.inputAudioFormat.sampleRate);
        updateSpeed(this.speedProvider.getSpeed(scaleLargeTimestamp), scaleLargeTimestamp);
        int limit = byteBuffer.limit();
        long nextSpeedChangeTimeUs = this.speedProvider.getNextSpeedChangeTimeUs(scaleLargeTimestamp);
        if (nextSpeedChangeTimeUs != -9223372036854775807L) {
            i = (int) androidx.media3.common.util.Util.scaleLargeValue(nextSpeedChangeTimeUs - scaleLargeTimestamp, this.inputAudioFormat.sampleRate * this.inputAudioFormat.bytesPerFrame, 1000000L, java.math.RoundingMode.CEILING);
            int i2 = this.inputAudioFormat.bytesPerFrame - (i % this.inputAudioFormat.bytesPerFrame);
            if (i2 != this.inputAudioFormat.bytesPerFrame) {
                i += i2;
            }
            byteBuffer.limit(java.lang.Math.min(limit, byteBuffer.position() + i));
        } else {
            i = -1;
        }
        long position = byteBuffer.position();
        if (isUsingSonic()) {
            this.sonicAudioProcessor.queueInput(byteBuffer);
            if (i != -1 && byteBuffer.position() - position == i) {
                this.sonicAudioProcessor.queueEndOfStream();
                this.endOfStreamQueuedToSonic = true;
            }
        } else {
            java.nio.ByteBuffer replaceOutputBuffer = replaceOutputBuffer(byteBuffer.remaining());
            if (byteBuffer.hasRemaining()) {
                replaceOutputBuffer.put(byteBuffer);
            }
            replaceOutputBuffer.flip();
        }
        this.bytesRead += byteBuffer.position() - position;
        updateLastProcessedInputTime();
        byteBuffer.limit(limit);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onQueueEndOfStream() {
        if (this.endOfStreamQueuedToSonic) {
            return;
        }
        this.sonicAudioProcessor.queueEndOfStream();
        this.endOfStreamQueuedToSonic = true;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public java.nio.ByteBuffer getOutput() {
        java.nio.ByteBuffer output = isUsingSonic() ? this.sonicAudioProcessor.getOutput() : super.getOutput();
        processPendingCallbacks();
        return output;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.sonicAudioProcessor.isEnded();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onFlush() {
        resetState();
        this.sonicAudioProcessor.flush();
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onReset() {
        resetState();
        this.sonicAudioProcessor.reset();
    }

    public void getSpeedAdjustedTimeAsync(long j, androidx.media3.common.util.TimestampConsumer timestampConsumer) {
        synchronized (this.lock) {
            androidx.media3.common.util.Assertions.checkArgument(this.speedAdjustedTimeAsyncInputTimeUs < j);
            this.speedAdjustedTimeAsyncInputTimeUs = j;
            if ((j <= this.lastProcessedInputTimeUs && this.pendingCallbackInputTimesUs.isEmpty()) || isEnded()) {
                timestampConsumer.onTimestamp(calculateSpeedAdjustedTime(j));
            } else {
                this.pendingCallbackInputTimesUs.add(j);
                this.pendingCallbacks.add(timestampConsumer);
            }
        }
    }

    public long getMediaDurationUs(long j) {
        long round;
        long j2;
        synchronized (this.lock) {
            int size = this.outputSegmentStartTimesUs.size() - 1;
            while (size > 0 && this.outputSegmentStartTimesUs.get(size) > j) {
                size--;
            }
            long j3 = j - this.outputSegmentStartTimesUs.get(size);
            if (size == this.outputSegmentStartTimesUs.size() - 1) {
                round = getMediaDurationUsAtCurrentSpeed(j3);
            } else {
                int i = size + 1;
                round = java.lang.Math.round(j3 * divide(this.inputSegmentStartTimesUs.get(i) - this.inputSegmentStartTimesUs.get(size), this.outputSegmentStartTimesUs.get(i) - this.outputSegmentStartTimesUs.get(size)));
            }
            j2 = this.inputSegmentStartTimesUs.get(size) + round;
        }
        return j2;
    }

    private long calculateSpeedAdjustedTime(long j) {
        long round;
        int size = this.inputSegmentStartTimesUs.size() - 1;
        while (size > 0 && this.inputSegmentStartTimesUs.get(size) > j) {
            size--;
        }
        if (size == this.inputSegmentStartTimesUs.size() - 1) {
            if (this.lastSpeedAdjustedInputTimeUs < this.inputSegmentStartTimesUs.get(size)) {
                this.lastSpeedAdjustedInputTimeUs = this.inputSegmentStartTimesUs.get(size);
                this.lastSpeedAdjustedOutputTimeUs = this.outputSegmentStartTimesUs.get(size);
            }
            round = getPlayoutDurationUsAtCurrentSpeed(j - this.lastSpeedAdjustedInputTimeUs);
        } else {
            int i = size + 1;
            round = java.lang.Math.round((j - this.lastSpeedAdjustedInputTimeUs) * divide(this.outputSegmentStartTimesUs.get(i) - this.outputSegmentStartTimesUs.get(size), this.inputSegmentStartTimesUs.get(i) - this.inputSegmentStartTimesUs.get(size)));
        }
        this.lastSpeedAdjustedInputTimeUs = j;
        long j2 = this.lastSpeedAdjustedOutputTimeUs + round;
        this.lastSpeedAdjustedOutputTimeUs = j2;
        return j2;
    }

    private void processPendingCallbacks() {
        synchronized (this.lock) {
            while (!this.pendingCallbacks.isEmpty() && (this.pendingCallbackInputTimesUs.element() <= this.lastProcessedInputTimeUs || isEnded())) {
                this.pendingCallbacks.remove().onTimestamp(calculateSpeedAdjustedTime(this.pendingCallbackInputTimesUs.remove()));
            }
        }
    }

    private void updateSpeed(float f, long j) {
        synchronized (this.lock) {
            if (f != this.currentSpeed) {
                updateSpeedChangeArrays(j);
                this.currentSpeed = f;
                if (isUsingSonic()) {
                    this.sonicAudioProcessor.setSpeed(f);
                    this.sonicAudioProcessor.setPitch(f);
                }
                this.sonicAudioProcessor.flush();
                this.endOfStreamQueuedToSonic = false;
                super.getOutput();
            }
        }
    }

    private void updateSpeedChangeArrays(long j) {
        long j2 = this.outputSegmentStartTimesUs.get(r0.size() - 1);
        long j3 = j - this.inputSegmentStartTimesUs.get(r2.size() - 1);
        this.inputSegmentStartTimesUs.add(j);
        this.outputSegmentStartTimesUs.add(j2 + getPlayoutDurationUsAtCurrentSpeed(j3));
    }

    private long getPlayoutDurationUsAtCurrentSpeed(long j) {
        return isUsingSonic() ? this.sonicAudioProcessor.getPlayoutDuration(j) : j;
    }

    private long getMediaDurationUsAtCurrentSpeed(long j) {
        return isUsingSonic() ? this.sonicAudioProcessor.getMediaDuration(j) : j;
    }

    private void updateLastProcessedInputTime() {
        synchronized (this.lock) {
            if (isUsingSonic()) {
                this.lastProcessedInputTimeUs = this.inputSegmentStartTimesUs.get(r3.size() - 1) + androidx.media3.common.util.Util.scaleLargeTimestamp(this.sonicAudioProcessor.getProcessedInputBytes(), 1000000L, this.inputAudioFormat.bytesPerFrame * this.inputAudioFormat.sampleRate);
            } else {
                this.lastProcessedInputTimeUs = androidx.media3.common.util.Util.scaleLargeTimestamp(this.bytesRead, 1000000L, this.inputAudioFormat.bytesPerFrame * this.inputAudioFormat.sampleRate);
            }
        }
    }

    private boolean isUsingSonic() {
        boolean z;
        synchronized (this.lock) {
            z = this.currentSpeed != 1.0f;
        }
        return z;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"inputSegmentStartTimesUs", "outputSegmentStartTimesUs"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"lock"})
    private void resetState() {
        synchronized (this.lock) {
            this.inputSegmentStartTimesUs = new androidx.media3.common.util.LongArray();
            this.outputSegmentStartTimesUs = new androidx.media3.common.util.LongArray();
            this.inputSegmentStartTimesUs.add(0L);
            this.outputSegmentStartTimesUs.add(0L);
            this.lastProcessedInputTimeUs = 0L;
            this.lastSpeedAdjustedInputTimeUs = 0L;
            this.lastSpeedAdjustedOutputTimeUs = 0L;
            this.currentSpeed = 1.0f;
        }
        this.bytesRead = 0L;
        this.endOfStreamQueuedToSonic = false;
    }
}
