package com.google.common.base;

/* loaded from: classes9.dex */
final class Present<T> extends com.google.common.base.Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    @Override // com.google.common.base.Optional
    public final boolean isPresent() {
        return true;
    }

    Present(T t) {
        this.reference = t;
    }

    @Override // com.google.common.base.Optional
    public final T get() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public final T or(T t) {
        com.google.common.base.Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public final com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T> optional) {
        com.google.common.base.Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // com.google.common.base.Optional
    public final T or(com.google.common.base.Supplier<? extends T> supplier) {
        com.google.common.base.Preconditions.checkNotNull(supplier);
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public final T orNull() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public final java.util.Set<T> asSet() {
        return java.util.Collections.singleton(this.reference);
    }

    @Override // com.google.common.base.Optional
    public final <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V> function) {
        return new com.google.common.base.Present(com.google.common.base.Preconditions.checkNotNull(function.apply(this.reference), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.Optional
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.common.base.Present) {
            return this.reference.equals(((com.google.common.base.Present) obj).reference);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Optional.of(");
        sb.append(this.reference);
        sb.append(")");
        return sb.toString();
    }
}
