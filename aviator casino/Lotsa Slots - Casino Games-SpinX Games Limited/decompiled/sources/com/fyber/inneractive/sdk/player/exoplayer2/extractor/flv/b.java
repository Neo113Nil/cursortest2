package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {
    public static final int n = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("FLV");
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j e;
    public int g;
    public int h;
    public int i;
    public long j;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.a k;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.f l;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.c m;

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f3930a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(9);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(11);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n d = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();
    public int f = 1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return false;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        if (this.i > this.d.a()) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.d;
            nVar.f4112a = new byte[java.lang.Math.max(nVar.a() * 2, this.i)];
            nVar.c = 0;
            nVar.b = 0;
        } else {
            this.d.e(0);
        }
        this.d.d(this.i);
        bVar.b(this.d.f4112a, 0, this.i, false);
        return this.d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.m.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        bVar.a(this.f3930a.f4112a, 0, 3, false);
        this.f3930a.e(0);
        if (this.f3930a.l() != n) {
            return false;
        }
        bVar.a(this.f3930a.f4112a, 0, 2, false);
        this.f3930a.e(0);
        if ((this.f3930a.o() & androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        bVar.a(this.f3930a.f4112a, 0, 4, false);
        this.f3930a.e(0);
        int b = this.f3930a.b();
        bVar.e = 0;
        bVar.a(b, false);
        bVar.a(this.f3930a.f4112a, 0, 4, false);
        this.f3930a.e(0);
        return this.f3930a.b() == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.e = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        this.f = 1;
        this.g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.c cVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.f fVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.a aVar;
        while (true) {
            int i = this.f;
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    bVar.a(this.g);
                    this.g = 0;
                    this.f = 3;
                } else if (i != 3) {
                    if (i == 4) {
                        int i2 = this.h;
                        if (i2 == 8 && (aVar = this.k) != null) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n b = b(bVar);
                            long j = this.j;
                            aVar.a(b);
                            aVar.a(b, j);
                        } else if (i2 == 9 && (fVar = this.l) != null) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n b2 = b(bVar);
                            long j2 = this.j;
                            if (fVar.a(b2)) {
                                fVar.a(b2, j2);
                            }
                        } else if (i2 == 18 && (cVar = this.m) != null) {
                            cVar.a(b(bVar), this.j);
                        } else {
                            bVar.a(this.i);
                            z = false;
                        }
                        this.g = 4;
                        this.f = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (!bVar.b(this.c.f4112a, 0, 11, true)) {
                        return -1;
                    }
                    this.c.e(0);
                    this.h = this.c.j();
                    this.i = this.c.l();
                    this.j = this.c.l();
                    this.j = ((this.c.j() << 24) | this.j) * 1000;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.c;
                    nVar.e(nVar.b + 3);
                    this.f = 4;
                }
            } else {
                if (!bVar.b(this.b.f4112a, 0, 9, true)) {
                    return -1;
                }
                this.b.e(0);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.b;
                nVar2.e(nVar2.b + 4);
                int j3 = this.b.j();
                boolean z2 = (j3 & 4) != 0;
                boolean z3 = (j3 & 1) != 0;
                if (z2 && this.k == null) {
                    this.k = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.a(this.e.a(8, 1));
                }
                if (z3 && this.l == null) {
                    this.l = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.f(this.e.a(9, 2));
                }
                if (this.m == null) {
                    this.m = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.c();
                }
                this.e.b();
                this.e.a(this);
                this.g = this.b.b() - 5;
                this.f = 2;
            }
        }
    }
}
