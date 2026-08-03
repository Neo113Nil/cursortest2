package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters f3908a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener.EventDispatcher b;

    public h(com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters) {
        this.b = eventDispatcher;
        this.f3908a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener audioRendererEventListener;
        this.f3908a.ensureUpdated();
        audioRendererEventListener = this.b.listener;
        audioRendererEventListener.onAudioDisabled(this.f3908a);
    }
}
