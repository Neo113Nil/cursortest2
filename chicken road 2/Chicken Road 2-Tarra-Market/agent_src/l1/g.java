package l1;

import P.B;
import i1.A;
import i1.C0070a;
import i1.C0071b;
import i1.o;
import i1.u;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import o1.C0810a;
import o1.r;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final C0070a f6113a;

    /* renamed from: b, reason: collision with root package name */
    public B f6114b;

    /* renamed from: c, reason: collision with root package name */
    public A f6115c;

    /* renamed from: d, reason: collision with root package name */
    public final i1.g f6116d;

    /* renamed from: e, reason: collision with root package name */
    public final u f6117e;

    /* renamed from: f, reason: collision with root package name */
    public final C0071b f6118f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6119g;

    /* renamed from: h, reason: collision with root package name */
    public final e f6120h;

    /* renamed from: i, reason: collision with root package name */
    public int f6121i;

    /* renamed from: j, reason: collision with root package name */
    public c f6122j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6123k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6124l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6125m;

    /* renamed from: n, reason: collision with root package name */
    public m1.b f6126n;

    public g(i1.g gVar, C0070a c0070a, u uVar, C0071b c0071b, Object obj) {
        this.f6116d = gVar;
        this.f6113a = c0070a;
        this.f6117e = uVar;
        this.f6118f = c0071b;
        C0071b.f1293e.getClass();
        this.f6120h = new e(c0070a, gVar.f1336e, uVar, c0071b);
        this.f6119g = obj;
    }

    public final synchronized c a() {
        return this.f6122j;
    }

    public final Socket b(boolean z2, boolean z3, boolean z4) {
        Socket socket;
        if (z4) {
            this.f6126n = null;
        }
        if (z3) {
            this.f6124l = true;
        }
        c cVar = this.f6122j;
        if (cVar == null) {
            return null;
        }
        if (z2) {
            cVar.f6098k = true;
        }
        if (this.f6126n != null) {
            return null;
        }
        if (!this.f6124l && !cVar.f6098k) {
            return null;
        }
        ArrayList arrayList = cVar.f6101n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Reference) arrayList.get(i2)).get() == this) {
                arrayList.remove(i2);
                if (this.f6122j.f6101n.isEmpty()) {
                    this.f6122j.f6102o = System.nanoTime();
                    C0071b c0071b = C0071b.f1293e;
                    c cVar2 = this.f6122j;
                    c0071b.getClass();
                    i1.g gVar = this.f6116d;
                    gVar.getClass();
                    if (cVar2.f6098k || gVar.f1332a == 0) {
                        gVar.f1335d.remove(cVar2);
                        socket = this.f6122j.f6092e;
                        this.f6122j = null;
                        return socket;
                    }
                    gVar.notifyAll();
                }
                socket = null;
                this.f6122j = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    public final c c(int i2, int i3, int i4, boolean z2) {
        c cVar;
        Socket b2;
        c cVar2;
        boolean z3;
        A a2;
        boolean z4;
        c cVar3;
        Socket socket;
        B b3;
        String str;
        int i5;
        boolean contains;
        synchronized (this.f6116d) {
            try {
                if (this.f6124l) {
                    throw new IllegalStateException("released");
                }
                if (this.f6126n != null) {
                    throw new IllegalStateException("codec != null");
                }
                if (this.f6125m) {
                    throw new IOException("Canceled");
                }
                cVar = this.f6122j;
                b2 = (cVar == null || !cVar.f6098k) ? null : b(false, false, true);
                cVar2 = this.f6122j;
                if (cVar2 != null) {
                    cVar = null;
                } else {
                    cVar2 = null;
                }
                if (!this.f6123k) {
                    cVar = null;
                }
                if (cVar2 == null) {
                    C0071b c0071b = C0071b.f1293e;
                    i1.g gVar = this.f6116d;
                    C0070a c0070a = this.f6113a;
                    c0071b.getClass();
                    C0071b.b(gVar, c0070a, this, null);
                    c cVar4 = this.f6122j;
                    if (cVar4 != null) {
                        z3 = true;
                        cVar2 = cVar4;
                    } else {
                        a2 = this.f6115c;
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                a2 = null;
            } finally {
            }
        }
        j1.d.d(b2);
        if (cVar != null) {
            this.f6118f.getClass();
        }
        if (z3) {
            this.f6118f.getClass();
        }
        if (cVar2 != null) {
            return cVar2;
        }
        if (a2 != null || ((b3 = this.f6114b) != null && b3.f286a < ((ArrayList) b3.f287b).size())) {
            z4 = false;
        } else {
            e eVar = this.f6120h;
            if (eVar.f6109e >= eVar.f6108d.size() && eVar.f6111g.isEmpty()) {
                throw new NoSuchElementException();
            }
            ArrayList arrayList = new ArrayList();
            while (eVar.f6109e < eVar.f6108d.size()) {
                boolean z5 = eVar.f6109e < eVar.f6108d.size();
                C0070a c0070a2 = eVar.f6105a;
                if (!z5) {
                    throw new SocketException("No route to " + c0070a2.f1279a.f1379d + "; exhausted proxy configurations: " + eVar.f6108d);
                }
                List list = eVar.f6108d;
                int i6 = eVar.f6109e;
                eVar.f6109e = i6 + 1;
                Proxy proxy = (Proxy) list.get(i6);
                eVar.f6110f = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    o oVar = c0070a2.f1279a;
                    str = oVar.f1379d;
                    i5 = oVar.f1380e;
                } else {
                    SocketAddress address = proxy.address();
                    if (!(address instanceof InetSocketAddress)) {
                        throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    InetAddress address2 = inetSocketAddress.getAddress();
                    str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                    i5 = inetSocketAddress.getPort();
                }
                if (i5 < 1 || i5 > 65535) {
                    throw new SocketException("No route to " + str + StringUtils.PROCESS_POSTFIX_DELIMITER + i5 + "; port is out of range");
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    eVar.f6110f.add(InetSocketAddress.createUnresolved(str, i5));
                } else {
                    eVar.f6107c.getClass();
                    c0070a2.f1280b.getClass();
                    if (str == null) {
                        throw new UnknownHostException("hostname == null");
                    }
                    try {
                        List asList = Arrays.asList(InetAddress.getAllByName(str));
                        if (asList.isEmpty()) {
                            throw new UnknownHostException(c0070a2.f1280b + " returned no addresses for " + str);
                        }
                        int size = asList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            eVar.f6110f.add(new InetSocketAddress((InetAddress) asList.get(i7), i5));
                        }
                    } catch (NullPointerException e2) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                        unknownHostException.initCause(e2);
                        throw unknownHostException;
                    }
                }
                int size2 = eVar.f6110f.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    A a3 = new A(eVar.f6105a, proxy, (InetSocketAddress) eVar.f6110f.get(i8));
                    io.flutter.plugin.editing.a aVar = eVar.f6106b;
                    synchronized (aVar) {
                        contains = ((LinkedHashSet) aVar.f5792b).contains(a3);
                    }
                    if (contains) {
                        eVar.f6111g.add(a3);
                    } else {
                        arrayList.add(a3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(eVar.f6111g);
                eVar.f6111g.clear();
            }
            this.f6114b = new B(arrayList);
            z4 = true;
        }
        synchronized (this.f6116d) {
            try {
                if (this.f6125m) {
                    throw new IOException("Canceled");
                }
                if (z4) {
                    B b4 = this.f6114b;
                    b4.getClass();
                    ArrayList arrayList2 = new ArrayList((ArrayList) b4.f287b);
                    int size3 = arrayList2.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size3) {
                            break;
                        }
                        A a4 = (A) arrayList2.get(i9);
                        C0071b c0071b2 = C0071b.f1293e;
                        i1.g gVar2 = this.f6116d;
                        C0070a c0070a3 = this.f6113a;
                        c0071b2.getClass();
                        C0071b.b(gVar2, c0070a3, this, a4);
                        c cVar5 = this.f6122j;
                        if (cVar5 != null) {
                            this.f6115c = a4;
                            z3 = true;
                            cVar2 = cVar5;
                            break;
                        }
                        i9++;
                    }
                }
                if (!z3) {
                    if (a2 == null) {
                        B b5 = this.f6114b;
                        if (!(b5.f286a < ((ArrayList) b5.f287b).size())) {
                            throw new NoSuchElementException();
                        }
                        int i10 = b5.f286a;
                        b5.f286a = i10 + 1;
                        a2 = (A) ((ArrayList) b5.f287b).get(i10);
                    }
                    this.f6115c = a2;
                    this.f6121i = 0;
                    cVar2 = new c(this.f6116d, a2);
                    if (this.f6122j != null) {
                        throw new IllegalStateException();
                    }
                    this.f6122j = cVar2;
                    this.f6123k = false;
                    cVar2.f6101n.add(new f(this, this.f6119g));
                }
                cVar3 = cVar2;
            } finally {
            }
        }
        if (z3) {
            this.f6118f.getClass();
            return cVar3;
        }
        cVar3.c(i2, i3, i4, z2, this.f6118f);
        C0071b.f1293e.getClass();
        this.f6116d.f1336e.j(cVar3.f6090c);
        synchronized (this.f6116d) {
            try {
                this.f6123k = true;
                C0071b c0071b3 = C0071b.f1293e;
                i1.g gVar3 = this.f6116d;
                c0071b3.getClass();
                if (!gVar3.f1337f) {
                    gVar3.f1337f = true;
                    i1.g.f1331g.execute(gVar3.f1334c);
                }
                gVar3.f1335d.add(cVar3);
                if (cVar3.f6095h != null) {
                    C0071b c0071b4 = C0071b.f1293e;
                    i1.g gVar4 = this.f6116d;
                    C0070a c0070a4 = this.f6113a;
                    c0071b4.getClass();
                    socket = C0071b.a(gVar4, c0070a4, this);
                    cVar3 = this.f6122j;
                } else {
                    socket = null;
                }
            } finally {
            }
        }
        j1.d.d(socket);
        this.f6118f.getClass();
        return cVar3;
    }

    public final c d(int i2, int i3, int i4, boolean z2, boolean z3) {
        boolean z4;
        while (true) {
            c c2 = c(i2, i3, i4, z2);
            synchronized (this.f6116d) {
                try {
                    if (c2.f6099l == 0) {
                        return c2;
                    }
                    boolean z5 = false;
                    if (!c2.f6092e.isClosed() && !c2.f6092e.isInputShutdown() && !c2.f6092e.isOutputShutdown()) {
                        r rVar = c2.f6095h;
                        if (rVar != null) {
                            synchronized (rVar) {
                                z4 = rVar.f6325g;
                            }
                            z5 = !z4;
                        } else {
                            if (z3) {
                                try {
                                    int soTimeout = c2.f6092e.getSoTimeout();
                                    try {
                                        c2.f6092e.setSoTimeout(1);
                                        if (c2.f6096i.a()) {
                                            c2.f6092e.setSoTimeout(soTimeout);
                                        } else {
                                            c2.f6092e.setSoTimeout(soTimeout);
                                        }
                                    } catch (Throwable th) {
                                        c2.f6092e.setSoTimeout(soTimeout);
                                        throw th;
                                    }
                                } catch (SocketTimeoutException unused) {
                                } catch (IOException unused2) {
                                }
                            }
                            z5 = true;
                        }
                    }
                    if (z5) {
                        return c2;
                    }
                    e();
                } finally {
                }
            }
        }
    }

    public final void e() {
        c cVar;
        Socket b2;
        synchronized (this.f6116d) {
            cVar = this.f6122j;
            b2 = b(true, false, false);
            if (this.f6122j != null) {
                cVar = null;
            }
        }
        j1.d.d(b2);
        if (cVar != null) {
            this.f6118f.getClass();
        }
    }

    public final void f() {
        c cVar;
        Socket b2;
        synchronized (this.f6116d) {
            cVar = this.f6122j;
            b2 = b(false, true, false);
            if (this.f6122j != null) {
                cVar = null;
            }
        }
        j1.d.d(b2);
        if (cVar != null) {
            C0071b c0071b = C0071b.f1293e;
            u uVar = this.f6117e;
            c0071b.getClass();
            uVar.c(null);
            this.f6118f.getClass();
            this.f6118f.getClass();
        }
    }

    public final void g(IOException iOException) {
        c cVar;
        boolean z2;
        Socket b2;
        synchronized (this.f6116d) {
            try {
                cVar = null;
                if (iOException instanceof o1.A) {
                    int i2 = ((o1.A) iOException).f6253a;
                    if (i2 == 5) {
                        int i3 = this.f6121i + 1;
                        this.f6121i = i3;
                        if (i3 > 1) {
                            this.f6115c = null;
                            z2 = true;
                        }
                        z2 = false;
                    } else {
                        if (i2 != 6) {
                            this.f6115c = null;
                            z2 = true;
                        }
                        z2 = false;
                    }
                } else {
                    c cVar2 = this.f6122j;
                    if (cVar2 != null) {
                        if (!(cVar2.f6095h != null) || (iOException instanceof C0810a)) {
                            if (cVar2.f6099l == 0) {
                                A a2 = this.f6115c;
                                if (a2 != null && iOException != null) {
                                    this.f6120h.a(a2, iOException);
                                }
                                this.f6115c = null;
                            }
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                c cVar3 = this.f6122j;
                b2 = b(z2, false, true);
                if (this.f6122j == null && this.f6123k) {
                    cVar = cVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j1.d.d(b2);
        if (cVar != null) {
            this.f6118f.getClass();
        }
    }

    public final void h(boolean z2, m1.b bVar, IOException iOException) {
        c cVar;
        Socket b2;
        boolean z3;
        this.f6118f.getClass();
        synchronized (this.f6116d) {
            if (bVar != null) {
                try {
                    if (bVar == this.f6126n) {
                        if (!z2) {
                            this.f6122j.f6099l++;
                        }
                        cVar = this.f6122j;
                        b2 = b(z2, false, true);
                        if (this.f6122j != null) {
                            cVar = null;
                        }
                        z3 = this.f6124l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f6126n + " but was " + bVar);
        }
        j1.d.d(b2);
        if (cVar != null) {
            this.f6118f.getClass();
        }
        if (iOException != null) {
            C0071b c0071b = C0071b.f1293e;
            u uVar = this.f6117e;
            c0071b.getClass();
            uVar.c(iOException);
            this.f6118f.getClass();
            return;
        }
        if (z3) {
            C0071b c0071b2 = C0071b.f1293e;
            u uVar2 = this.f6117e;
            c0071b2.getClass();
            uVar2.c(null);
            this.f6118f.getClass();
        }
    }

    public final String toString() {
        c a2 = a();
        return a2 != null ? a2.toString() : this.f6113a.toString();
    }
}
