package C0;

import P.U;
import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: C0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089h {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1264x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1265y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f1266a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f1267b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f1268c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1269d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1270e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f1271f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f1272g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1273h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1274i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f1275k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f1278n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f1285u;

    /* renamed from: v, reason: collision with root package name */
    public int f1286v;

    /* renamed from: w, reason: collision with root package name */
    public final RunnableC0085d f1287w;

    /* renamed from: l, reason: collision with root package name */
    public int f1276l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1277m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1279o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1280p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f1281q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f1282r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1283s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f1284t = new int[2];

    public C0089h(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i8, int i9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1285u = ofFloat;
        this.f1286v = 0;
        RunnableC0085d runnableC0085d = new RunnableC0085d(this, 0);
        this.f1287w = runnableC0085d;
        C0086e c0086e = new C0086e();
        this.f1267b = stateListDrawable;
        this.f1268c = drawable;
        this.f1271f = stateListDrawable2;
        this.f1272g = drawable2;
        this.f1269d = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f1270e = Math.max(i7, drawable.getIntrinsicWidth());
        this.f1273h = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.f1274i = Math.max(i7, drawable2.getIntrinsicWidth());
        this.f1266a = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0087f(this));
        ofFloat.addUpdateListener(new C0088g(this));
        RecyclerView recyclerView2 = this.f1278n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            u uVar = recyclerView2.f9741z;
            if (uVar != null) {
                uVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f9687A;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f1278n;
            recyclerView3.f9688B.remove(this);
            if (recyclerView3.f9689C == this) {
                recyclerView3.f9689C = null;
            }
            ArrayList arrayList2 = this.f1278n.f9730p0;
            if (arrayList2 != null) {
                arrayList2.remove(c0086e);
            }
            this.f1278n.removeCallbacks(runnableC0085d);
        }
        this.f1278n = recyclerView;
        if (recyclerView != null) {
            u uVar2 = recyclerView.f9741z;
            if (uVar2 != null) {
                uVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f9687A;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f1278n.f9688B.add(this);
            RecyclerView recyclerView4 = this.f1278n;
            if (recyclerView4.f9730p0 == null) {
                recyclerView4.f9730p0 = new ArrayList();
            }
            recyclerView4.f9730p0.add(c0086e);
        }
    }

    public static int d(float f7, float f8, int[] iArr, int i7, int i8, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 == 0) {
            return 0;
        }
        int i11 = i7 - i9;
        int i12 = (int) (((f8 - f7) / i10) * i11);
        int i13 = i8 + i12;
        if (i13 >= i11 || i13 < 0) {
            return 0;
        }
        return i12;
    }

    public final boolean a(float f7, float f8) {
        return f8 >= ((float) (this.f1277m - this.f1273h)) && f7 >= ((float) (0 - (0 / 2))) && f7 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f7, float f8) {
        RecyclerView recyclerView = this.f1278n;
        WeakHashMap weakHashMap = U.f5037a;
        boolean z4 = recyclerView.getLayoutDirection() == 1;
        int i7 = this.f1269d;
        if (z4) {
            if (f7 > i7 / 2) {
                return false;
            }
        } else if (f7 < this.f1276l - i7) {
            return false;
        }
        int i8 = 0 / 2;
        return f8 >= ((float) (0 - i8)) && f8 <= ((float) (i8 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i7 = this.f1281q;
        if (i7 == 1) {
            boolean b7 = b(motionEvent.getX(), motionEvent.getY());
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b7 && !a2) {
                return false;
            }
            if (a2) {
                this.f1282r = 1;
                this.f1275k = (int) motionEvent.getX();
            } else if (b7) {
                this.f1282r = 2;
                this.j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i7 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i7) {
        RunnableC0085d runnableC0085d = this.f1287w;
        StateListDrawable stateListDrawable = this.f1267b;
        if (i7 == 2 && this.f1281q != 2) {
            stateListDrawable.setState(f1264x);
            this.f1278n.removeCallbacks(runnableC0085d);
        }
        if (i7 == 0) {
            this.f1278n.invalidate();
        } else {
            f();
        }
        if (this.f1281q == 2 && i7 != 2) {
            stateListDrawable.setState(f1265y);
            this.f1278n.removeCallbacks(runnableC0085d);
            this.f1278n.postDelayed(runnableC0085d, 1200);
        } else if (i7 == 1) {
            this.f1278n.removeCallbacks(runnableC0085d);
            this.f1278n.postDelayed(runnableC0085d, 1500);
        }
        this.f1281q = i7;
    }

    public final void f() {
        int i7 = this.f1286v;
        ValueAnimator valueAnimator = this.f1285u;
        if (i7 != 0) {
            if (i7 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f1286v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
