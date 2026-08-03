package P;

/* loaded from: classes.dex */
public final class G implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f1198a;

    /* renamed from: b, reason: collision with root package name */
    public int f1199b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.OverScroller f1200c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.animation.Interpolator f1201d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1202e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f1204g;

    public G(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f1204g = recyclerView;
        P.p pVar = androidx.recyclerview.widget.RecyclerView.f2445o0;
        this.f1201d = pVar;
        this.f1202e = false;
        this.f1203f = false;
        this.f1200c = new android.widget.OverScroller(recyclerView.getContext(), pVar);
    }

    public final void a() {
        if (this.f1202e) {
            this.f1203f = true;
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1204g;
        recyclerView.removeCallbacks(this);
        java.lang.reflect.Field field = y.x.f8478a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1204g;
        if (recyclerView.f2478i == null) {
            recyclerView.removeCallbacks(this);
            this.f1200c.abortAnimation();
            return;
        }
        this.f1203f = false;
        this.f1202e = true;
        recyclerView.d();
        android.widget.OverScroller overScroller = this.f1200c;
        recyclerView.f2478i.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i2 = currX - this.f1198a;
            int i3 = currY - this.f1199b;
            this.f1198a = currX;
            this.f1199b = currY;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f1204g;
            int[] iArr = recyclerView.f2477h0;
            if (recyclerView2.f(i2, i3, iArr, null, 1)) {
                i2 -= iArr[0];
                i3 -= iArr[1];
            }
            if (!recyclerView.f2480j.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i2, i3);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = (i2 == 0 && i3 == 0) || (i2 != 0 && recyclerView.f2478i.b() && i2 == 0) || (i3 != 0 && recyclerView.f2478i.c() && i3 == 0);
            if (overScroller.isFinished() || !(z2 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                P.C0035h c0035h = recyclerView.f2465a0;
                c0035h.getClass();
                c0035h.f1272c = 0;
                recyclerView.s(1);
            } else {
                a();
                P.RunnableC0037j runnableC0037j = recyclerView.f2463W;
                if (runnableC0037j != null) {
                    runnableC0037j.a(recyclerView, i2, i3);
                }
            }
        }
        this.f1202e = false;
        if (this.f1203f) {
            a();
        }
    }
}
