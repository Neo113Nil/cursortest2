package com.google.common.graph;

/* loaded from: classes9.dex */
abstract class AbstractBaseGraph<N> implements com.google.common.graph.BaseGraph<N> {
    AbstractBaseGraph() {
    }

    protected long edgeCount() {
        long j = 0;
        while (nodes().iterator().hasNext()) {
            j += degree(r0.next());
        }
        com.google.common.base.Preconditions.checkState((1 & j) == 0);
        return j >>> 1;
    }

    @Override // com.google.common.graph.BaseGraph
    public java.util.Set<com.google.common.graph.EndpointPair<N>> edges() {
        return new java.util.AbstractSet<com.google.common.graph.EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<com.google.common.graph.EndpointPair<N>> iterator() {
                return com.google.common.graph.EndpointPairIterator.of(com.google.common.graph.AbstractBaseGraph.this);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.primitives.Ints.saturatedCast(com.google.common.graph.AbstractBaseGraph.this.edgeCount());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(java.lang.Object obj) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                if (!(obj instanceof com.google.common.graph.EndpointPair)) {
                    return false;
                }
                com.google.common.graph.EndpointPair<?> endpointPair = (com.google.common.graph.EndpointPair) obj;
                return com.google.common.graph.AbstractBaseGraph.this.isOrderingCompatible(endpointPair) && com.google.common.graph.AbstractBaseGraph.this.nodes().contains(endpointPair.nodeU()) && com.google.common.graph.AbstractBaseGraph.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
            }
        };
    }

    @Override // com.google.common.graph.BaseGraph
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
        return com.google.common.graph.ElementOrder.unordered();
    }

    @Override // com.google.common.graph.BaseGraph
    public java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N n) {
        com.google.common.base.Preconditions.checkNotNull(n);
        com.google.common.base.Preconditions.checkArgument(nodes().contains(n), "Node %s is not an element of this graph.", n);
        return (java.util.Set<com.google.common.graph.EndpointPair<N>>) nodeInvalidatableSet(new com.google.common.graph.AbstractBaseGraph.AnonymousClass2(this, n), n);
    }

    /* renamed from: com.google.common.graph.AbstractBaseGraph$2, reason: invalid class name */
    class AnonymousClass2 extends com.google.common.graph.IncidentEdgeSet<N> {
        AnonymousClass2(com.google.common.graph.BaseGraph baseGraph, java.lang.Object obj) {
            super(baseGraph, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public com.google.common.collect.UnmodifiableIterator<com.google.common.graph.EndpointPair<N>> iterator() {
            if (this.graph.isDirected()) {
                return com.google.common.collect.Iterators.unmodifiableIterator(com.google.common.collect.Iterators.concat(com.google.common.collect.Iterators.transform(this.graph.predecessors((com.google.common.graph.BaseGraph<N>) this.node).iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.AbstractBaseGraph$2$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.common.graph.AbstractBaseGraph.AnonymousClass2.this.m10328lambda$iterator$0$comgooglecommongraphAbstractBaseGraph$2(obj);
                    }
                }), com.google.common.collect.Iterators.transform(com.google.common.collect.Sets.difference(this.graph.successors((com.google.common.graph.BaseGraph<N>) this.node), com.google.common.collect.ImmutableSet.of(this.node)).iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.AbstractBaseGraph$2$$ExternalSyntheticLambda1
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.common.graph.AbstractBaseGraph.AnonymousClass2.this.m10329lambda$iterator$1$comgooglecommongraphAbstractBaseGraph$2(obj);
                    }
                })));
            }
            return com.google.common.collect.Iterators.unmodifiableIterator(com.google.common.collect.Iterators.transform(this.graph.adjacentNodes(this.node).iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.AbstractBaseGraph$2$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.graph.AbstractBaseGraph.AnonymousClass2.this.m10330lambda$iterator$2$comgooglecommongraphAbstractBaseGraph$2(obj);
                }
            }));
        }

        /* renamed from: lambda$iterator$0$com-google-common-graph-AbstractBaseGraph$2, reason: not valid java name */
        /* synthetic */ com.google.common.graph.EndpointPair m10328lambda$iterator$0$comgooglecommongraphAbstractBaseGraph$2(java.lang.Object obj) {
            return com.google.common.graph.EndpointPair.ordered(obj, this.node);
        }

        /* renamed from: lambda$iterator$1$com-google-common-graph-AbstractBaseGraph$2, reason: not valid java name */
        /* synthetic */ com.google.common.graph.EndpointPair m10329lambda$iterator$1$comgooglecommongraphAbstractBaseGraph$2(java.lang.Object obj) {
            return com.google.common.graph.EndpointPair.ordered(this.node, obj);
        }

        /* renamed from: lambda$iterator$2$com-google-common-graph-AbstractBaseGraph$2, reason: not valid java name */
        /* synthetic */ com.google.common.graph.EndpointPair m10330lambda$iterator$2$comgooglecommongraphAbstractBaseGraph$2(java.lang.Object obj) {
            return com.google.common.graph.EndpointPair.unordered(this.node, obj);
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N n) {
        if (isDirected()) {
            return com.google.common.math.IntMath.saturatedAdd(predecessors((java.lang.Object) n).size(), successors((java.lang.Object) n).size());
        }
        java.util.Set<N> adjacentNodes = adjacentNodes(n);
        return com.google.common.math.IntMath.saturatedAdd(adjacentNodes.size(), (allowsSelfLoops() && adjacentNodes.contains(n)) ? 1 : 0);
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n) {
        return isDirected() ? predecessors((java.lang.Object) n).size() : degree(n);
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n) {
        return isDirected() ? successors((java.lang.Object) n).size() : degree(n);
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n, N n2) {
        com.google.common.base.Preconditions.checkNotNull(n);
        com.google.common.base.Preconditions.checkNotNull(n2);
        return nodes().contains(n) && successors((java.lang.Object) n).contains(n2);
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpointPair) {
        com.google.common.base.Preconditions.checkNotNull(endpointPair);
        if (!isOrderingCompatible(endpointPair)) {
            return false;
        }
        N nodeU = endpointPair.nodeU();
        return nodes().contains(nodeU) && successors((java.lang.Object) nodeU).contains(endpointPair.nodeV());
    }

    protected final void validateEndpoints(com.google.common.graph.EndpointPair<?> endpointPair) {
        com.google.common.base.Preconditions.checkNotNull(endpointPair);
        com.google.common.base.Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    protected final boolean isOrderingCompatible(com.google.common.graph.EndpointPair<?> endpointPair) {
        return endpointPair.isOrdered() == isDirected();
    }

    protected final <T> java.util.Set<T> nodeInvalidatableSet(java.util.Set<T> set, final N n) {
        return com.google.common.graph.InvalidatableSet.of((java.util.Set) set, (com.google.common.base.Supplier<java.lang.Boolean>) new com.google.common.base.Supplier() { // from class: com.google.common.graph.AbstractBaseGraph$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.graph.AbstractBaseGraph.this.m10326xbbd68347(n);
            }
        }, (com.google.common.base.Supplier<java.lang.String>) new com.google.common.base.Supplier() { // from class: com.google.common.graph.AbstractBaseGraph$$ExternalSyntheticLambda3
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                java.lang.String format;
                format = java.lang.String.format("Node %s that was used to generate this set is no longer in the graph.", n);
                return format;
            }
        });
    }

    /* renamed from: lambda$nodeInvalidatableSet$0$com-google-common-graph-AbstractBaseGraph, reason: not valid java name */
    /* synthetic */ java.lang.Boolean m10326xbbd68347(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(nodes().contains(obj));
    }

    protected final <T> java.util.Set<T> nodePairInvalidatableSet(java.util.Set<T> set, final N n, final N n2) {
        return com.google.common.graph.InvalidatableSet.of((java.util.Set) set, (com.google.common.base.Supplier<java.lang.Boolean>) new com.google.common.base.Supplier() { // from class: com.google.common.graph.AbstractBaseGraph$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.graph.AbstractBaseGraph.this.m10327x43c7dfc1(n, n2);
            }
        }, (com.google.common.base.Supplier<java.lang.String>) new com.google.common.base.Supplier() { // from class: com.google.common.graph.AbstractBaseGraph$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                java.lang.String format;
                format = java.lang.String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", n, n2);
                return format;
            }
        });
    }

    /* renamed from: lambda$nodePairInvalidatableSet$0$com-google-common-graph-AbstractBaseGraph, reason: not valid java name */
    /* synthetic */ java.lang.Boolean m10327x43c7dfc1(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Boolean.valueOf(nodes().contains(obj) && nodes().contains(obj2));
    }
}
