package s4;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class N extends t4.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f19249a = new AtomicReference(null);

    @Override // t4.d
    public final boolean a(t4.b bVar) {
        AtomicReference atomicReference = this.f19249a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(C.f19223b);
        return true;
    }

    @Override // t4.d
    public final a4.c[] b(t4.b bVar) {
        this.f19249a.set(null);
        return t4.c.f19595a;
    }
}
