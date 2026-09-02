package m1;

import P.B;
import i1.A;
import i1.C0070a;
import i1.C0071b;
import i1.n;
import i1.o;
import i1.p;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import i1.x;
import i1.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import l1.g;
import o1.C0810a;

/* loaded from: classes.dex */
public final class f implements p {

    /* renamed from: a, reason: collision with root package name */
    public final r f6142a;

    /* renamed from: b, reason: collision with root package name */
    public volatile g f6143b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6144c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f6145d;

    public f(r rVar) {
        this.f6142a = rVar;
    }

    public static boolean e(y yVar, o oVar) {
        o oVar2 = yVar.f1448a.f1430a;
        return oVar2.f1379d.equals(oVar.f1379d) && oVar2.f1380e == oVar.f1380e && oVar2.f1376a.equals(oVar.f1376a);
    }

    @Override // i1.p
    public final y a(e eVar) {
        y b2;
        b bVar;
        w wVar = eVar.f6135f;
        u uVar = eVar.f6136g;
        C0071b c0071b = eVar.f6137h;
        g gVar = new g(this.f6142a.f1401n, b(wVar.f1430a), uVar, c0071b, this.f6144c);
        this.f6143b = gVar;
        int i2 = 0;
        y yVar = null;
        while (!this.f6145d) {
            try {
                try {
                    try {
                        b2 = eVar.b(wVar, gVar, null, null);
                        if (yVar != null) {
                            x b3 = b2.b();
                            x b4 = yVar.b();
                            b4.f1442g = null;
                            y a2 = b4.a();
                            if (a2.f1454g != null) {
                                throw new IllegalArgumentException("priorResponse.body != null");
                            }
                            b3.f1445j = a2;
                            b2 = b3.a();
                        }
                    } catch (IOException e2) {
                        if (!d(e2, gVar, !(e2 instanceof C0810a), wVar)) {
                            throw e2;
                        }
                    }
                } catch (l1.d e3) {
                    if (!d(e3.f6104b, gVar, false, wVar)) {
                        throw e3.f6103a;
                    }
                }
                try {
                    w c2 = c(b2, gVar.f6115c);
                    if (c2 == null) {
                        gVar.f();
                        return b2;
                    }
                    j1.d.c(b2.f1454g);
                    int i3 = i2 + 1;
                    if (i3 > 20) {
                        gVar.f();
                        throw new ProtocolException(C0.g.g(i3, "Too many follow-up requests: "));
                    }
                    if (e(b2, c2.f1430a)) {
                        synchronized (gVar.f6116d) {
                            bVar = gVar.f6126n;
                        }
                        if (bVar != null) {
                            throw new IllegalStateException("Closing the body of " + b2 + " didn't close its backing stream. Bad interceptor?");
                        }
                    } else {
                        gVar.f();
                        gVar = new g(this.f6142a.f1401n, b(c2.f1430a), uVar, c0071b, this.f6144c);
                        this.f6143b = gVar;
                    }
                    yVar = b2;
                    wVar = c2;
                    i2 = i3;
                } catch (IOException e4) {
                    gVar.f();
                    throw e4;
                }
            } catch (Throwable th) {
                gVar.g(null);
                gVar.f();
                throw th;
            }
        }
        gVar.f();
        throw new IOException("Canceled");
    }

    public final C0070a b(o oVar) {
        SSLSocketFactory sSLSocketFactory;
        r1.c cVar;
        i1.d dVar;
        boolean equals = oVar.f1376a.equals("https");
        r rVar = this.f6142a;
        if (equals) {
            sSLSocketFactory = rVar.f1395h;
            cVar = rVar.f1397j;
            dVar = rVar.f1398k;
        } else {
            sSLSocketFactory = null;
            cVar = null;
            dVar = null;
        }
        C0071b c0071b = rVar.f1402o;
        List list = r.f1386v;
        List list2 = r.f1386v;
        return new C0070a(oVar.f1379d, oVar.f1380e, c0071b, rVar.f1394g, sSLSocketFactory, cVar, dVar, rVar.f1399l, rVar.f1392e);
    }

    public final w c(y yVar, A a2) {
        String a3;
        n nVar;
        Proxy proxy;
        if (yVar == null) {
            throw new IllegalStateException();
        }
        w wVar = yVar.f1448a;
        String str = wVar.f1431b;
        r rVar = this.f6142a;
        int i2 = yVar.f1450c;
        if (i2 == 307 || i2 == 308) {
            if (!str.equals("GET") && !str.equals("HEAD")) {
                return null;
            }
        } else {
            if (i2 == 401) {
                rVar.f1400m.getClass();
                return null;
            }
            int i3 = Integer.MAX_VALUE;
            y yVar2 = yVar.f1457j;
            if (i2 == 503) {
                if (yVar2 != null && yVar2.f1450c == 503) {
                    return null;
                }
                String a4 = yVar.a("Retry-After");
                if (a4 != null && a4.matches("\\d+")) {
                    i3 = Integer.valueOf(a4).intValue();
                }
                if (i3 == 0) {
                    return wVar;
                }
                return null;
            }
            if (i2 == 407) {
                if (a2 != null) {
                    proxy = a2.f1270b;
                } else {
                    rVar.getClass();
                    proxy = null;
                }
                if (proxy.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                rVar.f1399l.getClass();
                return null;
            }
            if (i2 == 408) {
                if (!rVar.f1405r) {
                    return null;
                }
                if (yVar2 != null && yVar2.f1450c == 408) {
                    return null;
                }
                String a5 = yVar.a("Retry-After");
                if (a5 == null) {
                    i3 = 0;
                } else if (a5.matches("\\d+")) {
                    i3 = Integer.valueOf(a5).intValue();
                }
                if (i3 > 0) {
                    return null;
                }
                return wVar;
            }
            switch (i2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!rVar.f1404q || (a3 = yVar.a("Location")) == null) {
            return null;
        }
        o oVar = wVar.f1430a;
        oVar.getClass();
        try {
            nVar = new n();
            nVar.b(oVar, a3);
        } catch (IllegalArgumentException unused) {
            nVar = null;
        }
        o a6 = nVar != null ? nVar.a() : null;
        if (a6 == null) {
            return null;
        }
        if (!a6.f1376a.equals(oVar.f1376a) && !rVar.f1403p) {
            return null;
        }
        v a7 = wVar.a();
        if (V.a.t(str)) {
            boolean equals = str.equals("PROPFIND");
            if (str.equals("PROPFIND")) {
                a7.b(str, equals ? wVar.f1433d : null);
            } else {
                a7.b("GET", null);
            }
            if (!equals) {
                a7.c("Transfer-Encoding");
                a7.c("Content-Length");
                a7.c("Content-Type");
            }
        }
        if (!e(yVar, a6)) {
            a7.c("Authorization");
        }
        a7.f1425a = a6;
        return a7.a();
    }

    public final boolean d(IOException iOException, g gVar, boolean z2, w wVar) {
        gVar.g(iOException);
        if (!this.f6142a.f1405r || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        if (gVar.f6115c != null) {
            return true;
        }
        B b2 = gVar.f6114b;
        if (b2 != null && b2.f286a < ((ArrayList) b2.f287b).size()) {
            return true;
        }
        l1.e eVar = gVar.f6120h;
        return eVar.f6109e < eVar.f6108d.size() || !eVar.f6111g.isEmpty();
    }
}
