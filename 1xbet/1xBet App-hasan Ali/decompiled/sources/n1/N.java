package n1;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public final int f18383a;

    /* renamed from: b, reason: collision with root package name */
    public float f18384b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f18385c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18386d;

    public N(int i, Interpolator interpolator, long j5) {
        this.f18383a = i;
        this.f18385c = interpolator;
        this.f18386d = j5;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f18386d;
    }

    public float c() {
        Interpolator interpolator = this.f18385c;
        return interpolator != null ? interpolator.getInterpolation(this.f18384b) : this.f18384b;
    }

    public int d() {
        return this.f18383a;
    }

    public void e(float f) {
        this.f18384b = f;
    }
}
