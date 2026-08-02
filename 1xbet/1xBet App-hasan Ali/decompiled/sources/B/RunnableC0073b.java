package B;

import P.G0;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* renamed from: B.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0073b implements G0, Runnable, Choreographer.FrameCallback {

    /* renamed from: q, reason: collision with root package name */
    public static long f659q;

    /* renamed from: k, reason: collision with root package name */
    public final View f660k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f662m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f664o;

    /* renamed from: p, reason: collision with root package name */
    public long f665p;

    /* renamed from: l, reason: collision with root package name */
    public final R.e f661l = new R.e(new M[16]);

    /* renamed from: n, reason: collision with root package name */
    public final Choreographer f663n = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RunnableC0073b(View view) {
        float f;
        this.f660k = view;
        if (f659q == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            f659q = (long) (1000000000 / f);
        }
    }

    @Override // P.G0
    public final void a() {
        this.f664o = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        if (this.f664o) {
            this.f665p = j5;
            this.f660k.post(this);
        }
    }

    @Override // P.G0
    public final void e() {
        this.f664o = false;
        this.f660k.removeCallbacks(this);
        this.f663n.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        R.e eVar = this.f661l;
        if ((eVar.f5108m == 0) || !this.f662m || !this.f664o || this.f660k.getWindowVisibility() != 0) {
            this.f662m = false;
            return;
        }
        long j5 = this.f665p + f659q;
        C0072a c0072a = new C0072a();
        c0072a.f658a = j5;
        boolean z3 = false;
        while (eVar.f5108m != 0 && !z3) {
            if (c0072a.a() <= 0 || ((M) eVar.f5106k[0]).b(c0072a)) {
                z3 = true;
            } else {
                eVar.l(0);
            }
        }
        if (z3) {
            this.f663n.postFrameCallback(this);
        } else {
            this.f662m = false;
        }
    }

    @Override // P.G0
    public final void c() {
    }
}
