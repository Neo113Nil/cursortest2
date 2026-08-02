package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class ReversableAnimatedValueInterpolator implements android.animation.TimeInterpolator {
    private final android.animation.TimeInterpolator sourceInterpolator;

    public ReversableAnimatedValueInterpolator(android.animation.TimeInterpolator timeInterpolator) {
        this.sourceInterpolator = timeInterpolator;
    }

    public static android.animation.TimeInterpolator of(boolean z, android.animation.TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new com.google.android.material.internal.ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.sourceInterpolator.getInterpolation(f);
    }
}
