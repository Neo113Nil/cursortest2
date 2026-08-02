package X5;

import W5.AbstractC0494d0;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f7619b = Logger.getLogger(p.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final p f7620c;

    /* renamed from: a, reason: collision with root package name */
    public final Y5.j f7621a;

    static {
        p pVar;
        Y5.j jVar = Y5.j.f7803d;
        ClassLoader classLoader = p.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e7) {
            Level level = Level.FINE;
            Logger logger = f7619b;
            logger.log(level, "Unable to find Conscrypt. Skipping", (Throwable) e7);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e8) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e8);
                pVar = new p(jVar);
            }
        }
        pVar = new o(jVar);
        f7620c = pVar;
    }

    public p(Y5.j jVar) {
        p3.f.k(jVar, "platform");
        this.f7621a = jVar;
    }

    public static boolean c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            p3.f.h(AbstractC0494d0.a(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.f7621a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f7621a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List list) {
        Y5.j jVar = this.f7621a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String b7 = b(sSLSocket);
            if (b7 != null) {
                return b7;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            jVar.a(sSLSocket);
        }
    }
}
