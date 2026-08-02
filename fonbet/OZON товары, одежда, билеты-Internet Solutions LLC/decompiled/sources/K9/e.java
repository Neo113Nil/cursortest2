package K9;

import I9.j;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h9.v;
import o9.C8659a;

/* loaded from: classes9.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int[][] f15392a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b, reason: collision with root package name */
    private static final int[][] f15393b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    private static final int[][] f15394c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, UserVerificationMethods.USER_VERIFY_PATTERN, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f15395d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Removed duplicated region for block: B:71:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(C8659a c8659a, I9.f fVar, j jVar, int i11, b bVar) throws v {
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        int e11;
        int i18;
        bVar.a();
        int i19 = 0;
        int length = f15392a[0].length;
        d(0, 0, bVar);
        d(bVar.h() - length, 0, bVar);
        d(0, bVar.h() - length, bVar);
        int i21 = 7;
        c(0, 7, bVar);
        c(bVar.h() - 8, 7, bVar);
        c(0, bVar.h() - 8, bVar);
        e(7, 0, bVar);
        e(bVar.e() - 8, 0, bVar);
        e(7, bVar.e() - 7, bVar);
        if (bVar.b(8, bVar.e() - 8) == 0) {
            throw new v();
        }
        int i22 = 1;
        bVar.i(8, bVar.e() - 8, 1);
        int i23 = 5;
        if (jVar.i() >= 2) {
            int[] iArr = f15394c[jVar.i() - 1];
            int length2 = iArr.length;
            int i24 = 0;
            while (i24 < length2) {
                int i25 = iArr[i24];
                if (i25 >= 0) {
                    int length3 = iArr.length;
                    int i26 = i19;
                    while (i26 < length3) {
                        int i27 = iArr[i26];
                        if (i27 < 0 || !f(bVar.b(i27, i25))) {
                            i12 = i21;
                            i13 = i19;
                        } else {
                            int i28 = i27 - 2;
                            int i29 = i25 - 2;
                            i13 = i19;
                            while (i19 < i23) {
                                int[] iArr2 = f15393b[i19];
                                int i31 = i22;
                                int i32 = i13;
                                while (i32 < i23) {
                                    bVar.i(i28 + i32, i29 + i19, iArr2[i32]);
                                    i32++;
                                    i21 = i21;
                                    i23 = 5;
                                }
                                i19++;
                                i22 = i31;
                                i23 = 5;
                            }
                            i12 = i21;
                        }
                        i26++;
                        i19 = i13;
                        i22 = i22;
                        i21 = i12;
                        i23 = 5;
                    }
                }
                i24++;
                i19 = i19;
                i22 = i22;
                i21 = i21;
                i23 = 5;
            }
        }
        int i33 = i21;
        int i34 = i19;
        int i35 = i22;
        int i36 = 8;
        while (i36 < bVar.h() - 8) {
            int i37 = i36 + 1;
            int i38 = i37 % 2;
            if (f(bVar.b(i36, 6))) {
                bVar.i(i36, 6, i38);
            }
            if (f(bVar.b(6, i36))) {
                bVar.i(6, i36, i38);
            }
            i36 = i37;
        }
        C8659a c8659a2 = new C8659a();
        if (i11 < 0 || i11 >= 8) {
            throw new v("Invalid mask pattern");
        }
        int b11 = (fVar.b() << 3) | i11;
        c8659a2.c(b11, 5);
        c8659a2.c(b(b11, 1335), 10);
        C8659a c8659a3 = new C8659a();
        c8659a3.c(21522, 15);
        c8659a2.p(c8659a3);
        if (c8659a2.j() != 15) {
            throw new v("should not happen but we got: " + c8659a2.j());
        }
        for (int i39 = i34; i39 < c8659a2.j(); i39++) {
            boolean f7 = c8659a2.f((c8659a2.j() - 1) - i39);
            int[] iArr3 = f15395d[i39];
            bVar.j(iArr3[i34], iArr3[i35], f7);
            if (i39 < 8) {
                i18 = (bVar.h() - i39) - 1;
                e11 = 8;
            } else {
                e11 = (i39 - 8) + (bVar.e() - 7);
                i18 = 8;
            }
            bVar.j(i18, e11, f7);
        }
        if (jVar.i() >= i33) {
            C8659a c8659a4 = new C8659a();
            c8659a4.c(jVar.i(), 6);
            c8659a4.c(b(jVar.i(), 7973), 12);
            if (c8659a4.j() != 18) {
                throw new v("should not happen but we got: " + c8659a4.j());
            }
            int i41 = 17;
            for (int i42 = i34; i42 < 6; i42++) {
                for (int i43 = i34; i43 < 3; i43++) {
                    boolean f11 = c8659a4.f(i41);
                    i41--;
                    bVar.j(i42, (bVar.e() - 11) + i43, f11);
                    bVar.j((bVar.e() - 11) + i43, i42, f11);
                }
            }
        }
        int h11 = bVar.h() - 1;
        int e12 = bVar.e() - 1;
        int i44 = -1;
        int i45 = i34;
        while (h11 > 0) {
            if (h11 == 6) {
                h11--;
            }
            while (e12 >= 0 && e12 < bVar.e()) {
                for (int i46 = i34; i46 < 2; i46++) {
                    int i47 = h11 - i46;
                    if (f(bVar.b(i47, e12))) {
                        if (i45 < c8659a.j()) {
                            z11 = c8659a.f(i45);
                            i45++;
                        } else {
                            z11 = i34;
                        }
                        if (i11 != -1) {
                            switch (i11) {
                                case 0:
                                    i14 = e12 + i47;
                                    i15 = i14 & 1;
                                    if ((i15 != 0 ? i35 : i34) != 0) {
                                        z11 = !z11;
                                        break;
                                    }
                                    break;
                                case 1:
                                    i15 = e12 & 1;
                                    if ((i15 != 0 ? i35 : i34) != 0) {
                                    }
                                    break;
                                case 2:
                                    i15 = i47 % 3;
                                    if ((i15 != 0 ? i35 : i34) != 0) {
                                    }
                                    break;
                                case 3:
                                    i15 = (e12 + i47) % 3;
                                    if ((i15 != 0 ? i35 : i34) != 0) {
                                    }
                                    break;
                                case 4:
                                    i15 = ((i47 / 3) + (e12 / 2)) & 1;
                                    if ((i15 != 0 ? i35 : i34) != 0) {
                                    }
                                    break;
                                case 5:
                                    int i48 = e12 * i47;
                                    i15 = (i48 % 3) + (i48 & 1);
                                    if ((i15 != 0 ? i35 : i34) != 0) {
                                    }
                                    break;
                                case 6:
                                    int i49 = e12 * i47;
                                    i16 = i49 & 1;
                                    i17 = i49 % 3;
                                    i14 = i17 + i16;
                                    i15 = i14 & 1;
                                    if ((i15 != 0 ? i35 : i34) != 0) {
                                    }
                                    break;
                                case 7:
                                    i17 = (e12 * i47) % 3;
                                    i16 = (e12 + i47) & 1;
                                    i14 = i17 + i16;
                                    i15 = i14 & 1;
                                    if ((i15 != 0 ? i35 : i34) != 0) {
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i11)));
                            }
                        }
                        bVar.j(i47, e12, z11);
                    }
                }
                e12 += i44;
            }
            i44 = -i44;
            e12 += i44;
            h11 -= 2;
        }
        if (i45 == c8659a.j()) {
            return;
        }
        throw new v("Not all bits consumed: " + i45 + '/' + c8659a.j());
    }

    static int b(int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i12);
        int i13 = 32 - numberOfLeadingZeros;
        int i14 = i11 << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i14) >= i13) {
            i14 ^= i12 << ((32 - Integer.numberOfLeadingZeros(i14)) - i13);
        }
        return i14;
    }

    private static void c(int i11, int i12, b bVar) throws v {
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = i11 + i13;
            if (!f(bVar.b(i14, i12))) {
                throw new v();
            }
            bVar.i(i14, i12, 0);
        }
    }

    private static void d(int i11, int i12, b bVar) {
        for (int i13 = 0; i13 < 7; i13++) {
            int[] iArr = f15392a[i13];
            for (int i14 = 0; i14 < 7; i14++) {
                bVar.i(i11 + i14, i12 + i13, iArr[i14]);
            }
        }
    }

    private static void e(int i11, int i12, b bVar) throws v {
        for (int i13 = 0; i13 < 7; i13++) {
            int i14 = i12 + i13;
            if (!f(bVar.b(i11, i14))) {
                throw new v();
            }
            bVar.i(i11, i14, 0);
        }
    }

    private static boolean f(int i11) {
        return i11 == -1;
    }
}
