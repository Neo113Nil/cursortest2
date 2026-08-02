package C0;

import P.U;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f1223a;

    /* renamed from: b, reason: collision with root package name */
    public int f1224b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f1225c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f1226d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1227e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1228f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1229x;

    public E(RecyclerView recyclerView) {
        this.f1229x = recyclerView;
        p pVar = RecyclerView.f9684B0;
        this.f1226d = pVar;
        this.f1227e = false;
        this.f1228f = false;
        this.f1225c = new OverScroller(recyclerView.getContext(), pVar);
    }

    public final void a() {
        if (this.f1227e) {
            this.f1228f = true;
            return;
        }
        RecyclerView recyclerView = this.f1229x;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = U.f5037a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f1229x;
        if (recyclerView.f9741z == null) {
            recyclerView.removeCallbacks(this);
            this.f1225c.abortAnimation();
            return;
        }
        this.f1228f = false;
        this.f1227e = true;
        recyclerView.d();
        OverScroller overScroller = this.f1225c;
        recyclerView.f9741z.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i7 = currX - this.f1223a;
            int i8 = currY - this.f1224b;
            this.f1223a = currX;
            this.f1224b = currY;
            RecyclerView recyclerView2 = this.f1229x;
            int[] iArr = recyclerView.f9735u0;
            if (recyclerView2.f(i7, i8, iArr, null, 1)) {
                i7 -= iArr[0];
                i8 -= iArr[1];
            }
            if (!recyclerView.f9687A.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i7, i8);
            }
            this.f1229x.g(0, 0, 0, 0, null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z4 = (i7 == 0 && i8 == 0) || (i7 != 0 && recyclerView.f9741z.b() && i7 == 0) || (i8 != 0 && recyclerView.f9741z.c() && i8 == 0);
            if (overScroller.isFinished() || !(z4 || recyclerView.k(1))) {
                recyclerView.setScrollState(0);
                C0091j c0091j = recyclerView.f9728n0;
                c0091j.getClass();
                c0091j.f1291c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0093l runnableC0093l = recyclerView.f9727m0;
                if (runnableC0093l != null) {
                    runnableC0093l.a(recyclerView, i7, i8);
                }
            }
        }
        this.f1227e = false;
        if (this.f1228f) {
            a();
        }
    }
}
