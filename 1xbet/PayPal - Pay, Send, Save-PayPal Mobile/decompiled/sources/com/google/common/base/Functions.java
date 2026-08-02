package com.google.common.base;

/* loaded from: classes9.dex */
public final class Functions {
    private Functions() {
    }

    public static com.google.common.base.Function<java.lang.Object, java.lang.String> toStringFunction() {
        return com.google.common.base.Functions.ToStringFunction.INSTANCE;
    }

    enum ToStringFunction implements com.google.common.base.Function<java.lang.Object, java.lang.String> {
        INSTANCE;

        @Override // com.google.common.base.Function
        public final java.lang.String apply(java.lang.Object obj) {
            com.google.common.base.Preconditions.checkNotNull(obj);
            return obj.toString();
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Functions.toStringFunction()";
        }
    }

    public static <E> com.google.common.base.Function<E, E> identity() {
        return com.google.common.base.Functions.IdentityFunction.INSTANCE;
    }

    enum IdentityFunction implements com.google.common.base.Function<java.lang.Object, java.lang.Object> {
        INSTANCE;

        @Override // com.google.common.base.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return obj;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return "Functions.identity()";
        }
    }

    public static <K, V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, V> map) {
        return new com.google.common.base.Functions.FunctionForMapNoDefault(map);
    }

    public static <K, V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, ? extends V> map, V v) {
        return new com.google.common.base.Functions.ForMapWithDefault(map, v);
    }

    static final class FunctionForMapNoDefault<K, V> implements com.google.common.base.Function<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.Map<K, V> map;

        FunctionForMapNoDefault(java.util.Map<K, V> map) {
            this.map = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
        }

        @Override // com.google.common.base.Function
        public final V apply(K k) {
            V v = this.map.get(k);
            com.google.common.base.Preconditions.checkArgument(v != null || this.map.containsKey(k), "Key '%s' not present in map", k);
            return (V) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(v);
        }

        @Override // com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Functions.FunctionForMapNoDefault) {
                return this.map.equals(((com.google.common.base.Functions.FunctionForMapNoDefault) obj).map);
            }
            return false;
        }

        public final int hashCode() {
            return this.map.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Functions.forMap(");
            sb.append(this.map);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class ForMapWithDefault<K, V> implements com.google.common.base.Function<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final V defaultValue;
        final java.util.Map<K, ? extends V> map;

        ForMapWithDefault(java.util.Map<K, ? extends V> map, V v) {
            this.map = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
            this.defaultValue = v;
        }

        @Override // com.google.common.base.Function
        public final V apply(K k) {
            V v = this.map.get(k);
            if (v != null || this.map.containsKey(k)) {
                return (V) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(v);
            }
            return this.defaultValue;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.Functions.ForMapWithDefault)) {
                return false;
            }
            com.google.common.base.Functions.ForMapWithDefault forMapWithDefault = (com.google.common.base.Functions.ForMapWithDefault) obj;
            return this.map.equals(forMapWithDefault.map) && java.util.Objects.equals(this.defaultValue, forMapWithDefault.defaultValue);
        }

        public final int hashCode() {
            return java.util.Objects.hash(this.map, this.defaultValue);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Functions.forMap(");
            sb.append(this.map);
            sb.append(", defaultValue=");
            sb.append(this.defaultValue);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <A, B, C> com.google.common.base.Function<A, C> compose(com.google.common.base.Function<B, C> function, com.google.common.base.Function<A, ? extends B> function2) {
        return new com.google.common.base.Functions.FunctionComposition(function, function2);
    }

    static final class FunctionComposition<A, B, C> implements com.google.common.base.Function<A, C>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Function<A, ? extends B> f;
        private final com.google.common.base.Function<B, C> g;

        FunctionComposition(com.google.common.base.Function<B, C> function, com.google.common.base.Function<A, ? extends B> function2) {
            this.g = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
            this.f = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function2);
        }

        @Override // com.google.common.base.Function
        public final C apply(A a2) {
            return (C) this.g.apply(this.f.apply(a2));
        }

        @Override // com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.Functions.FunctionComposition)) {
                return false;
            }
            com.google.common.base.Functions.FunctionComposition functionComposition = (com.google.common.base.Functions.FunctionComposition) obj;
            return this.f.equals(functionComposition.f) && this.g.equals(functionComposition.g);
        }

        public final int hashCode() {
            return this.f.hashCode() ^ this.g.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.g);
            sb.append("(");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> com.google.common.base.Function<T, java.lang.Boolean> forPredicate(com.google.common.base.Predicate<T> predicate) {
        return new com.google.common.base.Functions.PredicateFunction(predicate);
    }

    static final class PredicateFunction<T> implements com.google.common.base.Function<T, java.lang.Boolean>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Predicate<T> predicate;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.base.Function
        public final /* bridge */ /* synthetic */ java.lang.Boolean apply(java.lang.Object obj) {
            return apply((com.google.common.base.Functions.PredicateFunction<T>) obj);
        }

        private PredicateFunction(com.google.common.base.Predicate<T> predicate) {
            this.predicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Function
        public final java.lang.Boolean apply(T t) {
            return java.lang.Boolean.valueOf(this.predicate.apply(t));
        }

        @Override // com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Functions.PredicateFunction) {
                return this.predicate.equals(((com.google.common.base.Functions.PredicateFunction) obj).predicate);
            }
            return false;
        }

        public final int hashCode() {
            return this.predicate.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Functions.forPredicate(");
            sb.append(this.predicate);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <E> com.google.common.base.Function<java.lang.Object, E> constant(E e) {
        return new com.google.common.base.Functions.ConstantFunction(e);
    }

    static final class ConstantFunction<E> implements com.google.common.base.Function<java.lang.Object, E>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final E value;

        ConstantFunction(E e) {
            this.value = e;
        }

        @Override // com.google.common.base.Function
        public final E apply(java.lang.Object obj) {
            return this.value;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Functions.ConstantFunction) {
                return java.util.Objects.equals(this.value, ((com.google.common.base.Functions.ConstantFunction) obj).value);
            }
            return false;
        }

        public final int hashCode() {
            E e = this.value;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Functions.constant(");
            sb.append(this.value);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <F, T> com.google.common.base.Function<F, T> forSupplier(com.google.common.base.Supplier<T> supplier) {
        return new com.google.common.base.Functions.SupplierFunction(supplier);
    }

    static final class SupplierFunction<F, T> implements com.google.common.base.Function<F, T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Supplier<T> supplier;

        private SupplierFunction(com.google.common.base.Supplier<T> supplier) {
            this.supplier = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Function
        public final T apply(F f) {
            return this.supplier.get();
        }

        @Override // com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Functions.SupplierFunction) {
                return this.supplier.equals(((com.google.common.base.Functions.SupplierFunction) obj).supplier);
            }
            return false;
        }

        public final int hashCode() {
            return this.supplier.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Functions.forSupplier(");
            sb.append(this.supplier);
            sb.append(")");
            return sb.toString();
        }
    }
}
