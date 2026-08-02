package D9;

import java.util.Formatter;

/* loaded from: classes9.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final a f6182a;

    /* renamed from: b, reason: collision with root package name */
    private final g[] f6183b;

    /* renamed from: c, reason: collision with root package name */
    private c f6184c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6185d;

    f(a aVar, c cVar) {
        this.f6182a = aVar;
        int a11 = aVar.a();
        this.f6185d = a11;
        this.f6184c = cVar;
        this.f6183b = new g[a11 + 2];
    }

    final int a() {
        return this.f6185d;
    }

    final int b() {
        return this.f6182a.b();
    }

    final int c() {
        return this.f6182a.c();
    }

    final c d() {
        return this.f6184c;
    }

    final g e(int i11) {
        return this.f6183b[i11];
    }

    final g[] f() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        g[] gVarArr = this.f6183b;
        int i16 = 0;
        g gVar = gVarArr[0];
        a aVar = this.f6182a;
        if (gVar != null) {
            ((h) gVar).g(aVar);
        }
        int i17 = this.f6185d;
        int i18 = i17 + 1;
        g gVar2 = gVarArr[i18];
        if (gVar2 != null) {
            ((h) gVar2).g(aVar);
        }
        int i19 = 928;
        while (true) {
            g gVar3 = gVarArr[i16];
            int i21 = 1;
            if (gVar3 != null && gVarArr[i18] != null) {
                d[] d11 = gVar3.d();
                d[] d12 = gVarArr[i18].d();
                for (int i22 = i16; i22 < d11.length; i22++) {
                    d dVar = d11[i22];
                    if (dVar != null && d12[i22] != null && dVar.c() == d12[i22].c()) {
                        for (int i23 = 1; i23 <= i17; i23++) {
                            d dVar2 = gVarArr[i23].d()[i22];
                            if (dVar2 != null) {
                                dVar2.i(d11[i22].c());
                                if (!dVar2.g()) {
                                    gVarArr[i23].d()[i22] = null;
                                }
                            }
                        }
                    }
                }
            }
            g gVar4 = gVarArr[i16];
            int i24 = 2;
            if (gVar4 == null) {
                i11 = i16;
            } else {
                d[] d13 = gVar4.d();
                int i25 = i16;
                i11 = i25;
                while (i25 < d13.length) {
                    d dVar3 = d13[i25];
                    if (dVar3 != null) {
                        int c11 = dVar3.c();
                        int i26 = i16;
                        for (int i27 = 1; i27 < i18 && i26 < 2; i27++) {
                            d dVar4 = gVarArr[i27].d()[i25];
                            if (dVar4 != null) {
                                if (!dVar4.g()) {
                                    if (dVar4.h(c11)) {
                                        dVar4.i(c11);
                                        i26 = i16;
                                    } else {
                                        i26++;
                                    }
                                }
                                if (!dVar4.g()) {
                                    i11++;
                                }
                            }
                        }
                    }
                    i25++;
                }
            }
            g gVar5 = gVarArr[i18];
            if (gVar5 == null) {
                i12 = i16;
            } else {
                d[] d14 = gVar5.d();
                int i28 = i16;
                i12 = i28;
                while (i28 < d14.length) {
                    d dVar5 = d14[i28];
                    if (dVar5 != null) {
                        int c12 = dVar5.c();
                        int i29 = i16;
                        for (int i31 = i18; i31 > 0 && i29 < 2; i31--) {
                            d dVar6 = gVarArr[i31].d()[i28];
                            if (dVar6 != null) {
                                if (!dVar6.g()) {
                                    if (dVar6.h(c12)) {
                                        dVar6.i(c12);
                                        i29 = i16;
                                    } else {
                                        i29++;
                                    }
                                }
                                if (!dVar6.g()) {
                                    i12++;
                                }
                            }
                        }
                    }
                    i28++;
                }
            }
            int i32 = i11 + i12;
            if (i32 == 0) {
                i13 = i16;
            } else {
                int i33 = 1;
                while (i33 < i18) {
                    d[] d15 = gVarArr[i33].d();
                    int i34 = i16;
                    while (i34 < d15.length) {
                        d dVar7 = d15[i34];
                        if (dVar7 == null || dVar7.g()) {
                            i14 = i16;
                            i15 = i21;
                        } else {
                            d dVar8 = d15[i34];
                            d[] d16 = gVarArr[i33 - 1].d();
                            g gVar6 = gVarArr[i33 + 1];
                            d[] d17 = gVar6 != null ? gVar6.d() : d16;
                            i14 = i16;
                            d[] dVarArr = new d[14];
                            dVarArr[i24] = d16[i34];
                            dVarArr[3] = d17[i34];
                            if (i34 > 0) {
                                int i35 = i34 - 1;
                                dVarArr[i14] = d15[i35];
                                dVarArr[4] = d16[i35];
                                dVarArr[5] = d17[i35];
                            }
                            if (i34 > i21) {
                                int i36 = i34 - 2;
                                dVarArr[8] = d15[i36];
                                dVarArr[10] = d16[i36];
                                dVarArr[11] = d17[i36];
                            }
                            i15 = i21;
                            if (i34 < d15.length - 1) {
                                int i37 = i34 + 1;
                                dVarArr[i15] = d15[i37];
                                dVarArr[6] = d16[i37];
                                dVarArr[7] = d17[i37];
                            }
                            if (i34 < d15.length - i24) {
                                int i38 = i34 + 2;
                                dVarArr[9] = d15[i38];
                                dVarArr[12] = d16[i38];
                                dVarArr[13] = d17[i38];
                            }
                            int i39 = i14;
                            while (true) {
                                if (i39 >= 14) {
                                    break;
                                }
                                d dVar9 = dVarArr[i39];
                                if (dVar9 != null && dVar9.g() && dVar9.a() == dVar8.a()) {
                                    dVar8.i(dVar9.c());
                                    break;
                                }
                                i39++;
                            }
                        }
                        i34++;
                        i16 = i14;
                        i21 = i15;
                        i24 = 2;
                    }
                    i33++;
                    i24 = 2;
                }
                i13 = i16;
                i16 = i32;
            }
            if (i16 <= 0 || i16 >= i19) {
                break;
            }
            i19 = i16;
            i16 = i13;
        }
        return gVarArr;
    }

    final void g(c cVar) {
        this.f6184c = cVar;
    }

    final void h(int i11, g gVar) {
        this.f6183b[i11] = gVar;
    }

    public final String toString() {
        g[] gVarArr = this.f6183b;
        g gVar = gVarArr[0];
        int i11 = this.f6185d;
        if (gVar == null) {
            gVar = gVarArr[i11 + 1];
        }
        Formatter formatter = new Formatter();
        for (int i12 = 0; i12 < gVar.d().length; i12++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i12));
                for (int i13 = 0; i13 < i11 + 2; i13++) {
                    g gVar2 = gVarArr[i13];
                    if (gVar2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        d dVar = gVar2.d()[i12];
                        if (dVar == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
