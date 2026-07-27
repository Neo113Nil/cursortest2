package A4;

import g4.AbstractC0466k;
import g4.C0474s;
import java.util.Iterator;
import u4.InterfaceC1481a;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f85b;

    /* renamed from: c, reason: collision with root package name */
    public int f86c;

    public b(Iterator iterator) {
        kotlin.jvm.internal.i.e(iterator, "iterator");
        this.f85b = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f84a) {
            case 0:
                break;
            default:
                return this.f85b.hasNext();
        }
        while (true) {
            int i2 = this.f86c;
            it = this.f85b;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f86c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f84a) {
            case 0:
                break;
            default:
                int i2 = this.f86c;
                this.f86c = i2 + 1;
                if (i2 >= 0) {
                    return new C0474s(i2, this.f85b.next());
                }
                AbstractC0466k.C0();
                throw null;
        }
        while (true) {
            int i3 = this.f86c;
            it = this.f85b;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f86c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f84a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f85b = cVar.f87a.iterator();
        this.f86c = cVar.f88b;
    }
}
