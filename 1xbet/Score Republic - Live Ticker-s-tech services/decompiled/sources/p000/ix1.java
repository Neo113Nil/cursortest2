package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ix1 {

    /* JADX INFO: renamed from: f */
    public static final Object f3691f = new Object();

    /* JADX INFO: renamed from: a */
    public final String f3692a;

    /* JADX INFO: renamed from: b */
    public final ju1 f3693b;

    /* JADX INFO: renamed from: c */
    public final Object f3694c;

    /* JADX INFO: renamed from: d */
    public final Object f3695d = new Object();

    /* JADX INFO: renamed from: e */
    public volatile Object f3696e = null;

    public /* synthetic */ ix1(String str, Object obj, ju1 ju1Var) {
        this.f3692a = str;
        this.f3694c = obj;
        this.f3693b = ju1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m2715a(Object obj) {
        synchronized (this.f3695d) {
        }
        if (obj != null) {
            return obj;
        }
        if (vk1.f8211d == null) {
            return this.f3694c;
        }
        synchronized (f3691f) {
            try {
                if (u90.m4898g()) {
                    return this.f3696e == null ? this.f3694c : this.f3696e;
                }
                try {
                    for (ix1 ix1Var : jx1.f4164a) {
                        if (u90.m4898g()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objMo153a = null;
                        try {
                            ju1 ju1Var = ix1Var.f3693b;
                            if (ju1Var != null) {
                                objMo153a = ju1Var.mo153a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f3691f) {
                            ix1Var.f3696e = objMo153a;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                ju1 ju1Var2 = this.f3693b;
                if (ju1Var2 != null) {
                    try {
                        return ju1Var2.mo153a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f3694c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
