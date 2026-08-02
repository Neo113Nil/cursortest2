package m;

import A0.I;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import game.betting133.sports1xbet.R;
import n.C2139i0;
import n.j0;

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2079q extends AbstractC2072j implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A, reason: collision with root package name */
    public boolean f17961A;

    /* renamed from: B, reason: collision with root package name */
    public int f17962B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f17964D;

    /* renamed from: l, reason: collision with root package name */
    public final Context f17965l;

    /* renamed from: m, reason: collision with root package name */
    public final MenuC2070h f17966m;

    /* renamed from: n, reason: collision with root package name */
    public final C2068f f17967n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17968o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17969p;

    /* renamed from: q, reason: collision with root package name */
    public final int f17970q;

    /* renamed from: r, reason: collision with root package name */
    public final j0 f17971r;

    /* renamed from: u, reason: collision with root package name */
    public C2073k f17974u;

    /* renamed from: v, reason: collision with root package name */
    public View f17975v;

    /* renamed from: w, reason: collision with root package name */
    public View f17976w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC2075m f17977x;

    /* renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f17978y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17979z;

    /* renamed from: s, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2065c f17972s = new ViewTreeObserverOnGlobalLayoutListenerC2065c(this, 1);

    /* renamed from: t, reason: collision with root package name */
    public final I f17973t = new I(5, this);

    /* renamed from: C, reason: collision with root package name */
    public int f17963C = 0;

    public ViewOnKeyListenerC2079q(int i, Context context, View view, MenuC2070h menuC2070h, boolean z3) {
        this.f17965l = context;
        this.f17966m = menuC2070h;
        this.f17968o = z3;
        this.f17967n = new C2068f(menuC2070h, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f17970q = i;
        Resources resources = context.getResources();
        this.f17969p = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f17975v = view;
        this.f17971r = new j0(context, i);
        menuC2070h.b(this, context);
    }

    @Override // m.InterfaceC2076n
    public final void a(MenuC2070h menuC2070h, boolean z3) {
        if (menuC2070h != this.f17966m) {
            return;
        }
        dismiss();
        InterfaceC2075m interfaceC2075m = this.f17977x;
        if (interfaceC2075m != null) {
            interfaceC2075m.a(menuC2070h, z3);
        }
    }

    @Override // m.InterfaceC2078p
    public final void b() {
        View view;
        if (i()) {
            return;
        }
        if (this.f17979z || (view = this.f17975v) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f17976w = view;
        j0 j0Var = this.f17971r;
        j0Var.f18227F.setOnDismissListener(this);
        j0Var.f18240w = this;
        j0Var.f18226E = true;
        j0Var.f18227F.setFocusable(true);
        View view2 = this.f17976w;
        boolean z3 = this.f17978y == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f17978y = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f17972s);
        }
        view2.addOnAttachStateChangeListener(this.f17973t);
        j0Var.f18239v = view2;
        j0Var.f18237t = this.f17963C;
        boolean z5 = this.f17961A;
        Context context = this.f17965l;
        C2068f c2068f = this.f17967n;
        if (!z5) {
            this.f17962B = AbstractC2072j.m(c2068f, context, this.f17969p);
            this.f17961A = true;
        }
        int i = this.f17962B;
        Drawable background = j0Var.f18227F.getBackground();
        if (background != null) {
            Rect rect = j0Var.f18224C;
            background.getPadding(rect);
            j0Var.f18231n = rect.left + rect.right + i;
        } else {
            j0Var.f18231n = i;
        }
        j0Var.f18227F.setInputMethodMode(2);
        Rect rect2 = this.f17950k;
        j0Var.f18225D = rect2 != null ? new Rect(rect2) : null;
        j0Var.b();
        C2139i0 c2139i0 = j0Var.f18230m;
        c2139i0.setOnKeyListener(this);
        if (this.f17964D) {
            MenuC2070h menuC2070h = this.f17966m;
            if (menuC2070h.f17914l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c2139i0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC2070h.f17914l);
                }
                frameLayout.setEnabled(false);
                c2139i0.addHeaderView(frameLayout, null, false);
            }
        }
        j0Var.c(c2068f);
        j0Var.b();
    }

    @Override // m.InterfaceC2076n
    public final void c() {
        this.f17961A = false;
        C2068f c2068f = this.f17967n;
        if (c2068f != null) {
            c2068f.notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC2078p
    public final ListView d() {
        return this.f17971r.f18230m;
    }

    @Override // m.InterfaceC2078p
    public final void dismiss() {
        if (i()) {
            this.f17971r.dismiss();
        }
    }

    @Override // m.InterfaceC2076n
    public final boolean g() {
        return false;
    }

    @Override // m.InterfaceC2076n
    public final boolean h(SubMenuC2080r subMenuC2080r) {
        if (subMenuC2080r.hasVisibleItems()) {
            C2074l c2074l = new C2074l(this.f17970q, this.f17965l, this.f17976w, subMenuC2080r, this.f17968o);
            InterfaceC2075m interfaceC2075m = this.f17977x;
            c2074l.f17958h = interfaceC2075m;
            AbstractC2072j abstractC2072j = c2074l.i;
            if (abstractC2072j != null) {
                abstractC2072j.j(interfaceC2075m);
            }
            boolean u5 = AbstractC2072j.u(subMenuC2080r);
            c2074l.f17957g = u5;
            AbstractC2072j abstractC2072j2 = c2074l.i;
            if (abstractC2072j2 != null) {
                abstractC2072j2.o(u5);
            }
            c2074l.f17959j = this.f17974u;
            this.f17974u = null;
            this.f17966m.c(false);
            j0 j0Var = this.f17971r;
            int i = j0Var.f18232o;
            int i5 = !j0Var.f18234q ? 0 : j0Var.f18233p;
            if ((Gravity.getAbsoluteGravity(this.f17963C, this.f17975v.getLayoutDirection()) & 7) == 5) {
                i += this.f17975v.getWidth();
            }
            if (!c2074l.b()) {
                if (c2074l.f17956e != null) {
                    c2074l.d(i, i5, true, true);
                }
            }
            InterfaceC2075m interfaceC2075m2 = this.f17977x;
            if (interfaceC2075m2 != null) {
                interfaceC2075m2.d(subMenuC2080r);
            }
            return true;
        }
        return false;
    }

    @Override // m.InterfaceC2078p
    public final boolean i() {
        return !this.f17979z && this.f17971r.f18227F.isShowing();
    }

    @Override // m.InterfaceC2076n
    public final void j(InterfaceC2075m interfaceC2075m) {
        this.f17977x = interfaceC2075m;
    }

    @Override // m.AbstractC2072j
    public final void n(View view) {
        this.f17975v = view;
    }

    @Override // m.AbstractC2072j
    public final void o(boolean z3) {
        this.f17967n.f17901c = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f17979z = true;
        this.f17966m.c(true);
        ViewTreeObserver viewTreeObserver = this.f17978y;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f17978y = this.f17976w.getViewTreeObserver();
            }
            this.f17978y.removeGlobalOnLayoutListener(this.f17972s);
            this.f17978y = null;
        }
        this.f17976w.removeOnAttachStateChangeListener(this.f17973t);
        C2073k c2073k = this.f17974u;
        if (c2073k != null) {
            c2073k.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // m.AbstractC2072j
    public final void p(int i) {
        this.f17963C = i;
    }

    @Override // m.AbstractC2072j
    public final void q(int i) {
        this.f17971r.f18232o = i;
    }

    @Override // m.AbstractC2072j
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f17974u = (C2073k) onDismissListener;
    }

    @Override // m.AbstractC2072j
    public final void s(boolean z3) {
        this.f17964D = z3;
    }

    @Override // m.AbstractC2072j
    public final void t(int i) {
        j0 j0Var = this.f17971r;
        j0Var.f18233p = i;
        j0Var.f18234q = true;
    }

    @Override // m.AbstractC2072j
    public final void l(MenuC2070h menuC2070h) {
    }
}
