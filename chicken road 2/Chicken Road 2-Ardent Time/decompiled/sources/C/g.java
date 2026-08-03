package C;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f69r = android.view.ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final C.a f70a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f71b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ListView f72c;

    /* renamed from: d, reason: collision with root package name */
    public C.b f73d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f74e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f75f;

    /* renamed from: g, reason: collision with root package name */
    public final int f76g;

    /* renamed from: h, reason: collision with root package name */
    public final int f77h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f78i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f79j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f80k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f81l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f82m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f83n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f84o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f85p;

    /* renamed from: q, reason: collision with root package name */
    public final h.AbstractC0167z f86q;

    public g(h.AbstractC0167z abstractC0167z) {
        C.a aVar = new C.a();
        aVar.f61e = Long.MIN_VALUE;
        aVar.f63g = -1L;
        aVar.f62f = 0L;
        this.f70a = aVar;
        this.f71b = new android.view.animation.AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f74e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f75f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f78i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f79j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f80k = fArr5;
        this.f72c = abstractC0167z;
        float f2 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f76g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f77h = f69r;
        aVar.f57a = 500;
        aVar.f58b = 500;
        this.f86q = abstractC0167z;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i2, float f2, float f3, float f4) {
        float f5;
        float interpolation;
        float b2 = b(this.f74e[i2] * f3, 0.0f, this.f75f[i2]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        android.view.animation.AccelerateInterpolator accelerateInterpolator = this.f71b;
        if (c2 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= 0.0f) {
                f5 = 0.0f;
                if (f5 != 0.0f) {
                    return 0.0f;
                }
                float f6 = this.f78i[i2];
                float f7 = this.f79j[i2];
                float f8 = this.f80k[i2];
                float f9 = f6 * f4;
                return f5 > 0.0f ? b(f5 * f9, f7, f8) : -b((-f5) * f9, f7, f8);
            }
            interpolation = accelerateInterpolator.getInterpolation(c2);
        }
        f5 = b(interpolation, -1.0f, 1.0f);
        if (f5 != 0.0f) {
        }
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f76g;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f84o && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f82m) {
            this.f84o = false;
            return;
        }
        C.a aVar = this.f70a;
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.f61e);
        int i4 = aVar.f58b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f65i = i2;
        aVar.f64h = aVar.a(currentAnimationTimeMillis);
        aVar.f63g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        h.AbstractC0167z abstractC0167z;
        int count;
        C.a aVar = this.f70a;
        float f2 = aVar.f60d;
        int abs = (int) (f2 / java.lang.Math.abs(f2));
        java.lang.Math.abs(aVar.f59c);
        if (abs == 0 || (count = (abstractC0167z = this.f86q).getCount()) == 0) {
            return false;
        }
        int childCount = abstractC0167z.getChildCount();
        int firstVisiblePosition = abstractC0167z.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i2 >= count && abstractC0167z.getChildAt(childCount - 1).getBottom() <= abstractC0167z.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && abstractC0167z.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i2;
        int i3 = 0;
        if (!this.f85p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            d();
            return false;
        }
        this.f83n = true;
        this.f81l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        android.widget.ListView listView = this.f72c;
        float a2 = a(0, x2, width, listView.getWidth());
        float a3 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        C.a aVar = this.f70a;
        aVar.f59c = a2;
        aVar.f60d = a3;
        if (!this.f84o && e()) {
            if (this.f73d == null) {
                this.f73d = new C.b(i3, this);
            }
            this.f84o = true;
            this.f82m = true;
            if (this.f81l || (i2 = this.f77h) <= 0) {
                this.f73d.run();
            } else {
                C.b bVar = this.f73d;
                long j2 = i2;
                java.lang.reflect.Field field = y.x.f8478a;
                listView.postOnAnimationDelayed(bVar, j2);
            }
            this.f81l = true;
        }
        return false;
    }
}
