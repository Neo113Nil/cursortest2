package u2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Iterator, p2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f10391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f10392b;

    public j(k kVar) {
        this.f10392b = kVar;
        this.f10391a = kVar.f10393a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10391a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f10392b.f10394b.invoke(this.f10391a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
