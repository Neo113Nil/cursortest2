package P;

/* renamed from: P.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033f {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1246x = {android.R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1247y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f1248a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.StateListDrawable f1249b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f1250c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1251d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1252e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.StateListDrawable f1253f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f1254g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1255h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1256i;

    /* renamed from: j, reason: collision with root package name */
    public float f1257j;

    /* renamed from: k, reason: collision with root package name */
    public float f1258k;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f1261n;

    /* renamed from: u, reason: collision with root package name */
    public final android.animation.ValueAnimator f1267u;

    /* renamed from: v, reason: collision with root package name */
    public int f1268v;

    /* renamed from: w, reason: collision with root package name */
    public final C.b f1269w;

    /* renamed from: l, reason: collision with root package name */
    public int f1259l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1260m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1262o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1263p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f1264q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f1265r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1266s = new int[2];
    public final int[] t = new int[2];

    public C0033f(androidx.recyclerview.widget.RecyclerView recyclerView, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i2, int i3, int i4) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1267u = ofFloat;
        this.f1268v = 0;
        C.b bVar = new C.b(4, this);
        this.f1269w = bVar;
        P.C0030c c0030c = new P.C0030c();
        this.f1249b = stateListDrawable;
        this.f1250c = drawable;
        this.f1253f = stateListDrawable2;
        this.f1254g = drawable2;
        this.f1251d = java.lang.Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f1252e = java.lang.Math.max(i2, drawable.getIntrinsicWidth());
        this.f1255h = java.lang.Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f1256i = java.lang.Math.max(i2, drawable2.getIntrinsicWidth());
        this.f1248a = i4;
        stateListDrawable.setAlpha(kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new P.C0031d(this));
        ofFloat.addUpdateListener(new P.C0032e(this));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f1261n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            P.v vVar = recyclerView2.f2478i;
            if (vVar != null) {
                vVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            java.util.ArrayList arrayList = recyclerView2.f2480j;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f1261n;
            recyclerView3.f2482k.remove(this);
            if (recyclerView3.f2483l == this) {
                recyclerView3.f2483l = null;
            }
            java.util.ArrayList arrayList2 = this.f1261n.f2469c0;
            if (arrayList2 != null) {
                arrayList2.remove(c0030c);
            }
            this.f1261n.removeCallbacks(bVar);
        }
        this.f1261n = recyclerView;
        if (recyclerView != null) {
            P.v vVar2 = recyclerView.f2478i;
            if (vVar2 != null) {
                vVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            java.util.ArrayList arrayList3 = recyclerView.f2480j;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f1261n.f2482k.add(this);
            androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f1261n;
            if (recyclerView4.f2469c0 == null) {
                recyclerView4.f2469c0 = new java.util.ArrayList();
            }
            recyclerView4.f2469c0.add(c0030c);
        }
    }

    public static int d(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public final boolean a(float f2, float f3) {
        return f3 >= ((float) (this.f1260m - this.f1255h)) && f2 >= ((float) (0 - (0 / 2))) && f2 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f2, float f3) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f1261n;
        java.lang.reflect.Field field = y.x.f8478a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f1251d;
        if (z2) {
            if (f2 > i2 / 2) {
                return false;
            }
        } else if (f2 < this.f1259l - i2) {
            return false;
        }
        int i3 = 0 / 2;
        return f3 >= ((float) (0 - i3)) && f3 <= ((float) (i3 + 0));
    }

    public final boolean c(android.view.MotionEvent motionEvent) {
        int i2 = this.f1264q;
        if (i2 == 1) {
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b2 && !a2) {
                return false;
            }
            if (a2) {
                this.f1265r = 1;
                this.f1258k = (int) motionEvent.getX();
            } else if (b2) {
                this.f1265r = 2;
                this.f1257j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i2) {
        C.b bVar = this.f1269w;
        android.graphics.drawable.StateListDrawable stateListDrawable = this.f1249b;
        if (i2 == 2 && this.f1264q != 2) {
            stateListDrawable.setState(f1246x);
            this.f1261n.removeCallbacks(bVar);
        }
        if (i2 == 0) {
            this.f1261n.invalidate();
        } else {
            f();
        }
        if (this.f1264q == 2 && i2 != 2) {
            stateListDrawable.setState(f1247y);
            this.f1261n.removeCallbacks(bVar);
            this.f1261n.postDelayed(bVar, 1200);
        } else if (i2 == 1) {
            this.f1261n.removeCallbacks(bVar);
            this.f1261n.postDelayed(bVar, 1500);
        }
        this.f1264q = i2;
    }

    public final void f() {
        int i2 = this.f1268v;
        android.animation.ValueAnimator valueAnimator = this.f1267u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f1268v = 1;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
