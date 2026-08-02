package n4;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f15465b = new o();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15466a = new HashMap();

    public static C1479m a(C1471e c1471e, C1480n c1480n) {
        C1479m c1479m;
        o oVar = f15465b;
        oVar.getClass();
        synchronized (c1471e) {
            if (!c1471e.f15410l) {
                c1471e.f15410l = true;
                c1471e.e();
            }
        }
        String str = "https://" + c1480n.f15462a + "/" + c1480n.f15464c;
        synchronized (oVar.f15466a) {
            try {
                if (!oVar.f15466a.containsKey(c1471e)) {
                    oVar.f15466a.put(c1471e, new HashMap());
                }
                Map map = (Map) oVar.f15466a.get(c1471e);
                if (map.containsKey(str)) {
                    throw new IllegalStateException("createLocalRepo() called for existing repo.");
                }
                c1479m = new C1479m(c1471e, c1480n);
                map.put(str, c1479m);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1479m;
    }
}
