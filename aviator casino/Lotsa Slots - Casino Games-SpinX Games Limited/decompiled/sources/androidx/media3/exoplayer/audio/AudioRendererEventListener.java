package androidx.media3.exoplayer.audio;

/* loaded from: classes2.dex */
public interface AudioRendererEventListener {

    /* renamed from: androidx.media3.exoplayer.audio.AudioRendererEventListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAudioCodecError(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, java.lang.Exception exc) {
        }

        public static void $default$onAudioDecoderInitialized(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, java.lang.String str, long j, long j2) {
        }

        public static void $default$onAudioDecoderReleased(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, java.lang.String str) {
        }

        public static void $default$onAudioDisabled(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        }

        public static void $default$onAudioEnabled(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        }

        public static void $default$onAudioInputFormatChanged(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public static void $default$onAudioPositionAdvancing(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, long j) {
        }

        public static void $default$onAudioSinkError(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, java.lang.Exception exc) {
        }

        public static void $default$onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        }

        public static void $default$onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        }

        public static void $default$onAudioUnderrun(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, int i, long j, long j2) {
        }

        public static void $default$onSkipSilenceEnabledChanged(androidx.media3.exoplayer.audio.AudioRendererEventListener _this, boolean z) {
        }
    }

    void onAudioCodecError(java.lang.Exception exc);

    void onAudioDecoderInitialized(java.lang.String str, long j, long j2);

    void onAudioDecoderReleased(java.lang.String str);

    void onAudioDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters);

    void onAudioEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j);

    void onAudioSinkError(java.lang.Exception exc);

    void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioUnderrun(int i, long j, long j2);

    void onSkipSilenceEnabledChanged(boolean z);

    public static final class EventDispatcher {
        private final android.os.Handler handler;
        private final androidx.media3.exoplayer.audio.AudioRendererEventListener listener;

        public EventDispatcher(android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(handler) : null;
            this.listener = audioRendererEventListener;
        }

        public void enabled(final androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4832x55ee20a7(decoderCounters);
                    }
                });
            }
        }

        /* renamed from: lambda$enabled$0$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4832x55ee20a7(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioEnabled(decoderCounters);
        }

        public void decoderInitialized(final java.lang.String str, final long j, final long j2) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4829x4e7a341d(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: lambda$decoderInitialized$1$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4829x4e7a341d(java.lang.String str, long j, long j2) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioDecoderInitialized(str, j, j2);
        }

        public void inputFormatChanged(final androidx.media3.common.Format format, final androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4833x1ee33b39(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        /* renamed from: lambda$inputFormatChanged$2$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4833x1ee33b39(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        public void positionAdvancing(final long j) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4834xa4e1944f(j);
                    }
                });
            }
        }

        /* renamed from: lambda$positionAdvancing$3$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4834xa4e1944f(long j) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioPositionAdvancing(j);
        }

        public void underrun(final int i, final long j, final long j2) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4836x8e019017(i, j, j2);
                    }
                });
            }
        }

        /* renamed from: lambda$underrun$4$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4836x8e019017(int i, long j, long j2) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioUnderrun(i, j, j2);
        }

        public void decoderReleased(final java.lang.String str) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4830x102cf822(str);
                    }
                });
            }
        }

        /* renamed from: lambda$decoderReleased$5$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4830x102cf822(java.lang.String str) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioDecoderReleased(str);
        }

        public void disabled(final androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4831xe116cfac(decoderCounters);
                    }
                });
            }
        }

        /* renamed from: lambda$disabled$6$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4831xe116cfac(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioDisabled(decoderCounters);
        }

        public void skipSilenceEnabledChanged(final boolean z) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4835x60b531cc(z);
                    }
                });
            }
        }

        /* renamed from: lambda$skipSilenceEnabledChanged$7$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4835x60b531cc(boolean z) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onSkipSilenceEnabledChanged(z);
        }

        public void audioSinkError(final java.lang.Exception exc) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4826xc89a3787(exc);
                    }
                });
            }
        }

        /* renamed from: lambda$audioSinkError$8$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4826xc89a3787(java.lang.Exception exc) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioSinkError(exc);
        }

        public void audioCodecError(final java.lang.Exception exc) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4825xdf751697(exc);
                    }
                });
            }
        }

        /* renamed from: lambda$audioCodecError$9$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4825xdf751697(java.lang.Exception exc) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioCodecError(exc);
        }

        public void audioTrackInitialized(final androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4827xee74b056(audioTrackConfig);
                    }
                });
            }
        }

        /* renamed from: lambda$audioTrackInitialized$10$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4827xee74b056(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioTrackInitialized(audioTrackConfig);
        }

        public void audioTrackReleased(final androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher.this.m4828x12b02702(audioTrackConfig);
                    }
                });
            }
        }

        /* renamed from: lambda$audioTrackReleased$11$androidx-media3-exoplayer-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m4828x12b02702(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            ((androidx.media3.exoplayer.audio.AudioRendererEventListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onAudioTrackReleased(audioTrackConfig);
        }
    }
}
