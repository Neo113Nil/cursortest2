package p169z;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18367a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18368b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18369c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18370d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f18371e;

    public t(MotionLayout motionLayout) {
        this.f18371e = motionLayout;
    }

    public final void a() {
        int i7 = this.f18369c;
        MotionLayout motionLayout = this.f18371e;
        if (i7 != -1 || this.f18370d != -1) {
            if (i7 == -1) {
                motionLayout.z(this.f18370d);
            } else {
                int i8 = this.f18370d;
                if (i8 == -1) {
                    motionLayout.w(i7);
                } else {
                    motionLayout.x(i7, i8);
                }
            }
            motionLayout.setState(v.f18373b);
        }
        if (Float.isNaN(this.f18368b)) {
            if (Float.isNaN(this.f18367a)) {
                return;
            }
            motionLayout.setProgress(this.f18367a);
        } else {
            motionLayout.v(this.f18367a, this.f18368b);
            this.f18367a = Float.NaN;
            this.f18368b = Float.NaN;
            this.f18369c = -1;
            this.f18370d = -1;
        }
    }
}
