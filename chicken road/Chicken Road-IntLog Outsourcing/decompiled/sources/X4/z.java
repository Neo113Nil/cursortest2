package X4;

import T4.C0151a;
import g4.C0471p;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final C0151a f3651a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.j f3652b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3653c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3654d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3655e;

    /* renamed from: f, reason: collision with root package name */
    public int f3656f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3657g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3658h;

    public z(C0151a address, V0.j routeDatabase, a connectionUser, boolean z) {
        List k3;
        kotlin.jvm.internal.i.e(address, "address");
        kotlin.jvm.internal.i.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.i.e(connectionUser, "connectionUser");
        this.f3651a = address;
        this.f3652b = routeDatabase;
        this.f3653c = connectionUser;
        this.f3654d = z;
        C0471p c0471p = C0471p.f5750a;
        this.f3655e = c0471p;
        this.f3657g = c0471p;
        this.f3658h = new ArrayList();
        T4.q url = address.f2824h;
        connectionUser.getClass();
        kotlin.jvm.internal.i.e(url, "url");
        connectionUser.f3523a.getClass();
        URI g6 = url.g();
        if (g6.getHost() == null) {
            k3 = U4.e.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = address.f2823g.select(g6);
            k3 = (select == null || select.isEmpty()) ? U4.e.k(new Proxy[]{Proxy.NO_PROXY}) : U4.e.j(select);
        }
        this.f3655e = k3;
        this.f3656f = 0;
        kotlin.jvm.internal.i.e(url, "url");
        connectionUser.f3523a.getClass();
    }

    public final boolean a() {
        return this.f3656f < this.f3655e.size() || !this.f3658h.isEmpty();
    }
}
