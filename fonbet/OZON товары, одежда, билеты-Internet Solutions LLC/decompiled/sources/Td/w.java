package Td;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class w extends AbstractList<String> implements RandomAccess, n {

    /* renamed from: a, reason: collision with root package name */
    private final m f27131a;

    /* loaded from: classes10.dex */
    final class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        ListIterator<String> f27132a;

        a(w wVar, int i11) {
            this.f27132a = ((AbstractList) wVar.f27131a).listIterator(i11);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f27132a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f27132a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f27132a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f27132a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f27132a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f27132a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes10.dex */
    final class b implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        Iterator<String> f27133a;

        b(w wVar) {
            this.f27133a = ((AbstractList) wVar.f27131a).iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27133a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f27133a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public w(m mVar) {
        this.f27131a = mVar;
    }

    @Override // Td.n
    public final void L0(c cVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return (String) this.f27131a.get(i11);
    }

    @Override // Td.n
    public final c getByteString(int i11) {
        return this.f27131a.getByteString(i11);
    }

    @Override // Td.n
    public final List<?> getUnderlyingElements() {
        return this.f27131a.getUnderlyingElements();
    }

    @Override // Td.n
    public final w getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i11) {
        return new a(this, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27131a.size();
    }
}
