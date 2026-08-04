package p086m;

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
import androidx.appcompat.widget.C0628l0;
import androidx.appcompat.widget.ViewTreeObserverOnGlobalLayoutListenerC0635p;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class C extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public t f15047B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f15048C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f15049D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public w f15050E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ViewTreeObserver f15051F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f15052G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f15053H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f15054I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f15056K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f15058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f15059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15061f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f15062x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final A0 f15063y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0635p f15064z = new ViewTreeObserverOnGlobalLayoutListenerC0635p(this, 4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0926c f15046A = new ViewOnAttachStateChangeListenerC0926c(this, 1);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f15055J = 0;

    public C(int i7, Context context, View view, k kVar, boolean z4) {
        this.f15057b = context;
        this.f15058c = kVar;
        this.f15060e = z4;
        this.f15059d = new h(kVar, LayoutInflater.from(context), z4, R.layout.abc_popup_menu_item_layout);
        this.f15062x = i7;
        Resources resources = context.getResources();
        this.f15061f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f15048C = view;
        this.f15063y = new A0(context, null, i7, 0);
        kVar.b(this, context);
    }

    @Override // p086m.x
    public final void a(k kVar, boolean z4) {
        if (kVar != this.f15058c) {
            return;
        }
        dismiss();
        w wVar = this.f15050E;
        if (wVar != null) {
            wVar.a(kVar, z4);
        }
    }

    @Override // p086m.B
    public final boolean b() {
        return !this.f15052G && this.f15063y.f8397P.isShowing();
    }

    @Override // p086m.x
    public final boolean d() {
        return false;
    }

    @Override // p086m.B
    public final void dismiss() {
        if (b()) {
            this.f15063y.dismiss();
        }
    }

    @Override // p086m.x
    public final void e(w wVar) {
        this.f15050E = wVar;
    }

    @Override // p086m.x
    public final void f() {
        this.f15053H = false;
        h hVar = this.f15059d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // p086m.B
    public final C0628l0 h() {
        return this.f15063y.f8400c;
    }

    @Override // p086m.x
    public final boolean i(D d7) {
        if (d7.hasVisibleItems()) {
            View view = this.f15049D;
            v vVar = new v(this.f15062x, this.f15057b, view, d7, this.f15060e);
            w wVar = this.f15050E;
            vVar.f15204h = wVar;
            s sVar = vVar.f15205i;
            if (sVar != null) {
                sVar.e(wVar);
            }
            boolean zT = s.t(d7);
            vVar.f15203g = zT;
            s sVar2 = vVar.f15205i;
            if (sVar2 != null) {
                sVar2.n(zT);
            }
            vVar.j = this.f15047B;
            this.f15047B = null;
            this.f15058c.c(false);
            A0 a2 = this.f15063y;
            int width = a2.f8403f;
            int iN = a2.n();
            int i7 = this.f15055J;
            View view2 = this.f15048C;
            WeakHashMap weakHashMap = U.f5037a;
            if ((Gravity.getAbsoluteGravity(i7, view2.getLayoutDirection()) & 7) == 5) {
                width += this.f15048C.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f15201e != null) {
                    vVar.d(width, iN, true, true);
                }
            }
            w wVar2 = this.f15050E;
            if (wVar2 != null) {
                wVar2.n(d7);
            }
            return true;
        }
        return false;
    }

    @Override // p086m.s
    public final void m(View view) {
        this.f15048C = view;
    }

    @Override // p086m.s
    public final void n(boolean z4) {
        this.f15059d.f15123c = z4;
    }

    @Override // p086m.s
    public final void o(int i7) {
        this.f15055J = i7;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f15052G = true;
        this.f15058c.c(true);
        ViewTreeObserver viewTreeObserver = this.f15051F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f15051F = this.f15049D.getViewTreeObserver();
            }
            this.f15051F.removeGlobalOnLayoutListener(this.f15064z);
            this.f15051F = null;
        }
        this.f15049D.removeOnAttachStateChangeListener(this.f15046A);
        t tVar = this.f15047B;
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

    @Override // p086m.s
    public final void p(int i7) {
        this.f15063y.f8403f = i7;
    }

    @Override // p086m.s
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f15047B = (t) onDismissListener;
    }

    @Override // p086m.s
    public final void r(boolean z4) {
        this.f15056K = z4;
    }

    @Override // p086m.s
    public final void s(int i7) {
        this.f15063y.k(i7);
    }

    @Override // p086m.B
    public final void show() {
        View view;
        if (b()) {
            return;
        }
        if (this.f15052G || (view = this.f15048C) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f15049D = view;
        A0 a2 = this.f15063y;
        a2.f8397P.setOnDismissListener(this);
        a2.f8388G = this;
        a2.f8396O = true;
        a2.f8397P.setFocusable(true);
        View view2 = this.f15049D;
        boolean z4 = this.f15051F == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f15051F = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f15064z);
        }
        view2.addOnAttachStateChangeListener(this.f15046A);
        a2.f8387F = view2;
        a2.f8384C = this.f15055J;
        boolean z7 = this.f15053H;
        Context context = this.f15057b;
        h hVar = this.f15059d;
        if (!z7) {
            this.f15054I = s.l(hVar, context, this.f15061f);
            this.f15053H = true;
        }
        a2.q(this.f15054I);
        a2.f8397P.setInputMethodMode(2);
        Rect rect = this.f15195a;
        a2.f8395N = rect != null ? new Rect(rect) : null;
        a2.show();
        C0628l0 c0628l0 = a2.f8400c;
        c0628l0.setOnKeyListener(this);
        if (this.f15056K) {
            k kVar = this.f15058c;
            if (kVar.f15131D != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0628l0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(kVar.f15131D);
                }
                frameLayout.setEnabled(false);
                c0628l0.addHeaderView(frameLayout, null, false);
            }
        }
        a2.p(hVar);
        a2.show();
    }

    @Override // p086m.s
    public final void k(k kVar) {
    }
}
