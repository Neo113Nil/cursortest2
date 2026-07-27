package U;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f1488a;

    /* renamed from: b, reason: collision with root package name */
    public int f1489b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f1490c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f1491d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1492e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1493g;

    public F(RecyclerView recyclerView) {
        this.f1493g = recyclerView;
        InterpolatorC0076p interpolatorC0076p = RecyclerView.f2373k0;
        this.f1491d = interpolatorC0076p;
        this.f1492e = false;
        this.f = false;
        this.f1490c = new OverScroller(recyclerView.getContext(), interpolatorC0076p);
    }

    public final void a() {
        if (this.f1492e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.f1493g;
        recyclerView.removeCallbacks(this);
        Field field = D.z.f259a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f1493g;
        if (recyclerView.f2409i == null) {
            recyclerView.removeCallbacks(this);
            this.f1490c.abortAnimation();
            return;
        }
        this.f = false;
        this.f1492e = true;
        recyclerView.d();
        OverScroller overScroller = this.f1490c;
        recyclerView.f2409i.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.f1488a;
            int i5 = currY - this.f1489b;
            this.f1488a = currX;
            this.f1489b = currY;
            int i6 = i4;
            int[] iArr = recyclerView.f2403d0;
            if (recyclerView.f(i6, i5, iArr, null, 1)) {
                i6 -= iArr[0];
                i3 = i5 - iArr[1];
            } else {
                i3 = i5;
            }
            int i7 = i6;
            if (!recyclerView.f2410j.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i7, i3);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z3 = (i7 == 0 && i3 == 0) || (i7 != 0 && recyclerView.f2409i.b() && i7 == 0) || (i3 != 0 && recyclerView.f2409i.c() && i3 == 0);
            if (overScroller.isFinished() || !(z3 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                C0069i c0069i = recyclerView.f2392T;
                c0069i.getClass();
                c0069i.f1561c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0071k runnableC0071k = recyclerView.f2391S;
                if (runnableC0071k != null) {
                    runnableC0071k.a(recyclerView, i7, i3);
                }
            }
        }
        this.f1492e = false;
        if (this.f) {
            a();
        }
    }
}
