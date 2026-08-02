package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class SonicAudioProcessor implements androidx.media3.common.audio.AudioProcessor {
    public static final int SAMPLE_RATE_NO_CHANGE = -1;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat Camera2StreamConfigurationMap;
    private long getHighResolutionOutputSizeshNQ4ISI;
    private java.nio.ByteBuffer getHighSpeedVideoFpsRanges;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat getInputFormats;
    private androidx.media3.common.audio.AudioProcessor.AudioFormat getInputSizeshNQ4ISI;
    private java.nio.ByteBuffer getOutputFormats;
    private long getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private float getOutputSizes;
    private androidx.media3.common.audio.Sonic getOutputSizeshNQ4ISI;
    private float getOutputStallDuration;
    private final boolean getOutputStallDurationlomOqCM;

    public SonicAudioProcessor() {
        this(false);
    }

    SonicAudioProcessor(boolean z) {
        this.getOutputSizes = 1.0f;
        this.getOutputStallDuration = 1.0f;
        this.getInputSizeshNQ4ISI = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.getInputFormats = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.Camera2StreamConfigurationMap = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.getHighSpeedVideoFpsRangesFor = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.getHighSpeedVideoFpsRanges = EMPTY_BUFFER;
        this.getOutputFormats = EMPTY_BUFFER;
        this.getHighSpeedVideoSizesFor = -1;
        this.getOutputStallDurationlomOqCM = z;
    }

    public final void setSpeed(float f) {
        com.google.common.base.Preconditions.checkArgument(f > 0.0f);
        if (this.getOutputSizes != f) {
            this.getOutputSizes = f;
            this.getOutputMinFrameDurationlomOqCM = true;
        }
    }

    public final void setPitch(float f) {
        com.google.common.base.Preconditions.checkArgument(f > 0.0f);
        if (this.getOutputStallDuration != f) {
            this.getOutputStallDuration = f;
            this.getOutputMinFrameDurationlomOqCM = true;
        }
    }

    public final void setOutputSampleRateHz(int i) {
        com.google.common.base.Preconditions.checkArgument(i == -1 || i > 0);
        this.getHighSpeedVideoSizesFor = i;
    }

    public final long getMediaDuration(long j) {
        if (this.getOutputMinFrameDuration >= okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.media3.common.audio.Sonic sonic = (androidx.media3.common.audio.Sonic) com.google.common.base.Preconditions.checkNotNull(this.getOutputSizeshNQ4ISI);
            long Camera2StreamConfigurationMap = j2 - ((sonic.getHighSpeedVideoFpsRanges * sonic.getHighSpeedVideoFpsRangesFor) * sonic.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap());
            if (this.getHighSpeedVideoFpsRangesFor.sampleRate == this.Camera2StreamConfigurationMap.sampleRate) {
                return androidx.media3.common.util.Util.scaleLargeTimestamp(j, Camera2StreamConfigurationMap, this.getOutputMinFrameDuration);
            }
            return androidx.media3.common.util.Util.scaleLargeTimestamp(j, Camera2StreamConfigurationMap * this.getHighSpeedVideoFpsRangesFor.sampleRate, this.Camera2StreamConfigurationMap.sampleRate * this.getOutputMinFrameDuration);
        }
        return (long) (this.getOutputSizes * j);
    }

    public final long getPlayoutDuration(long j) {
        if (this.getOutputMinFrameDuration >= okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.media3.common.audio.Sonic sonic = (androidx.media3.common.audio.Sonic) com.google.common.base.Preconditions.checkNotNull(this.getOutputSizeshNQ4ISI);
            long Camera2StreamConfigurationMap = j2 - ((sonic.getHighSpeedVideoFpsRanges * sonic.getHighSpeedVideoFpsRangesFor) * sonic.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap());
            if (this.getHighSpeedVideoFpsRangesFor.sampleRate == this.Camera2StreamConfigurationMap.sampleRate) {
                return androidx.media3.common.util.Util.scaleLargeTimestamp(j, this.getOutputMinFrameDuration, Camera2StreamConfigurationMap);
            }
            return androidx.media3.common.util.Util.scaleLargeTimestamp(j, this.Camera2StreamConfigurationMap.sampleRate * this.getOutputMinFrameDuration, Camera2StreamConfigurationMap * this.getHighSpeedVideoFpsRangesFor.sampleRate);
        }
        return (long) (j / this.getOutputSizes);
    }

    public final long getProcessedInputBytes() {
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.media3.common.audio.Sonic sonic = (androidx.media3.common.audio.Sonic) com.google.common.base.Preconditions.checkNotNull(this.getOutputSizeshNQ4ISI);
        return j - ((sonic.getHighSpeedVideoFpsRanges * sonic.getHighSpeedVideoFpsRangesFor) * sonic.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap());
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final long getDurationAfterProcessorApplied(long j) {
        return getPlayoutDuration(j);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2 && audioFormat.encoding != 4) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i = this.getHighSpeedVideoSizesFor;
        if (i == -1) {
            i = audioFormat.sampleRate;
        }
        this.getInputSizeshNQ4ISI = audioFormat;
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat2 = new androidx.media3.common.audio.AudioProcessor.AudioFormat(i, audioFormat.channelCount, audioFormat.encoding);
        this.getInputFormats = audioFormat2;
        this.getOutputMinFrameDurationlomOqCM = true;
        return audioFormat2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        if (this.getInputFormats.sampleRate != -1) {
            return this.getOutputStallDurationlomOqCM || java.lang.Math.abs(this.getOutputSizes - 1.0f) >= 1.0E-4f || java.lang.Math.abs(this.getOutputStallDuration - 1.0f) >= 1.0E-4f || this.getInputFormats.sampleRate != this.getInputSizeshNQ4ISI.sampleRate;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            androidx.media3.common.audio.Sonic sonic = (androidx.media3.common.audio.Sonic) com.google.common.base.Preconditions.checkNotNull(this.getOutputSizeshNQ4ISI);
            this.getHighResolutionOutputSizeshNQ4ISI += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int Camera2StreamConfigurationMap = remaining / (sonic.getHighSpeedVideoFpsRangesFor * sonic.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap());
            sonic.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
            sonic.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(byteBuffer, remaining);
            sonic.getHighSpeedVideoFpsRanges += Camera2StreamConfigurationMap;
            sonic.getHighSpeedVideoFpsRanges();
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        androidx.media3.common.audio.Sonic sonic = this.getOutputSizeshNQ4ISI;
        if (sonic != null) {
            int i = sonic.getHighSpeedVideoFpsRanges;
            float f = sonic.getOutputSizes;
            float f2 = sonic.getInputFormats;
            double d = f / f2;
            int i2 = sonic.getOutputFormats + ((int) (((((((i - r6) / d) + sonic.getOutputStallDuration) + sonic.getHighSpeedVideoSizes) + sonic.getHighSpeedVideoSizesFor) / (sonic.getOutputMinFrameDurationlomOqCM * f2)) + 0.5d));
            sonic.getHighSpeedVideoSizes = 0.0d;
            sonic.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges((sonic.getHighResolutionOutputSizeshNQ4ISI * 2) + i);
            sonic.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(i * sonic.getHighSpeedVideoFpsRangesFor, sonic.getHighResolutionOutputSizeshNQ4ISI * 2);
            sonic.getHighSpeedVideoFpsRanges += sonic.getHighResolutionOutputSizeshNQ4ISI * 2;
            sonic.getHighSpeedVideoFpsRanges();
            if (sonic.getOutputFormats > i2) {
                sonic.getOutputFormats = java.lang.Math.max(i2, 0);
            }
            sonic.getHighSpeedVideoFpsRanges = 0;
            sonic.getOutputStallDuration = 0;
            sonic.getHighSpeedVideoSizesFor = 0;
        }
        this.getHighSpeedVideoSizes = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final java.nio.ByteBuffer getOutput() {
        int highSpeedVideoFpsRangesFor;
        androidx.media3.common.audio.Sonic sonic = this.getOutputSizeshNQ4ISI;
        if (sonic != null && (highSpeedVideoFpsRangesFor = sonic.getHighSpeedVideoFpsRangesFor()) > 0) {
            if (this.getHighSpeedVideoFpsRanges.capacity() < highSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRanges = java.nio.ByteBuffer.allocateDirect(highSpeedVideoFpsRangesFor).order(java.nio.ByteOrder.nativeOrder());
            } else {
                this.getHighSpeedVideoFpsRanges.clear();
            }
            java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoFpsRanges;
            com.google.common.base.Preconditions.checkState(sonic.getOutputFormats >= 0);
            int min = java.lang.Math.min(byteBuffer.remaining() / (sonic.getHighSpeedVideoFpsRangesFor * sonic.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap()), sonic.getOutputFormats);
            sonic.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(byteBuffer, min);
            sonic.getOutputFormats -= min;
            java.lang.System.arraycopy(sonic.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(), min * sonic.getHighSpeedVideoFpsRangesFor, sonic.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(), 0, sonic.getOutputFormats * sonic.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoFpsRanges.flip();
            this.getOutputMinFrameDuration += highSpeedVideoFpsRangesFor;
            this.getOutputFormats = this.getHighSpeedVideoFpsRanges;
        }
        java.nio.ByteBuffer byteBuffer2 = this.getOutputFormats;
        this.getOutputFormats = EMPTY_BUFFER;
        return byteBuffer2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        if (!this.getHighSpeedVideoSizes) {
            return false;
        }
        androidx.media3.common.audio.Sonic sonic = this.getOutputSizeshNQ4ISI;
        return sonic == null || sonic.getHighSpeedVideoFpsRangesFor() == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        if (isActive()) {
            androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat = this.getInputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = audioFormat;
            this.getHighSpeedVideoFpsRangesFor = this.getInputFormats;
            if (this.getOutputMinFrameDurationlomOqCM) {
                this.getOutputSizeshNQ4ISI = new androidx.media3.common.audio.Sonic(audioFormat.sampleRate, this.Camera2StreamConfigurationMap.channelCount, this.getOutputSizes, this.getOutputStallDuration, this.getHighSpeedVideoFpsRangesFor.sampleRate, this.Camera2StreamConfigurationMap.encoding == 4);
            } else {
                androidx.media3.common.audio.Sonic sonic = this.getOutputSizeshNQ4ISI;
                if (sonic != null) {
                    sonic.getHighSpeedVideoFpsRanges = 0;
                    sonic.getOutputFormats = 0;
                    sonic.getHighSpeedVideoSizesFor = 0;
                    sonic.getInputSizeshNQ4ISI = 0;
                    sonic.getOutputMinFrameDuration = 0;
                    sonic.getOutputStallDuration = 0;
                    sonic.getOutputSizeshNQ4ISI = 0;
                    sonic.getHighSpeedVideoSizes = 0.0d;
                    sonic.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
                }
            }
        }
        this.getOutputFormats = EMPTY_BUFFER;
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.getOutputMinFrameDuration = 0L;
        this.getHighSpeedVideoSizes = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.getOutputSizes = 1.0f;
        this.getOutputStallDuration = 1.0f;
        this.getInputSizeshNQ4ISI = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.getInputFormats = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.Camera2StreamConfigurationMap = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.getHighSpeedVideoFpsRangesFor = androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
        this.getHighSpeedVideoFpsRanges = EMPTY_BUFFER;
        this.getOutputFormats = EMPTY_BUFFER;
        this.getHighSpeedVideoSizesFor = -1;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getOutputSizeshNQ4ISI = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.getOutputMinFrameDuration = 0L;
        this.getHighSpeedVideoSizes = false;
    }
}
