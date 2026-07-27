package k;

import D.z;
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
import com.chicken.jump.road.pump.R;
import java.lang.reflect.Field;
import l.M;
import l.N;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1078s extends AbstractC1071l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f9637b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC1069j f9638c;

    /* renamed from: d, reason: collision with root package name */
    public final C1067h f9639d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9640e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9641g;

    /* renamed from: h, reason: collision with root package name */
    public final N f9642h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1062c f9643i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC1063d f9644j;

    /* renamed from: k, reason: collision with root package name */
    public C1072m f9645k;

    /* renamed from: l, reason: collision with root package name */
    public View f9646l;

    /* renamed from: m, reason: collision with root package name */
    public View f9647m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC1074o f9648n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f9649o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9650p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9651q;

    /* renamed from: r, reason: collision with root package name */
    public int f9652r;

    /* renamed from: s, reason: collision with root package name */
    public int f9653s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9654t;

    public ViewOnKeyListenerC1078s(int i3, Context context, View view, MenuC1069j menuC1069j, boolean z3) {
        int i4 = 1;
        this.f9643i = new ViewTreeObserverOnGlobalLayoutListenerC1062c(this, i4);
        this.f9644j = new ViewOnAttachStateChangeListenerC1063d(this, i4);
        this.f9637b = context;
        this.f9638c = menuC1069j;
        this.f9640e = z3;
        this.f9639d = new C1067h(menuC1069j, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f9641g = i3;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9646l = view;
        this.f9642h = new N(context, i3);
        menuC1069j.b(this, context);
    }

    @Override // k.InterfaceC1075p
    public final void a(MenuC1069j menuC1069j, boolean z3) {
        if (menuC1069j != this.f9638c) {
            return;
        }
        dismiss();
        InterfaceC1074o interfaceC1074o = this.f9648n;
        if (interfaceC1074o != null) {
            interfaceC1074o.a(menuC1069j, z3);
        }
    }

    @Override // k.InterfaceC1075p
    public final boolean c(SubMenuC1079t subMenuC1079t) {
        if (subMenuC1079t.hasVisibleItems()) {
            C1073n c1073n = new C1073n(this.f9641g, this.f9637b, this.f9647m, subMenuC1079t, this.f9640e);
            InterfaceC1074o interfaceC1074o = this.f9648n;
            c1073n.f9633h = interfaceC1074o;
            AbstractC1071l abstractC1071l = c1073n.f9634i;
            if (abstractC1071l != null) {
                abstractC1071l.h(interfaceC1074o);
            }
            boolean u3 = AbstractC1071l.u(subMenuC1079t);
            c1073n.f9632g = u3;
            AbstractC1071l abstractC1071l2 = c1073n.f9634i;
            if (abstractC1071l2 != null) {
                abstractC1071l2.o(u3);
            }
            c1073n.f9635j = this.f9645k;
            this.f9645k = null;
            this.f9638c.c(false);
            N n3 = this.f9642h;
            int i3 = n3.f9716e;
            int i4 = !n3.f9717g ? 0 : n3.f;
            int i5 = this.f9653s;
            View view = this.f9646l;
            Field field = z.f259a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i3 += this.f9646l.getWidth();
            }
            if (!c1073n.b()) {
                if (c1073n.f9631e != null) {
                    c1073n.d(i3, i4, true, true);
                }
            }
            InterfaceC1074o interfaceC1074o2 = this.f9648n;
            if (interfaceC1074o2 != null) {
                interfaceC1074o2.c(subMenuC1079t);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC1077r
    public final void d() {
        View view;
        if (k()) {
            return;
        }
        if (this.f9650p || (view = this.f9646l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f9647m = view;
        N n3 = this.f9642h;
        n3.f9732v.setOnDismissListener(this);
        n3.f9723m = this;
        n3.f9731u = true;
        n3.f9732v.setFocusable(true);
        View view2 = this.f9647m;
        boolean z3 = this.f9649o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f9649o = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f9643i);
        }
        view2.addOnAttachStateChangeListener(this.f9644j);
        n3.f9722l = view2;
        n3.f9720j = this.f9653s;
        boolean z4 = this.f9651q;
        Context context = this.f9637b;
        C1067h c1067h = this.f9639d;
        if (!z4) {
            this.f9652r = AbstractC1071l.m(c1067h, context, this.f);
            this.f9651q = true;
        }
        int i3 = this.f9652r;
        Drawable background = n3.f9732v.getBackground();
        if (background != null) {
            Rect rect = n3.f9729s;
            background.getPadding(rect);
            n3.f9715d = rect.left + rect.right + i3;
        } else {
            n3.f9715d = i3;
        }
        n3.f9732v.setInputMethodMode(2);
        Rect rect2 = this.f9625a;
        n3.f9730t = rect2 != null ? new Rect(rect2) : null;
        n3.d();
        M m3 = n3.f9714c;
        m3.setOnKeyListener(this);
        if (this.f9654t) {
            MenuC1069j menuC1069j = this.f9638c;
            if (menuC1069j.f9589l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m3, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC1069j.f9589l);
                }
                frameLayout.setEnabled(false);
                m3.addHeaderView(frameLayout, null, false);
            }
        }
        n3.b(c1067h);
        n3.d();
    }

    @Override // k.InterfaceC1077r
    public final void dismiss() {
        if (k()) {
            this.f9642h.dismiss();
        }
    }

    @Override // k.InterfaceC1075p
    public final void f() {
        this.f9651q = false;
        C1067h c1067h = this.f9639d;
        if (c1067h != null) {
            c1067h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC1077r
    public final ListView g() {
        return this.f9642h.f9714c;
    }

    @Override // k.InterfaceC1075p
    public final void h(InterfaceC1074o interfaceC1074o) {
        this.f9648n = interfaceC1074o;
    }

    @Override // k.InterfaceC1075p
    public final boolean j() {
        return false;
    }

    @Override // k.InterfaceC1077r
    public final boolean k() {
        return !this.f9650p && this.f9642h.f9732v.isShowing();
    }

    @Override // k.AbstractC1071l
    public final void n(View view) {
        this.f9646l = view;
    }

    @Override // k.AbstractC1071l
    public final void o(boolean z3) {
        this.f9639d.f9575c = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9650p = true;
        this.f9638c.c(true);
        ViewTreeObserver viewTreeObserver = this.f9649o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9649o = this.f9647m.getViewTreeObserver();
            }
            this.f9649o.removeGlobalOnLayoutListener(this.f9643i);
            this.f9649o = null;
        }
        this.f9647m.removeOnAttachStateChangeListener(this.f9644j);
        C1072m c1072m = this.f9645k;
        if (c1072m != null) {
            c1072m.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.AbstractC1071l
    public final void p(int i3) {
        this.f9653s = i3;
    }

    @Override // k.AbstractC1071l
    public final void q(int i3) {
        this.f9642h.f9716e = i3;
    }

    @Override // k.AbstractC1071l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f9645k = (C1072m) onDismissListener;
    }

    @Override // k.AbstractC1071l
    public final void s(boolean z3) {
        this.f9654t = z3;
    }

    @Override // k.AbstractC1071l
    public final void t(int i3) {
        N n3 = this.f9642h;
        n3.f = i3;
        n3.f9717g = true;
    }

    @Override // k.AbstractC1071l
    public final void l(MenuC1069j menuC1069j) {
    }
}
