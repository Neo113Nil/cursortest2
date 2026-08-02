package com.google.common.collect;

/* loaded from: classes9.dex */
final class ImmutableEnumSet<E extends java.lang.Enum<E>> extends com.google.common.collect.ImmutableSet<E> {
    private final transient java.util.EnumSet<E> delegate;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient int hashCode;

    @Override // com.google.common.collect.ImmutableSet
    final boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    static <E extends java.lang.Enum<E>> com.google.common.collect.ImmutableSet<E> asImmutable(java.util.EnumSet<E> enumSet) {
        int size = enumSet.size();
        if (size == 0) {
            return com.google.common.collect.ImmutableSet.of();
        }
        if (size == 1) {
            return com.google.common.collect.ImmutableSet.of((java.lang.Enum) com.google.common.collect.Iterables.getOnlyElement(enumSet));
        }
        return new com.google.common.collect.ImmutableEnumSet(enumSet);
    }

    private ImmutableEnumSet(java.util.EnumSet<E> enumSet) {
        this.delegate = enumSet;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return com.google.common.collect.Iterators.unmodifiableIterator(this.delegate.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.delegate.size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.delegate.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection<?> collection) {
        if (collection instanceof com.google.common.collect.ImmutableEnumSet) {
            collection = ((com.google.common.collect.ImmutableEnumSet) collection).delegate;
        }
        return this.delegate.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.common.collect.ImmutableEnumSet) {
            obj = ((com.google.common.collect.ImmutableEnumSet) obj).delegate;
        }
        return this.delegate.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.delegate.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return this.delegate.toString();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableEnumSet.EnumSerializedForm(this.delegate);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    static final class EnumSerializedForm<E extends java.lang.Enum<E>> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.EnumSet<E> delegate;

        EnumSerializedForm(java.util.EnumSet<E> enumSet) {
            this.delegate = enumSet;
        }

        final java.lang.Object readResolve() {
            return new com.google.common.collect.ImmutableEnumSet(this.delegate.clone());
        }
    }
}
