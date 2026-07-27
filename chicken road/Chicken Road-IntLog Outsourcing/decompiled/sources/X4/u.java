package X4;

import G0.F;
import T4.A;
import T4.B;
import T4.C;
import T4.C0151a;
import T4.C0152b;
import b2.AbstractC0279e;
import g4.AbstractC0464i;
import g4.C0463h;
import h4.C0485c;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class u implements y {

    /* renamed from: a, reason: collision with root package name */
    public final W4.d f3631a;

    /* renamed from: b, reason: collision with root package name */
    public final t f3632b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3633c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3634d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3635e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3636f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3637g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3638h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3639i;

    /* renamed from: j, reason: collision with root package name */
    public final C0151a f3640j;

    /* renamed from: k, reason: collision with root package name */
    public final V0.j f3641k;

    /* renamed from: l, reason: collision with root package name */
    public final a f3642l;

    /* renamed from: m, reason: collision with root package name */
    public F f3643m;

    /* renamed from: n, reason: collision with root package name */
    public z f3644n;

    /* renamed from: o, reason: collision with root package name */
    public C f3645o;

    /* renamed from: p, reason: collision with root package name */
    public final C0463h f3646p;

    public u(W4.d taskRunner, t connectionPool, int i2, int i3, int i6, int i7, int i8, boolean z, boolean z5, C0151a address, V0.j routeDatabase, a connectionUser) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(address, "address");
        kotlin.jvm.internal.i.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.i.e(connectionUser, "connectionUser");
        this.f3631a = taskRunner;
        this.f3632b = connectionPool;
        this.f3633c = i2;
        this.f3634d = i3;
        this.f3635e = i6;
        this.f3636f = i7;
        this.f3637g = i8;
        this.f3638h = z;
        this.f3639i = z5;
        this.f3640j = address;
        this.f3641k = routeDatabase;
        this.f3642l = connectionUser;
        this.f3646p = new C0463h();
    }

    @Override // X4.y
    public final boolean a(T4.q url) {
        kotlin.jvm.internal.i.e(url, "url");
        T4.q qVar = this.f3640j.f2824h;
        return url.f2927e == qVar.f2927e && kotlin.jvm.internal.i.a(url.f2926d, qVar.f2926d);
    }

    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, java.util.List] */
    public final e b() {
        String str;
        int i2;
        List list;
        boolean contains;
        C c2 = this.f3645o;
        if (c2 != null) {
            this.f3645o = null;
            return c(c2, null);
        }
        F f3 = this.f3643m;
        if (f3 != null && f3.f753b < ((ArrayList) f3.f754c).size()) {
            int i3 = f3.f753b;
            ArrayList arrayList = (ArrayList) f3.f754c;
            if (i3 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i6 = f3.f753b;
            f3.f753b = 1 + i6;
            return c((C) arrayList.get(i6), null);
        }
        z zVar = this.f3644n;
        if (zVar == null) {
            zVar = new z(this.f3640j, this.f3641k, this.f3642l, this.f3639i);
            this.f3644n = zVar;
        }
        if (!zVar.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!zVar.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (zVar.f3656f < zVar.f3655e.size()) {
            boolean z = zVar.f3656f < zVar.f3655e.size();
            C0151a c0151a = zVar.f3651a;
            if (!z) {
                throw new SocketException("No route to " + c0151a.f2824h.f2926d + "; exhausted proxy configurations: " + zVar.f3655e);
            }
            List list2 = zVar.f3655e;
            int i7 = zVar.f3656f;
            zVar.f3656f = i7 + 1;
            Proxy proxy = (Proxy) list2.get(i7);
            ArrayList arrayList3 = new ArrayList();
            zVar.f3657g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                T4.q qVar = c0151a.f2824h;
                str = qVar.f2926d;
                i2 = qVar.f2927e;
            } else {
                SocketAddress address = proxy.address();
                if (!(address instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                kotlin.jvm.internal.i.e(inetSocketAddress, "<this>");
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                    kotlin.jvm.internal.i.d(str, "getHostName(...)");
                } else {
                    str = address2.getHostAddress();
                    kotlin.jvm.internal.i.d(str, "getHostAddress(...)");
                }
                i2 = inetSocketAddress.getPort();
            }
            if (1 > i2 || i2 >= 65536) {
                throw new SocketException("No route to " + str + ':' + i2 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(str, i2));
            } else {
                B4.j jVar = U4.b.f3175a;
                kotlin.jvm.internal.i.e(str, "<this>");
                B4.j jVar2 = U4.b.f3175a;
                jVar2.getClass();
                if (jVar2.f314a.matcher(str).matches()) {
                    list = K1.b.W(InetAddress.getByName(str));
                } else {
                    a aVar = zVar.f3653c;
                    aVar.f3523a.getClass();
                    c0151a.f2817a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(str);
                        kotlin.jvm.internal.i.d(allByName, "getAllByName(...)");
                        List a02 = AbstractC0464i.a0(allByName);
                        if (a02.isEmpty()) {
                            throw new UnknownHostException(c0151a.f2817a + " returned no addresses for " + str);
                        }
                        aVar.f3523a.getClass();
                        list = a02;
                    } catch (NullPointerException e3) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                        unknownHostException.initCause(e3);
                        throw unknownHostException;
                    }
                }
                if (zVar.f3654d && list.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : list) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = U4.c.f3176a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        C0485c c0485c = new C0485c(10);
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                c0485c.add(it.next());
                            }
                            if (it2.hasNext()) {
                                c0485c.add(it2.next());
                            }
                        }
                        list = K1.b.D(c0485c);
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), i2));
                }
            }
            Iterator it4 = zVar.f3657g.iterator();
            while (it4.hasNext()) {
                C c6 = new C(zVar.f3651a, proxy, (InetSocketAddress) it4.next());
                V0.j jVar3 = zVar.f3652b;
                synchronized (jVar3) {
                    contains = ((LinkedHashSet) jVar3.f3212b).contains(c6);
                }
                if (contains) {
                    zVar.f3658h.add(c6);
                } else {
                    arrayList2.add(c6);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            ArrayList elements = zVar.f3658h;
            kotlin.jvm.internal.i.e(elements, "elements");
            arrayList2.addAll(elements);
            zVar.f3658h.clear();
        }
        F f6 = new F(arrayList2);
        this.f3643m = f6;
        if (this.f3642l.k()) {
            throw new IOException("Canceled");
        }
        if (f6.f753b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i8 = f6.f753b;
        f6.f753b = 1 + i8;
        return c((C) arrayList2.get(i8), arrayList2);
    }

    public final e c(C route, List list) {
        kotlin.jvm.internal.i.e(route, "route");
        C0151a c0151a = route.f2805a;
        if (c0151a.f2819c == null) {
            if (!c0151a.f2826j.contains(T4.i.f2881f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f2805a.f2824h.f2926d;
            d5.e eVar = d5.e.f5492a;
            if (!d5.e.f5492a.i(str)) {
                throw new UnknownServiceException(AbstractC0279e.f("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c0151a.f2825i.contains(T4.v.f2990g)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        M0.e eVar2 = null;
        if (route.f2806b.type() == Proxy.Type.HTTP) {
            C0151a c0151a2 = route.f2805a;
            if (c0151a2.f2819c != null || c0151a2.f2825i.contains(T4.v.f2990g)) {
                B.d dVar = new B.d();
                T4.q url = route.f2805a.f2824h;
                kotlin.jvm.internal.i.e(url, "url");
                dVar.f107c = url;
                dVar.j("CONNECT", null);
                C0151a c0151a3 = route.f2805a;
                dVar.i("Host", U4.e.i(c0151a3.f2824h, true));
                dVar.i("Proxy-Connection", "Keep-Alive");
                dVar.i("User-Agent", "okhttp/5.2.1");
                eVar2 = new M0.e(dVar);
                A body = B.f2804a;
                L3.j jVar = new L3.j(3);
                C0152b c0152b = T4.v.f2985b;
                B0.f.z("Proxy-Authenticate");
                B0.f.A("OkHttp-Preemptive", "Proxy-Authenticate");
                jVar.h("Proxy-Authenticate");
                B0.f.i(jVar, "Proxy-Authenticate", "OkHttp-Preemptive");
                jVar.d();
                kotlin.jvm.internal.i.e(body, "body");
                c0151a3.f2822f.getClass();
            }
        }
        return new e(this.f3631a, this.f3632b, this.f3633c, this.f3634d, this.f3635e, this.f3636f, this.f3637g, this.f3638h, this.f3642l, this, route, list, 0, eVar2, -1, false);
    }

    @Override // X4.y
    public final C0463h d() {
        return this.f3646p;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0088  */
    @Override // X4.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x e() {
        Socket m6;
        boolean z;
        v vVar;
        s d6 = this.f3642l.d();
        if (d6 != null) {
            boolean g6 = d6.g(this.f3642l.j());
            synchronized (d6) {
                try {
                    if (g6) {
                        if (!d6.f3616m && a(d6.f3607d.f2805a.f2824h)) {
                            z = false;
                            m6 = null;
                        }
                        m6 = this.f3642l.m();
                        z = false;
                    } else {
                        z = !d6.f3616m;
                        d6.f3616m = true;
                        m6 = this.f3642l.m();
                    }
                } finally {
                }
            }
            if (this.f3642l.d() != null) {
                if (m6 != null) {
                    throw new IllegalStateException("Check failed.");
                }
                vVar = new v(d6);
                if (vVar == null) {
                    return vVar;
                }
                v i2 = i(null, null);
                if (i2 != null) {
                    return i2;
                }
                if (!this.f3646p.isEmpty()) {
                    return (x) this.f3646p.removeFirst();
                }
                e b6 = b();
                v i3 = i(b6, b6.f3542l);
                return i3 != null ? i3 : b6;
            }
            if (m6 != null) {
                U4.e.c(m6);
            }
            this.f3642l.f3523a.getClass();
            r call = this.f3642l.f3523a;
            kotlin.jvm.internal.i.e(call, "call");
            if (m6 != null) {
                this.f3642l.getClass();
            } else if (z) {
                this.f3642l.getClass();
            }
        }
        vVar = null;
        if (vVar == null) {
        }
    }

    @Override // X4.y
    public final boolean f(s sVar) {
        z zVar;
        C c2;
        if (!this.f3646p.isEmpty() || this.f3645o != null) {
            return true;
        }
        if (sVar != null) {
            synchronized (sVar) {
                c2 = null;
                if (sVar.f3618o == 0 && sVar.f3616m && U4.e.a(sVar.f3607d.f2805a.f2824h, this.f3640j.f2824h)) {
                    c2 = sVar.f3607d;
                }
            }
            if (c2 != null) {
                this.f3645o = c2;
                return true;
            }
        }
        F f3 = this.f3643m;
        if ((f3 == null || f3.f753b >= ((ArrayList) f3.f754c).size()) && (zVar = this.f3644n) != null) {
            return zVar.a();
        }
        return true;
    }

    @Override // X4.y
    public final C0151a g() {
        return this.f3640j;
    }

    @Override // X4.y
    public final boolean h() {
        return this.f3642l.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x004b, code lost:
    
        if ((r7.f3615l != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v i(e eVar, List list) {
        s sVar;
        boolean z;
        Socket m6;
        t tVar = this.f3632b;
        boolean j2 = this.f3642l.j();
        C0151a address = this.f3640j;
        a connectionUser = this.f3642l;
        boolean z5 = eVar != null && eVar.e();
        tVar.getClass();
        kotlin.jvm.internal.i.e(address, "address");
        kotlin.jvm.internal.i.e(connectionUser, "connectionUser");
        Iterator it = tVar.f3630g.iterator();
        kotlin.jvm.internal.i.d(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                sVar = null;
                break;
            }
            sVar = (s) it.next();
            kotlin.jvm.internal.i.b(sVar);
            synchronized (sVar) {
                if (z5) {
                }
                if (sVar.e(address, list)) {
                    connectionUser.a(sVar);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                if (sVar.g(j2)) {
                    break;
                }
                synchronized (sVar) {
                    sVar.f3616m = true;
                    m6 = connectionUser.m();
                }
                if (m6 != null) {
                    U4.e.c(m6);
                }
            }
        }
        if (sVar == null) {
            return null;
        }
        if (eVar != null) {
            this.f3645o = eVar.f3541k;
            Socket socket = eVar.f3549s;
            if (socket != null) {
                U4.e.c(socket);
            }
        }
        this.f3642l.g(sVar);
        this.f3642l.h(sVar);
        return new v(sVar);
    }
}
