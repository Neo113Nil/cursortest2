package Z0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f536a;

    public a(e eVar) {
        this.f536a = new AtomicReference(eVar);
    }

    @Override // Z0.b
    public final Iterator iterator() {
        b bVar = (b) this.f536a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
