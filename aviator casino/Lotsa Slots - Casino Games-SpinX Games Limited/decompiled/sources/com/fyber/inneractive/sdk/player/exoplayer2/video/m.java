package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4133a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher e;

    public m(com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher eventDispatcher, int i, int i2, int i3, float f) {
        this.e = eventDispatcher;
        this.f4133a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.e.listener;
        videoRendererEventListener.onVideoSizeChanged(this.f4133a, this.b, this.c, this.d);
    }
}
