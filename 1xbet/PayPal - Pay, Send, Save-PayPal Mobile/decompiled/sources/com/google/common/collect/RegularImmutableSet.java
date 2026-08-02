package com.google.common.collect;

/* loaded from: classes4.dex */
final class RegularImmutableSet<E> extends com.google.common.collect.ImmutableSet<E> {
    static final com.google.common.collect.RegularImmutableSet<java.lang.Object> EMPTY;
    private static final java.lang.Object[] EMPTY_ARRAY;
    final transient java.lang.Object[] elements;
    private final transient int hashCode;
    private final transient int mask;
    private final transient int size;
    final transient java.lang.Object[] table;

    @Override // com.google.common.collect.ImmutableCollection
    final int internalArrayStart() {
        return 0;
    }

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

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY = new com.google.common.collect.RegularImmutableSet<>(objArr, 0, objArr, 0, 0);
    }

    RegularImmutableSet(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2, int i2, int i3) {
        this.elements = objArr;
        this.hashCode = i;
        this.table = objArr2;
        this.mask = i2;
        this.size = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.lang.Object[] objArr = this.table;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int smearedHash = com.google.common.collect.Hashing.smearedHash(obj);
        while (true) {
            int i = smearedHash & this.mask;
            java.lang.Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            smearedHash = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    final java.lang.Object[] internalArray() {
        return this.elements;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int internalArrayEnd() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int copyIntoArray(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.elements, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // com.google.common.collect.ImmutableSet
    final com.google.common.collect.ImmutableList<E> createAsList() {
        return com.google.common.collect.ImmutableList.asImmutableList(this.elements, this.size);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.hashCode;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
