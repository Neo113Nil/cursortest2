package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class o implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4095a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.m b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g c;

    public o(android.content.Context context, com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.q qVar) {
        this.f4095a = context.getApplicationContext();
        this.b = mVar;
        this.c = qVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a() {
        return new com.fyber.inneractive.sdk.player.exoplayer2.upstream.n(this.f4095a, this.b, this.c.a());
    }
}
