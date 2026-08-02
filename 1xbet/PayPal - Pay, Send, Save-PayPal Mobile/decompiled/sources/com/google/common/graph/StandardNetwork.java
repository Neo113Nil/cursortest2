package com.google.common.graph;

/* loaded from: classes9.dex */
class StandardNetwork<N, E> extends com.google.common.graph.AbstractNetwork<N, E> {
    private final boolean allowsParallelEdges;
    private final boolean allowsSelfLoops;
    private final com.google.common.graph.ElementOrder<E> edgeOrder;
    final com.google.common.graph.MapIteratorCache<E, N> edgeToReferenceNode;
    private final boolean isDirected;
    final com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> nodeConnections;
    private final com.google.common.graph.ElementOrder<N> nodeOrder;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object obj) {
        return predecessors((com.google.common.graph.StandardNetwork<N, E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object obj) {
        return successors((com.google.common.graph.StandardNetwork<N, E>) obj);
    }

    StandardNetwork(com.google.common.graph.NetworkBuilder<? super N, ? super E> networkBuilder) {
        this(networkBuilder, networkBuilder.nodeOrder.createMap(networkBuilder.expectedNodeCount.or((com.google.common.base.Optional<java.lang.Integer>) 10).intValue()), networkBuilder.edgeOrder.createMap(networkBuilder.expectedEdgeCount.or((com.google.common.base.Optional<java.lang.Integer>) 20).intValue()));
    }

    StandardNetwork(com.google.common.graph.NetworkBuilder<? super N, ? super E> networkBuilder, java.util.Map<N, com.google.common.graph.NetworkConnections<N, E>> map, java.util.Map<E, N> map2) {
        com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> mapIteratorCache;
        this.isDirected = networkBuilder.directed;
        this.allowsParallelEdges = networkBuilder.allowsParallelEdges;
        this.allowsSelfLoops = networkBuilder.allowsSelfLoops;
        this.nodeOrder = (com.google.common.graph.ElementOrder<N>) networkBuilder.nodeOrder.cast();
        this.edgeOrder = (com.google.common.graph.ElementOrder<E>) networkBuilder.edgeOrder.cast();
        if (map instanceof java.util.TreeMap) {
            mapIteratorCache = new com.google.common.graph.MapRetrievalCache<>(map);
        } else {
            mapIteratorCache = new com.google.common.graph.MapIteratorCache<>(map);
        }
        this.nodeConnections = mapIteratorCache;
        this.edgeToReferenceNode = new com.google.common.graph.MapIteratorCache<>(map2);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> nodes() {
        return this.nodeConnections.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edges() {
        return this.edgeToReferenceNode.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return this.isDirected;
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return this.allowsParallelEdges;
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return this.allowsSelfLoops;
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
        return this.nodeOrder;
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<E> edgeOrder() {
        return this.edgeOrder;
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> incidentEdges(N n) {
        return (java.util.Set<E>) nodeInvalidatableSet(checkedConnections(n).incidentEdges(), n);
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.EndpointPair<N> incidentNodes(E e) {
        N checkedReferenceNode = checkedReferenceNode(e);
        return com.google.common.graph.EndpointPair.of(this, checkedReferenceNode, ((com.google.common.graph.NetworkConnections) java.util.Objects.requireNonNull(this.nodeConnections.get(checkedReferenceNode))).adjacentNode(e));
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> adjacentNodes(N n) {
        return (java.util.Set<N>) nodeInvalidatableSet(checkedConnections(n).adjacentNodes(), n);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(N n, N n2) {
        com.google.common.graph.NetworkConnections<N, E> checkedConnections = checkedConnections(n);
        if (!this.allowsSelfLoops && n == n2) {
            return com.google.common.collect.ImmutableSet.of();
        }
        com.google.common.base.Preconditions.checkArgument(containsNode(n2), "Node %s is not an element of this graph.", n2);
        return (java.util.Set<E>) nodePairInvalidatableSet(checkedConnections.edgesConnecting(n2), n, n2);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> inEdges(N n) {
        return (java.util.Set<E>) nodeInvalidatableSet(checkedConnections(n).inEdges(), n);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> outEdges(N n) {
        return (java.util.Set<E>) nodeInvalidatableSet(checkedConnections(n).outEdges(), n);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> predecessors(N n) {
        return (java.util.Set<N>) nodeInvalidatableSet(checkedConnections(n).predecessors(), n);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> successors(N n) {
        return (java.util.Set<N>) nodeInvalidatableSet(checkedConnections(n).successors(), n);
    }

    final com.google.common.graph.NetworkConnections<N, E> checkedConnections(N n) {
        com.google.common.graph.NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n);
        if (networkConnections != null) {
            return networkConnections;
        }
        com.google.common.base.Preconditions.checkNotNull(n);
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Node %s is not an element of this graph.", n));
    }

    final N checkedReferenceNode(E e) {
        N n = this.edgeToReferenceNode.get(e);
        if (n != null) {
            return n;
        }
        com.google.common.base.Preconditions.checkNotNull(e);
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Edge %s is not an element of this graph.", e));
    }

    final boolean containsNode(N n) {
        return this.nodeConnections.containsKey(n);
    }

    final boolean containsEdge(E e) {
        return this.edgeToReferenceNode.containsKey(e);
    }
}
