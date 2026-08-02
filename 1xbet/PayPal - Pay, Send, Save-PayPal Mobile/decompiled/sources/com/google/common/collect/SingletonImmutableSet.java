package com.google.common.collect;

/* loaded from: classes4.dex */
final class SingletonImmutableSet<E> extends com.google.common.collect.ImmutableSet<E> {
    final transient E element;

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    SingletonImmutableSet(E e) {
        this.element = (E) com.google.common.base.Preconditions.checkNotNull(e);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.element.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return com.google.common.collect.Iterators.singletonIterator(this.element);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final com.google.common.collect.ImmutableList<E> asList() {
        return com.google.common.collect.ImmutableList.of((java.lang.Object) this.element);
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int copyIntoArray(java.lang.Object[] objArr, int i) {
        objArr[i] = this.element;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.element.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        sb.append(this.element.toString());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
