package I3;

import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public class I extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        try {
            String I5 = aVar.I();
            if (I5.equals("null")) {
                return null;
            }
            return new URI(I5);
        } catch (URISyntaxException e3) {
            throw new F3.p(e3);
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        URI uri = (URI) obj;
        bVar.E(uri == null ? null : uri.toASCIIString());
    }
}
