package com.google.common.collect;

/* loaded from: classes9.dex */
final class RegularImmutableMultiset<E> extends com.google.common.collect.ImmutableMultiset<E> {
    static final com.google.common.collect.RegularImmutableMultiset<java.lang.Object> EMPTY = new com.google.common.collect.RegularImmutableMultiset<>(com.google.common.collect.ObjectCountHashMap.create());
    final transient com.google.common.collect.ObjectCountHashMap<E> contents;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<E> elementSet;
    private final transient int size;

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.Set elementSet() {
        return elementSet();
    }

    RegularImmutableMultiset(com.google.common.collect.ObjectCountHashMap<E> objectCountHashMap) {
        this.contents = objectCountHashMap;
        long j = 0;
        for (int i = 0; i < objectCountHashMap.size(); i++) {
            j += objectCountHashMap.getValue(i);
        }
        this.size = com.google.common.primitives.Ints.saturatedCast(j);
    }

    @Override // com.google.common.collect.Multiset
    public final int count(java.lang.Object obj) {
        return this.contents.get(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final com.google.common.collect.ImmutableSet<E> elementSet() {
        com.google.common.collect.ImmutableSet<E> immutableSet = this.elementSet;
        if (immutableSet != null) {
            return immutableSet;
        }
        com.google.common.collect.RegularImmutableMultiset.ElementSet elementSet = new com.google.common.collect.RegularImmutableMultiset.ElementSet();
        this.elementSet = elementSet;
        return elementSet;
    }

    final class ElementSet extends com.google.common.collect.IndexedImmutableSet<E> {
        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return true;
        }

        private ElementSet() {
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        final E get(int i) {
            return com.google.common.collect.RegularImmutableMultiset.this.contents.getKey(i);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.collect.RegularImmutableMultiset.this.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.google.common.collect.RegularImmutableMultiset.this.contents.size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableMultiset
    final com.google.common.collect.Multiset.Entry<E> getEntry(int i) {
        return this.contents.getEntry(i);
    }

    static class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final java.lang.Object[] elements;

        SerializedForm(com.google.common.collect.Multiset<? extends java.lang.Object> multiset) {
            int size = multiset.entrySet().size();
            this.elements = new java.lang.Object[size];
            this.counts = new int[size];
            int i = 0;
            for (com.google.common.collect.Multiset.Entry<? extends java.lang.Object> entry : multiset.entrySet()) {
                this.elements[i] = entry.getElement();
                this.counts[i] = entry.getCount();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        java.lang.Object readResolve() {
            com.google.common.collect.ImmutableMultiset.Builder builder = new com.google.common.collect.ImmutableMultiset.Builder(this.elements.length);
            int i = 0;
            while (true) {
                java.lang.Object[] objArr = this.elements;
                if (i < objArr.length) {
                    builder.addCopies(objArr[i], this.counts[i]);
                    i++;
                } else {
                    return builder.build();
                }
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return new com.google.common.collect.RegularImmutableMultiset.SerializedForm(this);
    }
}
