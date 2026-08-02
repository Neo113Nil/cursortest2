package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.core.view.C5326k0;
import androidx.core.view.C5330m0;
import i.C6977a;
import j.C7232a;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class f0 implements F {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f37911a;

    /* renamed from: b, reason: collision with root package name */
    private int f37912b;

    /* renamed from: c, reason: collision with root package name */
    private View f37913c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f37914d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f37915e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f37916f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37917g;

    /* renamed from: h, reason: collision with root package name */
    CharSequence f37918h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f37919i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f37920j;

    /* renamed from: k, reason: collision with root package name */
    Window.Callback f37921k;

    /* renamed from: l, reason: collision with root package name */
    boolean f37922l;

    /* renamed from: m, reason: collision with root package name */
    private C5058c f37923m;

    /* renamed from: n, reason: collision with root package name */
    private int f37924n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f37925o;

    final class a extends C5330m0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f37926a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37927b;

        a(int i11) {
            this.f37927b = i11;
        }

        @Override // androidx.core.view.C5330m0, androidx.core.view.InterfaceC5328l0
        public final void a() {
            f0.this.f37911a.setVisibility(0);
        }

        @Override // androidx.core.view.C5330m0, androidx.core.view.InterfaceC5328l0
        public final void onAnimationCancel() {
            this.f37926a = true;
        }

        @Override // androidx.core.view.InterfaceC5328l0
        public final void onAnimationEnd() {
            if (this.f37926a) {
                return;
            }
            f0.this.f37911a.setVisibility(this.f37927b);
        }
    }

    public f0(Toolbar toolbar, boolean z11) {
        Drawable drawable;
        this.f37924n = 0;
        this.f37911a = toolbar;
        this.f37918h = toolbar.getTitle();
        this.f37919i = toolbar.getSubtitle();
        this.f37917g = this.f37918h != null;
        this.f37916f = toolbar.getNavigationIcon();
        b0 v11 = b0.v(toolbar.getContext(), null, C6977a.f65647a, R.attr.actionBarStyle, 0);
        int i11 = 15;
        this.f37925o = v11.g(15);
        if (z11) {
            CharSequence p11 = v11.p(27);
            if (!TextUtils.isEmpty(p11)) {
                setTitle(p11);
            }
            CharSequence p12 = v11.p(25);
            if (!TextUtils.isEmpty(p12)) {
                this.f37919i = p12;
                if ((this.f37912b & 8) != 0) {
                    toolbar.setSubtitle(p12);
                }
            }
            Drawable g10 = v11.g(20);
            if (g10 != null) {
                this.f37915e = g10;
                z();
            }
            Drawable g11 = v11.g(17);
            if (g11 != null) {
                this.f37914d = g11;
                z();
            }
            if (this.f37916f == null && (drawable = this.f37925o) != null) {
                s(drawable);
            }
            k(v11.k(10, 0));
            int n11 = v11.n(9, 0);
            if (n11 != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(n11, (ViewGroup) toolbar, false);
                View view = this.f37913c;
                if (view != null && (this.f37912b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f37913c = inflate;
                if (inflate != null && (this.f37912b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                k(this.f37912b | 16);
            }
            int m11 = v11.m(13, 0);
            if (m11 > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = m11;
                toolbar.setLayoutParams(layoutParams);
            }
            int e11 = v11.e(7, -1);
            int e12 = v11.e(3, -1);
            if (e11 >= 0 || e12 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(e11, 0), Math.max(e12, 0));
            }
            int n12 = v11.n(28, 0);
            if (n12 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), n12);
            }
            int n13 = v11.n(26, 0);
            if (n13 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), n13);
            }
            int n14 = v11.n(22, 0);
            if (n14 != 0) {
                toolbar.setPopupTheme(n14);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f37925o = toolbar.getNavigationIcon();
            } else {
                i11 = 11;
            }
            this.f37912b = i11;
        }
        v11.x();
        if (R.string.abc_action_bar_up_description != this.f37924n) {
            this.f37924n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i12 = this.f37924n;
                this.f37920j = i12 != 0 ? toolbar.getContext().getString(i12) : null;
                y();
            }
        }
        this.f37920j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new e0(this));
    }

    private void y() {
        if ((this.f37912b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f37920j);
            Toolbar toolbar = this.f37911a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f37924n);
            } else {
                toolbar.setNavigationContentDescription(this.f37920j);
            }
        }
    }

    private void z() {
        Drawable drawable;
        int i11 = this.f37912b;
        if ((i11 & 2) == 0) {
            drawable = null;
        } else if ((i11 & 1) != 0) {
            drawable = this.f37915e;
            if (drawable == null) {
                drawable = this.f37914d;
            }
        } else {
            drawable = this.f37914d;
        }
        this.f37911a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.F
    public final boolean a() {
        return this.f37911a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.F
    public final boolean b() {
        return this.f37911a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.F
    public final boolean c() {
        return this.f37911a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.F
    public final void collapseActionView() {
        this.f37911a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.F
    public final void d(Window.Callback callback) {
        this.f37921k = callback;
    }

    @Override // androidx.appcompat.widget.F
    public final void e(androidx.appcompat.view.menu.g gVar, m.a aVar) {
        C5058c c5058c = this.f37923m;
        Toolbar toolbar = this.f37911a;
        if (c5058c == null) {
            C5058c c5058c2 = new C5058c(toolbar.getContext());
            this.f37923m = c5058c2;
            c5058c2.p();
        }
        this.f37923m.i(aVar);
        toolbar.setMenu(gVar, this.f37923m);
    }

    @Override // androidx.appcompat.widget.F
    public final boolean f() {
        return this.f37911a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.F
    public final void g(CharSequence charSequence) {
        if (this.f37917g) {
            return;
        }
        this.f37918h = charSequence;
        if ((this.f37912b & 8) != 0) {
            Toolbar toolbar = this.f37911a;
            toolbar.setTitle(charSequence);
            if (this.f37917g) {
                androidx.core.view.Y.E(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.F
    public final Context getContext() {
        return this.f37911a.getContext();
    }

    @Override // androidx.appcompat.widget.F
    public final void h() {
        this.f37922l = true;
    }

    @Override // androidx.appcompat.widget.F
    public final boolean i() {
        return this.f37911a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.F
    public final boolean j() {
        return this.f37911a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.F
    public final void k(int i11) {
        View view;
        int i12 = this.f37912b ^ i11;
        this.f37912b = i11;
        if (i12 != 0) {
            if ((i12 & 4) != 0) {
                if ((i11 & 4) != 0) {
                    y();
                }
                int i13 = this.f37912b & 4;
                Toolbar toolbar = this.f37911a;
                if (i13 != 0) {
                    Drawable drawable = this.f37916f;
                    if (drawable == null) {
                        drawable = this.f37925o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i12 & 3) != 0) {
                z();
            }
            int i14 = i12 & 8;
            Toolbar toolbar2 = this.f37911a;
            if (i14 != 0) {
                if ((i11 & 8) != 0) {
                    toolbar2.setTitle(this.f37918h);
                    toolbar2.setSubtitle(this.f37919i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i12 & 16) == 0 || (view = this.f37913c) == null) {
                return;
            }
            if ((i11 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.F
    public final void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.F
    public final void m(boolean z11) {
        this.f37911a.setCollapsible(z11);
    }

    @Override // androidx.appcompat.widget.F
    public final void n() {
        this.f37911a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.F
    public final void o() {
    }

    @Override // androidx.appcompat.widget.F
    public final void p(int i11) {
        this.f37911a.setVisibility(i11);
    }

    @Override // androidx.appcompat.widget.F
    public final int q() {
        return this.f37912b;
    }

    @Override // androidx.appcompat.widget.F
    public final void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.F
    public final void s(Drawable drawable) {
        this.f37916f = drawable;
        int i11 = this.f37912b & 4;
        Toolbar toolbar = this.f37911a;
        if (i11 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = this.f37925o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.F
    public final void setTitle(CharSequence charSequence) {
        this.f37917g = true;
        this.f37918h = charSequence;
        if ((this.f37912b & 8) != 0) {
            Toolbar toolbar = this.f37911a;
            toolbar.setTitle(charSequence);
            if (this.f37917g) {
                androidx.core.view.Y.E(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.F
    public final C5326k0 t(int i11, long j11) {
        C5326k0 b11 = androidx.core.view.Y.b(this.f37911a);
        b11.a(i11 == 0 ? 1.0f : 0.0f);
        b11.d(j11);
        b11.f(new a(i11));
        return b11;
    }

    @Override // androidx.appcompat.widget.F
    public final void u(int i11) {
        s(i11 != 0 ? C7232a.a(this.f37911a.getContext(), i11) : null);
    }

    public final Menu v() {
        return this.f37911a.getMenu();
    }

    public final Toolbar w() {
        return this.f37911a;
    }

    public final void x(m.a aVar, g.a aVar2) {
        this.f37911a.setMenuCallbacks(aVar, aVar2);
    }
}
