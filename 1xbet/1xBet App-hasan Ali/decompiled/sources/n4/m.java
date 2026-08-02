package n4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Iterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final Iterator f18492k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f18493l;

    public m(l lVar) {
        this.f18493l = lVar;
        this.f18492k = lVar.f18490b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18492k.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.f18493l.f18491c.c(this.f18492k.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
