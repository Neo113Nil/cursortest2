package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
abstract class RegularImmutableTable<R, C, V> extends com.google.common.collect.ImmutableTable<R, C, V> {
    abstract com.google.common.collect.Table.Cell<R, C, V> getCell(int iterationIndex);

    abstract V getValue(int iterationIndex);

    @Override // com.google.common.collect.ImmutableTable
    abstract java.lang.Object writeReplace();

    RegularImmutableTable() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> createCellSet() {
        return isEmpty() ? com.google.common.collect.ImmutableSet.of() : new com.google.common.collect.RegularImmutableTable.CellSet();
    }

    private final class CellSet extends com.google.common.collect.IndexedImmutableSet<com.google.common.collect.Table.Cell<R, C, V>> {
        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return false;
        }

        private CellSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.collect.RegularImmutableTable.this.size();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet
        public com.google.common.collect.Table.Cell<R, C, V> get(int index) {
            return com.google.common.collect.RegularImmutableTable.this.getCell(index);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof com.google.common.collect.Table.Cell)) {
                return false;
            }
            com.google.common.collect.Table.Cell cell = (com.google.common.collect.Table.Cell) object;
            java.lang.Object obj = com.google.common.collect.RegularImmutableTable.this.get(cell.getRowKey(), cell.getColumnKey());
            return obj != null && obj.equals(cell.getValue());
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public final com.google.common.collect.ImmutableCollection<V> createValues() {
        return isEmpty() ? com.google.common.collect.ImmutableList.of() : new com.google.common.collect.RegularImmutableTable.Values();
    }

    private final class Values extends com.google.common.collect.ImmutableList<V> {
        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        private Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.collect.RegularImmutableTable.this.size();
        }

        @Override // java.util.List
        public V get(int i) {
            return (V) com.google.common.collect.RegularImmutableTable.this.getValue(i);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forCells(java.util.List<com.google.common.collect.Table.Cell<R, C, V>> cells, @javax.annotation.CheckForNull final java.util.Comparator<? super R> rowComparator, @javax.annotation.CheckForNull final java.util.Comparator<? super C> columnComparator) {
        com.google.common.base.Preconditions.checkNotNull(cells);
        if (rowComparator != null || columnComparator != null) {
            java.util.Collections.sort(cells, new java.util.Comparator() { // from class: com.google.common.collect.RegularImmutableTable$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return com.google.common.collect.RegularImmutableTable.lambda$forCells$0(rowComparator, columnComparator, (com.google.common.collect.Table.Cell) obj, (com.google.common.collect.Table.Cell) obj2);
                }
            });
        }
        return forCellsInternal(cells, rowComparator, columnComparator);
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

    static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forCells(java.lang.Iterable<com.google.common.collect.Table.Cell<R, C, V>> cells) {
        return forCellsInternal(cells, null, null);
    }

    private static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forCellsInternal(java.lang.Iterable<com.google.common.collect.Table.Cell<R, C, V>> cells, @javax.annotation.CheckForNull java.util.Comparator<? super R> rowComparator, @javax.annotation.CheckForNull java.util.Comparator<? super C> columnComparator) {
        com.google.common.collect.ImmutableSet copyOf;
        com.google.common.collect.ImmutableSet copyOf2;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        com.google.common.collect.ImmutableList copyOf3 = com.google.common.collect.ImmutableList.copyOf(cells);
        for (com.google.common.collect.Table.Cell<R, C, V> cell : cells) {
            linkedHashSet.add(cell.getRowKey());
            linkedHashSet2.add(cell.getColumnKey());
        }
        if (rowComparator == null) {
            copyOf = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) linkedHashSet);
        } else {
            copyOf = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) com.google.common.collect.ImmutableList.sortedCopyOf(rowComparator, linkedHashSet));
        }
        if (columnComparator == null) {
            copyOf2 = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) linkedHashSet2);
        } else {
            copyOf2 = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) com.google.common.collect.ImmutableList.sortedCopyOf(columnComparator, linkedHashSet2));
        }
        return forOrderedComponents(copyOf3, copyOf, copyOf2);
    }

    static <R, C, V> com.google.common.collect.RegularImmutableTable<R, C, V> forOrderedComponents(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R, C, V>> cellList, com.google.common.collect.ImmutableSet<R> rowSpace, com.google.common.collect.ImmutableSet<C> columnSpace) {
        if (cellList.size() > (rowSpace.size() * columnSpace.size()) / 2) {
            return new com.google.common.collect.DenseImmutableTable(cellList, rowSpace, columnSpace);
        }
        return new com.google.common.collect.SparseImmutableTable(cellList, rowSpace, columnSpace);
    }

    final void checkNoDuplicate(R rowKey, C columnKey, @javax.annotation.CheckForNull V existingValue, V newValue) {
        com.google.common.base.Preconditions.checkArgument(existingValue == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", rowKey, columnKey, newValue, existingValue);
    }
}
