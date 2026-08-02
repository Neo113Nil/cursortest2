package com.google.common.graph;

/* loaded from: classes9.dex */
final class InvalidatableSet<E> extends com.google.common.collect.ForwardingSet<E> {
    private final java.util.Set<E> delegate;
    private final com.google.common.base.Supplier<java.lang.String> errorMessage;
    private final com.google.common.base.Supplier<java.lang.Boolean> validator;

    static <E> com.google.common.graph.InvalidatableSet<E> of(java.util.Set<E> set, com.google.common.base.Supplier<java.lang.Boolean> supplier, com.google.common.base.Supplier<java.lang.String> supplier2) {
        return new com.google.common.graph.InvalidatableSet<>((java.util.Set) com.google.common.base.Preconditions.checkNotNull(set), (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier), (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier2));
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final java.util.Set<E> delegate() {
        validate();
        return this.delegate;
    }

    private InvalidatableSet(java.util.Set<E> set, com.google.common.base.Supplier<java.lang.Boolean> supplier, com.google.common.base.Supplier<java.lang.String> supplier2) {
        this.delegate = set;
        this.validator = supplier;
        this.errorMessage = supplier2;
    }

    @Override // com.google.common.collect.ForwardingSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.delegate.hashCode();
    }

    private void validate() {
        if (!this.validator.get().booleanValue()) {
            throw new java.lang.IllegalStateException(this.errorMessage.get());
        }
    }
}
