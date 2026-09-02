package l1;

import P.B;
import i1.A;
import i1.C0070a;
import i1.C0071b;
import i1.i;
import i1.k;
import i1.o;
import i1.s;
import i1.v;
import i1.x;
import i1.y;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.KotlinVersion;
import o1.h;
import o1.n;
import o1.r;
import o1.w;
import p.AbstractC0819i;
import s1.l;
import s1.m;
import s1.u;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: b, reason: collision with root package name */
    public final i1.g f6089b;

    /* renamed from: c, reason: collision with root package name */
    public final A f6090c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f6091d;

    /* renamed from: e, reason: collision with root package name */
    public Socket f6092e;

    /* renamed from: f, reason: collision with root package name */
    public k f6093f;

    /* renamed from: g, reason: collision with root package name */
    public s f6094g;

    /* renamed from: h, reason: collision with root package name */
    public r f6095h;

    /* renamed from: i, reason: collision with root package name */
    public s1.n f6096i;

    /* renamed from: j, reason: collision with root package name */
    public m f6097j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6098k;

    /* renamed from: l, reason: collision with root package name */
    public int f6099l;

    /* renamed from: m, reason: collision with root package name */
    public int f6100m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6101n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public long f6102o = Long.MAX_VALUE;

    public c(i1.g gVar, A a2) {
        this.f6089b = gVar;
        this.f6090c = a2;
    }

    @Override // o1.n
    public final void a(r rVar) {
        synchronized (this.f6089b) {
            this.f6100m = rVar.i();
        }
    }

    @Override // o1.n
    public final void b(w wVar) {
        wVar.c(5);
    }

    public final void c(int i2, int i3, int i4, boolean z2, C0071b c0071b) {
        if (this.f6094g != null) {
            throw new IllegalStateException("already connected");
        }
        C0070a c0070a = this.f6090c.f1269a;
        List list = c0070a.f1284f;
        b bVar = new b(list);
        if (c0070a.f1286h == null) {
            if (!list.contains(i.f1343f)) {
                throw new d(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f6090c.f1269a.f1279a.f1379d;
            if (!p1.g.f6437a.k(str)) {
                throw new d(new UnknownServiceException(AbstractC0819i.a("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c0070a.f1283e.contains(s.H2_PRIOR_KNOWLEDGE)) {
            throw new d(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        d dVar = null;
        while (true) {
            try {
                A a2 = this.f6090c;
                if (a2.f1269a.f1286h != null && a2.f1270b.type() == Proxy.Type.HTTP) {
                    e(i2, i3, i4, c0071b);
                    if (this.f6091d == null) {
                        break;
                    }
                } else {
                    d(i2, i3, c0071b);
                }
                f(bVar, c0071b);
                InetSocketAddress inetSocketAddress = this.f6090c.f1271c;
                c0071b.getClass();
                break;
            } catch (IOException e2) {
                j1.d.d(this.f6092e);
                j1.d.d(this.f6091d);
                this.f6092e = null;
                this.f6091d = null;
                this.f6096i = null;
                this.f6097j = null;
                this.f6093f = null;
                this.f6094g = null;
                this.f6095h = null;
                InetSocketAddress inetSocketAddress2 = this.f6090c.f1271c;
                c0071b.getClass();
                if (dVar == null) {
                    dVar = new d(e2);
                } else {
                    IOException iOException = dVar.f6103a;
                    Method method = j1.d.f6059g;
                    if (method != null) {
                        try {
                            method.invoke(iOException, e2);
                        } catch (IllegalAccessException | InvocationTargetException unused) {
                        }
                    }
                    dVar.f6104b = e2;
                }
                if (!z2) {
                    throw dVar;
                }
                bVar.f6088d = true;
                if (!bVar.f6087c) {
                    throw dVar;
                }
                if (e2 instanceof ProtocolException) {
                    throw dVar;
                }
                if (e2 instanceof InterruptedIOException) {
                    throw dVar;
                }
                boolean z3 = e2 instanceof SSLHandshakeException;
                if (z3 && (e2.getCause() instanceof CertificateException)) {
                    throw dVar;
                }
                if (e2 instanceof SSLPeerUnverifiedException) {
                    throw dVar;
                }
                if (!z3) {
                    if (e2 instanceof SSLProtocolException) {
                        continue;
                    } else if (!(e2 instanceof SSLException)) {
                        throw dVar;
                    }
                }
            }
        }
        A a3 = this.f6090c;
        if (a3.f1269a.f1286h != null && a3.f1270b.type() == Proxy.Type.HTTP && this.f6091d == null) {
            throw new d(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.f6095h != null) {
            synchronized (this.f6089b) {
                this.f6100m = this.f6095h.i();
            }
        }
    }

    public final void d(int i2, int i3, C0071b c0071b) {
        A a2 = this.f6090c;
        Proxy proxy = a2.f1270b;
        InetSocketAddress inetSocketAddress = a2.f1271c;
        this.f6091d = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? a2.f1269a.f1281c.createSocket() : new Socket(proxy);
        c0071b.getClass();
        this.f6091d.setSoTimeout(i3);
        try {
            p1.g.f6437a.g(this.f6091d, inetSocketAddress, i2);
            try {
                this.f6096i = new s1.n(l.b(this.f6091d));
                this.f6097j = new m(l.a(this.f6091d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void e(int i2, int i3, int i4, C0071b c0071b) {
        v vVar = new v();
        A a2 = this.f6090c;
        o oVar = a2.f1269a.f1279a;
        if (oVar == null) {
            throw new NullPointerException("url == null");
        }
        vVar.f1425a = oVar;
        vVar.b("CONNECT", null);
        C0070a c0070a = a2.f1269a;
        vVar.f1427c.d("Host", j1.d.j(c0070a.f1279a, true));
        vVar.f1427c.d("Proxy-Connection", "Keep-Alive");
        vVar.f1427c.d("User-Agent", "okhttp/3.12.0");
        i1.w a3 = vVar.a();
        x xVar = new x();
        xVar.f1436a = a3;
        xVar.f1437b = s.HTTP_1_1;
        xVar.f1438c = 407;
        xVar.f1439d = "Preemptive Authenticate";
        xVar.f1442g = j1.d.f6055c;
        xVar.f1446k = -1L;
        xVar.f1447l = -1L;
        xVar.f1441f.d("Proxy-Authenticate", "OkHttp-Preemptive");
        xVar.a();
        c0070a.f1282d.getClass();
        d(i2, i3, c0071b);
        String str = "CONNECT " + j1.d.j(a3.f1430a, true) + " HTTP/1.1";
        s1.n nVar = this.f6096i;
        n1.g gVar = new n1.g(null, null, nVar, this.f6097j);
        u d2 = nVar.f6639b.d();
        long j2 = i3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d2.g(j2, timeUnit);
        this.f6097j.f6636b.d().g(i4, timeUnit);
        gVar.i(a3.f1432c, str);
        gVar.b();
        x e2 = gVar.e(false);
        e2.f1436a = a3;
        y a4 = e2.a();
        long a5 = m1.d.a(a4);
        if (a5 == -1) {
            a5 = 0;
        }
        n1.e g2 = gVar.g(a5);
        j1.d.o(g2, Integer.MAX_VALUE, timeUnit);
        g2.close();
        int i5 = a4.f1450c;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(C0.g.g(i5, "Unexpected response code for CONNECT: "));
            }
            c0070a.f1282d.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!this.f6096i.f6638a.a() || !this.f6097j.f6635a.a()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void f(b bVar, C0071b c0071b) {
        SSLSocket sSLSocket;
        A a2 = this.f6090c;
        C0070a c0070a = a2.f1269a;
        SSLSocketFactory sSLSocketFactory = c0070a.f1286h;
        s sVar = s.HTTP_1_1;
        if (sSLSocketFactory == null) {
            s sVar2 = s.H2_PRIOR_KNOWLEDGE;
            if (!c0070a.f1283e.contains(sVar2)) {
                this.f6092e = this.f6091d;
                this.f6094g = sVar;
                return;
            } else {
                this.f6092e = this.f6091d;
                this.f6094g = sVar2;
                i();
                return;
            }
        }
        c0071b.getClass();
        C0070a c0070a2 = a2.f1269a;
        SSLSocketFactory sSLSocketFactory2 = c0070a2.f1286h;
        o oVar = c0070a2.f1279a;
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) sSLSocketFactory2.createSocket(this.f6091d, oVar.f1379d, oVar.f1380e, true);
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            i a3 = bVar.a(sSLSocket);
            String str = oVar.f1379d;
            boolean z2 = a3.f1345b;
            if (z2) {
                p1.g.f6437a.f(sSLSocket, str, c0070a2.f1283e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            k a4 = k.a(session);
            boolean verify = c0070a2.f1287i.verify(str, session);
            List list = a4.f1363c;
            if (!verify) {
                X509Certificate x509Certificate = (X509Certificate) list.get(0);
                throw new SSLPeerUnverifiedException("Hostname " + str + " not verified:\n    certificate: " + i1.d.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + r1.c.a(x509Certificate));
            }
            c0070a2.f1288j.a(str, list);
            String i2 = z2 ? p1.g.f6437a.i(sSLSocket) : null;
            this.f6092e = sSLSocket;
            this.f6096i = new s1.n(l.b(sSLSocket));
            this.f6097j = new m(l.a(this.f6092e));
            this.f6093f = a4;
            if (i2 != null) {
                sVar = s.a(i2);
            }
            this.f6094g = sVar;
            p1.g.f6437a.a(sSLSocket);
            if (this.f6094g == s.HTTP_2) {
                i();
            }
        } catch (AssertionError e3) {
            e = e3;
            if (!j1.d.m(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                p1.g.f6437a.a(sSLSocket2);
            }
            j1.d.d(sSLSocket2);
            throw th;
        }
    }

    public final boolean g(C0070a c0070a, A a2) {
        if (this.f6101n.size() < this.f6100m && !this.f6098k) {
            C0071b c0071b = C0071b.f1293e;
            A a3 = this.f6090c;
            C0070a c0070a2 = a3.f1269a;
            c0071b.getClass();
            if (!c0070a2.a(c0070a)) {
                return false;
            }
            o oVar = c0070a.f1279a;
            if (oVar.f1379d.equals(a3.f1269a.f1279a.f1379d)) {
                return true;
            }
            if (this.f6095h == null || a2 == null) {
                return false;
            }
            Proxy.Type type = a2.f1270b.type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type != type2 || a3.f1270b.type() != type2) {
                return false;
            }
            if (!a3.f1271c.equals(a2.f1271c) || a2.f1269a.f1287i != r1.c.f6488a || !j(oVar)) {
                return false;
            }
            try {
                c0070a.f1288j.a(oVar.f1379d, this.f6093f.f1363c);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public final m1.b h(i1.r rVar, m1.e eVar, g gVar) {
        if (this.f6095h != null) {
            return new h(rVar, eVar, gVar, this.f6095h);
        }
        Socket socket = this.f6092e;
        int i2 = eVar.f6139j;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f6096i.f6639b.d().g(i2, timeUnit);
        this.f6097j.f6636b.d().g(eVar.f6140k, timeUnit);
        return new n1.g(rVar, gVar, this.f6096i, this.f6097j);
    }

    public final void i() {
        this.f6092e.setSoTimeout(0);
        P.r rVar = new P.r();
        rVar.f351f = n.f6309a;
        rVar.f346a = true;
        Socket socket = this.f6092e;
        String str = this.f6090c.f1269a.f1279a.f1379d;
        s1.n nVar = this.f6096i;
        m mVar = this.f6097j;
        rVar.f347b = socket;
        rVar.f348c = str;
        rVar.f349d = nVar;
        rVar.f350e = mVar;
        rVar.f351f = this;
        r rVar2 = new r(rVar);
        this.f6095h = rVar2;
        o1.x xVar = rVar2.f6336r;
        synchronized (xVar) {
            try {
                if (xVar.f6376e) {
                    throw new IOException("closed");
                }
                if (xVar.f6373b) {
                    Logger logger = o1.x.f6371g;
                    if (logger.isLoggable(Level.FINE)) {
                        String e2 = o1.f.f6281a.e();
                        byte[] bArr = j1.d.f6053a;
                        Locale locale = Locale.US;
                        logger.fine(">> CONNECTION " + e2);
                    }
                    xVar.f6372a.b((byte[]) o1.f.f6281a.f6621a.clone());
                    xVar.f6372a.flush();
                }
            } finally {
            }
        }
        o1.x xVar2 = rVar2.f6336r;
        B b2 = rVar2.f6332n;
        synchronized (xVar2) {
            try {
                if (xVar2.f6376e) {
                    throw new IOException("closed");
                }
                int i2 = 4;
                xVar2.g(0, Integer.bitCount(b2.f286a) * 6, (byte) 4, (byte) 0);
                int i3 = 0;
                while (i3 < 10) {
                    if (((1 << i3) & b2.f286a) != 0) {
                        int i4 = i3 == i2 ? 3 : i3 == 7 ? i2 : i3;
                        m mVar2 = xVar2.f6372a;
                        if (mVar2.f6637c) {
                            throw new IllegalStateException("closed");
                        }
                        s1.e eVar = mVar2.f6635a;
                        s1.o r2 = eVar.r(2);
                        int i5 = r2.f6643c;
                        byte b3 = (byte) ((i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        byte[] bArr2 = r2.f6641a;
                        bArr2[i5] = b3;
                        bArr2[i5 + 1] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
                        r2.f6643c = i5 + 2;
                        eVar.f6618b += 2;
                        mVar2.a();
                        xVar2.f6372a.i(((int[]) b2.f287b)[i3]);
                    }
                    i3++;
                    i2 = 4;
                }
                xVar2.f6372a.flush();
            } finally {
            }
        }
        if (rVar2.f6332n.a() != 65535) {
            rVar2.f6336r.m(0, r0 - 65535);
        }
        new Thread(rVar2.f6337s).start();
    }

    public final boolean j(o oVar) {
        int i2 = oVar.f1380e;
        o oVar2 = this.f6090c.f1269a.f1279a;
        if (i2 != oVar2.f1380e) {
            return false;
        }
        String str = oVar.f1379d;
        if (str.equals(oVar2.f1379d)) {
            return true;
        }
        k kVar = this.f6093f;
        return kVar != null && r1.c.c(str, (X509Certificate) kVar.f1363c.get(0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        A a2 = this.f6090c;
        sb.append(a2.f1269a.f1279a.f1379d);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(a2.f1269a.f1279a.f1380e);
        sb.append(", proxy=");
        sb.append(a2.f1270b);
        sb.append(" hostAddress=");
        sb.append(a2.f1271c);
        sb.append(" cipherSuite=");
        k kVar = this.f6093f;
        sb.append(kVar != null ? kVar.f1362b : "none");
        sb.append(" protocol=");
        sb.append(this.f6094g);
        sb.append('}');
        return sb.toString();
    }
}
