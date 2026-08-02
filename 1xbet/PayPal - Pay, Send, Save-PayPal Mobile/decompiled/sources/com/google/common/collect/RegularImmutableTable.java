package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class RegularImmutableTable<R, C, V> extends com.google.common.collect.ImmutableTable<R, C, V> {
    abstract com.google.common.collect.Table.Cell<R, C, V> getCell(int i);

    abstract V getValue(int i);

    @Override // com.google.common.collect.ImmutableTable
    abstract java.lang.Object writeReplace();

    RegularImmutableTable() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> createCellSet() {
        return isEmpty() ? com.google.common.collect.ImmutableSet.of() : new com.google.common.collect.RegularImmutableTable.CellSet();
    }

    final class CellSet extends com.google.common.collect.IndexedImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> {
        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return false;
        }

        private CellSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.google.common.collect.RegularImmutableTable.this.size();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet
        public final com.google.common.collect.Table.Cell<R, C, V> get(int i) {
            return com.google.common.collect.RegularImmutableTable.this.getCell(i);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.collect.Table.Cell)) {
                return false;
            }
            com.google.common.collect.Table.Cell cell = (com.google.common.collect.Table.Cell) obj;
            java.lang.Object obj2 = com.google.common.collect.RegularImmutableTable.this.get(cell.getRowKey(), cell.getColumnKey());
            return obj2 != null && obj2.equals(cell.getValue());
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final com.google.common.collect.ImmutableCollection<V> createValues() {
        return isEmpty() ? com.google.common.collect.ImmutableList.of() : new com.google.common.collect.RegularImmutableTable.Values();
    }

    final class Values extends com.google.common.collect.ImmutableList<V> {
        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return true;
        }

        private Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return com.google.common.collect.RegularImmutableTable.this.size();
        }

        @Override // java.util.List
        public final V get(int i) {
            return (V) com.google.common.collect.RegularImmutableTable.this.getValue(i);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forCells(java.util.List<com.google.common.collect.Table.Cell<R, C, V>> list, final java.util.Comparator<? super R> comparator, final java.util.Comparator<? super C> comparator2) {
        com.google.common.base.Preconditions.checkNotNull(list);
        if (comparator != null || comparator2 != null) {
            java.util.Collections.sort(list, new java.util.Comparator() { // from class: com.google.common.collect.RegularImmutableTable$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return com.google.common.collect.RegularImmutableTable.lambda$forCells$0(comparator, comparator2, (com.google.common.collect.Table.Cell) obj, (com.google.common.collect.Table.Cell) obj2);
                }
            });
        }
        return forCellsInternal(list, comparator, comparator2);
    }

    static /* synthetic */ int lambda$forCells$0(java.util.Comparator comparator, java.util.Comparator comparator2, com.google.common.collect.Table.Cell cell, com.google.common.collect.Table.Cell cell2) {
        int compare = comparator == null ? 0 : comparator.compare(cell.getRowKey(), cell2.getRowKey());
        if (compare != 0) {
            return compare;
        }
        if (comparator2 == null) {
            return 0;
        }
        return comparator2.compare(cell.getColumnKey(), cell2.getColumnKey());
    }

    static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forCells(java.lang.Iterable<com.google.common.collect.Table.Cell<R, C, V>> iterable) {
        return forCellsInternal(iterable, null, null);
    }

    private static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forCellsInternal(java.lang.Iterable<com.google.common.collect.Table.Cell<R, C, V>> iterable, java.util.Comparator<? super R> comparator, java.util.Comparator<? super C> comparator2) {
        com.google.common.collect.ImmutableSet copyOf;
        com.google.common.collect.ImmutableSet copyOf2;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        com.google.common.collect.ImmutableList copyOf3 = com.google.common.collect.ImmutableList.copyOf(iterable);
        for (com.google.common.collect.Table.Cell<R, C, V> cell : iterable) {
            linkedHashSet.add(cell.getRowKey());
            linkedHashSet2.add(cell.getColumnKey());
        }
        if (comparator == null) {
            copyOf = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) linkedHashSet);
        } else {
            copyOf = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) com.google.common.collect.ImmutableList.sortedCopyOf(comparator, linkedHashSet));
        }
        if (comparator2 == null) {
            copyOf2 = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) linkedHashSet2);
        } else {
            copyOf2 = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) com.google.common.collect.ImmutableList.sortedCopyOf(comparator2, linkedHashSet2));
        }
        return forOrderedComponents(copyOf3, copyOf, copyOf2);
    }

    static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forOrderedComponents(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R, C, V>> immutableList, com.google.common.collect.ImmutableSet<R> immutableSet, com.google.common.collect.ImmutableSet<C> immutableSet2) {
        if (immutableList.size() > (immutableSet.size() * immutableSet2.size()) / 2) {
            return new com.google.common.collect.DenseImmutableTable(immutableList, immutableSet, immutableSet2);
        }
        return new com.google.common.collect.SparseImmutableTable(immutableList, immutableSet, immutableSet2);
    }

    final void checkNoDuplicate(R r, C c, V v, V v2) {
        com.google.common.base.Preconditions.checkArgument(v == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", r, c, v2, v);
    }
}
