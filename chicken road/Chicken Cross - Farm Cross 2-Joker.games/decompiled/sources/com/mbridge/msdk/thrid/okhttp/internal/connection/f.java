package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: RouteSelector.java */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.a f9889a;
    private final d b;
    private final com.mbridge.msdk.thrid.okhttp.d c;
    private final o d;
    private int f;
    private List<Proxy> e = Collections.emptyList();
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<c0> h = new ArrayList();

    /* compiled from: RouteSelector.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<c0> f9890a;
        private int b = 0;

        a(List<c0> list) {
            this.f9890a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.f9890a);
        }

        public boolean b() {
            return this.b < this.f9890a.size();
        }

        public c0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<c0> list = this.f9890a;
            int i = this.b;
            this.b = i + 1;
            return list.get(i);
        }
    }

    public f(com.mbridge.msdk.thrid.okhttp.a aVar, d dVar, com.mbridge.msdk.thrid.okhttp.d dVar2, o oVar) {
        this.f9889a = aVar;
        this.b = dVar;
        this.c = dVar2;
        this.d = oVar;
        a(aVar.k(), aVar.f());
    }

    private boolean b() {
        return this.f < this.e.size();
    }

    private Proxy d() throws IOException {
        if (!b()) {
            throw new SocketException("No route to " + this.f9889a.k().g() + "; exhausted proxy configurations: " + this.e);
        }
        List<Proxy> list = this.e;
        int i = this.f;
        this.f = i + 1;
        Proxy proxy = list.get(i);
        a(proxy);
        return proxy;
    }

    public boolean a() {
        return b() || !this.h.isEmpty();
    }

    public a c() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy d = d();
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                c0 c0Var = new c0(this.f9889a, d, this.g.get(i));
                if (this.b.c(c0Var)) {
                    this.h.add(c0Var);
                } else {
                    arrayList.add(c0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.h);
            this.h.clear();
        }
        return new a(arrayList);
    }

    public void a(c0 c0Var, IOException iOException) {
        if (c0Var.b().type() != Proxy.Type.DIRECT && this.f9889a.h() != null) {
            this.f9889a.h().connectFailed(this.f9889a.k().n(), c0Var.b().address(), iOException);
        }
        this.b.b(c0Var);
    }

    private void a(s sVar, Proxy proxy) {
        List<Proxy> a2;
        if (proxy != null) {
            this.e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f9889a.h().select(sVar.n());
            if (select != null && !select.isEmpty()) {
                a2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(select);
            } else {
                a2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(Proxy.NO_PROXY);
            }
            this.e = a2;
        }
        this.f = 0;
    }

    private void a(Proxy proxy) throws IOException {
        String g;
        int j;
        this.g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                g = a(inetSocketAddress);
                j = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        } else {
            g = this.f9889a.k().g();
            j = this.f9889a.k().j();
        }
        if (j >= 1 && j <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.g.add(InetSocketAddress.createUnresolved(g, j));
                return;
            }
            this.d.dnsStart(this.c, g);
            List<InetAddress> a2 = this.f9889a.c().a(g);
            if (!a2.isEmpty()) {
                this.d.dnsEnd(this.c, g, a2);
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    this.g.add(new InetSocketAddress(a2.get(i), j));
                }
                return;
            }
            throw new UnknownHostException(this.f9889a.c() + " returned no addresses for " + g);
        }
        throw new SocketException("No route to " + g + ServerSentEventKt.COLON + j + "; port is out of range");
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
