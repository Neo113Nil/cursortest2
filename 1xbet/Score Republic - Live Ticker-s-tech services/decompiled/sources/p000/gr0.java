package p000;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gr0 {

    /* JADX INFO: renamed from: d */
    public static final Logger f2858d = Logger.getLogger(gr0.class.getName());

    /* JADX INFO: renamed from: e */
    public static gr0 f2859e;

    /* JADX INFO: renamed from: a */
    public String f2860a = "unknown";

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f2861b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    public v01 f2862c = v01.f7985p;

    /* JADX INFO: renamed from: a */
    public final synchronized void m2141a() {
        try {
            HashMap map = new HashMap();
            String str = "unknown";
            byte b = -2147483648;
            for (fr0 fr0Var : this.f2861b) {
                fr0Var.getClass();
                if (((fr0) map.get("dns")) == null) {
                    map.put("dns", fr0Var);
                }
                if (b < 5) {
                    str = "dns";
                    b = 5;
                }
            }
            Set setEntrySet = map.entrySet();
            C0163e6 c0163e6 = new C0163e6(setEntrySet != null ? setEntrySet.size() : 4, 4);
            c0163e6.m1372h(setEntrySet);
            this.f2862c = c0163e6.m1369d(true);
            this.f2860a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
