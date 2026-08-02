package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class oj0 {

    /* JADX INFO: renamed from: c */
    public static final Logger f5754c;

    /* JADX INFO: renamed from: d */
    public static oj0 f5755d;

    /* JADX INFO: renamed from: e */
    public static final List f5756e;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f5757a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f5758b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(oj0.class.getName());
        f5754c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z = xv0.f9089a;
            arrayList.add(xv0.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(d61.class);
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        f5756e = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized oj0 m3693a() {
        try {
            if (f5755d == null) {
                List<nj0> listM3408j = AbstractC0477mo.m3408j(nj0.class, f5756e, nj0.class.getClassLoader(), new aa0(4));
                f5755d = new oj0();
                for (nj0 nj0Var : listM3408j) {
                    f5754c.fine("Service loader found " + nj0Var);
                    oj0 oj0Var = f5755d;
                    synchronized (oj0Var) {
                        nj0Var.getClass();
                        oj0Var.f5757a.add(nj0Var);
                    }
                }
                f5755d.m3695c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5755d;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized nj0 m3694b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f5758b;
        a90.m127k(str, "policy");
        return (nj0) linkedHashMap.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3695c() {
        this.f5758b.clear();
        for (nj0 nj0Var : this.f5757a) {
            String strMo1102a = nj0Var.mo1102a();
            if (((nj0) this.f5758b.get(strMo1102a)) == null) {
                this.f5758b.put(strMo1102a, nj0Var);
            }
        }
    }
}
