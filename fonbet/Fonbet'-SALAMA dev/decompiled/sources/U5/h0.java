package U5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f6501d = Logger.getLogger(h0.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static h0 f6502e;

    /* renamed from: a, reason: collision with root package name */
    public String f6503a = "unknown";

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f6504b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public E3.Q f6505c = E3.Q.f2012x;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a() {
        try {
            HashMap hashMap = new HashMap();
            String str = "unknown";
            Iterator it = this.f6504b.iterator();
            int i7 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                g0 g0Var = (g0) it.next();
                g0Var.getClass();
                g0 g0Var2 = (g0) hashMap.get("dns");
                if (g0Var2 != null) {
                    if (g0Var2.c() < g0Var.c()) {
                    }
                    if (i7 >= g0Var.c()) {
                        i7 = g0Var.c();
                        str = "dns";
                    }
                }
                hashMap.put("dns", g0Var);
                if (i7 >= g0Var.c()) {
                }
            }
            this.f6505c = E3.Q.a(hashMap);
            this.f6503a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
