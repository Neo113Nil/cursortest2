package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4047a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.source.f d;

    public a(com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i, int i2, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i3, java.lang.Object obj, long j, long j2, long j3) {
        this.d = fVar;
        this.f4047a = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.controller.b0 b0Var = this.d.b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.b);
        com.fyber.inneractive.sdk.player.exoplayer2.source.f.a(this.d, this.c);
        com.fyber.inneractive.sdk.util.IAlog.a("%s AdaptiveMediaSourceEventListener onLoadStarted called.", b0Var.a());
    }
}
