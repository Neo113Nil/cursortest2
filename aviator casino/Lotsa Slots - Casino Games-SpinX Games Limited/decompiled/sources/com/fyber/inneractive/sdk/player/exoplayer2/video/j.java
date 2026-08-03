package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4130a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher d;

    public j(com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher eventDispatcher, java.lang.String str, long j, long j2) {
        this.d = eventDispatcher;
        this.f4130a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.d.listener;
        videoRendererEventListener.onVideoDecoderInitialized(this.f4130a, this.b, this.c);
    }
}
