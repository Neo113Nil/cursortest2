package com.google.common.graph;

@com.google.common.graph.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class DirectedGraphConnections<N, V> implements com.google.common.graph.GraphConnections<N, V> {
    private static final java.lang.Object PRED = new java.lang.Object();
    private final java.util.Map<N, java.lang.Object> adjacentNodeValues;

    @javax.annotation.CheckForNull
    private final java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> orderedNodeConnections;
    private int predecessorCount;
    private int successorCount;

    private static final class PredAndSucc {
        private final java.lang.Object successorValue;

        PredAndSucc(java.lang.Object successorValue) {
            this.successorValue = successorValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class NodeConnection<N> {
        final N node;

        NodeConnection(N n) {
            this.node = (N) com.google.common.base.Preconditions.checkNotNull(n);
        }

        static final class Pred<N> extends com.google.common.graph.DirectedGraphConnections.NodeConnection<N> {
            Pred(N node) {
                super(node);
            }

            public boolean equals(@javax.annotation.CheckForNull java.lang.Object that) {
                if (that instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred) {
                    return this.node.equals(((com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred) that).node);
                }
                return false;
            }

            public int hashCode() {
                return com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred.class.hashCode() + this.node.hashCode();
            }
        }

        static final class Succ<N> extends com.google.common.graph.DirectedGraphConnections.NodeConnection<N> {
            Succ(N node) {
                super(node);
            }

            public boolean equals(@javax.annotation.CheckForNull java.lang.Object that) {
                if (that instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ) {
                    return this.node.equals(((com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ) that).node);
                }
                return false;
            }

            public int hashCode() {
                return com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ.class.hashCode() + this.node.hashCode();
            }
        }
    }

    private DirectedGraphConnections(java.util.Map<N, java.lang.Object> adjacentNodeValues, @javax.annotation.CheckForNull java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> orderedNodeConnections, int predecessorCount, int successorCount) {
        this.adjacentNodeValues = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(adjacentNodeValues);
        this.orderedNodeConnections = orderedNodeConnections;
        this.predecessorCount = com.google.common.graph.Graphs.checkNonNegative(predecessorCount);
        this.successorCount = com.google.common.graph.Graphs.checkNonNegative(successorCount);
        com.google.common.base.Preconditions.checkState(predecessorCount <= adjacentNodeValues.size() && successorCount <= adjacentNodeValues.size());
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type;

        static {
            int[] iArr = new int[com.google.common.graph.ElementOrder.Type.values().length];
            $SwitchMap$com$google$common$graph$ElementOrder$Type = iArr;
            try {
                iArr[com.google.common.graph.ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[com.google.common.graph.ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static <N, V> com.google.common.graph.DirectedGraphConnections<N, V> of(com.google.common.graph.ElementOrder<N> incidentEdgeOrder) {
        java.util.ArrayList arrayList;
        int i = com.google.common.graph.DirectedGraphConnections.AnonymousClass5.$SwitchMap$com$google$common$graph$ElementOrder$Type[incidentEdgeOrder.type().ordinal()];
        if (i == 1) {
            arrayList = null;
        } else if (i == 2) {
            arrayList = new java.util.ArrayList();
        } else {
            throw new java.lang.AssertionError(incidentEdgeOrder.type());
        }
        return new com.google.common.graph.DirectedGraphConnections<>(new java.util.HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <N, V> com.google.common.graph.DirectedGraphConnections<N, V> ofImmutable(N thisNode, java.lang.Iterable<com.google.common.graph.EndpointPair<N>> incidentEdges, com.google.common.base.Function<N, V> successorNodeToValueFn) {
        com.google.common.base.Preconditions.checkNotNull(thisNode);
        com.google.common.base.Preconditions.checkNotNull(successorNodeToValueFn);
        java.util.HashMap hashMap = new java.util.HashMap();
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        int i = 0;
        int i2 = 0;
        for (com.google.common.graph.EndpointPair<N> endpointPair : incidentEdges) {
            if (endpointPair.nodeU().equals(thisNode) && endpointPair.nodeV().equals(thisNode)) {
                hashMap.put(thisNode, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(successorNodeToValueFn.apply(thisNode)));
                builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred(thisNode));
                builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ(thisNode));
                i++;
            } else if (endpointPair.nodeV().equals(thisNode)) {
                N nodeU = endpointPair.nodeU();
                java.lang.Object put = hashMap.put(nodeU, PRED);
                if (put != null) {
                    hashMap.put(nodeU, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(put));
                }
                builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred(nodeU));
                i++;
            } else {
                com.google.common.base.Preconditions.checkArgument(endpointPair.nodeU().equals(thisNode));
                N nodeV = endpointPair.nodeV();
                V apply = successorNodeToValueFn.apply(nodeV);
                java.lang.Object put2 = hashMap.put(nodeV, apply);
                if (put2 != null) {
                    com.google.common.base.Preconditions.checkArgument(put2 == PRED);
                    hashMap.put(nodeV, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(apply));
                }
                builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ(nodeV));
            }
            i2++;
        }
        return new com.google.common.graph.DirectedGraphConnections<>(hashMap, builder.build(), i, i2);
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> adjacentNodes() {
        if (this.orderedNodeConnections == null) {
            return java.util.Collections.unmodifiableSet(this.adjacentNodeValues.keySet());
        }
        return new java.util.AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<N> iterator() {
                final java.util.Iterator it = com.google.common.graph.DirectedGraphConnections.this.orderedNodeConnections.iterator();
                final java.util.HashSet hashSet = new java.util.HashSet();
                return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.1
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    protected N computeNext() {
                        while (it.hasNext()) {
                            com.google.common.graph.DirectedGraphConnections.NodeConnection nodeConnection = (com.google.common.graph.DirectedGraphConnections.NodeConnection) it.next();
                            if (hashSet.add(nodeConnection.node)) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
                return com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.containsKey(obj);
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> predecessors() {
        return new java.util.AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<N> iterator() {
                if (com.google.common.graph.DirectedGraphConnections.this.orderedNodeConnections == null) {
                    final java.util.Iterator it = com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.entrySet().iterator();
                    return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.1
                        @Override // com.google.common.collect.AbstractIterator
                        @javax.annotation.CheckForNull
                        protected N computeNext() {
                            while (it.hasNext()) {
                                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                                if (com.google.common.graph.DirectedGraphConnections.isPredecessor(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                final java.util.Iterator it2 = com.google.common.graph.DirectedGraphConnections.this.orderedNodeConnections.iterator();
                return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.2
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    protected N computeNext() {
                        while (it2.hasNext()) {
                            com.google.common.graph.DirectedGraphConnections.NodeConnection nodeConnection = (com.google.common.graph.DirectedGraphConnections.NodeConnection) it2.next();
                            if (nodeConnection instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.DirectedGraphConnections.this.predecessorCount;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
                return com.google.common.graph.DirectedGraphConnections.isPredecessor(com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.get(obj));
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> successors() {
        return new java.util.AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<N> iterator() {
                if (com.google.common.graph.DirectedGraphConnections.this.orderedNodeConnections == null) {
                    final java.util.Iterator it = com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.entrySet().iterator();
                    return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.1
                        @Override // com.google.common.collect.AbstractIterator
                        @javax.annotation.CheckForNull
                        protected N computeNext() {
                            while (it.hasNext()) {
                                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                                if (com.google.common.graph.DirectedGraphConnections.isSuccessor(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                final java.util.Iterator it2 = com.google.common.graph.DirectedGraphConnections.this.orderedNodeConnections.iterator();
                return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.2
                    @Override // com.google.common.collect.AbstractIterator
                    @javax.annotation.CheckForNull
                    protected N computeNext() {
                        while (it2.hasNext()) {
                            com.google.common.graph.DirectedGraphConnections.NodeConnection nodeConnection = (com.google.common.graph.DirectedGraphConnections.NodeConnection) it2.next();
                            if (nodeConnection instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.DirectedGraphConnections.this.successorCount;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
                return com.google.common.graph.DirectedGraphConnections.isSuccessor(com.google.common.graph.DirectedGraphConnections.this.adjacentNodeValues.get(obj));
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Iterator<com.google.common.graph.EndpointPair<N>> incidentEdgeIterator(final N thisNode) {
        final java.util.Iterator transform;
        com.google.common.base.Preconditions.checkNotNull(thisNode);
        java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> list = this.orderedNodeConnections;
        if (list == null) {
            transform = com.google.common.collect.Iterators.concat(com.google.common.collect.Iterators.transform(predecessors().iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.DirectedGraphConnections$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    com.google.common.graph.EndpointPair ordered;
                    ordered = com.google.common.graph.EndpointPair.ordered(obj, thisNode);
                    return ordered;
                }
            }), com.google.common.collect.Iterators.transform(successors().iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.DirectedGraphConnections$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    com.google.common.graph.EndpointPair ordered;
                    ordered = com.google.common.graph.EndpointPair.ordered(thisNode, obj);
                    return ordered;
                }
            }));
        } else {
            transform = com.google.common.collect.Iterators.transform(list.iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.DirectedGraphConnections$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.graph.DirectedGraphConnections.lambda$incidentEdgeIterator$2(thisNode, (com.google.common.graph.DirectedGraphConnections.NodeConnection) obj);
                }
            });
        }
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        return new com.google.common.collect.AbstractIterator<com.google.common.graph.EndpointPair<N>>(this) { // from class: com.google.common.graph.DirectedGraphConnections.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @javax.annotation.CheckForNull
            public com.google.common.graph.EndpointPair<N> computeNext() {
                while (transform.hasNext()) {
                    com.google.common.graph.EndpointPair<N> endpointPair = (com.google.common.graph.EndpointPair) transform.next();
                    if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !atomicBoolean.getAndSet(true)) {
                        return endpointPair;
                    }
                }
                return endOfData();
            }
        };
    }

    static /* synthetic */ com.google.common.graph.EndpointPair lambda$incidentEdgeIterator$2(java.lang.Object obj, com.google.common.graph.DirectedGraphConnections.NodeConnection nodeConnection) {
        if (nodeConnection instanceof com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ) {
            return com.google.common.graph.EndpointPair.ordered(obj, nodeConnection.node);
        }
        return com.google.common.graph.EndpointPair.ordered(nodeConnection.node, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V value(N n) {
        com.google.common.base.Preconditions.checkNotNull(n);
        V v = (V) this.adjacentNodeValues.get(n);
        if (v == PRED) {
            return null;
        }
        return v instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc ? (V) ((com.google.common.graph.DirectedGraphConnections.PredAndSucc) v).successorValue : v;
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N node) {
        com.google.common.base.Preconditions.checkNotNull(node);
        java.lang.Object obj = this.adjacentNodeValues.get(node);
        if (obj == PRED) {
            this.adjacentNodeValues.remove(node);
        } else if (!(obj instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc)) {
            return;
        } else {
            this.adjacentNodeValues.put(node, ((com.google.common.graph.DirectedGraphConnections.PredAndSucc) obj).successorValue);
        }
        int i = this.predecessorCount - 1;
        this.predecessorCount = i;
        com.google.common.graph.Graphs.checkNonNegative(i);
        java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.remove(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred(node));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    public V removeSuccessor(java.lang.Object obj) {
        java.lang.Object obj2;
        com.google.common.base.Preconditions.checkNotNull(obj);
        java.lang.Object obj3 = this.adjacentNodeValues.get(obj);
        if (obj3 == null || obj3 == (obj2 = PRED)) {
            obj3 = null;
        } else if (obj3 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc) {
            this.adjacentNodeValues.put(obj, obj2);
            obj3 = ((com.google.common.graph.DirectedGraphConnections.PredAndSucc) obj3).successorValue;
        } else {
            this.adjacentNodeValues.remove(obj);
        }
        if (obj3 != null) {
            int i = this.successorCount - 1;
            this.successorCount = i;
            com.google.common.graph.Graphs.checkNonNegative(i);
            java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.remove(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N node, V unused) {
        java.util.Map<N, java.lang.Object> map = this.adjacentNodeValues;
        java.lang.Object obj = PRED;
        java.lang.Object put = map.put(node, obj);
        if (put != null) {
            if (put instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc) {
                this.adjacentNodeValues.put(node, put);
                return;
            } else if (put == obj) {
                return;
            } else {
                this.adjacentNodeValues.put(node, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(put));
            }
        }
        int i = this.predecessorCount + 1;
        this.predecessorCount = i;
        com.google.common.graph.Graphs.checkPositive(i);
        java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.add(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Pred(node));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    @Override // com.google.common.graph.GraphConnections
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V addSuccessor(N n, V v) {
        java.lang.Object put = this.adjacentNodeValues.put(n, v);
        if (put != null) {
            if (put instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc) {
                this.adjacentNodeValues.put(n, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(v));
                put = ((com.google.common.graph.DirectedGraphConnections.PredAndSucc) put).successorValue;
            } else if (put == PRED) {
                this.adjacentNodeValues.put(n, new com.google.common.graph.DirectedGraphConnections.PredAndSucc(v));
            }
            if (put == null) {
                int i = this.successorCount + 1;
                this.successorCount = i;
                com.google.common.graph.Graphs.checkPositive(i);
                java.util.List<com.google.common.graph.DirectedGraphConnections.NodeConnection<N>> list = this.orderedNodeConnections;
                if (list != null) {
                    list.add(new com.google.common.graph.DirectedGraphConnections.NodeConnection.Succ(n));
                }
            }
            if (put != null) {
                return null;
            }
            return (V) put;
        }
        put = null;
        if (put == null) {
        }
        if (put != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPredecessor(@javax.annotation.CheckForNull java.lang.Object value) {
        return value == PRED || (value instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSuccessor(@javax.annotation.CheckForNull java.lang.Object value) {
        return (value == PRED || value == null) ? false : true;
    }
}
