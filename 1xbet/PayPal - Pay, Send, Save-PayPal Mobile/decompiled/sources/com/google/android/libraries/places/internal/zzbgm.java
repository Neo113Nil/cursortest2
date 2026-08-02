package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbgm implements java.util.List, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.List zza;

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.zza, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.libraries.places.internal.zzbgn(this.zza.iterator());
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new com.google.android.libraries.places.internal.zzbgo(this.zza.listIterator());
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.zza.size();
    }

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new com.google.android.libraries.places.internal.zzbgo(this.zza.listIterator(i));
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        return kotlin.jvm.internal.CollectionToArray.toArray(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        return this.zza.subList(i, i2);
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        return this.zza.lastIndexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return this.zza.indexOf(obj);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        return this.zza.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return this.zza.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public zzbgm(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
    }
}
