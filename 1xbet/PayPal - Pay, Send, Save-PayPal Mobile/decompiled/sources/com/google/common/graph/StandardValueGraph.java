package com.google.common.graph;

/* loaded from: classes9.dex */
class StandardValueGraph<N, V> extends com.google.common.graph.AbstractValueGraph<N, V> {
    private final boolean allowsSelfLoops;
    long edgeCount;
    private final boolean isDirected;
    final com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> nodeConnections;
    private final com.google.common.graph.ElementOrder<N> nodeOrder;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object obj) {
        return predecessors((com.google.common.graph.StandardValueGraph<N, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object obj) {
        return successors((com.google.common.graph.StandardValueGraph<N, V>) obj);
    }

    StandardValueGraph(com.google.common.graph.AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        this(abstractGraphBuilder, abstractGraphBuilder.nodeOrder.createMap(abstractGraphBuilder.expectedNodeCount.or((com.google.common.base.Optional<java.lang.Integer>) 10).intValue()), 0L);
    }

    StandardValueGraph(com.google.common.graph.AbstractGraphBuilder<? super N> abstractGraphBuilder, java.util.Map<N, com.google.common.graph.GraphConnections<N, V>> map, long j) {
        com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> mapIteratorCache;
        this.isDirected = abstractGraphBuilder.directed;
        this.allowsSelfLoops = abstractGraphBuilder.allowsSelfLoops;
        this.nodeOrder = (com.google.common.graph.ElementOrder<N>) abstractGraphBuilder.nodeOrder.cast();
        if (map instanceof java.util.TreeMap) {
            mapIteratorCache = new com.google.common.graph.MapRetrievalCache<>(map);
        } else {
            mapIteratorCache = new com.google.common.graph.MapIteratorCache<>(map);
        }
        this.nodeConnections = mapIteratorCache;
        this.edgeCount = com.google.common.graph.Graphs.checkNonNegative(j);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> nodes() {
        return this.nodeConnections.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
        return this.isDirected;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return this.allowsSelfLoops;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
        return this.nodeOrder;
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> adjacentNodes(N n) {
        return (java.util.Set<N>) nodeInvalidatableSet(checkedConnections(n).adjacentNodes(), n);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> predecessors(N n) {
        return (java.util.Set<N>) nodeInvalidatableSet(checkedConnections(n).predecessors(), n);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> successors(N n) {
        return (java.util.Set<N>) nodeInvalidatableSet(checkedConnections(n).successors(), n);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N n) {
        final com.google.common.graph.GraphConnections<N, V> checkedConnections = checkedConnections(n);
        return (java.util.Set<com.google.common.graph.EndpointPair<N>>) nodeInvalidatableSet(new com.google.common.graph.IncidentEdgeSet<N>(this, this, n) { // from class: com.google.common.graph.StandardValueGraph.1
            final /* synthetic */ com.google.common.graph.StandardValueGraph this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<com.google.common.graph.EndpointPair<N>> iterator() {
                return checkedConnections.incidentEdgeIterator(this.node);
            }
        }, n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n, N n2) {
        return hasEdgeConnectingInternal(com.google.common.base.Preconditions.checkNotNull(n), com.google.common.base.Preconditions.checkNotNull(n2));
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpointPair) {
        com.google.common.base.Preconditions.checkNotNull(endpointPair);
        return isOrderingCompatible(endpointPair) && hasEdgeConnectingInternal(endpointPair.nodeU(), endpointPair.nodeV());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V edgeValueOrDefault(N n, N n2, V v) {
        return (V) edgeValueOrDefaultInternal(com.google.common.base.Preconditions.checkNotNull(n), com.google.common.base.Preconditions.checkNotNull(n2), v);
    }

    public V edgeValueOrDefault(com.google.common.graph.EndpointPair<N> endpointPair, V v) {
        validateEndpoints(endpointPair);
        return edgeValueOrDefaultInternal(endpointPair.nodeU(), endpointPair.nodeV(), v);
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    protected long edgeCount() {
        return this.edgeCount;
    }

    private final com.google.common.graph.GraphConnections<N, V> checkedConnections(N n) {
        com.google.common.graph.GraphConnections<N, V> graphConnections = this.nodeConnections.get(n);
        if (graphConnections != null) {
            return graphConnections;
        }
        com.google.common.base.Preconditions.checkNotNull(n);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Node ");
        sb.append(n);
        sb.append(" is not an element of this graph.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    final boolean containsNode(N n) {
        return this.nodeConnections.containsKey(n);
    }

    private final boolean hasEdgeConnectingInternal(N n, N n2) {
        com.google.common.graph.GraphConnections<N, V> graphConnections = this.nodeConnections.get(n);
        return graphConnections != null && graphConnections.successors().contains(n2);
    }

    private final V edgeValueOrDefaultInternal(N n, N n2, V v) {
        com.google.common.graph.GraphConnections<N, V> graphConnections = this.nodeConnections.get(n);
        V value = graphConnections == null ? null : graphConnections.value(n2);
        return value == null ? v : value;
    }
}
