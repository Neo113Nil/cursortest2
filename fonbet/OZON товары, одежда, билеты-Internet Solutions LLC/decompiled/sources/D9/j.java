package D9;

import h9.m;
import h9.s;
import java.lang.reflect.Array;
import java.util.ArrayList;
import o9.C8660b;
import o9.C8663e;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final E9.a f6190a = new E9.a();

    private static c a(h hVar) throws m {
        int[] i11;
        if (hVar == null || (i11 = hVar.i()) == null) {
            return null;
        }
        int i12 = -1;
        int i13 = 0;
        for (int i14 : i11) {
            i12 = Math.max(i12, i14);
        }
        int i15 = 0;
        for (int i16 : i11) {
            i15 += i12 - i16;
            if (i16 > 0) {
                break;
            }
        }
        d[] d11 = hVar.d();
        for (int i17 = 0; i15 > 0 && d11[i17] == null; i17++) {
            i15--;
        }
        for (int length = i11.length - 1; length >= 0; length--) {
            int i18 = i11[length];
            i13 += i12 - i18;
            if (i18 > 0) {
                break;
            }
        }
        for (int length2 = d11.length - 1; i13 > 0 && d11[length2] == null; length2--) {
            i13--;
        }
        return hVar.a().a(i15, i13, hVar.j());
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0067, code lost:
    
        if (r1.c() != r2.c()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a2, code lost:
    
        r1 = r12.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a6, code lost:
    
        if (r4 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a8, code lost:
    
        r1 = r1.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ad, code lost:
    
        r1 = r1.d();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x037e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C8663e b(C8660b c8660b, s sVar, s sVar2, s sVar3, s sVar4, int i11, int i12) throws m, h9.h, h9.d {
        c cVar;
        a h11;
        f fVar;
        int i13;
        int c11;
        int i14;
        d dVar;
        int i15;
        int d11;
        char c12;
        int i16;
        g gVar;
        int i17;
        int i18;
        int i19 = 1;
        c cVar2 = new c(c8660b, sVar, sVar2, sVar3, sVar4);
        boolean z11 = true;
        h hVar = null;
        h hVar2 = null;
        while (true) {
            if (sVar != null) {
                hVar = e(c8660b, cVar2, sVar, true, i11, i12);
            }
            if (sVar3 != null) {
                hVar2 = e(c8660b, cVar2, sVar3, false, i11, i12);
            }
            cVar = cVar2;
            if (hVar != null || hVar2 != null) {
                if (hVar == null || (h11 = hVar.h()) == null) {
                    if (hVar2 != null) {
                        h11 = hVar2.h();
                        if (h11 != null) {
                            fVar = new f(h11, c.j(a(hVar), a(hVar2)));
                            if (fVar != null) {
                                throw m.a();
                            }
                            cVar2 = fVar.d();
                            i13 = 0;
                            if (!z11 || cVar2 == null || (cVar2.g() >= cVar.g() && cVar2.e() <= cVar.e())) {
                                break;
                            }
                            z11 = false;
                        }
                    }
                    h11 = null;
                    if (h11 != null) {
                    }
                } else {
                    if (hVar2 != null) {
                        a h12 = hVar2.h();
                        if (h12 != null) {
                            if (h11.a() != h12.a()) {
                                if (h11.b() != h12.b()) {
                                }
                            }
                        }
                    }
                    if (h11 != null) {
                    }
                }
            }
            fVar = null;
            if (fVar != null) {
            }
        }
        fVar.g(cVar);
        int a11 = fVar.a() + 1;
        fVar.h(0, hVar);
        fVar.h(a11, hVar2);
        boolean z12 = hVar != null;
        int i21 = i11;
        int i22 = i12;
        int i23 = 1;
        while (i23 <= a11) {
            int i24 = z12 ? i23 : a11 - i23;
            if (fVar.e(i24) == null) {
                g hVar3 = (i24 == 0 || i24 == a11) ? new h(cVar, i24 == 0 ? i19 : i13) : new g(cVar);
                fVar.h(i24, hVar3);
                int g10 = cVar.g();
                int i25 = i21;
                int i26 = i22;
                int i27 = -1;
                while (g10 <= cVar.e()) {
                    int i28 = z12 ? i19 : -1;
                    int i29 = i24 - i28;
                    if (i29 >= 0) {
                        i14 = i13;
                        if (i29 <= fVar.a() + 1) {
                            dVar = fVar.e(i29).b(g10);
                            if (dVar == null) {
                                d11 = z12 ? dVar.b() : dVar.d();
                            } else {
                                d c13 = fVar.e(i24).c(g10);
                                if (c13 != null) {
                                    d11 = z12 ? c13.d() : c13.b();
                                } else {
                                    if (i29 >= 0) {
                                        i15 = i19;
                                        if (i29 <= fVar.a() + 1) {
                                            c13 = fVar.e(i29).c(g10);
                                        }
                                    } else {
                                        i15 = i19;
                                    }
                                    if (c13 != null) {
                                        d11 = z12 ? c13.b() : c13.d();
                                    } else {
                                        int i31 = i14;
                                        int i32 = i24;
                                        while (true) {
                                            i32 -= i28;
                                            if (i32 < 0 || i32 > fVar.a() + 1) {
                                                break;
                                            }
                                            d[] d12 = fVar.e(i32).d();
                                            int length = d12.length;
                                            int i33 = i28;
                                            for (int i34 = i14; i34 < length; i34++) {
                                                d dVar2 = d12[i34];
                                                if (dVar2 != null) {
                                                    d11 = (z12 ? dVar2.b() : dVar2.d()) + ((dVar2.b() - dVar2.d()) * i33 * i31);
                                                }
                                            }
                                            i31++;
                                            i28 = i33;
                                        }
                                    }
                                    if (d11 >= 0 || d11 > cVar.d()) {
                                        c12 = 65535;
                                        if (i27 != -1) {
                                            i17 = g10;
                                            i18 = i27;
                                        } else {
                                            i16 = i24;
                                            gVar = hVar3;
                                            i17 = g10;
                                            g10 = i17 + 1;
                                            i13 = i14;
                                            i24 = i16;
                                            hVar3 = gVar;
                                            i19 = i15;
                                        }
                                    } else {
                                        i17 = g10;
                                        i18 = d11;
                                        c12 = 65535;
                                    }
                                    i16 = i24;
                                    gVar = hVar3;
                                    d d13 = d(c8660b, cVar.f(), cVar.d(), z12, i18, i17, i25, i26);
                                    if (d13 != null) {
                                        gVar.f(i17, d13);
                                        i25 = Math.min(i25, d13.f());
                                        i26 = Math.max(i26, d13.f());
                                        i27 = i18;
                                    }
                                    g10 = i17 + 1;
                                    i13 = i14;
                                    i24 = i16;
                                    hVar3 = gVar;
                                    i19 = i15;
                                }
                            }
                            i15 = i19;
                            if (d11 >= 0) {
                            }
                            c12 = 65535;
                            if (i27 != -1) {
                            }
                        }
                    } else {
                        i14 = i13;
                    }
                    dVar = null;
                    if (dVar == null) {
                    }
                    i15 = i19;
                    if (d11 >= 0) {
                    }
                    c12 = 65535;
                    if (i27 != -1) {
                    }
                }
                i21 = i25;
                i22 = i26;
            }
            i23++;
            i13 = i13;
            i19 = i19;
        }
        int i35 = i19;
        int i36 = i13;
        int c14 = fVar.c();
        int[] iArr = new int[2];
        iArr[i35] = fVar.a() + 2;
        iArr[i36] = c14;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, iArr);
        for (int i37 = i36; i37 < bVarArr.length; i37++) {
            int i38 = i36;
            while (true) {
                b[] bVarArr2 = bVarArr[i37];
                if (i38 < bVarArr2.length) {
                    bVarArr2[i38] = new b();
                    i38++;
                }
            }
        }
        g[] f7 = fVar.f();
        int length2 = f7.length;
        int i39 = i36;
        int i41 = i39;
        while (i39 < length2) {
            g gVar2 = f7[i39];
            if (gVar2 != null) {
                d[] d14 = gVar2.d();
                int length3 = d14.length;
                for (int i42 = i36; i42 < length3; i42++) {
                    d dVar3 = d14[i42];
                    if (dVar3 != null && (c11 = dVar3.c()) >= 0 && c11 < bVarArr.length) {
                        bVarArr[c11][i41].b(dVar3.e());
                    }
                }
            }
            i41++;
            i39++;
        }
        b bVar = bVarArr[i36][i35];
        int[] a12 = bVar.a();
        int a13 = (fVar.a() * fVar.c()) - (2 << fVar.b());
        if (a12.length == 0) {
            if (a13 <= 0 || a13 > 928) {
                throw m.a();
            }
            bVar.b(a13);
        } else if (a12[i36] != a13 && a13 > 0 && a13 <= 928) {
            bVar.b(a13);
        }
        ArrayList arrayList = new ArrayList();
        int[] iArr2 = new int[fVar.c() * fVar.a()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i43 = i36;
        while (i43 < fVar.c()) {
            int i44 = i36;
            while (i44 < fVar.a()) {
                int i45 = i44 + 1;
                int[] a14 = bVarArr[i43][i45].a();
                int a15 = (fVar.a() * i43) + i44;
                if (a14.length == 0) {
                    arrayList.add(Integer.valueOf(a15));
                } else if (a14.length == i35) {
                    iArr2[a15] = a14[i36];
                } else {
                    arrayList3.add(Integer.valueOf(a15));
                    arrayList2.add(a14);
                }
                i44 = i45;
                i35 = 1;
            }
            i43++;
            i35 = 1;
        }
        int size = arrayList2.size();
        int[][] iArr3 = new int[size][];
        for (int i46 = i36; i46 < size; i46++) {
            iArr3[i46] = (int[]) arrayList2.get(i46);
        }
        int b11 = fVar.b();
        int[] b12 = C9.a.b(arrayList);
        int[] b13 = C9.a.b(arrayList3);
        int length4 = b13.length;
        int[] iArr4 = new int[length4];
        int i47 = 100;
        while (true) {
            int i48 = i47 - 1;
            if (i47 <= 0) {
                throw h9.d.a();
            }
            for (int i49 = i36; i49 < length4; i49++) {
                iArr2[b13[i49]] = iArr3[i49][iArr4[i49]];
            }
            try {
                return c(iArr2, b11, b12);
            } catch (h9.d unused) {
                if (length4 == 0) {
                    throw h9.d.a();
                }
                int i51 = i36;
                while (true) {
                    if (i51 >= length4) {
                        break;
                    }
                    int i52 = iArr4[i51];
                    if (i52 < iArr3[i51].length - 1) {
                        iArr4[i51] = i52 + 1;
                        break;
                    }
                    iArr4[i51] = i36;
                    if (i51 == length4 - 1) {
                        throw h9.d.a();
                    }
                    i51++;
                }
                i47 = i48;
            }
        }
    }

    private static C8663e c(int[] iArr, int i11, int[] iArr2) throws h9.h, h9.d {
        if (iArr.length == 0) {
            throw h9.h.a();
        }
        int i12 = 1 << (i11 + 1);
        if (iArr2.length > (i12 / 2) + 3 || i12 < 0 || i12 > 512) {
            throw h9.d.a();
        }
        f6190a.a(iArr, i12, iArr2);
        if (iArr.length < 4) {
            throw h9.h.a();
        }
        int i13 = iArr[0];
        if (i13 > iArr.length) {
            throw h9.h.a();
        }
        if (i13 == 0) {
            if (i12 >= iArr.length) {
                throw h9.h.a();
            }
            iArr[0] = iArr.length - i12;
        }
        return e.a(String.valueOf(i11), iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[EDGE_INSN: B:32:0x0060->B:33:0x0060 BREAK  A[LOOP:2: B:20:0x0045->B:28:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static d d(C8660b c8660b, int i11, int i12, boolean z11, int i13, int i14, int i15, int i16) {
        int i17;
        int a11;
        int a12;
        int i18 = i11;
        int i19 = z11 ? -1 : 1;
        boolean z12 = z11;
        int i21 = i13;
        int i22 = 0;
        loop0: while (true) {
            if (i22 >= 2) {
                break;
            }
            while (true) {
                if (!z12) {
                    if (i21 >= i12) {
                        break;
                    }
                    if (z12 != c8660b.d(i21, i14)) {
                        break;
                    }
                } else {
                    if (i21 < i18) {
                        break;
                    }
                    if (z12 != c8660b.d(i21, i14)) {
                        if (Math.abs(i13 - i21) > 2) {
                            i21 = i13;
                            break loop0;
                        }
                        i21 += i19;
                    }
                }
            }
            i19 = -i19;
            z12 = !z12;
            i22++;
        }
        int[] iArr = new int[8];
        int i23 = z11 ? 1 : -1;
        boolean z13 = z11;
        int i24 = 0;
        int i25 = i21;
        while (true) {
            if (z11) {
                if (i25 >= i12) {
                    break;
                }
                if (i24 < 8) {
                    break;
                }
                if (c8660b.d(i25, i14) == z13) {
                    iArr[i24] = iArr[i24] + 1;
                    i25 += i23;
                } else {
                    i24++;
                    z13 = !z13;
                }
            } else {
                if (i25 < i18) {
                    break;
                }
                if (i24 < 8) {
                }
            }
        }
        int i26 = 7;
        if (i24 != 8) {
            if (z11) {
                i18 = i12;
            }
            if (i25 != i18 || i24 != 7) {
                iArr = null;
            }
        }
        if (iArr != null) {
            int f7 = Ql0.h.f(iArr);
            if (z11) {
                i17 = i21 + f7;
            } else {
                for (int i27 = 0; i27 < iArr.length / 2; i27++) {
                    int i28 = iArr[i27];
                    iArr[i27] = iArr[(iArr.length - 1) - i27];
                    iArr[(iArr.length - 1) - i27] = i28;
                }
                int i29 = i21;
                i21 -= f7;
                i17 = i29;
            }
            if (i15 - 2 <= f7 && f7 <= i16 + 2 && (a12 = C9.a.a((a11 = i.a(iArr)))) != -1) {
                int[] iArr2 = new int[8];
                int i31 = 0;
                while (true) {
                    int i32 = a11 & 1;
                    if (i32 != i31) {
                        i26--;
                        if (i26 < 0) {
                            return new d(i21, i17, ((((iArr2[0] - iArr2[2]) + iArr2[4]) - iArr2[6]) + 9) % 9, a12);
                        }
                        i31 = i32;
                    }
                    iArr2[i26] = iArr2[i26] + 1;
                    a11 >>= 1;
                }
            }
        }
        return null;
    }

    private static h e(C8660b c8660b, c cVar, s sVar, boolean z11, int i11, int i12) {
        h hVar = new h(cVar, z11);
        int i13 = 0;
        while (i13 < 2) {
            int i14 = i13 == 0 ? 1 : -1;
            int b11 = (int) sVar.b();
            for (int c11 = (int) sVar.c(); c11 <= cVar.e() && c11 >= cVar.g(); c11 += i14) {
                d d11 = d(c8660b, 0, c8660b.j(), z11, b11, c11, i11, i12);
                if (d11 != null) {
                    hVar.f(c11, d11);
                    b11 = z11 ? d11.d() : d11.b();
                }
            }
            i13++;
        }
        return hVar;
    }
}
