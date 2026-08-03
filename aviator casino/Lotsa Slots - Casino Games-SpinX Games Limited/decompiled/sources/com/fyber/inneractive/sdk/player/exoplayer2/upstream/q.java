package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class q implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {
    public final java.lang.String b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.m c;

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.w f4097a = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.w();
    public final int d = 2000;
    public final int e = 2000;
    public final boolean f = true;

    public q(java.lang.String str, com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar) {
        this.b = str;
        this.c = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a() {
        return new com.fyber.inneractive.sdk.player.exoplayer2.upstream.p(this.b, this.c, this.d, this.e, this.f, this.f4097a);
    }
}
