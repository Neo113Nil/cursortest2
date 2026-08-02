package com.google.common.collect;

/* loaded from: classes9.dex */
class RegularImmutableAsList<E> extends com.google.common.collect.ImmutableAsList<E> {
    private final com.google.common.collect.ImmutableCollection<E> delegate;
    private final com.google.common.collect.ImmutableList<? extends E> delegateList;

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int i) {
        return listIterator(i);
    }

    RegularImmutableAsList(com.google.common.collect.ImmutableCollection<E> immutableCollection, com.google.common.collect.ImmutableList<? extends E> immutableList) {
        this.delegate = immutableCollection;
        this.delegateList = immutableList;
    }

    RegularImmutableAsList(com.google.common.collect.ImmutableCollection<E> immutableCollection, java.lang.Object[] objArr) {
        this(immutableCollection, com.google.common.collect.ImmutableList.asImmutableList(objArr));
    }

    RegularImmutableAsList(com.google.common.collect.ImmutableCollection<E> immutableCollection, java.lang.Object[] objArr, int i) {
        this(immutableCollection, com.google.common.collect.ImmutableList.asImmutableList(objArr, i));
    }

    @Override // com.google.common.collect.ImmutableAsList
    com.google.common.collect.ImmutableCollection<E> delegateCollection() {
        return this.delegate;
    }

    com.google.common.collect.ImmutableList<? extends E> delegateList() {
        return this.delegateList;
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator(int i) {
        return this.delegateList.listIterator(i);
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] objArr, int i) {
        return this.delegateList.copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    java.lang.Object[] internalArray() {
        return this.delegateList.internalArray();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayStart() {
        return this.delegateList.internalArrayStart();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayEnd() {
        return this.delegateList.internalArrayEnd();
    }

    @Override // java.util.List
    public E get(int i) {
        return this.delegateList.get(i);
    }

    @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
