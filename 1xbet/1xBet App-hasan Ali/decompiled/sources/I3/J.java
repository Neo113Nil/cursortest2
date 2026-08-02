package I3;

import java.net.InetAddress;

/* loaded from: classes.dex */
public class J extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() != 9) {
            return InetAddress.getByName(aVar.I());
        }
        aVar.G();
        return null;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        bVar.E(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
