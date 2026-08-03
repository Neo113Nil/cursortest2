package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public interface VideoRendererEventListener {

    public static final class EventDispatcher {
        private final android.os.Handler handler;
        private final com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener listener;

        public EventDispatcher(android.os.Handler handler, com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener videoRendererEventListener) {
            if (videoRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = videoRendererEventListener;
        }

        public void decoderInitialized(java.lang.String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.video.j(this, str, j, j2));
            }
        }

        public void disabled(com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.video.o(this, decoderCounters));
            }
        }

        public void droppedFrames(int i, long j) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.video.l(this, i, j));
            }
        }

        public void enabled(com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.video.i(this, decoderCounters));
            }
        }

        public void inputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.video.k(this, oVar));
            }
        }

        public void renderedFirstFrame(android.view.Surface surface) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.video.n(this, surface));
            }
        }

        public void videoSizeChanged(int i, int i2, int i3, float f) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.video.m(this, i, i2, i3, f));
            }
        }
    }

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(android.view.Surface surface);

    void onVideoDecoderInitialized(java.lang.String str, long j, long j2);

    void onVideoDisabled(com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onVideoEnabled(com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onVideoInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
