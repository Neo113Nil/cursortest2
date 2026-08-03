package g;

/* loaded from: classes.dex */
public final class s extends g.l implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f3019b;

    /* renamed from: c, reason: collision with root package name */
    public final g.j f3020c;

    /* renamed from: d, reason: collision with root package name */
    public final g.h f3021d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3022e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3023f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3024g;

    /* renamed from: h, reason: collision with root package name */
    public final h.L f3025h;

    /* renamed from: i, reason: collision with root package name */
    public final g.c f3026i;

    /* renamed from: j, reason: collision with root package name */
    public final g.d f3027j;

    /* renamed from: k, reason: collision with root package name */
    public g.m f3028k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f3029l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f3030m;

    /* renamed from: n, reason: collision with root package name */
    public g.o f3031n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewTreeObserver f3032o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3033p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3034q;

    /* renamed from: r, reason: collision with root package name */
    public int f3035r;

    /* renamed from: s, reason: collision with root package name */
    public int f3036s = 0;
    public boolean t;

    public s(int i2, android.content.Context context, android.view.View view, g.j jVar, boolean z2) {
        int i3 = 1;
        this.f3026i = new g.c(this, i3);
        this.f3027j = new g.d(this, i3);
        this.f3019b = context;
        this.f3020c = jVar;
        this.f3022e = z2;
        this.f3021d = new g.h(jVar, android.view.LayoutInflater.from(context), z2, com.watchfacestudio.huasi_urx110.R.layout.abc_popup_menu_item_layout);
        this.f3024g = i2;
        android.content.res.Resources resources = context.getResources();
        this.f3023f = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.watchfacestudio.huasi_urx110.R.dimen.abc_config_prefDialogWidth));
        this.f3029l = view;
        this.f3025h = new h.L(context, i2);
        jVar.b(this, context);
    }

    @Override // g.p
    public final void a(g.j jVar, boolean z2) {
        if (jVar != this.f3020c) {
            return;
        }
        dismiss();
        g.o oVar = this.f3031n;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // g.p
    public final boolean b(g.t tVar) {
        if (tVar.hasVisibleItems()) {
            g.n nVar = new g.n(this.f3024g, this.f3019b, this.f3030m, tVar, this.f3022e);
            g.o oVar = this.f3031n;
            nVar.f3015h = oVar;
            g.l lVar = nVar.f3016i;
            if (lVar != null) {
                lVar.d(oVar);
            }
            boolean u2 = g.l.u(tVar);
            nVar.f3014g = u2;
            g.l lVar2 = nVar.f3016i;
            if (lVar2 != null) {
                lVar2.o(u2);
            }
            nVar.f3017j = this.f3028k;
            this.f3028k = null;
            this.f3020c.c(false);
            h.L l2 = this.f3025h;
            int i2 = l2.f3071e;
            int i3 = !l2.f3073g ? 0 : l2.f3072f;
            int i4 = this.f3036s;
            android.view.View view = this.f3029l;
            java.lang.reflect.Field field = y.x.f8478a;
            if ((android.view.Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.f3029l.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f3012e != null) {
                    nVar.d(i2, i3, true, true);
                }
            }
            g.o oVar2 = this.f3031n;
            if (oVar2 != null) {
                oVar2.e(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // g.r
    public final void c() {
        android.view.View view;
        if (i()) {
            return;
        }
        if (this.f3033p || (view = this.f3029l) == null) {
            throw new java.lang.IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3030m = view;
        h.L l2 = this.f3025h;
        l2.f3087v.setOnDismissListener(this);
        l2.f3079m = this;
        l2.f3086u = true;
        l2.f3087v.setFocusable(true);
        android.view.View view2 = this.f3030m;
        boolean z2 = this.f3032o == null;
        android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3032o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3026i);
        }
        view2.addOnAttachStateChangeListener(this.f3027j);
        l2.f3078l = view2;
        l2.f3076j = this.f3036s;
        boolean z3 = this.f3034q;
        android.content.Context context = this.f3019b;
        g.h hVar = this.f3021d;
        if (!z3) {
            this.f3035r = g.l.m(hVar, context, this.f3023f);
            this.f3034q = true;
        }
        int i2 = this.f3035r;
        android.graphics.drawable.Drawable background = l2.f3087v.getBackground();
        if (background != null) {
            android.graphics.Rect rect = l2.f3085s;
            background.getPadding(rect);
            l2.f3070d = rect.left + rect.right + i2;
        } else {
            l2.f3070d = i2;
        }
        l2.f3087v.setInputMethodMode(2);
        android.graphics.Rect rect2 = this.f3006a;
        l2.t = rect2 != null ? new android.graphics.Rect(rect2) : null;
        l2.c();
        h.C0142K c0142k = l2.f3069c;
        c0142k.setOnKeyListener(this);
        if (this.t) {
            g.j jVar = this.f3020c;
            if (jVar.f2971l != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.LayoutInflater.from(context).inflate(com.watchfacestudio.huasi_urx110.R.layout.abc_popup_menu_header_item_layout, (android.view.ViewGroup) c0142k, false);
                android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f2971l);
                }
                frameLayout.setEnabled(false);
                c0142k.addHeaderView(frameLayout, null, false);
            }
        }
        l2.a(hVar);
        l2.c();
    }

    @Override // g.p
    public final void d(g.o oVar) {
        this.f3031n = oVar;
    }

    @Override // g.r
    public final void dismiss() {
        if (i()) {
            this.f3025h.dismiss();
        }
    }

    @Override // g.p
    public final boolean e() {
        return false;
    }

    @Override // g.p
    public final void h() {
        this.f3034q = false;
        g.h hVar = this.f3021d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // g.r
    public final boolean i() {
        return !this.f3033p && this.f3025h.f3087v.isShowing();
    }

    @Override // g.r
    public final android.widget.ListView j() {
        return this.f3025h.f3069c;
    }

    @Override // g.l
    public final void n(android.view.View view) {
        this.f3029l = view;
    }

    @Override // g.l
    public final void o(boolean z2) {
        this.f3021d.f2955c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3033p = true;
        this.f3020c.c(true);
        android.view.ViewTreeObserver viewTreeObserver = this.f3032o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3032o = this.f3030m.getViewTreeObserver();
            }
            this.f3032o.removeGlobalOnLayoutListener(this.f3026i);
            this.f3032o = null;
        }
        this.f3030m.removeOnAttachStateChangeListener(this.f3027j);
        g.m mVar = this.f3028k;
        if (mVar != null) {
            mVar.onDismiss();
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
        this.f3036s = i2;
    }

    @Override // g.l
    public final void q(int i2) {
        this.f3025h.f3071e = i2;
    }

    @Override // g.l
    public final void r(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f3028k = (g.m) onDismissListener;
    }

    @Override // g.l
    public final void s(boolean z2) {
        this.t = z2;
    }

    @Override // g.l
    public final void t(int i2) {
        h.L l2 = this.f3025h;
        l2.f3072f = i2;
        l2.f3073g = true;
    }

    @Override // g.l
    public final void l(g.j jVar) {
    }
}
