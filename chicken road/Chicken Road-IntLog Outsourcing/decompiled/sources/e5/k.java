package e5;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final i f5540a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f5541b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, j.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (j.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f5541b = z;
    }

    @Override // e5.n
    public final String a(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // e5.n
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // e5.n
    public final boolean c() {
        return f5541b;
    }

    @Override // e5.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            d5.e eVar = d5.e.f5492a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) W1.e.k(protocols).toArray(new String[0]));
        }
    }
}
