package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters f4135a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher b;

    public o(com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters) {
        this.b = eventDispatcher;
        this.f4135a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener videoRendererEventListener;
        this.f4135a.ensureUpdated();
        videoRendererEventListener = this.b.listener;
        videoRendererEventListener.onVideoDisabled(this.f4135a);
    }
}
