package com.google.common.collect;

/* loaded from: classes9.dex */
final class TableCollectors {
    static <T, R, C, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> toImmutableTable(final java.util.function.Function<? super T, ? extends R> function, final java.util.function.Function<? super T, ? extends C> function2, final java.util.function.Function<? super T, ? extends V> function3) {
        com.google.common.base.Preconditions.checkNotNull(function, "rowFunction");
        com.google.common.base.Preconditions.checkNotNull(function2, "columnFunction");
        com.google.common.base.Preconditions.checkNotNull(function3, "valueFunction");
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda8
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return new com.google.common.collect.ImmutableTable.Builder();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda9
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.ImmutableTable.Builder) obj).put(function.apply(obj2), function2.apply(obj2), function3.apply(obj2));
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda10
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.ImmutableTable.Builder) obj).combine((com.google.common.collect.ImmutableTable.Builder) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.ImmutableTable.Builder) obj).buildOrThrow();
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static <T, R, C, V> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableTable<R, C, V>> toImmutableTable(final java.util.function.Function<? super T, ? extends R> function, final java.util.function.Function<? super T, ? extends C> function2, final java.util.function.Function<? super T, ? extends V> function3, final java.util.function.BinaryOperator<V> binaryOperator) {
        com.google.common.base.Preconditions.checkNotNull(function, "rowFunction");
        com.google.common.base.Preconditions.checkNotNull(function2, "columnFunction");
        com.google.common.base.Preconditions.checkNotNull(function3, "valueFunction");
        com.google.common.base.Preconditions.checkNotNull(binaryOperator, "mergeFunction");
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda4
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.google.common.collect.TableCollectors.lambda$toImmutableTable$1();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda5
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.common.collect.TableCollectors.ImmutableTableCollectorState immutableTableCollectorState = (com.google.common.collect.TableCollectors.ImmutableTableCollectorState) obj;
                immutableTableCollectorState.put(function.apply(obj2), function2.apply(obj2), function3.apply(obj2), binaryOperator);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda6
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                com.google.common.collect.TableCollectors.ImmutableTableCollectorState combine;
                combine = ((com.google.common.collect.TableCollectors.ImmutableTableCollectorState) obj).combine((com.google.common.collect.TableCollectors.ImmutableTableCollectorState) obj2, binaryOperator);
                return combine;
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.common.collect.ImmutableTable table;
                table = ((com.google.common.collect.TableCollectors.ImmutableTableCollectorState) obj).toTable();
                return table;
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ com.google.common.collect.TableCollectors.ImmutableTableCollectorState lambda$toImmutableTable$1() {
        return new com.google.common.collect.TableCollectors.ImmutableTableCollectorState();
    }

    static <T, R, C, V, I extends com.google.common.collect.Table<R, C, V>> java.util.stream.Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> function, java.util.function.Function<? super T, ? extends C> function2, java.util.function.Function<? super T, ? extends V> function3, java.util.function.Supplier<I> supplier) {
        return toTable(function, function2, function3, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda0
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.collect.TableCollectors.lambda$toTable$0(obj, obj2);
            }
        }, supplier);
    }

    static /* synthetic */ java.lang.Object lambda$toTable$0(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Conflicting values ");
        sb.append(obj);
        sb.append(" and ");
        sb.append(obj2);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    static <T, R, C, V, I extends com.google.common.collect.Table<R, C, V>> java.util.stream.Collector<T, ?, I> toTable(final java.util.function.Function<? super T, ? extends R> function, final java.util.function.Function<? super T, ? extends C> function2, final java.util.function.Function<? super T, ? extends V> function3, final java.util.function.BinaryOperator<V> binaryOperator, java.util.function.Supplier<I> supplier) {
        com.google.common.base.Preconditions.checkNotNull(function);
        com.google.common.base.Preconditions.checkNotNull(function2);
        com.google.common.base.Preconditions.checkNotNull(function3);
        com.google.common.base.Preconditions.checkNotNull(binaryOperator);
        com.google.common.base.Preconditions.checkNotNull(supplier);
        return java.util.stream.Collector.of(supplier, new java.util.function.BiConsumer() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda2
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.common.collect.Table table = (com.google.common.collect.Table) obj;
                com.google.common.collect.TableCollectors.mergeTables(table, function.apply(obj2), function2.apply(obj2), function3.apply(obj2), binaryOperator);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.TableCollectors$$ExternalSyntheticLambda3
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.collect.TableCollectors.lambda$toTable$2(binaryOperator, (com.google.common.collect.Table) obj, (com.google.common.collect.Table) obj2);
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ com.google.common.collect.Table lambda$toTable$2(java.util.function.BinaryOperator binaryOperator, com.google.common.collect.Table table, com.google.common.collect.Table table2) {
        for (com.google.common.collect.Table.Cell cell : table2.cellSet()) {
            mergeTables(table, cell.getRowKey(), cell.getColumnKey(), cell.getValue(), binaryOperator);
        }
        return table;
    }

    static final class ImmutableTableCollectorState<R, C, V> {
        final java.util.List<com.google.common.collect.TableCollectors.MutableCell<R, C, V>> insertionOrder;
        final com.google.common.collect.Table<R, C, com.google.common.collect.TableCollectors.MutableCell<R, C, V>> table;

        private ImmutableTableCollectorState() {
            this.insertionOrder = new java.util.ArrayList();
            this.table = com.google.common.collect.HashBasedTable.create();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void put(R r, C c, V v, java.util.function.BinaryOperator<V> binaryOperator) {
            com.google.common.collect.TableCollectors.MutableCell<R, C, V> mutableCell = this.table.get(r, c);
            if (mutableCell == null) {
                com.google.common.collect.TableCollectors.MutableCell<R, C, V> mutableCell2 = new com.google.common.collect.TableCollectors.MutableCell<>(r, c, v);
                this.insertionOrder.add(mutableCell2);
                this.table.put(r, c, mutableCell2);
                return;
            }
            mutableCell.merge(v, binaryOperator);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final com.google.common.collect.TableCollectors.ImmutableTableCollectorState<R, C, V> combine(com.google.common.collect.TableCollectors.ImmutableTableCollectorState<R, C, V> immutableTableCollectorState, java.util.function.BinaryOperator<V> binaryOperator) {
            for (com.google.common.collect.TableCollectors.MutableCell<R, C, V> mutableCell : immutableTableCollectorState.insertionOrder) {
                put(mutableCell.getRowKey(), mutableCell.getColumnKey(), mutableCell.getValue(), binaryOperator);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final com.google.common.collect.ImmutableTable<R, C, V> toTable() {
            return com.google.common.collect.ImmutableTable.copyOf(this.insertionOrder);
        }
    }

    static final class MutableCell<R, C, V> extends com.google.common.collect.Tables.AbstractCell<R, C, V> {
        private final C column;
        private final R row;
        private V value;

        MutableCell(R r, C c, V v) {
            this.row = (R) com.google.common.base.Preconditions.checkNotNull(r, "row");
            this.column = (C) com.google.common.base.Preconditions.checkNotNull(c, "column");
            this.value = (V) com.google.common.base.Preconditions.checkNotNull(v, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        }

        @Override // com.google.common.collect.Table.Cell
        public final R getRowKey() {
            return this.row;
        }

        @Override // com.google.common.collect.Table.Cell
        public final C getColumnKey() {
            return this.column;
        }

        @Override // com.google.common.collect.Table.Cell
        public final V getValue() {
            return this.value;
        }

        final void merge(V v, java.util.function.BinaryOperator<V> binaryOperator) {
            com.google.common.base.Preconditions.checkNotNull(v, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            this.value = (V) com.google.common.base.Preconditions.checkNotNull(binaryOperator.apply(this.value, v), "mergeFunction.apply");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <R, C, V> void mergeTables(com.google.common.collect.Table<R, C, V> table, R r, C c, V v, java.util.function.BinaryOperator<V> binaryOperator) {
        com.google.common.base.Preconditions.checkNotNull(v);
        V v2 = table.get(r, c);
        if (v2 == null) {
            table.put(r, c, v);
            return;
        }
        java.lang.Object apply = binaryOperator.apply(v2, v);
        if (apply == null) {
            table.remove(r, c);
        } else {
            table.put(r, c, apply);
        }
    }

    private TableCollectors() {
    }
}
