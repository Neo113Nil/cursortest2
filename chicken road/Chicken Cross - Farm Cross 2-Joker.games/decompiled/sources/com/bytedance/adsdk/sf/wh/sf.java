package com.bytedance.adsdk.sf.wh;

/* loaded from: classes4.dex */
public class sf {
    private static float pcc(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float sf(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int pcc(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float sf = sf(((i >> 16) & 255) / 255.0f);
        float sf2 = sf(((i >> 8) & 255) / 255.0f);
        float sf3 = sf((i & 255) / 255.0f);
        float sf4 = sf(((i2 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float sf5 = sf2 + ((sf(((i2 >> 8) & 255) / 255.0f) - sf2) * f);
        float sf6 = sf3 + (f * (sf((i2 & 255) / 255.0f) - sf3));
        return (Math.round(pcc(sf + ((sf4 - sf) * f)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(pcc(sf5) * 255.0f) << 8) | Math.round(pcc(sf6) * 255.0f);
    }
}
