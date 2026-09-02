package g;

/* loaded from: classes.dex */
public final class g extends g.l implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f2929b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2930c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2931d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2932e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f2933f;

    /* renamed from: i, reason: collision with root package name */
    public final g.c f2936i;

    /* renamed from: j, reason: collision with root package name */
    public final g.d f2937j;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f2941n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f2942o;

    /* renamed from: p, reason: collision with root package name */
    public int f2943p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2944q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2945r;

    /* renamed from: s, reason: collision with root package name */
    public int f2946s;
    public int t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2948v;

    /* renamed from: w, reason: collision with root package name */
    public g.o f2949w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewTreeObserver f2950x;

    /* renamed from: y, reason: collision with root package name */
    public g.m f2951y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2952z;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f2934g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f2935h = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final Z0.h f2938k = new Z0.h(18, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2939l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2940m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2947u = false;

    public g(android.content.Context context, android.view.View view, int i2, boolean z2) {
        this.f2936i = new g.c(this, r0);
        this.f2937j = new g.d(this, r0);
        this.f2929b = context;
        this.f2941n = view;
        this.f2931d = i2;
        this.f2932e = z2;
        java.lang.reflect.Field field = y.x.f8478a;
        this.f2943p = view.getLayoutDirection() != 1 ? 1 : 0;
        android.content.res.Resources resources = context.getResources();
        this.f2930c = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.watchfacestudio.huasi_urx110.R.dimen.abc_config_prefDialogWidth));
        this.f2933f = new android.os.Handler();
    }

    @Override // g.p
    public final void a(g.j jVar, boolean z2) {
        java.util.ArrayList arrayList = this.f2935h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((g.f) arrayList.get(i2)).f2927b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((g.f) arrayList.get(i3)).f2927b.c(false);
        }
        g.f fVar = (g.f) arrayList.remove(i2);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = fVar.f2927b.f2977r;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            g.p pVar = (g.p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z3 = this.f2952z;
        h.L l2 = fVar.f2926a;
        if (z3) {
            l2.f3087v.setExitTransition(null);
            l2.f3087v.setAnimationStyle(0);
        }
        l2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2943p = ((g.f) arrayList.get(size2 - 1)).f2928c;
        } else {
            android.view.View view = this.f2941n;
            java.lang.reflect.Field field = y.x.f8478a;
            this.f2943p = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((g.f) arrayList.get(0)).f2927b.c(false);
                return;
            }
            return;
        }
        dismiss();
        g.o oVar = this.f2949w;
        if (oVar != null) {
            oVar.a(jVar, true);
        }
        android.view.ViewTreeObserver viewTreeObserver = this.f2950x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2950x.removeGlobalOnLayoutListener(this.f2936i);
            }
            this.f2950x = null;
        }
        this.f2942o.removeOnAttachStateChangeListener(this.f2937j);
        this.f2951y.onDismiss();
    }

    @Override // g.p
    public final boolean b(g.t tVar) {
        java.util.Iterator it = this.f2935h.iterator();
        while (it.hasNext()) {
            g.f fVar = (g.f) it.next();
            if (tVar == fVar.f2927b) {
                fVar.f2926a.f3069c.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        g.o oVar = this.f2949w;
        if (oVar != null) {
            oVar.e(tVar);
        }
        return true;
    }

    @Override // g.r
    public final void c() {
        if (i()) {
            return;
        }
        java.util.ArrayList arrayList = this.f2934g;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((g.j) it.next());
        }
        arrayList.clear();
        android.view.View view = this.f2941n;
        this.f2942o = view;
        if (view != null) {
            boolean z2 = this.f2950x == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2950x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2936i);
            }
            this.f2942o.addOnAttachStateChangeListener(this.f2937j);
        }
    }

    @Override // g.p
    public final void d(g.o oVar) {
        this.f2949w = oVar;
    }

    @Override // g.r
    public final void dismiss() {
        java.util.ArrayList arrayList = this.f2935h;
        int size = arrayList.size();
        if (size > 0) {
            g.f[] fVarArr = (g.f[]) arrayList.toArray(new g.f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                g.f fVar = fVarArr[i2];
                if (fVar.f2926a.f3087v.isShowing()) {
                    fVar.f2926a.dismiss();
                }
            }
        }
    }

    @Override // g.p
    public final boolean e() {
        return false;
    }

    @Override // g.p
    public final void h() {
        java.util.Iterator it = this.f2935h.iterator();
        while (it.hasNext()) {
            android.widget.ListAdapter adapter = ((g.f) it.next()).f2926a.f3069c.getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                adapter = ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g.h) adapter).notifyDataSetChanged();
        }
    }

    @Override // g.r
    public final boolean i() {
        java.util.ArrayList arrayList = this.f2935h;
        return arrayList.size() > 0 && ((g.f) arrayList.get(0)).f2926a.f3087v.isShowing();
    }

    @Override // g.r
    public final android.widget.ListView j() {
        java.util.ArrayList arrayList = this.f2935h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((g.f) arrayList.get(arrayList.size() - 1)).f2926a.f3069c;
    }

    @Override // g.l
    public final void l(g.j jVar) {
        jVar.b(this, this.f2929b);
        if (i()) {
            v(jVar);
        } else {
            this.f2934g.add(jVar);
        }
    }

    @Override // g.l
    public final void n(android.view.View view) {
        if (this.f2941n != view) {
            this.f2941n = view;
            int i2 = this.f2939l;
            java.lang.reflect.Field field = y.x.f8478a;
            this.f2940m = android.view.Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.l
    public final void o(boolean z2) {
        this.f2947u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        g.f fVar;
        java.util.ArrayList arrayList = this.f2935h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                fVar = null;
                break;
            }
            fVar = (g.f) arrayList.get(i2);
            if (!fVar.f2926a.f3087v.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (fVar != null) {
            fVar.f2927b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i2, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // g.l
    public final void p(int i2) {
        if (this.f2939l != i2) {
            this.f2939l = i2;
            android.view.View view = this.f2941n;
            java.lang.reflect.Field field = y.x.f8478a;
            this.f2940m = android.view.Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.l
    public final void q(int i2) {
        this.f2944q = true;
        this.f2946s = i2;
    }

    @Override // g.l
    public final void r(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f2951y = (g.m) onDismissListener;
    }

    @Override // g.l
    public final void s(boolean z2) {
        this.f2948v = z2;
    }

    @Override // g.l
    public final void t(int i2) {
        this.f2945r = true;
        this.t = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(g.j jVar) {
        g.f fVar;
        android.view.View view;
        int i2;
        char c2;
        int i3;
        int i4;
        int width;
        android.view.MenuItem menuItem;
        g.h hVar;
        int i5;
        int firstVisiblePosition;
        android.content.Context context = this.f2929b;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        g.h hVar2 = new g.h(jVar, from, this.f2932e, com.watchfacestudio.huasi_urx110.R.layout.abc_cascading_menu_item_layout);
        if (!i() && this.f2947u) {
            hVar2.f2955c = true;
        } else if (i()) {
            hVar2.f2955c = g.l.u(jVar);
        }
        int m2 = g.l.m(hVar2, context, this.f2930c);
        h.L l2 = new h.L(context, this.f2931d);
        l2.f3093y = this.f2938k;
        l2.f3079m = this;
        l2.f3087v.setOnDismissListener(this);
        l2.f3078l = this.f2941n;
        l2.f3076j = this.f2940m;
        l2.f3086u = true;
        l2.f3087v.setFocusable(true);
        l2.f3087v.setInputMethodMode(2);
        l2.a(hVar2);
        android.graphics.drawable.Drawable background = l2.f3087v.getBackground();
        if (background != null) {
            android.graphics.Rect rect = l2.f3085s;
            background.getPadding(rect);
            l2.f3070d = rect.left + rect.right + m2;
        } else {
            l2.f3070d = m2;
        }
        l2.f3076j = this.f2940m;
        java.util.ArrayList arrayList = this.f2935h;
        if (arrayList.size() > 0) {
            fVar = (g.f) arrayList.get(arrayList.size() - 1);
            g.j jVar2 = fVar.f2927b;
            int size = jVar2.f2965f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = jVar2.getItem(i6);
                if (menuItem.hasSubMenu() && jVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (menuItem != null) {
                h.C0142K c0142k = fVar.f2926a.f3069c;
                android.widget.ListAdapter adapter = c0142k.getAdapter();
                if (adapter instanceof android.widget.HeaderViewListAdapter) {
                    android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    hVar = (g.h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (g.h) adapter;
                    i5 = 0;
                }
                int count = hVar.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (menuItem == hVar.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + i5) - c0142k.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0142k.getChildCount()) {
                    view = c0142k.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            fVar = null;
            view = null;
        }
        if (view != null) {
            int i8 = android.os.Build.VERSION.SDK_INT;
            h.r rVar = l2.f3087v;
            if (i8 <= 28) {
                java.lang.reflect.Method method = h.L.f3092z;
                if (method != null) {
                    try {
                        method.invoke(rVar, java.lang.Boolean.FALSE);
                    } catch (java.lang.Exception unused) {
                        android.util.Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                rVar.setTouchModal(false);
            }
            l2.f3087v.setEnterTransition(null);
            h.C0142K c0142k2 = ((g.f) arrayList.get(arrayList.size() - 1)).f2926a.f3069c;
            int[] iArr = new int[2];
            c0142k2.getLocationOnScreen(iArr);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            this.f2942o.getWindowVisibleDisplayFrame(rect2);
            if (this.f2943p == 1) {
                if (c0142k2.getWidth() + iArr[0] + m2 > rect2.right) {
                    i2 = 0;
                    boolean z2 = i2 != 1;
                    this.f2943p = i2;
                    if (android.os.Build.VERSION.SDK_INT < 26) {
                        l2.f3078l = view;
                        i4 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.f2941n.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.f2940m & 7) == 5) {
                            c2 = 0;
                            iArr2[0] = this.f2941n.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        } else {
                            c2 = 0;
                        }
                        i3 = iArr3[c2] - iArr2[c2];
                        i4 = iArr3[1] - iArr2[1];
                    }
                    if ((this.f2940m & 5) == 5) {
                        if (z2) {
                            width = i3 + view.getWidth();
                            l2.f3071e = width;
                            l2.f3075i = true;
                            l2.f3074h = true;
                            l2.f3072f = i4;
                            l2.f3073g = true;
                        }
                        width = i3 - m2;
                        l2.f3071e = width;
                        l2.f3075i = true;
                        l2.f3074h = true;
                        l2.f3072f = i4;
                        l2.f3073g = true;
                    } else if (z2) {
                        width = i3 + m2;
                        l2.f3071e = width;
                        l2.f3075i = true;
                        l2.f3074h = true;
                        l2.f3072f = i4;
                        l2.f3073g = true;
                    } else {
                        m2 = view.getWidth();
                        width = i3 - m2;
                        l2.f3071e = width;
                        l2.f3075i = true;
                        l2.f3074h = true;
                        l2.f3072f = i4;
                        l2.f3073g = true;
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f2943p = i2;
                if (android.os.Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f2940m & 5) == 5) {
                }
            } else {
                if (iArr[0] - m2 >= 0) {
                    i2 = 0;
                    if (i2 != 1) {
                    }
                    this.f2943p = i2;
                    if (android.os.Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.f2940m & 5) == 5) {
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f2943p = i2;
                if (android.os.Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f2940m & 5) == 5) {
                }
            }
        } else {
            if (this.f2944q) {
                l2.f3071e = this.f2946s;
            }
            if (this.f2945r) {
                l2.f3072f = this.t;
                l2.f3073g = true;
            }
            android.graphics.Rect rect3 = this.f3006a;
            l2.t = rect3 != null ? new android.graphics.Rect(rect3) : null;
        }
        arrayList.add(new g.f(l2, jVar, this.f2943p));
        l2.c();
        h.C0142K c0142k3 = l2.f3069c;
        c0142k3.setOnKeyListener(this);
        if (fVar == null && this.f2948v && jVar.f2971l != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) from.inflate(com.watchfacestudio.huasi_urx110.R.layout.abc_popup_menu_header_item_layout, (android.view.ViewGroup) c0142k3, false);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(jVar.f2971l);
            c0142k3.addHeaderView(frameLayout, null, false);
            l2.c();
        }
    }
}
