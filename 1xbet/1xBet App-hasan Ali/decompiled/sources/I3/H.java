package I3;

import java.net.URL;

/* loaded from: classes.dex */
public class H extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        String I5 = aVar.I();
        if (I5.equals("null")) {
            return null;
        }
        return new URL(I5);
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        URL url = (URL) obj;
        bVar.E(url == null ? null : url.toExternalForm());
    }
}
