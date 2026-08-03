package h;

/* renamed from: h.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151i implements g.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f3161a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f3162b;

    /* renamed from: c, reason: collision with root package name */
    public g.j f3163c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f3164d;

    /* renamed from: e, reason: collision with root package name */
    public g.o f3165e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.appcompat.widget.ActionMenuView f3167g;

    /* renamed from: h, reason: collision with root package name */
    public h.C0150h f3168h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f3169i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3170j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3171k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3172l;

    /* renamed from: m, reason: collision with root package name */
    public int f3173m;

    /* renamed from: n, reason: collision with root package name */
    public int f3174n;

    /* renamed from: o, reason: collision with root package name */
    public int f3175o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3176p;

    /* renamed from: r, reason: collision with root package name */
    public h.C0148f f3178r;

    /* renamed from: s, reason: collision with root package name */
    public h.C0148f f3179s;
    public D0.f t;

    /* renamed from: u, reason: collision with root package name */
    public h.C0149g f3180u;

    /* renamed from: f, reason: collision with root package name */
    public final int f3166f = com.watchfacestudio.huasi_urx110.R.layout.abc_action_menu_item_layout;

    /* renamed from: q, reason: collision with root package name */
    public final android.util.SparseBooleanArray f3177q = new android.util.SparseBooleanArray();

    /* renamed from: v, reason: collision with root package name */
    public final Z0.h f3181v = new Z0.h(19, this);

    public C0151i(android.content.Context context) {
        this.f3161a = context;
        this.f3164d = android.view.LayoutInflater.from(context);
    }

    @Override // g.p
    public final void a(g.j jVar, boolean z2) {
        i();
        h.C0148f c0148f = this.f3179s;
        if (c0148f != null && c0148f.b()) {
            c0148f.f3016i.dismiss();
        }
        g.o oVar = this.f3165e;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g.p
    public final boolean b(g.t tVar) {
        boolean z2;
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        g.t tVar2 = tVar;
        while (true) {
            g.j jVar = tVar2.f3037v;
            if (jVar == this.f3163c) {
                break;
            }
            tVar2 = (g.t) jVar;
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f3167g;
        android.view.View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                android.view.View childAt = actionMenuView.getChildAt(i2);
                if ((childAt instanceof g.q) && ((g.q) childAt).getItemData() == tVar2.f3038w) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        tVar.f3038w.getClass();
        int size = tVar.f2965f.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            android.view.MenuItem item = tVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        h.C0148f c0148f = new h.C0148f(this, this.f3162b, tVar, view);
        this.f3179s = c0148f;
        c0148f.f3014g = z2;
        g.l lVar = c0148f.f3016i;
        if (lVar != null) {
            lVar.o(z2);
        }
        h.C0148f c0148f2 = this.f3179s;
        if (!c0148f2.b()) {
            if (c0148f2.f3012e == null) {
                throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0148f2.d(0, 0, false, false);
        }
        g.o oVar = this.f3165e;
        if (oVar != null) {
            oVar.e(tVar);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [g.q] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final android.view.View c(g.k kVar, android.view.View view, androidx.appcompat.widget.ActionMenuView actionMenuView) {
        android.view.View view2 = kVar.f3005z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || kVar.c()) {
            androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = view instanceof g.q ? (g.q) view : (g.q) this.f3164d.inflate(this.f3166f, (android.view.ViewGroup) actionMenuView, false);
            actionMenuItemView.c(kVar);
            androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f3167g);
            if (this.f3180u == null) {
                this.f3180u = new h.C0149g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3180u);
            view2 = actionMenuItemView;
        }
        view2.setVisibility(kVar.f2980B ? 8 : 0);
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof h.C0153k)) {
            view2.setLayoutParams(androidx.appcompat.widget.ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    @Override // g.p
    public final void d(g.o oVar) {
        throw null;
    }

    @Override // g.p
    public final boolean e() {
        int i2;
        java.util.ArrayList arrayList;
        int i3;
        boolean z2;
        g.j jVar = this.f3163c;
        if (jVar != null) {
            arrayList = jVar.k();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i4 = this.f3175o;
        int i5 = this.f3174n;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f3167g;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            g.k kVar = (g.k) arrayList.get(i6);
            int i9 = kVar.f3004y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z3 = true;
            }
            if (this.f3176p && kVar.f2980B) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f3171k && (z3 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        android.util.SparseBooleanArray sparseBooleanArray = this.f3177q;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            g.k kVar2 = (g.k) arrayList.get(i11);
            int i13 = kVar2.f3004y;
            boolean z4 = (i13 & 2) == i3 ? z2 : false;
            int i14 = kVar2.f2982b;
            if (z4) {
                android.view.View c2 = c(kVar2, null, actionMenuView);
                c2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = c2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                kVar2.f(z2);
            } else if ((i13 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i14);
                boolean z6 = ((i10 > 0 || z5) && i5 > 0) ? z2 : false;
                if (z6) {
                    android.view.View c3 = c(kVar2, null, actionMenuView);
                    c3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = c3.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z6 &= i5 + i12 > 0;
                }
                if (z6 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z5) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i11; i15++) {
                        g.k kVar3 = (g.k) arrayList.get(i15);
                        if (kVar3.f2982b == i14) {
                            if (kVar3.d()) {
                                i10++;
                            }
                            kVar3.f(false);
                        }
                    }
                }
                if (z6) {
                    i10--;
                }
                kVar2.f(z6);
            } else {
                kVar2.f(false);
                i11++;
                i3 = 2;
                z2 = true;
            }
            i11++;
            i3 = 2;
            z2 = true;
        }
        return z2;
    }

    @Override // g.p
    public final boolean f(g.k kVar) {
        return false;
    }

    @Override // g.p
    public final boolean g(g.k kVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g.p
    public final void h() {
        int i2;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f3167g;
        java.util.ArrayList arrayList = null;
        boolean z2 = false;
        if (actionMenuView != null) {
            g.j jVar = this.f3163c;
            if (jVar != null) {
                jVar.i();
                java.util.ArrayList k2 = this.f3163c.k();
                int size = k2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    g.k kVar = (g.k) k2.get(i3);
                    if (kVar.d()) {
                        android.view.View childAt = actionMenuView.getChildAt(i2);
                        g.k itemData = childAt instanceof g.q ? ((g.q) childAt).getItemData() : null;
                        android.view.View c2 = c(kVar, childAt, actionMenuView);
                        if (kVar != itemData) {
                            c2.setPressed(false);
                            c2.jumpDrawablesToCurrentState();
                        }
                        if (c2 != childAt) {
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) c2.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(c2);
                            }
                            this.f3167g.addView(c2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i2) == this.f3168h) {
                    i2++;
                } else {
                    actionMenuView.removeViewAt(i2);
                }
            }
        }
        this.f3167g.requestLayout();
        g.j jVar2 = this.f3163c;
        if (jVar2 != null) {
            jVar2.i();
            java.util.ArrayList arrayList2 = jVar2.f2968i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((g.k) arrayList2.get(i4)).getClass();
            }
        }
        g.j jVar3 = this.f3163c;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.f2969j;
        }
        if (this.f3171k && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((g.k) arrayList.get(0)).f2980B;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f3168h == null) {
                this.f3168h = new h.C0150h(this, this.f3161a);
            }
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f3168h.getParent();
            if (viewGroup2 != this.f3167g) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f3168h);
                }
                androidx.appcompat.widget.ActionMenuView actionMenuView2 = this.f3167g;
                h.C0150h c0150h = this.f3168h;
                actionMenuView2.getClass();
                h.C0153k h2 = androidx.appcompat.widget.ActionMenuView.h();
                h2.f3187c = true;
                actionMenuView2.addView(c0150h, h2);
            }
        } else {
            h.C0150h c0150h2 = this.f3168h;
            if (c0150h2 != null) {
                android.view.ViewParent parent = c0150h2.getParent();
                androidx.appcompat.widget.ActionMenuView actionMenuView3 = this.f3167g;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f3168h);
                }
            }
        }
        this.f3167g.setOverflowReserved(this.f3171k);
    }

    public final boolean i() {
        androidx.appcompat.widget.ActionMenuView actionMenuView;
        D0.f fVar = this.t;
        if (fVar != null && (actionMenuView = this.f3167g) != null) {
            actionMenuView.removeCallbacks(fVar);
            this.t = null;
            return true;
        }
        h.C0148f c0148f = this.f3178r;
        if (c0148f == null) {
            return false;
        }
        if (c0148f.b()) {
            c0148f.f3016i.dismiss();
        }
        return true;
    }

    public final boolean j() {
        g.j jVar;
        if (!this.f3171k) {
            return false;
        }
        h.C0148f c0148f = this.f3178r;
        if ((c0148f != null && c0148f.b()) || (jVar = this.f3163c) == null || this.f3167g == null || this.t != null) {
            return false;
        }
        jVar.i();
        if (jVar.f2969j.isEmpty()) {
            return false;
        }
        D0.f fVar = new D0.f(4, this, new h.C0148f(this, this.f3162b, this.f3163c, this.f3168h));
        this.t = fVar;
        this.f3167g.post(fVar);
        g.o oVar = this.f3165e;
        if (oVar == null) {
            return true;
        }
        oVar.e(null);
        return true;
    }

    @Override // g.p
    public final void k(android.content.Context context, g.j jVar) {
        this.f3162b = context;
        android.view.LayoutInflater.from(context);
        this.f3163c = jVar;
        android.content.res.Resources resources = context.getResources();
        if (!this.f3172l) {
            this.f3171k = true;
        }
        int i2 = 2;
        this.f3173m = context.getResources().getDisplayMetrics().widthPixels / 2;
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f3175o = i2;
        int i5 = this.f3173m;
        if (this.f3171k) {
            if (this.f3168h == null) {
                h.C0150h c0150h = new h.C0150h(this, this.f3161a);
                this.f3168h = c0150h;
                if (this.f3170j) {
                    c0150h.setImageDrawable(this.f3169i);
                    this.f3169i = null;
                    this.f3170j = false;
                }
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3168h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f3168h.getMeasuredWidth();
        } else {
            this.f3168h = null;
        }
        this.f3174n = i5;
        float f2 = resources.getDisplayMetrics().density;
    }
}
