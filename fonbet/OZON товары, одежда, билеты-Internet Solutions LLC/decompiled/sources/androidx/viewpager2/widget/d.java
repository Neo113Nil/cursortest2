package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final ViewPager2 f45205a;

    /* renamed from: b, reason: collision with root package name */
    private final f f45206b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView f45207c;

    /* renamed from: d, reason: collision with root package name */
    private VelocityTracker f45208d;

    /* renamed from: e, reason: collision with root package name */
    private int f45209e;

    /* renamed from: f, reason: collision with root package name */
    private float f45210f;

    /* renamed from: g, reason: collision with root package name */
    private int f45211g;

    /* renamed from: h, reason: collision with root package name */
    private long f45212h;

    d(ViewPager2 viewPager2, f fVar, RecyclerView recyclerView) {
        this.f45205a = viewPager2;
        this.f45206b = fVar;
        this.f45207c = recyclerView;
    }

    final boolean a() {
        f fVar = this.f45206b;
        if (fVar.f()) {
            return false;
        }
        this.f45211g = 0;
        this.f45210f = 0;
        this.f45212h = SystemClock.uptimeMillis();
        VelocityTracker velocityTracker = this.f45208d;
        if (velocityTracker == null) {
            this.f45208d = VelocityTracker.obtain();
            this.f45209e = ViewConfiguration.get(this.f45205a.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        fVar.i();
        if (!fVar.h()) {
            this.f45207c.stopScroll();
        }
        long j11 = this.f45212h;
        MotionEvent obtain = MotionEvent.obtain(j11, j11, 0, 0.0f, 0.0f, 0);
        this.f45208d.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    final boolean b() {
        f fVar = this.f45206b;
        if (!fVar.g()) {
            return false;
        }
        fVar.k();
        VelocityTracker velocityTracker = this.f45208d;
        velocityTracker.computeCurrentVelocity(1000, this.f45209e);
        if (this.f45207c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f45205a.z();
        return true;
    }

    final boolean c(float f7) {
        if (!this.f45206b.g()) {
            return false;
        }
        float f11 = this.f45210f - f7;
        this.f45210f = f11;
        int round = Math.round(f11 - this.f45211g);
        this.f45211g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z11 = this.f45205a.i() == 0;
        int i11 = z11 ? round : 0;
        int i12 = z11 ? 0 : round;
        float f12 = z11 ? this.f45210f : 0.0f;
        float f13 = z11 ? 0.0f : this.f45210f;
        this.f45207c.scrollBy(i11, i12);
        MotionEvent obtain = MotionEvent.obtain(this.f45212h, uptimeMillis, 2, f12, f13, 0);
        this.f45208d.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    final boolean d() {
        return this.f45206b.g();
    }
}
