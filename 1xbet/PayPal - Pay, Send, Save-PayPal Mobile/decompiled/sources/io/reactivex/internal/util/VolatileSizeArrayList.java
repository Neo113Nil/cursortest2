package io.reactivex.internal.util;

/* loaded from: classes17.dex */
public final class VolatileSizeArrayList<T> extends java.util.concurrent.atomic.AtomicInteger implements java.util.List<T>, java.util.RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;
    final java.util.ArrayList<T> getHighResolutionOutputSizeshNQ4ISI;

    public VolatileSizeArrayList() {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
    }

    public VolatileSizeArrayList(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return get();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.getHighResolutionOutputSizeshNQ4ISI.contains(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return this.getHighResolutionOutputSizeshNQ4ISI.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final <E> E[] toArray(E[] eArr) {
        return (E[]) this.getHighResolutionOutputSizeshNQ4ISI.toArray(eArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        boolean add = this.getHighResolutionOutputSizeshNQ4ISI.add(t);
        lazySet(this.getHighResolutionOutputSizeshNQ4ISI.size());
        return add;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        boolean remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(obj);
        lazySet(this.getHighResolutionOutputSizeshNQ4ISI.size());
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> collection) {
        return this.getHighResolutionOutputSizeshNQ4ISI.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends T> collection) {
        boolean addAll = this.getHighResolutionOutputSizeshNQ4ISI.addAll(collection);
        lazySet(this.getHighResolutionOutputSizeshNQ4ISI.size());
        return addAll;
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends T> collection) {
        boolean addAll = this.getHighResolutionOutputSizeshNQ4ISI.addAll(i, collection);
        lazySet(this.getHighResolutionOutputSizeshNQ4ISI.size());
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        boolean removeAll = this.getHighResolutionOutputSizeshNQ4ISI.removeAll(collection);
        lazySet(this.getHighResolutionOutputSizeshNQ4ISI.size());
        return removeAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        boolean retainAll = this.getHighResolutionOutputSizeshNQ4ISI.retainAll(collection);
        lazySet(this.getHighResolutionOutputSizeshNQ4ISI.size());
        return retainAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        lazySet(0);
    }

    @Override // java.util.List
    public final T get(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        return this.getHighResolutionOutputSizeshNQ4ISI.set(i, t);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(i, t);
        lazySet(this.getHighResolutionOutputSizeshNQ4ISI.size());
    }

    @Override // java.util.List
    public final T remove(int i) {
        T remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(i);
        lazySet(this.getHighResolutionOutputSizeshNQ4ISI.size());
        return remove;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return this.getHighResolutionOutputSizeshNQ4ISI.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        return this.getHighResolutionOutputSizeshNQ4ISI.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator<T> listIterator() {
        return this.getHighResolutionOutputSizeshNQ4ISI.listIterator();
    }

    @Override // java.util.List
    public final java.util.ListIterator<T> listIterator(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.listIterator(i);
    }

    @Override // java.util.List
    public final java.util.List<T> subList(int i, int i2) {
        return this.getHighResolutionOutputSizeshNQ4ISI.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof io.reactivex.internal.util.VolatileSizeArrayList) {
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(((io.reactivex.internal.util.VolatileSizeArrayList) obj).getHighResolutionOutputSizeshNQ4ISI);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toString();
    }
}
