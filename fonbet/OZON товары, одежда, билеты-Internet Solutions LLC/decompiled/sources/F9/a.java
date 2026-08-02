package F9;

import h9.c;
import h9.m;
import h9.s;
import java.util.ArrayList;
import java.util.Arrays;
import o9.C8660b;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f9148a = {0, 4, 1, 5};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f9149b = {6, 2, 7, 3};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9150c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f9151d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static b a(c cVar) throws m {
        C8660b a11 = cVar.a();
        ArrayList b11 = b(a11);
        if (b11.isEmpty()) {
            a11 = a11.clone();
            a11.k();
            b11 = b(a11);
        }
        return new b(a11, b11);
    }

    private static ArrayList b(C8660b c8660b) {
        ArrayList arrayList = new ArrayList();
        if (c8660b.g() > 0) {
            int g10 = c8660b.g();
            int j11 = c8660b.j();
            s[] sVarArr = new s[8];
            int i11 = 0;
            int i12 = 0;
            s[] d11 = d(c8660b, g10, j11, 0, 0, f9150c);
            int[] iArr = f9148a;
            for (int i13 = 0; i13 < 4; i13++) {
                sVarArr[iArr[i13]] = d11[i13];
            }
            s sVar = sVarArr[4];
            if (sVar != null) {
                i12 = (int) sVar.b();
                i11 = (int) sVarArr[4].c();
            }
            s[] d12 = d(c8660b, g10, j11, i11, i12, f9151d);
            int[] iArr2 = f9149b;
            for (int i14 = 0; i14 < 4; i14++) {
                sVarArr[iArr2[i14]] = d12[i14];
            }
            if (sVarArr[0] != null || sVarArr[3] != null) {
                arrayList.add(sVarArr);
            }
        }
        return arrayList;
    }

    private static int[] c(C8660b c8660b, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i14 = 0;
        while (c8660b.d(i11, i12) && i11 > 0) {
            int i15 = i14 + 1;
            if (i14 >= 3) {
                break;
            }
            i11--;
            i14 = i15;
        }
        int length = iArr.length;
        int i16 = i11;
        int i17 = 0;
        boolean z11 = false;
        while (i11 < i13) {
            if (c8660b.d(i11, i12) != z11) {
                iArr2[i17] = iArr2[i17] + 1;
            } else {
                if (i17 != length - 1) {
                    i17++;
                } else {
                    if (e(iArr2, iArr) < 0.42f) {
                        return new int[]{i16, i11};
                    }
                    i16 += iArr2[0] + iArr2[1];
                    int i18 = i17 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i18);
                    iArr2[i18] = 0;
                    iArr2[i17] = 0;
                    i17--;
                }
                iArr2[i17] = 1;
                z11 = !z11;
            }
            i11++;
        }
        if (i17 != length - 1 || e(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i16, i11 - 1};
    }

    private static s[] d(C8660b c8660b, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        boolean z11;
        int[] c11;
        s[] sVarArr = new s[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i16 = i13;
        while (true) {
            if (i16 >= i11) {
                i15 = i16;
                z11 = false;
                break;
            }
            int[] c12 = c(c8660b, i14, i16, i12, iArr2, iArr3);
            if (c12 != null) {
                int[] iArr4 = c12;
                while (true) {
                    i15 = i16;
                    if (i15 <= 0 || (c11 = c(c8660b, i14, i15 - 1, i12, iArr, iArr3)) == null) {
                        break;
                    }
                    iArr4 = c11;
                }
                float f7 = i15;
                sVarArr[0] = new s(iArr4[0], f7);
                sVarArr[1] = new s(iArr4[1], f7);
                z11 = true;
            } else {
                i16 += 5;
                iArr2 = iArr;
            }
        }
        int i17 = i15 + 1;
        if (z11) {
            int[] iArr5 = {(int) sVarArr[0].b(), (int) sVarArr[1].b()};
            int i18 = i17;
            int i19 = 0;
            while (i18 < i11) {
                int[] c13 = c(c8660b, iArr5[0], i18, i12, iArr, iArr3);
                if (c13 != null && Math.abs(iArr5[0] - c13[0]) < 5 && Math.abs(iArr5[1] - c13[1]) < 5) {
                    iArr5 = c13;
                    i19 = 0;
                } else {
                    if (i19 > 25) {
                        break;
                    }
                    i19++;
                }
                i18++;
            }
            i17 = i18 - (i19 + 1);
            float f11 = i17;
            sVarArr[2] = new s(iArr5[0], f11);
            sVarArr[3] = new s(iArr5[1], f11);
        }
        if (i17 - i15 < 10) {
            Arrays.fill(sVarArr, (Object) null);
        }
        return sVarArr;
    }

    private static float e(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            i11 += iArr[i13];
            i12 += iArr2[i13];
        }
        if (i11 < i12) {
            return Float.POSITIVE_INFINITY;
        }
        float f7 = i11;
        float f11 = f7 / i12;
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i14 = 0; i14 < length; i14++) {
            float f14 = iArr2[i14] * f11;
            float f15 = iArr[i14];
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f7;
    }
}
