package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3901a;
    public com.fyber.inneractive.sdk.player.exoplayer2.t b;
    public int c;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.v d;
    public long e;
    public boolean f = true;
    public boolean g;

    public a(int i) {
        this.f3901a = i;
    }

    public abstract void a(int i, java.lang.Object obj);

    public abstract void a(long j, long j2);

    public abstract void a(boolean z, long j);

    public void a(com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr) {
    }

    public final void c() {
        if (this.c != 1) {
            throw new java.lang.IllegalStateException();
        }
        this.c = 0;
        this.d = null;
        this.g = false;
        g();
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.util.h d() {
        return null;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z) {
        int a2 = this.d.a(pVar, cVar, z);
        if (a2 == -4) {
            if (cVar.b(4)) {
                this.f = true;
                return this.g ? -4 : -3;
            }
            cVar.d += this.e;
        } else if (a2 == -5) {
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = pVar.f4045a;
            long j = oVar.w;
            if (j != Long.MAX_VALUE) {
                pVar.f4045a = new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.f4044a, oVar.e, oVar.f, oVar.c, oVar.b, oVar.g, oVar.j, oVar.k, oVar.l, oVar.m, oVar.n, oVar.p, oVar.o, oVar.q, oVar.r, oVar.s, oVar.t, oVar.u, oVar.v, oVar.x, oVar.y, oVar.z, j + this.e, oVar.h, oVar.i, oVar.d);
            }
        }
        return a2;
    }
}
