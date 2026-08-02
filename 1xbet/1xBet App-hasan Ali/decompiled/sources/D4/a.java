package D4;

import C2.h;
import C4.i;
import C4.k;
import F4.C0121a;
import L4.s;
import Q2.C0375o;
import X3.v;
import com.google.android.gms.internal.ads.C1234l6;
import com.google.android.gms.internal.ads.C1386of;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.l;
import o0.C2202f;
import r3.AbstractC2349a;
import t3.AbstractC2425d;
import y4.B;
import y4.C;
import y4.C2673a;
import y4.C2674b;
import y4.m;
import y4.n;
import y4.p;
import y4.q;
import y4.u;
import y4.x;
import y4.y;
import y4.z;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f971a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f972b;

    public a(C2674b c2674b) {
        l.f("cookieJar", c2674b);
        this.f972b = c2674b;
    }

    public static int d(z zVar, int i) {
        String b3 = z.b("Retry-After", zVar);
        if (b3 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        l.e("compile(...)", compile);
        if (!compile.matcher(b3).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(b3);
        l.e("valueOf(header)", valueOf);
        return valueOf.intValue();
    }

    @Override // y4.p
    public final z a(f fVar) {
        B b3;
        SSLSocketFactory sSLSocketFactory;
        K4.c cVar;
        y4.f fVar2;
        switch (this.f971a) {
            case 0:
                C0.c cVar2 = fVar.f980e;
                C0375o h3 = cVar2.h();
                long j5 = -1;
                x xVar = (x) cVar2.f814e;
                if (xVar != null) {
                    q b5 = xVar.b();
                    if (b5 != null) {
                        h3.v("Content-Type", b5.f21372a);
                    }
                    long a5 = xVar.a();
                    if (a5 != -1) {
                        h3.v("Content-Length", String.valueOf(a5));
                        ((C2202f) h3.f5044n).p("Transfer-Encoding");
                    } else {
                        h3.v("Transfer-Encoding", "chunked");
                        ((C2202f) h3.f5044n).p("Content-Length");
                    }
                }
                m mVar = (m) cVar2.f813d;
                String c5 = mVar.c("Host");
                boolean z3 = false;
                n nVar = (n) cVar2.f811b;
                if (c5 == null) {
                    h3.v("Host", z4.b.u(nVar, false));
                }
                if (mVar.c("Connection") == null) {
                    h3.v("Connection", "Keep-Alive");
                }
                if (mVar.c("Accept-Encoding") == null && mVar.c("Range") == null) {
                    h3.v("Accept-Encoding", "gzip");
                    z3 = true;
                }
                C2674b c2674b = (C2674b) this.f972b;
                c2674b.getClass();
                l.f("url", nVar);
                if (mVar.c("User-Agent") == null) {
                    h3.v("User-Agent", "okhttp/4.12.0");
                }
                z b6 = fVar.b(h3.m());
                m mVar2 = b6.f21453p;
                e.b(c2674b, nVar, mVar2);
                y f = b6.f();
                f.f21437a = cVar2;
                if (z3 && "gzip".equalsIgnoreCase(z.b("Content-Encoding", b6)) && e.a(b6) && (b3 = b6.f21454q) != null) {
                    s sVar = new s(b3.f());
                    C2202f f5 = mVar2.f();
                    f5.p("Content-Encoding");
                    f5.p("Content-Length");
                    f.f = f5.d().f();
                    f.f21442g = new g(z.b("Content-Type", b6), j5, N4.b.k(sVar), 0);
                }
                return f.a();
            default:
                C0.c cVar3 = fVar.f980e;
                i iVar = fVar.f976a;
                List list = v.f6090k;
                z zVar = null;
                int i = 0;
                C0.c cVar4 = cVar3;
                while (true) {
                    boolean z5 = true;
                    while (true) {
                        iVar.getClass();
                        l.f("request", cVar4);
                        if (iVar.f884s != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (iVar) {
                            try {
                                if (iVar.f886u) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (iVar.f885t) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z5) {
                            C1386of c1386of = iVar.f878m;
                            n nVar2 = (n) cVar4.f811b;
                            boolean z6 = nVar2.f21369j;
                            u uVar = iVar.f876k;
                            if (z6) {
                                SSLSocketFactory sSLSocketFactory2 = uVar.f21425y;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                K4.c cVar5 = uVar.f21404C;
                                fVar2 = uVar.f21405D;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar5;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                fVar2 = null;
                            }
                            iVar.f882q = new C4.e(c1386of, new C2673a(nVar2.f21365d, nVar2.f21366e, uVar.f21421u, uVar.f21424x, sSLSocketFactory, cVar, fVar2, uVar.f21423w, uVar.f21403B, uVar.f21402A, uVar.f21422v), iVar);
                        }
                        try {
                            if (iVar.f888w) {
                                throw new IOException("Canceled");
                            }
                            try {
                                z b7 = fVar.b(cVar4);
                                if (zVar != null) {
                                    y f6 = b7.f();
                                    y f7 = zVar.f();
                                    f7.f21442g = null;
                                    z a6 = f7.a();
                                    if (a6.f21454q != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    f6.f21444j = a6;
                                    b7 = f6.a();
                                }
                                zVar = b7;
                                cVar4 = b(zVar, iVar.f884s);
                                if (cVar4 == null) {
                                    iVar.g(false);
                                    return zVar;
                                }
                                B b8 = zVar.f21454q;
                                if (b8 != null) {
                                    z4.b.c(b8);
                                }
                                i++;
                                if (i > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i);
                                }
                                iVar.g(true);
                            } catch (C4.l e3) {
                                if (!c(e3.f907l, iVar, cVar4, false)) {
                                    IOException iOException = e3.f906k;
                                    l.f("<this>", iOException);
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        AbstractC2425d.j(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                list = X3.m.h0(list, e3.f906k);
                                iVar.g(true);
                                z5 = false;
                            } catch (IOException e5) {
                                if (!c(e5, iVar, cVar4, !(e5 instanceof C0121a))) {
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        AbstractC2425d.j(e5, (Exception) it2.next());
                                    }
                                    throw e5;
                                }
                                list = X3.m.h0(list, e5);
                                iVar.g(true);
                                z5 = false;
                            }
                        } catch (Throwable th2) {
                            iVar.g(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public C0.c b(z zVar, A.v vVar) {
        String b3;
        z zVar2;
        k kVar;
        C c5 = (vVar == null || (kVar = (k) vVar.f136e) == null) ? null : kVar.f892b;
        int i = zVar.f21451n;
        String str = (String) zVar.f21448k.f812c;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((u) this.f972b).f21417q.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    z zVar3 = zVar.f21457t;
                    if ((zVar3 == null || zVar3.f21451n != 503) && d(zVar, Integer.MAX_VALUE) == 0) {
                        return zVar.f21448k;
                    }
                } else {
                    if (i == 407) {
                        l.c(c5);
                        if (c5.f21283b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((u) this.f972b).f21423w.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((u) this.f972b).f21416p && (((zVar2 = zVar.f21457t) == null || zVar2.f21451n != 408) && d(zVar, 0) <= 0)) {
                        return zVar.f21448k;
                    }
                }
            } else if (vVar != null && !l.a(((C4.e) vVar.f134c).f865b.f21298h.f21365d, ((k) vVar.f136e).f892b.f21282a.f21298h.f21365d)) {
                k kVar2 = (k) vVar.f136e;
                synchronized (kVar2) {
                    kVar2.f899k = true;
                }
                return zVar.f21448k;
            }
            return null;
        }
        u uVar = (u) this.f972b;
        if (uVar.f21418r && (b3 = z.b("Location", zVar)) != null) {
            C0.c cVar = zVar.f21448k;
            n nVar = (n) cVar.f811b;
            nVar.getClass();
            C1234l6 f = nVar.f(b3);
            n a5 = f != null ? f.a() : null;
            if (a5 != null) {
                if (l.a(a5.f21362a, ((n) cVar.f811b).f21362a) || uVar.f21419s) {
                    C0375o h3 = cVar.h();
                    if (AbstractC2349a.I(str)) {
                        boolean equals = str.equals("PROPFIND");
                        int i5 = zVar.f21451n;
                        boolean z3 = equals || i5 == 308 || i5 == 307;
                        if (str.equals("PROPFIND") || i5 == 308 || i5 == 307) {
                            h3.x(str, z3 ? (x) cVar.f814e : null);
                        } else {
                            h3.x("GET", null);
                        }
                        if (!z3) {
                            ((C2202f) h3.f5044n).p("Transfer-Encoding");
                            ((C2202f) h3.f5044n).p("Content-Length");
                            ((C2202f) h3.f5044n).p("Content-Type");
                        }
                    }
                    if (!z4.b.a((n) cVar.f811b, a5)) {
                        ((C2202f) h3.f5044n).p("Authorization");
                    }
                    h3.f5042l = a5;
                    return h3.m();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r7 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(IOException iOException, i iVar, C0.c cVar, boolean z3) {
        boolean z5;
        C4.m mVar;
        k kVar;
        if (!((u) this.f972b).f21416p || ((z3 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C4.e eVar = iVar.f882q;
        l.c(eVar);
        int i = eVar.f;
        if (i == 0 && eVar.f869g == 0 && eVar.f870h == 0) {
            z5 = false;
        } else {
            if (eVar.i == null) {
                C c5 = null;
                if (i <= 1 && eVar.f869g <= 1 && eVar.f870h <= 0 && (kVar = eVar.f866c.f883r) != null) {
                    synchronized (kVar) {
                        if (kVar.f900l == 0) {
                            if (z4.b.a(kVar.f892b.f21282a.f21298h, eVar.f865b.f21298h)) {
                                c5 = kVar.f892b;
                            }
                        }
                    }
                }
                if (c5 != null) {
                    eVar.i = c5;
                } else {
                    h hVar = eVar.f867d;
                    if ((hVar == null || !hVar.h()) && (mVar = eVar.f868e) != null) {
                        z5 = mVar.i();
                    }
                }
            }
            z5 = true;
        }
        return z5;
    }

    public a(u uVar) {
        l.f("client", uVar);
        this.f972b = uVar;
    }
}
