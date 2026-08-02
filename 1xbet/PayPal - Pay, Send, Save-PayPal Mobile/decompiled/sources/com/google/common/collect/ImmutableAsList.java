package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class ImmutableAsList<E> extends com.google.common.collect.ImmutableList<E> {
    abstract com.google.common.collect.ImmutableCollection<E> delegateCollection();

    ImmutableAsList() {
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return delegateCollection().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return delegateCollection().size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return delegateCollection().isEmpty();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return delegateCollection().isPartialView();
    }

    static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableCollection<?> collection;

        SerializedForm(com.google.common.collect.ImmutableCollection<?> immutableCollection) {
            this.collection = immutableCollection;
        }

        final java.lang.Object readResolve() {
            return this.collection.asList();
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableAsList.SerializedForm(delegateCollection());
    }
}
