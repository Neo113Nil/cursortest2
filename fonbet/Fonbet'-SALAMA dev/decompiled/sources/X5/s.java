package X5;

import G4.A;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final List f7623a = Collections.unmodifiableList(Arrays.asList(Y5.k.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i7, Y5.b bVar) {
        Y5.k kVar;
        p3.f.k(sSLSocketFactory, "sslSocketFactory");
        p3.f.k(socket, "socket");
        p3.f.k(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i7, true);
        String[] strArr = bVar.f7773b;
        String[] strArr2 = strArr != null ? (String[]) Y5.m.a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) Y5.m.a(bVar.f7774c, sSLSocket.getEnabledProtocols());
        A a2 = new A(bVar);
        if (!a2.f2871a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr2 == null) {
            a2.f2873c = null;
        } else {
            a2.f2873c = (String[]) strArr2.clone();
        }
        if (!a2.f2871a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr3 == null) {
            a2.f2874d = null;
        } else {
            a2.f2874d = (String[]) strArr3.clone();
        }
        Y5.b bVar2 = new Y5.b(a2);
        sSLSocket.setEnabledProtocols(bVar2.f7774c);
        String[] strArr4 = bVar2.f7773b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        p pVar = p.f7620c;
        boolean z4 = bVar.f7775d;
        List list = f7623a;
        String d7 = pVar.d(sSLSocket, str, z4 ? list : null);
        if (d7.equals("http/1.0")) {
            kVar = Y5.k.HTTP_1_0;
        } else if (d7.equals("http/1.1")) {
            kVar = Y5.k.HTTP_1_1;
        } else if (d7.equals("h2")) {
            kVar = Y5.k.HTTP_2;
        } else {
            if (!d7.equals("spdy/3.1")) {
                throw new IOException("Unexpected protocol: ".concat(d7));
            }
            kVar = Y5.k.SPDY_3;
        }
        p3.f.s(list.contains(kVar), "Only " + list + " are supported, but negotiated protocol is %s", d7);
        if (Y5.d.f7783a.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
