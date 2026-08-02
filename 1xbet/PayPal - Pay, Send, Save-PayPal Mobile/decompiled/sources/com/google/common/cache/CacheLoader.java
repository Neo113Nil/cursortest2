package com.google.common.cache;

/* loaded from: classes9.dex */
public abstract class CacheLoader<K, V> {
    public abstract V load(K k) throws java.lang.Exception;

    protected CacheLoader() {
    }

    public com.google.common.util.concurrent.ListenableFuture<V> reload(K k, V v) throws java.lang.Exception {
        com.google.common.base.Preconditions.checkNotNull(k);
        com.google.common.base.Preconditions.checkNotNull(v);
        return com.google.common.util.concurrent.Futures.immediateFuture(load(k));
    }

    public java.util.Map<K, V> loadAll(java.lang.Iterable<? extends K> iterable) throws java.lang.Exception {
        throw new com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException();
    }

    public static <K, V> com.google.common.cache.CacheLoader<K, V> from(com.google.common.base.Function<K, V> function) {
        return new com.google.common.cache.CacheLoader.FunctionToCacheLoader(function);
    }

    public static <V> com.google.common.cache.CacheLoader<java.lang.Object, V> from(com.google.common.base.Supplier<V> supplier) {
        return new com.google.common.cache.CacheLoader.SupplierToCacheLoader(supplier);
    }

    static final class FunctionToCacheLoader<K, V> extends com.google.common.cache.CacheLoader<K, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Function<K, V> computingFunction;

        FunctionToCacheLoader(com.google.common.base.Function<K, V> function) {
            this.computingFunction = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.cache.CacheLoader
        public final V load(K k) {
            return (V) this.computingFunction.apply(com.google.common.base.Preconditions.checkNotNull(k));
        }
    }

    public static <K, V> com.google.common.cache.CacheLoader<K, V> asyncReloading(com.google.common.cache.CacheLoader<K, V> cacheLoader, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(cacheLoader);
        com.google.common.base.Preconditions.checkNotNull(executor);
        return cacheLoader.new AnonymousClass1(executor);
    }

    /* renamed from: com.google.common.cache.CacheLoader$1, reason: invalid class name */
    class AnonymousClass1 extends com.google.common.cache.CacheLoader<K, V> {
        final /* synthetic */ java.util.concurrent.Executor val$executor;

        AnonymousClass1(java.util.concurrent.Executor executor) {
            this.val$executor = executor;
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) throws java.lang.Exception {
            return (V) com.google.common.cache.CacheLoader.this.load(k);
        }

        @Override // com.google.common.cache.CacheLoader
        public com.google.common.util.concurrent.ListenableFuture<V> reload(final K k, final V v) {
            final com.google.common.cache.CacheLoader cacheLoader = com.google.common.cache.CacheLoader.this;
            com.google.common.util.concurrent.ListenableFutureTask create = com.google.common.util.concurrent.ListenableFutureTask.create(new java.util.concurrent.Callable() { // from class: com.google.common.cache.CacheLoader$1$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.lang.Object obj;
                    obj = com.google.common.cache.CacheLoader.this.reload(k, v).get();
                    return obj;
                }
            });
            this.val$executor.execute(create);
            return create;
        }

        @Override // com.google.common.cache.CacheLoader
        public java.util.Map<K, V> loadAll(java.lang.Iterable<? extends K> iterable) throws java.lang.Exception {
            return com.google.common.cache.CacheLoader.this.loadAll(iterable);
        }
    }

    static final class SupplierToCacheLoader<V> extends com.google.common.cache.CacheLoader<java.lang.Object, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Supplier<V> computingSupplier;

        SupplierToCacheLoader(com.google.common.base.Supplier<V> supplier) {
            this.computingSupplier = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.cache.CacheLoader
        public final V load(java.lang.Object obj) {
            com.google.common.base.Preconditions.checkNotNull(obj);
            return this.computingSupplier.get();
        }
    }

    public static final class UnsupportedLoadingOperationException extends java.lang.UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    public static final class InvalidCacheLoadException extends java.lang.RuntimeException {
        public InvalidCacheLoadException(java.lang.String str) {
            super(str);
        }
    }
}
