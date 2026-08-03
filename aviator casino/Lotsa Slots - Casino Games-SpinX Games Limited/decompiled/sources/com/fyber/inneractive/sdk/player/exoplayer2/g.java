package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f4029a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.f c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.l d;
    public final java.util.concurrent.CopyOnWriteArraySet e;
    public final com.fyber.inneractive.sdk.player.exoplayer2.w f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.v g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public com.fyber.inneractive.sdk.player.exoplayer2.x m;
    public java.lang.Object n;
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h o;
    public com.fyber.inneractive.sdk.player.exoplayer2.s p;
    public com.fyber.inneractive.sdk.player.exoplayer2.i q;
    public int r;
    public long s;

    public g(com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.c cVar) {
        android.util.Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + com.fyber.inneractive.sdk.player.exoplayer2.util.z.e + com.ironsource.X3.j.e);
        if (aVarArr.length <= 0) {
            throw new java.lang.IllegalStateException();
        }
        this.f4029a = dVar;
        this.i = false;
        this.j = 1;
        this.e = new java.util.concurrent.CopyOnWriteArraySet();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h(new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[aVarArr.length]);
        this.b = hVar;
        this.m = com.fyber.inneractive.sdk.player.exoplayer2.x.f4137a;
        this.f = new com.fyber.inneractive.sdk.player.exoplayer2.w();
        this.g = new com.fyber.inneractive.sdk.player.exoplayer2.v();
        int i = com.fyber.inneractive.sdk.player.exoplayer2.source.z.d;
        this.o = hVar;
        this.p = com.fyber.inneractive.sdk.player.exoplayer2.s.d;
        com.fyber.inneractive.sdk.player.exoplayer2.f fVar = new com.fyber.inneractive.sdk.player.exoplayer2.f(this, android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper());
        this.c = fVar;
        com.fyber.inneractive.sdk.player.exoplayer2.i iVar = new com.fyber.inneractive.sdk.player.exoplayer2.i(0, 0L);
        this.q = iVar;
        this.d = new com.fyber.inneractive.sdk.player.exoplayer2.l(aVarArr, dVar, cVar, this.i, fVar, iVar, this);
    }

    public final void a(boolean z) {
        if (this.i != z) {
            this.i = z;
            this.d.f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            java.util.Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.controller.b0) it.next()).a(this.j, z);
            }
        }
    }

    public final void a(int i, long j) {
        if (i >= 0 && (this.m.c() || i < this.m.b())) {
            this.k++;
            this.r = i;
            if (!this.m.c()) {
                this.m.a(i, this.f, 0L);
                long j2 = j == -9223372036854775807L ? this.f.e : j;
                com.fyber.inneractive.sdk.player.exoplayer2.w wVar = this.f;
                int i2 = wVar.c;
                long j3 = wVar.g;
                int i3 = com.fyber.inneractive.sdk.player.exoplayer2.b.f3917a;
                long j4 = (j2 == -9223372036854775807L ? -9223372036854775807L : j2 * 1000) + j3;
                long j5 = this.m.a(i2, this.g, false).d;
                while (j5 != -9223372036854775807L && j4 >= j5 && i2 < this.f.d) {
                    j4 -= j5;
                    i2++;
                    j5 = this.m.a(i2, this.g, false).d;
                }
            }
            if (j == -9223372036854775807L) {
                this.s = 0L;
                this.d.f.obtainMessage(3, new com.fyber.inneractive.sdk.player.exoplayer2.j(this.m, i, -9223372036854775807L)).sendToTarget();
                return;
            }
            this.s = j;
            com.fyber.inneractive.sdk.player.exoplayer2.l lVar = this.d;
            com.fyber.inneractive.sdk.player.exoplayer2.x xVar = this.m;
            int i4 = com.fyber.inneractive.sdk.player.exoplayer2.b.f3917a;
            lVar.f.obtainMessage(3, new com.fyber.inneractive.sdk.player.exoplayer2.j(xVar, i, j != -9223372036854775807L ? j * 1000 : -9223372036854775807L)).sendToTarget();
            java.util.Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.controller.b0) it.next()).getClass();
            }
            return;
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.q();
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.e... eVarArr) {
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = this.d;
        if (lVar.q) {
            android.util.Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            lVar.f.obtainMessage(11, eVarArr).sendToTarget();
        }
    }

    public final int a() {
        if (!this.m.c() && this.k <= 0) {
            return this.m.a(this.q.f4031a, this.g, false).c;
        }
        return this.r;
    }
}
