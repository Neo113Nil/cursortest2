package t;

import a.AbstractC0444a;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2390b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f19358a;

    static {
        float f;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float[] fArr = new float[101];
        f19358a = fArr;
        float[] fArr2 = new float[101];
        float f13 = 0.0f;
        int i = 0;
        float f14 = 0.0f;
        while (true) {
            float f15 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f16 = i / 100;
            float f17 = 1.0f;
            while (true) {
                f = ((f17 - f13) / 2.0f) + f13;
                f5 = f15 - f;
                f6 = f * 3.0f * f5;
                f7 = f * f * f;
                float f18 = (((f * 0.35000002f) + (f5 * 0.175f)) * f6) + f7;
                f8 = f15;
                if (Math.abs(f18 - f16) < 1.0E-5d) {
                    break;
                }
                if (f18 > f16) {
                    f17 = f;
                } else {
                    f13 = f;
                }
                f15 = f8;
            }
            float f19 = 0.5f;
            fArr[i] = (((f5 * 0.5f) + f) * f6) + f7;
            float f20 = f8;
            while (true) {
                f9 = ((f20 - f14) / 2.0f) + f14;
                f10 = f8 - f9;
                f11 = f9 * 3.0f * f10;
                f12 = f9 * f9 * f9;
                float f21 = (((f10 * f19) + f9) * f11) + f12;
                float f22 = f20;
                if (Math.abs(f21 - f16) >= 1.0E-5d) {
                    if (f21 > f16) {
                        f20 = f9;
                    } else {
                        f14 = f9;
                        f20 = f22;
                    }
                    f19 = 0.5f;
                }
            }
            fArr2[i] = (((f9 * 0.35000002f) + (f10 * 0.175f)) * f11) + f12;
            i++;
        }
    }

    public static C2389a a(float f) {
        float f5 = 0.0f;
        float f6 = 1.0f;
        float s2 = AbstractC0444a.s(f, 0.0f, 1.0f);
        float f7 = 100;
        int i = (int) (f7 * s2);
        if (i < 100) {
            float f8 = i / f7;
            int i5 = i + 1;
            float f9 = i5 / f7;
            float[] fArr = f19358a;
            float f10 = fArr[i];
            float f11 = (fArr[i5] - f10) / (f9 - f8);
            float f12 = ((s2 - f8) * f11) + f10;
            f5 = f11;
            f6 = f12;
        }
        return new C2389a(f6, f5);
    }
}
