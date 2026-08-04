package P1;

import A1.X;
import C0.J;
import C1.C0095a;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format$Builder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f5288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5290c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5294g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5296i;
    public F1.v j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f5297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5298l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5300n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f5295h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f5291d = new u(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f5292e = new u(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f5293f = new u(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5299m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0095a f5301o = new C0095a(4, false);

    public p(B b7, boolean z4, boolean z7) {
        this.f5288a = b7;
        this.f5289b = z4;
        this.f5290c = z7;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x02be  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:81:0x021e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0220  */
    /* JADX WARN: Code duplicated, block: B:87:0x0237  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // P1.h
    public final void a(C0095a c0095a) {
        int i7;
        int i8;
        byte[] bArr;
        int i9;
        int i10;
        char c3;
        long j;
        int i11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        char c4 = 3;
        p151v2.a.i(this.j);
        int i17 = p151v2.t.f17159a;
        int i18 = c0095a.f1463a;
        int i19 = c0095a.f1464b;
        byte[] bArr2 = (byte[]) c0095a.f1465c;
        this.f5294g += (long) c0095a.d();
        this.j.c(c0095a.d(), c0095a);
        while (true) {
            int iN = p151v2.a.n(bArr2, i18, i19, this.f5295h);
            if (iN == i19) {
                f(bArr2, i18, i19);
                return;
            }
            int i20 = iN + 3;
            int i21 = bArr2[i20] & 31;
            int i22 = iN - i18;
            if (i22 > 0) {
                f(bArr2, i18, iN);
            }
            int i23 = i19 - iN;
            long j7 = this.f5294g - ((long) i23);
            int i24 = i22 < 0 ? -i22 : 0;
            long j8 = this.f5299m;
            boolean z7 = this.f5298l;
            u uVar = this.f5292e;
            u uVar2 = this.f5291d;
            if (!z7 || this.f5297k.f5273c) {
                uVar2.b(i24);
                uVar.b(i24);
                if (this.f5298l) {
                    i7 = i23;
                    i8 = i19;
                    bArr = bArr2;
                    i9 = i20;
                    i10 = i21;
                    if (uVar2.f5360c) {
                        c3 = 3;
                        p151v2.l lVarY = p151v2.a.y(uVar2.f5361d, 3, uVar2.f5362e);
                        this.f5297k.f5274d.append(lVarY.f17129d, lVarY);
                        uVar2.c();
                    } else {
                        c3 = 3;
                        if (uVar.f5360c) {
                            F1.x xVar = new F1.x(uVar.f5361d, 4, uVar.f5362e);
                            int iL = xVar.l();
                            int iL2 = xVar.l();
                            xVar.q();
                            this.f5297k.f5275e.append(iL, new p151v2.k(iL, iL2, xVar.h()));
                            uVar.c();
                        }
                    }
                } else if (uVar2.f5360c && uVar.f5360c) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(uVar2.f5361d, uVar2.f5362e));
                    arrayList.add(Arrays.copyOf(uVar.f5361d, uVar.f5362e));
                    i8 = i19;
                    p151v2.l lVarY2 = p151v2.a.y(uVar2.f5361d, 3, uVar2.f5362e);
                    bArr = bArr2;
                    i9 = i20;
                    F1.x xVar2 = new F1.x(uVar.f5361d, 4, uVar.f5362e);
                    int iL3 = xVar2.l();
                    int iL4 = xVar2.l();
                    xVar2.q();
                    p151v2.k kVar = new p151v2.k(iL3, iL4, xVar2.h());
                    i10 = i21;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(lVarY2.f17126a), Integer.valueOf(lVarY2.f17127b), Integer.valueOf(lVarY2.f17128c));
                    F1.v vVar = this.j;
                    Format$Builder format$Builder = new Format$Builder();
                    i7 = i23;
                    format$Builder.f10528a = this.f5296i;
                    format$Builder.f10537k = "video/avc";
                    format$Builder.f10535h = str;
                    format$Builder.f10542p = lVarY2.f17130e;
                    format$Builder.f10543q = lVarY2.f17131f;
                    format$Builder.f10546t = lVarY2.f17132g;
                    format$Builder.f10539m = arrayList;
                    vVar.a(new X(format$Builder));
                    this.f5298l = true;
                    this.f5297k.f5274d.append(lVarY2.f17129d, lVarY2);
                    this.f5297k.f5275e.append(iL3, kVar);
                    uVar2.c();
                    uVar.c();
                    c3 = 3;
                } else {
                    i7 = i23;
                    i8 = i19;
                    bArr = bArr2;
                    i9 = i20;
                    i10 = i21;
                    c3 = c4;
                }
            } else {
                i7 = i23;
                i8 = i19;
                bArr = bArr2;
                i9 = i20;
                i10 = i21;
                c3 = c4;
            }
            u uVar3 = this.f5293f;
            if (uVar3.b(i24)) {
                int iF = p151v2.a.F(uVar3.f5362e, uVar3.f5361d);
                byte[] bArr3 = uVar3.f5361d;
                C0095a c0095a2 = this.f5301o;
                c0095a2.B(iF, bArr3);
                c0095a2.D(4);
                P6.b.e(j8, c0095a2, this.f5288a.f5123c);
            }
            o oVar = this.f5297k;
            boolean z8 = this.f5298l;
            boolean z9 = this.f5300n;
            if (oVar.f5279i == 9) {
                if (z8 && oVar.f5284o) {
                    j = oVar.j;
                    i11 = i7 + ((int) (j7 - j));
                    j3 = oVar.f5286q;
                    if (j3 != -9223372036854775807L) {
                        oVar.f5271a.e(j3, oVar.f5287r ? 1 : 0, (int) (j - oVar.f5285p), i11, null);
                    }
                }
                oVar.f5285p = oVar.j;
                oVar.f5286q = oVar.f5281l;
                oVar.f5287r = false;
                oVar.f5284o = true;
            } else if (oVar.f5273c) {
                n nVar = oVar.f5283n;
                n nVar2 = oVar.f5282m;
                if (nVar.f5256a) {
                    if (nVar2.f5256a) {
                        p151v2.l lVar = nVar.f5258c;
                        p151v2.a.i(lVar);
                        p151v2.l lVar2 = nVar2.f5258c;
                        p151v2.a.i(lVar2);
                        if (nVar.f5261f == nVar2.f5261f && nVar.f5262g == nVar2.f5262g && nVar.f5263h == nVar2.f5263h && ((!nVar.f5264i || !nVar2.f5264i || nVar.j == nVar2.j) && ((i15 = nVar.f5259d) == (i16 = nVar2.f5259d) || (i15 != 0 && i16 != 0)))) {
                            int i25 = lVar2.f17135k;
                            int i26 = lVar.f17135k;
                            if ((i26 == 0 && i25 == 0 && (nVar.f5267m != nVar2.f5267m || nVar.f5268n != nVar2.f5268n)) || ((i26 == 1 && i25 == 1 && (nVar.f5269o != nVar2.f5269o || nVar.f5270p != nVar2.f5270p)) || (z4 = nVar.f5265k) != nVar2.f5265k || (z4 && nVar.f5266l != nVar2.f5266l))) {
                                if (z8) {
                                    j = oVar.j;
                                    i11 = i7 + ((int) (j7 - j));
                                    j3 = oVar.f5286q;
                                    if (j3 != -9223372036854775807L) {
                                        oVar.f5271a.e(j3, oVar.f5287r ? 1 : 0, (int) (j - oVar.f5285p), i11, null);
                                    }
                                }
                                oVar.f5285p = oVar.j;
                                oVar.f5286q = oVar.f5281l;
                                oVar.f5287r = false;
                                oVar.f5284o = true;
                            }
                        } else {
                            if (z8) {
                                j = oVar.j;
                                i11 = i7 + ((int) (j7 - j));
                                j3 = oVar.f5286q;
                                if (j3 != -9223372036854775807L) {
                                    oVar.f5271a.e(j3, oVar.f5287r ? 1 : 0, (int) (j - oVar.f5285p), i11, null);
                                }
                            }
                            oVar.f5285p = oVar.j;
                            oVar.f5286q = oVar.f5281l;
                            oVar.f5287r = false;
                            oVar.f5284o = true;
                        }
                    } else {
                        if (z8) {
                            j = oVar.j;
                            i11 = i7 + ((int) (j7 - j));
                            j3 = oVar.f5286q;
                            if (j3 != -9223372036854775807L) {
                                oVar.f5271a.e(j3, oVar.f5287r ? 1 : 0, (int) (j - oVar.f5285p), i11, null);
                            }
                        }
                        oVar.f5285p = oVar.j;
                        oVar.f5286q = oVar.f5281l;
                        oVar.f5287r = false;
                        oVar.f5284o = true;
                    }
                }
            }
            if (oVar.f5272b) {
                n nVar3 = oVar.f5283n;
                z9 = nVar3.f5257b && ((i14 = nVar3.f5260e) == 7 || i14 == 2);
            }
            boolean z10 = oVar.f5287r;
            int i27 = oVar.f5279i;
            boolean z11 = z10 | (i27 == 5 || (z9 && i27 == 1));
            oVar.f5287r = z11;
            if (z11) {
                this.f5300n = false;
            }
            long j9 = this.f5299m;
            if (!this.f5298l || this.f5297k.f5273c) {
                i12 = i10;
                uVar2.d(i12);
                uVar.d(i12);
            } else {
                i12 = i10;
            }
            uVar3.d(i12);
            o oVar2 = this.f5297k;
            oVar2.f5279i = i12;
            oVar2.f5281l = j9;
            oVar2.j = j7;
            if (oVar2.f5272b) {
                i13 = 1;
                if (i12 == 1) {
                    n nVar4 = oVar2.f5282m;
                    oVar2.f5282m = oVar2.f5283n;
                    oVar2.f5283n = nVar4;
                    nVar4.f5257b = false;
                    nVar4.f5256a = false;
                    oVar2.f5278h = 0;
                    oVar2.f5280k = true;
                }
                c4 = c3;
                i19 = i8;
                bArr2 = bArr;
                i18 = i9;
            } else {
                i13 = 1;
            }
            if (oVar2.f5273c && (i12 == 5 || i12 == i13 || i12 == 2)) {
                n nVar5 = oVar2.f5282m;
                oVar2.f5282m = oVar2.f5283n;
                oVar2.f5283n = nVar5;
                nVar5.f5257b = false;
                nVar5.f5256a = false;
                oVar2.f5278h = 0;
                oVar2.f5280k = true;
            }
            c4 = c3;
            i19 = i8;
            bArr2 = bArr;
            i18 = i9;
        }
    }

    @Override // P1.h
    public final void b() {
        this.f5294g = 0L;
        this.f5300n = false;
        this.f5299m = -9223372036854775807L;
        p151v2.a.k(this.f5295h);
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
        F1.v vVarR = mVar.r(j.f1236c, 2);
        this.j = vVarR;
        this.f5297k = new o(vVarR, this.f5289b, this.f5290c);
        this.f5288a.b(mVar, j);
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f5299m = j;
        }
        this.f5300n = ((i7 & 2) != 0) | this.f5300n;
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:0x013e  */
    public final void f(byte[] bArr, int i7, int i8) {
        boolean zH;
        boolean zH2;
        boolean z4;
        boolean z7;
        int iL;
        boolean z8;
        int i9;
        int i10;
        int i11;
        int iM;
        int iM2;
        int i12;
        if (!this.f5298l || this.f5297k.f5273c) {
            this.f5291d.a(bArr, i7, i8);
            this.f5292e.a(bArr, i7, i8);
        }
        this.f5293f.a(bArr, i7, i8);
        o oVar = this.f5297k;
        if (oVar.f5280k) {
            int i13 = i8 - i7;
            byte[] bArr2 = oVar.f5277g;
            int length = bArr2.length;
            int i14 = oVar.f5278h + i13;
            if (length < i14) {
                oVar.f5277g = Arrays.copyOf(bArr2, i14 * 2);
            }
            System.arraycopy(bArr, i7, oVar.f5277g, oVar.f5278h, i13);
            int i15 = oVar.f5278h + i13;
            oVar.f5278h = i15;
            byte[] bArr3 = oVar.f5277g;
            F1.x xVar = oVar.f5276f;
            xVar.f2586d = bArr3;
            xVar.f2585c = 0;
            xVar.f2584b = i15;
            xVar.f2587e = 0;
            xVar.a();
            if (xVar.d(8)) {
                xVar.q();
                int i16 = xVar.i(2);
                xVar.r(5);
                if (xVar.e()) {
                    xVar.l();
                    if (xVar.e()) {
                        int iL2 = xVar.l();
                        if (!oVar.f5273c) {
                            oVar.f5280k = false;
                            n nVar = oVar.f5283n;
                            nVar.f5260e = iL2;
                            nVar.f5257b = true;
                            return;
                        }
                        if (xVar.e()) {
                            int iL3 = xVar.l();
                            SparseArray sparseArray = oVar.f5275e;
                            if (sparseArray.indexOfKey(iL3) < 0) {
                                oVar.f5280k = false;
                                return;
                            }
                            p151v2.k kVar = (p151v2.k) sparseArray.get(iL3);
                            p151v2.l lVar = (p151v2.l) oVar.f5274d.get(kVar.f17124a);
                            if (lVar.f17133h) {
                                if (!xVar.d(2)) {
                                    return;
                                } else {
                                    xVar.r(2);
                                }
                            }
                            int i17 = lVar.j;
                            if (xVar.d(i17)) {
                                int i18 = xVar.i(i17);
                                if (!lVar.f17134i) {
                                    if (xVar.d(1)) {
                                        zH = xVar.h();
                                        if (!zH) {
                                            zH2 = false;
                                        } else {
                                            if (!xVar.d(1)) {
                                                return;
                                            }
                                            zH2 = xVar.h();
                                            z4 = true;
                                        }
                                        if (oVar.f5279i == 5) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z7) {
                                            iL = 0;
                                        } else if (!xVar.e()) {
                                            return;
                                        } else {
                                            iL = xVar.l();
                                        }
                                        z8 = kVar.f17125b;
                                        i9 = lVar.f17135k;
                                        if (i9 == 0) {
                                            i12 = lVar.f17136l;
                                            if (!xVar.d(i12)) {
                                                return;
                                            }
                                            i10 = xVar.i(i12);
                                            if (z8 || zH) {
                                                i11 = 0;
                                                iM = 0;
                                                iM2 = 0;
                                            } else {
                                                if (!xVar.e()) {
                                                    return;
                                                }
                                                iM2 = xVar.m();
                                                i11 = 0;
                                                iM = 0;
                                            }
                                        } else if (i9 == 1 || lVar.f17137m) {
                                            i10 = 0;
                                            i11 = 0;
                                            iM = 0;
                                            iM2 = 0;
                                        } else {
                                            if (!xVar.e()) {
                                                return;
                                            }
                                            int iM3 = xVar.m();
                                            if (!z8 || zH) {
                                                i11 = iM3;
                                                i10 = 0;
                                                iM = 0;
                                                iM2 = 0;
                                            } else {
                                                if (!xVar.e()) {
                                                    return;
                                                }
                                                iM = xVar.m();
                                                iM2 = 0;
                                                i11 = iM3;
                                                i10 = 0;
                                            }
                                        }
                                        n nVar2 = oVar.f5283n;
                                        nVar2.f5258c = lVar;
                                        nVar2.f5259d = i16;
                                        nVar2.f5260e = iL2;
                                        nVar2.f5261f = i18;
                                        nVar2.f5262g = iL3;
                                        nVar2.f5263h = zH;
                                        nVar2.f5264i = z4;
                                        nVar2.j = zH2;
                                        nVar2.f5265k = z7;
                                        nVar2.f5266l = iL;
                                        nVar2.f5267m = i10;
                                        nVar2.f5268n = iM2;
                                        nVar2.f5269o = i11;
                                        nVar2.f5270p = iM;
                                        nVar2.f5256a = true;
                                        nVar2.f5257b = true;
                                        oVar.f5280k = false;
                                    }
                                    return;
                                }
                                zH = false;
                                zH2 = false;
                                z4 = zH2;
                                if (oVar.f5279i == 5) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    iL = 0;
                                } else if (!xVar.e()) {
                                    return;
                                } else {
                                    iL = xVar.l();
                                }
                                z8 = kVar.f17125b;
                                i9 = lVar.f17135k;
                                if (i9 == 0) {
                                    i12 = lVar.f17136l;
                                    if (!xVar.d(i12)) {
                                        return;
                                    }
                                    i10 = xVar.i(i12);
                                    if (z8) {
                                    }
                                    i11 = 0;
                                    iM = 0;
                                    iM2 = 0;
                                } else {
                                    if (i9 == 1) {
                                    }
                                    i10 = 0;
                                    i11 = 0;
                                    iM = 0;
                                    iM2 = 0;
                                }
                                n nVar3 = oVar.f5283n;
                                nVar3.f5258c = lVar;
                                nVar3.f5259d = i16;
                                nVar3.f5260e = iL2;
                                nVar3.f5261f = i18;
                                nVar3.f5262g = iL3;
                                nVar3.f5263h = zH;
                                nVar3.f5264i = z4;
                                nVar3.j = zH2;
                                nVar3.f5265k = z7;
                                nVar3.f5266l = iL;
                                nVar3.f5267m = i10;
                                nVar3.f5268n = iM2;
                                nVar3.f5269o = i11;
                                nVar3.f5270p = iM;
                                nVar3.f5256a = true;
                                nVar3.f5257b = true;
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
