package com.google.common.base;

/* loaded from: classes9.dex */
final class FunctionalEquivalence<F, T> extends com.google.common.base.Equivalence<F> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final com.google.common.base.Function<? super F, ? extends T> function;
    private final com.google.common.base.Equivalence<T> resultEquivalence;

    FunctionalEquivalence(com.google.common.base.Function<? super F, ? extends T> function, com.google.common.base.Equivalence<T> equivalence) {
        this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        this.resultEquivalence = (com.google.common.base.Equivalence) com.google.common.base.Preconditions.checkNotNull(equivalence);
    }

    @Override // com.google.common.base.Equivalence
    protected final boolean doEquivalent(F f, F f2) {
        return this.resultEquivalence.equivalent(this.function.apply(f), this.function.apply(f2));
    }

    @Override // com.google.common.base.Equivalence
    protected final int doHash(F f) {
        return this.resultEquivalence.hash(this.function.apply(f));
    }

    @Override // com.google.common.base.Equivalence
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.base.FunctionalEquivalence)) {
            return false;
        }
        com.google.common.base.FunctionalEquivalence functionalEquivalence = (com.google.common.base.FunctionalEquivalence) obj;
        return this.function.equals(functionalEquivalence.function) && this.resultEquivalence.equals(functionalEquivalence.resultEquivalence);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.function, this.resultEquivalence);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.resultEquivalence);
        sb.append(".onResultOf(");
        sb.append(this.function);
        sb.append(")");
        return sb.toString();
    }
}
