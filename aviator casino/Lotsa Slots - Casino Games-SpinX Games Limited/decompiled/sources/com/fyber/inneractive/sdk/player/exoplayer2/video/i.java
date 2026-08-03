package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters f4129a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher b;

    public i(com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters) {
        this.b = eventDispatcher;
        this.f4129a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.b.listener;
        videoRendererEventListener.onVideoEnabled(this.f4129a);
    }
}
