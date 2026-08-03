package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class o implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.x f4014a;
    public java.lang.String b;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r c;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n d;
    public boolean e;
    public long l;
    public long m;
    public final boolean[] f = new boolean[3];
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r g = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r(32);
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r h = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r(33);
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r i = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r(34);
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r j = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r(39);
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r k = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r(40);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    public o(com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.x xVar) {
        this.f4014a = xVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r rVar = this.g;
        rVar.b = false;
        rVar.c = false;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r rVar2 = this.h;
        rVar2.b = false;
        rVar2.c = false;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r rVar3 = this.i;
        rVar3.b = false;
        rVar3.c = false;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r rVar4 = this.j;
        rVar4.b = false;
        rVar4.c = false;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r rVar5 = this.k;
        rVar5.b = false;
        rVar5.c = false;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n nVar = this.d;
        nVar.f = false;
        nVar.g = false;
        nVar.h = false;
        nVar.i = false;
        nVar.j = false;
        this.l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.b = e0Var.e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2 = jVar.a(e0Var.d, 2);
        this.c = a2;
        this.d = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n(a2);
        this.f4014a.a(jVar, e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03c3  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        int i9;
        while (true) {
            int i10 = nVar.c;
            int i11 = nVar.b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            byte[] bArr2 = nVar.f4112a;
            this.l += i12;
            this.c.a(i12, nVar);
            while (i11 < i10) {
                int a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(bArr2, i11, i10, this.f);
                if (a2 == i10) {
                    a(bArr2, i11, i10);
                    return;
                }
                int i13 = a2 + 3;
                int i14 = (bArr2[i13] & 126) >> 1;
                int i15 = a2 - i11;
                if (i15 > 0) {
                    a(bArr2, i11, a2);
                }
                int i16 = i10 - a2;
                long j = this.l - i16;
                int i17 = i15 < 0 ? -i15 : 0;
                long j2 = this.m;
                if (this.e) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n nVar2 = this.d;
                    if (nVar2.j && nVar2.g) {
                        nVar2.m = nVar2.c;
                        nVar2.j = false;
                    } else if (nVar2.h || nVar2.g) {
                        if (nVar2.i) {
                            i2 = i17;
                            long j3 = nVar2.b;
                            i = i10;
                            i3 = i16;
                            nVar2.f4013a.a(nVar2.l, nVar2.m ? 1 : 0, (int) (j3 - nVar2.k), i16 + ((int) (j - j3)), null);
                        } else {
                            i = i10;
                            i2 = i17;
                            i3 = i16;
                        }
                        nVar2.k = nVar2.b;
                        nVar2.l = nVar2.e;
                        nVar2.i = true;
                        nVar2.m = nVar2.c;
                    }
                    i = i10;
                    bArr = bArr2;
                    i4 = i13;
                    i6 = i14;
                    i2 = i17;
                    i5 = i16;
                    if (this.j.a(i2)) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r rVar = this.j;
                        int a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar.e, rVar.d);
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.n;
                        nVar3.f4112a = this.j.d;
                        nVar3.c = a3;
                        nVar3.b = 0;
                        nVar3.e(5);
                        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j2, this.n, this.f4014a.b);
                    }
                    if (this.k.a(i2)) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r rVar2 = this.k;
                        int a4 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(rVar2.e, rVar2.d);
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.n;
                        nVar4.f4112a = this.k.d;
                        nVar4.c = a4;
                        nVar4.b = 0;
                        nVar4.e(5);
                        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a(j2, this.n, this.f4014a.b);
                    }
                    long j4 = this.m;
                    if (!this.e) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n nVar5 = this.d;
                        nVar5.g = false;
                        nVar5.h = false;
                        nVar5.e = j4;
                        nVar5.d = 0;
                        nVar5.b = j;
                        i8 = i6;
                        if (i8 >= 32) {
                            if (nVar5.j || !nVar5.i) {
                                i9 = 16;
                            } else {
                                i9 = 16;
                                nVar5.f4013a.a(nVar5.l, nVar5.m ? 1 : 0, (int) (j - nVar5.k), i5, null);
                                nVar5.i = false;
                            }
                            if (i8 <= 34) {
                                nVar5.h = !nVar5.j;
                                nVar5.j = true;
                                boolean z = i8 < i9 && i8 <= 21;
                                nVar5.c = z;
                                nVar5.f = !z || i8 <= 9;
                            }
                        } else {
                            i9 = 16;
                        }
                        if (i8 < i9) {
                        }
                        nVar5.c = z;
                        nVar5.f = !z || i8 <= 9;
                    } else {
                        i8 = i6;
                        this.g.b(i8);
                        this.h.b(i8);
                        this.i.b(i8);
                    }
                    this.j.b(i8);
                    this.k.b(i8);
                    i10 = i;
                    bArr2 = bArr;
                    i11 = i4;
                } else {
                    i = i10;
                    i2 = i17;
                    i3 = i16;
                    this.g.a(i2);
                    this.h.a(i2);
                    this.i.a(i2);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r rVar3 = this.g;
                    if (rVar3.c) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r rVar4 = this.h;
                        if (rVar4.c) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r rVar5 = this.i;
                            if (rVar5.c) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar6 = this.c;
                                java.lang.String str = this.b;
                                int i18 = rVar3.e;
                                bArr = bArr2;
                                i4 = i13;
                                byte[] bArr3 = new byte[rVar4.e + i18 + rVar5.e];
                                i5 = i3;
                                java.lang.System.arraycopy(rVar3.d, 0, bArr3, 0, i18);
                                i6 = i14;
                                java.lang.System.arraycopy(rVar4.d, 0, bArr3, rVar3.e, rVar4.e);
                                java.lang.System.arraycopy(rVar5.d, 0, bArr3, rVar3.e + rVar4.e, rVar5.e);
                                com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(rVar4.d, 0, rVar4.e);
                                oVar.d(44);
                                int i19 = 3;
                                int b = oVar.b(3);
                                oVar.f();
                                oVar.d(88);
                                oVar.d(8);
                                int i20 = 0;
                                for (int i21 = 0; i21 < b; i21++) {
                                    if (oVar.c()) {
                                        i20 += 89;
                                    }
                                    if (oVar.c()) {
                                        i20 += 8;
                                    }
                                }
                                oVar.d(i20);
                                if (b > 0) {
                                    oVar.d((8 - b) * 2);
                                }
                                oVar.d();
                                int d = oVar.d();
                                if (d == 3) {
                                    oVar.f();
                                }
                                int d2 = oVar.d();
                                int d3 = oVar.d();
                                if (oVar.c()) {
                                    int d4 = oVar.d();
                                    int d5 = oVar.d();
                                    int d6 = oVar.d();
                                    int d7 = oVar.d();
                                    d2 -= (d4 + d5) * ((d == 1 || d == 2) ? 2 : 1);
                                    d3 -= (d6 + d7) * (d == 1 ? 2 : 1);
                                }
                                int i22 = d2;
                                int i23 = d3;
                                oVar.d();
                                oVar.d();
                                int d8 = oVar.d();
                                for (int i24 = oVar.c() ? 0 : b; i24 <= b; i24++) {
                                    oVar.d();
                                    oVar.d();
                                    oVar.d();
                                }
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                oVar.d();
                                if (oVar.c() && oVar.c()) {
                                    int i25 = 0;
                                    while (true) {
                                        int i26 = 4;
                                        if (i25 >= 4) {
                                            break;
                                        }
                                        int i27 = 0;
                                        while (i27 < 6) {
                                            if (!oVar.c()) {
                                                oVar.d();
                                            } else {
                                                int min = java.lang.Math.min(64, 1 << ((i25 << 1) + i26));
                                                if (i25 > 1) {
                                                    oVar.e();
                                                }
                                                for (int i28 = 0; i28 < min; i28++) {
                                                    oVar.e();
                                                }
                                                i19 = 3;
                                            }
                                            i27 += i25 == i19 ? 3 : 1;
                                            i26 = 4;
                                        }
                                        i25++;
                                    }
                                }
                                oVar.d(2);
                                if (oVar.c()) {
                                    oVar.d(8);
                                    oVar.d();
                                    oVar.d();
                                    oVar.f();
                                }
                                int d9 = oVar.d();
                                int i29 = 0;
                                boolean z2 = false;
                                int i30 = 0;
                                while (i29 < d9) {
                                    if (i29 != 0) {
                                        z2 = oVar.c();
                                    }
                                    if (z2) {
                                        oVar.f();
                                        oVar.d();
                                        for (int i31 = 0; i31 <= i30; i31++) {
                                            if (oVar.c()) {
                                                oVar.f();
                                            }
                                        }
                                        i7 = d9;
                                    } else {
                                        int d10 = oVar.d();
                                        int d11 = oVar.d();
                                        int i32 = d10 + d11;
                                        i7 = d9;
                                        for (int i33 = 0; i33 < d10; i33++) {
                                            oVar.d();
                                            oVar.f();
                                        }
                                        for (int i34 = 0; i34 < d11; i34++) {
                                            oVar.d();
                                            oVar.f();
                                        }
                                        i30 = i32;
                                    }
                                    i29++;
                                    d9 = i7;
                                }
                                if (oVar.c()) {
                                    for (int i35 = 0; i35 < oVar.d(); i35++) {
                                        oVar.d(d8 + 5);
                                    }
                                }
                                oVar.d(2);
                                if (oVar.c() && oVar.c()) {
                                    int b2 = oVar.b(8);
                                    if (b2 == 255) {
                                        int b3 = oVar.b(16);
                                        int b4 = oVar.b(16);
                                        if (b3 != 0 && b4 != 0) {
                                            f = b3 / b4;
                                            rVar6.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i22, i23, java.util.Collections.singletonList(bArr3), -1, f, null, -1, null, null));
                                            this.e = true;
                                        }
                                    } else {
                                        float[] fArr = com.fyber.inneractive.sdk.player.exoplayer2.util.l.b;
                                        if (b2 < 17) {
                                            f = fArr[b2];
                                            rVar6.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i22, i23, java.util.Collections.singletonList(bArr3), -1, f, null, -1, null, null));
                                            this.e = true;
                                        } else {
                                            android.util.Log.w("H265Reader", "Unexpected aspect_ratio_idc value: " + b2);
                                        }
                                    }
                                    if (this.j.a(i2)) {
                                    }
                                    if (this.k.a(i2)) {
                                    }
                                    long j42 = this.m;
                                    if (!this.e) {
                                    }
                                    this.j.b(i8);
                                    this.k.b(i8);
                                    i10 = i;
                                    bArr2 = bArr;
                                    i11 = i4;
                                }
                                f = 1.0f;
                                rVar6.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "video/hevc", -1, i22, i23, java.util.Collections.singletonList(bArr3), -1, f, null, -1, null, null));
                                this.e = true;
                                if (this.j.a(i2)) {
                                }
                                if (this.k.a(i2)) {
                                }
                                long j422 = this.m;
                                if (!this.e) {
                                }
                                this.j.b(i8);
                                this.k.b(i8);
                                i10 = i;
                                bArr2 = bArr;
                                i11 = i4;
                            }
                        }
                    }
                }
                i5 = i3;
                bArr = bArr2;
                i4 = i13;
                i6 = i14;
                if (this.j.a(i2)) {
                }
                if (this.k.a(i2)) {
                }
                long j4222 = this.m;
                if (!this.e) {
                }
                this.j.b(i8);
                this.k.b(i8);
                i10 = i;
                bArr2 = bArr;
                i11 = i4;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z, long j) {
        this.m = j;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n nVar = this.d;
            if (nVar.f) {
                int i3 = nVar.d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    nVar.g = (bArr[i4] & 128) != 0;
                    nVar.f = false;
                } else {
                    nVar.d = (i2 - i) + i3;
                }
            }
        } else {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }
}
