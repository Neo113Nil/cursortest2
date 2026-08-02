package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
abstract class CollectionFuture<V, C> extends com.google.common.util.concurrent.AggregateFuture<V, C> {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> values;

    abstract C combine(java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> list);

    CollectionFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> immutableCollection, boolean z) {
        super(immutableCollection, z, true);
        java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> newArrayListWithCapacity;
        if (immutableCollection.isEmpty()) {
            newArrayListWithCapacity = java.util.Collections.emptyList();
        } else {
            newArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(immutableCollection.size());
        }
        for (int i = 0; i < immutableCollection.size(); i++) {
            newArrayListWithCapacity.add(null);
        }
        this.values = newArrayListWithCapacity;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void collectOneValue(int i, V v) {
        java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> list = this.values;
        if (list != null) {
            list.set(i, new com.google.common.util.concurrent.CollectionFuture.Present<>(v));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void handleAllCompleted() {
        java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> list = this.values;
        if (list != null) {
            set(combine(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.releaseResources(releaseResourcesReason);
        this.values = null;
    }

    static final class ListFuture<V> extends com.google.common.util.concurrent.CollectionFuture<V, java.util.List<V>> {
        ListFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> immutableCollection, boolean z) {
            super(immutableCollection, z);
            init();
        }

        @Override // com.google.common.util.concurrent.CollectionFuture
        public final java.util.List<V> combine(java.util.List<com.google.common.util.concurrent.CollectionFuture.Present<V>> list) {
            java.util.ArrayList newArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(list.size());
            java.util.Iterator<com.google.common.util.concurrent.CollectionFuture.Present<V>> it = list.iterator();
            while (it.hasNext()) {
                com.google.common.util.concurrent.CollectionFuture.Present<V> next = it.next();
                newArrayListWithCapacity.add(next != null ? next.value : null);
            }
            return java.util.Collections.unmodifiableList(newArrayListWithCapacity);
        }
    }

    static final class Present<V> {
        final V value;

        Present(V v) {
            this.value = v;
        }
    }
}
