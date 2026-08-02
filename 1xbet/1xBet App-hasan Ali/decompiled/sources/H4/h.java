package H4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2375a = new g();

    @Override // H4.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // H4.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // H4.n
    public final boolean c() {
        boolean z3 = G4.e.f1996d;
        return G4.e.f1996d;
    }

    @Override // H4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            G4.n nVar = G4.n.f2016a;
            parameters.setApplicationProtocols((String[]) j3.i.e(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
