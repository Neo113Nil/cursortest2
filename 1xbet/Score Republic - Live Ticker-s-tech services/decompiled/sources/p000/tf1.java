package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tf1 implements ListIterator {

    /* JADX INFO: renamed from: j */
    public ListIterator f7445j;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f7445j.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7445j.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f7445j.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7445j.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f7445j.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7445j.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
