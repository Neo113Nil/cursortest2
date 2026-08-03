package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class z implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f4024a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[4]);
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b;

    public z(com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var) {
        this.b = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e0 e0Var) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (nVar.j() != 0) {
            return;
        }
        nVar.e(nVar.b + 7);
        int i = (nVar.c - nVar.b) / 4;
        for (int i2 = 0; i2 < i; i2++) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f4024a;
            nVar.a(mVar.f4111a, 0, 4);
            mVar.b(0);
            int a2 = this.f4024a.a(16);
            this.f4024a.c(3);
            if (a2 == 0) {
                this.f4024a.c(13);
            } else {
                int a3 = this.f4024a.a(13);
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var = this.b;
                b0Var.f.put(a3, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.w(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a0(b0Var, a3)));
                this.b.i++;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var2 = this.b;
        if (b0Var2.f3999a != 2) {
            b0Var2.f.remove(0);
        }
    }
}
