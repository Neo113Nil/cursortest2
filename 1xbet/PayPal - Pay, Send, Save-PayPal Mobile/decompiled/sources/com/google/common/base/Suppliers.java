package com.google.common.base;

/* loaded from: classes9.dex */
public final class Suppliers {

    interface SupplierFunction<T> extends com.google.common.base.Function<com.google.common.base.Supplier<T>, T> {
    }

    private Suppliers() {
    }

    public static <F, T> com.google.common.base.Supplier<T> compose(com.google.common.base.Function<? super F, T> function, com.google.common.base.Supplier<F> supplier) {
        return new com.google.common.base.Suppliers.SupplierComposition(function, supplier);
    }

    static final class SupplierComposition<F, T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Function<? super F, T> function;
        final com.google.common.base.Supplier<F> supplier;

        SupplierComposition(com.google.common.base.Function<? super F, T> function, com.google.common.base.Supplier<F> supplier) {
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
            this.supplier = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        public final T get() {
            return this.function.apply(this.supplier.get());
        }

        @Override // com.google.common.base.Supplier
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.Suppliers.SupplierComposition)) {
                return false;
            }
            com.google.common.base.Suppliers.SupplierComposition supplierComposition = (com.google.common.base.Suppliers.SupplierComposition) obj;
            return this.function.equals(supplierComposition.function) && this.supplier.equals(supplierComposition.supplier);
        }

        public final int hashCode() {
            return java.util.Objects.hash(this.function, this.supplier);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Suppliers.compose(");
            sb.append(this.function);
            sb.append(", ");
            sb.append(this.supplier);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> com.google.common.base.Supplier<T> memoize(com.google.common.base.Supplier<T> supplier) {
        if ((supplier instanceof com.google.common.base.Suppliers.NonSerializableMemoizingSupplier) || (supplier instanceof com.google.common.base.Suppliers.MemoizingSupplier)) {
            return supplier;
        }
        if (supplier instanceof java.io.Serializable) {
            return new com.google.common.base.Suppliers.MemoizingSupplier(supplier);
        }
        return new com.google.common.base.Suppliers.NonSerializableMemoizingSupplier(supplier);
    }

    static final class MemoizingSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Supplier<T> delegate;
        volatile transient boolean initialized;
        private transient java.lang.Object lock = new java.lang.Object();
        transient T value;

        MemoizingSupplier(com.google.common.base.Supplier<T> supplier) {
            this.delegate = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        public final T get() {
            if (!this.initialized) {
                synchronized (this.lock) {
                    if (!this.initialized) {
                        T t = this.delegate.get();
                        this.value = t;
                        this.initialized = true;
                        return t;
                    }
                }
            }
            return (T) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public final java.lang.String toString() {
            java.lang.Object obj;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Suppliers.memoize(");
            if (this.initialized) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<supplier that returned ");
                sb2.append(this.value);
                sb2.append(">");
                obj = sb2.toString();
            } else {
                obj = this.delegate;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.lock = new java.lang.Object();
        }
    }

    static final class NonSerializableMemoizingSupplier<T> implements com.google.common.base.Supplier<T> {
        private static final com.google.common.base.Supplier<java.lang.Void> SUCCESSFULLY_COMPUTED = new com.google.common.base.Supplier() { // from class: com.google.common.base.Suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.base.Suppliers.NonSerializableMemoizingSupplier.lambda$static$0();
            }
        };
        private volatile com.google.common.base.Supplier<T> delegate;
        private final java.lang.Object lock = new java.lang.Object();
        private T value;

        static /* synthetic */ java.lang.Void lambda$static$0() {
            throw new java.lang.IllegalStateException();
        }

        NonSerializableMemoizingSupplier(com.google.common.base.Supplier<T> supplier) {
            this.delegate = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        public final T get() {
            com.google.common.base.Supplier<T> supplier = this.delegate;
            com.google.common.base.Supplier<T> supplier2 = (com.google.common.base.Supplier<T>) SUCCESSFULLY_COMPUTED;
            if (supplier != supplier2) {
                synchronized (this.lock) {
                    if (this.delegate != supplier2) {
                        T t = this.delegate.get();
                        this.value = t;
                        this.delegate = supplier2;
                        return t;
                    }
                }
            }
            return (T) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.delegate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Suppliers.memoize(");
            if (obj == SUCCESSFULLY_COMPUTED) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<supplier that returned ");
                sb2.append(this.value);
                sb2.append(">");
                obj = sb2.toString();
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> com.google.common.base.Supplier<T> memoizeWithExpiration(com.google.common.base.Supplier<T> supplier, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.base.Preconditions.checkNotNull(supplier);
        com.google.common.base.Preconditions.checkArgument(j > 0, "duration (%s %s) must be > 0", j, timeUnit);
        return new com.google.common.base.Suppliers.ExpiringMemoizingSupplier(supplier, timeUnit.toNanos(j));
    }

    public static <T> com.google.common.base.Supplier<T> memoizeWithExpiration(com.google.common.base.Supplier<T> supplier, java.time.Duration duration) {
        com.google.common.base.Preconditions.checkNotNull(supplier);
        com.google.common.base.Preconditions.checkArgument((duration.isNegative() || duration.isZero()) ? false : true, "duration (%s) must be > 0", duration);
        return new com.google.common.base.Suppliers.ExpiringMemoizingSupplier(supplier, com.google.common.base.Internal.toNanosSaturated(duration));
    }

    static final class ExpiringMemoizingSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Supplier<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;
        private transient java.lang.Object lock = new java.lang.Object();
        volatile transient T value;

        ExpiringMemoizingSupplier(com.google.common.base.Supplier<T> supplier, long j) {
            this.delegate = supplier;
            this.durationNanos = j;
        }

        @Override // com.google.common.base.Supplier
        public final T get() {
            long j = this.expirationNanos;
            long nanoTime = java.lang.System.nanoTime();
            if (j == 0 || nanoTime - j >= 0) {
                synchronized (this.lock) {
                    if (j == this.expirationNanos) {
                        T t = this.delegate.get();
                        this.value = t;
                        long j2 = nanoTime + this.durationNanos;
                        if (j2 == 0) {
                            j2 = 1;
                        }
                        this.expirationNanos = j2;
                        return t;
                    }
                }
            }
            return (T) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Suppliers.memoizeWithExpiration(");
            sb.append(this.delegate);
            sb.append(", ");
            sb.append(this.durationNanos);
            sb.append(", NANOS)");
            return sb.toString();
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.lock = new java.lang.Object();
        }
    }

    public static <T> com.google.common.base.Supplier<T> ofInstance(T t) {
        return new com.google.common.base.Suppliers.SupplierOfInstance(t);
    }

    static final class SupplierOfInstance<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        SupplierOfInstance(T t) {
            this.instance = t;
        }

        @Override // com.google.common.base.Supplier
        public final T get() {
            return this.instance;
        }

        @Override // com.google.common.base.Supplier
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Suppliers.SupplierOfInstance) {
                return java.util.Objects.equals(this.instance, ((com.google.common.base.Suppliers.SupplierOfInstance) obj).instance);
            }
            return false;
        }

        public final int hashCode() {
            return java.util.Objects.hash(this.instance);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Suppliers.ofInstance(");
            sb.append(this.instance);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> com.google.common.base.Supplier<T> synchronizedSupplier(com.google.common.base.Supplier<T> supplier) {
        return new com.google.common.base.Suppliers.ThreadSafeSupplier(supplier);
    }

    static final class ThreadSafeSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Supplier<T> delegate;

        ThreadSafeSupplier(com.google.common.base.Supplier<T> supplier) {
            this.delegate = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        public final T get() {
            T t;
            synchronized (this.delegate) {
                t = this.delegate.get();
            }
            return t;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Suppliers.synchronizedSupplier(");
            sb.append(this.delegate);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> com.google.common.base.Function<com.google.common.base.Supplier<T>, T> supplierFunction() {
        return com.google.common.base.Suppliers.SupplierFunctionImpl.INSTANCE;
    }

    enum SupplierFunctionImpl implements com.google.common.base.Suppliers.SupplierFunction<java.lang.Object> {
        INSTANCE;

        @Override // com.google.common.base.Function
        public final java.lang.Object apply(com.google.common.base.Supplier<java.lang.Object> supplier) {
            return supplier.get();
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Suppliers.supplierFunction()";
        }
    }
}
