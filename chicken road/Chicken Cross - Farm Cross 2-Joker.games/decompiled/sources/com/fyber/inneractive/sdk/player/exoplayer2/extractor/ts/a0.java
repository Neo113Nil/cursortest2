package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class a0 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f5651a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[5]);
    public final SparseArray b = new SparseArray();
    public final SparseIntArray c = new SparseIntArray();
    public final int d;
    public final /* synthetic */ b0 e;

    public a0(b0 b0Var, int i) {
        this.e = b0Var;
        this.d = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar2;
        char c;
        f0 a2;
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar3;
        int i;
        int i2;
        if (nVar.j() != 2) {
            return;
        }
        b0 b0Var = this.e;
        int i3 = b0Var.f5653a;
        int i4 = 0;
        if (i3 == 1 || i3 == 2 || b0Var.i == 1) {
            vVar = (com.fyber.inneractive.sdk.player.exoplayer2.util.v) b0Var.b.get(0);
        } else {
            vVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(((com.fyber.inneractive.sdk.player.exoplayer2.util.v) b0Var.b.get(0)).f5772a);
            this.e.b.add(vVar);
        }
        nVar.e(nVar.b + 2);
        int o = nVar.o();
        int i5 = 5;
        nVar.e(nVar.b + 5);
        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f5651a;
        nVar.a(mVar.f5765a, 0, 2);
        mVar.b(0);
        int i6 = 4;
        this.f5651a.c(4);
        int i7 = 12;
        nVar.e(nVar.b + this.f5651a.a(12));
        b0 b0Var2 = this.e;
        if (b0Var2.f5653a == 2 && b0Var2.k == null) {
            d0 d0Var = new d0(21, null, null, new byte[0]);
            b0 b0Var3 = this.e;
            b0Var3.k = b0Var3.e.a(21, d0Var);
            b0 b0Var4 = this.e;
            b0Var4.k.a(vVar, b0Var4.h, new e0(o, 21, 8192));
        }
        this.b.clear();
        this.c.clear();
        int i8 = nVar.c - nVar.b;
        while (i8 > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar2 = this.f5651a;
            nVar.a(mVar2.f5765a, i4, i5);
            mVar2.b(i4);
            int a3 = this.f5651a.a(8);
            int i9 = 3;
            this.f5651a.c(3);
            int a4 = this.f5651a.a(13);
            this.f5651a.c(i6);
            int a5 = this.f5651a.a(i7);
            int i10 = nVar.b;
            int i11 = i10 + a5;
            int i12 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (nVar.b < i11) {
                int j = nVar.j();
                int j2 = nVar.b + nVar.j();
                if (j == i5) {
                    long k = nVar.k();
                    if (k != b0.l) {
                        if (k != b0.m) {
                            if (k == b0.n) {
                                i2 = 36;
                                vVar3 = vVar;
                                i12 = i2;
                                i = 4;
                            }
                            vVar3 = vVar;
                            i = 4;
                        }
                        i2 = 135;
                        vVar3 = vVar;
                        i12 = i2;
                        i = 4;
                    }
                    i2 = 129;
                    vVar3 = vVar;
                    i12 = i2;
                    i = 4;
                } else {
                    if (j != 106) {
                        if (j != 122) {
                            if (j == 123) {
                                i2 = 138;
                                vVar3 = vVar;
                                i12 = i2;
                                i = 4;
                            } else {
                                if (j == 10) {
                                    str = nVar.b(i9).trim();
                                } else if (j == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (nVar.b < j2) {
                                        String trim = nVar.b(i9).trim();
                                        nVar.j();
                                        byte[] bArr = new byte[4];
                                        nVar.a(bArr, 0, 4);
                                        arrayList2.add(new c0(trim, bArr));
                                        vVar = vVar;
                                        i9 = 3;
                                    }
                                    vVar3 = vVar;
                                    i = 4;
                                    arrayList = arrayList2;
                                    i12 = 89;
                                }
                                vVar3 = vVar;
                                i = 4;
                            }
                        }
                        i2 = 135;
                        vVar3 = vVar;
                        i12 = i2;
                        i = 4;
                    }
                    i2 = 129;
                    vVar3 = vVar;
                    i12 = i2;
                    i = 4;
                }
                int i13 = nVar.b;
                nVar.e((j2 - i13) + i13);
                i6 = i;
                vVar = vVar3;
                i5 = 5;
                i9 = 3;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar4 = vVar;
            int i14 = i6;
            nVar.e(i11);
            d0 d0Var2 = new d0(i12, str, arrayList, Arrays.copyOfRange(nVar.f5766a, i10, i11));
            if (a3 == 6) {
                a3 = i12;
            }
            i8 -= a5 + 5;
            b0 b0Var5 = this.e;
            int i15 = b0Var5.f5653a == 2 ? a3 : a4;
            if (b0Var5.g.get(i15)) {
                c = 21;
            } else {
                b0 b0Var6 = this.e;
                if (b0Var6.f5653a == 2) {
                    c = 21;
                    if (a3 == 21) {
                        a2 = b0Var6.k;
                        if (this.e.f5653a == 2 || a4 < this.c.get(i15, 8192)) {
                            this.c.put(i15, a4);
                            this.b.put(i15, a2);
                        }
                    }
                } else {
                    c = 21;
                }
                a2 = b0Var6.e.a(a3, d0Var2);
                if (this.e.f5653a == 2) {
                }
                this.c.put(i15, a4);
                this.b.put(i15, a2);
            }
            i6 = i14;
            vVar = vVar4;
            i4 = 0;
            i5 = 5;
            i7 = 12;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar5 = vVar;
        int size = this.c.size();
        int i16 = 0;
        while (i16 < size) {
            int keyAt = this.c.keyAt(i16);
            this.e.g.put(keyAt, true);
            f0 f0Var = (f0) this.b.valueAt(i16);
            if (f0Var != null) {
                b0 b0Var7 = this.e;
                if (f0Var != b0Var7.k) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar = b0Var7.h;
                    e0 e0Var = new e0(o, keyAt, 8192);
                    vVar2 = vVar5;
                    f0Var.a(vVar2, jVar, e0Var);
                } else {
                    vVar2 = vVar5;
                }
                this.e.f.put(this.c.valueAt(i16), f0Var);
            } else {
                vVar2 = vVar5;
            }
            i16++;
            vVar5 = vVar2;
        }
        b0 b0Var8 = this.e;
        if (b0Var8.f5653a == 2) {
            if (b0Var8.j) {
                return;
            }
            b0Var8.h.b();
            b0 b0Var9 = this.e;
            b0Var9.i = 0;
            b0Var9.j = true;
            return;
        }
        b0Var8.f.remove(this.d);
        b0 b0Var10 = this.e;
        int i17 = b0Var10.f5653a == 1 ? 0 : b0Var10.i - 1;
        b0Var10.i = i17;
        if (i17 == 0) {
            b0Var10.h.b();
            this.e.j = true;
        }
    }
}
