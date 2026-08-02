package I3;

import a3.AbstractC0467k;
import java.util.UUID;

/* loaded from: classes.dex */
public class K extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        String I5 = aVar.I();
        try {
            return UUID.fromString(I5);
        } catch (IllegalArgumentException e3) {
            StringBuilder w5 = AbstractC0467k.w("Failed parsing '", I5, "' as UUID; at path ");
            w5.append(aVar.m(true));
            throw new F3.p(w5.toString(), e3);
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        UUID uuid = (UUID) obj;
        bVar.E(uuid == null ? null : uuid.toString());
    }
}
