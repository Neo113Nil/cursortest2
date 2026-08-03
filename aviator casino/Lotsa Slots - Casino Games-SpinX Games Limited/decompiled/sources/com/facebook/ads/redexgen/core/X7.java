package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class X7 implements android.view.animation.Interpolator {
    public final float A00;

    public X7(float f) {
        this.A00 = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) java.lang.Math.pow(f, this.A00);
    }
}
