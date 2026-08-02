package G4;

import H4.o;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1988e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1989c;

    /* renamed from: d, reason: collision with root package name */
    public final H4.i f1990d;

    static {
        boolean z3 = false;
        if (j3.i.v() && Build.VERSION.SDK_INT < 30) {
            z3 = true;
        }
        f1988e = z3;
    }

    public c() {
        o oVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e3) {
            n.f2016a.getClass();
            n.i(5, "unable to load android socket classes", e3);
            oVar = null;
        }
        ArrayList E0 = X3.l.E0(new H4.n[]{oVar, new H4.m(H4.f.f), new H4.m(H4.k.f2379a), new H4.m(H4.h.f2375a)});
        ArrayList arrayList = new ArrayList();
        int size = E0.size();
        int i = 0;
        while (i < size) {
            Object obj = E0.get(i);
            i++;
            if (((H4.n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f1989c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f1990d = new H4.i(method3, method, method2);
    }

    @Override // G4.n
    public final AbstractC2425d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        H4.b bVar = x509TrustManagerExtensions != null ? new H4.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new K4.a(c(x509TrustManager));
    }

    @Override // G4.n
    public final K4.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // G4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        kotlin.jvm.internal.l.f("protocols", list);
        ArrayList arrayList = this.f1989c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((H4.n) obj).a(sSLSocket)) {
                break;
            }
        }
        H4.n nVar = (H4.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // G4.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        kotlin.jvm.internal.l.f("address", inetSocketAddress);
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            throw new IOException("Exception in connect", e3);
        }
    }

    @Override // G4.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f1989c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((H4.n) obj).a(sSLSocket)) {
                break;
            }
        }
        H4.n nVar = (H4.n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // G4.n
    public final Object g() {
        H4.i iVar = this.f1990d;
        iVar.getClass();
        Method method = iVar.f2376a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = iVar.f2377b;
                kotlin.jvm.internal.l.c(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // G4.n
    public final boolean h(String str) {
        boolean isCleartextTrafficPermitted;
        kotlin.jvm.internal.l.f("hostname", str);
        if (Build.VERSION.SDK_INT < 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }

    @Override // G4.n
    public final void j(String str, Object obj) {
        kotlin.jvm.internal.l.f("message", str);
        H4.i iVar = this.f1990d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f2378c;
                kotlin.jvm.internal.l.c(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(5, str, null);
    }
}
