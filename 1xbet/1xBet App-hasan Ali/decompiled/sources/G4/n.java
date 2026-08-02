package G4;

import android.util.Log;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import t3.AbstractC2425d;
import y4.u;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile n f2016a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f2017b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fa, code lost:
    
        if (java.lang.Integer.parseInt(r4) >= 9) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    static {
        n kVar;
        n nVar;
        if (j3.i.v()) {
            for (Map.Entry entry : H4.c.f2368b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (H4.c.f2367a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(H4.d.f2369a);
                }
            }
            nVar = a.f1984d ? new a() : null;
            if (nVar == null) {
                r3 = c.f1988e ? new c() : null;
                kotlin.jvm.internal.l.c(r3);
                nVar = r3;
            }
        } else {
            if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
                kVar = h.f1999d ? new h() : null;
            }
            if ("BC".equals(Security.getProviders()[0].getName())) {
                kVar = e.f1996d ? new e() : null;
            }
            if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                kVar = m.f2014d ? new m() : null;
            }
            kVar = k.f2008c ? new k() : null;
            if (kVar == null) {
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    kotlin.jvm.internal.l.e("jvmVersion", property);
                } catch (NumberFormatException unused) {
                }
            }
            nVar = kVar;
        }
        f2016a = nVar;
        f2017b = Logger.getLogger(u.class.getName());
        if (r3 == null) {
            nVar = new n();
            f2016a = nVar;
            f2017b = Logger.getLogger(u.class.getName());
        }
        nVar = r3;
        f2016a = nVar;
        f2017b = Logger.getLogger(u.class.getName());
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
            Method method = cls.getMethod("put", SSLSocket.class, cls2);
            Method method2 = cls.getMethod("get", SSLSocket.class);
            Method method3 = cls.getMethod("remove", SSLSocket.class);
            kotlin.jvm.internal.l.e("putMethod", method);
            kotlin.jvm.internal.l.e("getMethod", method2);
            kotlin.jvm.internal.l.e("removeMethod", method3);
            kotlin.jvm.internal.l.e("clientProviderClass", cls3);
            kotlin.jvm.internal.l.e("serverProviderClass", cls4);
            r3 = new j(method, method2, method3, cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (r3 == null) {
        }
        nVar = r3;
        f2016a = nVar;
        f2017b = Logger.getLogger(u.class.getName());
    }

    public static void i(int i, String str, Throwable th) {
        kotlin.jvm.internal.l.f("message", str);
        f2017b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public AbstractC2425d b(X509TrustManager x509TrustManager) {
        return new K4.a(c(x509TrustManager));
    }

    public K4.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        kotlin.jvm.internal.l.e("trustManager.acceptedIssuers", acceptedIssuers);
        return new K4.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        kotlin.jvm.internal.l.f("address", inetSocketAddress);
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f2017b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        kotlin.jvm.internal.l.f("hostname", str);
        return true;
    }

    public void j(String str, Object obj) {
        kotlin.jvm.internal.l.f("message", str);
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        kotlin.jvm.internal.l.e("getInstance(\"TLS\")", sSLContext);
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k5 = k();
            k5.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = k5.getSocketFactory();
            kotlin.jvm.internal.l.e("newSSLContext().apply {\n…ll)\n      }.socketFactory", socketFactory);
            return socketFactory;
        } catch (GeneralSecurityException e3) {
            throw new AssertionError("No System TLS: " + e3, e3);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.l.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type javax.net.ssl.X509TrustManager", trustManager);
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        kotlin.jvm.internal.l.e("toString(this)", arrays);
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
