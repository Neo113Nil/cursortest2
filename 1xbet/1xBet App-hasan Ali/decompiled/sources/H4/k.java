package H4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2379a = new j();

    @Override // H4.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // H4.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // H4.n
    public final boolean c() {
        boolean z3 = G4.h.f1999d;
        return G4.h.f1999d;
    }

    @Override // H4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            G4.n nVar = G4.n.f2016a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) j3.i.e(list).toArray(new String[0]));
        }
    }
}
