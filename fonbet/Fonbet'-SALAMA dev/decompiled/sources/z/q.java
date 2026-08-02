package z;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes.dex */
public final class q extends o {

    /* renamed from: a, reason: collision with root package name */
    public float f18342a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f18343b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f18344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f18345d;

    public q(MotionLayout motionLayout) {
        this.f18345d = motionLayout;
    }

    @Override // z.o
    public final float a() {
        return this.f18345d.f8840M;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        float f8 = this.f18342a;
        MotionLayout motionLayout = this.f18345d;
        if (f8 > 0.0f) {
            float f9 = this.f18344c;
            if (f8 / f9 < f7) {
                f7 = f8 / f9;
            }
            motionLayout.f8840M = f8 - (f9 * f7);
            return ((f8 * f7) - (((f9 * f7) * f7) / 2.0f)) + this.f18343b;
        }
        float f10 = this.f18344c;
        if ((-f8) / f10 < f7) {
            f7 = (-f8) / f10;
        }
        motionLayout.f8840M = (f10 * f7) + f8;
        return (((f10 * f7) * f7) / 2.0f) + (f8 * f7) + this.f18343b;
    }
}
