package sg.bigo.ads.K0;

import android.view.animation.Interpolator;

/* renamed from: sg.bigo.ads.K0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class InterpolatorC4950g implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float f12358a;
    public final float b;

    public InterpolatorC4950g(long j, long j2, long j3) {
        long j4 = j + j2;
        float f = j3 + j4;
        this.f12358a = (j2 * 1.0f) / f;
        this.b = (j4 * 1.0f) / f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = this.f12358a;
        if (f < f2) {
            return 0.0f;
        }
        float f3 = this.b;
        if (f > f3) {
            return 1.0f;
        }
        return (f - f2) / (f3 - f2);
    }
}
