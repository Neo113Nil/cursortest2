package com.google.common.collect;

/* loaded from: classes4.dex */
final class RegularImmutableList<E> extends com.google.common.collect.ImmutableList<E> {
    static final com.google.common.collect.ImmutableList<java.lang.Object> EMPTY = new com.google.common.collect.RegularImmutableList(new java.lang.Object[0], 0);
    final transient java.lang.Object[] array;
    private final transient int size;

    @Override // com.google.common.collect.ImmutableCollection
    final int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return false;
    }

    RegularImmutableList(java.lang.Object[] objArr, int i) {
        this.array = objArr;
        this.size = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final java.lang.Object[] internalArray() {
        return this.array;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int internalArrayEnd() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    final int copyIntoArray(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.array, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // java.util.List
    public final E get(int i) {
        com.google.common.base.Preconditions.checkElementIndex(i, this.size);
        return (E) java.util.Objects.requireNonNull(this.array[i]);
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
