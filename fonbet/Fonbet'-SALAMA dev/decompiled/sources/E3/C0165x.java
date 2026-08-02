package E3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: E3.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0165x extends a0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f2077a;

    /* renamed from: b, reason: collision with root package name */
    public int f2078b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0167z f2079c;

    public C0165x(AbstractC0167z abstractC0167z, int i7) {
        int size = abstractC0167z.size();
        p3.f.n(i7, size);
        this.f2077a = size;
        this.f2078b = i7;
        this.f2079c = abstractC0167z;
    }

    public final Object a(int i7) {
        return this.f2079c.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2078b < this.f2077a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2078b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f2078b;
        this.f2078b = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2078b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f2078b - 1;
        this.f2078b = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2078b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
