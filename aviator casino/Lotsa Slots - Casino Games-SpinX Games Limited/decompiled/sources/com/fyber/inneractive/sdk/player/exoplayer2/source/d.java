package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4051a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ java.io.IOException d;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.source.f e;

    public d(com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i, int i2, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i3, java.lang.Object obj, long j, long j2, long j3, long j4, long j5, java.io.IOException iOException, boolean z) {
        this.e = fVar;
        this.f4051a = obj;
        this.b = j;
        this.c = j2;
        this.d = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.controller.b0 b0Var = this.e.b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.b);
        com.fyber.inneractive.sdk.player.exoplayer2.source.f.a(this.e, this.c);
        com.fyber.inneractive.sdk.util.IAlog.a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", b0Var.a(), this.d);
    }
}
