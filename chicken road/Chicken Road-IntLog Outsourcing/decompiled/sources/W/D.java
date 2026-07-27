package W;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f3263a;

    /* renamed from: b, reason: collision with root package name */
    public int f3264b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f3265c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f3266d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3267e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3269g;

    public D(RecyclerView recyclerView) {
        this.f3269g = recyclerView;
        L.a aVar = RecyclerView.r0;
        this.f3266d = aVar;
        this.f3267e = false;
        this.f3268f = false;
        this.f3265c = new OverScroller(recyclerView.getContext(), aVar);
    }

    public final void a() {
        if (this.f3267e) {
            this.f3268f = true;
            return;
        }
        RecyclerView recyclerView = this.f3269g;
        recyclerView.removeCallbacks(this);
        Field field = E.G.f566a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f3269g;
        if (recyclerView.f4662i == null) {
            recyclerView.removeCallbacks(this);
            this.f3265c.abortAnimation();
            return;
        }
        this.f3268f = false;
        this.f3267e = true;
        recyclerView.d();
        OverScroller overScroller = this.f3265c;
        recyclerView.f4662i.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i2 = currX - this.f3263a;
            int i3 = currY - this.f3264b;
            this.f3263a = currX;
            this.f3264b = currY;
            RecyclerView recyclerView2 = this.f3269g;
            int[] iArr = recyclerView.f4667k0;
            if (recyclerView2.f(i2, i3, iArr, null, 1)) {
                i2 -= iArr[0];
                i3 -= iArr[1];
            }
            if (!recyclerView.f4664j.isEmpty()) {
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
            boolean z = (i2 == 0 && i3 == 0) || (i2 != 0 && recyclerView.f4662i.b() && i2 == 0) || (i3 != 0 && recyclerView.f4662i.c() && i3 == 0);
            if (overScroller.isFinished() || !(z || recyclerView.k())) {
                recyclerView.setScrollState(0);
                C0164i c0164i = recyclerView.f4653d0;
                c0164i.getClass();
                c0164i.f3341c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0166k runnableC0166k = recyclerView.f4651c0;
                if (runnableC0166k != null) {
                    runnableC0166k.a(recyclerView, i2, i3);
                }
            }
        }
        this.f3267e = false;
        if (this.f3268f) {
            a();
        }
    }
}
