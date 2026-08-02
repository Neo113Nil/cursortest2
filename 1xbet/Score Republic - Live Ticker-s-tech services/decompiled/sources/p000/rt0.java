package p000;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class rt0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f6958b;

    /* JADX INFO: renamed from: c */
    public static final rt0 f6959c;

    /* JADX INFO: renamed from: a */
    public final fw0 f6960a;

    static {
        rt0 rt0Var;
        Logger logger = Logger.getLogger(rt0.class.getName());
        f6958b = logger;
        fw0 fw0Var = fw0.f2510d;
        ClassLoader classLoader = rt0.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                rt0Var = new rt0(fw0Var);
            }
        }
        rt0Var = new qt0(fw0Var);
        f6959c = rt0Var;
    }

    public rt0(fw0 fw0Var) {
        a90.m127k(fw0Var, "platform");
        this.f6960a = fw0Var;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4402c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            a90.m121e(str, "Userinfo must not be present on authority: '%s'", ca0.m906a(str).getAuthority().indexOf(64) == -1);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo4139a(SSLSocket sSLSocket, String str, List list) {
        this.f6960a.mo787c(sSLSocket, str, list);
    }

    /* JADX INFO: renamed from: b */
    public String mo4140b(SSLSocket sSLSocket) {
        return this.f6960a.mo788d(sSLSocket);
    }

    /* JADX INFO: renamed from: d */
    public String mo4141d(SSLSocket sSLSocket, String str, List list) {
        fw0 fw0Var = this.f6960a;
        if (list != null) {
            mo4139a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strMo4140b = mo4140b(sSLSocket);
            if (strMo4140b != null) {
                fw0Var.mo1321a(sSLSocket);
                return strMo4140b;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } catch (Throwable th) {
            fw0Var.mo1321a(sSLSocket);
            throw th;
        }
    }
}
