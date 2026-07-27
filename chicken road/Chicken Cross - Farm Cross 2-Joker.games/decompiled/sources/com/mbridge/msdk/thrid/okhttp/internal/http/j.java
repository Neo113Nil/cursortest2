package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: RetryAndFollowUpInterceptor.java */
/* loaded from: classes6.dex */
public final class j implements t {

    /* renamed from: a, reason: collision with root package name */
    private final v f9899a;
    private final boolean b;
    private volatile com.mbridge.msdk.thrid.okhttp.internal.connection.g c;
    private Object d;
    private volatile boolean e;

    public j(v vVar, boolean z) {
        this.f9899a = vVar;
        this.b = z;
    }

    public void a() {
        this.e = true;
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.c;
        if (gVar != null) {
            gVar.a();
        }
    }

    public boolean b() {
        return this.e;
    }

    public void a(Object obj) {
        this.d = obj;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        a0 a2;
        y a3;
        y d = aVar.d();
        g gVar = (g) aVar;
        com.mbridge.msdk.thrid.okhttp.d e = gVar.e();
        o g = gVar.g();
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar2 = new com.mbridge.msdk.thrid.okhttp.internal.connection.g(this.f9899a.f(), a(d.g()), e, g, this.d);
        this.c = gVar2;
        int i = 0;
        a0 a0Var = null;
        while (!this.e) {
            try {
                try {
                    a2 = gVar.a(d, gVar2, null, null);
                    if (a0Var != null) {
                        a2 = a2.p().d(a0Var.p().a((b0) null).a()).a();
                    }
                    try {
                        a3 = a(a2, gVar2.h());
                    } catch (IOException e2) {
                        gVar2.f();
                        throw e2;
                    }
                } catch (Throwable th) {
                    gVar2.a((IOException) null);
                    gVar2.f();
                    throw th;
                }
            } catch (com.mbridge.msdk.thrid.okhttp.internal.connection.e e3) {
                if (!a(e3.g(), gVar2, false, d)) {
                    throw e3.d();
                }
            } catch (IOException e4) {
                if (!a(e4, gVar2, !(e4 instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a), d)) {
                    throw e4;
                }
            }
            if (a3 == null) {
                gVar2.f();
                return a2;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(a2.d());
            int i2 = i + 1;
            if (i2 <= 20) {
                a3.a();
                if (!a(a2, a3.g())) {
                    gVar2.f();
                    gVar2 = new com.mbridge.msdk.thrid.okhttp.internal.connection.g(this.f9899a.f(), a(a3.g()), e, g, this.d);
                    this.c = gVar2;
                } else if (gVar2.b() != null) {
                    throw new IllegalStateException("Closing the body of " + a2 + " didn't close its backing stream. Bad interceptor?");
                }
                a0Var = a2;
                d = a3;
                i = i2;
            } else {
                gVar2.f();
                throw new ProtocolException("Too many follow-up requests: " + i2);
            }
        }
        gVar2.f();
        throw new IOException("Canceled");
    }

    private com.mbridge.msdk.thrid.okhttp.a a(s sVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        com.mbridge.msdk.thrid.okhttp.f fVar;
        if (sVar.h()) {
            sSLSocketFactory = this.f9899a.B();
            hostnameVerifier = this.f9899a.o();
            fVar = this.f9899a.c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        return new com.mbridge.msdk.thrid.okhttp.a(sVar.g(), sVar.j(), this.f9899a.k(), this.f9899a.A(), sSLSocketFactory, hostnameVerifier, fVar, this.f9899a.w(), this.f9899a.v(), this.f9899a.u(), this.f9899a.g(), this.f9899a.x());
    }

    private boolean a(IOException iOException, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, boolean z, y yVar) {
        gVar.a(iOException);
        if (this.f9899a.z()) {
            return !(z && a(iOException, yVar)) && a(iOException, z) && gVar.d();
        }
        return false;
    }

    private boolean a(IOException iOException, y yVar) {
        yVar.a();
        return iOException instanceof FileNotFoundException;
    }

    private boolean a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private y a(a0 a0Var, c0 c0Var) throws IOException {
        String b;
        s e;
        if (a0Var != null) {
            int k = a0Var.k();
            String e2 = a0Var.s().e();
            if (k == 307 || k == 308) {
                if (!e2.equals("GET") && !e2.equals("HEAD")) {
                    return null;
                }
            } else {
                if (k == 401) {
                    return this.f9899a.a().a(c0Var, a0Var);
                }
                if (k == 503) {
                    if ((a0Var.q() == null || a0Var.q().k() != 503) && a(a0Var, Integer.MAX_VALUE) == 0) {
                        return a0Var.s();
                    }
                    return null;
                }
                if (k == 407) {
                    if (c0Var.b().type() == Proxy.Type.HTTP) {
                        return this.f9899a.w().a(c0Var, a0Var);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (k == 408) {
                    if (!this.f9899a.z()) {
                        return null;
                    }
                    a0Var.s().a();
                    if ((a0Var.q() == null || a0Var.q().k() != 408) && a(a0Var, 0) <= 0) {
                        return a0Var.s();
                    }
                    return null;
                }
                switch (k) {
                    case 300:
                    case MRAID_ERROR_VALUE:
                    case INVALID_IFA_STATUS_VALUE:
                    case 303:
                        break;
                    default:
                        return null;
                }
            }
            if (!this.f9899a.m() || (b = a0Var.b(HttpHeaders.LOCATION)) == null || (e = a0Var.s().g().e(b)) == null) {
                return null;
            }
            if (!e.m().equals(a0Var.s().g().m()) && !this.f9899a.n()) {
                return null;
            }
            y.a f = a0Var.s().f();
            if (f.a(e2)) {
                boolean c = f.c(e2);
                if (f.b(e2)) {
                    f.a("GET", (z) null);
                } else {
                    f.a(e2, c ? a0Var.s().a() : null);
                }
                if (!c) {
                    f.a(HttpHeaders.TRANSFER_ENCODING);
                    f.a(HttpHeaders.CONTENT_LENGTH);
                    f.a("Content-Type");
                }
            }
            if (!a(a0Var, e)) {
                f.a(HttpHeaders.AUTHORIZATION);
            }
            return f.a(e).a();
        }
        throw new IllegalStateException();
    }

    private int a(a0 a0Var, int i) {
        String b = a0Var.b("Retry-After");
        if (b == null) {
            return i;
        }
        if (b.matches("\\d+")) {
            return Integer.valueOf(b).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean a(a0 a0Var, s sVar) {
        s g = a0Var.s().g();
        return g.g().equals(sVar.g()) && g.j() == sVar.j() && g.m().equals(sVar.m());
    }
}
