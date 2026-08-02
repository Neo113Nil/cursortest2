package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.C0030a;
import androidx.savedstate.Recreator;
import com.bumptech.glide.ComponentCallbacks2C0106a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class m81 implements tl0, y80 {

    /* JADX INFO: renamed from: n */
    public static volatile m81 f5006n;

    /* JADX INFO: renamed from: o */
    public static final m81 f5007o = new m81(true, (String) null, (Exception) null);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5008j;

    /* JADX INFO: renamed from: k */
    public boolean f5009k;

    /* JADX INFO: renamed from: l */
    public Object f5010l;

    /* JADX INFO: renamed from: m */
    public Object f5011m;

    public m81(int i) {
        this.f5008j = i;
        switch (i) {
            case 8:
                break;
            case 9:
            default:
                this.f5010l = Collections.newSetFromMap(new WeakHashMap());
                this.f5011m = new HashSet();
                break;
            case 10:
                this.f5010l = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static m81 m3350b() {
        m81 m81Var = new m81(8);
        m81Var.f5009k = true;
        return m81Var;
    }

    /* JADX INFO: renamed from: d */
    public static m81 m3351d(Context context) {
        if (f5006n == null) {
            synchronized (m81.class) {
                try {
                    if (f5006n == null) {
                        f5006n = new m81(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5006n;
    }

    /* JADX INFO: renamed from: p */
    public static m81 m3352p(String str) {
        return new m81(false, str, (Exception) null);
    }

    /* JADX INFO: renamed from: q */
    public static m81 m3353q(String str, Exception exc) {
        return new m81(false, str, exc);
    }

    /* JADX INFO: renamed from: a */
    public m81 m3354a() {
        p80.m3857a("execute parameter required", ((y01) this.f5010l) != null);
        return new m81(this, (C0451lz[]) this.f5011m, this.f5009k);
    }

    /* JADX INFO: renamed from: c */
    public boolean m3355c(h11 h11Var) {
        boolean z = true;
        if (h11Var == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f5010l).remove(h11Var);
        if (!((HashSet) this.f5011m).remove(h11Var) && !zRemove) {
            z = false;
        }
        if (z) {
            h11Var.clear();
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public void m3356e() {
        if (this.f5009k || ((HashSet) this.f5011m).isEmpty()) {
            return;
        }
        C0809vn c0809vn = (C0809vn) this.f5010l;
        p90 p90Var = (p90) c0809vn.f8225m;
        boolean z = false;
        c0809vn.f8223k = ((ConnectivityManager) p90Var.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) p90Var.get()).registerDefaultNetworkCallback((l81) c0809vn.f8226n);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.f5009k = z;
    }

    /* JADX INFO: renamed from: f */
    public void m3357f() {
        x41 x41Var = (x41) this.f5010l;
        C0030a c0030aMo862d = x41Var.mo862d();
        if (c0030aMo862d.f551c != qh0.f6498k) {
            C0270h1.m2191g("Restarter must be created only during owner's initialization stage");
            return;
        }
        c0030aMo862d.m437a(new Recreator(x41Var));
        C0086c5 c0086c5 = (C0086c5) this.f5011m;
        c0086c5.getClass();
        if (c0086c5.f1092c) {
            C0270h1.m2191g("SavedStateRegistry was already attached.");
            return;
        }
        c0030aMo862d.m437a(new C0953zj(2, c0086c5));
        c0086c5.f1092c = true;
        this.f5009k = true;
    }

    /* JADX INFO: renamed from: g */
    public void m3358g(Bundle bundle) {
        if (!this.f5009k) {
            m3357f();
        }
        C0030a c0030aMo862d = ((x41) this.f5010l).mo862d();
        if (c0030aMo862d.f551c.compareTo(qh0.f6500m) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0030aMo862d.f551c).toString());
        }
        C0086c5 c0086c5 = (C0086c5) this.f5011m;
        if (!c0086c5.f1092c) {
            C0270h1.m2191g("You must call performAttach() before calling performRestore(Bundle).");
        } else if (c0086c5.f1093d) {
            C0270h1.m2191g("SavedStateRegistry was already restored.");
        } else {
            c0086c5.f1090a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            c0086c5.f1093d = true;
        }
    }

    @Override // p000.y80
    public Object get() {
        if (this.f5009k) {
            C0270h1.m2191g("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        wo1.m5378a("Glide registry");
        this.f5009k = true;
        try {
            return wm1.m5357d((ComponentCallbacks2C0106a) this.f5010l, (ArrayList) this.f5011m);
        } finally {
            this.f5009k = false;
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m3359h(Bundle bundle) {
        C0086c5 c0086c5 = (C0086c5) this.f5011m;
        c0086c5.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0086c5.f1090a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        p41 p41Var = (p41) c0086c5.f1095f;
        p41Var.getClass();
        n41 n41Var = new n41(p41Var);
        p41Var.f5984l.put(n41Var, Boolean.FALSE);
        while (n41Var.hasNext()) {
            Map.Entry entry = (Map.Entry) n41Var.next();
            bundle2.putBundle((String) entry.getKey(), ((w41) entry.getValue()).mo264a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* JADX INFO: renamed from: i */
    public void m3360i(ScheduledFuture scheduledFuture) {
        synchronized (this.f5010l) {
            try {
                if (!this.f5009k) {
                    this.f5011m = scheduledFuture;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m3361j(boolean z) {
        xe0 xe0Var = (xe0) this.f5011m;
        xe0Var.f8921k.execute(new se0(xe0Var, (te0) this.f5010l, z));
    }

    /* JADX INFO: renamed from: k */
    public void m3362k(ja1 ja1Var) {
        xe0 xe0Var = (xe0) this.f5011m;
        xe0Var.f8919i.mo5320h(2, "{0} SHUTDOWN with {1}", ((te0) this.f5010l).mo1526c(), xe0.m5632h(ja1Var));
        this.f5009k = true;
        xe0Var.f8921k.execute(new RunnableC0529o2(20, this, ja1Var));
    }

    /* JADX INFO: renamed from: l */
    public void m3363l() {
        a90.m132p("transportShutdown() must be called before transportTerminated().", this.f5009k);
        xe0 xe0Var = (xe0) this.f5011m;
        AbstractC0875xf abstractC0875xf = xe0Var.f8919i;
        te0 te0Var = (te0) this.f5010l;
        abstractC0875xf.mo5320h(2, "{0} Terminated", te0Var.mo1526c());
        gc1 gc1Var = xe0Var.f8921k;
        gc1Var.execute(new se0(xe0Var, te0Var, false));
        Iterator it = xe0Var.f8920j.iterator();
        if (!it.hasNext()) {
            gc1Var.execute(new ve0(1, this));
        } else if (it.next() != null) {
            dd0.m1158c();
        } else {
            te0Var.getAttributes();
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public String mo2582m() {
        return (String) this.f5010l;
    }

    /* JADX INFO: renamed from: n */
    public void m3364n(m72 m72Var) {
        synchronized (this.f5010l) {
            try {
                if (((ArrayDeque) this.f5011m) == null) {
                    this.f5011m = new ArrayDeque();
                }
                ((ArrayDeque) this.f5011m).add(m72Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m3365o(v92 v92Var) {
        m72 m72Var;
        synchronized (this.f5010l) {
            if (((ArrayDeque) this.f5011m) != null && !this.f5009k) {
                this.f5009k = true;
                while (true) {
                    synchronized (this.f5010l) {
                        try {
                            m72Var = (m72) ((ArrayDeque) this.f5011m).poll();
                            if (m72Var == null) {
                                this.f5009k = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    m72Var.mo3331a(v92Var);
                }
            }
        }
    }

    public String toString() {
        switch (this.f5008j) {
            case 5:
                return super.toString() + "{numRequests=" + ((Set) this.f5010l).size() + ", isPaused=" + this.f5009k + "}";
            default:
                return super.toString();
        }
    }

    public m81(boolean z, String str, Exception exc) {
        this.f5008j = 1;
        this.f5009k = z;
        this.f5010l = str;
        this.f5011m = exc;
    }

    public m81(m81 m81Var, C0451lz[] c0451lzArr, boolean z) {
        this.f5008j = 9;
        this.f5011m = m81Var;
        this.f5010l = c0451lzArr;
        boolean z2 = false;
        if (c0451lzArr != null && z) {
            z2 = true;
        }
        this.f5009k = z2;
    }

    public m81(x41 x41Var) {
        this.f5008j = 7;
        this.f5010l = x41Var;
        this.f5011m = new C0086c5();
    }

    public m81(String str, String str2, boolean z) {
        this.f5008j = 2;
        this.f5010l = str;
        this.f5011m = str2;
        this.f5009k = z;
    }

    public m81(Context context) {
        this.f5008j = 0;
        this.f5011m = new HashSet();
        this.f5010l = new C0809vn(new p90(new C0186et(context, 5, false)), new k81(this));
    }

    public m81(ComponentCallbacks2C0106a componentCallbacks2C0106a, ArrayList arrayList, t22 t22Var) {
        this.f5008j = 4;
        this.f5010l = componentCallbacks2C0106a;
        this.f5011m = arrayList;
    }

    public m81(xe0 xe0Var, te0 te0Var) {
        this.f5008j = 3;
        this.f5011m = xe0Var;
        this.f5009k = false;
        this.f5010l = te0Var;
    }

    public m81(Object obj) {
        this.f5008j = 6;
        this.f5010l = obj;
    }
}
