package p050g6;

import W5.AbstractC0486a1;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f13297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i7) {
        super(dVar);
        this.f13297d = dVar;
        int iL = dVar.l();
        if (i7 < 0 || i7 > iL) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, iL, "index: ", ", size: "));
        }
        this.f13295b = i7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13295b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13295b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f13295b - 1;
        this.f13295b = i7;
        return this.f13297d.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13295b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
