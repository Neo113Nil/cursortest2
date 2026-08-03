package h;

/* renamed from: h.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0140I implements g.r {

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.reflect.Method f3065w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.reflect.Method f3066x;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f3067a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ListAdapter f3068b;

    /* renamed from: c, reason: collision with root package name */
    public h.C0142K f3069c;

    /* renamed from: e, reason: collision with root package name */
    public int f3071e;

    /* renamed from: f, reason: collision with root package name */
    public int f3072f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3073g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3074h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3075i;

    /* renamed from: k, reason: collision with root package name */
    public D.b f3077k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f3078l;

    /* renamed from: m, reason: collision with root package name */
    public g.l f3079m;

    /* renamed from: r, reason: collision with root package name */
    public final android.os.Handler f3084r;
    public android.graphics.Rect t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3086u;

    /* renamed from: v, reason: collision with root package name */
    public final h.r f3087v;

    /* renamed from: d, reason: collision with root package name */
    public int f3070d = -2;

    /* renamed from: j, reason: collision with root package name */
    public int f3076j = 0;

    /* renamed from: n, reason: collision with root package name */
    public final h.RunnableC0137F f3080n = new h.RunnableC0137F(this, 1);

    /* renamed from: o, reason: collision with root package name */
    public final h.ViewOnTouchListenerC0139H f3081o = new h.ViewOnTouchListenerC0139H(this);

    /* renamed from: p, reason: collision with root package name */
    public final h.C0138G f3082p = new h.C0138G(this);

    /* renamed from: q, reason: collision with root package name */
    public final h.RunnableC0137F f3083q = new h.RunnableC0137F(this, 0);

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Rect f3085s = new android.graphics.Rect();

    static {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            try {
                f3065w = android.widget.PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                android.util.Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3066x = android.widget.PopupWindow.class.getDeclaredMethod("setEpicenterBounds", android.graphics.Rect.class);
            } catch (java.lang.NoSuchMethodException unused2) {
                android.util.Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC0140I(android.content.Context context, int i2) {
        int resourceId;
        this.f3067a = context;
        this.f3084r = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, c.AbstractC0095a.f2542k, i2, 0);
        this.f3071e = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3072f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3073g = true;
        }
        obtainStyledAttributes.recycle();
        h.r rVar = new h.r(context, null, i2, 0);
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, c.AbstractC0095a.f2546o, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            C.n.c(rVar, obtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : d.AbstractC0106a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f3087v = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void a(android.widget.ListAdapter listAdapter) {
        D.b bVar = this.f3077k;
        if (bVar == null) {
            this.f3077k = new D.b(1, this);
        } else {
            android.widget.ListAdapter listAdapter2 = this.f3068b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f3068b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3077k);
        }
        h.C0142K c0142k = this.f3069c;
        if (c0142k != null) {
            c0142k.setAdapter(this.f3068b);
        }
    }

    @Override // g.r
    public final void c() {
        int i2;
        h.C0142K c0142k;
        h.C0142K c0142k2 = this.f3069c;
        h.r rVar = this.f3087v;
        android.content.Context context = this.f3067a;
        if (c0142k2 == null) {
            h.C0142K c0142k3 = new h.C0142K(context, !this.f3086u);
            c0142k3.setHoverListener((h.L) this);
            this.f3069c = c0142k3;
            c0142k3.setAdapter(this.f3068b);
            this.f3069c.setOnItemClickListener(this.f3079m);
            this.f3069c.setFocusable(true);
            this.f3069c.setFocusableInTouchMode(true);
            this.f3069c.setOnItemSelectedListener(new h.C0136E(r0, this));
            this.f3069c.setOnScrollListener(this.f3082p);
            rVar.setContentView(this.f3069c);
        }
        android.graphics.drawable.Drawable background = rVar.getBackground();
        android.graphics.Rect rect = this.f3085s;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f3073g) {
                this.f3072f = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f3078l, this.f3072f, rVar.getInputMethodMode() == 2);
        int i4 = this.f3070d;
        int a2 = this.f3069c.a(i4 != -2 ? i4 != -1 ? android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a2 + (a2 > 0 ? this.f3069c.getPaddingBottom() + this.f3069c.getPaddingTop() + i2 : 0);
        this.f3087v.getInputMethodMode();
        C.n.d(rVar, 1002);
        if (rVar.isShowing()) {
            android.view.View view = this.f3078l;
            java.lang.reflect.Field field = y.x.f8478a;
            if (view.isAttachedToWindow()) {
                int i5 = this.f3070d;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f3078l.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f3078l, this.f3071e, this.f3072f, i5 < 0 ? -1 : i5, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i6 = this.f3070d;
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = this.f3078l.getWidth();
        }
        rVar.setWidth(i6);
        rVar.setHeight(paddingBottom);
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = f3065w;
            if (method != null) {
                try {
                    method.invoke(rVar, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                    android.util.Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            rVar.setIsClippedToScreen(true);
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.f3081o);
        if (this.f3075i) {
            C.n.c(rVar, this.f3074h);
        }
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method2 = f3066x;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.t);
                } catch (java.lang.Exception e2) {
                    android.util.Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.t);
        }
        rVar.showAsDropDown(this.f3078l, this.f3071e, this.f3072f, this.f3076j);
        this.f3069c.setSelection(-1);
        if ((!this.f3086u || this.f3069c.isInTouchMode()) && (c0142k = this.f3069c) != null) {
            c0142k.setListSelectionHidden(true);
            c0142k.requestLayout();
        }
        if (this.f3086u) {
            return;
        }
        this.f3084r.post(this.f3083q);
    }

    @Override // g.r
    public final void dismiss() {
        h.r rVar = this.f3087v;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f3069c = null;
        this.f3084r.removeCallbacks(this.f3080n);
    }

    @Override // g.r
    public final boolean i() {
        return this.f3087v.isShowing();
    }

    @Override // g.r
    public final android.widget.ListView j() {
        return this.f3069c;
    }
}
