package androidx.camera.video.internal.audio;

/* loaded from: classes6.dex */
public class AudioStreamImpl implements androidx.camera.video.internal.audio.AudioStream {
    private static final long getHighSpeedVideoFpsRangesFor = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(500);
    private android.media.AudioManager.AudioRecordingCallback Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private android.media.AudioRecord getHighSpeedVideoFpsRanges;
    private androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private java.util.concurrent.Executor getInputFormats;
    private final androidx.camera.video.internal.audio.AudioSettings getOutputMinFrameDurationlomOqCM;
    private long getOutputSizes;
    private final java.util.concurrent.atomic.AtomicBoolean getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean getOutputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>(null);
    private boolean getOutputSizeshNQ4ISI = false;

    public AudioStreamImpl(androidx.camera.video.internal.audio.AudioSettings audioSettings, android.content.Context context) throws java.lang.IllegalArgumentException, androidx.camera.video.internal.audio.AudioStream.AudioStreamException {
        if (!isSettingsSupported(audioSettings.getCaptureSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat())) {
            throw new java.lang.UnsupportedOperationException(java.lang.String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", java.lang.Integer.valueOf(audioSettings.getCaptureSampleRate()), java.lang.Integer.valueOf(audioSettings.getChannelCount()), java.lang.Integer.valueOf(audioSettings.getAudioFormat())));
        }
        this.getOutputMinFrameDurationlomOqCM = audioSettings;
        this.getHighSpeedVideoSizesFor = audioSettings.getBytesPerFrame();
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(audioSettings.getCaptureSampleRate(), androidx.camera.video.internal.audio.AudioUtils.channelCountToChannelConfig(audioSettings.getChannelCount()), audioSettings.getAudioFormat());
        androidx.core.util.Preconditions.checkState(minBufferSize > 0);
        int i = minBufferSize * 2;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        android.media.AudioRecord highSpeedVideoSizes = getHighSpeedVideoSizes(i, audioSettings, context);
        this.getHighSpeedVideoFpsRanges = highSpeedVideoSizes;
        if (highSpeedVideoSizes.getState() == 1) {
            return;
        }
        highSpeedVideoSizes.release();
        throw new androidx.camera.video.internal.audio.AudioStream.AudioStreamException("Unable to initialize AudioRecord");
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        android.media.AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.getInputSizeshNQ4ISI.getAndSet(true)) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.Camera2StreamConfigurationMap) != null) {
            androidx.camera.video.internal.compat.Api29Impl.unregisterAudioRecordingCallback(this.getHighSpeedVideoFpsRanges, audioRecordingCallback);
        }
        this.getHighSpeedVideoFpsRanges.release();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback audioStreamCallback, java.util.concurrent.Executor executor) {
        boolean z = true;
        androidx.core.util.Preconditions.checkState(!this.getOutputFormats.get(), "AudioStream can not be started when setCallback.");
        androidx.core.util.Preconditions.checkState(!this.getInputSizeshNQ4ISI.get(), "AudioStream has been released.");
        if (audioStreamCallback != null && executor == null) {
            z = false;
        }
        androidx.core.util.Preconditions.checkArgument(z, "executor can't be null with non-null callback.");
        this.getHighSpeedVideoSizes = audioStreamCallback;
        this.getInputFormats = executor;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.media.AudioManager.AudioRecordingCallback audioRecordingCallback = this.Camera2StreamConfigurationMap;
            if (audioRecordingCallback != null) {
                androidx.camera.video.internal.compat.Api29Impl.unregisterAudioRecordingCallback(this.getHighSpeedVideoFpsRanges, audioRecordingCallback);
            }
            if (audioStreamCallback != null) {
                if (this.Camera2StreamConfigurationMap == null) {
                    this.Camera2StreamConfigurationMap = new androidx.camera.video.internal.audio.AudioStreamImpl.AudioRecordingApi29Callback();
                }
                androidx.camera.video.internal.compat.Api29Impl.registerAudioRecordingCallback(this.getHighSpeedVideoFpsRanges, executor, this.Camera2StreamConfigurationMap);
            }
        }
    }

    final void getHighSpeedVideoFpsRanges(final boolean z) {
        java.util.concurrent.Executor executor = this.getInputFormats;
        final androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback audioStreamCallback = this.getHighSpeedVideoSizes;
        if (executor == null || audioStreamCallback == null || java.util.Objects.equals(this.getOutputMinFrameDuration.getAndSet(java.lang.Boolean.valueOf(z)), java.lang.Boolean.valueOf(z))) {
            return;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.video.internal.audio.AudioStreamImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback.this.onSilenceStateChanged(z);
            }
        });
    }

    class AudioRecordingApi29Callback extends android.media.AudioManager.AudioRecordingCallback {
        AudioRecordingApi29Callback() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> list) {
            for (android.media.AudioRecordingConfiguration audioRecordingConfiguration : list) {
                if (androidx.camera.video.internal.compat.Api24Impl.getClientAudioSessionId(audioRecordingConfiguration) == androidx.camera.video.internal.audio.AudioStreamImpl.this.getHighSpeedVideoFpsRanges.getAudioSessionId()) {
                    androidx.camera.video.internal.audio.AudioStreamImpl.this.getHighSpeedVideoFpsRanges(androidx.camera.video.internal.compat.Api29Impl.isClientSilenced(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    private static android.media.AudioRecord getHighSpeedVideoSizes(int i, androidx.camera.video.internal.audio.AudioSettings audioSettings, android.content.Context context) throws java.lang.IllegalArgumentException {
        int captureSampleRate = audioSettings.getCaptureSampleRate();
        int channelCount = audioSettings.getChannelCount();
        android.media.AudioFormat build = new android.media.AudioFormat.Builder().setSampleRate(captureSampleRate).setChannelMask(androidx.camera.video.internal.audio.AudioUtils.channelCountToChannelMask(channelCount)).setEncoding(audioSettings.getAudioFormat()).build();
        android.media.AudioRecord.Builder builder = new android.media.AudioRecord.Builder();
        if (android.os.Build.VERSION.SDK_INT >= 31 && context != null) {
            androidx.camera.video.internal.compat.Api31Impl.setContext(builder, context);
        }
        builder.setAudioSource(audioSettings.getAudioSource());
        builder.setAudioFormat(build);
        builder.setBufferSizeInBytes(i);
        try {
            return builder.build();
        } catch (java.lang.UnsupportedOperationException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static boolean isSettingsSupported(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0 || android.media.AudioRecord.getMinBufferSize(i, androidx.camera.video.internal.audio.AudioUtils.channelCountToChannelConfig(i2), i3) <= 0) {
            return false;
        }
        try {
            new android.media.AudioFormat.Builder().setSampleRate(i).setChannelMask(androidx.camera.video.internal.audio.AudioUtils.channelCountToChannelMask(i2)).setEncoding(i3).build();
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    @Override // androidx.camera.video.internal.audio.AudioStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.camera.video.internal.audio.AudioStream.PacketInfo read(java.nio.ByteBuffer byteBuffer) {
        long j;
        androidx.core.util.Preconditions.checkState(!this.getInputSizeshNQ4ISI.get(), "AudioStream has been released.");
        androidx.core.util.Preconditions.checkState(this.getOutputFormats.get(), "AudioStream has not been started.");
        int read = this.getHighSpeedVideoFpsRanges.read(byteBuffer, this.getHighResolutionOutputSizeshNQ4ISI);
        if (read > 0) {
            byteBuffer.limit(read);
            if (!this.getOutputSizeshNQ4ISI) {
                android.media.AudioTimestamp audioTimestamp = new android.media.AudioTimestamp();
                if (androidx.camera.video.internal.compat.Api24Impl.getTimestamp(this.getHighSpeedVideoFpsRanges, audioTimestamp, 0) == 0) {
                    j = androidx.camera.video.internal.audio.AudioUtils.computeInterpolatedTimeNs(this.getOutputMinFrameDurationlomOqCM.getCaptureSampleRate(), this.getOutputSizes, audioTimestamp);
                    if (java.lang.Math.abs(j - java.lang.System.nanoTime()) > getHighSpeedVideoFpsRangesFor) {
                        this.getOutputSizeshNQ4ISI = true;
                    }
                    if (j == -1) {
                        j = java.lang.System.nanoTime();
                    }
                    this.getOutputSizes += androidx.camera.video.internal.audio.AudioUtils.sizeToFrameCount(read, this.getHighSpeedVideoSizesFor);
                } else {
                    androidx.camera.core.Logger.w("AudioStreamImpl", "Unable to get audio timestamp");
                }
            }
            j = -1;
            if (j == -1) {
            }
            this.getOutputSizes += androidx.camera.video.internal.audio.AudioUtils.sizeToFrameCount(read, this.getHighSpeedVideoSizesFor);
        } else {
            j = 0;
        }
        return androidx.camera.video.internal.audio.AudioStream.PacketInfo.of(read, j);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws androidx.camera.video.internal.audio.AudioStream.AudioStreamException {
        android.media.AudioRecordingConfiguration activeRecordingConfiguration;
        androidx.core.util.Preconditions.checkState(!this.getInputSizeshNQ4ISI.get(), "AudioStream has been released.");
        if (this.getOutputFormats.getAndSet(true)) {
            return;
        }
        if (androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            android.media.AudioRecord audioRecord = this.getHighSpeedVideoFpsRanges;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new androidx.camera.video.internal.audio.AudioStream.AudioStreamException("Unable to initialize AudioRecord");
            }
        }
        this.getHighSpeedVideoFpsRanges.startRecording();
        if (this.getHighSpeedVideoFpsRanges.getRecordingState() != 3) {
            this.getOutputFormats.set(false);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to start AudioRecord with state: ");
            sb.append(this.getHighSpeedVideoFpsRanges.getRecordingState());
            throw new androidx.camera.video.internal.audio.AudioStream.AudioStreamException(sb.toString());
        }
        this.getOutputSizes = 0L;
        this.getOutputSizeshNQ4ISI = false;
        this.getOutputMinFrameDuration.set(null);
        getHighSpeedVideoFpsRanges(android.os.Build.VERSION.SDK_INT >= 29 && (activeRecordingConfiguration = androidx.camera.video.internal.compat.Api29Impl.getActiveRecordingConfiguration(this.getHighSpeedVideoFpsRanges)) != null && androidx.camera.video.internal.compat.Api29Impl.isClientSilenced(activeRecordingConfiguration));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        androidx.core.util.Preconditions.checkState(!this.getInputSizeshNQ4ISI.get(), "AudioStream has been released.");
        if (this.getOutputFormats.getAndSet(false)) {
            this.getHighSpeedVideoFpsRanges.stop();
            if (this.getHighSpeedVideoFpsRanges.getRecordingState() != 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to stop AudioRecord with state: ");
                sb.append(this.getHighSpeedVideoFpsRanges.getRecordingState());
                androidx.camera.core.Logger.w("AudioStreamImpl", sb.toString());
            }
            if (androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                this.getHighSpeedVideoFpsRanges.release();
                this.getHighSpeedVideoFpsRanges = getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM, null);
            }
        }
    }
}
