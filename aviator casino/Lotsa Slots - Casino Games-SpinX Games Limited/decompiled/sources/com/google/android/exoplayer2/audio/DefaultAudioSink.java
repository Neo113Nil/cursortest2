package com.google.android.exoplayer2.audio;

/* loaded from: classes3.dex */
public final class DefaultAudioSink implements com.google.android.exoplayer2.audio.AudioSink {
    private static final int AUDIO_TRACK_RETRY_DURATION_MS = 100;
    private static final int AUDIO_TRACK_SMALLER_BUFFER_RETRY_SIZE = 1000000;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_DISABLED = 3;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final java.lang.String TAG = "DefaultAudioSink";
    public static boolean failOnSpuriousAudioTimestamp = false;
    private static int pendingReleaseCount;
    private static java.util.concurrent.ExecutorService releaseExecutor;
    private static final java.lang.Object releaseExecutorLock = new java.lang.Object();
    private com.google.android.exoplayer2.audio.AudioProcessor[] activeAudioProcessors;
    private com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters afterDrainParameters;
    private com.google.android.exoplayer2.audio.AudioAttributes audioAttributes;
    private final com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities;
    private final com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener audioOffloadListener;
    private final com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain;
    private int audioSessionId;
    private android.media.AudioTrack audioTrack;
    private final com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private com.google.android.exoplayer2.PlaybackParameters audioTrackPlaybackParameters;
    private final com.google.android.exoplayer2.audio.AudioTrackPositionTracker audioTrackPositionTracker;
    private com.google.android.exoplayer2.audio.AuxEffectInfo auxEffectInfo;
    private java.nio.ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final com.google.android.exoplayer2.audio.ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration configuration;
    private int drainingAudioProcessorIndex;
    private final boolean enableAudioTrackPlaybackParams;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private final com.google.android.exoplayer2.audio.DefaultAudioSink.PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;
    private java.nio.ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;
    private com.google.android.exoplayer2.audio.AudioSink.Listener listener;
    private com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters;
    private final java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private final int offloadMode;
    private com.google.android.exoplayer2.audio.DefaultAudioSink.StreamEventCallbackV29 offloadStreamEventCallbackV29;
    private java.nio.ByteBuffer outputBuffer;
    private java.nio.ByteBuffer[] outputBuffers;
    private com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration pendingConfiguration;
    private com.google.android.exoplayer2.analytics.PlayerId playerId;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;
    private com.google.android.exoplayer2.audio.DefaultAudioSink.AudioDeviceInfoApi23 preferredDevice;
    private final com.google.android.exoplayer2.util.ConditionVariable releasingConditionVariable;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final com.google.android.exoplayer2.audio.AudioProcessor[] toFloatPcmAvailableAudioProcessors;
    private final com.google.android.exoplayer2.audio.AudioProcessor[] toIntPcmAvailableAudioProcessors;
    private final com.google.android.exoplayer2.audio.TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final com.google.android.exoplayer2.audio.DefaultAudioSink.PendingExceptionHolder<com.google.android.exoplayer2.audio.AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    @java.lang.Deprecated
    public interface AudioProcessorChain extends com.google.android.exoplayer2.audio.AudioProcessorChain {
    }

    public interface AudioTrackBufferSizeProvider {
        public static final com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider DEFAULT = new com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, double d);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public /* synthetic */ void setOutputStreamOffsetUs(long j) {
        com.google.android.exoplayer2.audio.AudioSink.CC.$default$setOutputStreamOffsetUs(this, j);
    }

    public static final class InvalidAudioTrackTimestampException extends java.lang.RuntimeException {
        private InvalidAudioTrackTimestampException(java.lang.String str) {
            super(str);
        }
    }

    public static class DefaultAudioProcessorChain implements com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain {
        private final com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessors;
        private final com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final com.google.android.exoplayer2.audio.SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(com.google.android.exoplayer2.audio.AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor(), new com.google.android.exoplayer2.audio.SonicAudioProcessor());
        }

        public DefaultAudioProcessorChain(com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr, com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, com.google.android.exoplayer2.audio.SonicAudioProcessor sonicAudioProcessor) {
            com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr2 = new com.google.android.exoplayer2.audio.AudioProcessor[audioProcessorArr.length + 2];
            this.audioProcessors = audioProcessorArr2;
            java.lang.System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public com.google.android.exoplayer2.audio.AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public com.google.android.exoplayer2.PlaybackParameters applyPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z) {
            this.silenceSkippingAudioProcessor.setEnabled(z);
            return z;
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public long getMediaDuration(long j) {
            return this.sonicAudioProcessor.getMediaDuration(j);
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }
    }

    public static final class Builder {
        com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener audioOffloadListener;
        private com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain;
        private boolean enableAudioTrackPlaybackParams;
        private boolean enableFloatOutput;
        private com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities = com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        private int offloadMode = 0;
        com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider = com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider.DEFAULT;

        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setAudioCapabilities(com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(audioCapabilities);
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setAudioProcessors(com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(audioProcessorArr);
            return setAudioProcessorChain(new com.google.android.exoplayer2.audio.DefaultAudioSink.DefaultAudioProcessorChain(audioProcessorArr));
        }

        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setAudioProcessorChain(com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(audioProcessorChain);
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setEnableFloatOutput(boolean z) {
            this.enableFloatOutput = z;
            return this;
        }

        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setEnableAudioTrackPlaybackParams(boolean z) {
            this.enableAudioTrackPlaybackParams = z;
            return this;
        }

        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setOffloadMode(int i) {
            this.offloadMode = i;
            return this;
        }

        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setAudioTrackBufferSizeProvider(com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.audioTrackBufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        public com.google.android.exoplayer2.audio.DefaultAudioSink.Builder setExperimentalAudioOffloadListener(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener audioOffloadListener) {
            this.audioOffloadListener = audioOffloadListener;
            return this;
        }

        public com.google.android.exoplayer2.audio.DefaultAudioSink build() {
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new com.google.android.exoplayer2.audio.DefaultAudioSink.DefaultAudioProcessorChain(new com.google.android.exoplayer2.audio.AudioProcessor[0]);
            }
            return new com.google.android.exoplayer2.audio.DefaultAudioSink(this);
        }
    }

    @java.lang.Deprecated
    public DefaultAudioSink(com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities, com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr) {
        this(new com.google.android.exoplayer2.audio.DefaultAudioSink.Builder().setAudioCapabilities((com.google.android.exoplayer2.audio.AudioCapabilities) com.google.common.base.MoreObjects.firstNonNull(audioCapabilities, com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr));
    }

    @java.lang.Deprecated
    public DefaultAudioSink(com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities, com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr, boolean z) {
        this(new com.google.android.exoplayer2.audio.DefaultAudioSink.Builder().setAudioCapabilities((com.google.android.exoplayer2.audio.AudioCapabilities) com.google.common.base.MoreObjects.firstNonNull(audioCapabilities, com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr).setEnableFloatOutput(z));
    }

    @java.lang.Deprecated
    public DefaultAudioSink(com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities, com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain audioProcessorChain, boolean z, boolean z2, int i) {
        this(new com.google.android.exoplayer2.audio.DefaultAudioSink.Builder().setAudioCapabilities((com.google.android.exoplayer2.audio.AudioCapabilities) com.google.common.base.MoreObjects.firstNonNull(audioCapabilities, com.google.android.exoplayer2.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessorChain(audioProcessorChain).setEnableFloatOutput(z).setEnableAudioTrackPlaybackParams(z2).setOffloadMode(i));
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.audioProcessorChain"})
    private DefaultAudioSink(com.google.android.exoplayer2.audio.DefaultAudioSink.Builder builder) {
        this.audioCapabilities = builder.audioCapabilities;
        com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain = builder.audioProcessorChain;
        this.audioProcessorChain = audioProcessorChain;
        this.enableFloatOutput = com.google.android.exoplayer2.util.Util.SDK_INT >= 21 && builder.enableFloatOutput;
        this.enableAudioTrackPlaybackParams = com.google.android.exoplayer2.util.Util.SDK_INT >= 23 && builder.enableAudioTrackPlaybackParams;
        this.offloadMode = com.google.android.exoplayer2.util.Util.SDK_INT >= 29 ? builder.offloadMode : 0;
        this.audioTrackBufferSizeProvider = builder.audioTrackBufferSizeProvider;
        com.google.android.exoplayer2.util.ConditionVariable conditionVariable = new com.google.android.exoplayer2.util.ConditionVariable(com.google.android.exoplayer2.util.Clock.DEFAULT);
        this.releasingConditionVariable = conditionVariable;
        conditionVariable.open();
        this.audioTrackPositionTracker = new com.google.android.exoplayer2.audio.AudioTrackPositionTracker(new com.google.android.exoplayer2.audio.DefaultAudioSink.PositionTrackerListener());
        com.google.android.exoplayer2.audio.ChannelMappingAudioProcessor channelMappingAudioProcessor = new com.google.android.exoplayer2.audio.ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        com.google.android.exoplayer2.audio.TrimmingAudioProcessor trimmingAudioProcessor = new com.google.android.exoplayer2.audio.TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Collections.addAll(arrayList, new com.google.android.exoplayer2.audio.ResamplingAudioProcessor(), channelMappingAudioProcessor, trimmingAudioProcessor);
        java.util.Collections.addAll(arrayList, audioProcessorChain.getAudioProcessors());
        this.toIntPcmAvailableAudioProcessors = (com.google.android.exoplayer2.audio.AudioProcessor[]) arrayList.toArray(new com.google.android.exoplayer2.audio.AudioProcessor[0]);
        this.toFloatPcmAvailableAudioProcessors = new com.google.android.exoplayer2.audio.AudioProcessor[]{new com.google.android.exoplayer2.audio.FloatResamplingAudioProcessor()};
        this.volume = 1.0f;
        this.audioAttributes = com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT;
        this.audioSessionId = 0;
        this.auxEffectInfo = new com.google.android.exoplayer2.audio.AuxEffectInfo(0, 0.0f);
        this.mediaPositionParameters = new com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters(com.google.android.exoplayer2.PlaybackParameters.DEFAULT, false, 0L, 0L);
        this.audioTrackPlaybackParameters = com.google.android.exoplayer2.PlaybackParameters.DEFAULT;
        this.drainingAudioProcessorIndex = -1;
        this.activeAudioProcessors = new com.google.android.exoplayer2.audio.AudioProcessor[0];
        this.outputBuffers = new java.nio.ByteBuffer[0];
        this.mediaPositionParametersCheckpoints = new java.util.ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new com.google.android.exoplayer2.audio.DefaultAudioSink.PendingExceptionHolder<>(100L);
        this.writeExceptionPendingExceptionHolder = new com.google.android.exoplayer2.audio.DefaultAudioSink.PendingExceptionHolder<>(100L);
        this.audioOffloadListener = builder.audioOffloadListener;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setListener(com.google.android.exoplayer2.audio.AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlayerId(com.google.android.exoplayer2.analytics.PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean supportsFormat(com.google.android.exoplayer2.Format format) {
        return getFormatSupport(format) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int getFormatSupport(com.google.android.exoplayer2.Format format) {
        if (!"audio/raw".equals(format.sampleMimeType)) {
            return ((this.offloadDisabledUntilNextConfiguration || !useOffloadedPlayback(format, this.audioAttributes)) && !this.audioCapabilities.isPassthroughPlaybackSupported(format)) ? 0 : 2;
        }
        if (com.google.android.exoplayer2.util.Util.isEncodingLinearPcm(format.pcmEncoding)) {
            return (format.pcmEncoding == 2 || (this.enableFloatOutput && format.pcmEncoding == 4)) ? 2 : 1;
        }
        com.google.android.exoplayer2.util.Log.w(TAG, "Invalid PCM encoding: " + format.pcmEncoding);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        if (!isAudioTrackInitialized() || this.startMediaTimeUsNeedsInit) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(java.lang.Math.min(this.audioTrackPositionTracker.getCurrentPositionUs(z), this.configuration.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void configure(com.google.android.exoplayer2.Format format, int i, int[] iArr) throws com.google.android.exoplayer2.audio.AudioSink.ConfigurationException {
        com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr;
        int i2;
        int intValue;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int bufferSizeInBytes;
        com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr2;
        int[] iArr2;
        if ("audio/raw".equals(format.sampleMimeType)) {
            com.google.android.exoplayer2.util.Assertions.checkArgument(com.google.android.exoplayer2.util.Util.isEncodingLinearPcm(format.pcmEncoding));
            int pcmFrameSize = com.google.android.exoplayer2.util.Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            if (shouldUseFloatOutput(format.pcmEncoding)) {
                audioProcessorArr2 = this.toFloatPcmAvailableAudioProcessors;
            } else {
                audioProcessorArr2 = this.toIntPcmAvailableAudioProcessors;
            }
            this.trimmingAudioProcessor.setTrimFrameCount(format.encoderDelay, format.encoderPadding);
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 21 && format.channelCount == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.channelMappingAudioProcessor.setChannelMap(iArr2);
            com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat audioFormat = new com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat(format.sampleRate, format.channelCount, format.pcmEncoding);
            for (com.google.android.exoplayer2.audio.AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat configure = audioProcessor.configure(audioFormat);
                    if (audioProcessor.isActive()) {
                        audioFormat = configure;
                    }
                } catch (com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException e) {
                    throw new com.google.android.exoplayer2.audio.AudioSink.ConfigurationException(e, format);
                }
            }
            int i9 = audioFormat.encoding;
            int i10 = audioFormat.sampleRate;
            int audioTrackChannelConfig = com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(audioFormat.channelCount);
            audioProcessorArr = audioProcessorArr2;
            i6 = com.google.android.exoplayer2.util.Util.getPcmFrameSize(i9, audioFormat.channelCount);
            i3 = i9;
            i2 = i10;
            intValue = audioTrackChannelConfig;
            i5 = pcmFrameSize;
            i4 = 0;
        } else {
            com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr3 = new com.google.android.exoplayer2.audio.AudioProcessor[0];
            int i11 = format.sampleRate;
            if (useOffloadedPlayback(format, this.audioAttributes)) {
                audioProcessorArr = audioProcessorArr3;
                i2 = i11;
                i3 = com.google.android.exoplayer2.util.MimeTypes.getEncoding((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(format.sampleMimeType), format.codecs);
                intValue = com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(format.channelCount);
                i4 = 1;
            } else {
                android.util.Pair<java.lang.Integer, java.lang.Integer> encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(format);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new com.google.android.exoplayer2.audio.AudioSink.ConfigurationException("Unable to configure passthrough for: " + format, format);
                }
                int intValue2 = ((java.lang.Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                audioProcessorArr = audioProcessorArr3;
                i2 = i11;
                intValue = ((java.lang.Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i3 = intValue2;
                i4 = 2;
            }
            i5 = -1;
            i6 = -1;
        }
        if (i3 == 0) {
            throw new com.google.android.exoplayer2.audio.AudioSink.ConfigurationException("Invalid output encoding (mode=" + i4 + ") for: " + format, format);
        }
        if (intValue == 0) {
            throw new com.google.android.exoplayer2.audio.AudioSink.ConfigurationException("Invalid output channel config (mode=" + i4 + ") for: " + format, format);
        }
        if (i != 0) {
            bufferSizeInBytes = i;
            i7 = i3;
        } else {
            i7 = i3;
            bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i2, intValue, i3), i3, i4, i6, i2, this.enableAudioTrackPlaybackParams ? 8.0d : 1.0d);
        }
        this.offloadDisabledUntilNextConfiguration = false;
        com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration configuration = new com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration(format, i5, i4, i6, i2, intValue, i7, bufferSizeInBytes, audioProcessorArr);
        if (isAudioTrackInitialized()) {
            this.pendingConfiguration = configuration;
        } else {
            this.configuration = configuration;
        }
    }

    private void setupAudioProcessors() {
        com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr = this.configuration.availableAudioProcessors;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.exoplayer2.audio.AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.activeAudioProcessors = (com.google.android.exoplayer2.audio.AudioProcessor[]) arrayList.toArray(new com.google.android.exoplayer2.audio.AudioProcessor[size]);
        this.outputBuffers = new java.nio.ByteBuffer[size];
        flushAudioProcessors();
    }

    private void flushAudioProcessors() {
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr = this.activeAudioProcessors;
            if (i >= audioProcessorArr.length) {
                return;
            }
            com.google.android.exoplayer2.audio.AudioProcessor audioProcessor = audioProcessorArr[i];
            audioProcessor.flush();
            this.outputBuffers[i] = audioProcessor.getOutput();
            i++;
        }
    }

    private boolean initializeAudioTrack() throws com.google.android.exoplayer2.audio.AudioSink.InitializationException {
        com.google.android.exoplayer2.analytics.PlayerId playerId;
        if (!this.releasingConditionVariable.isOpen()) {
            return false;
        }
        android.media.AudioTrack buildAudioTrackWithRetry = buildAudioTrackWithRetry();
        this.audioTrack = buildAudioTrackWithRetry;
        if (isOffloadedPlayback(buildAudioTrackWithRetry)) {
            registerStreamEventCallbackV29(this.audioTrack);
            if (this.offloadMode != 3) {
                this.audioTrack.setOffloadDelayPadding(this.configuration.inputFormat.encoderDelay, this.configuration.inputFormat.encoderPadding);
            }
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 31 && (playerId = this.playerId) != null) {
            com.google.android.exoplayer2.audio.DefaultAudioSink.Api31.setLogSessionIdOnAudioTrack(this.audioTrack, playerId);
        }
        this.audioSessionId = this.audioTrack.getAudioSessionId();
        this.audioTrackPositionTracker.setAudioTrack(this.audioTrack, this.configuration.outputMode == 2, this.configuration.outputEncoding, this.configuration.outputPcmFrameSize, this.configuration.bufferSize);
        setVolumeInternal();
        if (this.auxEffectInfo.effectId != 0) {
            this.audioTrack.attachAuxEffect(this.auxEffectInfo.effectId);
            this.audioTrack.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
        }
        if (this.preferredDevice != null && com.google.android.exoplayer2.util.Util.SDK_INT >= 23) {
            com.google.android.exoplayer2.audio.DefaultAudioSink.Api23.setPreferredDeviceOnAudioTrack(this.audioTrack, this.preferredDevice);
        }
        this.startMediaTimeUsNeedsInit = true;
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioTrackInitialized()) {
            this.audioTrackPositionTracker.start();
            this.audioTrack.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean handleBuffer(java.nio.ByteBuffer byteBuffer, long j, int i) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException, com.google.android.exoplayer2.audio.AudioSink.WriteException {
        java.nio.ByteBuffer byteBuffer2 = this.inputBuffer;
        com.google.android.exoplayer2.util.Assertions.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            if (!this.pendingConfiguration.canReuseAudioTrack(this.configuration)) {
                playPendingData();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            } else {
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                if (isOffloadedPlayback(this.audioTrack) && this.offloadMode != 3) {
                    if (this.audioTrack.getPlayState() == 3) {
                        this.audioTrack.setOffloadEndOfStream();
                    }
                    this.audioTrack.setOffloadDelayPadding(this.configuration.inputFormat.encoderDelay, this.configuration.inputFormat.encoderPadding);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
        }
        if (!isAudioTrackInitialized()) {
            try {
                if (!initializeAudioTrack()) {
                    return false;
                }
            } catch (com.google.android.exoplayer2.audio.AudioSink.InitializationException e) {
                if (e.isRecoverable) {
                    throw e;
                }
                this.initializationExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(e);
                return false;
            }
        }
        this.initializationExceptionPendingExceptionHolder.clear();
        if (this.startMediaTimeUsNeedsInit) {
            this.startMediaTimeUs = java.lang.Math.max(0L, j);
            this.startMediaTimeUsNeedsSync = false;
            this.startMediaTimeUsNeedsInit = false;
            if (this.enableAudioTrackPlaybackParams && com.google.android.exoplayer2.util.Util.SDK_INT >= 23) {
                setAudioTrackPlaybackParametersV23(this.audioTrackPlaybackParameters);
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
            if (this.playing) {
                play();
            }
        }
        if (!this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
            return false;
        }
        if (this.inputBuffer == null) {
            com.google.android.exoplayer2.util.Assertions.checkArgument(byteBuffer.order() == java.nio.ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.configuration.outputMode != 0 && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(this.configuration.outputEncoding, byteBuffer);
                this.framesPerEncodedSample = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.afterDrainParameters != null) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                this.afterDrainParameters = null;
            }
            long inputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
            if (!this.startMediaTimeUsNeedsSync && java.lang.Math.abs(inputFramesToDurationUs - j) > 200000) {
                this.listener.onAudioSinkError(new com.google.android.exoplayer2.audio.AudioSink.UnexpectedDiscontinuityException(j, inputFramesToDurationUs));
                this.startMediaTimeUsNeedsSync = true;
            }
            if (this.startMediaTimeUsNeedsSync) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                long j2 = j - inputFramesToDurationUs;
                this.startMediaTimeUs += j2;
                this.startMediaTimeUsNeedsSync = false;
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                com.google.android.exoplayer2.audio.AudioSink.Listener listener = this.listener;
                if (listener != null && j2 != 0) {
                    listener.onPositionDiscontinuity();
                }
            }
            if (this.configuration.outputMode == 0) {
                this.submittedPcmBytes += byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames += this.framesPerEncodedSample * i;
            }
            this.inputBuffer = byteBuffer;
            this.inputBufferAccessUnitCount = i;
        }
        processBuffers(j);
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            this.inputBufferAccessUnitCount = 0;
            return true;
        }
        if (!this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
            return false;
        }
        com.google.android.exoplayer2.util.Log.w(TAG, "Resetting stalled audio track");
        flush();
        return true;
    }

    private android.media.AudioTrack buildAudioTrackWithRetry() throws com.google.android.exoplayer2.audio.AudioSink.InitializationException {
        try {
            return buildAudioTrack((com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.configuration));
        } catch (com.google.android.exoplayer2.audio.AudioSink.InitializationException e) {
            if (this.configuration.bufferSize > 1000000) {
                com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration copyWithBufferSize = this.configuration.copyWithBufferSize(1000000);
                try {
                    android.media.AudioTrack buildAudioTrack = buildAudioTrack(copyWithBufferSize);
                    this.configuration = copyWithBufferSize;
                    return buildAudioTrack;
                } catch (com.google.android.exoplayer2.audio.AudioSink.InitializationException e2) {
                    e.addSuppressed(e2);
                    maybeDisableOffload();
                    throw e;
                }
            }
            maybeDisableOffload();
            throw e;
        }
    }

    private android.media.AudioTrack buildAudioTrack(com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration configuration) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException {
        try {
            android.media.AudioTrack buildAudioTrack = configuration.buildAudioTrack(this.tunneling, this.audioAttributes, this.audioSessionId);
            com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener audioOffloadListener = this.audioOffloadListener;
            if (audioOffloadListener != null) {
                audioOffloadListener.onExperimentalOffloadedPlayback(isOffloadedPlayback(buildAudioTrack));
            }
            return buildAudioTrack;
        } catch (com.google.android.exoplayer2.audio.AudioSink.InitializationException e) {
            com.google.android.exoplayer2.audio.AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSinkError(e);
            }
            throw e;
        }
    }

    private void registerStreamEventCallbackV29(android.media.AudioTrack audioTrack) {
        if (this.offloadStreamEventCallbackV29 == null) {
            this.offloadStreamEventCallbackV29 = new com.google.android.exoplayer2.audio.DefaultAudioSink.StreamEventCallbackV29();
        }
        this.offloadStreamEventCallbackV29.register(audioTrack);
    }

    private void processBuffers(long j) throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        java.nio.ByteBuffer byteBuffer;
        int length = this.activeAudioProcessors.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.outputBuffers[i - 1];
            } else {
                byteBuffer = this.inputBuffer;
                if (byteBuffer == null) {
                    byteBuffer = com.google.android.exoplayer2.audio.AudioProcessor.EMPTY_BUFFER;
                }
            }
            if (i == length) {
                writeBuffer(byteBuffer, j);
            } else {
                com.google.android.exoplayer2.audio.AudioProcessor audioProcessor = this.activeAudioProcessors[i];
                if (i > this.drainingAudioProcessorIndex) {
                    audioProcessor.queueInput(byteBuffer);
                }
                java.nio.ByteBuffer output = audioProcessor.getOutput();
                this.outputBuffers[i] = output;
                if (output.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    private void writeBuffer(java.nio.ByteBuffer byteBuffer, long j) throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        int writeNonBlockingV21;
        com.google.android.exoplayer2.audio.AudioSink.Listener listener;
        if (byteBuffer.hasRemaining()) {
            java.nio.ByteBuffer byteBuffer2 = this.outputBuffer;
            if (byteBuffer2 != null) {
                com.google.android.exoplayer2.util.Assertions.checkArgument(byteBuffer2 == byteBuffer);
            } else {
                this.outputBuffer = byteBuffer;
                if (com.google.android.exoplayer2.util.Util.SDK_INT < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.preV21OutputBuffer;
                    if (bArr == null || bArr.length < remaining) {
                        this.preV21OutputBuffer = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.preV21OutputBuffer, 0, remaining);
                    byteBuffer.position(position);
                    this.preV21OutputBufferOffset = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 21) {
                int availableBufferSize = this.audioTrackPositionTracker.getAvailableBufferSize(this.writtenPcmBytes);
                if (availableBufferSize > 0) {
                    writeNonBlockingV21 = this.audioTrack.write(this.preV21OutputBuffer, this.preV21OutputBufferOffset, java.lang.Math.min(remaining2, availableBufferSize));
                    if (writeNonBlockingV21 > 0) {
                        this.preV21OutputBufferOffset += writeNonBlockingV21;
                        byteBuffer.position(byteBuffer.position() + writeNonBlockingV21);
                    }
                } else {
                    writeNonBlockingV21 = 0;
                }
            } else if (this.tunneling) {
                com.google.android.exoplayer2.util.Assertions.checkState(j != -9223372036854775807L);
                writeNonBlockingV21 = writeNonBlockingWithAvSyncV21(this.audioTrack, byteBuffer, remaining2, j);
            } else {
                writeNonBlockingV21 = writeNonBlockingV21(this.audioTrack, byteBuffer, remaining2);
            }
            this.lastFeedElapsedRealtimeMs = android.os.SystemClock.elapsedRealtime();
            if (writeNonBlockingV21 < 0) {
                com.google.android.exoplayer2.audio.AudioSink.WriteException writeException = new com.google.android.exoplayer2.audio.AudioSink.WriteException(writeNonBlockingV21, this.configuration.inputFormat, isAudioTrackDeadObject(writeNonBlockingV21) && this.writtenEncodedFrames > 0);
                com.google.android.exoplayer2.audio.AudioSink.Listener listener2 = this.listener;
                if (listener2 != null) {
                    listener2.onAudioSinkError(writeException);
                }
                if (writeException.isRecoverable) {
                    throw writeException;
                }
                this.writeExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(writeException);
                return;
            }
            this.writeExceptionPendingExceptionHolder.clear();
            if (isOffloadedPlayback(this.audioTrack)) {
                if (this.writtenEncodedFrames > 0) {
                    this.isWaitingForOffloadEndOfStreamHandled = false;
                }
                if (this.playing && (listener = this.listener) != null && writeNonBlockingV21 < remaining2 && !this.isWaitingForOffloadEndOfStreamHandled) {
                    listener.onOffloadBufferFull();
                }
            }
            if (this.configuration.outputMode == 0) {
                this.writtenPcmBytes += writeNonBlockingV21;
            }
            if (writeNonBlockingV21 == remaining2) {
                if (this.configuration.outputMode != 0) {
                    com.google.android.exoplayer2.util.Assertions.checkState(byteBuffer == this.inputBuffer);
                    this.writtenEncodedFrames += this.framesPerEncodedSample * this.inputBufferAccessUnitCount;
                }
                this.outputBuffer = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        if (!this.handledEndOfStream && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    private void maybeDisableOffload() {
        if (this.configuration.outputModeIsOffload()) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private static boolean isAudioTrackDeadObject(int i) {
        return (com.google.android.exoplayer2.util.Util.SDK_INT >= 24 && i == -6) || i == ERROR_NATIVE_DEAD_OBJECT;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean drainToEndOfStream() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        boolean z;
        int i;
        com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr;
        if (this.drainingAudioProcessorIndex == -1) {
            this.drainingAudioProcessorIndex = 0;
            z = true;
            i = this.drainingAudioProcessorIndex;
            audioProcessorArr = this.activeAudioProcessors;
            if (i < audioProcessorArr.length) {
                com.google.android.exoplayer2.audio.AudioProcessor audioProcessor = audioProcessorArr[i];
                if (z) {
                    audioProcessor.queueEndOfStream();
                }
                processBuffers(-9223372036854775807L);
                if (!audioProcessor.isEnded()) {
                    return false;
                }
                this.drainingAudioProcessorIndex++;
                z = true;
                i = this.drainingAudioProcessorIndex;
                audioProcessorArr = this.activeAudioProcessors;
                if (i < audioProcessorArr.length) {
                    java.nio.ByteBuffer byteBuffer = this.outputBuffer;
                    if (byteBuffer != null) {
                        writeBuffer(byteBuffer, -9223372036854775807L);
                        if (this.outputBuffer != null) {
                            return false;
                        }
                    }
                    this.drainingAudioProcessorIndex = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.drainingAudioProcessorIndex;
            audioProcessorArr = this.activeAudioProcessors;
            if (i < audioProcessorArr.length) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
        return !isAudioTrackInitialized() || (this.handledEndOfStream && !hasPendingData());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
        return isAudioTrackInitialized() && this.audioTrackPositionTracker.hasPendingData(getWrittenFrames());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
        com.google.android.exoplayer2.PlaybackParameters playbackParameters2 = new com.google.android.exoplayer2.PlaybackParameters(com.google.android.exoplayer2.util.Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), com.google.android.exoplayer2.util.Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
        if (this.enableAudioTrackPlaybackParams && com.google.android.exoplayer2.util.Util.SDK_INT >= 23) {
            setAudioTrackPlaybackParametersV23(playbackParameters2);
        } else {
            setAudioProcessorPlaybackParametersAndSkipSilence(playbackParameters2, getSkipSilenceEnabled());
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
        if (this.enableAudioTrackPlaybackParams) {
            return this.audioTrackPlaybackParameters;
        }
        return getAudioProcessorPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        setAudioProcessorPlaybackParametersAndSkipSilence(getAudioProcessorPlaybackParameters(), z);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return getMediaPositionParameters().skipSilence;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int i) {
        if (this.audioSessionId != i) {
            this.audioSessionId = i;
            this.externalAudioSessionIdProvided = i != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i = auxEffectInfo.effectId;
        float f = auxEffectInfo.sendLevel;
        if (this.audioTrack != null) {
            if (this.auxEffectInfo.effectId != i) {
                this.audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.audioTrack.setAuxEffectSendLevel(f);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        com.google.android.exoplayer2.audio.DefaultAudioSink.AudioDeviceInfoApi23 audioDeviceInfoApi23 = audioDeviceInfo == null ? null : new com.google.android.exoplayer2.audio.DefaultAudioSink.AudioDeviceInfoApi23(audioDeviceInfo);
        this.preferredDevice = audioDeviceInfoApi23;
        android.media.AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            com.google.android.exoplayer2.audio.DefaultAudioSink.Api23.setPreferredDeviceOnAudioTrack(audioTrack, audioDeviceInfoApi23);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21() {
        com.google.android.exoplayer2.util.Assertions.checkState(com.google.android.exoplayer2.util.Util.SDK_INT >= 21);
        com.google.android.exoplayer2.util.Assertions.checkState(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f) {
        if (this.volume != f) {
            this.volume = f;
            setVolumeInternal();
        }
    }

    private void setVolumeInternal() {
        if (isAudioTrackInitialized()) {
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21) {
                setVolumeInternalV21(this.audioTrack, this.volume);
            } else {
                setVolumeInternalV3(this.audioTrack, this.volume);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioTrackInitialized() && this.audioTrackPositionTracker.pause()) {
            this.audioTrack.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            if (isOffloadedPlayback(this.audioTrack)) {
                ((com.google.android.exoplayer2.audio.DefaultAudioSink.StreamEventCallbackV29) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.offloadStreamEventCallbackV29)).unregister(this.audioTrack);
            }
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 21 && !this.externalAudioSessionIdProvided) {
                this.audioSessionId = 0;
            }
            com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration configuration = this.pendingConfiguration;
            if (configuration != null) {
                this.configuration = configuration;
                this.pendingConfiguration = null;
            }
            this.audioTrackPositionTracker.reset();
            releaseAudioTrackAsync(this.audioTrack, this.releasingConditionVariable);
            this.audioTrack = null;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void experimentalFlushWithoutAudioTrackRelease() {
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 25) {
            flush();
            return;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            this.audioTrack.flush();
            this.audioTrackPositionTracker.reset();
            this.audioTrackPositionTracker.setAudioTrack(this.audioTrack, this.configuration.outputMode == 2, this.configuration.outputEncoding, this.configuration.outputPcmFrameSize, this.configuration.bufferSize);
            this.startMediaTimeUsNeedsInit = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        for (com.google.android.exoplayer2.audio.AudioProcessor audioProcessor : this.toIntPcmAvailableAudioProcessors) {
            audioProcessor.reset();
        }
        for (com.google.android.exoplayer2.audio.AudioProcessor audioProcessor2 : this.toFloatPcmAvailableAudioProcessors) {
            audioProcessor2.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters(getAudioProcessorPlaybackParameters(), getSkipSilenceEnabled(), 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioTrack = false;
        this.handledEndOfStream = false;
        this.drainingAudioProcessorIndex = -1;
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.trimmingAudioProcessor.resetTrimmedFrameCount();
        flushAudioProcessors();
    }

    private void setAudioTrackPlaybackParametersV23(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
        if (isAudioTrackInitialized()) {
            try {
                this.audioTrack.setPlaybackParams(new android.media.PlaybackParams().allowDefaults().setSpeed(playbackParameters.speed).setPitch(playbackParameters.pitch).setAudioFallbackMode(2));
            } catch (java.lang.IllegalArgumentException e) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Failed to set playback params", e);
            }
            playbackParameters = new com.google.android.exoplayer2.PlaybackParameters(this.audioTrack.getPlaybackParams().getSpeed(), this.audioTrack.getPlaybackParams().getPitch());
            this.audioTrackPositionTracker.setAudioTrackPlaybackSpeed(playbackParameters.speed);
        }
        this.audioTrackPlaybackParameters = playbackParameters;
    }

    private void setAudioProcessorPlaybackParametersAndSkipSilence(com.google.android.exoplayer2.PlaybackParameters playbackParameters, boolean z) {
        com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters = getMediaPositionParameters();
        if (playbackParameters.equals(mediaPositionParameters.playbackParameters) && z == mediaPositionParameters.skipSilence) {
            return;
        }
        com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters2 = new com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters(playbackParameters, z, -9223372036854775807L, -9223372036854775807L);
        if (isAudioTrackInitialized()) {
            this.afterDrainParameters = mediaPositionParameters2;
        } else {
            this.mediaPositionParameters = mediaPositionParameters2;
        }
    }

    private com.google.android.exoplayer2.PlaybackParameters getAudioProcessorPlaybackParameters() {
        return getMediaPositionParameters().playbackParameters;
    }

    private com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters getMediaPositionParameters() {
        com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters = this.afterDrainParameters;
        if (mediaPositionParameters != null) {
            return mediaPositionParameters;
        }
        if (!this.mediaPositionParametersCheckpoints.isEmpty()) {
            return this.mediaPositionParametersCheckpoints.getLast();
        }
        return this.mediaPositionParameters;
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j) {
        com.google.android.exoplayer2.PlaybackParameters playbackParameters;
        if (shouldApplyAudioProcessorPlaybackParameters()) {
            playbackParameters = this.audioProcessorChain.applyPlaybackParameters(getAudioProcessorPlaybackParameters());
        } else {
            playbackParameters = com.google.android.exoplayer2.PlaybackParameters.DEFAULT;
        }
        com.google.android.exoplayer2.PlaybackParameters playbackParameters2 = playbackParameters;
        boolean applySkipSilenceEnabled = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applySkipSilenceEnabled(getSkipSilenceEnabled()) : false;
        this.mediaPositionParametersCheckpoints.add(new com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters(playbackParameters2, applySkipSilenceEnabled, java.lang.Math.max(0L, j), this.configuration.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors();
        com.google.android.exoplayer2.audio.AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(applySkipSilenceEnabled);
        }
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        return (this.tunneling || !"audio/raw".equals(this.configuration.inputFormat.sampleMimeType) || shouldUseFloatOutput(this.configuration.inputFormat.pcmEncoding)) ? false : true;
    }

    private boolean shouldUseFloatOutput(int i) {
        return this.enableFloatOutput && com.google.android.exoplayer2.util.Util.isEncodingHighResolutionPcm(i);
    }

    private long applyMediaPositionParameters(long j) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j >= this.mediaPositionParametersCheckpoints.getFirst().audioTrackPositionUs) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        long j2 = j - this.mediaPositionParameters.audioTrackPositionUs;
        if (this.mediaPositionParameters.playbackParameters.equals(com.google.android.exoplayer2.PlaybackParameters.DEFAULT)) {
            return this.mediaPositionParameters.mediaTimeUs + j2;
        }
        if (this.mediaPositionParametersCheckpoints.isEmpty()) {
            return this.mediaPositionParameters.mediaTimeUs + this.audioProcessorChain.getMediaDuration(j2);
        }
        com.google.android.exoplayer2.audio.DefaultAudioSink.MediaPositionParameters first = this.mediaPositionParametersCheckpoints.getFirst();
        return first.mediaTimeUs - com.google.android.exoplayer2.util.Util.getMediaDurationForPlayoutDuration(first.audioTrackPositionUs - j, this.mediaPositionParameters.playbackParameters.speed);
    }

    private long applySkipping(long j) {
        return j + this.configuration.framesToDurationUs(this.audioProcessorChain.getSkippedOutputFrameCount());
    }

    private boolean isAudioTrackInitialized() {
        return this.audioTrack != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        if (this.configuration.outputMode == 0) {
            return this.submittedPcmBytes / this.configuration.inputPcmFrameSize;
        }
        return this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        if (this.configuration.outputMode == 0) {
            return this.writtenPcmBytes / this.configuration.outputPcmFrameSize;
        }
        return this.writtenEncodedFrames;
    }

    private boolean useOffloadedPlayback(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
        int encoding;
        int audioTrackChannelConfig;
        int offloadedPlaybackSupport;
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 29 || this.offloadMode == 0 || (encoding = com.google.android.exoplayer2.util.MimeTypes.getEncoding((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(format.sampleMimeType), format.codecs)) == 0 || (audioTrackChannelConfig = com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(format.channelCount)) == 0 || (offloadedPlaybackSupport = getOffloadedPlaybackSupport(getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding), audioAttributes.getAudioAttributesV21().audioAttributes)) == 0) {
            return false;
        }
        if (offloadedPlaybackSupport == 1) {
            return ((format.encoderDelay != 0 || format.encoderPadding != 0) && (this.offloadMode == 1)) ? false : true;
        }
        if (offloadedPlaybackSupport == 2) {
            return true;
        }
        throw new java.lang.IllegalStateException();
    }

    private int getOffloadedPlaybackSupport(android.media.AudioFormat audioFormat, android.media.AudioAttributes audioAttributes) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 31) {
            return android.media.AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (android.media.AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (com.google.android.exoplayer2.util.Util.SDK_INT == 30 && com.google.android.exoplayer2.util.Util.MODEL.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    private static boolean isOffloadedPlayback(android.media.AudioTrack audioTrack) {
        return com.google.android.exoplayer2.util.Util.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private static int getFramesPerEncodedSample(int i, java.nio.ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return com.google.android.exoplayer2.audio.Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
            case 7:
            case 8:
                return com.google.android.exoplayer2.audio.DtsUtil.parseDtsAudioSampleCount(byteBuffer);
            case 9:
                int parseMpegAudioFrameSampleCount = com.google.android.exoplayer2.audio.MpegAudioUtil.parseMpegAudioFrameSampleCount(com.google.android.exoplayer2.util.Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                if (parseMpegAudioFrameSampleCount != -1) {
                    return parseMpegAudioFrameSampleCount;
                }
                throw new java.lang.IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new java.lang.IllegalStateException("Unexpected audio encoding: " + i);
            case 14:
                int findTrueHdSyncframeOffset = com.google.android.exoplayer2.audio.Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                if (findTrueHdSyncframeOffset == -1) {
                    return 0;
                }
                return com.google.android.exoplayer2.audio.Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, findTrueHdSyncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return com.google.android.exoplayer2.audio.Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
        }
    }

    private static int writeNonBlockingV21(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int writeNonBlockingWithAvSyncV21(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i, long j) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.avSyncHeader == null) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(16);
            this.avSyncHeader = allocate;
            allocate.order(java.nio.ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i);
            this.avSyncHeader.putLong(8, j * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i;
        }
        int remaining = this.avSyncHeader.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.avSyncHeader, remaining, 1);
            if (write < 0) {
                this.bytesUntilNextAvSync = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int writeNonBlockingV21 = writeNonBlockingV21(audioTrack, byteBuffer, i);
        if (writeNonBlockingV21 < 0) {
            this.bytesUntilNextAvSync = 0;
            return writeNonBlockingV21;
        }
        this.bytesUntilNextAvSync -= writeNonBlockingV21;
        return writeNonBlockingV21;
    }

    private static void setVolumeInternalV21(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    private static void setVolumeInternalV3(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    private void playPendingData() {
        if (this.stoppedAudioTrack) {
            return;
        }
        this.stoppedAudioTrack = true;
        this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    private static void releaseAudioTrackAsync(final android.media.AudioTrack audioTrack, final com.google.android.exoplayer2.util.ConditionVariable conditionVariable) {
        conditionVariable.close();
        synchronized (releaseExecutorLock) {
            if (releaseExecutor == null) {
                releaseExecutor = com.google.android.exoplayer2.util.Util.newSingleThreadExecutor("ExoPlayer:AudioTrackReleaseThread");
            }
            pendingReleaseCount++;
            releaseExecutor.execute(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.audio.DefaultAudioSink$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.audio.DefaultAudioSink.lambda$releaseAudioTrackAsync$0(audioTrack, conditionVariable);
                }
            });
        }
    }

    static /* synthetic */ void lambda$releaseAudioTrackAsync$0(android.media.AudioTrack audioTrack, com.google.android.exoplayer2.util.ConditionVariable conditionVariable) {
        try {
            audioTrack.flush();
            audioTrack.release();
            conditionVariable.open();
            synchronized (releaseExecutorLock) {
                int i = pendingReleaseCount - 1;
                pendingReleaseCount = i;
                if (i == 0) {
                    releaseExecutor.shutdown();
                    releaseExecutor = null;
                }
            }
        } catch (java.lang.Throwable th) {
            conditionVariable.open();
            synchronized (releaseExecutorLock) {
                int i2 = pendingReleaseCount - 1;
                pendingReleaseCount = i2;
                if (i2 == 0) {
                    releaseExecutor.shutdown();
                    releaseExecutor = null;
                }
                throw th;
            }
        }
    }

    private final class StreamEventCallbackV29 {
        private final android.media.AudioTrack.StreamEventCallback callback;
        private final android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper());

        public StreamEventCallbackV29() {
            this.callback = new android.media.AudioTrack.StreamEventCallback() { // from class: com.google.android.exoplayer2.audio.DefaultAudioSink.StreamEventCallbackV29.1
                @Override // android.media.AudioTrack.StreamEventCallback
                public void onDataRequest(android.media.AudioTrack audioTrack, int i) {
                    if (audioTrack.equals(com.google.android.exoplayer2.audio.DefaultAudioSink.this.audioTrack) && com.google.android.exoplayer2.audio.DefaultAudioSink.this.listener != null && com.google.android.exoplayer2.audio.DefaultAudioSink.this.playing) {
                        com.google.android.exoplayer2.audio.DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public void onTearDown(android.media.AudioTrack audioTrack) {
                    if (audioTrack.equals(com.google.android.exoplayer2.audio.DefaultAudioSink.this.audioTrack) && com.google.android.exoplayer2.audio.DefaultAudioSink.this.listener != null && com.google.android.exoplayer2.audio.DefaultAudioSink.this.playing) {
                        com.google.android.exoplayer2.audio.DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }
            };
        }

        public void register(android.media.AudioTrack audioTrack) {
            android.os.Handler handler = this.handler;
            java.util.Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0(handler), this.callback);
        }

        public void unregister(android.media.AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.callback);
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    private static final class MediaPositionParameters {
        public final long audioTrackPositionUs;
        public final long mediaTimeUs;
        public final com.google.android.exoplayer2.PlaybackParameters playbackParameters;
        public final boolean skipSilence;

        private MediaPositionParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters, boolean z, long j, long j2) {
            this.playbackParameters = playbackParameters;
            this.skipSilence = z;
            this.mediaTimeUs = j;
            this.audioTrackPositionUs = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.media.AudioFormat getAudioFormat(int i, int i2, int i3) {
        return new android.media.AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    private static int getAudioTrackMinBufferSize(int i, int i2, int i3) {
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(i, i2, i3);
        com.google.android.exoplayer2.util.Assertions.checkState(minBufferSize != -2);
        return minBufferSize;
    }

    private final class PositionTrackerListener implements com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j, long j2, long j3, long j4) {
            java.lang.String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + com.google.android.exoplayer2.audio.DefaultAudioSink.this.getSubmittedFrames() + ", " + com.google.android.exoplayer2.audio.DefaultAudioSink.this.getWrittenFrames();
            if (com.google.android.exoplayer2.audio.DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new com.google.android.exoplayer2.audio.DefaultAudioSink.InvalidAudioTrackTimestampException(str);
            }
            com.google.android.exoplayer2.util.Log.w(com.google.android.exoplayer2.audio.DefaultAudioSink.TAG, str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j, long j2, long j3, long j4) {
            java.lang.String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + com.google.android.exoplayer2.audio.DefaultAudioSink.this.getSubmittedFrames() + ", " + com.google.android.exoplayer2.audio.DefaultAudioSink.this.getWrittenFrames();
            if (com.google.android.exoplayer2.audio.DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new com.google.android.exoplayer2.audio.DefaultAudioSink.InvalidAudioTrackTimestampException(str);
            }
            com.google.android.exoplayer2.util.Log.w(com.google.android.exoplayer2.audio.DefaultAudioSink.TAG, str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j) {
            com.google.android.exoplayer2.util.Log.w(com.google.android.exoplayer2.audio.DefaultAudioSink.TAG, "Ignoring impossibly large audio latency: " + j);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long j) {
            if (com.google.android.exoplayer2.audio.DefaultAudioSink.this.listener != null) {
                com.google.android.exoplayer2.audio.DefaultAudioSink.this.listener.onPositionAdvancing(j);
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int i, long j) {
            if (com.google.android.exoplayer2.audio.DefaultAudioSink.this.listener != null) {
                com.google.android.exoplayer2.audio.DefaultAudioSink.this.listener.onUnderrun(i, j, android.os.SystemClock.elapsedRealtime() - com.google.android.exoplayer2.audio.DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    private static final class Configuration {
        public final com.google.android.exoplayer2.audio.AudioProcessor[] availableAudioProcessors;
        public final int bufferSize;
        public final com.google.android.exoplayer2.Format inputFormat;
        public final int inputPcmFrameSize;
        public final int outputChannelConfig;
        public final int outputEncoding;
        public final int outputMode;
        public final int outputPcmFrameSize;
        public final int outputSampleRate;

        public Configuration(com.google.android.exoplayer2.Format format, int i, int i2, int i3, int i4, int i5, int i6, int i7, com.google.android.exoplayer2.audio.AudioProcessor[] audioProcessorArr) {
            this.inputFormat = format;
            this.inputPcmFrameSize = i;
            this.outputMode = i2;
            this.outputPcmFrameSize = i3;
            this.outputSampleRate = i4;
            this.outputChannelConfig = i5;
            this.outputEncoding = i6;
            this.bufferSize = i7;
            this.availableAudioProcessors = audioProcessorArr;
        }

        public com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration copyWithBufferSize(int i) {
            return new com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration(this.inputFormat, this.inputPcmFrameSize, this.outputMode, this.outputPcmFrameSize, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, i, this.availableAudioProcessors);
        }

        public boolean canReuseAudioTrack(com.google.android.exoplayer2.audio.DefaultAudioSink.Configuration configuration) {
            return configuration.outputMode == this.outputMode && configuration.outputEncoding == this.outputEncoding && configuration.outputSampleRate == this.outputSampleRate && configuration.outputChannelConfig == this.outputChannelConfig && configuration.outputPcmFrameSize == this.outputPcmFrameSize;
        }

        public long inputFramesToDurationUs(long j) {
            return (j * 1000000) / this.inputFormat.sampleRate;
        }

        public long framesToDurationUs(long j) {
            return (j * 1000000) / this.outputSampleRate;
        }

        public android.media.AudioTrack buildAudioTrack(boolean z, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, int i) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException {
            try {
                android.media.AudioTrack createAudioTrack = createAudioTrack(z, audioAttributes, i);
                int state = createAudioTrack.getState();
                if (state == 1) {
                    return createAudioTrack;
                }
                try {
                    createAudioTrack.release();
                } catch (java.lang.Exception unused) {
                }
                throw new com.google.android.exoplayer2.audio.AudioSink.InitializationException(state, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), null);
            } catch (java.lang.IllegalArgumentException | java.lang.UnsupportedOperationException e) {
                throw new com.google.android.exoplayer2.audio.AudioSink.InitializationException(0, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), e);
            }
        }

        private android.media.AudioTrack createAudioTrack(boolean z, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, int i) {
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 29) {
                return createAudioTrackV29(z, audioAttributes, i);
            }
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21) {
                return createAudioTrackV21(z, audioAttributes, i);
            }
            return createAudioTrackV9(audioAttributes, i);
        }

        private android.media.AudioTrack createAudioTrackV29(boolean z, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, int i) {
            return new android.media.AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributesV21(audioAttributes, z)).setAudioFormat(com.google.android.exoplayer2.audio.DefaultAudioSink.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding)).setTransferMode(1).setBufferSizeInBytes(this.bufferSize).setSessionId(i).setOffloadedPlayback(this.outputMode == 1).build();
        }

        private android.media.AudioTrack createAudioTrackV21(boolean z, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, int i) {
            return new android.media.AudioTrack(getAudioTrackAttributesV21(audioAttributes, z), com.google.android.exoplayer2.audio.DefaultAudioSink.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding), this.bufferSize, 1, i);
        }

        private android.media.AudioTrack createAudioTrackV9(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, int i) {
            int streamTypeForAudioUsage = com.google.android.exoplayer2.util.Util.getStreamTypeForAudioUsage(audioAttributes.usage);
            if (i == 0) {
                return new android.media.AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1);
            }
            return new android.media.AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1, i);
        }

        private static android.media.AudioAttributes getAudioTrackAttributesV21(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, boolean z) {
            if (z) {
                return getAudioTrackTunnelingAttributesV21();
            }
            return audioAttributes.getAudioAttributesV21().audioAttributes;
        }

        private static android.media.AudioAttributes getAudioTrackTunnelingAttributesV21() {
            return new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public boolean outputModeIsOffload() {
            return this.outputMode == 1;
        }
    }

    private static final class PendingExceptionHolder<T extends java.lang.Exception> {
        private T pendingException;
        private long throwDeadlineMs;
        private final long throwDelayMs;

        public PendingExceptionHolder(long j) {
            this.throwDelayMs = j;
        }

        public void throwExceptionIfDeadlineIsReached(T t) throws java.lang.Exception {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (this.pendingException == null) {
                this.pendingException = t;
                this.throwDeadlineMs = this.throwDelayMs + elapsedRealtime;
            }
            if (elapsedRealtime >= this.throwDeadlineMs) {
                T t2 = this.pendingException;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.pendingException;
                clear();
                throw t3;
            }
        }

        public void clear() {
            this.pendingException = null;
        }
    }

    private static final class AudioDeviceInfoApi23 {
        public final android.media.AudioDeviceInfo audioDeviceInfo;

        public AudioDeviceInfoApi23(android.media.AudioDeviceInfo audioDeviceInfo) {
            this.audioDeviceInfo = audioDeviceInfo;
        }
    }

    private static final class Api23 {
        private Api23() {
        }

        public static void setPreferredDeviceOnAudioTrack(android.media.AudioTrack audioTrack, com.google.android.exoplayer2.audio.DefaultAudioSink.AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            audioTrack.setPreferredDevice(audioDeviceInfoApi23 == null ? null : audioDeviceInfoApi23.audioDeviceInfo);
        }
    }

    private static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdOnAudioTrack(android.media.AudioTrack audioTrack, com.google.android.exoplayer2.analytics.PlayerId playerId) {
            android.media.metrics.LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId);
        }
    }
}
