package p1;

import a.AbstractC0009a;
import i1.r;
import i1.s;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f6437a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f6438b;

    static {
        g gVar;
        C0.b bVar;
        C0.b bVar2;
        int i2 = 7;
        Class<byte[]> cls = byte[].class;
        c cVar = null;
        try {
            try {
                Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                gVar = null;
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
        }
        C0.b bVar3 = new C0.b(cVar, "setUseSessionTickets", new Class[]{Boolean.TYPE}, i2);
        C0.b bVar4 = new C0.b(cVar, "setHostname", new Class[]{String.class}, i2);
        if (Security.getProvider("GMSCore_OpenSSL") == null) {
            try {
                Class.forName("android.net.Network");
            } catch (ClassNotFoundException unused3) {
                bVar = null;
                bVar2 = null;
            }
        }
        bVar = new C0.b(cls, "getAlpnSelectedProtocol", new Class[0], i2);
        bVar2 = new C0.b(cVar, "setAlpnProtocols", new Class[]{byte[].class}, i2);
        gVar = new c(bVar3, bVar4, bVar, bVar2);
        if (gVar == null) {
            if (!("conscrypt".equals(System.getProperty("okhttp.platform")) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (gVar = d.n()) == null) {
                try {
                    gVar = new e(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (NoSuchMethodException unused4) {
                    gVar = null;
                }
                if (gVar == null) {
                    try {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        cVar = new c(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    }
                    gVar = cVar != null ? cVar : new g();
                }
            }
        }
        f6437a = gVar;
        f6438b = Logger.getLogger(r.class.getName());
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = (s) list.get(i2);
            if (sVar != s.HTTP_1_0) {
                arrayList.add(sVar.f1416a);
            }
        }
        return arrayList;
    }

    public AbstractC0009a c(X509TrustManager x509TrustManager) {
        return new r1.a(d(x509TrustManager));
    }

    public r1.d d(X509TrustManager x509TrustManager) {
        return new r1.b(x509TrustManager.getAcceptedIssuers());
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        socket.connect(inetSocketAddress, i2);
    }

    public SSLContext h() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public String i(SSLSocket sSLSocket) {
        return null;
    }

    public Object j() {
        if (f6438b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean k(String str) {
        return true;
    }

    public void l(int i2, String str, Throwable th) {
        f6438b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void m(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        l(5, str, (Throwable) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void e(SSLSocketFactory sSLSocketFactory) {
    }

    public void f(SSLSocket sSLSocket, String str, List list) {
    }
}
