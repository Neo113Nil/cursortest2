package d5;

import T4.u;
import a.AbstractC0169a;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import e5.h;
import e5.k;
import e5.m;
import e5.n;
import e5.o;
import g4.AbstractC0464i;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c extends e implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5489e;

    /* renamed from: c, reason: collision with root package name */
    public Context f5490c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5491d;

    static {
        f5489e = Build.VERSION.SDK_INT < 29;
    }

    public c() {
        o oVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e3) {
            CopyOnWriteArraySet copyOnWriteArraySet = e5.c.f5530a;
            e5.c.a(u.class.getName(), 5, "unable to load android socket classes", e3);
            oVar = null;
        }
        ArrayList T2 = AbstractC0464i.T(new n[]{oVar, new m(e5.e.f5533e), new m(k.f5540a), new m(h.f5538a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = T2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f5491d = arrayList;
    }

    @Override // d5.d
    public final void a(Context context) {
        this.f5490c = context;
    }

    @Override // d5.d
    public final Context b() {
        return this.f5490c;
    }

    @Override // d5.e
    public final AbstractC0169a c(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        i.e(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        e5.b bVar = x509TrustManagerExtensions != null ? new e5.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.c(trustManager);
    }

    @Override // d5.e
    public final h5.d d(X509TrustManager trustManager) {
        i.e(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // d5.e
    public final void e(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        i.e(protocols, "protocols");
        Iterator it = this.f5491d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((n) obj).b(sSLSocket)) {
                    break;
                }
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, protocols);
        }
    }

    @Override // d5.e
    public final void f(Socket socket, InetSocketAddress address, int i2) {
        i.e(address, "address");
        try {
            socket.connect(address, i2);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            throw new IOException("Exception in connect", e3);
        }
    }

    @Override // d5.e
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f5491d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((n) obj).b(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar.a(sSLSocket);
        }
        return null;
    }

    @Override // d5.e
    public final boolean i(String hostname) {
        i.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // d5.e
    public final void j(String message, int i2, Throwable th) {
        i.e(message, "message");
        if (i2 == 5) {
            Log.w("OkHttp", message, th);
        } else {
            Log.i("OkHttp", message, th);
        }
    }

    @Override // d5.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
