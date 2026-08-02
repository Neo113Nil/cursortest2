package p000;

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

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sy0 {

    /* JADX INFO: renamed from: d */
    public static final Logger f7227d = Logger.getLogger(sy0.class.getName());

    /* JADX INFO: renamed from: e */
    public static final aa0 f7228e = new aa0(11);

    /* JADX INFO: renamed from: f */
    public static final x80 f7229f = new x80(12);

    /* JADX INFO: renamed from: a */
    public final nb1 f7230a;

    /* JADX INFO: renamed from: b */
    public final aa0 f7231b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f7232c;

    public sy0() {
        String str = System.getenv("GRPC_PROXY_EXP");
        x80 x80Var = f7229f;
        x80Var.getClass();
        this.f7230a = x80Var;
        aa0 aa0Var = f7228e;
        aa0Var.getClass();
        this.f7231b = aa0Var;
        if (str == null) {
            this.f7232c = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f7227d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f7232c = new InetSocketAddress(strArrSplit[0], i);
    }

    /* JADX INFO: renamed from: a */
    public final rb0 m4608a(InetSocketAddress inetSocketAddress) {
        URL url;
        rb0 rb0Var;
        if (inetSocketAddress != null) {
            InetSocketAddress inetSocketAddress2 = this.f7232c;
            if (inetSocketAddress2 != null) {
                return new rb0(inetSocketAddress2, inetSocketAddress, null, null);
            }
            Logger logger = f7227d;
            try {
                try {
                    URI uri = new URI("https", null, ca0.m909d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                    ProxySelector proxySelector = (ProxySelector) this.f7230a.get();
                    if (proxySelector == null) {
                        logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> listSelect = proxySelector.select(uri);
                    if (listSelect.size() > 1) {
                        logger.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = listSelect.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                        String strM909d = ca0.m909d(inetSocketAddress3);
                        InetAddress address = inetSocketAddress3.getAddress();
                        int port = inetSocketAddress3.getPort();
                        this.f7231b.getClass();
                        try {
                            url = new URL("https", strM909d, port, "");
                        } catch (MalformedURLException unused) {
                            logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", strM909d});
                            url = null;
                        }
                        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strM909d, address, port, "https", "", null, url, Authenticator.RequestorType.PROXY);
                        if (inetSocketAddress3.isUnresolved()) {
                            inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                        }
                        int i = rb0.f6794n;
                        if (passwordAuthenticationRequestPasswordAuthentication == null) {
                            rb0Var = new rb0(inetSocketAddress3, inetSocketAddress, null, null);
                        } else {
                            rb0Var = new rb0(inetSocketAddress3, inetSocketAddress, passwordAuthenticationRequestPasswordAuthentication.getUserName(), passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null);
                        }
                        return rb0Var;
                    }
                } catch (URISyntaxException e) {
                    logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
                    return null;
                }
            } catch (Throwable th) {
                logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
                return null;
            }
        }
        return null;
    }
}
