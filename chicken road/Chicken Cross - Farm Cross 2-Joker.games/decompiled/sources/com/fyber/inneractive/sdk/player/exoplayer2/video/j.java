package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* loaded from: classes4.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5784a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher d;

    public j(VideoRendererEventListener.EventDispatcher eventDispatcher, String str, long j, long j2) {
        this.d = eventDispatcher;
        this.f5784a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.d.listener;
        videoRendererEventListener.onVideoDecoderInitialized(this.f5784a, this.b, this.c);
    }
}
