package v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import w.C1669b;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1657h extends AbstractC1662m {

    /* renamed from: e1, reason: collision with root package name */
    public C1654e[] f17047e1;

    /* renamed from: H0, reason: collision with root package name */
    public int f17026H0 = -1;

    /* renamed from: I0, reason: collision with root package name */
    public int f17027I0 = -1;

    /* renamed from: J0, reason: collision with root package name */
    public int f17028J0 = -1;

    /* renamed from: K0, reason: collision with root package name */
    public int f17029K0 = -1;

    /* renamed from: L0, reason: collision with root package name */
    public int f17030L0 = -1;

    /* renamed from: M0, reason: collision with root package name */
    public int f17031M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    public float f17032N0 = 0.5f;

    /* renamed from: O0, reason: collision with root package name */
    public float f17033O0 = 0.5f;

    /* renamed from: P0, reason: collision with root package name */
    public float f17034P0 = 0.5f;

    /* renamed from: Q0, reason: collision with root package name */
    public float f17035Q0 = 0.5f;

    /* renamed from: R0, reason: collision with root package name */
    public float f17036R0 = 0.5f;

    /* renamed from: S0, reason: collision with root package name */
    public float f17037S0 = 0.5f;

    /* renamed from: T0, reason: collision with root package name */
    public int f17038T0 = 0;

    /* renamed from: U0, reason: collision with root package name */
    public int f17039U0 = 0;

    /* renamed from: V0, reason: collision with root package name */
    public int f17040V0 = 2;
    public int W0 = 2;

    /* renamed from: X0, reason: collision with root package name */
    public int f17041X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f17042Y0 = -1;

    /* renamed from: Z0, reason: collision with root package name */
    public int f17043Z0 = 0;

    /* renamed from: a1, reason: collision with root package name */
    public final ArrayList f17044a1 = new ArrayList();

    /* renamed from: b1, reason: collision with root package name */
    public C1654e[] f17045b1 = null;
    public C1654e[] c1 = null;

    /* renamed from: d1, reason: collision with root package name */
    public int[] f17046d1 = null;

    /* renamed from: f1, reason: collision with root package name */
    public int f17048f1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x075e  */
    @Override // v.AbstractC1662m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        C1656g c1656g;
        int i16;
        char c3;
        int i17;
        char c4;
        int i18;
        int i19;
        EnumC1653d enumC1653d;
        int i20;
        int i21;
        int i22;
        EnumC1653d enumC1653d2;
        C1654e c1654e;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        C1654e c1654e2;
        int i27;
        EnumC1653d enumC1653d3;
        int i28;
        int i29;
        EnumC1653d enumC1653d4;
        int i30;
        int i31;
        EnumC1653d enumC1653d5;
        C1654e c1654e3;
        int i32;
        int i33;
        int i34 = this.f17056v0;
        EnumC1653d enumC1653d6 = EnumC1653d.f16913b;
        EnumC1653d enumC1653d7 = EnumC1653d.f16914c;
        if (i34 > 0) {
            C1654e c1654e4 = this.f16938V;
            B.d dVar = c1654e4 != null ? ((C1655f) c1654e4).f17007y0 : null;
            if (dVar == null) {
                this.f17061D0 = 0;
                this.f17062E0 = 0;
                this.f17060C0 = false;
                return;
            }
            for (int i35 = 0; i35 < this.f17056v0; i35++) {
                C1654e c1654e5 = this.f17055u0[i35];
                if (c1654e5 != null && !(c1654e5 instanceof C1658i)) {
                    EnumC1653d k7 = c1654e5.k(0);
                    EnumC1653d k8 = c1654e5.k(1);
                    if (k7 != enumC1653d7 || c1654e5.f16975r == 1 || k8 != enumC1653d7 || c1654e5.f16977s == 1) {
                        if (k7 == enumC1653d7) {
                            k7 = enumC1653d6;
                        }
                        if (k8 == enumC1653d7) {
                            k8 = enumC1653d6;
                        }
                        C1669b c1669b = this.f17063F0;
                        c1669b.f17214a = k7;
                        c1669b.f17215b = k8;
                        c1669b.f17216c = c1654e5.r();
                        c1669b.f17217d = c1654e5.l();
                        dVar.b(c1654e5, c1669b);
                        c1654e5.P(c1669b.f17218e);
                        c1654e5.M(c1669b.f17219f);
                        c1654e5.J(c1669b.f17220g);
                    }
                }
            }
        }
        int i36 = this.f17058A0;
        int i37 = this.f17059B0;
        int i38 = this.f17065w0;
        int i39 = this.f17066x0;
        int[] iArr2 = new int[2];
        int i40 = (i8 - i36) - i37;
        int i41 = this.f17043Z0;
        if (i41 == 1) {
            i40 = (i10 - i38) - i39;
        }
        int i42 = i40;
        if (i41 == 0) {
            if (this.f17026H0 == -1) {
                this.f17026H0 = 0;
            }
            if (this.f17027I0 == -1) {
                this.f17027I0 = 0;
            }
        } else {
            if (this.f17026H0 == -1) {
                this.f17026H0 = 0;
            }
            if (this.f17027I0 == -1) {
                this.f17027I0 = 0;
            }
        }
        C1654e[] c1654eArr = this.f17055u0;
        int i43 = 0;
        int i44 = 0;
        while (true) {
            i11 = this.f17056v0;
            if (i43 >= i11) {
                break;
            }
            if (this.f17055u0[i43].f16959i0 == 8) {
                i44++;
            }
            i43++;
        }
        if (i44 > 0) {
            c1654eArr = new C1654e[i11 - i44];
            int i45 = 0;
            i11 = 0;
            while (i45 < this.f17056v0) {
                C1654e c1654e6 = this.f17055u0[i45];
                int[] iArr3 = iArr2;
                int i46 = i39;
                if (c1654e6.f16959i0 != 8) {
                    c1654eArr[i11] = c1654e6;
                    i11++;
                }
                i45++;
                iArr2 = iArr3;
                i39 = i46;
            }
        }
        int[] iArr4 = iArr2;
        int i47 = i39;
        int i48 = i11;
        C1654e[] c1654eArr2 = c1654eArr;
        this.f17047e1 = c1654eArr2;
        this.f17048f1 = i48;
        int i49 = this.f17041X0;
        ArrayList arrayList = this.f17044a1;
        if (i49 != 0) {
            C1652c c1652c = this.f16927K;
            C1652c c1652c2 = this.f16926J;
            C1652c c1652c3 = this.f16928L;
            C1652c c1652c4 = this.f16929M;
            if (i49 == 1) {
                C1652c c1652c5 = c1652c2;
                i12 = i38;
                i13 = i37;
                i14 = i36;
                EnumC1653d enumC1653d8 = enumC1653d6;
                EnumC1653d enumC1653d9 = enumC1653d7;
                iArr = iArr4;
                i15 = i47;
                int i50 = this.f17043Z0;
                if (i48 != 0) {
                    arrayList.clear();
                    C1656g c1656g2 = new C1656g(this, i50, this.f16926J, this.f16927K, this.f16928L, this.f16929M, i42);
                    arrayList.add(c1656g2);
                    if (i50 == 0) {
                        i20 = 0;
                        int i51 = 0;
                        int i52 = 0;
                        while (i52 < i48) {
                            C1654e c1654e7 = c1654eArr2[i52];
                            int Y6 = Y(c1654e7, i42);
                            EnumC1653d enumC1653d10 = enumC1653d9;
                            if (c1654e7.f16937U[0] == enumC1653d10) {
                                i20++;
                            }
                            int i53 = i20;
                            boolean z4 = (i51 == i42 || (this.f17038T0 + i51) + Y6 > i42) && c1656g2.f17010b != null;
                            if (!z4 && i52 > 0 && (i24 = this.f17042Y0) > 0 && i52 % i24 == 0) {
                                z4 = true;
                            }
                            if (z4) {
                                int i54 = i50;
                                enumC1653d2 = enumC1653d8;
                                i22 = i50;
                                c1654e = c1654e7;
                                enumC1653d9 = enumC1653d10;
                                i23 = i52;
                                c1656g2 = new C1656g(this, i54, this.f16926J, this.f16927K, this.f16928L, this.f16929M, i42);
                                c1656g2.f17021n = i23;
                                arrayList.add(c1656g2);
                            } else {
                                enumC1653d9 = enumC1653d10;
                                i22 = i50;
                                enumC1653d2 = enumC1653d8;
                                c1654e = c1654e7;
                                i23 = i52;
                                if (i23 > 0) {
                                    i51 = this.f17038T0 + Y6 + i51;
                                    c1656g2.a(c1654e);
                                    i52 = i23 + 1;
                                    i20 = i53;
                                    enumC1653d8 = enumC1653d2;
                                    i50 = i22;
                                }
                            }
                            i51 = Y6;
                            c1656g2.a(c1654e);
                            i52 = i23 + 1;
                            i20 = i53;
                            enumC1653d8 = enumC1653d2;
                            i50 = i22;
                        }
                        i19 = i50;
                        enumC1653d = enumC1653d8;
                    } else {
                        i19 = i50;
                        enumC1653d = enumC1653d8;
                        i20 = 0;
                        int i55 = 0;
                        int i56 = 0;
                        while (i56 < i48) {
                            C1654e c1654e8 = c1654eArr2[i56];
                            int X6 = X(c1654e8, i42);
                            EnumC1653d enumC1653d11 = enumC1653d9;
                            if (c1654e8.f16937U[1] == enumC1653d11) {
                                i20++;
                            }
                            int i57 = i20;
                            boolean z7 = (i55 == i42 || (this.f17039U0 + i55) + X6 > i42) && c1656g2.f17010b != null;
                            if (!z7 && i56 > 0 && (i21 = this.f17042Y0) > 0 && i56 % i21 == 0) {
                                z7 = true;
                            }
                            if (z7) {
                                enumC1653d9 = enumC1653d11;
                                c1656g2 = new C1656g(this, i19, this.f16926J, this.f16927K, this.f16928L, this.f16929M, i42);
                                c1656g2.f17021n = i56;
                                arrayList.add(c1656g2);
                            } else {
                                enumC1653d9 = enumC1653d11;
                                if (i56 > 0) {
                                    i55 = this.f17039U0 + X6 + i55;
                                    c1656g2.a(c1654e8);
                                    i56++;
                                    i20 = i57;
                                }
                            }
                            i55 = X6;
                            c1656g2.a(c1654e8);
                            i56++;
                            i20 = i57;
                        }
                    }
                    int size = arrayList.size();
                    int i58 = this.f17058A0;
                    int i59 = this.f17065w0;
                    int i60 = this.f17059B0;
                    int i61 = this.f17066x0;
                    EnumC1653d[] enumC1653dArr = this.f16937U;
                    EnumC1653d enumC1653d12 = enumC1653d;
                    boolean z8 = enumC1653dArr[0] == enumC1653d12 || enumC1653dArr[1] == enumC1653d12;
                    if (i20 > 0 && z8) {
                        for (int i62 = 0; i62 < size; i62++) {
                            C1656g c1656g3 = (C1656g) arrayList.get(i62);
                            if (i19 == 0) {
                                c1656g3.e(i42 - c1656g3.d());
                            } else {
                                c1656g3.e(i42 - c1656g3.c());
                            }
                        }
                    }
                    C1652c c1652c6 = c1652c;
                    C1652c c1652c7 = c1652c3;
                    C1652c c1652c8 = c1652c4;
                    int i63 = 0;
                    int i64 = 0;
                    for (int i65 = 0; i65 < size; i65++) {
                        C1656g c1656g4 = (C1656g) arrayList.get(i65);
                        if (i19 == 0) {
                            if (i65 < size - 1) {
                                c1652c8 = ((C1656g) arrayList.get(i65 + 1)).f17010b.f16927K;
                                i61 = 0;
                            } else {
                                i61 = this.f17066x0;
                                c1652c8 = c1652c4;
                            }
                            C1652c c1652c9 = c1656g4.f17010b.f16929M;
                            c1656g4.f(i19, c1652c5, c1652c6, c1652c7, c1652c8, i58, i59, i60, i61, i42);
                            int max = Math.max(i63, c1656g4.d());
                            int c7 = c1656g4.c() + i64;
                            if (i65 > 0) {
                                c7 += this.f17039U0;
                            }
                            i63 = max;
                            i64 = c7;
                            c1652c6 = c1652c9;
                            i59 = 0;
                        } else {
                            if (i65 < size - 1) {
                                c1652c7 = ((C1656g) arrayList.get(i65 + 1)).f17010b.f16926J;
                                i60 = 0;
                            } else {
                                i60 = this.f17059B0;
                                c1652c7 = c1652c3;
                            }
                            C1652c c1652c10 = c1656g4.f17010b.f16928L;
                            c1656g4.f(i19, c1652c5, c1652c6, c1652c7, c1652c8, i58, i59, i60, i61, i42);
                            int d7 = c1656g4.d() + i63;
                            int max2 = Math.max(i64, c1656g4.c());
                            if (i65 > 0) {
                                d7 += this.f17038T0;
                            }
                            i64 = max2;
                            c1652c5 = c1652c10;
                            i63 = d7;
                            i58 = 0;
                        }
                    }
                    iArr[0] = i63;
                    iArr[1] = i64;
                }
            } else if (i49 != 2) {
                if (i49 == 3) {
                    int i66 = this.f17043Z0;
                    if (i48 != 0) {
                        arrayList.clear();
                        C1652c c1652c11 = c1652c2;
                        iArr = iArr4;
                        i15 = i47;
                        i12 = i38;
                        i13 = i37;
                        i14 = i36;
                        C1656g c1656g5 = new C1656g(this, i66, this.f16926J, this.f16927K, this.f16928L, this.f16929M, i42);
                        arrayList.add(c1656g5);
                        if (i66 == 0) {
                            int i67 = 0;
                            i29 = 0;
                            int i68 = 0;
                            int i69 = 0;
                            while (i69 < i48) {
                                int i70 = i67 + 1;
                                C1654e c1654e9 = c1654eArr2[i69];
                                int i71 = i42;
                                int Y7 = Y(c1654e9, i71);
                                if (c1654e9.f16937U[0] == enumC1653d7) {
                                    i29++;
                                }
                                int i72 = i29;
                                boolean z9 = (i68 == i71 || (this.f17038T0 + i68) + Y7 > i71) && c1656g5.f17010b != null;
                                if (!z9 && i69 > 0 && (i33 = this.f17042Y0) > 0 && i70 > i33) {
                                    z9 = true;
                                }
                                if (z9) {
                                    int i73 = i66;
                                    i42 = i71;
                                    enumC1653d5 = enumC1653d6;
                                    c1654e3 = c1654e9;
                                    i31 = i66;
                                    i32 = i69;
                                    C1656g c1656g6 = new C1656g(this, i73, this.f16926J, this.f16927K, this.f16928L, this.f16929M, i42);
                                    c1656g6.f17021n = i32;
                                    arrayList.add(c1656g6);
                                    c1656g5 = c1656g6;
                                    i68 = Y7;
                                    i67 = i70;
                                } else {
                                    i42 = i71;
                                    i31 = i66;
                                    enumC1653d5 = enumC1653d6;
                                    c1654e3 = c1654e9;
                                    i32 = i69;
                                    i68 = i32 > 0 ? this.f17038T0 + Y7 + i68 : Y7;
                                    i67 = 0;
                                }
                                c1656g5.a(c1654e3);
                                i69 = i32 + 1;
                                i29 = i72;
                                enumC1653d6 = enumC1653d5;
                                i66 = i31;
                            }
                            i27 = i66;
                            enumC1653d3 = enumC1653d6;
                            i28 = i42;
                        } else {
                            i27 = i66;
                            enumC1653d3 = enumC1653d6;
                            int i74 = 0;
                            int i75 = 0;
                            int i76 = 0;
                            while (i76 < i48) {
                                C1654e c1654e10 = c1654eArr2[i76];
                                int i77 = i42;
                                int X7 = X(c1654e10, i77);
                                if (c1654e10.f16937U[1] == enumC1653d7) {
                                    i74++;
                                }
                                int i78 = i74;
                                boolean z10 = (i75 == i77 || (this.f17039U0 + i75) + X7 > i77) && c1656g5.f17010b != null;
                                if (!z10 && i76 > 0 && (i30 = this.f17042Y0) > 0 && i30 < 0) {
                                    z10 = true;
                                }
                                if (z10) {
                                    enumC1653d4 = enumC1653d7;
                                    C1656g c1656g7 = new C1656g(this, i27, this.f16926J, this.f16927K, this.f16928L, this.f16929M, i77);
                                    c1656g7.f17021n = i76;
                                    arrayList.add(c1656g7);
                                    c1656g5 = c1656g7;
                                } else {
                                    enumC1653d4 = enumC1653d7;
                                    if (i76 > 0) {
                                        i75 = this.f17039U0 + X7 + i75;
                                        c1656g5.a(c1654e10);
                                        i76++;
                                        i42 = i77;
                                        i74 = i78;
                                        enumC1653d7 = enumC1653d4;
                                    }
                                }
                                i75 = X7;
                                c1656g5.a(c1654e10);
                                i76++;
                                i42 = i77;
                                i74 = i78;
                                enumC1653d7 = enumC1653d4;
                            }
                            i28 = i42;
                            i29 = i74;
                        }
                        int size2 = arrayList.size();
                        int i79 = this.f17058A0;
                        int i80 = this.f17065w0;
                        int i81 = this.f17059B0;
                        int i82 = this.f17066x0;
                        EnumC1653d[] enumC1653dArr2 = this.f16937U;
                        EnumC1653d enumC1653d13 = enumC1653d3;
                        boolean z11 = enumC1653dArr2[0] == enumC1653d13 || enumC1653dArr2[1] == enumC1653d13;
                        if (i29 > 0 && z11) {
                            for (int i83 = 0; i83 < size2; i83++) {
                                C1656g c1656g8 = (C1656g) arrayList.get(i83);
                                if (i27 == 0) {
                                    c1656g8.e(i28 - c1656g8.d());
                                } else {
                                    c1656g8.e(i28 - c1656g8.c());
                                }
                            }
                        }
                        int i84 = i79;
                        C1652c c1652c12 = c1652c;
                        C1652c c1652c13 = c1652c3;
                        C1652c c1652c14 = c1652c4;
                        int i85 = 0;
                        int i86 = 0;
                        for (int i87 = 0; i87 < size2; i87++) {
                            C1656g c1656g9 = (C1656g) arrayList.get(i87);
                            if (i27 == 0) {
                                if (i87 < size2 - 1) {
                                    c1652c14 = ((C1656g) arrayList.get(i87 + 1)).f17010b.f16927K;
                                    i82 = 0;
                                } else {
                                    i82 = this.f17066x0;
                                    c1652c14 = c1652c4;
                                }
                                C1652c c1652c15 = c1656g9.f17010b.f16929M;
                                c1656g9.f(i27, c1652c11, c1652c12, c1652c13, c1652c14, i84, i80, i81, i82, i28);
                                int max3 = Math.max(i85, c1656g9.d());
                                int c8 = c1656g9.c() + i86;
                                if (i87 > 0) {
                                    c8 += this.f17039U0;
                                }
                                i85 = max3;
                                i86 = c8;
                                c1652c12 = c1652c15;
                                i80 = 0;
                            } else {
                                if (i87 < size2 - 1) {
                                    c1652c13 = ((C1656g) arrayList.get(i87 + 1)).f17010b.f16926J;
                                    i81 = 0;
                                } else {
                                    i81 = this.f17059B0;
                                    c1652c13 = c1652c3;
                                }
                                C1652c c1652c16 = c1656g9.f17010b.f16928L;
                                c1656g9.f(i27, c1652c11, c1652c12, c1652c13, c1652c14, i84, i80, i81, i82, i28);
                                int d8 = c1656g9.d() + i85;
                                int max4 = Math.max(i86, c1656g9.c());
                                if (i87 > 0) {
                                    d8 += this.f17038T0;
                                }
                                i86 = max4;
                                c1652c11 = c1652c16;
                                i85 = d8;
                                i84 = 0;
                            }
                        }
                        iArr[0] = i85;
                        iArr[1] = i86;
                    }
                }
                i12 = i38;
                i13 = i37;
                i14 = i36;
                iArr = iArr4;
                i15 = i47;
            } else {
                i12 = i38;
                i13 = i37;
                i14 = i36;
                iArr = iArr4;
                i15 = i47;
                int i88 = this.f17043Z0;
                if (i88 == 0) {
                    int i89 = this.f17042Y0;
                    if (i89 <= 0) {
                        int i90 = 0;
                        i26 = 0;
                        for (int i91 = 0; i91 < i48; i91++) {
                            if (i91 > 0) {
                                i90 += this.f17038T0;
                            }
                            C1654e c1654e11 = c1654eArr2[i91];
                            if (c1654e11 != null) {
                                int Y8 = Y(c1654e11, i42) + i90;
                                if (Y8 > i42) {
                                    break;
                                }
                                i26++;
                                i90 = Y8;
                            }
                        }
                    } else {
                        i26 = i89;
                    }
                    i25 = 0;
                } else {
                    i25 = this.f17042Y0;
                    if (i25 <= 0) {
                        int i92 = 0;
                        int i93 = 0;
                        for (int i94 = 0; i94 < i48; i94++) {
                            if (i94 > 0) {
                                i92 += this.f17039U0;
                            }
                            C1654e c1654e12 = c1654eArr2[i94];
                            if (c1654e12 != null) {
                                int X8 = X(c1654e12, i42) + i92;
                                if (X8 > i42) {
                                    break;
                                }
                                i93++;
                                i92 = X8;
                            }
                        }
                        i25 = i93;
                    }
                    i26 = 0;
                }
                if (this.f17046d1 == null) {
                    this.f17046d1 = new int[2];
                }
                boolean z12 = (i25 == 0 && i88 == 1) || (i26 == 0 && i88 == 0);
                while (!z12) {
                    if (i88 == 0) {
                        i25 = (int) Math.ceil(i48 / i26);
                    } else {
                        i26 = (int) Math.ceil(i48 / i25);
                    }
                    C1654e[] c1654eArr3 = this.c1;
                    if (c1654eArr3 == null || c1654eArr3.length < i26) {
                        obj = null;
                        this.c1 = new C1654e[i26];
                    } else {
                        obj = null;
                        Arrays.fill(c1654eArr3, (Object) null);
                    }
                    C1654e[] c1654eArr4 = this.f17045b1;
                    if (c1654eArr4 == null || c1654eArr4.length < i25) {
                        this.f17045b1 = new C1654e[i25];
                    } else {
                        Arrays.fill(c1654eArr4, obj);
                    }
                    for (int i95 = 0; i95 < i26; i95++) {
                        for (int i96 = 0; i96 < i25; i96++) {
                            int i97 = (i96 * i26) + i95;
                            if (i88 == 1) {
                                i97 = (i95 * i25) + i96;
                            }
                            if (i97 < c1654eArr2.length && (c1654e2 = c1654eArr2[i97]) != null) {
                                int Y9 = Y(c1654e2, i42);
                                C1654e c1654e13 = this.c1[i95];
                                if (c1654e13 == null || c1654e13.r() < Y9) {
                                    this.c1[i95] = c1654e2;
                                }
                                int X9 = X(c1654e2, i42);
                                C1654e c1654e14 = this.f17045b1[i96];
                                if (c1654e14 == null || c1654e14.l() < X9) {
                                    this.f17045b1[i96] = c1654e2;
                                }
                            }
                        }
                    }
                    int i98 = 0;
                    for (int i99 = 0; i99 < i26; i99++) {
                        C1654e c1654e15 = this.c1[i99];
                        if (c1654e15 != null) {
                            if (i99 > 0) {
                                i98 += this.f17038T0;
                            }
                            i98 = Y(c1654e15, i42) + i98;
                        }
                    }
                    int i100 = 0;
                    for (int i101 = 0; i101 < i25; i101++) {
                        C1654e c1654e16 = this.f17045b1[i101];
                        if (c1654e16 != null) {
                            if (i101 > 0) {
                                i100 += this.f17039U0;
                            }
                            i100 = X(c1654e16, i42) + i100;
                        }
                    }
                    iArr[0] = i98;
                    iArr[1] = i100;
                    if (i88 == 0) {
                        if (i98 > i42 && i26 > 1) {
                            i26--;
                        }
                        z12 = true;
                    } else {
                        if (i100 > i42 && i25 > 1) {
                            i25--;
                        }
                        z12 = true;
                    }
                }
                int[] iArr5 = this.f17046d1;
                iArr5[0] = i26;
                iArr5[1] = i25;
            }
        } else {
            i12 = i38;
            i13 = i37;
            i14 = i36;
            iArr = iArr4;
            i15 = i47;
            int i102 = this.f17043Z0;
            if (i48 != 0) {
                if (arrayList.size() == 0) {
                    c1656g = new C1656g(this, i102, this.f16926J, this.f16927K, this.f16928L, this.f16929M, i42);
                    arrayList.add(c1656g);
                } else {
                    c1656g = (C1656g) arrayList.get(0);
                    c1656g.f17011c = 0;
                    c1656g.f17010b = null;
                    c1656g.f17019l = 0;
                    c1656g.f17020m = 0;
                    c1656g.f17021n = 0;
                    c1656g.f17022o = 0;
                    c1656g.f17023p = 0;
                    c1656g.f(i102, this.f16926J, this.f16927K, this.f16928L, this.f16929M, this.f17058A0, this.f17065w0, this.f17059B0, this.f17066x0, i42);
                }
                for (int i103 = 0; i103 < i48; i103++) {
                    c1656g.a(c1654eArr2[i103]);
                }
                i16 = 0;
                iArr[0] = c1656g.d();
                c3 = 1;
                iArr[1] = c1656g.c();
                int i104 = iArr[i16] + i14 + i13;
                i17 = iArr[c3] + i12 + i15;
                if (i7 != 1073741824) {
                    i104 = i8;
                    c4 = c3;
                } else {
                    if (i7 != Integer.MIN_VALUE) {
                        c4 = c3;
                        i18 = i9;
                        if (i7 != 0) {
                            i104 = i16;
                        }
                        int min = i18 == 1073741824 ? i10 : i18 == Integer.MIN_VALUE ? Math.min(i17, i10) : i18 == 0 ? i17 : i16;
                        this.f17061D0 = i104;
                        this.f17062E0 = min;
                        P(i104);
                        M(min);
                        this.f17060C0 = this.f17056v0 > 0 ? c4 : i16;
                    }
                    c4 = c3;
                    i104 = Math.min(i104, i8);
                }
                i18 = i9;
                if (i18 == 1073741824) {
                }
                this.f17061D0 = i104;
                this.f17062E0 = min;
                P(i104);
                M(min);
                this.f17060C0 = this.f17056v0 > 0 ? c4 : i16;
            }
        }
        i16 = 0;
        c3 = 1;
        int i1042 = iArr[i16] + i14 + i13;
        i17 = iArr[c3] + i12 + i15;
        if (i7 != 1073741824) {
        }
        i18 = i9;
        if (i18 == 1073741824) {
        }
        this.f17061D0 = i1042;
        this.f17062E0 = min;
        P(i1042);
        M(min);
        this.f17060C0 = this.f17056v0 > 0 ? c4 : i16;
    }

    public final int X(C1654e c1654e, int i7) {
        if (c1654e == null) {
            return 0;
        }
        if (c1654e.f16937U[1] == EnumC1653d.f16914c) {
            int i8 = c1654e.f16977s;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (c1654e.f16986z * i7);
                if (i9 != c1654e.l()) {
                    c1654e.f16954g = true;
                    W(c1654e, c1654e.f16937U[0], c1654e.r(), EnumC1653d.f16912a, i9);
                }
                return i9;
            }
            if (i8 == 1) {
                return c1654e.l();
            }
            if (i8 == 3) {
                return (int) ((c1654e.r() * c1654e.f16941Y) + 0.5f);
            }
        }
        return c1654e.l();
    }

    public final int Y(C1654e c1654e, int i7) {
        if (c1654e == null) {
            return 0;
        }
        if (c1654e.f16937U[0] == EnumC1653d.f16914c) {
            int i8 = c1654e.f16975r;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (c1654e.f16983w * i7);
                if (i9 != c1654e.r()) {
                    c1654e.f16954g = true;
                    W(c1654e, EnumC1653d.f16912a, i9, c1654e.f16937U[1], c1654e.l());
                }
                return i9;
            }
            if (i8 == 1) {
                return c1654e.r();
            }
            if (i8 == 3) {
                return (int) ((c1654e.l() * c1654e.f16941Y) + 0.5f);
            }
        }
        return c1654e.r();
    }

    @Override // v.C1654e
    public final void b(t.c cVar, boolean z4) {
        C1654e c1654e;
        float f7;
        int i7;
        super.b(cVar, z4);
        C1654e c1654e2 = this.f16938V;
        boolean z7 = c1654e2 != null && ((C1655f) c1654e2).f17008z0;
        int i8 = this.f17041X0;
        ArrayList arrayList = this.f17044a1;
        if (i8 != 0) {
            if (i8 == 1) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    ((C1656g) arrayList.get(i9)).b(i9, z7, i9 == size + (-1));
                    i9++;
                }
            } else if (i8 != 2) {
                if (i8 == 3) {
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        ((C1656g) arrayList.get(i10)).b(i10, z7, i10 == size2 + (-1));
                        i10++;
                    }
                }
            } else if (this.f17046d1 != null && this.c1 != null && this.f17045b1 != null) {
                for (int i11 = 0; i11 < this.f17048f1; i11++) {
                    this.f17047e1[i11].E();
                }
                int[] iArr = this.f17046d1;
                int i12 = iArr[0];
                int i13 = iArr[1];
                float f8 = this.f17032N0;
                C1654e c1654e3 = null;
                int i14 = 0;
                while (i14 < i12) {
                    if (z7) {
                        i7 = (i12 - i14) - 1;
                        f7 = 1.0f - this.f17032N0;
                    } else {
                        f7 = f8;
                        i7 = i14;
                    }
                    C1654e c1654e4 = this.c1[i7];
                    if (c1654e4 != null && c1654e4.f16959i0 != 8) {
                        C1652c c1652c = c1654e4.f16926J;
                        if (i14 == 0) {
                            c1654e4.f(c1652c, this.f16926J, this.f17058A0);
                            c1654e4.f16964l0 = this.f17026H0;
                            c1654e4.f16953f0 = f7;
                        }
                        if (i14 == i12 - 1) {
                            c1654e4.f(c1654e4.f16928L, this.f16928L, this.f17059B0);
                        }
                        if (i14 > 0 && c1654e3 != null) {
                            int i15 = this.f17038T0;
                            C1652c c1652c2 = c1654e3.f16928L;
                            c1654e4.f(c1652c, c1652c2, i15);
                            c1654e3.f(c1652c2, c1652c, 0);
                        }
                        c1654e3 = c1654e4;
                    }
                    i14++;
                    f8 = f7;
                }
                for (int i16 = 0; i16 < i13; i16++) {
                    C1654e c1654e5 = this.f17045b1[i16];
                    if (c1654e5 != null && c1654e5.f16959i0 != 8) {
                        C1652c c1652c3 = c1654e5.f16927K;
                        if (i16 == 0) {
                            c1654e5.f(c1652c3, this.f16927K, this.f17065w0);
                            c1654e5.f16966m0 = this.f17027I0;
                            c1654e5.f16955g0 = this.f17033O0;
                        }
                        if (i16 == i13 - 1) {
                            c1654e5.f(c1654e5.f16929M, this.f16929M, this.f17066x0);
                        }
                        if (i16 > 0 && c1654e3 != null) {
                            int i17 = this.f17039U0;
                            C1652c c1652c4 = c1654e3.f16929M;
                            c1654e5.f(c1652c3, c1652c4, i17);
                            c1654e3.f(c1652c4, c1652c3, 0);
                        }
                        c1654e3 = c1654e5;
                    }
                }
                for (int i18 = 0; i18 < i12; i18++) {
                    for (int i19 = 0; i19 < i13; i19++) {
                        int i20 = (i19 * i12) + i18;
                        if (this.f17043Z0 == 1) {
                            i20 = (i18 * i13) + i19;
                        }
                        C1654e[] c1654eArr = this.f17047e1;
                        if (i20 < c1654eArr.length && (c1654e = c1654eArr[i20]) != null && c1654e.f16959i0 != 8) {
                            C1654e c1654e6 = this.c1[i18];
                            C1654e c1654e7 = this.f17045b1[i19];
                            if (c1654e != c1654e6) {
                                c1654e.f(c1654e.f16926J, c1654e6.f16926J, 0);
                                c1654e.f(c1654e.f16928L, c1654e6.f16928L, 0);
                            }
                            if (c1654e != c1654e7) {
                                c1654e.f(c1654e.f16927K, c1654e7.f16927K, 0);
                                c1654e.f(c1654e.f16929M, c1654e7.f16929M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C1656g) arrayList.get(0)).b(0, z7, true);
        }
        this.f17060C0 = false;
    }

    @Override // v.C1659j, v.C1654e
    public final void g(C1654e c1654e, HashMap hashMap) {
        super.g(c1654e, hashMap);
        C1657h c1657h = (C1657h) c1654e;
        this.f17026H0 = c1657h.f17026H0;
        this.f17027I0 = c1657h.f17027I0;
        this.f17028J0 = c1657h.f17028J0;
        this.f17029K0 = c1657h.f17029K0;
        this.f17030L0 = c1657h.f17030L0;
        this.f17031M0 = c1657h.f17031M0;
        this.f17032N0 = c1657h.f17032N0;
        this.f17033O0 = c1657h.f17033O0;
        this.f17034P0 = c1657h.f17034P0;
        this.f17035Q0 = c1657h.f17035Q0;
        this.f17036R0 = c1657h.f17036R0;
        this.f17037S0 = c1657h.f17037S0;
        this.f17038T0 = c1657h.f17038T0;
        this.f17039U0 = c1657h.f17039U0;
        this.f17040V0 = c1657h.f17040V0;
        this.W0 = c1657h.W0;
        this.f17041X0 = c1657h.f17041X0;
        this.f17042Y0 = c1657h.f17042Y0;
        this.f17043Z0 = c1657h.f17043Z0;
    }
}
