package p169z;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class q extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18348a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18349b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f18351d;

    public q(MotionLayout motionLayout) {
        this.f18351d = motionLayout;
    }

    @Override // p169z.o
    public final float a() {
        return this.f18351d.f8840M;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        float f8 = this.f18348a;
        MotionLayout motionLayout = this.f18351d;
        if (f8 > 0.0f) {
            float f9 = this.f18350c;
            if (f8 / f9 < f7) {
                f7 = f8 / f9;
            }
            motionLayout.f8840M = f8 - (f9 * f7);
            return ((f8 * f7) - (((f9 * f7) * f7) / 2.0f)) + this.f18349b;
        }
        float f10 = this.f18350c;
        if ((-f8) / f10 < f7) {
            f7 = (-f8) / f10;
        }
        motionLayout.f8840M = (f10 * f7) + f8;
        return (((f10 * f7) * f7) / 2.0f) + (f8 * f7) + this.f18349b;
    }
}
