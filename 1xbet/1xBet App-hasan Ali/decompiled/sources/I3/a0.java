package I3;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a0 extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        return new AtomicBoolean(aVar.s());
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        bVar.F(((AtomicBoolean) obj).get());
    }
}
