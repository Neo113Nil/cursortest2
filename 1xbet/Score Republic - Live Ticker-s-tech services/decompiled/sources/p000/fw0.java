package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class fw0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f2508b;

    /* JADX INFO: renamed from: c */
    public static final String[] f2509c;

    /* JADX INFO: renamed from: d */
    public static final fw0 f2510d;

    /* JADX INFO: renamed from: a */
    public final Provider f2511a;

    static {
        Object obj;
        Provider provider;
        Provider provider2;
        fw0 fw0Var;
        int i;
        Logger logger = Logger.getLogger(fw0.class.getName());
        f2508b = logger;
        f2509c = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            obj = null;
            if (i2 >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider3 = providers[i2];
            for (String str : f2509c) {
                if (str.equals(provider3.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i2++;
        }
        int i3 = 2;
        int i4 = 1;
        if (provider != null) {
            oq0 oq0Var = new oq0(obj, "setUseSessionTickets", (Object) new Class[]{Boolean.TYPE}, i4);
            oq0 oq0Var2 = new oq0(obj, "setHostname", (Object) new Class[]{String.class}, i4);
            oq0 oq0Var3 = new oq0((Object) byte[].class, "getAlpnSelectedProtocol", (Object) new Class[0], i4);
            oq0 oq0Var4 = new oq0(obj, "setAlpnProtocols", (Object) new Class[]{byte[].class}, i4);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    fw0.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e);
                    try {
                        fw0.class.getClassLoader().loadClass("android.app.ActivityOptions");
                    } catch (ClassNotFoundException e2) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e2);
                        i3 = 3;
                    }
                    i = i3;
                }
            }
            i = 1;
            fw0Var = new bw0(oq0Var, oq0Var2, oq0Var3, oq0Var4, provider, i);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new aw0(0))).invoke(sSLContext.createSSLEngine(), null);
                        fw0Var = new cw0(provider4, (Method) AccessController.doPrivileged(new aw0(1)), (Method) AccessController.doPrivileged(new aw0(2)));
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                        provider2 = provider4;
                        fw0Var = new fw0(provider2);
                    }
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    try {
                        fw0Var = new dw0(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        provider2 = provider4;
                        fw0Var = new fw0(provider2);
                    }
                }
            } catch (NoSuchAlgorithmException e3) {
                dd0.m1163h(e3);
                return;
            }
        }
        f2510d = fw0Var;
    }

    public fw0(Provider provider) {
        this.f2511a = provider;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m1895b(List list) {
        C0539oc c0539oc = new C0539oc();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ky0 ky0Var = (ky0) list.get(i);
            if (ky0Var != ky0.f4591k) {
                c0539oc.m3678s(ky0Var.f4596j.length());
                String str = ky0Var.f4596j;
                c0539oc.m3679t(str, str.length());
            }
        }
        return c0539oc.m3671j(c0539oc.f5698k);
    }

    /* JADX INFO: renamed from: d */
    public String mo788d(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int mo789e() {
        return 3;
    }

    /* JADX INFO: renamed from: a */
    public void mo1321a(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: c */
    public void mo787c(SSLSocket sSLSocket, String str, List list) {
    }
}
