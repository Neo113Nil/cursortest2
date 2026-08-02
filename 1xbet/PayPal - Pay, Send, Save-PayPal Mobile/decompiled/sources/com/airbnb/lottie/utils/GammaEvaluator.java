package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public class GammaEvaluator {
    public static int evaluate(float f, int i, int i2) {
        float f2;
        float pow;
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f3 = ((i >> 24) & 255) / 255.0f;
        float f4 = ((i >> 16) & 255) / 255.0f;
        float f5 = ((i >> 8) & 255) / 255.0f;
        float f6 = (i & 255) / 255.0f;
        float f7 = ((i2 >> 24) & 255) / 255.0f;
        float f8 = ((i2 >> 16) & 255) / 255.0f;
        float f9 = ((i2 >> 8) & 255) / 255.0f;
        float f10 = (i2 & 255) / 255.0f;
        float pow2 = f4 <= 0.04045f ? f4 / 12.92f : (float) java.lang.Math.pow((f4 + 0.055f) / 1.055f, 2.4000000953674316d);
        float pow3 = f5 <= 0.04045f ? f5 / 12.92f : (float) java.lang.Math.pow((f5 + 0.055f) / 1.055f, 2.4000000953674316d);
        if (f6 <= 0.04045f) {
            pow = f6 / 12.92f;
            f2 = 0.055f;
        } else {
            f2 = 0.055f;
            pow = (float) java.lang.Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        float pow4 = f8 <= 0.04045f ? f8 / 12.92f : (float) java.lang.Math.pow((f8 + f2) / 1.055f, 2.4000000953674316d);
        float pow5 = f9 <= 0.04045f ? f9 / 12.92f : (float) java.lang.Math.pow((f9 + f2) / 1.055f, 2.4000000953674316d);
        float pow6 = f10 <= 0.04045f ? f10 / 12.92f : (float) java.lang.Math.pow((f10 + f2) / 1.055f, 2.4000000953674316d);
        float f11 = pow2 + ((pow4 - pow2) * f);
        float f12 = pow3 + ((pow5 - pow3) * f);
        float f13 = pow + ((pow6 - pow) * f);
        return java.lang.Math.round((f13 <= 0.0031308f ? f13 * 12.92f : (float) ((java.lang.Math.pow(f13, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d)) * 255.0f) | (java.lang.Math.round((f3 + ((f7 - f3) * f)) * 255.0f) << 24) | (java.lang.Math.round((f11 <= 0.0031308f ? f11 * 12.92f : (float) ((java.lang.Math.pow(f11, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d)) * 255.0f) << 16) | (java.lang.Math.round((f12 <= 0.0031308f ? f12 * 12.92f : (float) ((java.lang.Math.pow(f12, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d)) * 255.0f) << 8);
    }
}
