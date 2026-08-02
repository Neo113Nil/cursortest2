package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ForwardingSet<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.Set<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.Set<E> delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemoveAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Sets.removeAllImpl(this, (java.util.Collection<?>) com.google.common.base.Preconditions.checkNotNull(collection));
    }

    protected boolean standardEquals(java.lang.Object obj) {
        return com.google.common.collect.Sets.equalsImpl(this, obj);
    }

    protected int standardHashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(this);
    }
}
