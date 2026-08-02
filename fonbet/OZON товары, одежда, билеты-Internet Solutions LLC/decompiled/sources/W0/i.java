package W0;

import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public final class i<E> extends a<E> {

    /* renamed from: c, reason: collision with root package name */
    private final E f33184c;

    public i(E e11, int i11) {
        super(i11, 1);
        this.f33184c = e11;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        e(b() + 1);
        return this.f33184c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        e(b() - 1);
        return this.f33184c;
    }
}
