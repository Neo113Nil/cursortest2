package com.google.android.material.carousel;

import androidx.annotation.FloatRange;

/* loaded from: classes4.dex */
public abstract class g {
    public float a;
    public float b;

    @FloatRange(from = 0.0d, to = 1.0d)
    public static float a(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }
}
