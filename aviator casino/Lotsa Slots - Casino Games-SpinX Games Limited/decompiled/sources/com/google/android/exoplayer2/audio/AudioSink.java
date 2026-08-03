package com.google.android.exoplayer2.audio;

/* loaded from: classes3.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;
    public static final int SINK_FORMAT_SUPPORTED_DIRECTLY = 2;
    public static final int SINK_FORMAT_SUPPORTED_WITH_TRANSCODING = 1;
    public static final int SINK_FORMAT_UNSUPPORTED = 0;

    /* renamed from: com.google.android.exoplayer2.audio.AudioSink$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$setOutputStreamOffsetUs(com.google.android.exoplayer2.audio.AudioSink _this, long j) {
        }

        public static void $default$setPlayerId(com.google.android.exoplayer2.audio.AudioSink _this, com.google.android.exoplayer2.analytics.PlayerId playerId) {
        }

        public static void $default$setPreferredDevice(com.google.android.exoplayer2.audio.AudioSink _this, android.media.AudioDeviceInfo audioDeviceInfo) {
        }
    }

    public interface Listener {

        /* renamed from: com.google.android.exoplayer2.audio.AudioSink$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onAudioSinkError(com.google.android.exoplayer2.audio.AudioSink.Listener _this, java.lang.Exception exc) {
            }

            public static void $default$onOffloadBufferEmptying(com.google.android.exoplayer2.audio.AudioSink.Listener _this) {
            }

            public static void $default$onOffloadBufferFull(com.google.android.exoplayer2.audio.AudioSink.Listener _this) {
            }

            public static void $default$onPositionAdvancing(com.google.android.exoplayer2.audio.AudioSink.Listener _this, long j) {
            }
        }

        void onAudioSinkError(java.lang.Exception exc);

        void onOffloadBufferEmptying();

        void onOffloadBufferFull();

        void onPositionAdvancing(long j);

        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean z);

        void onUnderrun(int i, long j, long j2);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    void configure(com.google.android.exoplayer2.Format format, int i, int[] iArr) throws com.google.android.exoplayer2.audio.AudioSink.ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21();

    void experimentalFlushWithoutAudioTrackRelease();

    void flush();

    com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes();

    long getCurrentPositionUs(boolean z);

    int getFormatSupport(com.google.android.exoplayer2.Format format);

    com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(java.nio.ByteBuffer byteBuffer, long j, int i) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException, com.google.android.exoplayer2.audio.AudioSink.WriteException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws com.google.android.exoplayer2.audio.AudioSink.WriteException;

    void reset();

    void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo auxEffectInfo);

    void setListener(com.google.android.exoplayer2.audio.AudioSink.Listener listener);

    void setOutputStreamOffsetUs(long j);

    void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters);

    void setPlayerId(com.google.android.exoplayer2.analytics.PlayerId playerId);

    void setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo);

    void setSkipSilenceEnabled(boolean z);

    void setVolume(float f);

    boolean supportsFormat(com.google.android.exoplayer2.Format format);

    public static final class ConfigurationException extends java.lang.Exception {
        public final com.google.android.exoplayer2.Format format;

        public ConfigurationException(java.lang.Throwable th, com.google.android.exoplayer2.Format format) {
            super(th);
            this.format = format;
        }

        public ConfigurationException(java.lang.String str, com.google.android.exoplayer2.Format format) {
            super(str);
            this.format = format;
        }
    }

    public static final class InitializationException extends java.lang.Exception {
        public final int audioTrackState;
        public final com.google.android.exoplayer2.Format format;
        public final boolean isRecoverable;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InitializationException(int i, int i2, int i3, int i4, com.google.android.exoplayer2.Format format, boolean z, java.lang.Exception exc) {
            super(r0.toString(), exc);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioTrack init failed ");
            sb.append(i);
            sb.append(" Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(")");
            sb.append(z ? " (recoverable)" : "");
            this.audioTrackState = i;
            this.isRecoverable = z;
            this.format = format;
        }
    }

    public static final class WriteException extends java.lang.Exception {
        public final int errorCode;
        public final com.google.android.exoplayer2.Format format;
        public final boolean isRecoverable;

        public WriteException(int i, com.google.android.exoplayer2.Format format, boolean z) {
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
}
