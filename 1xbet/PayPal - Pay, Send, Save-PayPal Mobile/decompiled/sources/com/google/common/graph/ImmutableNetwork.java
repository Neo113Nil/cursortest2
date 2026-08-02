package com.google.common.graph;

@com.google.errorprone.annotations.Immutable(containerOf = {"N", "E"})
/* loaded from: classes9.dex */
public final class ImmutableNetwork<N, E> extends com.google.common.graph.StandardNetwork<N, E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ java.util.Set adjacentNodes(java.lang.Object obj) {
        return super.adjacentNodes(obj);
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ boolean allowsParallelEdges() {
        return super.allowsParallelEdges();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder edgeOrder() {
        return super.edgeOrder();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ java.util.Set edges() {
        return super.edges();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ java.util.Set edgesConnecting(java.lang.Object obj, java.lang.Object obj2) {
        return super.edgesConnecting(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ java.util.Set inEdges(java.lang.Object obj) {
        return super.inEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ java.util.Set incidentEdges(java.lang.Object obj) {
        return super.incidentEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ com.google.common.graph.EndpointPair incidentNodes(java.lang.Object obj) {
        return super.incidentNodes(obj);
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ java.util.Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network
    public final /* bridge */ /* synthetic */ java.util.Set outEdges(java.lang.Object obj) {
        return super.outEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public final /* bridge */ /* synthetic */ java.util.Set predecessors(java.lang.Object obj) {
        return super.predecessors((com.google.common.graph.ImmutableNetwork<N, E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public final /* bridge */ /* synthetic */ java.util.Set successors(java.lang.Object obj) {
        return super.successors((com.google.common.graph.ImmutableNetwork<N, E>) obj);
    }

    private ImmutableNetwork(com.google.common.graph.Network<N, E> network) {
        super(com.google.common.graph.NetworkBuilder.from(network), getNodeConnections(network), getEdgeToReferenceNode(network));
    }

    public static <N, E> com.google.common.graph.ImmutableNetwork<N, E> copyOf(com.google.common.graph.Network<N, E> network) {
        if (network instanceof com.google.common.graph.ImmutableNetwork) {
            return (com.google.common.graph.ImmutableNetwork) network;
        }
        return new com.google.common.graph.ImmutableNetwork<>(network);
    }

    @java.lang.Deprecated
    public static <N, E> com.google.common.graph.ImmutableNetwork<N, E> copyOf(com.google.common.graph.ImmutableNetwork<N, E> immutableNetwork) {
        return (com.google.common.graph.ImmutableNetwork) com.google.common.base.Preconditions.checkNotNull(immutableNetwork);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public final com.google.common.graph.ImmutableGraph<N> asGraph() {
        return new com.google.common.graph.ImmutableGraph<>(super.asGraph());
    }

    private static <N, E> java.util.Map<N, com.google.common.graph.NetworkConnections<N, E>> getNodeConnections(com.google.common.graph.Network<N, E> network) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        for (N n : network.nodes()) {
            builder.put(n, connectionsOf(network, n));
        }
        return builder.buildOrThrow();
    }

    private static <N, E> java.util.Map<E, N> getEdgeToReferenceNode(com.google.common.graph.Network<N, E> network) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        for (E e : network.edges()) {
            builder.put(e, network.incidentNodes(e).nodeU());
        }
        return builder.buildOrThrow();
    }

    private static <N, E> com.google.common.graph.NetworkConnections<N, E> connectionsOf(com.google.common.graph.Network<N, E> network, N n) {
        if (network.isDirected()) {
            java.util.Map asMap = com.google.common.collect.Maps.asMap(network.inEdges(n), sourceNodeFn(network));
            java.util.Map asMap2 = com.google.common.collect.Maps.asMap(network.outEdges(n), targetNodeFn(network));
            int size = network.edgesConnecting(n, n).size();
            if (network.allowsParallelEdges()) {
                return com.google.common.graph.DirectedMultiNetworkConnections.ofImmutable(asMap, asMap2, size);
            }
            return com.google.common.graph.DirectedNetworkConnections.ofImmutable(asMap, asMap2, size);
        }
        java.util.Map asMap3 = com.google.common.collect.Maps.asMap(network.incidentEdges(n), adjacentNodeFn(network, n));
        if (network.allowsParallelEdges()) {
            return com.google.common.graph.UndirectedMultiNetworkConnections.ofImmutable(asMap3);
        }
        return com.google.common.graph.UndirectedNetworkConnections.ofImmutable(asMap3);
    }

    private static <N, E> com.google.common.base.Function<E, N> sourceNodeFn(final com.google.common.graph.Network<N, E> network) {
        return new com.google.common.base.Function() { // from class: com.google.common.graph.ImmutableNetwork$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Object source;
                source = com.google.common.graph.Network.this.incidentNodes(obj).source();
                return source;
            }
        };
    }

    private static <N, E> com.google.common.base.Function<E, N> targetNodeFn(final com.google.common.graph.Network<N, E> network) {
        return new com.google.common.base.Function() { // from class: com.google.common.graph.ImmutableNetwork$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Object target;
                target = com.google.common.graph.Network.this.incidentNodes(obj).target();
                return target;
            }
        };
    }

    private static <N, E> com.google.common.base.Function<E, N> adjacentNodeFn(final com.google.common.graph.Network<N, E> network, final N n) {
        return new com.google.common.base.Function() { // from class: com.google.common.graph.ImmutableNetwork$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Object adjacentNode;
                adjacentNode = com.google.common.graph.Network.this.incidentNodes(obj).adjacentNode(n);
                return adjacentNode;
            }
        };
    }

    public static class Builder<N, E> {
        private final com.google.common.graph.MutableNetwork<N, E> mutableNetwork;

        Builder(com.google.common.graph.NetworkBuilder<N, E> networkBuilder) {
            this.mutableNetwork = (com.google.common.graph.MutableNetwork<N, E>) networkBuilder.build();
        }

        public com.google.common.graph.ImmutableNetwork.Builder<N, E> addNode(N n) {
            this.mutableNetwork.addNode(n);
            return this;
        }

        public com.google.common.graph.ImmutableNetwork.Builder<N, E> addEdge(N n, N n2, E e) {
            this.mutableNetwork.addEdge(n, n2, e);
            return this;
        }

        public com.google.common.graph.ImmutableNetwork.Builder<N, E> addEdge(com.google.common.graph.EndpointPair<N> endpointPair, E e) {
            this.mutableNetwork.addEdge(endpointPair, e);
            return this;
        }

        public com.google.common.graph.ImmutableNetwork<N, E> build() {
            return com.google.common.graph.ImmutableNetwork.copyOf(this.mutableNetwork);
        }
    }
}
