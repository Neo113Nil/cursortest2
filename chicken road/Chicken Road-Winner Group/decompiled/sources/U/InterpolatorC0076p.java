package U;

import android.view.animation.Interpolator;

/* renamed from: U.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC0076p implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f3 = f - 1.0f;
        return (f3 * f3 * f3 * f3 * f3) + 1.0f;
    }
}
