package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes4.dex */
public class vy {
    public static long pcc(float f, float f2) {
        return Float.floatToRawIntBits(f2) | (Float.floatToRawIntBits(f) << 32);
    }

    public static long pcc(int i, int i2) {
        return pcc(i, i2);
    }
}
