package com.google.common.base;

/* loaded from: classes4.dex */
final class Absent<T> extends com.google.common.base.Optional<T> {
    static final com.google.common.base.Absent<java.lang.Object> INSTANCE = new com.google.common.base.Absent<>();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.base.Optional
    public final boolean equals(java.lang.Object obj) {
        return this == obj;
    }

    @Override // com.google.common.base.Optional
    public final int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public final boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public final T orNull() {
        return null;
    }

    static <T> com.google.common.base.Optional<T> withType() {
        return INSTANCE;
    }

    private Absent() {
    }

    @Override // com.google.common.base.Optional
    public final T get() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public final T or(T t) {
        return (T) com.google.common.base.Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.google.common.base.Optional
    public final com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T> optional) {
        return (com.google.common.base.Optional) com.google.common.base.Preconditions.checkNotNull(optional);
    }

    @Override // com.google.common.base.Optional
    public final T or(com.google.common.base.Supplier<? extends T> supplier) {
        return (T) com.google.common.base.Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.google.common.base.Optional
    public final java.util.Set<T> asSet() {
        return java.util.Collections.emptySet();
    }

    @Override // com.google.common.base.Optional
    public final <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return com.google.common.base.Optional.absent();
    }

    @Override // com.google.common.base.Optional
    public final java.lang.String toString() {
        return "Optional.absent()";
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }
}
