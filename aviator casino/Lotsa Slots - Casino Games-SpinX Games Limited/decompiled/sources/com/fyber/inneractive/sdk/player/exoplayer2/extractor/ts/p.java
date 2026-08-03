package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f4015a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r b;
    public boolean c;
    public long d;
    public int e;
    public int f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        int i;
        if (this.c && (i = this.e) != 0 && this.f == i) {
            this.b.a(this.d, 1, i, 0, null);
            this.c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e0 e0Var) {
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2 = jVar.a(e0Var.d, 4);
        this.b = a2;
        e0Var.b();
        a2.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.e, "application/id3", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z, long j) {
        if (z) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (this.c) {
            int i = nVar.c - nVar.b;
            int i2 = this.f;
            if (i2 < 10) {
                int min = java.lang.Math.min(i, 10 - i2);
                java.lang.System.arraycopy(nVar.f4112a, nVar.b, this.f4015a.f4112a, this.f, min);
                if (this.f + min == 10) {
                    this.f4015a.e(0);
                    if (73 == this.f4015a.j() && 68 == this.f4015a.j() && 51 == this.f4015a.j()) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f4015a;
                        nVar2.e(nVar2.b + 3);
                        this.e = this.f4015a.i() + 10;
                    } else {
                        android.util.Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int min2 = java.lang.Math.min(i, this.e - this.f);
            this.b.a(min2, nVar);
            this.f += min2;
        }
    }
}
