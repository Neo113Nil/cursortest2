package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.l f3918a = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l();
    public final long b = 15000 * 1000;
    public final long c = 30000 * 1000;
    public final long d = 2500000;
    public final long e = 5000000;
    public int f;
    public boolean g;

    public final void a(boolean z) {
        this.f = 0;
        this.g = false;
        if (z) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = this.f3918a;
            synchronized (lVar) {
                lVar.a(0);
            }
        }
    }
}
