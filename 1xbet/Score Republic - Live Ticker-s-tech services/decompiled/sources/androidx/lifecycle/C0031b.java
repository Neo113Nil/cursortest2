package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.zhuinden.fragmentviewbindingdelegatekt.FragmentViewBindingDelegate$1;
import java.util.Map;
import p000.AbstractC0024an;
import p000.C0270h1;
import p000.C0719t7;
import p000.DialogInterfaceOnCancelListenerC0962zs;
import p000.b90;
import p000.fj0;
import p000.gj0;
import p000.m41;
import p000.n41;
import p000.p41;
import p000.t50;
import p000.yh0;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0031b {

    /* JADX INFO: renamed from: j */
    public static final Object f557j = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f558a = new Object();

    /* JADX INFO: renamed from: b */
    public final p41 f559b = new p41();

    /* JADX INFO: renamed from: c */
    public int f560c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f561d;

    /* JADX INFO: renamed from: e */
    public volatile Object f562e;

    /* JADX INFO: renamed from: f */
    public volatile Object f563f;

    /* JADX INFO: renamed from: g */
    public int f564g;

    /* JADX INFO: renamed from: h */
    public boolean f565h;

    /* JADX INFO: renamed from: i */
    public boolean f566i;

    public C0031b() {
        Object obj = f557j;
        this.f563f = obj;
        this.f562e = obj;
        this.f564g = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m444a(String str) {
        ((C0719t7) C0719t7.m4750G().f7328p).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C0270h1.m2191g(AbstractC0024an.m284g("Cannot invoke ", str, " on a background thread"));
    }

    /* JADX INFO: renamed from: b */
    public final void m445b(gj0 gj0Var) {
        if (gj0Var.f2764k) {
            if (!gj0Var.mo436f()) {
                gj0Var.m2100b(false);
            }
            int i = gj0Var.f2765l;
            int i2 = this.f564g;
            if (i >= i2) {
                return;
            }
            gj0Var.f2765l = i2;
            b90 b90Var = gj0Var.f2763j;
            Object obj = this.f562e;
            switch (b90Var.f792j) {
                case 18:
                    yh0 yh0Var = (yh0) obj;
                    DialogInterfaceOnCancelListenerC0962zs dialogInterfaceOnCancelListenerC0962zs = (DialogInterfaceOnCancelListenerC0962zs) b90Var.f793k;
                    if (yh0Var != null && dialogInterfaceOnCancelListenerC0962zs.f9930k0) {
                        View viewM857E = dialogInterfaceOnCancelListenerC0962zs.m857E();
                        if (viewM857E.getParent() != null) {
                            C0270h1.m2191g("DialogFragment can not be attached to a container view");
                        } else if (dialogInterfaceOnCancelListenerC0962zs.f9934o0 != null) {
                            if (t50.m4691J(3)) {
                                Log.d("FragmentManager", "DialogFragment " + b90Var + " setting the content view on " + dialogInterfaceOnCancelListenerC0962zs.f9934o0);
                            }
                            dialogInterfaceOnCancelListenerC0962zs.f9934o0.setContentView(viewM857E);
                        }
                        break;
                    }
                    break;
                default:
                    if (((yh0) obj) == null) {
                        ((FragmentViewBindingDelegate$1) b90Var.f793k).f1405k.f2313k = null;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m446c(gj0 gj0Var) {
        if (this.f565h) {
            this.f566i = true;
            return;
        }
        this.f565h = true;
        do {
            this.f566i = false;
            if (gj0Var != null) {
                m445b(gj0Var);
                gj0Var = null;
            } else {
                p41 p41Var = this.f559b;
                p41Var.getClass();
                n41 n41Var = new n41(p41Var);
                p41Var.f5984l.put(n41Var, Boolean.FALSE);
                while (n41Var.hasNext()) {
                    m445b((gj0) ((Map.Entry) n41Var.next()).getValue());
                    if (this.f566i) {
                        break;
                    }
                }
            }
        } while (this.f566i);
        this.f565h = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m447d(b90 b90Var) {
        Object obj;
        m444a("observeForever");
        fj0 fj0Var = new fj0(this, b90Var);
        p41 p41Var = this.f559b;
        m41 m41VarMo2353b = p41Var.mo2353b(b90Var);
        if (m41VarMo2353b != null) {
            obj = m41VarMo2353b.f4973k;
        } else {
            m41 m41Var = new m41(b90Var, fj0Var);
            p41Var.f5985m++;
            m41 m41Var2 = p41Var.f5983k;
            if (m41Var2 == null) {
                p41Var.f5982j = m41Var;
                p41Var.f5983k = m41Var;
            } else {
                m41Var2.f4974l = m41Var;
                m41Var.f4975m = m41Var2;
                p41Var.f5983k = m41Var;
            }
            obj = null;
        }
        gj0 gj0Var = (gj0) obj;
        if (gj0Var instanceof LiveData$LifecycleBoundObserver) {
            C0270h1.m2190f("Cannot add the same observer with different lifecycles");
        } else {
            if (gj0Var != null) {
                return;
            }
            fj0Var.m2100b(true);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m448e(Object obj) {
        m444a("setValue");
        this.f564g++;
        this.f562e = obj;
        m446c(null);
    }
}
