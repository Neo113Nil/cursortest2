package p098n4;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f15471b = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15472a = new HashMap();

    public static C0940m a(C0932e c0932e, C0941n c0941n) {
        C0940m c0940m;
        o oVar = f15471b;
        oVar.getClass();
        synchronized (c0932e) {
            if (!c0932e.f15416l) {
                c0932e.f15416l = true;
                c0932e.e();
            }
        }
        String str = "https://" + c0941n.f15468a + "/" + c0941n.f15470c;
        synchronized (oVar.f15472a) {
            try {
                if (!oVar.f15472a.containsKey(c0932e)) {
                    oVar.f15472a.put(c0932e, new HashMap());
                }
                Map map = (Map) oVar.f15472a.get(c0932e);
                if (map.containsKey(str)) {
                    throw new IllegalStateException("createLocalRepo() called for existing repo.");
                }
                c0940m = new C0940m(c0932e, c0941n);
                map.put(str, c0940m);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0940m;
    }
}
