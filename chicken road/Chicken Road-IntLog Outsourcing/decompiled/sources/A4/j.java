package A4;

import java.util.Iterator;
import t4.InterfaceC1441l;
import u4.InterfaceC1481a;

/* loaded from: classes.dex */
public final class j implements Iterator, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f101b;

    public j(e eVar) {
        this.f101b = eVar;
        this.f100a = eVar.f94b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f100a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((InterfaceC1441l) this.f101b.f95c).invoke(this.f100a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
