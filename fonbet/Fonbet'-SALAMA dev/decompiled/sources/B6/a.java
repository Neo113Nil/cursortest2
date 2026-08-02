package B6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1202a;

    public a(b bVar) {
        this.f1202a = new AtomicReference(bVar);
    }

    @Override // B6.b
    public final Iterator iterator() {
        b bVar = (b) this.f1202a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
