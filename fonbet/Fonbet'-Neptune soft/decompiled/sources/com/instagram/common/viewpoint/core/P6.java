package com.instagram.common.viewpoint.core;

import android.view.animation.Interpolator;

/* loaded from: assets/audience_network.dex */
public class P6 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
