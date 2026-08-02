package androidx.compose.ui.platform;

import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5248g1 {
    public static final boolean a(@NotNull float[] fArr, @NotNull float[] fArr2) {
        float f7 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f21 = fArr[10];
        float f22 = fArr[11];
        float f23 = fArr[12];
        float f24 = fArr[13];
        float f25 = fArr[14];
        float f26 = fArr[15];
        float f27 = (f7 * f15) - (f11 * f14);
        float f28 = (f7 * f16) - (f12 * f14);
        float f29 = (f7 * f17) - (f13 * f14);
        float f31 = (f11 * f16) - (f12 * f15);
        float f32 = (f11 * f17) - (f13 * f15);
        float f33 = (f12 * f17) - (f13 * f16);
        float f34 = (f18 * f24) - (f19 * f23);
        float f35 = (f18 * f25) - (f21 * f23);
        float f36 = (f18 * f26) - (f22 * f23);
        float f37 = (f19 * f25) - (f21 * f24);
        float f38 = (f19 * f26) - (f22 * f24);
        float f39 = (f21 * f26) - (f22 * f25);
        float f41 = (f33 * f34) + (((f31 * f36) + ((f29 * f37) + ((f27 * f39) - (f28 * f38)))) - (f32 * f35));
        if (f41 == 0.0f) {
            return false;
        }
        float f42 = 1.0f / f41;
        fArr2[0] = ((f17 * f37) + ((f15 * f39) - (f16 * f38))) * f42;
        fArr2[1] = (((f12 * f38) + ((-f11) * f39)) - (f13 * f37)) * f42;
        fArr2[2] = ((f26 * f31) + ((f24 * f33) - (f25 * f32))) * f42;
        fArr2[3] = (((f21 * f32) + ((-f19) * f33)) - (f22 * f31)) * f42;
        float f43 = -f14;
        fArr2[4] = (((f16 * f36) + (f43 * f39)) - (f17 * f35)) * f42;
        fArr2[5] = ((f13 * f35) + ((f39 * f7) - (f12 * f36))) * f42;
        float f44 = -f23;
        fArr2[6] = (((f25 * f29) + (f44 * f33)) - (f26 * f28)) * f42;
        fArr2[7] = ((f22 * f28) + ((f33 * f18) - (f21 * f29))) * f42;
        fArr2[8] = ((f17 * f34) + ((f14 * f38) - (f15 * f36))) * f42;
        fArr2[9] = (((f36 * f11) + ((-f7) * f38)) - (f13 * f34)) * f42;
        fArr2[10] = ((f26 * f27) + ((f23 * f32) - (f24 * f29))) * f42;
        fArr2[11] = (((f29 * f19) + ((-f18) * f32)) - (f22 * f27)) * f42;
        fArr2[12] = (((f15 * f35) + (f43 * f37)) - (f16 * f34)) * f42;
        fArr2[13] = ((f12 * f34) + ((f7 * f37) - (f11 * f35))) * f42;
        fArr2[14] = (((f24 * f28) + (f44 * f31)) - (f25 * f27)) * f42;
        fArr2[15] = ((f21 * f27) + ((f18 * f31) - (f19 * f28))) * f42;
        return true;
    }
}
