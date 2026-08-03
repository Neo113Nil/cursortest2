package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3909a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener.EventDispatcher b;

    public i(com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener.EventDispatcher eventDispatcher, int i) {
        this.b = eventDispatcher;
        this.f3909a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener audioRendererEventListener;
        audioRendererEventListener = this.b.listener;
        audioRendererEventListener.onAudioSessionId(this.f3909a);
    }
}
