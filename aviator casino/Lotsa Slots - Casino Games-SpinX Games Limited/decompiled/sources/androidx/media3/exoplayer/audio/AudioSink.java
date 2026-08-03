package androidx.media3.exoplayer.audio;

/* loaded from: classes2.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int SINK_FORMAT_SUPPORTED_DIRECTLY = 2;
    public static final int SINK_FORMAT_SUPPORTED_WITH_TRANSCODING = 1;
    public static final int SINK_FORMAT_UNSUPPORTED = 0;

    public interface Listener {

        /* renamed from: androidx.media3.exoplayer.audio.AudioSink$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onAudioCapabilitiesChanged(androidx.media3.exoplayer.audio.AudioSink.Listener _this) {
            }

            public static void $default$onAudioSinkError(androidx.media3.exoplayer.audio.AudioSink.Listener _this, java.lang.Exception exc) {
            }

            public static void $default$onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.Listener _this, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            }

            public static void $default$onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.Listener _this, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            }

            public static void $default$onOffloadBufferEmptying(androidx.media3.exoplayer.audio.AudioSink.Listener _this) {
            }

            public static void $default$onOffloadBufferFull(androidx.media3.exoplayer.audio.AudioSink.Listener _this) {
            }

            public static void $default$onPositionAdvancing(androidx.media3.exoplayer.audio.AudioSink.Listener _this, long j) {
            }

            public static void $default$onSilenceSkipped(androidx.media3.exoplayer.audio.AudioSink.Listener _this) {
            }
        }

        void onAudioCapabilitiesChanged();

        void onAudioSinkError(java.lang.Exception exc);

        void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig);

        void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig);

        void onOffloadBufferEmptying();

        void onOffloadBufferFull();

        void onPositionAdvancing(long j);

        void onPositionDiscontinuity();

        void onSilenceSkipped();

        void onSkipSilenceEnabledChanged(boolean z);

        void onUnderrun(int i, long j, long j2);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    void configure(androidx.media3.common.Format format, int i, int[] iArr) throws androidx.media3.exoplayer.audio.AudioSink.ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    androidx.media3.common.AudioAttributes getAudioAttributes();

    long getCurrentPositionUs(boolean z);

    androidx.media3.exoplayer.audio.AudioOffloadSupport getFormatOffloadSupport(androidx.media3.common.Format format);

    int getFormatSupport(androidx.media3.common.Format format);

    androidx.media3.common.PlaybackParameters getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(java.nio.ByteBuffer byteBuffer, long j, int i) throws androidx.media3.exoplayer.audio.AudioSink.InitializationException, androidx.media3.exoplayer.audio.AudioSink.WriteException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws androidx.media3.exoplayer.audio.AudioSink.WriteException;

    void release();

    void reset();

    void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo);

    void setClock(androidx.media3.common.util.Clock clock);

    void setListener(androidx.media3.exoplayer.audio.AudioSink.Listener listener);

    void setOffloadDelayPadding(int i, int i2);

    void setOffloadMode(int i);

    void setOutputStreamOffsetUs(long j);

    void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters);

    void setPlayerId(androidx.media3.exoplayer.analytics.PlayerId playerId);

    void setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo);

    void setSkipSilenceEnabled(boolean z);

    void setVolume(float f);

    boolean supportsFormat(androidx.media3.common.Format format);

    public static final class AudioTrackConfig {
        public final int bufferSize;
        public final int channelConfig;
        public final int encoding;
        public final boolean offload;
        public final int sampleRate;
        public final boolean tunneling;

        public AudioTrackConfig(int i, int i2, int i3, boolean z, boolean z2, int i4) {
            this.encoding = i;
            this.sampleRate = i2;
            this.channelConfig = i3;
            this.tunneling = z;
            this.offload = z2;
            this.bufferSize = i4;
        }
    }

    public static final class ConfigurationException extends java.lang.Exception {
        public final androidx.media3.common.Format format;

        public ConfigurationException(java.lang.Throwable th, androidx.media3.common.Format format) {
            super(th);
            this.format = format;
        }

        public ConfigurationException(java.lang.String str, androidx.media3.common.Format format) {
            super(str);
            this.format = format;
        }
    }

    public static final class InitializationException extends java.lang.Exception {
        public final int audioTrackState;
        public final androidx.media3.common.Format format;
        public final boolean isRecoverable;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InitializationException(int i, int i2, int i3, int i4, androidx.media3.common.Format format, boolean z, java.lang.Exception exc) {
            super(r0.toString(), exc);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioTrack init failed ");
            sb.append(i);
            sb.append(" Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(") ");
            sb.append(format);
            sb.append(z ? " (recoverable)" : "");
            this.audioTrackState = i;
            this.isRecoverable = z;
            this.format = format;
        }
    }

    public static final class WriteException extends java.lang.Exception {
        public final int errorCode;
        public final androidx.media3.common.Format format;
        public final boolean isRecoverable;

        public WriteException(int i, androidx.media3.common.Format format, boolean z) {
            super("AudioTrack write failed: " + i);
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = format;
        }
    }

    public static final class UnexpectedDiscontinuityException extends java.lang.Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j2;
        }
    }

    /* renamed from: androidx.media3.exoplayer.audio.AudioSink$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$release(androidx.media3.exoplayer.audio.AudioSink _this) {
        }

        public static void $default$setClock(androidx.media3.exoplayer.audio.AudioSink _this, androidx.media3.common.util.Clock clock) {
        }

        public static void $default$setOffloadDelayPadding(androidx.media3.exoplayer.audio.AudioSink _this, int i, int i2) {
        }

        public static void $default$setOffloadMode(androidx.media3.exoplayer.audio.AudioSink _this, int i) {
        }

        public static void $default$setOutputStreamOffsetUs(androidx.media3.exoplayer.audio.AudioSink _this, long j) {
        }

        public static void $default$setPlayerId(androidx.media3.exoplayer.audio.AudioSink _this, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        }

        public static void $default$setPreferredDevice(androidx.media3.exoplayer.audio.AudioSink _this, android.media.AudioDeviceInfo audioDeviceInfo) {
        }
    }
}
