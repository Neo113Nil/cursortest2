package H4;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements l {
    @Override // H4.l
    public final boolean a(SSLSocket sSLSocket) {
        return G4.h.f1999d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // H4.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
