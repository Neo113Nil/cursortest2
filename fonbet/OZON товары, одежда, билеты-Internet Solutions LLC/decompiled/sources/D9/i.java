package D9;

import java.lang.reflect.Array;

/* loaded from: classes9.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final float[][] f6189a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i11;
        for (int i12 = 0; i12 < 2787; i12++) {
            int i13 = C9.a.f4501b[i12];
            int i14 = i13 & 1;
            int i15 = 0;
            while (i15 < 8) {
                float f7 = 0.0f;
                while (true) {
                    i11 = i13 & 1;
                    if (i11 == i14) {
                        f7 += 1.0f;
                        i13 >>= 1;
                    }
                }
                f6189a[i12][7 - i15] = f7 / 17.0f;
                i15++;
                i14 = i11;
            }
        }
    }

    static int a(int[] iArr) {
        float f7 = Ql0.h.f(iArr);
        int[] iArr2 = new int[8];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 17; i13++) {
            float f11 = ((i13 * f7) / 17.0f) + (f7 / 34.0f);
            int i14 = iArr[i12] + i11;
            if (i14 <= f11) {
                i12++;
                i11 = i14;
            }
            iArr2[i12] = iArr2[i12] + 1;
        }
        long j11 = 0;
        for (int i15 = 0; i15 < 8; i15++) {
            for (int i16 = 0; i16 < iArr2[i15]; i16++) {
                j11 = (j11 << 1) | (i15 % 2 == 0 ? 1 : 0);
            }
        }
        int i17 = (int) j11;
        int i18 = -1;
        if (C9.a.a(i17) == -1) {
            i17 = -1;
        }
        if (i17 != -1) {
            return i17;
        }
        int f12 = Ql0.h.f(iArr);
        float[] fArr = new float[8];
        if (f12 > 1) {
            for (int i19 = 0; i19 < 8; i19++) {
                fArr[i19] = iArr[i19] / f12;
            }
        }
        float f13 = Float.MAX_VALUE;
        int i21 = 0;
        while (true) {
            float[][] fArr2 = f6189a;
            if (i21 >= fArr2.length) {
                return i18;
            }
            float[] fArr3 = fArr2[i21];
            float f14 = 0.0f;
            for (int i22 = 0; i22 < 8; i22++) {
                float f15 = fArr3[i22] - fArr[i22];
                f14 += f15 * f15;
                if (f14 >= f13) {
                    break;
                }
            }
            if (f14 < f13) {
                i18 = C9.a.f4501b[i21];
                f13 = f14;
            }
            i21++;
        }
    }
}
