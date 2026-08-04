package U5;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f6501d = Logger.getLogger(h0.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static h0 f6502e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6503a = "unknown";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f6504b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E3.Q f6505c = E3.Q.f2012x;

    public final synchronized void a() {
        try {
            HashMap map = new HashMap();
            String str = "unknown";
            int iC = Integer.MIN_VALUE;
            for (g0 g0Var : this.f6504b) {
                g0Var.getClass();
                g0 g0Var2 = (g0) map.get("dns");
                if (g0Var2 == null || g0Var2.c() < g0Var.c()) {
                    map.put("dns", g0Var);
                }
                if (iC < g0Var.c()) {
                    iC = g0Var.c();
                    str = "dns";
                }
            }
            this.f6505c = E3.Q.a(map);
            this.f6503a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
