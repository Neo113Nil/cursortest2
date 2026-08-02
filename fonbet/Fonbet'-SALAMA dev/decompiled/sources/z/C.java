package z;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;
import u.C1616e;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final int f18227a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18228b;

    /* renamed from: c, reason: collision with root package name */
    public final n f18229c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18230d;

    /* renamed from: f, reason: collision with root package name */
    public final I4.j f18232f;

    /* renamed from: g, reason: collision with root package name */
    public final Interpolator f18233g;

    /* renamed from: i, reason: collision with root package name */
    public float f18235i;
    public float j;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f18238m;

    /* renamed from: e, reason: collision with root package name */
    public final C1616e f18231e = new C1616e(1);

    /* renamed from: h, reason: collision with root package name */
    public boolean f18234h = false;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f18237l = new Rect();

    /* renamed from: k, reason: collision with root package name */
    public long f18236k = System.nanoTime();

    public C(I4.j jVar, n nVar, int i7, int i8, int i9, Interpolator interpolator, int i10, int i11) {
        this.f18238m = false;
        this.f18232f = jVar;
        this.f18229c = nVar;
        this.f18230d = i8;
        if (((ArrayList) jVar.f3681e) == null) {
            jVar.f3681e = new ArrayList();
        }
        ((ArrayList) jVar.f3681e).add(this);
        this.f18233g = interpolator;
        this.f18227a = i10;
        this.f18228b = i11;
        if (i9 == 3) {
            this.f18238m = true;
        }
        this.j = i7 == 0 ? Float.MAX_VALUE : 1.0f / i7;
        a();
    }

    public final void a() {
        boolean z4 = this.f18234h;
        I4.j jVar = this.f18232f;
        Interpolator interpolator = this.f18233g;
        n nVar = this.f18229c;
        int i7 = this.f18228b;
        int i8 = this.f18227a;
        if (!z4) {
            long nanoTime = System.nanoTime();
            long j = nanoTime - this.f18236k;
            this.f18236k = nanoTime;
            float f7 = (((float) (j * 1.0E-6d)) * this.j) + this.f18235i;
            this.f18235i = f7;
            if (f7 >= 1.0f) {
                this.f18235i = 1.0f;
            }
            boolean e7 = nVar.e(interpolator == null ? this.f18235i : interpolator.getInterpolation(this.f18235i), nanoTime, nVar.f18316b, this.f18231e);
            if (this.f18235i >= 1.0f) {
                if (i8 != -1) {
                    nVar.f18316b.setTag(i8, Long.valueOf(System.nanoTime()));
                }
                if (i7 != -1) {
                    nVar.f18316b.setTag(i7, null);
                }
                if (!this.f18238m) {
                    ((ArrayList) jVar.f3682f).add(this);
                }
            }
            if (this.f18235i < 1.0f || e7) {
                ((MotionLayout) jVar.f3678b).invalidate();
                return;
            }
            return;
        }
        long nanoTime2 = System.nanoTime();
        long j3 = nanoTime2 - this.f18236k;
        this.f18236k = nanoTime2;
        float f8 = this.f18235i - (((float) (j3 * 1.0E-6d)) * this.j);
        this.f18235i = f8;
        if (f8 < 0.0f) {
            this.f18235i = 0.0f;
        }
        float f9 = this.f18235i;
        if (interpolator != null) {
            f9 = interpolator.getInterpolation(f9);
        }
        boolean e8 = nVar.e(f9, nanoTime2, nVar.f18316b, this.f18231e);
        if (this.f18235i <= 0.0f) {
            if (i8 != -1) {
                nVar.f18316b.setTag(i8, Long.valueOf(System.nanoTime()));
            }
            if (i7 != -1) {
                nVar.f18316b.setTag(i7, null);
            }
            ((ArrayList) jVar.f3682f).add(this);
        }
        if (this.f18235i > 0.0f || e8) {
            ((MotionLayout) jVar.f3678b).invalidate();
        }
    }

    public final void b() {
        this.f18234h = true;
        int i7 = this.f18230d;
        if (i7 != -1) {
            this.j = i7 == 0 ? Float.MAX_VALUE : 1.0f / i7;
        }
        ((MotionLayout) this.f18232f.f3678b).invalidate();
        this.f18236k = System.nanoTime();
    }
}
