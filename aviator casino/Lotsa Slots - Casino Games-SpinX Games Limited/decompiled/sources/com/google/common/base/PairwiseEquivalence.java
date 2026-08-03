package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class PairwiseEquivalence<E, T extends E> extends com.google.common.base.Equivalence<java.lang.Iterable<T>> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    final com.google.common.base.Equivalence<E> elementEquivalence;

    PairwiseEquivalence(com.google.common.base.Equivalence<E> elementEquivalence) {
        this.elementEquivalence = (com.google.common.base.Equivalence) com.google.common.base.Preconditions.checkNotNull(elementEquivalence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.Equivalence
    public boolean doEquivalent(java.lang.Iterable<T> iterableA, java.lang.Iterable<T> iterableB) {
        java.util.Iterator<T> it = iterableA.iterator();
        java.util.Iterator<T> it2 = iterableB.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.elementEquivalence.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.Equivalence
    public int doHash(java.lang.Iterable<T> iterable) {
        java.util.Iterator<T> it = iterable.iterator();
        int i = 78721;
        while (it.hasNext()) {
            i = (i * 24943) + this.elementEquivalence.hash(it.next());
        }
        return i;
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object instanceof com.google.common.base.PairwiseEquivalence) {
            return this.elementEquivalence.equals(((com.google.common.base.PairwiseEquivalence) object).elementEquivalence);
        }
        return false;
    }

    public int hashCode() {
        return this.elementEquivalence.hashCode() ^ 1185147655;
    }

    public java.lang.String toString() {
        return this.elementEquivalence + ".pairwise()";
    }
}
