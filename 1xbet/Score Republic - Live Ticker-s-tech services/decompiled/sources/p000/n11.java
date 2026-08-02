package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0106a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n11 implements ComponentCallbacks2, wh0 {

    /* JADX INFO: renamed from: t */
    public static final p11 f5239t;

    /* JADX INFO: renamed from: j */
    public final ComponentCallbacks2C0106a f5240j;

    /* JADX INFO: renamed from: k */
    public final Context f5241k;

    /* JADX INFO: renamed from: l */
    public final rh0 f5242l;

    /* JADX INFO: renamed from: m */
    public final m81 f5243m;

    /* JADX INFO: renamed from: n */
    public final o11 f5244n;

    /* JADX INFO: renamed from: o */
    public final oc1 f5245o;

    /* JADX INFO: renamed from: p */
    public final RunnableC0897y0 f5246p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC0437ll f5247q;

    /* JADX INFO: renamed from: r */
    public final CopyOnWriteArrayList f5248r;

    /* JADX INFO: renamed from: s */
    public final p11 f5249s;

    static {
        p11 p11Var = (p11) new p11().m4287c(Bitmap.class);
        p11Var.f6790v = true;
        f5239t = p11Var;
        ((p11) new p11().m4287c(b80.class)).f6790v = true;
    }

    public n11(ComponentCallbacks2C0106a componentCallbacks2C0106a, rh0 rh0Var, o11 o11Var, Context context) {
        p11 p11Var;
        m81 m81Var = new m81(5);
        wa0 wa0Var = componentCallbacks2C0106a.f1312o;
        this.f5245o = new oc1();
        RunnableC0897y0 runnableC0897y0 = new RunnableC0897y0(21, this);
        this.f5246p = runnableC0897y0;
        this.f5240j = componentCallbacks2C0106a;
        this.f5242l = rh0Var;
        this.f5244n = o11Var;
        this.f5243m = m81Var;
        this.f5241k = context;
        Context applicationContext = context.getApplicationContext();
        m11 m11Var = new m11(this, m81Var);
        wa0Var.getClass();
        boolean z = xe1.m5635c(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC0437ll c0331iq = z ? new C0331iq(applicationContext, m11Var) : new rs0();
        this.f5247q = c0331iq;
        synchronized (componentCallbacks2C0106a.f1313p) {
            if (componentCallbacks2C0106a.f1313p.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C0106a.f1313p.add(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            rh0Var.mo986B(this);
        } else {
            zg1.m5899j().post(runnableC0897y0);
        }
        rh0Var.mo986B(c0331iq);
        this.f5248r = new CopyOnWriteArrayList(componentCallbacks2C0106a.f1309l.f6408d);
        q80 q80Var = componentCallbacks2C0106a.f1309l;
        synchronized (q80Var) {
            try {
                if (q80Var.f6413i == null) {
                    q80Var.f6407c.getClass();
                    p11 p11Var2 = new p11();
                    p11Var2.f6790v = true;
                    q80Var.f6413i = p11Var2;
                }
                p11Var = q80Var.f6413i;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            p11 p11Var3 = (p11) p11Var.clone();
            if (p11Var3.f6790v && !p11Var3.f6791w) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            p11Var3.f6791w = true;
            p11Var3.f6790v = true;
            this.f5249s = p11Var3;
        }
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo245a() {
        this.f5245o.mo245a();
        m3462e();
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo246b() {
        m3463f();
        this.f5245o.mo246b();
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: c */
    public final synchronized void mo247c() {
        int i;
        this.f5245o.mo247c();
        synchronized (this) {
            try {
                ArrayList arrayListM5898i = zg1.m5898i(this.f5245o.f5700j);
                int size = arrayListM5898i.size();
                i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListM5898i.get(i2);
                    i2++;
                    m3461d((AbstractC0846wn) obj);
                }
                this.f5245o.f5700j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        m81 m81Var = this.f5243m;
        ArrayList arrayListM5898i2 = zg1.m5898i((Set) m81Var.f5010l);
        int size2 = arrayListM5898i2.size();
        while (i < size2) {
            Object obj2 = arrayListM5898i2.get(i);
            i++;
            m81Var.m3355c((h11) obj2);
        }
        ((HashSet) m81Var.f5011m).clear();
        this.f5242l.mo987j(this);
        this.f5242l.mo987j(this.f5247q);
        zg1.m5899j().removeCallbacks(this.f5246p);
        ComponentCallbacks2C0106a componentCallbacks2C0106a = this.f5240j;
        synchronized (componentCallbacks2C0106a.f1313p) {
            if (!componentCallbacks2C0106a.f1313p.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            componentCallbacks2C0106a.f1313p.remove(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3461d(AbstractC0846wn abstractC0846wn) {
        if (abstractC0846wn == null) {
            return;
        }
        boolean zM3464g = m3464g(abstractC0846wn);
        h11 h11Var = abstractC0846wn.f8591l;
        if (zM3464g) {
            return;
        }
        ComponentCallbacks2C0106a componentCallbacks2C0106a = this.f5240j;
        synchronized (componentCallbacks2C0106a.f1313p) {
            try {
                ArrayList arrayList = componentCallbacks2C0106a.f1313p;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((n11) obj).m3464g(abstractC0846wn)) {
                        return;
                    }
                }
                if (h11Var != null) {
                    abstractC0846wn.f8591l = null;
                    h11Var.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m3462e() {
        m81 m81Var = this.f5243m;
        m81Var.f5009k = true;
        ArrayList arrayListM5898i = zg1.m5898i((Set) m81Var.f5010l);
        int size = arrayListM5898i.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM5898i.get(i);
            i++;
            h11 h11Var = (h11) obj;
            if (h11Var.isRunning()) {
                h11Var.mo2197i();
                ((HashSet) m81Var.f5011m).add(h11Var);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m3463f() {
        m81 m81Var = this.f5243m;
        int i = 0;
        m81Var.f5009k = false;
        ArrayList arrayListM5898i = zg1.m5898i((Set) m81Var.f5010l);
        int size = arrayListM5898i.size();
        while (i < size) {
            Object obj = arrayListM5898i.get(i);
            i++;
            h11 h11Var = (h11) obj;
            if (!h11Var.mo2199k() && !h11Var.isRunning()) {
                h11Var.mo2198j();
            }
        }
        ((HashSet) m81Var.f5011m).clear();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m3464g(AbstractC0846wn abstractC0846wn) {
        h11 h11Var = abstractC0846wn.f8591l;
        if (h11Var == null) {
            return true;
        }
        if (!this.f5243m.m3355c(h11Var)) {
            return false;
        }
        this.f5245o.f5700j.remove(abstractC0846wn);
        abstractC0846wn.f8591l = null;
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f5243m + ", treeNode=" + this.f5244n + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
