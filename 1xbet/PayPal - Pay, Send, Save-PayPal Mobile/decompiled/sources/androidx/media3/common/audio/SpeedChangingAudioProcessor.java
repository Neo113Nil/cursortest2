package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class SpeedChangingAudioProcessor implements androidx.media3.common.audio.AudioProcessor {
    private long getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private final java.util.Queue<androidx.media3.common.util.TimestampConsumer> getInputFormats;
    private final java.lang.Object getInputSizeshNQ4ISI;
    private final androidx.media3.common.util.LongArrayQueue getOutputMinFrameDuration;
    private final androidx.media3.common.audio.SynchronizedSonicAudioProcessor getOutputStallDuration;
    private final androidx.media3.common.audio.SpeedProvider getOutputStallDurationlomOqCM;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat getHighSpeedVideoSizesFor = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat getOutputFormats = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat Camera2StreamConfigurationMap = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;

    public SpeedChangingAudioProcessor(androidx.media3.common.audio.SpeedProvider speedProvider) {
        this.getOutputStallDurationlomOqCM = speedProvider;
        java.lang.Object obj = new java.lang.Object();
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputStallDuration = new androidx.media3.common.audio.SynchronizedSonicAudioProcessor(obj);
        this.getOutputMinFrameDuration = new androidx.media3.common.util.LongArrayQueue();
        this.getInputFormats = new java.util.ArrayDeque();
        this.getHighSpeedVideoFpsRangesFor = 1.0f;
    }

    public static long getSampleCountAfterProcessorApplied(androidx.media3.common.audio.SpeedProvider speedProvider, int i, long j) {
        com.google.common.base.Preconditions.checkArgument(speedProvider != null);
        com.google.common.base.Preconditions.checkArgument(i > 0);
        long j2 = 0;
        com.google.common.base.Preconditions.checkArgument(j >= 0);
        long j3 = 0;
        while (j2 < j) {
            long nextSpeedChangeSamplePosition = androidx.media3.common.util.SpeedProviderUtil.getNextSpeedChangeSamplePosition(speedProvider, j2, i);
            if (nextSpeedChangeSamplePosition == -1 || nextSpeedChangeSamplePosition > j) {
                nextSpeedChangeSamplePosition = j;
            }
            float sampleAlignedSpeed = androidx.media3.common.util.SpeedProviderUtil.getSampleAlignedSpeed(speedProvider, j2, i);
            j3 += androidx.media3.common.audio.Sonic.getHighResolutionOutputSizeshNQ4ISI(i, i, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - j2);
            j2 = nextSpeedChangeSamplePosition;
        }
        return j3;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        this.getHighSpeedVideoSizesFor = audioFormat;
        androidx.media3.common.audio.AudioProcessor.AudioFormat configure = this.getOutputStallDuration.configure(audioFormat);
        this.getOutputFormats = configure;
        return configure;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return !this.getOutputFormats.equals(androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final long getDurationAfterProcessorApplied(long j) {
        return androidx.media3.common.util.SpeedProviderUtil.getDurationAfterSpeedProviderApplied(this.getOutputStallDurationlomOqCM, j);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(java.nio.ByteBuffer byteBuffer) {
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat;
        int i;
        synchronized (this.getInputSizeshNQ4ISI) {
            audioFormat = this.Camera2StreamConfigurationMap;
        }
        float sampleAlignedSpeed = androidx.media3.common.util.SpeedProviderUtil.getSampleAlignedSpeed(this.getOutputStallDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI, audioFormat.sampleRate);
        long nextSpeedChangeSamplePosition = androidx.media3.common.util.SpeedProviderUtil.getNextSpeedChangeSamplePosition(this.getOutputStallDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI, audioFormat.sampleRate);
        if (sampleAlignedSpeed != this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor = sampleAlignedSpeed;
            androidx.media3.common.audio.SynchronizedSonicAudioProcessor synchronizedSonicAudioProcessor = this.getOutputStallDuration;
            synchronized (synchronizedSonicAudioProcessor.getHighSpeedVideoSizes) {
                synchronizedSonicAudioProcessor.getHighSpeedVideoFpsRanges.setSpeed(sampleAlignedSpeed);
            }
            androidx.media3.common.audio.SynchronizedSonicAudioProcessor synchronizedSonicAudioProcessor2 = this.getOutputStallDuration;
            synchronized (synchronizedSonicAudioProcessor2.getHighSpeedVideoSizes) {
                synchronizedSonicAudioProcessor2.getHighSpeedVideoFpsRanges.setPitch(sampleAlignedSpeed);
            }
            this.getOutputStallDuration.flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata.DEFAULT);
            this.getHighSpeedVideoSizes = false;
        }
        int limit = byteBuffer.limit();
        if (nextSpeedChangeSamplePosition != -1) {
            i = (int) ((nextSpeedChangeSamplePosition - this.getHighResolutionOutputSizeshNQ4ISI) * audioFormat.bytesPerFrame);
            byteBuffer.limit(java.lang.Math.min(limit, byteBuffer.position() + i));
        } else {
            i = -1;
        }
        long position = byteBuffer.position();
        this.getOutputStallDuration.queueInput(byteBuffer);
        if (i != -1 && byteBuffer.position() - position == i) {
            this.getOutputStallDuration.queueEndOfStream();
            this.getHighSpeedVideoSizes = true;
        }
        long position2 = byteBuffer.position() - position;
        com.google.common.base.Preconditions.checkState(position2 % ((long) audioFormat.bytesPerFrame) == 0, "A frame was not queued completely.");
        this.getHighResolutionOutputSizeshNQ4ISI += position2 / audioFormat.bytesPerFrame;
        byteBuffer.limit(limit);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.getHighSpeedVideoFpsRanges = true;
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.getOutputStallDuration.queueEndOfStream();
        this.getHighSpeedVideoSizes = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final java.nio.ByteBuffer getOutput() {
        return this.getOutputStallDuration.getOutput();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        return this.getHighSpeedVideoFpsRanges && this.getOutputStallDuration.isEnded();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.getHighSpeedVideoSizes = false;
        synchronized (this.getInputSizeshNQ4ISI) {
            this.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizesFor;
            this.getOutputStallDuration.flush(streamMetadata);
            synchronized (this.getInputSizeshNQ4ISI) {
                if (this.Camera2StreamConfigurationMap.sampleRate != -1) {
                    while (!this.getInputFormats.isEmpty()) {
                        long remove = this.getOutputMinFrameDuration.remove();
                        androidx.media3.common.util.TimestampConsumer remove2 = this.getInputFormats.remove();
                        androidx.media3.common.audio.SpeedProvider speedProvider = this.getOutputStallDurationlomOqCM;
                        int i = this.Camera2StreamConfigurationMap.sampleRate;
                        remove2.onTimestamp(androidx.media3.common.util.Util.sampleCountToDurationUs(getSampleCountAfterProcessorApplied(speedProvider, i, androidx.media3.common.util.Util.scaleLargeValue(remove, i, 1000000L, java.math.RoundingMode.HALF_EVEN)), i));
                    }
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.durationUsToSampleCount(streamMetadata.positionOffsetUs, this.Camera2StreamConfigurationMap.sampleRate);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata.DEFAULT);
        this.getHighSpeedVideoSizesFor = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.getOutputFormats = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        synchronized (this.getInputSizeshNQ4ISI) {
            this.Camera2StreamConfigurationMap = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
            this.getOutputMinFrameDuration.clear();
            this.getInputFormats.clear();
        }
        this.getHighSpeedVideoFpsRangesFor = 1.0f;
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.getHighSpeedVideoSizes = false;
        this.getOutputStallDuration.reset();
    }

    public final androidx.media3.common.audio.SpeedProvider getSpeedProvider() {
        return this.getOutputStallDurationlomOqCM;
    }

    public final void getSpeedAdjustedTimeAsync(long j, androidx.media3.common.util.TimestampConsumer timestampConsumer) {
        synchronized (this.getInputSizeshNQ4ISI) {
            int i = this.Camera2StreamConfigurationMap.sampleRate;
            if (i == -1) {
                this.getOutputMinFrameDuration.add(j);
                this.getInputFormats.add(timestampConsumer);
            } else {
                timestampConsumer.onTimestamp(androidx.media3.common.util.Util.sampleCountToDurationUs(getSampleCountAfterProcessorApplied(this.getOutputStallDurationlomOqCM, i, androidx.media3.common.util.Util.scaleLargeValue(j, i, 1000000L, java.math.RoundingMode.HALF_EVEN)), i));
            }
        }
    }

    public final long getMediaDurationUs(long j) {
        int i;
        synchronized (this.getInputSizeshNQ4ISI) {
            i = this.Camera2StreamConfigurationMap.sampleRate;
        }
        if (i == -1) {
            return j;
        }
        long scaleLargeValue = androidx.media3.common.util.Util.scaleLargeValue(j, i, 1000000L, java.math.RoundingMode.HALF_EVEN);
        androidx.media3.common.audio.SpeedProvider speedProvider = this.getOutputStallDurationlomOqCM;
        com.google.common.base.Preconditions.checkArgument(i > 0);
        com.google.common.base.Preconditions.checkArgument(scaleLargeValue >= 0);
        long j2 = scaleLargeValue;
        long j3 = 0;
        while (j2 > 0) {
            long nextSpeedChangeSamplePosition = androidx.media3.common.util.SpeedProviderUtil.getNextSpeedChangeSamplePosition(speedProvider, j3, i);
            float sampleAlignedSpeed = androidx.media3.common.util.SpeedProviderUtil.getSampleAlignedSpeed(speedProvider, j3, i);
            long highResolutionOutputSizeshNQ4ISI = androidx.media3.common.audio.Sonic.getHighResolutionOutputSizeshNQ4ISI(i, i, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - j3);
            if (nextSpeedChangeSamplePosition == -1 || highResolutionOutputSizeshNQ4ISI > j2) {
                j3 += androidx.media3.common.audio.Sonic.Camera2StreamConfigurationMap(i, i, sampleAlignedSpeed, sampleAlignedSpeed, j2);
                j2 = 0;
            } else {
                j2 -= highResolutionOutputSizeshNQ4ISI;
                j3 = nextSpeedChangeSamplePosition;
            }
        }
        return androidx.media3.common.util.Util.sampleCountToDurationUs(j3, i);
    }
}
