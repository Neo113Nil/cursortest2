package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.o f4131a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher b;

    public k(com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        this.b = eventDispatcher;
        this.f4131a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.b.listener;
        videoRendererEventListener.onVideoInputFormatChanged(this.f4131a);
    }
}
