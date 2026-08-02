package i;

import P.U;
import P.b0;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.InterfaceC0630c;
import androidx.appcompat.widget.InterfaceC0631c0;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.j1;
import h.AbstractC1174a;
import i.C1222I;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.AbstractC1364b;
import l.C1373k;
import l.InterfaceC1363a;

/* renamed from: i.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222I extends AbstractC1223a implements InterfaceC0630c {

    /* renamed from: a, reason: collision with root package name */
    public Context f13630a;

    /* renamed from: b, reason: collision with root package name */
    public Context f13631b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f13632c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f13633d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0631c0 f13634e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f13635f;

    /* renamed from: g, reason: collision with root package name */
    public final View f13636g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13637h;

    /* renamed from: i, reason: collision with root package name */
    public C1221H f13638i;
    public C1221H j;

    /* renamed from: k, reason: collision with root package name */
    public com.google.android.gms.common.internal.w f13639k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13640l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f13641m;

    /* renamed from: n, reason: collision with root package name */
    public int f13642n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13643o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13644p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13645q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13646r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13647s;

    /* renamed from: t, reason: collision with root package name */
    public C1373k f13648t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13649u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13650v;

    /* renamed from: w, reason: collision with root package name */
    public final C1220G f13651w;

    /* renamed from: x, reason: collision with root package name */
    public final C1220G f13652x;

    /* renamed from: y, reason: collision with root package name */
    public final R4.c f13653y;

    /* renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f13629z = new AccelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public static final DecelerateInterpolator f13628A = new DecelerateInterpolator();

    public C1222I(Activity activity, boolean z4) {
        new ArrayList();
        this.f13641m = new ArrayList();
        this.f13642n = 0;
        this.f13643o = true;
        this.f13647s = true;
        this.f13651w = new C1220G(this, 0);
        this.f13652x = new C1220G(this, 1);
        this.f13653y = new R4.c(this, 18);
        View decorView = activity.getWindow().getDecorView();
        w(decorView);
        if (z4) {
            return;
        }
        this.f13636g = decorView.findViewById(R.id.content);
    }

    @Override // i.AbstractC1223a
    public final boolean b() {
        d1 d1Var;
        InterfaceC0631c0 interfaceC0631c0 = this.f13634e;
        if (interfaceC0631c0 == null || (d1Var = ((j1) interfaceC0631c0).f8662a.f8543g0) == null || d1Var.f8613b == null) {
            return false;
        }
        d1 d1Var2 = ((j1) interfaceC0631c0).f8662a.f8543g0;
        m.m mVar = d1Var2 == null ? null : d1Var2.f8613b;
        if (mVar == null) {
            return true;
        }
        mVar.collapseActionView();
        return true;
    }

    @Override // i.AbstractC1223a
    public final void c(boolean z4) {
        if (z4 == this.f13640l) {
            return;
        }
        this.f13640l = z4;
        ArrayList arrayList = this.f13641m;
        if (arrayList.size() > 0) {
            throw e1.k.c(arrayList, 0);
        }
    }

    @Override // i.AbstractC1223a
    public final int d() {
        return ((j1) this.f13634e).f8663b;
    }

    @Override // i.AbstractC1223a
    public final Context e() {
        if (this.f13631b == null) {
            TypedValue typedValue = new TypedValue();
            this.f13630a.getTheme().resolveAttribute(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.actionBarWidgetTheme, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f13631b = new ContextThemeWrapper(this.f13630a, i7);
            } else {
                this.f13631b = this.f13630a;
            }
        }
        return this.f13631b;
    }

    @Override // i.AbstractC1223a
    public final void f() {
        if (this.f13644p) {
            return;
        }
        this.f13644p = true;
        y(false);
    }

    @Override // i.AbstractC1223a
    public final boolean h() {
        int height = this.f13633d.getHeight();
        return this.f13647s && (height == 0 || this.f13632c.getActionBarHideOffset() < height);
    }

    @Override // i.AbstractC1223a
    public final void i() {
        x(this.f13630a.getResources().getBoolean(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // i.AbstractC1223a
    public final boolean k(int i7, KeyEvent keyEvent) {
        m.k kVar;
        C1221H c1221h = this.f13638i;
        if (c1221h == null || (kVar = c1221h.f13624d) == null) {
            return false;
        }
        kVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return kVar.performShortcut(i7, keyEvent, 0);
    }

    @Override // i.AbstractC1223a
    public final void n(ColorDrawable colorDrawable) {
        this.f13633d.setPrimaryBackground(colorDrawable);
    }

    @Override // i.AbstractC1223a
    public final void o(boolean z4) {
        if (this.f13637h) {
            return;
        }
        int i7 = z4 ? 4 : 0;
        j1 j1Var = (j1) this.f13634e;
        int i8 = j1Var.f8663b;
        this.f13637h = true;
        j1Var.a((i7 & 4) | (i8 & (-5)));
    }

    @Override // i.AbstractC1223a
    public final void p(boolean z4) {
        int i7 = z4 ? 8 : 0;
        j1 j1Var = (j1) this.f13634e;
        j1Var.a((i7 & 8) | (j1Var.f8663b & (-9)));
    }

    @Override // i.AbstractC1223a
    public final void q(boolean z4) {
        C1373k c1373k;
        this.f13649u = z4;
        if (z4 || (c1373k = this.f13648t) == null) {
            return;
        }
        c1373k.a();
    }

    @Override // i.AbstractC1223a
    public final void r(CharSequence charSequence) {
        j1 j1Var = (j1) this.f13634e;
        j1Var.f8668g = true;
        j1Var.f8669h = charSequence;
        if ((j1Var.f8663b & 8) != 0) {
            Toolbar toolbar = j1Var.f8662a;
            toolbar.setTitle(charSequence);
            if (j1Var.f8668g) {
                U.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // i.AbstractC1223a
    public final void s(CharSequence charSequence) {
        j1 j1Var = (j1) this.f13634e;
        if (j1Var.f8668g) {
            return;
        }
        j1Var.f8669h = charSequence;
        if ((j1Var.f8663b & 8) != 0) {
            Toolbar toolbar = j1Var.f8662a;
            toolbar.setTitle(charSequence);
            if (j1Var.f8668g) {
                U.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // i.AbstractC1223a
    public final void t() {
        if (this.f13644p) {
            this.f13644p = false;
            y(false);
        }
    }

    @Override // i.AbstractC1223a
    public final AbstractC1364b u(com.google.android.gms.common.internal.w wVar) {
        C1221H c1221h = this.f13638i;
        if (c1221h != null) {
            c1221h.a();
        }
        this.f13632c.setHideOnContentScrollEnabled(false);
        this.f13635f.e();
        C1221H c1221h2 = new C1221H(this, this.f13635f.getContext(), wVar);
        m.k kVar = c1221h2.f13624d;
        kVar.w();
        try {
            if (!((InterfaceC1363a) c1221h2.f13625e.f11335b).e(c1221h2, kVar)) {
                return null;
            }
            this.f13638i = c1221h2;
            c1221h2.i();
            this.f13635f.c(c1221h2);
            v(true);
            return c1221h2;
        } finally {
            kVar.v();
        }
    }

    public final void v(boolean z4) {
        b0 i7;
        b0 b0Var;
        if (z4) {
            if (!this.f13646r) {
                this.f13646r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13632c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                y(false);
            }
        } else if (this.f13646r) {
            this.f13646r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13632c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            y(false);
        }
        ActionBarContainer actionBarContainer = this.f13633d;
        WeakHashMap weakHashMap = U.f5037a;
        if (!actionBarContainer.isLaidOut()) {
            if (z4) {
                ((j1) this.f13634e).f8662a.setVisibility(4);
                this.f13635f.setVisibility(0);
                return;
            } else {
                ((j1) this.f13634e).f8662a.setVisibility(0);
                this.f13635f.setVisibility(8);
                return;
            }
        }
        if (z4) {
            j1 j1Var = (j1) this.f13634e;
            i7 = U.a(j1Var.f8662a);
            i7.a(0.0f);
            i7.c(100L);
            i7.d(new i1(j1Var, 4));
            b0Var = this.f13635f.i(0, 200L);
        } else {
            j1 j1Var2 = (j1) this.f13634e;
            b0 a2 = U.a(j1Var2.f8662a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new i1(j1Var2, 0));
            i7 = this.f13635f.i(8, 100L);
            b0Var = a2;
        }
        C1373k c1373k = new C1373k();
        ArrayList arrayList = (ArrayList) c1373k.f14853c;
        arrayList.add(i7);
        View view = (View) i7.f5049a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) b0Var.f5049a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(b0Var);
        c1373k.d();
    }

    public final void w(View view) {
        InterfaceC0631c0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.decor_content_parent);
        this.f13632c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.action_bar);
        if (findViewById instanceof InterfaceC0631c0) {
            wrapper = (InterfaceC0631c0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f13634e = wrapper;
        this.f13635f = (ActionBarContextView) view.findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.action_bar_container);
        this.f13633d = actionBarContainer;
        InterfaceC0631c0 interfaceC0631c0 = this.f13634e;
        if (interfaceC0631c0 == null || this.f13635f == null || actionBarContainer == null) {
            throw new IllegalStateException(C1222I.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((j1) interfaceC0631c0).f8662a.getContext();
        this.f13630a = context;
        if ((((j1) this.f13634e).f8663b & 4) != 0) {
            this.f13637h = true;
        }
        int i7 = context.getApplicationInfo().targetSdkVersion;
        this.f13634e.getClass();
        x(context.getResources().getBoolean(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f13630a.obtainStyledAttributes(null, AbstractC1174a.f13323a, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13632c;
            if (!actionBarOverlayLayout2.f8233y) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f13650v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f13633d;
            WeakHashMap weakHashMap = U.f5037a;
            P.I.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void x(boolean z4) {
        if (z4) {
            this.f13633d.setTabContainer(null);
            ((j1) this.f13634e).getClass();
        } else {
            ((j1) this.f13634e).getClass();
            this.f13633d.setTabContainer(null);
        }
        this.f13634e.getClass();
        ((j1) this.f13634e).f8662a.setCollapsible(false);
        this.f13632c.setHasNonEmbeddedTabs(false);
    }

    public final void y(boolean z4) {
        boolean z7 = this.f13646r || !(this.f13644p || this.f13645q);
        View view = this.f13636g;
        final R4.c cVar = this.f13653y;
        if (!z7) {
            if (this.f13647s) {
                this.f13647s = false;
                C1373k c1373k = this.f13648t;
                if (c1373k != null) {
                    c1373k.a();
                }
                int i7 = this.f13642n;
                C1220G c1220g = this.f13651w;
                if (i7 != 0 || (!this.f13649u && !z4)) {
                    c1220g.c();
                    return;
                }
                this.f13633d.setAlpha(1.0f);
                this.f13633d.setTransitioning(true);
                C1373k c1373k2 = new C1373k();
                float f7 = -this.f13633d.getHeight();
                if (z4) {
                    this.f13633d.getLocationInWindow(new int[]{0, 0});
                    f7 -= r12[1];
                }
                b0 a2 = U.a(this.f13633d);
                a2.e(f7);
                final View view2 = (View) a2.f5049a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: P.a0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((C1222I) R4.c.this.f6064b).f13633d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z8 = c1373k2.f14852b;
                ArrayList arrayList = (ArrayList) c1373k2.f14853c;
                if (!z8) {
                    arrayList.add(a2);
                }
                if (this.f13643o && view != null) {
                    b0 a4 = U.a(view);
                    a4.e(f7);
                    if (!c1373k2.f14852b) {
                        arrayList.add(a4);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f13629z;
                boolean z9 = c1373k2.f14852b;
                if (!z9) {
                    c1373k2.f14854d = accelerateInterpolator;
                }
                if (!z9) {
                    c1373k2.f14851a = 250L;
                }
                if (!z9) {
                    c1373k2.f14855e = c1220g;
                }
                this.f13648t = c1373k2;
                c1373k2.d();
                return;
            }
            return;
        }
        if (this.f13647s) {
            return;
        }
        this.f13647s = true;
        C1373k c1373k3 = this.f13648t;
        if (c1373k3 != null) {
            c1373k3.a();
        }
        this.f13633d.setVisibility(0);
        int i8 = this.f13642n;
        C1220G c1220g2 = this.f13652x;
        if (i8 == 0 && (this.f13649u || z4)) {
            this.f13633d.setTranslationY(0.0f);
            float f8 = -this.f13633d.getHeight();
            if (z4) {
                this.f13633d.getLocationInWindow(new int[]{0, 0});
                f8 -= r12[1];
            }
            this.f13633d.setTranslationY(f8);
            C1373k c1373k4 = new C1373k();
            b0 a7 = U.a(this.f13633d);
            a7.e(0.0f);
            final View view3 = (View) a7.f5049a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: P.a0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((C1222I) R4.c.this.f6064b).f13633d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z10 = c1373k4.f14852b;
            ArrayList arrayList2 = (ArrayList) c1373k4.f14853c;
            if (!z10) {
                arrayList2.add(a7);
            }
            if (this.f13643o && view != null) {
                view.setTranslationY(f8);
                b0 a8 = U.a(view);
                a8.e(0.0f);
                if (!c1373k4.f14852b) {
                    arrayList2.add(a8);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f13628A;
            boolean z11 = c1373k4.f14852b;
            if (!z11) {
                c1373k4.f14854d = decelerateInterpolator;
            }
            if (!z11) {
                c1373k4.f14851a = 250L;
            }
            if (!z11) {
                c1373k4.f14855e = c1220g2;
            }
            this.f13648t = c1373k4;
            c1373k4.d();
        } else {
            this.f13633d.setAlpha(1.0f);
            this.f13633d.setTranslationY(0.0f);
            if (this.f13643o && view != null) {
                view.setTranslationY(0.0f);
            }
            c1220g2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13632c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = U.f5037a;
            P.G.c(actionBarOverlayLayout);
        }
    }

    public C1222I(Dialog dialog) {
        new ArrayList();
        this.f13641m = new ArrayList();
        this.f13642n = 0;
        this.f13643o = true;
        this.f13647s = true;
        this.f13651w = new C1220G(this, 0);
        this.f13652x = new C1220G(this, 1);
        this.f13653y = new R4.c(this, 18);
        w(dialog.getWindow().getDecorView());
    }
}
