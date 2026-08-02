package z;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public float f18361a = Float.NaN;

    /* renamed from: b, reason: collision with root package name */
    public float f18362b = Float.NaN;

    /* renamed from: c, reason: collision with root package name */
    public int f18363c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f18364d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f18365e;

    public t(MotionLayout motionLayout) {
        this.f18365e = motionLayout;
    }

    public final void a() {
        int i7 = this.f18363c;
        MotionLayout motionLayout = this.f18365e;
        if (i7 != -1 || this.f18364d != -1) {
            if (i7 == -1) {
                motionLayout.z(this.f18364d);
            } else {
                int i8 = this.f18364d;
                if (i8 == -1) {
                    motionLayout.w(i7);
                } else {
                    motionLayout.x(i7, i8);
                }
            }
            motionLayout.setState(v.f18367b);
        }
        if (Float.isNaN(this.f18362b)) {
            if (Float.isNaN(this.f18361a)) {
                return;
            }
            motionLayout.setProgress(this.f18361a);
        } else {
            motionLayout.v(this.f18361a, this.f18362b);
            this.f18361a = Float.NaN;
            this.f18362b = Float.NaN;
            this.f18363c = -1;
            this.f18364d = -1;
        }
    }
}
