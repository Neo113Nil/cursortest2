package E4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f2131g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K4.j f2132a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B4.I f2136e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2133b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2134c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f2137f = new HashSet();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2131g = threadPoolExecutor;
    }

    public J(K4.j jVar) {
        this.f2132a = jVar;
    }

    public final I4.n a(H4.h hVar) {
        H4.n nVar = (H4.n) this.f2133b.get(hVar);
        if (this.f2137f.contains(hVar) || nVar == null) {
            return I4.n.f3688c;
        }
        return nVar.equals(H4.n.f3332b) ? I4.n.a(false) : new I4.n(nVar, null);
    }

    public final I4.n b(H4.h hVar) throws B4.I {
        H4.n nVar = (H4.n) this.f2133b.get(hVar);
        if (this.f2137f.contains(hVar) || nVar == null) {
            return I4.n.a(true);
        }
        if (nVar.equals(H4.n.f3332b)) {
            throw new B4.I("Can't update a document that doesn't exist.", B4.H.INVALID_ARGUMENT);
        }
        return new I4.n(nVar, null);
    }
}
