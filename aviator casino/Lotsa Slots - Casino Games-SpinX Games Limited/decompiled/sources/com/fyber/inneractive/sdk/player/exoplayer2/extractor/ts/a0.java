package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class a0 implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f3997a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[5]);
    public final android.util.SparseArray b = new android.util.SparseArray();
    public final android.util.SparseIntArray c = new android.util.SparseIntArray();
    public final int d;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 e;

    public a0(com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var, int i) {
        this.e = b0Var;
        this.d = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e0 e0Var) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0 a2;
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar3;
        if (nVar.j() != 2) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var = this.e;
        int i = b0Var.f3999a;
        int i2 = 0;
        if (i == 1 || i == 2 || b0Var.i == 1) {
            vVar = (com.fyber.inneractive.sdk.player.exoplayer2.util.v) b0Var.b.get(0);
        } else {
            vVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(((com.fyber.inneractive.sdk.player.exoplayer2.util.v) b0Var.b.get(0)).f4118a);
            this.e.b.add(vVar);
        }
        nVar.e(nVar.b + 2);
        int o = nVar.o();
        int i3 = 5;
        nVar.e(nVar.b + 5);
        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f3997a;
        nVar.a(mVar.f4111a, 0, 2);
        mVar.b(0);
        int i4 = 4;
        this.f3997a.c(4);
        int i5 = 12;
        nVar.e(nVar.b + this.f3997a.a(12));
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var2 = this.e;
        if (b0Var2.f3999a == 2 && b0Var2.k == null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d0 d0Var = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d0(21, null, null, new byte[0]);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var3 = this.e;
            b0Var3.k = b0Var3.e.a(21, d0Var);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var4 = this.e;
            b0Var4.k.a(vVar, b0Var4.h, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e0(o, 21, 8192));
        }
        this.b.clear();
        this.c.clear();
        int i6 = nVar.c - nVar.b;
        while (i6 > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar2 = this.f3997a;
            nVar.a(mVar2.f4111a, i2, i3);
            mVar2.b(i2);
            int a3 = this.f3997a.a(8);
            int i7 = 3;
            this.f3997a.c(3);
            int a4 = this.f3997a.a(13);
            this.f3997a.c(i4);
            int a5 = this.f3997a.a(i5);
            int i8 = nVar.b;
            int i9 = i8 + a5;
            java.lang.String str = null;
            int i10 = -1;
            java.util.ArrayList arrayList = null;
            while (nVar.b < i9) {
                int j = nVar.j();
                int j2 = nVar.b + nVar.j();
                if (j == i3) {
                    long k = nVar.k();
                    if (k != com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0.l) {
                        if (k != com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0.m) {
                            if (k == com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0.n) {
                                vVar3 = vVar;
                                i10 = 36;
                            }
                            vVar3 = vVar;
                        }
                        vVar3 = vVar;
                        i10 = 135;
                    }
                    vVar3 = vVar;
                    i10 = 129;
                } else {
                    if (j != 106) {
                        if (j != 122) {
                            if (j == 123) {
                                vVar3 = vVar;
                                i10 = 138;
                            } else {
                                if (j == 10) {
                                    str = nVar.b(i7).trim();
                                } else if (j == 89) {
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    while (nVar.b < j2) {
                                        java.lang.String trim = nVar.b(i7).trim();
                                        nVar.j();
                                        byte[] bArr = new byte[4];
                                        nVar.a(bArr, 0, 4);
                                        arrayList2.add(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c0(trim, bArr));
                                        vVar = vVar;
                                        i7 = 3;
                                    }
                                    vVar3 = vVar;
                                    arrayList = arrayList2;
                                    i10 = 89;
                                }
                                vVar3 = vVar;
                            }
                        }
                        vVar3 = vVar;
                        i10 = 135;
                    }
                    vVar3 = vVar;
                    i10 = 129;
                }
                int i11 = nVar.b;
                nVar.e((j2 - i11) + i11);
                vVar = vVar3;
                i3 = 5;
                i7 = 3;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar4 = vVar;
            nVar.e(i9);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d0 d0Var2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d0(i10, str, arrayList, java.util.Arrays.copyOfRange(nVar.f4112a, i8, i9));
            if (a3 == 6) {
                a3 = i10;
            }
            i6 -= a5 + 5;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var5 = this.e;
            int i12 = b0Var5.f3999a == 2 ? a3 : a4;
            if (!b0Var5.g.get(i12)) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var6 = this.e;
                if (b0Var6.f3999a == 2 && a3 == 21) {
                    a2 = b0Var6.k;
                    if (this.e.f3999a == 2 || a4 < this.c.get(i12, 8192)) {
                        this.c.put(i12, a4);
                        this.b.put(i12, a2);
                    }
                }
                a2 = b0Var6.e.a(a3, d0Var2);
                if (this.e.f3999a == 2) {
                }
                this.c.put(i12, a4);
                this.b.put(i12, a2);
            }
            vVar = vVar4;
            i2 = 0;
            i3 = 5;
            i4 = 4;
            i5 = 12;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar5 = vVar;
        int size = this.c.size();
        int i13 = 0;
        while (i13 < size) {
            int keyAt = this.c.keyAt(i13);
            this.e.g.put(keyAt, true);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0 f0Var = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0) this.b.valueAt(i13);
            if (f0Var != null) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var7 = this.e;
                if (f0Var != b0Var7.k) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar = b0Var7.h;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e0 e0Var = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e0(o, keyAt, 8192);
                    vVar2 = vVar5;
                    f0Var.a(vVar2, jVar, e0Var);
                } else {
                    vVar2 = vVar5;
                }
                this.e.f.put(this.c.valueAt(i13), f0Var);
            } else {
                vVar2 = vVar5;
            }
            i13++;
            vVar5 = vVar2;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var8 = this.e;
        if (b0Var8.f3999a == 2) {
            if (b0Var8.j) {
                return;
            }
            b0Var8.h.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var9 = this.e;
            b0Var9.i = 0;
            b0Var9.j = true;
            return;
        }
        b0Var8.f.remove(this.d);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 b0Var10 = this.e;
        int i14 = b0Var10.f3999a == 1 ? 0 : b0Var10.i - 1;
        b0Var10.i = i14;
        if (i14 == 0) {
            b0Var10.h.b();
            this.e.j = true;
        }
    }
}
