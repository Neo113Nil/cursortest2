package x1;

/* loaded from: classes.dex */
public final class a implements x1.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f8415a;

    public a(i1.C0197p c0197p) {
        this.f8415a = new java.util.concurrent.atomic.AtomicReference(c0197p);
    }

    @Override // x1.c
    public final java.util.Iterator iterator() {
        x1.c cVar = (x1.c) this.f8415a.getAndSet(null);
        if (cVar != null) {
            return cVar.iterator();
        }
        throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
    }
}
