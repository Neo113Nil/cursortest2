package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* loaded from: classes3.dex */
public interface AudioRendererEventListener {

    public static final class EventDispatcher {
        private final android.os.Handler handler;
        private final com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener listener;

        public EventDispatcher(android.os.Handler handler, com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener audioRendererEventListener) {
            if (audioRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = audioRendererEventListener;
        }

        public void audioSessionId(int i) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.audio.i(this, i));
            }
        }

        public void audioTrackUnderrun(int i, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.audio.g(this, i, j, j2));
            }
        }

        public void decoderInitialized(java.lang.String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.audio.e(this, str, j, j2));
            }
        }

        public void disabled(com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.audio.h(this, decoderCounters));
            }
        }

        public void enabled(com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.audio.d(this, decoderCounters));
            }
        }

        public void inputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
            if (this.listener != null) {
                this.handler.post(new com.fyber.inneractive.sdk.player.exoplayer2.audio.f(this, oVar));
            }
        }
    }

    void onAudioDecoderInitialized(java.lang.String str, long j, long j2);

    void onAudioDisabled(com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onAudioEnabled(com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar);

    void onAudioSessionId(int i);

    void onAudioTrackUnderrun(int i, long j, long j2);
}
