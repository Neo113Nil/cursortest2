package Ql0;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi;
import yl0.InterfaceC10918c;

/* loaded from: classes4.dex */
public final class h implements InterfaceC10918c, zbkf {
    private static int a(int i11, int i12) {
        int i13 = i11 - i12;
        if (i13 > i12) {
            i13 = i12;
            i12 = i13;
        }
        int i14 = 1;
        int i15 = 1;
        while (i11 > i12) {
            i14 *= i11;
            if (i15 <= i13) {
                i14 /= i15;
                i15++;
            }
            i11--;
        }
        while (i15 <= i13) {
            i14 /= i15;
            i15++;
        }
        return i14;
    }

    public static float b(float f7, float f11, float f12, float f13) {
        double d11 = f7 - f12;
        double d12 = f11 - f13;
        return (float) Math.sqrt((d12 * d12) + (d11 * d11));
    }

    public static float c(int i11, int i12, int i13, int i14) {
        double d11 = i11 - i13;
        double d12 = i12 - i14;
        return (float) Math.sqrt((d12 * d12) + (d11 * d11));
    }

    public static int d(int[] iArr, int i11, boolean z11) {
        boolean z12;
        int[] iArr2 = iArr;
        int i12 = 0;
        for (int i13 : iArr2) {
            i12 += i13;
        }
        int length = iArr2.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = length - 1;
            if (i14 >= i17) {
                return i15;
            }
            int i18 = 1 << i14;
            i16 |= i18;
            int i19 = 1;
            while (i19 < iArr2[i14]) {
                int i21 = i12 - i19;
                int i22 = length - i14;
                int i23 = i22 - 2;
                int a11 = a(i21 - 1, i23);
                if (z11 && i16 == 0) {
                    int i24 = i22 - 1;
                    if (i21 - i24 >= i24) {
                        a11 -= a(i21 - i22, i23);
                    }
                }
                boolean z13 = true;
                if (i22 - 1 > 1) {
                    int i25 = i21 - i23;
                    int i26 = 0;
                    while (i25 > i11) {
                        i26 += a((i21 - i25) - 1, i22 - 3);
                        i25--;
                        z13 = z13;
                    }
                    z12 = z13;
                    a11 -= (i17 - i14) * i26;
                } else {
                    z12 = true;
                    if (i21 > i11) {
                        a11--;
                    }
                }
                i15 += a11;
                i19++;
                i16 &= ~i18;
                iArr2 = iArr;
            }
            i12 -= i19;
            i14++;
            iArr2 = iArr;
        }
    }

    public static int e(float f7) {
        return (int) (f7 + (f7 < 0.0f ? -0.5f : 0.5f));
    }

    public static int f(int[] iArr) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        return i11;
    }

    @Override // yl0.InterfaceC10918c
    public void onComplete() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkf
    public Object zba(Object obj) {
        return ((zboi) obj).zbc();
    }
}
