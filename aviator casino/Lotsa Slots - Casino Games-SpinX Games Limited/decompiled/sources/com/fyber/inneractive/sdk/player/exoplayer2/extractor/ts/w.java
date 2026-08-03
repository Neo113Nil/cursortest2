package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class w implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v f4021a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public w(com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v vVar) {
        this.f4021a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e0 e0Var) {
        this.f4021a.a(vVar, jVar, e0Var);
        this.f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z) {
        int j = z ? nVar.b + nVar.j() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            nVar.e(j);
            this.d = 0;
        }
        while (true) {
            int i = nVar.c - nVar.b;
            if (i <= 0) {
                return;
            }
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int j2 = nVar.j();
                    nVar.e(nVar.b - 1);
                    if (j2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = java.lang.Math.min(nVar.c - nVar.b, 3 - this.d);
                nVar.a(this.b.f4112a, this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    this.b.c(3);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.b;
                    nVar2.e(nVar2.b + 1);
                    int j3 = this.b.j();
                    int j4 = this.b.j();
                    this.e = (j3 & 128) != 0;
                    this.c = (((j3 & 15) << 8) | j4) + 3;
                    int a2 = this.b.a();
                    int i4 = this.c;
                    if (a2 < i4) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.b;
                        byte[] bArr = nVar3.f4112a;
                        nVar3.c(java.lang.Math.min(4098, java.lang.Math.max(i4, bArr.length * 2)));
                        java.lang.System.arraycopy(bArr, 0, this.b.f4112a, 0, 3);
                    }
                }
            } else {
                int min2 = java.lang.Math.min(i, this.c - i2);
                nVar.a(this.b.f4112a, this.d, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = this.b.f4112a;
                        int i7 = -1;
                        for (int i8 = 0; i8 < i6; i8++) {
                            i7 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.h[((i7 >>> 24) ^ (bArr2[i8] & 255)) & 255] ^ (i7 << 8);
                        }
                        int i9 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
                        if (i7 != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.c(this.c - 4);
                    } else {
                        this.b.c(i6);
                    }
                    this.f4021a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }
}
