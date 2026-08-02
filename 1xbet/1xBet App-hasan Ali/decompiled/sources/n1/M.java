package n1;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class M extends N {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f18382e;

    public M(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f18382e = windowInsetsAnimation;
    }

    @Override // n1.N
    public final float a() {
        float alpha;
        alpha = this.f18382e.getAlpha();
        return alpha;
    }

    @Override // n1.N
    public final long b() {
        long durationMillis;
        durationMillis = this.f18382e.getDurationMillis();
        return durationMillis;
    }

    @Override // n1.N
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.f18382e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // n1.N
    public final int d() {
        int typeMask;
        typeMask = this.f18382e.getTypeMask();
        return typeMask;
    }

    @Override // n1.N
    public final void e(float f) {
        this.f18382e.setFraction(f);
    }
}
