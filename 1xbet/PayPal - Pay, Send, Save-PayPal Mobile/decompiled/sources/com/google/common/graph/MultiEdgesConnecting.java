package com.google.common.graph;

/* loaded from: classes9.dex */
abstract class MultiEdgesConnecting<E> extends java.util.AbstractSet<E> {
    private final java.util.Map<E, ?> outEdgeToNode;
    private final java.lang.Object targetNode;

    MultiEdgesConnecting(java.util.Map<E, ?> map, java.lang.Object obj) {
        this.outEdgeToNode = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
        this.targetNode = com.google.common.base.Preconditions.checkNotNull(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        final java.util.Iterator<java.util.Map.Entry<E, ?>> it = this.outEdgeToNode.entrySet().iterator();
        return new com.google.common.collect.AbstractIterator<E>(this) { // from class: com.google.common.graph.MultiEdgesConnecting.1
            final /* synthetic */ com.google.common.graph.MultiEdgesConnecting this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.collect.AbstractIterator
            public E computeNext() {
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (this.this$0.targetNode.equals(entry.getValue())) {
                        return (E) entry.getKey();
                    }
                }
                return endOfData();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.targetNode.equals(this.outEdgeToNode.get(obj));
    }
}
