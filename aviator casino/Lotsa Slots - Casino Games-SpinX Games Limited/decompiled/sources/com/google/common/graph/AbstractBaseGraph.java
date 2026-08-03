package com.google.common.graph;

@com.google.common.graph.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
abstract class AbstractBaseGraph<N> implements com.google.common.graph.BaseGraph<N> {
    @Override // com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object obj) {
        java.lang.Iterable predecessors;
        predecessors = predecessors((com.google.common.graph.AbstractBaseGraph<N>) ((com.google.common.graph.BaseGraph) obj));
        return predecessors;
    }

    @Override // com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object obj) {
        java.lang.Iterable successors;
        successors = successors((com.google.common.graph.AbstractBaseGraph<N>) ((com.google.common.graph.BaseGraph) obj));
        return successors;
    }

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
            public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
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
    public java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N node) {
        com.google.common.base.Preconditions.checkNotNull(node);
        com.google.common.base.Preconditions.checkArgument(nodes().contains(node), "Node %s is not an element of this graph.", node);
        return new com.google.common.graph.AbstractBaseGraph.AnonymousClass2(this, this, node);
    }

    /* renamed from: com.google.common.graph.AbstractBaseGraph$2, reason: invalid class name */
    class AnonymousClass2 extends com.google.common.graph.IncidentEdgeSet<N> {
        AnonymousClass2(final com.google.common.graph.AbstractBaseGraph this$0, com.google.common.graph.BaseGraph graph, java.lang.Object node) {
            super(graph, node);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public com.google.common.collect.UnmodifiableIterator<com.google.common.graph.EndpointPair<N>> iterator() {
            if (this.graph.isDirected()) {
                return com.google.common.collect.Iterators.unmodifiableIterator(com.google.common.collect.Iterators.concat(com.google.common.collect.Iterators.transform(this.graph.predecessors((com.google.common.graph.BaseGraph<N>) this.node).iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.AbstractBaseGraph$2$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.common.graph.AbstractBaseGraph.AnonymousClass2.this.m5490lambda$iterator$0$comgooglecommongraphAbstractBaseGraph$2(obj);
                    }
                }), com.google.common.collect.Iterators.transform(com.google.common.collect.Sets.difference(this.graph.successors((com.google.common.graph.BaseGraph<N>) this.node), com.google.common.collect.ImmutableSet.of(this.node)).iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.AbstractBaseGraph$2$$ExternalSyntheticLambda1
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.common.graph.AbstractBaseGraph.AnonymousClass2.this.m5491lambda$iterator$1$comgooglecommongraphAbstractBaseGraph$2(obj);
                    }
                })));
            }
            return com.google.common.collect.Iterators.unmodifiableIterator(com.google.common.collect.Iterators.transform(this.graph.adjacentNodes(this.node).iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.AbstractBaseGraph$2$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.graph.AbstractBaseGraph.AnonymousClass2.this.m5492lambda$iterator$2$comgooglecommongraphAbstractBaseGraph$2(obj);
                }
            }));
        }

        /* renamed from: lambda$iterator$0$com-google-common-graph-AbstractBaseGraph$2, reason: not valid java name */
        /* synthetic */ com.google.common.graph.EndpointPair m5490lambda$iterator$0$comgooglecommongraphAbstractBaseGraph$2(java.lang.Object obj) {
            return com.google.common.graph.EndpointPair.ordered(obj, this.node);
        }

        /* renamed from: lambda$iterator$1$com-google-common-graph-AbstractBaseGraph$2, reason: not valid java name */
        /* synthetic */ com.google.common.graph.EndpointPair m5491lambda$iterator$1$comgooglecommongraphAbstractBaseGraph$2(java.lang.Object obj) {
            return com.google.common.graph.EndpointPair.ordered(this.node, obj);
        }

        /* renamed from: lambda$iterator$2$com-google-common-graph-AbstractBaseGraph$2, reason: not valid java name */
        /* synthetic */ com.google.common.graph.EndpointPair m5492lambda$iterator$2$comgooglecommongraphAbstractBaseGraph$2(java.lang.Object obj) {
            return com.google.common.graph.EndpointPair.unordered(this.node, obj);
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N node) {
        if (isDirected()) {
            return com.google.common.math.IntMath.saturatedAdd(predecessors((java.lang.Object) node).size(), successors((java.lang.Object) node).size());
        }
        java.util.Set<N> adjacentNodes = adjacentNodes(node);
        return com.google.common.math.IntMath.saturatedAdd(adjacentNodes.size(), (allowsSelfLoops() && adjacentNodes.contains(node)) ? 1 : 0);
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N node) {
        return isDirected() ? predecessors((java.lang.Object) node).size() : degree(node);
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N node) {
        return isDirected() ? successors((java.lang.Object) node).size() : degree(node);
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N nodeU, N nodeV) {
        com.google.common.base.Preconditions.checkNotNull(nodeU);
        com.google.common.base.Preconditions.checkNotNull(nodeV);
        return nodes().contains(nodeU) && successors((java.lang.Object) nodeU).contains(nodeV);
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints) {
        com.google.common.base.Preconditions.checkNotNull(endpoints);
        if (!isOrderingCompatible(endpoints)) {
            return false;
        }
        N nodeU = endpoints.nodeU();
        return nodes().contains(nodeU) && successors((java.lang.Object) nodeU).contains(endpoints.nodeV());
    }

    protected final void validateEndpoints(com.google.common.graph.EndpointPair<?> endpoints) {
        com.google.common.base.Preconditions.checkNotNull(endpoints);
        com.google.common.base.Preconditions.checkArgument(isOrderingCompatible(endpoints), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    protected final boolean isOrderingCompatible(com.google.common.graph.EndpointPair<?> endpoints) {
        return endpoints.isOrdered() == isDirected();
    }
}
