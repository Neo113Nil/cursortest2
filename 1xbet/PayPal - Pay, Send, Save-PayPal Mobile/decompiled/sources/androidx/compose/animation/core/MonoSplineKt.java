package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\t\u001a?\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\b"}, d2 = {"", "h", "x", "y1", "y2", "t1", "t2", "hermiteInterpolate", "(FFFFFF)F", "hermiteDifferential"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MonoSplineKt {
    public static final float hermiteDifferential(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 * f2;
        return (f * ((f5 - ((f2 * 2.0f) * ((2.0f * f5) + f6))) + (((f5 + f6) * 3.0f) * f7))) - (((f2 - f7) * 6.0f) * (f3 - f4));
    }

    public static final float hermiteInterpolate(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 * f2;
        float f8 = f7 * f2;
        return ((((f5 * f) * ((f2 - (f7 * 2.0f)) + f8)) + ((f * f6) * (f8 - f7))) + f3) - (((f7 * 3.0f) - (f8 * 2.0f)) * (f3 - f4));
    }
}
