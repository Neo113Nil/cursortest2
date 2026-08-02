package P1;

import A1.X;
import C0.J;
import C1.C0095a;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format$Builder;
import java.util.ArrayList;
import java.util.Arrays;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final B f5288a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5289b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5290c;

    /* renamed from: g, reason: collision with root package name */
    public long f5294g;

    /* renamed from: i, reason: collision with root package name */
    public String f5296i;
    public F1.v j;

    /* renamed from: k, reason: collision with root package name */
    public o f5297k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5298l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5300n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f5295h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final u f5291d = new u(7);

    /* renamed from: e, reason: collision with root package name */
    public final u f5292e = new u(8);

    /* renamed from: f, reason: collision with root package name */
    public final u f5293f = new u(6);

    /* renamed from: m, reason: collision with root package name */
    public long f5299m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final C0095a f5301o = new C0095a(4, false);

    public p(B b7, boolean z4, boolean z7) {
        this.f5288a = b7;
        this.f5289b = z4;
        this.f5290c = z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fd, code lost:
    
        if (r7.f5268n != r8.f5268n) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x020e, code lost:
    
        if (r7.f5270p != r8.f5270p) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x021c, code lost:
    
        if (r7.f5266l != r8.f5266l) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02b0, code lost:
    
        if (r2 != 1) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0277 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b3  */
    @Override // P1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0095a c0095a) {
        int i7;
        int i8;
        byte[] bArr;
        int i9;
        int i10;
        char c3;
        u uVar;
        o oVar;
        boolean z4;
        long j;
        boolean z7;
        int i11;
        o oVar2;
        int i12;
        int i13;
        int i14;
        char c4 = 3;
        AbstractC1664a.i(this.j);
        int i15 = v2.t.f17153a;
        int i16 = c0095a.f1463a;
        int i17 = c0095a.f1464b;
        byte[] bArr2 = (byte[]) c0095a.f1465c;
        this.f5294g += c0095a.d();
        this.j.c(c0095a.d(), c0095a);
        while (true) {
            int n2 = AbstractC1664a.n(bArr2, i16, i17, this.f5295h);
            if (n2 == i17) {
                f(bArr2, i16, i17);
                return;
            }
            int i18 = n2 + 3;
            int i19 = bArr2[i18] & 31;
            int i20 = n2 - i16;
            if (i20 > 0) {
                f(bArr2, i16, n2);
            }
            int i21 = i17 - n2;
            long j3 = this.f5294g - i21;
            int i22 = i20 < 0 ? -i20 : 0;
            long j7 = this.f5299m;
            boolean z8 = this.f5298l;
            u uVar2 = this.f5292e;
            u uVar3 = this.f5291d;
            if (!z8 || this.f5297k.f5273c) {
                uVar3.b(i22);
                uVar2.b(i22);
                if (this.f5298l) {
                    i7 = i21;
                    i8 = i17;
                    bArr = bArr2;
                    i9 = i18;
                    i10 = i19;
                    if (uVar3.f5360c) {
                        c3 = 3;
                        v2.l y4 = AbstractC1664a.y(uVar3.f5361d, 3, uVar3.f5362e);
                        this.f5297k.f5274d.append(y4.f17123d, y4);
                        uVar3.c();
                    } else {
                        c3 = 3;
                        if (uVar2.f5360c) {
                            F1.x xVar = new F1.x(uVar2.f5361d, 4, uVar2.f5362e);
                            int l7 = xVar.l();
                            int l8 = xVar.l();
                            xVar.q();
                            this.f5297k.f5275e.append(l7, new v2.k(l7, l8, xVar.h()));
                            uVar2.c();
                        }
                    }
                } else if (uVar3.f5360c && uVar2.f5360c) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(uVar3.f5361d, uVar3.f5362e));
                    arrayList.add(Arrays.copyOf(uVar2.f5361d, uVar2.f5362e));
                    i8 = i17;
                    v2.l y5 = AbstractC1664a.y(uVar3.f5361d, 3, uVar3.f5362e);
                    bArr = bArr2;
                    i9 = i18;
                    F1.x xVar2 = new F1.x(uVar2.f5361d, 4, uVar2.f5362e);
                    int l9 = xVar2.l();
                    int l10 = xVar2.l();
                    xVar2.q();
                    v2.k kVar = new v2.k(l9, l10, xVar2.h());
                    i10 = i19;
                    String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(y5.f17120a), Integer.valueOf(y5.f17121b), Integer.valueOf(y5.f17122c));
                    F1.v vVar = this.j;
                    Format$Builder format$Builder = new Format$Builder();
                    i7 = i21;
                    format$Builder.f10528a = this.f5296i;
                    format$Builder.f10537k = "video/avc";
                    format$Builder.f10535h = format;
                    format$Builder.f10542p = y5.f17124e;
                    format$Builder.f10543q = y5.f17125f;
                    format$Builder.f10546t = y5.f17126g;
                    format$Builder.f10539m = arrayList;
                    vVar.a(new X(format$Builder));
                    this.f5298l = true;
                    this.f5297k.f5274d.append(y5.f17123d, y5);
                    this.f5297k.f5275e.append(l9, kVar);
                    uVar3.c();
                    uVar2.c();
                    c3 = 3;
                }
                uVar = this.f5293f;
                if (uVar.b(i22)) {
                    int F7 = AbstractC1664a.F(uVar.f5362e, uVar.f5361d);
                    byte[] bArr3 = uVar.f5361d;
                    C0095a c0095a2 = this.f5301o;
                    c0095a2.B(F7, bArr3);
                    c0095a2.D(4);
                    P6.b.e(j7, c0095a2, this.f5288a.f5123c);
                }
                oVar = this.f5297k;
                z4 = this.f5298l;
                boolean z9 = this.f5300n;
                if (oVar.f5279i != 9) {
                    if (oVar.f5273c) {
                        n nVar = oVar.f5283n;
                        n nVar2 = oVar.f5282m;
                        if (nVar.f5256a) {
                            if (nVar2.f5256a) {
                                v2.l lVar = nVar.f5258c;
                                AbstractC1664a.i(lVar);
                                v2.l lVar2 = nVar2.f5258c;
                                AbstractC1664a.i(lVar2);
                                if (nVar.f5261f == nVar2.f5261f && nVar.f5262g == nVar2.f5262g && nVar.f5263h == nVar2.f5263h && ((!nVar.f5264i || !nVar2.f5264i || nVar.j == nVar2.j) && ((i13 = nVar.f5259d) == (i14 = nVar2.f5259d) || (i13 != 0 && i14 != 0)))) {
                                    int i23 = lVar2.f17129k;
                                    int i24 = lVar.f17129k;
                                    if (i24 == 0) {
                                        if (i23 == 0) {
                                            if (nVar.f5267m == nVar2.f5267m) {
                                            }
                                        }
                                    }
                                    if (i24 == 1) {
                                        if (i23 == 1) {
                                            if (nVar.f5269o == nVar2.f5269o) {
                                            }
                                        }
                                    }
                                    boolean z10 = nVar.f5265k;
                                    if (z10 == nVar2.f5265k) {
                                        if (z10) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (oVar.f5272b) {
                        n nVar3 = oVar.f5283n;
                        z9 = nVar3.f5257b && ((i12 = nVar3.f5260e) == 7 || i12 == 2);
                    }
                    boolean z11 = oVar.f5287r;
                    int i25 = oVar.f5279i;
                    z7 = z11 | (i25 != 5 || (z9 && i25 == 1));
                    oVar.f5287r = z7;
                    if (z7) {
                        this.f5300n = false;
                    }
                    long j8 = this.f5299m;
                    if (this.f5298l || this.f5297k.f5273c) {
                        i11 = i10;
                        uVar3.d(i11);
                        uVar2.d(i11);
                    } else {
                        i11 = i10;
                    }
                    uVar.d(i11);
                    oVar2 = this.f5297k;
                    oVar2.f5279i = i11;
                    oVar2.f5281l = j8;
                    oVar2.j = j3;
                    int i26 = oVar2.f5272b ? 1 : 1;
                    if (oVar2.f5273c) {
                        if (i11 != 5 && i11 != i26 && i11 != 2) {
                        }
                        n nVar4 = oVar2.f5282m;
                        oVar2.f5282m = oVar2.f5283n;
                        oVar2.f5283n = nVar4;
                        nVar4.f5257b = false;
                        nVar4.f5256a = false;
                        oVar2.f5278h = 0;
                        oVar2.f5280k = true;
                    }
                    c4 = c3;
                    i17 = i8;
                    bArr2 = bArr;
                    i16 = i9;
                }
                if (z4 && oVar.f5284o) {
                    long j9 = oVar.j;
                    int i27 = i7 + ((int) (j3 - j9));
                    j = oVar.f5286q;
                    if (j != -9223372036854775807L) {
                        oVar.f5271a.e(j, oVar.f5287r ? 1 : 0, (int) (j9 - oVar.f5285p), i27, null);
                    }
                }
                oVar.f5285p = oVar.j;
                oVar.f5286q = oVar.f5281l;
                oVar.f5287r = false;
                oVar.f5284o = true;
                if (oVar.f5272b) {
                }
                boolean z112 = oVar.f5287r;
                int i252 = oVar.f5279i;
                z7 = z112 | (i252 != 5 || (z9 && i252 == 1));
                oVar.f5287r = z7;
                if (z7) {
                }
                long j82 = this.f5299m;
                if (this.f5298l) {
                }
                i11 = i10;
                uVar3.d(i11);
                uVar2.d(i11);
                uVar.d(i11);
                oVar2 = this.f5297k;
                oVar2.f5279i = i11;
                oVar2.f5281l = j82;
                oVar2.j = j3;
                if (oVar2.f5272b) {
                }
                if (oVar2.f5273c) {
                }
                c4 = c3;
                i17 = i8;
                bArr2 = bArr;
                i16 = i9;
            }
            i7 = i21;
            i8 = i17;
            bArr = bArr2;
            i9 = i18;
            i10 = i19;
            c3 = c4;
            uVar = this.f5293f;
            if (uVar.b(i22)) {
            }
            oVar = this.f5297k;
            z4 = this.f5298l;
            boolean z92 = this.f5300n;
            if (oVar.f5279i != 9) {
            }
            if (z4) {
                long j92 = oVar.j;
                int i272 = i7 + ((int) (j3 - j92));
                j = oVar.f5286q;
                if (j != -9223372036854775807L) {
                }
            }
            oVar.f5285p = oVar.j;
            oVar.f5286q = oVar.f5281l;
            oVar.f5287r = false;
            oVar.f5284o = true;
            if (oVar.f5272b) {
            }
            boolean z1122 = oVar.f5287r;
            int i2522 = oVar.f5279i;
            z7 = z1122 | (i2522 != 5 || (z92 && i2522 == 1));
            oVar.f5287r = z7;
            if (z7) {
            }
            long j822 = this.f5299m;
            if (this.f5298l) {
            }
            i11 = i10;
            uVar3.d(i11);
            uVar2.d(i11);
            uVar.d(i11);
            oVar2 = this.f5297k;
            oVar2.f5279i = i11;
            oVar2.f5281l = j822;
            oVar2.j = j3;
            if (oVar2.f5272b) {
            }
            if (oVar2.f5273c) {
            }
            c4 = c3;
            i17 = i8;
            bArr2 = bArr;
            i16 = i9;
        }
    }

    @Override // P1.h
    public final void b() {
        this.f5294g = 0L;
        this.f5300n = false;
        this.f5299m = -9223372036854775807L;
        AbstractC1664a.k(this.f5295h);
        this.f5291d.c();
        this.f5292e.c();
        this.f5293f.c();
        o oVar = this.f5297k;
        if (oVar != null) {
            oVar.f5280k = false;
            oVar.f5284o = false;
            n nVar = oVar.f5283n;
            nVar.f5257b = false;
            nVar.f5256a = false;
        }
    }

    @Override // P1.h
    public final void c(F1.m mVar, J j) {
        j.a();
        j.d();
        this.f5296i = (String) j.f1238e;
        j.d();
        F1.v r7 = mVar.r(j.f1236c, 2);
        this.j = r7;
        this.f5297k = new o(r7, this.f5289b, this.f5290c);
        this.f5288a.b(mVar, j);
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f5299m = j;
        }
        this.f5300n = ((i7 & 2) != 0) | this.f5300n;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(byte[] bArr, int i7, int i8) {
        boolean z4;
        boolean z7;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int i11;
        int i12;
        int m7;
        int i13;
        if (!this.f5298l || this.f5297k.f5273c) {
            this.f5291d.a(bArr, i7, i8);
            this.f5292e.a(bArr, i7, i8);
        }
        this.f5293f.a(bArr, i7, i8);
        o oVar = this.f5297k;
        if (oVar.f5280k) {
            int i14 = i8 - i7;
            byte[] bArr2 = oVar.f5277g;
            int length = bArr2.length;
            int i15 = oVar.f5278h + i14;
            if (length < i15) {
                oVar.f5277g = Arrays.copyOf(bArr2, i15 * 2);
            }
            System.arraycopy(bArr, i7, oVar.f5277g, oVar.f5278h, i14);
            int i16 = oVar.f5278h + i14;
            oVar.f5278h = i16;
            byte[] bArr3 = oVar.f5277g;
            F1.x xVar = oVar.f5276f;
            xVar.f2586d = bArr3;
            xVar.f2585c = 0;
            xVar.f2584b = i16;
            xVar.f2587e = 0;
            xVar.a();
            if (xVar.d(8)) {
                xVar.q();
                int i17 = xVar.i(2);
                xVar.r(5);
                if (xVar.e()) {
                    xVar.l();
                    if (xVar.e()) {
                        int l7 = xVar.l();
                        if (!oVar.f5273c) {
                            oVar.f5280k = false;
                            n nVar = oVar.f5283n;
                            nVar.f5260e = l7;
                            nVar.f5257b = true;
                            return;
                        }
                        if (xVar.e()) {
                            int l8 = xVar.l();
                            SparseArray sparseArray = oVar.f5275e;
                            if (sparseArray.indexOfKey(l8) < 0) {
                                oVar.f5280k = false;
                                return;
                            }
                            v2.k kVar = (v2.k) sparseArray.get(l8);
                            v2.l lVar = (v2.l) oVar.f5274d.get(kVar.f17118a);
                            if (lVar.f17127h) {
                                if (!xVar.d(2)) {
                                    return;
                                } else {
                                    xVar.r(2);
                                }
                            }
                            int i18 = lVar.j;
                            if (xVar.d(i18)) {
                                int i19 = xVar.i(i18);
                                if (lVar.f17128i) {
                                    z4 = false;
                                    z7 = false;
                                } else {
                                    if (!xVar.d(1)) {
                                        return;
                                    }
                                    z4 = xVar.h();
                                    if (z4) {
                                        if (xVar.d(1)) {
                                            z7 = xVar.h();
                                            z8 = true;
                                            z9 = oVar.f5279i != 5;
                                            if (z9) {
                                                i9 = 0;
                                            } else if (!xVar.e()) {
                                                return;
                                            } else {
                                                i9 = xVar.l();
                                            }
                                            boolean z10 = kVar.f17119b;
                                            i10 = lVar.f17129k;
                                            if (i10 != 0) {
                                                int i20 = lVar.f17130l;
                                                if (!xVar.d(i20)) {
                                                    return;
                                                }
                                                i11 = xVar.i(i20);
                                                if (z10 && !z4) {
                                                    if (xVar.e()) {
                                                        i13 = xVar.m();
                                                        i12 = 0;
                                                        m7 = 0;
                                                        n nVar2 = oVar.f5283n;
                                                        nVar2.f5258c = lVar;
                                                        nVar2.f5259d = i17;
                                                        nVar2.f5260e = l7;
                                                        nVar2.f5261f = i19;
                                                        nVar2.f5262g = l8;
                                                        nVar2.f5263h = z4;
                                                        nVar2.f5264i = z8;
                                                        nVar2.j = z7;
                                                        nVar2.f5265k = z9;
                                                        nVar2.f5266l = i9;
                                                        nVar2.f5267m = i11;
                                                        nVar2.f5268n = i13;
                                                        nVar2.f5269o = i12;
                                                        nVar2.f5270p = m7;
                                                        nVar2.f5256a = true;
                                                        nVar2.f5257b = true;
                                                        oVar.f5280k = false;
                                                    }
                                                    return;
                                                }
                                                i12 = 0;
                                            } else if (i10 != 1 || lVar.f17131m) {
                                                i11 = 0;
                                                i12 = 0;
                                            } else {
                                                if (!xVar.e()) {
                                                    return;
                                                }
                                                int m8 = xVar.m();
                                                if (z10 && !z4) {
                                                    if (xVar.e()) {
                                                        m7 = xVar.m();
                                                        i13 = 0;
                                                        i12 = m8;
                                                        i11 = 0;
                                                        n nVar22 = oVar.f5283n;
                                                        nVar22.f5258c = lVar;
                                                        nVar22.f5259d = i17;
                                                        nVar22.f5260e = l7;
                                                        nVar22.f5261f = i19;
                                                        nVar22.f5262g = l8;
                                                        nVar22.f5263h = z4;
                                                        nVar22.f5264i = z8;
                                                        nVar22.j = z7;
                                                        nVar22.f5265k = z9;
                                                        nVar22.f5266l = i9;
                                                        nVar22.f5267m = i11;
                                                        nVar22.f5268n = i13;
                                                        nVar22.f5269o = i12;
                                                        nVar22.f5270p = m7;
                                                        nVar22.f5256a = true;
                                                        nVar22.f5257b = true;
                                                        oVar.f5280k = false;
                                                    }
                                                    return;
                                                }
                                                i12 = m8;
                                                i11 = 0;
                                            }
                                            m7 = 0;
                                            i13 = 0;
                                            n nVar222 = oVar.f5283n;
                                            nVar222.f5258c = lVar;
                                            nVar222.f5259d = i17;
                                            nVar222.f5260e = l7;
                                            nVar222.f5261f = i19;
                                            nVar222.f5262g = l8;
                                            nVar222.f5263h = z4;
                                            nVar222.f5264i = z8;
                                            nVar222.j = z7;
                                            nVar222.f5265k = z9;
                                            nVar222.f5266l = i9;
                                            nVar222.f5267m = i11;
                                            nVar222.f5268n = i13;
                                            nVar222.f5269o = i12;
                                            nVar222.f5270p = m7;
                                            nVar222.f5256a = true;
                                            nVar222.f5257b = true;
                                            oVar.f5280k = false;
                                        }
                                        return;
                                    }
                                    z7 = false;
                                }
                                z8 = z7;
                                if (oVar.f5279i != 5) {
                                }
                                if (z9) {
                                }
                                boolean z102 = kVar.f17119b;
                                i10 = lVar.f17129k;
                                if (i10 != 0) {
                                }
                                m7 = 0;
                                i13 = 0;
                                n nVar2222 = oVar.f5283n;
                                nVar2222.f5258c = lVar;
                                nVar2222.f5259d = i17;
                                nVar2222.f5260e = l7;
                                nVar2222.f5261f = i19;
                                nVar2222.f5262g = l8;
                                nVar2222.f5263h = z4;
                                nVar2222.f5264i = z8;
                                nVar2222.j = z7;
                                nVar2222.f5265k = z9;
                                nVar2222.f5266l = i9;
                                nVar2222.f5267m = i11;
                                nVar2222.f5268n = i13;
                                nVar2222.f5269o = i12;
                                nVar2222.f5270p = m7;
                                nVar2222.f5256a = true;
                                nVar2222.f5257b = true;
                                oVar.f5280k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // P1.h
    public final void d() {
    }
}
