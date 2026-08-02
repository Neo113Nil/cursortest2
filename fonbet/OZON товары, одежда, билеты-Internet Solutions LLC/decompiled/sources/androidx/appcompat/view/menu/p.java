package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.O;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
final class p extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    private final Context f37492b;

    /* renamed from: c, reason: collision with root package name */
    private final g f37493c;

    /* renamed from: d, reason: collision with root package name */
    private final f f37494d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37495e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37496f;

    /* renamed from: g, reason: collision with root package name */
    private final int f37497g;

    /* renamed from: h, reason: collision with root package name */
    final O f37498h;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f37501k;

    /* renamed from: l, reason: collision with root package name */
    private View f37502l;

    /* renamed from: m, reason: collision with root package name */
    View f37503m;

    /* renamed from: n, reason: collision with root package name */
    private m.a f37504n;

    /* renamed from: o, reason: collision with root package name */
    ViewTreeObserver f37505o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f37506p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37507q;

    /* renamed from: r, reason: collision with root package name */
    private int f37508r;

    /* renamed from: t, reason: collision with root package name */
    private boolean f37510t;

    /* renamed from: i, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f37499i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f37500j = new b();

    /* renamed from: s, reason: collision with root package name */
    private int f37509s = 0;

    final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            p pVar = p.this;
            if (pVar.a()) {
                O o11 = pVar.f37498h;
                if (o11.v()) {
                    return;
                }
                View view = pVar.f37503m;
                if (view == null || !view.isShown()) {
                    pVar.dismiss();
                } else {
                    o11.show();
                }
            }
        }
    }

    final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            p pVar = p.this;
            ViewTreeObserver viewTreeObserver = pVar.f37505o;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    pVar.f37505o = view.getViewTreeObserver();
                }
                pVar.f37505o.removeGlobalOnLayoutListener(pVar.f37499i);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public p(int i11, Context context, View view, g gVar, boolean z11) {
        this.f37492b = context;
        this.f37493c = gVar;
        this.f37495e = z11;
        this.f37494d = new f(gVar, LayoutInflater.from(context), z11, R.layout.abc_popup_menu_item_layout);
        this.f37497g = i11;
        Resources resources = context.getResources();
        this.f37496f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f37502l = view;
        this.f37498h = new O(context, null, i11);
        gVar.c(this, context);
    }

    @Override // m.InterfaceC7975b
    public final boolean a() {
        return !this.f37506p && this.f37498h.a();
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(g gVar, boolean z11) {
        if (gVar != this.f37493c) {
            return;
        }
        dismiss();
        m.a aVar = this.f37504n;
        if (aVar != null) {
            aVar.b(gVar, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final Parcelable c() {
        return null;
    }

    @Override // m.InterfaceC7975b
    public final void dismiss() {
        if (a()) {
            this.f37498h.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void e(boolean z11) {
        this.f37507q = false;
        f fVar = this.f37494d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean f() {
        return false;
    }

    @Override // m.InterfaceC7975b
    public final ListView h() {
        return this.f37498h.h();
    }

    @Override // androidx.appcompat.view.menu.m
    public final void i(m.a aVar) {
        this.f37504n = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void k(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean l(q qVar) {
        boolean z11;
        if (qVar.hasVisibleItems()) {
            l lVar = new l(this.f37497g, this.f37492b, this.f37503m, qVar, this.f37495e);
            lVar.i(this.f37504n);
            int size = qVar.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z11 = false;
                    break;
                }
                MenuItem item = qVar.getItem(i11);
                if (item.isVisible() && item.getIcon() != null) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            lVar.f(z11);
            lVar.h(this.f37501k);
            this.f37501k = null;
            this.f37493c.e(false);
            O o11 = this.f37498h;
            int g10 = o11.g();
            int f7 = o11.f();
            if ((Gravity.getAbsoluteGravity(this.f37509s, this.f37502l.getLayoutDirection()) & 7) == 5) {
                g10 += this.f37502l.getWidth();
            }
            if (lVar.l(g10, f7)) {
                m.a aVar = this.f37504n;
                if (aVar != null) {
                    aVar.c(qVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void m(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f37506p = true;
        this.f37493c.e(true);
        ViewTreeObserver viewTreeObserver = this.f37505o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f37505o = this.f37503m.getViewTreeObserver();
            }
            this.f37505o.removeGlobalOnLayoutListener(this.f37499i);
            this.f37505o = null;
        }
        this.f37503m.removeOnAttachStateChangeListener(this.f37500j);
        PopupWindow.OnDismissListener onDismissListener = this.f37501k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i11 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void p(View view) {
        this.f37502l = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void r(boolean z11) {
        this.f37494d.e(z11);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void s(int i11) {
        this.f37509s = i11;
    }

    @Override // m.InterfaceC7975b
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f37506p || (view = this.f37502l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f37503m = view;
        O o11 = this.f37498h;
        o11.D(this);
        o11.E(this);
        o11.C();
        View view2 = this.f37503m;
        boolean z11 = this.f37505o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f37505o = viewTreeObserver;
        if (z11) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f37499i);
        }
        view2.addOnAttachStateChangeListener(this.f37500j);
        o11.w(view2);
        o11.z(this.f37509s);
        boolean z12 = this.f37507q;
        Context context = this.f37492b;
        f fVar = this.f37494d;
        if (!z12) {
            this.f37508r = k.o(fVar, context, this.f37496f);
            this.f37507q = true;
        }
        o11.y(this.f37508r);
        o11.B();
        o11.A(n());
        o11.show();
        ListView h11 = o11.h();
        h11.setOnKeyListener(this);
        if (this.f37510t) {
            g gVar = this.f37493c;
            if (gVar.f37423m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) h11, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(gVar.f37423m);
                }
                frameLayout.setEnabled(false);
                h11.addHeaderView(frameLayout, null, false);
            }
        }
        o11.n(fVar);
        o11.show();
    }

    @Override // androidx.appcompat.view.menu.k
    public final void t(int i11) {
        this.f37498h.j(i11);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f37501k = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void v(boolean z11) {
        this.f37510t = z11;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void w(int i11) {
        this.f37498h.c(i11);
    }
}
