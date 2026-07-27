package W;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* renamed from: W.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162g {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3314x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f3315y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f3316a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f3317b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f3318c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3319d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3320e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f3321f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f3322g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3323h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3324i;

    /* renamed from: j, reason: collision with root package name */
    public float f3325j;

    /* renamed from: k, reason: collision with root package name */
    public float f3326k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f3329n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f3336u;

    /* renamed from: v, reason: collision with root package name */
    public int f3337v;

    /* renamed from: w, reason: collision with root package name */
    public final B.a f3338w;

    /* renamed from: l, reason: collision with root package name */
    public int f3327l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3328m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3330o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3331p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f3332q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f3333r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f3334s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f3335t = new int[2];

    public C0162g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3336u = ofFloat;
        this.f3337v = 0;
        B.a aVar = new B.a(8, this);
        this.f3338w = aVar;
        C0159d c0159d = new C0159d();
        this.f3317b = stateListDrawable;
        this.f3318c = drawable;
        this.f3321f = stateListDrawable2;
        this.f3322g = drawable2;
        this.f3319d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f3320e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f3323h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f3324i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f3316a = i6;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new C0160e(this));
        ofFloat.addUpdateListener(new C0161f(this));
        RecyclerView recyclerView2 = this.f3329n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            t tVar = recyclerView2.f4662i;
            if (tVar != null) {
                tVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f4664j;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f3329n;
            recyclerView3.f4666k.remove(this);
            if (recyclerView3.f4668l == this) {
                recyclerView3.f4668l = null;
            }
            ArrayList arrayList2 = this.f3329n.f4657f0;
            if (arrayList2 != null) {
                arrayList2.remove(c0159d);
            }
            this.f3329n.removeCallbacks(aVar);
        }
        this.f3329n = recyclerView;
        if (recyclerView != null) {
            t tVar2 = recyclerView.f4662i;
            if (tVar2 != null) {
                tVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f4664j;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f3329n.f4666k.add(this);
            RecyclerView recyclerView4 = this.f3329n;
            if (recyclerView4.f4657f0 == null) {
                recyclerView4.f4657f0 = new ArrayList();
            }
            recyclerView4.f4657f0.add(c0159d);
        }
    }

    public static int d(float f3, float f6, int[] iArr, int i2, int i3, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i2 - i6;
        int i9 = (int) (((f6 - f3) / i7) * i8);
        int i10 = i3 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    public final boolean a(float f3, float f6) {
        return f6 >= ((float) (this.f3328m - this.f3323h)) && f3 >= ((float) (0 - (0 / 2))) && f3 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f3, float f6) {
        RecyclerView recyclerView = this.f3329n;
        Field field = E.G.f566a;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f3319d;
        if (z) {
            if (f3 > i2 / 2) {
                return false;
            }
        } else if (f3 < this.f3327l - i2) {
            return false;
        }
        int i3 = 0 / 2;
        return f6 >= ((float) (0 - i3)) && f6 <= ((float) (i3 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i2 = this.f3332q;
        if (i2 == 1) {
            boolean b6 = b(motionEvent.getX(), motionEvent.getY());
            boolean a6 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b6 && !a6) {
                return false;
            }
            if (a6) {
                this.f3333r = 1;
                this.f3326k = (int) motionEvent.getX();
            } else if (b6) {
                this.f3333r = 2;
                this.f3325j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i2) {
        B.a aVar = this.f3338w;
        StateListDrawable stateListDrawable = this.f3317b;
        if (i2 == 2 && this.f3332q != 2) {
            stateListDrawable.setState(f3314x);
            this.f3329n.removeCallbacks(aVar);
        }
        if (i2 == 0) {
            this.f3329n.invalidate();
        } else {
            f();
        }
        if (this.f3332q == 2 && i2 != 2) {
            stateListDrawable.setState(f3315y);
            this.f3329n.removeCallbacks(aVar);
            this.f3329n.postDelayed(aVar, 1200);
        } else if (i2 == 1) {
            this.f3329n.removeCallbacks(aVar);
            this.f3329n.postDelayed(aVar, 1500);
        }
        this.f3332q = i2;
    }

    public final void f() {
        int i2 = this.f3337v;
        ValueAnimator valueAnimator = this.f3336u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3337v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
