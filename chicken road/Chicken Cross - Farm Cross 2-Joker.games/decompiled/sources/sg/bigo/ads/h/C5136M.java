package sg.bigo.ads.h;

import android.view.animation.Interpolator;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.InterpolatorC4950g;

/* renamed from: sg.bigo.ads.h.M, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5136M extends InterpolatorC4950g {
    public final Interpolator c;

    public C5136M(long j, long j2) {
        super(j, 0L, j2);
        this.c = AbstractC4954k.a(2);
    }

    @Override // sg.bigo.ads.K0.InterpolatorC4950g, android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float interpolation = super.getInterpolation(f);
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(interpolation) : interpolation;
    }
}
