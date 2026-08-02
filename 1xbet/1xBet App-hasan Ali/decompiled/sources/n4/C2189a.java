package n4;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2189a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f18473a;

    public C2189a(g gVar) {
        this.f18473a = new AtomicReference(gVar);
    }

    @Override // n4.g
    public final Iterator iterator() {
        g gVar = (g) this.f18473a.getAndSet(null);
        if (gVar != null) {
            return gVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
