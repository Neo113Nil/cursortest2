package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AbstractC5051a;
import androidx.appcompat.app.l;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C5326k0;
import androidx.core.view.C5330m0;
import androidx.core.view.InterfaceC5328l0;
import androidx.core.view.InterfaceC5332n0;
import androidx.core.view.Y;
import i.C6977a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class E extends AbstractC5051a {

    /* renamed from: y, reason: collision with root package name */
    private static final AccelerateInterpolator f37075y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    private static final DecelerateInterpolator f37076z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Context f37077a;

    /* renamed from: b, reason: collision with root package name */
    private Context f37078b;

    /* renamed from: c, reason: collision with root package name */
    ActionBarOverlayLayout f37079c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f37080d;

    /* renamed from: e, reason: collision with root package name */
    F f37081e;

    /* renamed from: f, reason: collision with root package name */
    ActionBarContextView f37082f;

    /* renamed from: g, reason: collision with root package name */
    View f37083g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37084h;

    /* renamed from: i, reason: collision with root package name */
    d f37085i;

    /* renamed from: j, reason: collision with root package name */
    d f37086j;

    /* renamed from: k, reason: collision with root package name */
    b.a f37087k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f37088l;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<AbstractC5051a.b> f37089m;

    /* renamed from: n, reason: collision with root package name */
    private int f37090n;

    /* renamed from: o, reason: collision with root package name */
    boolean f37091o;

    /* renamed from: p, reason: collision with root package name */
    boolean f37092p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37093q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f37094r;

    /* renamed from: s, reason: collision with root package name */
    androidx.appcompat.view.h f37095s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f37096t;

    /* renamed from: u, reason: collision with root package name */
    boolean f37097u;

    /* renamed from: v, reason: collision with root package name */
    final InterfaceC5328l0 f37098v;

    /* renamed from: w, reason: collision with root package name */
    final InterfaceC5328l0 f37099w;

    /* renamed from: x, reason: collision with root package name */
    final InterfaceC5332n0 f37100x;

    final class a extends C5330m0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC5328l0
        public final void onAnimationEnd() {
            View view;
            E e11 = E.this;
            if (e11.f37091o && (view = e11.f37083g) != null) {
                view.setTranslationY(0.0f);
                e11.f37080d.setTranslationY(0.0f);
            }
            e11.f37080d.setVisibility(8);
            e11.f37080d.a(false);
            e11.f37095s = null;
            b.a aVar = e11.f37087k;
            if (aVar != null) {
                ((l.d) aVar).c(e11.f37086j);
                e11.f37086j = null;
                e11.f37087k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = e11.f37079c;
            if (actionBarOverlayLayout != null) {
                Y.A(actionBarOverlayLayout);
            }
        }
    }

    final class b extends C5330m0 {
        b() {
        }

        @Override // androidx.core.view.InterfaceC5328l0
        public final void onAnimationEnd() {
            E e11 = E.this;
            e11.f37095s = null;
            e11.f37080d.requestLayout();
        }
    }

    final class c implements InterfaceC5332n0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC5332n0
        public final void a() {
            ((View) E.this.f37080d.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f37104c;

        /* renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f37105d;

        /* renamed from: e, reason: collision with root package name */
        private b.a f37106e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference<View> f37107f;

        public d(Context context, b.a aVar) {
            this.f37104c = context;
            this.f37106e = aVar;
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            gVar.G();
            this.f37105d = gVar;
            gVar.F(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public final void a(@NonNull androidx.appcompat.view.menu.g gVar) {
            if (this.f37106e == null) {
                return;
            }
            k();
            E.this.f37082f.r();
        }

        @Override // androidx.appcompat.view.menu.g.a
        public final boolean b(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull androidx.appcompat.view.menu.i iVar) {
            b.a aVar = this.f37106e;
            if (aVar != null) {
                return ((l.d) aVar).b(this, iVar);
            }
            return false;
        }

        @Override // androidx.appcompat.view.b
        public final void c() {
            E e11 = E.this;
            if (e11.f37085i != this) {
                return;
            }
            if (e11.f37092p) {
                e11.f37086j = this;
                e11.f37087k = this.f37106e;
            } else {
                ((l.d) this.f37106e).c(this);
            }
            this.f37106e = null;
            e11.v(false);
            e11.f37082f.f();
            e11.f37079c.s(e11.f37097u);
            e11.f37085i = null;
        }

        @Override // androidx.appcompat.view.b
        public final View d() {
            WeakReference<View> weakReference = this.f37107f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public final androidx.appcompat.view.menu.g e() {
            return this.f37105d;
        }

        @Override // androidx.appcompat.view.b
        public final MenuInflater f() {
            return new androidx.appcompat.view.g(this.f37104c);
        }

        @Override // androidx.appcompat.view.b
        public final CharSequence g() {
            return E.this.f37082f.g();
        }

        @Override // androidx.appcompat.view.b
        public final CharSequence i() {
            return E.this.f37082f.h();
        }

        @Override // androidx.appcompat.view.b
        public final void k() {
            if (E.this.f37085i != this) {
                return;
            }
            androidx.appcompat.view.menu.g gVar = this.f37105d;
            gVar.Q();
            try {
                ((l.d) this.f37106e).d(this, gVar);
            } finally {
                gVar.P();
            }
        }

        @Override // androidx.appcompat.view.b
        public final boolean l() {
            return E.this.f37082f.k();
        }

        @Override // androidx.appcompat.view.b
        public final void m(View view) {
            E.this.f37082f.m(view);
            this.f37107f = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public final void n(int i11) {
            o(E.this.f37077a.getResources().getString(i11));
        }

        @Override // androidx.appcompat.view.b
        public final void o(CharSequence charSequence) {
            E.this.f37082f.n(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public final void q(int i11) {
            r(E.this.f37077a.getResources().getString(i11));
        }

        @Override // androidx.appcompat.view.b
        public final void r(CharSequence charSequence) {
            E.this.f37082f.o(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public final void s(boolean z11) {
            super.s(z11);
            E.this.f37082f.p(z11);
        }

        public final boolean t() {
            androidx.appcompat.view.menu.g gVar = this.f37105d;
            gVar.Q();
            try {
                return ((l.d) this.f37106e).a(this, gVar);
            } finally {
                gVar.P();
            }
        }
    }

    public E(Activity activity, boolean z11) {
        new ArrayList();
        this.f37089m = new ArrayList<>();
        this.f37090n = 0;
        this.f37091o = true;
        this.f37094r = true;
        this.f37098v = new a();
        this.f37099w = new b();
        this.f37100x = new c();
        View decorView = activity.getWindow().getDecorView();
        y(decorView);
        if (z11) {
            return;
        }
        this.f37083g = decorView.findViewById(R.id.content);
    }

    private void C(boolean z11) {
        if (z11) {
            this.f37080d.getClass();
            this.f37081e.o();
        } else {
            this.f37081e.o();
            this.f37080d.getClass();
        }
        this.f37081e.getClass();
        this.f37081e.m(false);
        this.f37079c.r(false);
    }

    private void E(boolean z11) {
        boolean z12 = this.f37093q || !this.f37092p;
        InterfaceC5332n0 interfaceC5332n0 = this.f37100x;
        View view = this.f37083g;
        if (!z12) {
            if (this.f37094r) {
                this.f37094r = false;
                androidx.appcompat.view.h hVar = this.f37095s;
                if (hVar != null) {
                    hVar.a();
                }
                int i11 = this.f37090n;
                InterfaceC5328l0 interfaceC5328l0 = this.f37098v;
                if (i11 != 0 || (!this.f37096t && !z11)) {
                    ((a) interfaceC5328l0).onAnimationEnd();
                    return;
                }
                this.f37080d.setAlpha(1.0f);
                this.f37080d.a(true);
                androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
                float f7 = -this.f37080d.getHeight();
                if (z11) {
                    this.f37080d.getLocationInWindow(new int[]{0, 0});
                    f7 -= r9[1];
                }
                C5326k0 b11 = Y.b(this.f37080d);
                b11.k(f7);
                b11.h(interfaceC5332n0);
                hVar2.c(b11);
                if (this.f37091o && view != null) {
                    C5326k0 b12 = Y.b(view);
                    b12.k(f7);
                    hVar2.c(b12);
                }
                hVar2.f(f37075y);
                hVar2.e();
                hVar2.g((C5330m0) interfaceC5328l0);
                this.f37095s = hVar2;
                hVar2.h();
                return;
            }
            return;
        }
        if (this.f37094r) {
            return;
        }
        this.f37094r = true;
        androidx.appcompat.view.h hVar3 = this.f37095s;
        if (hVar3 != null) {
            hVar3.a();
        }
        this.f37080d.setVisibility(0);
        int i12 = this.f37090n;
        InterfaceC5328l0 interfaceC5328l02 = this.f37099w;
        if (i12 == 0 && (this.f37096t || z11)) {
            this.f37080d.setTranslationY(0.0f);
            float f11 = -this.f37080d.getHeight();
            if (z11) {
                this.f37080d.getLocationInWindow(new int[]{0, 0});
                f11 -= r9[1];
            }
            this.f37080d.setTranslationY(f11);
            androidx.appcompat.view.h hVar4 = new androidx.appcompat.view.h();
            C5326k0 b13 = Y.b(this.f37080d);
            b13.k(0.0f);
            b13.h(interfaceC5332n0);
            hVar4.c(b13);
            if (this.f37091o && view != null) {
                view.setTranslationY(f11);
                C5326k0 b14 = Y.b(view);
                b14.k(0.0f);
                hVar4.c(b14);
            }
            hVar4.f(f37076z);
            hVar4.e();
            hVar4.g((C5330m0) interfaceC5328l02);
            this.f37095s = hVar4;
            hVar4.h();
        } else {
            this.f37080d.setAlpha(1.0f);
            this.f37080d.setTranslationY(0.0f);
            if (this.f37091o && view != null) {
                view.setTranslationY(0.0f);
            }
            ((b) interfaceC5328l02).onAnimationEnd();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f37079c;
        if (actionBarOverlayLayout != null) {
            Y.A(actionBarOverlayLayout);
        }
    }

    private void y(View view) {
        F wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ru.ozon.app.android.R.id.decor_content_parent);
        this.f37079c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.q(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(ru.ozon.app.android.R.id.action_bar);
        if (findViewById instanceof F) {
            wrapper = (F) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f37081e = wrapper;
        this.f37082f = (ActionBarContextView) view.findViewById(ru.ozon.app.android.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ru.ozon.app.android.R.id.action_bar_container);
        this.f37080d = actionBarContainer;
        F f7 = this.f37081e;
        if (f7 == null || this.f37082f == null || actionBarContainer == null) {
            throw new IllegalStateException(E.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f37077a = f7.getContext();
        if ((this.f37081e.q() & 4) != 0) {
            this.f37084h = true;
        }
        androidx.appcompat.view.a b11 = androidx.appcompat.view.a.b(this.f37077a);
        b11.a();
        this.f37081e.getClass();
        C(b11.e());
        TypedArray obtainStyledAttributes = this.f37077a.obtainStyledAttributes(null, C6977a.f65647a, ru.ozon.app.android.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            if (!this.f37079c.o()) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f37097u = true;
            this.f37079c.s(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            Y.H(this.f37080d, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void A(int i11) {
        this.f37090n = i11;
    }

    public final void B(int i11, int i12) {
        int q11 = this.f37081e.q();
        if ((i12 & 4) != 0) {
            this.f37084h = true;
        }
        this.f37081e.k((i11 & i12) | ((~i12) & q11));
    }

    public final void D() {
        if (this.f37092p) {
            this.f37092p = false;
            E(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final boolean b() {
        F f7 = this.f37081e;
        if (f7 == null || !f7.j()) {
            return false;
        }
        this.f37081e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void c(boolean z11) {
        if (z11 == this.f37088l) {
            return;
        }
        this.f37088l = z11;
        ArrayList<AbstractC5051a.b> arrayList = this.f37089m;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).a();
        }
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final int d() {
        return this.f37081e.q();
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final Context e() {
        if (this.f37078b == null) {
            TypedValue typedValue = new TypedValue();
            this.f37077a.getTheme().resolveAttribute(ru.ozon.app.android.R.attr.actionBarWidgetTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                this.f37078b = new ContextThemeWrapper(this.f37077a, i11);
            } else {
                this.f37078b = this.f37077a;
            }
        }
        return this.f37078b;
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void g() {
        C(androidx.appcompat.view.a.b(this.f37077a).e());
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final boolean i(int i11, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.g e11;
        d dVar = this.f37085i;
        if (dVar == null || (e11 = dVar.e()) == null) {
            return false;
        }
        e11.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return e11.performShortcut(i11, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void l(boolean z11) {
        if (this.f37084h) {
            return;
        }
        m(z11);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void m(boolean z11) {
        B(z11 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void n() {
        B(2, 2);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void o() {
        B(0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void p(int i11) {
        this.f37081e.u(i11);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void q(Drawable drawable) {
        this.f37081e.s(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void r(boolean z11) {
        androidx.appcompat.view.h hVar;
        this.f37096t = z11;
        if (z11 || (hVar = this.f37095s) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void s(String str) {
        this.f37081e.setTitle(str);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final void t(CharSequence charSequence) {
        this.f37081e.g(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC5051a
    public final androidx.appcompat.view.b u(b.a aVar) {
        d dVar = this.f37085i;
        if (dVar != null) {
            dVar.c();
        }
        this.f37079c.s(false);
        this.f37082f.l();
        d dVar2 = new d(this.f37082f.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f37085i = dVar2;
        dVar2.k();
        this.f37082f.i(dVar2);
        v(true);
        return dVar2;
    }

    public final void v(boolean z11) {
        C5326k0 t2;
        C5326k0 q11;
        if (z11) {
            if (!this.f37093q) {
                this.f37093q = true;
                E(false);
            }
        } else if (this.f37093q) {
            this.f37093q = false;
            E(false);
        }
        if (!this.f37080d.isLaidOut()) {
            if (z11) {
                this.f37081e.p(4);
                this.f37082f.setVisibility(0);
                return;
            } else {
                this.f37081e.p(0);
                this.f37082f.setVisibility(8);
                return;
            }
        }
        if (z11) {
            q11 = this.f37081e.t(4, 100L);
            t2 = this.f37082f.q(0, 200L);
        } else {
            t2 = this.f37081e.t(0, 200L);
            q11 = this.f37082f.q(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(q11, t2);
        hVar.h();
    }

    public final void w(boolean z11) {
        this.f37091o = z11;
    }

    public final void x() {
        if (this.f37092p) {
            return;
        }
        this.f37092p = true;
        E(true);
    }

    public final void z() {
        androidx.appcompat.view.h hVar = this.f37095s;
        if (hVar != null) {
            hVar.a();
            this.f37095s = null;
        }
    }

    public E(Dialog dialog) {
        new ArrayList();
        this.f37089m = new ArrayList<>();
        this.f37090n = 0;
        this.f37091o = true;
        this.f37094r = true;
        this.f37098v = new a();
        this.f37099w = new b();
        this.f37100x = new c();
        y(dialog.getWindow().getDecorView());
    }
}
