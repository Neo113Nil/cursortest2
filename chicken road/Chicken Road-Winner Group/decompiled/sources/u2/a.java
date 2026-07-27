package u2;

import e2.C0291f;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f10377a;

    public a(C0291f c0291f) {
        this.f10377a = new AtomicReference(c0291f);
    }

    @Override // u2.e
    public final Iterator iterator() {
        e eVar = (e) this.f10377a.getAndSet(null);
        if (eVar != null) {
            return eVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
