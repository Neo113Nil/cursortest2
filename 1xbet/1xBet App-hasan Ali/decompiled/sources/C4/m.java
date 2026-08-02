package C4;

import B.K;
import L4.B;
import L4.C;
import L4.G;
import L4.I;
import X3.s;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.C1426pa;
import com.google.android.gms.internal.ads.C1471qa;
import com.google.android.gms.internal.ads.C1515ra;
import com.google.android.gms.internal.ads.Jr;
import com.google.android.gms.internal.ads.Kw;
import com.google.android.gms.internal.ads.Mt;
import com.google.android.gms.internal.ads.Nr;
import com.google.android.gms.internal.ads.V9;
import e2.C1930k;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import o4.C2226d;
import r0.AbstractC2346c;
import t3.AbstractC2425d;
import y4.C2673a;
import y4.n;
import y4.u;
import y4.v;
import y4.y;
import y4.z;

/* loaded from: classes.dex */
public final class m implements D4.d {

    /* renamed from: a, reason: collision with root package name */
    public int f908a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f909b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f910c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f911d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f912e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f913g;

    public m(Context context, U2.a aVar, String str, Nr nr) {
        this.f = new Object();
        this.f908a = 1;
        this.f910c = str;
        this.f909b = context.getApplicationContext();
        this.f911d = aVar;
        this.f912e = nr;
    }

    @Override // D4.d
    public I a(z zVar) {
        if (!D4.e.a(zVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(z.b("Transfer-Encoding", zVar))) {
            n nVar = (n) zVar.f21448k.f811b;
            if (this.f908a == 4) {
                this.f908a = 5;
                return new E4.d(this, nVar);
            }
            throw new IllegalStateException(("state: " + this.f908a).toString());
        }
        long j5 = z4.b.j(zVar);
        if (j5 != -1) {
            return j(j5);
        }
        if (this.f908a == 4) {
            this.f908a = 5;
            ((k) this.f910c).l();
            return new E4.g(this);
        }
        throw new IllegalStateException(("state: " + this.f908a).toString());
    }

    @Override // D4.d
    public G b(C0.c cVar, long j5) {
        kotlin.jvm.internal.l.f("request", cVar);
        if ("chunked".equalsIgnoreCase(((y4.m) cVar.f813d).c("Transfer-Encoding"))) {
            if (this.f908a == 1) {
                this.f908a = 2;
                return new E4.c(this);
            }
            throw new IllegalStateException(("state: " + this.f908a).toString());
        }
        if (j5 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f908a == 1) {
            this.f908a = 2;
            return new E4.f(this);
        }
        throw new IllegalStateException(("state: " + this.f908a).toString());
    }

    @Override // D4.d
    public void c() {
        ((B) this.f912e).flush();
    }

    @Override // D4.d
    public void cancel() {
        Socket socket = ((k) this.f910c).f893c;
        if (socket != null) {
            z4.b.d(socket);
        }
    }

    @Override // D4.d
    public void d() {
        ((B) this.f912e).flush();
    }

    @Override // D4.d
    public void e(C0.c cVar) {
        kotlin.jvm.internal.l.f("request", cVar);
        Proxy.Type type = ((k) this.f910c).f892b.f21283b.type();
        kotlin.jvm.internal.l.e("connection.route().proxy.type()", type);
        StringBuilder sb = new StringBuilder();
        sb.append((String) cVar.f812c);
        sb.append(' ');
        n nVar = (n) cVar.f811b;
        if (nVar.f21369j || type != Proxy.Type.HTTP) {
            String b3 = nVar.b();
            String d5 = nVar.d();
            if (d5 != null) {
                b3 = b3 + '?' + d5;
            }
            sb.append(b3);
        } else {
            sb.append(nVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", sb2);
        l((y4.m) cVar.f813d, sb2);
    }

    @Override // D4.d
    public y f(boolean z3) {
        E4.a aVar = (E4.a) this.f;
        int i = this.f908a;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f908a).toString());
        }
        try {
            String r5 = ((C) aVar.f1486l).r(aVar.f1485k);
            aVar.f1485k -= r5.length();
            K B5 = AbstractC2425d.B(r5);
            int i5 = B5.f637b;
            y yVar = new y();
            yVar.f21438b = (v) B5.f638c;
            yVar.f21439c = i5;
            yVar.f21440d = (String) B5.f639d;
            yVar.f = aVar.f().f();
            if (z3 && i5 == 100) {
                return null;
            }
            if (i5 == 100) {
                this.f908a = 3;
                return yVar;
            }
            if (102 > i5 || i5 >= 200) {
                this.f908a = 4;
                return yVar;
            }
            this.f908a = 3;
            return yVar;
        } catch (EOFException e3) {
            throw new IOException("unexpected end of stream on ".concat(((k) this.f910c).f892b.f21282a.f21298h.g()), e3);
        }
    }

    @Override // D4.d
    public long g(z zVar) {
        if (!D4.e.a(zVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(z.b("Transfer-Encoding", zVar))) {
            return -1L;
        }
        return z4.b.j(zVar);
    }

    @Override // D4.d
    public k h() {
        return (k) this.f910c;
    }

    public boolean i() {
        return this.f908a < ((List) this.f912e).size() || !((ArrayList) this.f913g).isEmpty();
    }

    public E4.e j(long j5) {
        if (this.f908a == 4) {
            this.f908a = 5;
            return new E4.e(this, j5);
        }
        throw new IllegalStateException(("state: " + this.f908a).toString());
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.List] */
    public C2.h k() {
        String str;
        int i;
        List list;
        boolean contains;
        if (!i()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f908a < ((List) this.f912e).size()) {
            boolean z3 = this.f908a < ((List) this.f912e).size();
            C2673a c2673a = (C2673a) this.f909b;
            if (!z3) {
                throw new SocketException("No route to " + c2673a.f21298h.f21365d + "; exhausted proxy configurations: " + ((List) this.f912e));
            }
            List list2 = (List) this.f912e;
            int i5 = this.f908a;
            this.f908a = i5 + 1;
            Proxy proxy = (Proxy) list2.get(i5);
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                n nVar = c2673a.f21298h;
                str = nVar.f21365d;
                i = nVar.f21366e;
            } else {
                SocketAddress address = proxy.address();
                if (!(address instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                }
                kotlin.jvm.internal.l.e("proxyAddress", address);
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                kotlin.jvm.internal.l.f("<this>", inetSocketAddress);
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                    kotlin.jvm.internal.l.e("hostName", str);
                } else {
                    str = address2.getHostAddress();
                    kotlin.jvm.internal.l.e("address.hostAddress", str);
                }
                i = inetSocketAddress.getPort();
            }
            if (1 > i || i >= 65536) {
                throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(str, i));
            } else {
                byte[] bArr = z4.b.f21979a;
                kotlin.jvm.internal.l.f("<this>", str);
                C2226d c2226d = z4.b.f;
                c2226d.getClass();
                if (c2226d.f18666k.matcher(str).matches()) {
                    list = AbstractC2346c.A(InetAddress.getByName(str));
                } else {
                    kotlin.jvm.internal.l.f("call", (i) this.f911d);
                    c2673a.f21292a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(str);
                        kotlin.jvm.internal.l.e("getAllByName(hostname)", allByName);
                        List J02 = X3.l.J0(allByName);
                        if (J02.isEmpty()) {
                            throw new UnknownHostException(c2673a.f21292a + " returned no addresses for " + str);
                        }
                        list = J02;
                    } catch (NullPointerException e3) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                        unknownHostException.initCause(e3);
                        throw unknownHostException;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i));
                }
            }
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                y4.C c5 = new y4.C((C2673a) this.f909b, proxy, (InetSocketAddress) it2.next());
                C1930k c1930k = (C1930k) this.f910c;
                synchronized (c1930k) {
                    contains = ((LinkedHashSet) c1930k.f16910l).contains(c5);
                }
                if (contains) {
                    ((ArrayList) this.f913g).add(c5);
                } else {
                    arrayList.add(c5);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            s.U((ArrayList) this.f913g, arrayList);
            ((ArrayList) this.f913g).clear();
        }
        return new C2.h(arrayList);
    }

    public void l(y4.m mVar, String str) {
        kotlin.jvm.internal.l.f("requestLine", str);
        if (this.f908a != 0) {
            throw new IllegalStateException(("state: " + this.f908a).toString());
        }
        B b3 = (B) this.f912e;
        b3.x(str);
        b3.x("\r\n");
        int size = mVar.size();
        for (int i = 0; i < size; i++) {
            b3.x(mVar.e(i));
            b3.x(": ");
            b3.x(mVar.g(i));
            b3.x("\r\n");
        }
        b3.x("\r\n");
        this.f908a = 1;
    }

    public C1471qa m() {
        T2.G.m("getEngine: Trying to acquire lock");
        synchronized (this.f) {
            try {
                T2.G.m("getEngine: Lock acquired");
                T2.G.m("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f) {
                    try {
                        T2.G.m("refreshIfDestroyed: Lock acquired");
                        C1515ra c1515ra = (C1515ra) this.f913g;
                        if (c1515ra != null && this.f908a == 0) {
                            c1515ra.p(new Mt(7, this), new V9(2));
                        }
                    } finally {
                    }
                }
                T2.G.m("refreshIfDestroyed: Lock released");
                C1515ra c1515ra2 = (C1515ra) this.f913g;
                if (c1515ra2 != null && ((AtomicInteger) c1515ra2.f475b).get() != -1) {
                    int i = this.f908a;
                    if (i == 0) {
                        T2.G.m("getEngine (NO_UPDATE): Lock released");
                        return ((C1515ra) this.f913g).q();
                    }
                    if (i != 1) {
                        T2.G.m("getEngine (UPDATING): Lock released");
                        return ((C1515ra) this.f913g).q();
                    }
                    this.f908a = 2;
                    n();
                    T2.G.m("getEngine (PENDING_UPDATE): Lock released");
                    return ((C1515ra) this.f913g).q();
                }
                this.f908a = 2;
                this.f913g = n();
                T2.G.m("getEngine (NULL or REJECTED): Lock released");
                return ((C1515ra) this.f913g).q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1515ra n() {
        Jr j5 = AbstractC1668us.j((Context) this.f909b, 6);
        j5.e();
        C1515ra c1515ra = new C1515ra();
        T2.G.m("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        AbstractC0613Id.f.execute(new Kw(7, this, c1515ra));
        T2.G.m("loadNewJavascriptEngine: Promise created");
        c1515ra.p(new C1426pa(this, c1515ra, j5), new C1426pa(this, c1515ra, j5));
        return c1515ra;
    }

    public m(C2673a c2673a, C1930k c1930k, i iVar) {
        List k5;
        kotlin.jvm.internal.l.f("routeDatabase", c1930k);
        kotlin.jvm.internal.l.f("call", iVar);
        this.f909b = c2673a;
        this.f910c = c1930k;
        this.f911d = iVar;
        X3.v vVar = X3.v.f6090k;
        this.f912e = vVar;
        this.f = vVar;
        this.f913g = new ArrayList();
        n nVar = c2673a.f21298h;
        kotlin.jvm.internal.l.f("url", nVar);
        URI h3 = nVar.h();
        if (h3.getHost() == null) {
            k5 = z4.b.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = c2673a.f21297g.select(h3);
            k5 = (select == null || select.isEmpty()) ? z4.b.k(Proxy.NO_PROXY) : z4.b.v(select);
        }
        this.f912e = k5;
        this.f908a = 0;
    }

    public m(u uVar, k kVar, C c5, B b3) {
        kotlin.jvm.internal.l.f("connection", kVar);
        kotlin.jvm.internal.l.f("source", c5);
        kotlin.jvm.internal.l.f("sink", b3);
        this.f909b = uVar;
        this.f910c = kVar;
        this.f911d = c5;
        this.f912e = b3;
        kotlin.jvm.internal.l.f("source", c5);
        E4.a aVar = new E4.a();
        aVar.f1486l = c5;
        aVar.f1485k = 262144L;
        this.f = aVar;
    }
}
