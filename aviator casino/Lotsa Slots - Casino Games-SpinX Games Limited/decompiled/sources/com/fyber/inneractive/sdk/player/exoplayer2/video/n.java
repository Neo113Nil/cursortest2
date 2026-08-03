package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f4134a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher b;

    public n(com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher eventDispatcher, android.view.Surface surface) {
        this.b = eventDispatcher;
        this.f4134a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.b.listener;
        videoRendererEventListener.onRenderedFirstFrame(this.f4134a);
    }
}
