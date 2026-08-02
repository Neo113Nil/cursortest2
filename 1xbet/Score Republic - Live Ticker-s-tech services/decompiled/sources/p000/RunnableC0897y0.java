package p000;

import android.app.Activity;
import android.app.Application;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.net.Socket;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;

/* JADX INFO: renamed from: y0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0897y0 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9119j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f9120k;

    public RunnableC0897y0(ml1 ml1Var) {
        this.f9119j = 29;
        Objects.requireNonNull(ml1Var);
        this.f9120k = ml1Var;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        C0603q2 c0603q2;
        switch (this.f9119j) {
            case 0:
                kt0 kt0Var = (kt0) this.f9120k;
                try {
                    nv0.m3597c();
                    try {
                        vc0 vc0Var = nv0.f5555a;
                        vc0Var.getClass();
                        ko0 ko0Var = kt0Var.f4524a;
                        if (!ko0Var.isClosed()) {
                            ko0Var.f4481v += 2;
                            ko0Var.m3059a();
                            break;
                        }
                        vc0Var.getClass();
                        return;
                    } catch (Throwable th) {
                        try {
                            nv0.f5555a.getClass();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    kt0Var.m3081f(th3);
                    return;
                }
            case 1:
                qd0 qd0Var = (qd0) this.f9120k;
                while (true) {
                    try {
                        qd0Var.m4075j((C0899y2) ((ReferenceQueue) qd0Var.f6472l).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                C0535o8 c0535o8 = (C0535o8) this.f9120k;
                ot0 ot0Var = c0535o8.f5652m;
                try {
                    C0572p8 c0572p8 = c0535o8.f5657r;
                    if (c0572p8 != null) {
                        C0539oc c0539oc = c0535o8.f5650k;
                        long j = c0539oc.f5698k;
                        if (j > 0) {
                            c0572p8.mo1553f(c0539oc, j);
                        }
                    }
                } catch (IOException e) {
                    ot0Var.m3780n(e);
                }
                try {
                    C0572p8 c0572p9 = c0535o8.f5657r;
                    if (c0572p9 != null) {
                        c0572p9.close();
                    }
                } catch (IOException e2) {
                    ot0Var.m3780n(e2);
                }
                try {
                    Socket socket = c0535o8.f5658s;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    ot0Var.m3780n(e3);
                    return;
                }
            case 3:
                aj0 aj0Var = (aj0) this.f9120k;
                C0151dv c0151dv = aj0Var.f200l;
                C0610q9 c0610q9 = aj0Var.f198j;
                if (aj0Var.f212x) {
                    if (aj0Var.f210v) {
                        aj0Var.f210v = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0610q9.f6423e = jCurrentAnimationTimeMillis;
                        c0610q9.f6425g = -1L;
                        c0610q9.f6424f = jCurrentAnimationTimeMillis;
                        c0610q9.f6426h = 0.5f;
                    }
                    if ((c0610q9.f6425g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0610q9.f6425g + ((long) c0610q9.f6427i)) || !aj0Var.m260e()) {
                        aj0Var.f212x = false;
                        return;
                    }
                    if (aj0Var.f211w) {
                        aj0Var.f211w = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        c0151dv.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c0610q9.f6424f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM4042a = c0610q9.m4042a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - c0610q9.f6424f;
                    c0610q9.f6424f = jCurrentAnimationTimeMillis2;
                    aj0Var.f214z.scrollListBy((int) (j2 * ((fM4042a * 4.0f) + ((-4.0f) * fM4042a * fM4042a)) * c0610q9.f6422d));
                    WeakHashMap weakHashMap = ai1.f194a;
                    c0151dv.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                ((C0850wr) this.f9120k).f8645e.mo1125n();
                return;
            case 5:
                ((C0112cs) this.f9120k).f1443j.mo1033d();
                return;
            case 6:
                DialogInterfaceOnCancelListenerC0962zs dialogInterfaceOnCancelListenerC0962zs = (DialogInterfaceOnCancelListenerC0962zs) this.f9120k;
                dialogInterfaceOnCancelListenerC0962zs.f9926g0.onDismiss(dialogInterfaceOnCancelListenerC0962zs.f9934o0);
                return;
            case 7:
                C0151dv c0151dv2 = (C0151dv) this.f9120k;
                c0151dv2.f1851u = null;
                c0151dv2.drawableStateChanged();
                return;
            case 8:
                b10 b10Var = (b10) this.f9120k;
                d10 d10Var = b10Var.f674q;
                C0858wz c0858wz = d10Var.f1512o;
                AbstractC0057bc abstractC0057bc = b10Var.f671n;
                Activity activity = b10Var.f672o;
                AbstractC0057bc abstractC0057bc2 = c0858wz.f8722a;
                if (abstractC0057bc2 == null ? false : abstractC0057bc2.mo632d().isShown()) {
                    m80.m3346m("Fiam already active. Cannot show new Fiam.");
                } else if (activity.isFinishing() || activity.isDestroyed()) {
                    m80.m3346m("Activity is finishing or does not have valid window token. Cannot show FIAM.");
                } else {
                    ad0 ad0VarMo629a = abstractC0057bc.mo629a();
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(ad0VarMo629a.f148g.intValue(), ad0VarMo629a.f149h.intValue(), 1003, ad0VarMo629a.f146e.intValue(), -3);
                    Rect rectM5462a = C0858wz.m5462a(activity);
                    if ((ad0VarMo629a.f147f.intValue() & 48) == 48) {
                        layoutParams.y = rectM5462a.top;
                    }
                    layoutParams.dimAmount = 0.3f;
                    layoutParams.gravity = ad0VarMo629a.f147f.intValue();
                    layoutParams.windowAnimations = 0;
                    WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                    windowManager.addView(abstractC0057bc.mo632d(), layoutParams);
                    Rect rectM5462a2 = C0858wz.m5462a(activity);
                    m80.m3345l("Inset (top, bottom)", rectM5462a2.top, rectM5462a2.bottom);
                    m80.m3345l("Inset (left, right)", rectM5462a2.left, rectM5462a2.right);
                    if (abstractC0057bc instanceof C0056bb) {
                        nu1 nu1Var = new nu1(21, abstractC0057bc);
                        ((C0056bb) abstractC0057bc).f806e.setOnTouchListener(ad0VarMo629a.f148g.intValue() == -1 ? new bc1(((C0056bb) abstractC0057bc).f806e, nu1Var) : new C0821vz(((C0056bb) abstractC0057bc).f806e, nu1Var, layoutParams, windowManager, abstractC0057bc));
                    }
                    c0858wz.f8722a = abstractC0057bc;
                }
                if (abstractC0057bc.mo629a().f151j.booleanValue()) {
                    C0710sz c0710sz = d10Var.f1515r;
                    Application application = d10Var.f1514q;
                    ViewGroup viewGroupMo632d = abstractC0057bc.mo632d();
                    c0710sz.getClass();
                    viewGroupMo632d.setAlpha(0.0f);
                    viewGroupMo632d.measure(-2, -2);
                    Point point = new Point(0, viewGroupMo632d.getMeasuredHeight() * (-1));
                    viewGroupMo632d.animate().translationX(point.x).translationY(point.y).setDuration(1L).setListener(new C0673rz(viewGroupMo632d, application));
                    return;
                }
                return;
            case 9:
                c50 c50Var = (c50) this.f9120k;
                if (c50Var.f1115S != null) {
                    c50Var.m864f().getClass();
                    return;
                }
                return;
            case 10:
                ((t50) this.f9120k).m4696A(true);
                return;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                xe0 xe0Var = (xe0) ((RunnableC0529o2) this.f9120k).f5578l;
                ul0 ul0Var = xe0Var.f8928r;
                xe0Var.f8927q = null;
                xe0Var.f8928r = null;
                ul0Var.mo3771a(ja1.f3883m.m2840h("InternalSubchannel closed transport due to address change"));
                return;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                ((jl0) ((p90) this.f9120k).f6027j).m2922h();
                return;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                jl0 jl0Var = (jl0) this.f9120k;
                if (jl0Var.f4023x == null) {
                    return;
                }
                jl0Var.m2924k(true);
                C0961zr c0961zr = jl0Var.f3976E;
                c0961zr.m6029g(null);
                jl0Var.f3985N.mo5321i("Entering IDLE state", 2);
                jl0Var.f4017r.m3881d(EnumC0474ml.f5074m);
                qe0 qe0Var = jl0Var.f3996Y;
                Object[] objArr = {jl0Var.f3974C, c0961zr};
                qe0Var.getClass();
                for (int i = 0; i < 2; i++) {
                    if (((Set) qe0Var.f7192j).contains(objArr[i])) {
                        jl0Var.m2922h();
                        return;
                    }
                }
                return;
            case 14:
                jl0 jl0Var2 = ((cl0) this.f9120k).f1286i;
                jl0Var2.f4012m.m2028d();
                if (jl0Var2.f4022w) {
                    jl0Var2.f4021v.mo3091i();
                    return;
                }
                return;
            case 15:
                ((gl0) this.f9120k).f2803d.m2922h();
                return;
            case 16:
                xe0 xe0Var2 = ((il0) this.f9120k).f3601B;
                xe0Var2.f8921k.execute(new RunnableC0529o2(19, xe0Var2, jl0.f3968f0));
                return;
            case 17:
                C0683s8 c0683s8 = (C0683s8) this.f9120k;
                long j3 = c0683s8.f7047j;
                long jMax = Math.max(2 * j3, j3);
                C0720t8 c0720t8 = (C0720t8) c0683s8.f7048k;
                if (c0720t8.f7342b.compareAndSet(j3, jMax)) {
                    C0720t8.f7340c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{c0720t8.f7341a, Long.valueOf(jMax)});
                    return;
                }
                return;
            case 18:
                ot0 ot0Var2 = (ot0) this.f9120k;
                ot0Var2.f5899o.execute(ot0Var2.f5904t);
                synchronized (((ot0) this.f9120k).f5895k) {
                    ot0 ot0Var3 = (ot0) this.f9120k;
                    ot0Var3.f5872C = Integer.MAX_VALUE;
                    ot0Var3.m3784s();
                    break;
                }
                return;
            case 19:
                tv0 tv0Var = (tv0) this.f9120k;
                tv0Var.f7613k = null;
                if (tv0Var.f7610h.m4910b()) {
                    tv0Var.mo3397e();
                    return;
                }
                return;
            case 20:
                ((AbstractC0959zp) ((rv0) this.f9120k).f6980c).mo2660q();
                return;
            case 21:
                n11 n11Var = (n11) this.f9120k;
                n11Var.f5242l.mo986B(n11Var);
                return;
            case 22:
                zk0 zk0Var = (zk0) this.f9120k;
                if (zk0Var.f9827I) {
                    return;
                }
                zk0Var.f9822D.mo1033d();
                return;
            case 23:
                g31 g31Var = (g31) this.f9120k;
                zk0 zk0Var2 = (zk0) g31Var.f2594l.f2314l;
                i31 i31Var = g31Var.f2593k;
                jp0 jp0Var = zk0.f9815N;
                zk0Var2.m5929g(i31Var);
                return;
            case 24:
                ((n31) this.f9120k).mo3091i();
                return;
            case 25:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f9120k;
                if (searchView$SearchAutoComplete.f414o) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f414o = false;
                    return;
                }
                return;
            case 26:
                ActionMenuView actionMenuView = ((Toolbar) this.f9120k).f442j;
                if (actionMenuView == null || (c0603q2 = actionMenuView.f392C) == null) {
                    return;
                }
                c0603q2.m4028l();
                return;
            case 27:
                ((el1) this.f9120k).m1441b();
                return;
            case 28:
                el1 el1Var = (el1) ((an0) this.f9120k).f254k;
                el1Var.f2110c.m3888d(el1Var.f2110c.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            default:
                ((ml1) this.f9120k).f5088i.m5411c(new C0253gl(4, null, null));
                return;
        }
    }

    public /* synthetic */ RunnableC0897y0(int i, Object obj) {
        this.f9119j = i;
        this.f9120k = obj;
    }
}
