package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4052a;
    public final /* synthetic */ long b;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.source.f c;

    public e(com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, int i, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i2, java.lang.Object obj, long j) {
        this.c = fVar;
        this.f4052a = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.controller.b0 b0Var = this.c.b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.b);
        com.fyber.inneractive.sdk.util.IAlog.a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", b0Var.a());
    }
}
