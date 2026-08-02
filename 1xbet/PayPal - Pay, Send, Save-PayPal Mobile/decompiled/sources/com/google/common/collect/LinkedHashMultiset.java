package com.google.common.collect;

/* loaded from: classes9.dex */
public final class LinkedHashMultiset<E> extends com.google.common.collect.AbstractMapBasedMultiset<E> {
    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ boolean contains(java.lang.Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public static <E> com.google.common.collect.LinkedHashMultiset<E> create() {
        return create(3);
    }

    public static <E> com.google.common.collect.LinkedHashMultiset<E> create(int i) {
        return new com.google.common.collect.LinkedHashMultiset<>(i);
    }

    public static <E> com.google.common.collect.LinkedHashMultiset<E> create(java.lang.Iterable<? extends E> iterable) {
        com.google.common.collect.LinkedHashMultiset<E> create = create(com.google.common.collect.Multisets.inferDistinctElements(iterable));
        com.google.common.collect.Iterables.addAll(create, iterable);
        return create;
    }

    LinkedHashMultiset(int i) {
        super(i);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    final com.google.common.collect.ObjectCountHashMap<E> newBackingMap(int i) {
        return new com.google.common.collect.ObjectCountLinkedHashMap(i);
    }
}
