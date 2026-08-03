package com.google.android.exoplayer2.video;

/* loaded from: classes3.dex */
public interface VideoRendererEventListener {

    /* renamed from: com.google.android.exoplayer2.video.VideoRendererEventListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onDroppedFrames(com.google.android.exoplayer2.video.VideoRendererEventListener _this, int i, long j) {
        }

        public static void $default$onRenderedFirstFrame(com.google.android.exoplayer2.video.VideoRendererEventListener _this, java.lang.Object obj, long j) {
        }

        public static void $default$onVideoCodecError(com.google.android.exoplayer2.video.VideoRendererEventListener _this, java.lang.Exception exc) {
        }

        public static void $default$onVideoDecoderInitialized(com.google.android.exoplayer2.video.VideoRendererEventListener _this, java.lang.String str, long j, long j2) {
        }

        public static void $default$onVideoDecoderReleased(com.google.android.exoplayer2.video.VideoRendererEventListener _this, java.lang.String str) {
        }

        public static void $default$onVideoDisabled(com.google.android.exoplayer2.video.VideoRendererEventListener _this, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        }

        public static void $default$onVideoEnabled(com.google.android.exoplayer2.video.VideoRendererEventListener _this, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        }

        public static void $default$onVideoFrameProcessingOffset(com.google.android.exoplayer2.video.VideoRendererEventListener _this, long j, int i) {
        }

        @java.lang.Deprecated
        public static void $default$onVideoInputFormatChanged(com.google.android.exoplayer2.video.VideoRendererEventListener _this, com.google.android.exoplayer2.Format format) {
        }

        public static void $default$onVideoInputFormatChanged(com.google.android.exoplayer2.video.VideoRendererEventListener _this, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public static void $default$onVideoSizeChanged(com.google.android.exoplayer2.video.VideoRendererEventListener _this, com.google.android.exoplayer2.video.VideoSize videoSize) {
        }
    }

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(java.lang.Object obj, long j);

    void onVideoCodecError(java.lang.Exception exc);

    void onVideoDecoderInitialized(java.lang.String str, long j, long j2);

    void onVideoDecoderReleased(java.lang.String str);

    void onVideoDisabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onVideoEnabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(long j, int i);

    @java.lang.Deprecated
    void onVideoInputFormatChanged(com.google.android.exoplayer2.Format format);

    void onVideoInputFormatChanged(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation);

    void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize videoSize);

    public static final class EventDispatcher {
        private final android.os.Handler handler;
        private final com.google.android.exoplayer2.video.VideoRendererEventListener listener;

        public EventDispatcher(android.os.Handler handler, com.google.android.exoplayer2.video.VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (android.os.Handler) com.google.android.exoplayer2.util.Assertions.checkNotNull(handler) : null;
            this.listener = videoRendererEventListener;
        }

        public void enabled(final com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.this.m5471x14ecf85(decoderCounters);
                    }
                });
            }
        }

        /* renamed from: lambda$enabled$0$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5471x14ecf85(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            ((com.google.android.exoplayer2.video.VideoRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onVideoEnabled(decoderCounters);
        }

        public void decoderInitialized(final java.lang.String str, final long j, final long j2) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.this.m5467xe61837fb(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: lambda$decoderInitialized$1$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5467xe61837fb(java.lang.String str, long j, long j2) {
            ((com.google.android.exoplayer2.video.VideoRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onVideoDecoderInitialized(str, j, j2);
        }

        public void inputFormatChanged(final com.google.android.exoplayer2.Format format, final com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.this.m5472xbe305117(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        /* renamed from: lambda$inputFormatChanged$2$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5472xbe305117(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
            ((com.google.android.exoplayer2.video.VideoRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onVideoInputFormatChanged(format);
            ((com.google.android.exoplayer2.video.VideoRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        public void droppedFrames(final int i, final long j) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.this.m5470xb0fc5cbd(i, j);
                    }
                });
            }
        }

        /* renamed from: lambda$droppedFrames$3$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5470xb0fc5cbd(int i, long j) {
            ((com.google.android.exoplayer2.video.VideoRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onDroppedFrames(i, j);
        }

        public void reportVideoFrameProcessingOffset(final long j, final int i) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.this.m5474x6dc4981c(j, i);
                    }
                });
            }
        }

        /* renamed from: lambda$reportVideoFrameProcessingOffset$4$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5474x6dc4981c(long j, int i) {
            ((com.google.android.exoplayer2.video.VideoRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onVideoFrameProcessingOffset(j, i);
        }

        public void videoSizeChanged(final com.google.android.exoplayer2.video.VideoSize videoSize) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.this.m5476x75d86d2f(videoSize);
                    }
                });
            }
        }

        /* renamed from: lambda$videoSizeChanged$5$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5476x75d86d2f(com.google.android.exoplayer2.video.VideoSize videoSize) {
            ((com.google.android.exoplayer2.video.VideoRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onVideoSizeChanged(videoSize);
        }

        public void renderedFirstFrame(final java.lang.Object obj) {
            if (this.handler != null) {
                final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                this.handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.this.m5473xc9a6e54(obj, elapsedRealtime);
                    }
                });
            }
        }

        /* renamed from: lambda$renderedFirstFrame$6$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5473xc9a6e54(java.lang.Object obj, long j) {
            ((com.google.android.exoplayer2.video.VideoRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onRenderedFirstFrame(obj, j);
        }

        public void decoderReleased(final java.lang.String str) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.this.m5468x4f63d3e(str);
                    }
                });
            }
        }

        /* renamed from: lambda$decoderReleased$7$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5468x4f63d3e(java.lang.String str) {
            ((com.google.android.exoplayer2.video.VideoRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onVideoDecoderReleased(str);
        }

        public void disabled(final com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.this.m5469x16b53fc8(decoderCounters);
                    }
                });
            }
        }

        /* renamed from: lambda$disabled$8$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5469x16b53fc8(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((com.google.android.exoplayer2.video.VideoRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onVideoDisabled(decoderCounters);
        }

        public void videoCodecError(final java.lang.Exception exc) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher.this.m5475xd2363db0(exc);
                    }
                });
            }
        }

        /* renamed from: lambda$videoCodecError$9$com-google-android-exoplayer2-video-VideoRendererEventListener$EventDispatcher, reason: not valid java name */
        /* synthetic */ void m5475xd2363db0(java.lang.Exception exc) {
            ((com.google.android.exoplayer2.video.VideoRendererEventListener) com.google.android.exoplayer2.util.Util.castNonNull(this.listener)).onVideoCodecError(exc);
        }
    }
}
