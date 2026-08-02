package p000;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ut0 {

    /* JADX INFO: renamed from: a */
    public static final List f7906a = Collections.unmodifiableList(Arrays.asList(ky0.f4594n));

    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: a */
    public static SSLSocket m4954a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, C0326il c0326il) throws IOException {
        ky0 ky0Var;
        a90.m127k(sSLSocketFactory, "sslSocketFactory");
        a90.m127k(socket, "socket");
        a90.m127k(c0326il, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        String[] strArr = c0326il.f3597b;
        String[] strArr2 = strArr != null ? (String[]) ah1.m213a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) ah1.m213a(c0326il.f3598c, sSLSocket.getEnabledProtocols());
        C0290hl c0290hl = new C0290hl(c0326il);
        if (!c0290hl.f3253a) {
            C0270h1.m2191g("no cipher suites for cleartext connections");
            return null;
        }
        if (strArr2 == null) {
            c0290hl.f3255c = null;
        } else {
            c0290hl.f3255c = (String[]) strArr2.clone();
        }
        if (!c0290hl.f3253a) {
            C0270h1.m2191g("no TLS versions for cleartext connections");
            return null;
        }
        if (strArr3 == null) {
            c0290hl.f3256d = null;
        } else {
            c0290hl.f3256d = (String[]) strArr3.clone();
        }
        C0326il c0326il2 = new C0326il(c0290hl);
        sSLSocket.setEnabledProtocols(c0326il2.f3598c);
        String[] strArr4 = c0326il2.f3597b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        rt0 rt0Var = rt0.f6959c;
        boolean z = c0326il.f3599d;
        List list = f7906a;
        String strMo4141d = rt0Var.mo4141d(sSLSocket, str, z ? list : null);
        if (strMo4141d.equals("http/1.0")) {
            ky0Var = ky0.f4591k;
        } else if (strMo4141d.equals("http/1.1")) {
            ky0Var = ky0.f4592l;
        } else if (strMo4141d.equals("h2")) {
            ky0Var = ky0.f4594n;
        } else {
            if (!strMo4141d.equals("spdy/3.1")) {
                C0270h1.m2187c("Unexpected protocol: ".concat(strMo4141d));
                return null;
            }
            ky0Var = ky0.f4593m;
        }
        a90.m131o(strMo4141d, "Only " + list + " are supported, but negotiated protocol is %s", list.contains(ky0Var));
        if (gt0.f2869a.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
