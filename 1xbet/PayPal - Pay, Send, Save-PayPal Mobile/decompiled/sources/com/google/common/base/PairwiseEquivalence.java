package com.google.common.base;

/* loaded from: classes9.dex */
final class PairwiseEquivalence<E, T extends E> extends com.google.common.base.Equivalence<java.lang.Iterable<T>> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    final com.google.common.base.Equivalence<E> elementEquivalence;

    PairwiseEquivalence(com.google.common.base.Equivalence<E> equivalence) {
        this.elementEquivalence = (com.google.common.base.Equivalence) com.google.common.base.Preconditions.checkNotNull(equivalence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.Equivalence
    public final boolean doEquivalent(java.lang.Iterable<T> iterable, java.lang.Iterable<T> iterable2) {
        java.util.Iterator<T> it = iterable.iterator();
        java.util.Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.elementEquivalence.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.Equivalence
    public final int doHash(java.lang.Iterable<T> iterable) {
        java.util.Iterator<T> it = iterable.iterator();
        int i = 78721;
        while (it.hasNext()) {
            i = (i * 24943) + this.elementEquivalence.hash(it.next());
        }
        return i;
    }

    @Override // com.google.common.base.Equivalence
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.common.base.PairwiseEquivalence) {
            return this.elementEquivalence.equals(((com.google.common.base.PairwiseEquivalence) obj).elementEquivalence);
        }
        return false;
    }

    public final int hashCode() {
        return this.elementEquivalence.hashCode() ^ 1185147655;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.elementEquivalence);
        sb.append(".pairwise()");
        return sb.toString();
    }
}
