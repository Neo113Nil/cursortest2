package m;

import P.U;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.A0;
import androidx.appcompat.widget.C0649l0;
import androidx.appcompat.widget.ViewTreeObserverOnGlobalLayoutListenerC0656p;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.WeakHashMap;

/* renamed from: m.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1415C extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: B, reason: collision with root package name */
    public t f15041B;

    /* renamed from: C, reason: collision with root package name */
    public View f15042C;

    /* renamed from: D, reason: collision with root package name */
    public View f15043D;

    /* renamed from: E, reason: collision with root package name */
    public w f15044E;

    /* renamed from: F, reason: collision with root package name */
    public ViewTreeObserver f15045F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f15046G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f15047H;

    /* renamed from: I, reason: collision with root package name */
    public int f15048I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f15050K;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15051b;

    /* renamed from: c, reason: collision with root package name */
    public final k f15052c;

    /* renamed from: d, reason: collision with root package name */
    public final C1424h f15053d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15054e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15055f;

    /* renamed from: x, reason: collision with root package name */
    public final int f15056x;

    /* renamed from: y, reason: collision with root package name */
    public final A0 f15057y;

    /* renamed from: z, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0656p f15058z = new ViewTreeObserverOnGlobalLayoutListenerC0656p(this, 4);

    /* renamed from: A, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC1419c f15040A = new ViewOnAttachStateChangeListenerC1419c(this, 1);

    /* renamed from: J, reason: collision with root package name */
    public int f15049J = 0;

    public ViewOnKeyListenerC1415C(int i7, Context context, View view, k kVar, boolean z4) {
        this.f15051b = context;
        this.f15052c = kVar;
        this.f15054e = z4;
        this.f15053d = new C1424h(kVar, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.f15056x = i7;
        Resources resources = context.getResources();
        this.f15055f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f15042C = view;
        this.f15057y = new A0(context, null, i7, 0);
        kVar.b(this, context);
    }

    @Override // m.x
    public final void a(k kVar, boolean z4) {
        if (kVar != this.f15052c) {
            return;
        }
        dismiss();
        w wVar = this.f15044E;
        if (wVar != null) {
            wVar.a(kVar, z4);
        }
    }

    @Override // m.InterfaceC1414B
    public final boolean b() {
        return !this.f15046G && this.f15057y.f8397P.isShowing();
    }

    @Override // m.x
    public final boolean d() {
        return false;
    }

    @Override // m.InterfaceC1414B
    public final void dismiss() {
        if (b()) {
            this.f15057y.dismiss();
        }
    }

    @Override // m.x
    public final void e(w wVar) {
        this.f15044E = wVar;
    }

    @Override // m.x
    public final void f() {
        this.f15047H = false;
        C1424h c1424h = this.f15053d;
        if (c1424h != null) {
            c1424h.notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC1414B
    public final C0649l0 h() {
        return this.f15057y.f8400c;
    }

    @Override // m.x
    public final boolean i(SubMenuC1416D subMenuC1416D) {
        if (subMenuC1416D.hasVisibleItems()) {
            View view = this.f15043D;
            v vVar = new v(this.f15056x, this.f15051b, view, subMenuC1416D, this.f15054e);
            w wVar = this.f15044E;
            vVar.f15198h = wVar;
            s sVar = vVar.f15199i;
            if (sVar != null) {
                sVar.e(wVar);
            }
            boolean t7 = s.t(subMenuC1416D);
            vVar.f15197g = t7;
            s sVar2 = vVar.f15199i;
            if (sVar2 != null) {
                sVar2.n(t7);
            }
            vVar.j = this.f15041B;
            this.f15041B = null;
            this.f15052c.c(false);
            A0 a02 = this.f15057y;
            int i7 = a02.f8403f;
            int n2 = a02.n();
            int i8 = this.f15049J;
            View view2 = this.f15042C;
            WeakHashMap weakHashMap = U.f5037a;
            if ((Gravity.getAbsoluteGravity(i8, view2.getLayoutDirection()) & 7) == 5) {
                i7 += this.f15042C.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f15195e != null) {
                    vVar.d(i7, n2, true, true);
                }
            }
            w wVar2 = this.f15044E;
            if (wVar2 != null) {
                wVar2.n(subMenuC1416D);
            }
            return true;
        }
        return false;
    }

    @Override // m.s
    public final void m(View view) {
        this.f15042C = view;
    }

    @Override // m.s
    public final void n(boolean z4) {
        this.f15053d.f15117c = z4;
    }

    @Override // m.s
    public final void o(int i7) {
        this.f15049J = i7;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f15046G = true;
        this.f15052c.c(true);
        ViewTreeObserver viewTreeObserver = this.f15045F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f15045F = this.f15043D.getViewTreeObserver();
            }
            this.f15045F.removeGlobalOnLayoutListener(this.f15058z);
            this.f15045F = null;
        }
        this.f15043D.removeOnAttachStateChangeListener(this.f15040A);
        t tVar = this.f15041B;
        if (tVar != null) {
            tVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // m.s
    public final void p(int i7) {
        this.f15057y.f8403f = i7;
    }

    @Override // m.s
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f15041B = (t) onDismissListener;
    }

    @Override // m.s
    public final void r(boolean z4) {
        this.f15050K = z4;
    }

    @Override // m.s
    public final void s(int i7) {
        this.f15057y.k(i7);
    }

    @Override // m.InterfaceC1414B
    public final void show() {
        View view;
        if (b()) {
            return;
        }
        if (this.f15046G || (view = this.f15042C) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f15043D = view;
        A0 a02 = this.f15057y;
        a02.f8397P.setOnDismissListener(this);
        a02.f8388G = this;
        a02.f8396O = true;
        a02.f8397P.setFocusable(true);
        View view2 = this.f15043D;
        boolean z4 = this.f15045F == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f15045F = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f15058z);
        }
        view2.addOnAttachStateChangeListener(this.f15040A);
        a02.f8387F = view2;
        a02.f8384C = this.f15049J;
        boolean z7 = this.f15047H;
        Context context = this.f15051b;
        C1424h c1424h = this.f15053d;
        if (!z7) {
            this.f15048I = s.l(c1424h, context, this.f15055f);
            this.f15047H = true;
        }
        a02.q(this.f15048I);
        a02.f8397P.setInputMethodMode(2);
        Rect rect = this.f15189a;
        a02.f8395N = rect != null ? new Rect(rect) : null;
        a02.show();
        C0649l0 c0649l0 = a02.f8400c;
        c0649l0.setOnKeyListener(this);
        if (this.f15050K) {
            k kVar = this.f15052c;
            if (kVar.f15125D != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0649l0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(kVar.f15125D);
                }
                frameLayout.setEnabled(false);
                c0649l0.addHeaderView(frameLayout, null, false);
            }
        }
        a02.p(c1424h);
        a02.show();
    }

    @Override // m.s
    public final void k(k kVar) {
    }
}
