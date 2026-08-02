package I3;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Z extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        try {
            return new AtomicInteger(aVar.v());
        } catch (NumberFormatException e3) {
            throw new F3.p(e3);
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        bVar.v(((AtomicInteger) obj).get());
    }
}
