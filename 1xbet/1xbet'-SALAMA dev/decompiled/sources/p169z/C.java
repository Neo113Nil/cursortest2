package p169z;

import I4.j;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;
import p143u.e;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f18235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18236d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f18238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Interpolator f18239g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18241i;
    public float j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f18244m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f18237e = new e(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18240h = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f18243l = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18242k = System.nanoTime();

    public C(j jVar, n nVar, int i7, int i8, int i9, Interpolator interpolator, int i10, int i11) {
        this.f18244m = false;
        this.f18238f = jVar;
        this.f18235c = nVar;
        this.f18236d = i8;
        if (((ArrayList) jVar.f3681e) == null) {
            jVar.f3681e = new ArrayList();
        }
        ((ArrayList) jVar.f3681e).add(this);
        this.f18239g = interpolator;
        this.f18233a = i10;
        this.f18234b = i11;
        if (i9 == 3) {
            this.f18244m = true;
        }
        this.j = i7 == 0 ? Float.MAX_VALUE : 1.0f / i7;
        a();
    }

    public final void a() {
        boolean z4 = this.f18240h;
        j jVar = this.f18238f;
        Interpolator interpolator = this.f18239g;
        n nVar = this.f18235c;
        int i7 = this.f18234b;
        int i8 = this.f18233a;
        if (!z4) {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.f18242k;
            this.f18242k = jNanoTime;
            float f7 = (((float) (j * 1.0E-6d)) * this.j) + this.f18241i;
            this.f18241i = f7;
            if (f7 >= 1.0f) {
                this.f18241i = 1.0f;
            }
            boolean zE = nVar.e(interpolator == null ? this.f18241i : interpolator.getInterpolation(this.f18241i), jNanoTime, nVar.f18322b, this.f18237e);
            if (this.f18241i >= 1.0f) {
                if (i8 != -1) {
                    nVar.f18322b.setTag(i8, Long.valueOf(System.nanoTime()));
                }
                if (i7 != -1) {
                    nVar.f18322b.setTag(i7, null);
                }
                if (!this.f18244m) {
                    ((ArrayList) jVar.f3682f).add(this);
                }
            }
            if (this.f18241i < 1.0f || zE) {
                ((MotionLayout) jVar.f3678b).invalidate();
                return;
            }
            return;
        }
        long jNanoTime2 = System.nanoTime();
        long j3 = jNanoTime2 - this.f18242k;
        this.f18242k = jNanoTime2;
        float f8 = this.f18241i - (((float) (j3 * 1.0E-6d)) * this.j);
        this.f18241i = f8;
        if (f8 < 0.0f) {
            this.f18241i = 0.0f;
        }
        float interpolation = this.f18241i;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        boolean zE2 = nVar.e(interpolation, jNanoTime2, nVar.f18322b, this.f18237e);
        if (this.f18241i <= 0.0f) {
            if (i8 != -1) {
                nVar.f18322b.setTag(i8, Long.valueOf(System.nanoTime()));
            }
            if (i7 != -1) {
                nVar.f18322b.setTag(i7, null);
            }
            ((ArrayList) jVar.f3682f).add(this);
        }
        if (this.f18241i > 0.0f || zE2) {
            ((MotionLayout) jVar.f3678b).invalidate();
        }
    }

    public final void b() {
        this.f18240h = true;
        int i7 = this.f18236d;
        if (i7 != -1) {
            this.j = i7 == 0 ? Float.MAX_VALUE : 1.0f / i7;
        }
        ((MotionLayout) this.f18238f.f3678b).invalidate();
        this.f18242k = System.nanoTime();
    }
}
