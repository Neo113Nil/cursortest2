package W5;

import U5.C0458z;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: W5.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0542t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f7366d = Logger.getLogger(C0542t1.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f2 f7367e = new f2(15);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f2 f7368f = new f2(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f7369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f7370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f7371c;

    public C0542t1() {
        String str = System.getenv("GRPC_PROXY_EXP");
        f2 f2Var = f7368f;
        f2Var.getClass();
        this.f7369a = f2Var;
        f2 f2Var2 = f7367e;
        f2Var2.getClass();
        this.f7370b = f2Var2;
        if (str == null) {
            this.f7371c = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i7 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f7366d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f7371c = new InetSocketAddress(strArrSplit[0], i7);
    }

    public final C0458z a(InetSocketAddress inetSocketAddress) {
        URL url;
        C0458z c0458z;
        if (inetSocketAddress == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress2 = this.f7371c;
        if (inetSocketAddress2 != null) {
            int i7 = C0458z.f6595e;
            p113p3.f.k(inetSocketAddress, "targetAddress");
            return new C0458z(inetSocketAddress2, inetSocketAddress, null, null);
        }
        Logger logger = f7366d;
        try {
            try {
                URI uri = new URI("https", null, AbstractC0494d0.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                this.f7369a.getClass();
                ProxySelector proxySelector = ProxySelector.getDefault();
                if (proxySelector == null) {
                    logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    logger.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                String strD = AbstractC0494d0.d(inetSocketAddress3);
                InetAddress address = inetSocketAddress3.getAddress();
                int port = inetSocketAddress3.getPort();
                this.f7370b.getClass();
                try {
                    url = new URL("https", strD, port, "");
                } catch (MalformedURLException unused) {
                    logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", strD});
                    url = null;
                }
                PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strD, address, port, "https", "", null, url, Authenticator.RequestorType.PROXY);
                if (inetSocketAddress3.isUnresolved()) {
                    inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                }
                int i8 = C0458z.f6595e;
                if (passwordAuthenticationRequestPasswordAuthentication == null) {
                    c0458z = new C0458z(inetSocketAddress3, inetSocketAddress, null, null);
                } else {
                    c0458z = new C0458z(inetSocketAddress3, inetSocketAddress, passwordAuthenticationRequestPasswordAuthentication.getUserName(), passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null);
                }
                return c0458z;
            } catch (URISyntaxException e7) {
                logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e7);
                return null;
            }
        } catch (Throwable th) {
            logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
