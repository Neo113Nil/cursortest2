package com.google.android.exoplayer2.audio;

/* loaded from: classes3.dex */
public interface AudioRendererEventListener {

    /* renamed from: com.google.android.exoplayer2.audio.AudioRendererEventListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAudioCodecError(com.google.android.exoplayer2.audio.AudioRendererEventListener _this, java.lang.Exception exc) {
        }

        public static void $default$onAudioDecoderInitialized(com.google.android.exoplayer2.audio.AudioRendererEventListener _this, java.lang.String str, long j, long j2) {
        }

        public static void $default$onAudioDecoderReleased(com.google.android.exoplayer2.audio.AudioRendererEventListener _this, java.lang.String str) {
        }

        public static void $default$onAudioDisabled(com.google.android.exoplayer2.audio.AudioRendererEventListener _this, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        }

        public static void $default$onAudioEnabled(com.google.android.exoplayer2.audio.AudioRendererEventListener _this, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        }

        @java.lang.Deprecated
        public static void $default$onAudioInputFormatChanged(com.google.android.exoplayer2.audio.AudioRendererEventListener _this, com.google.android.exoplayer2.Format format) {
        }

        public static void $default$onAudioInputFormatChanged(com.google.android.exoplayer2.audio.AudioRendererEventListener _this, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public static void $default$onAudioPositionAdvancing(com.google.android.exoplayer2.audio.AudioRendererEventListener _this, long j) {
        }

        public static void $default$onAudioSinkError(com.google.android.exoplayer2.audio.AudioRendererEventListener _this, java.lang.Exception exc) {
        }

        public static void $default$onAudioUnderrun(com.google.android.exoplayer2.audio.AudioRendererEventListener _this, int i, long j, long j2) {
        }

        public static void $default$onSkipSilenceEnabledChanged(com.google.android.exoplayer2.audio.AudioRendererEventListener _this, boolean z) {
        }
    }

    void onAudioCodecError(java.lang.Exception exc);

    void onAudioDecoderInitialized(java.lang.String str, long j, long j2);

    void onAudioDecoderReleased(java.lang.String str);

    void onAudioDisabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onAudioEnabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    @java.lang.Deprecated
    void onAudioInputFormatChanged(com.google.android.exoplayer2.Format format);

    void onAudioInputFormatChanged(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j);

    void onAudioSinkError(java.lang.Exception exc);

    void onAudioUnderrun(int i, long j, long j2);

    void onSkipSilenceEnabledChanged(boolean z);

    public static final class EventDispatcher {
        private final android.os.Handler handler;
        private final com.google.android.exoplayer2.audio.AudioRendererEventListener listener;

        public EventDispatcher(android.os.Handler handler, com.google.android.exoplayer2.audio.AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (android.os.Handler) com.google.android.exoplayer2.util.Assertions.checkNotNull(handler) : null;
            this.listener = audioRendererEventListener;
        }

        public void enabled(final com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.this.m5390x5024e2cf(decoderCounters);
                    }
                });
            }
        }

        /* renamed from: lambda$enabled$0$com-google-android-exoplayer2-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5390x5024e2cf(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            ((com.google.android.exoplayer2.audio.AudioRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onAudioEnabled(decoderCounters);
        }

        public void decoderInitialized(final java.lang.String str, final long j, final long j2) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.this.m5387x34ee4b45(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: lambda$decoderInitialized$1$com-google-android-exoplayer2-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5387x34ee4b45(java.lang.String str, long j, long j2) {
            ((com.google.android.exoplayer2.audio.AudioRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onAudioDecoderInitialized(str, j, j2);
        }

        public void inputFormatChanged(final com.google.android.exoplayer2.Format format, final com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.this.m5391xd066461(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        /* renamed from: lambda$inputFormatChanged$2$com-google-android-exoplayer2-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5391xd066461(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
            ((com.google.android.exoplayer2.audio.AudioRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onAudioInputFormatChanged(format);
            ((com.google.android.exoplayer2.audio.AudioRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        public void positionAdvancing(final long j) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.this.m5392x4b664277(j);
                    }
                });
            }
        }

        /* renamed from: lambda$positionAdvancing$3$com-google-android-exoplayer2-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5392x4b664277(long j) {
            ((com.google.android.exoplayer2.audio.AudioRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onAudioPositionAdvancing(j);
        }

        public void underrun(final int i, final long j, final long j2) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.this.m5394x69131a3f(i, j, j2);
                    }
                });
            }
        }

        /* renamed from: lambda$underrun$4$com-google-android-exoplayer2-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5394x69131a3f(int i, long j, long j2) {
            ((com.google.android.exoplayer2.audio.AudioRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onAudioUnderrun(i, j, j2);
        }

        public void decoderReleased(final java.lang.String str) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.this.m5388x97e584ca(str);
                    }
                });
            }
        }

        /* renamed from: lambda$decoderReleased$5$com-google-android-exoplayer2-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5388x97e584ca(java.lang.String str) {
            ((com.google.android.exoplayer2.audio.AudioRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onAudioDecoderReleased(str);
        }

        public void disabled(final com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.this.m5389xa9a48754(decoderCounters);
                    }
                });
            }
        }

        /* renamed from: lambda$disabled$6$com-google-android-exoplayer2-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5389xa9a48754(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((com.google.android.exoplayer2.audio.AudioRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onAudioDisabled(decoderCounters);
        }

        public void skipSilenceEnabledChanged(final boolean z) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.this.m5393x9104d974(z);
                    }
                });
            }
        }

        /* renamed from: lambda$skipSilenceEnabledChanged$7$com-google-android-exoplayer2-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5393x9104d974(boolean z) {
            ((com.google.android.exoplayer2.audio.AudioRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onSkipSilenceEnabledChanged(z);
        }

        public void audioSinkError(final java.lang.Exception exc) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.this.m5386xcf2a89af(exc);
                    }
                });
            }
        }

        /* renamed from: lambda$audioSinkError$8$com-google-android-exoplayer2-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5386xcf2a89af(java.lang.Exception exc) {
            ((com.google.android.exoplayer2.audio.AudioRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onAudioSinkError(exc);
        }

        public void audioCodecError(final java.lang.Exception exc) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher.this.m5385x305f60bf(exc);
                    }
                });
            }
        }

        /* renamed from: lambda$audioCodecError$9$com-google-android-exoplayer2-audio-AudioRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5385x305f60bf(java.lang.Exception exc) {
            ((com.google.android.exoplayer2.audio.AudioRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onAudioCodecError(exc);
        }
    }
}
