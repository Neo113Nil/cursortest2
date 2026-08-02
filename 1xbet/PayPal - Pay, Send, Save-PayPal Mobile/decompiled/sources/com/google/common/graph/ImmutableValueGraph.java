package com.google.common.graph;

@com.google.errorprone.annotations.Immutable(containerOf = {"N", "V"})
/* loaded from: classes9.dex */
public final class ImmutableValueGraph<N, V> extends com.google.common.graph.StandardValueGraph<N, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public final /* bridge */ /* synthetic */ java.util.Set adjacentNodes(java.lang.Object obj) {
        return super.adjacentNodes(obj);
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public final /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.ValueGraph
    public final /* bridge */ /* synthetic */ java.lang.Object edgeValueOrDefault(com.google.common.graph.EndpointPair endpointPair, java.lang.Object obj) {
        return super.edgeValueOrDefault(endpointPair, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.ValueGraph
    public final /* bridge */ /* synthetic */ java.lang.Object edgeValueOrDefault(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return super.edgeValueOrDefault(obj, obj2, obj3);
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public final /* bridge */ /* synthetic */ boolean hasEdgeConnecting(com.google.common.graph.EndpointPair endpointPair) {
        return super.hasEdgeConnecting(endpointPair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public final /* bridge */ /* synthetic */ boolean hasEdgeConnecting(java.lang.Object obj, java.lang.Object obj2) {
        return super.hasEdgeConnecting(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public final /* bridge */ /* synthetic */ java.util.Set incidentEdges(java.lang.Object obj) {
        return super.incidentEdges(obj);
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public final /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public final /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public final /* bridge */ /* synthetic */ java.util.Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public final /* bridge */ /* synthetic */ java.util.Set predecessors(java.lang.Object obj) {
        return super.predecessors((com.google.common.graph.ImmutableValueGraph<N, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.StandardValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public final /* bridge */ /* synthetic */ java.util.Set successors(java.lang.Object obj) {
        return super.successors((com.google.common.graph.ImmutableValueGraph<N, V>) obj);
    }

    private ImmutableValueGraph(com.google.common.graph.ValueGraph<N, V> valueGraph) {
        super(com.google.common.graph.ValueGraphBuilder.from(valueGraph), getNodeConnections(valueGraph), valueGraph.edges().size());
    }

    public static <N, V> com.google.common.graph.ImmutableValueGraph<N, V> copyOf(com.google.common.graph.ValueGraph<N, V> valueGraph) {
        if (valueGraph instanceof com.google.common.graph.ImmutableValueGraph) {
            return (com.google.common.graph.ImmutableValueGraph) valueGraph;
        }
        return new com.google.common.graph.ImmutableValueGraph<>(valueGraph);
    }

    @java.lang.Deprecated
    public static <N, V> com.google.common.graph.ImmutableValueGraph<N, V> copyOf(com.google.common.graph.ImmutableValueGraph<N, V> immutableValueGraph) {
        return (com.google.common.graph.ImmutableValueGraph) com.google.common.base.Preconditions.checkNotNull(immutableValueGraph);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public final com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
        return com.google.common.graph.ElementOrder.stable();
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.ValueGraph
    public final com.google.common.graph.ImmutableGraph<N> asGraph() {
        return new com.google.common.graph.ImmutableGraph<>(this);
    }

    private static <N, V> com.google.common.collect.ImmutableMap<N, com.google.common.graph.GraphConnections<N, V>> getNodeConnections(com.google.common.graph.ValueGraph<N, V> valueGraph) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        for (N n : valueGraph.nodes()) {
            builder.put(n, connectionsOf(valueGraph, n));
        }
        return builder.buildOrThrow();
    }

    private static <N, V> com.google.common.graph.GraphConnections<N, V> connectionsOf(final com.google.common.graph.ValueGraph<N, V> valueGraph, final N n) {
        com.google.common.base.Function function = new com.google.common.base.Function() { // from class: com.google.common.graph.ImmutableValueGraph$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Object requireNonNull;
                requireNonNull = java.util.Objects.requireNonNull(com.google.common.graph.ValueGraph.this.edgeValueOrDefault(n, obj, null));
                return requireNonNull;
            }
        };
        if (valueGraph.isDirected()) {
            return com.google.common.graph.DirectedGraphConnections.ofImmutable(n, valueGraph.incidentEdges(n), function);
        }
        return com.google.common.graph.UndirectedGraphConnections.ofImmutable(com.google.common.collect.Maps.asMap(valueGraph.adjacentNodes(n), function));
    }

    public static class Builder<N, V> {
        private final com.google.common.graph.MutableValueGraph<N, V> mutableValueGraph;

        Builder(com.google.common.graph.ValueGraphBuilder<N, V> valueGraphBuilder) {
            this.mutableValueGraph = valueGraphBuilder.copy().incidentEdgeOrder(com.google.common.graph.ElementOrder.stable()).build();
        }

        public com.google.common.graph.ImmutableValueGraph.Builder<N, V> addNode(N n) {
            this.mutableValueGraph.addNode(n);
            return this;
        }

        public com.google.common.graph.ImmutableValueGraph.Builder<N, V> putEdgeValue(N n, N n2, V v) {
            this.mutableValueGraph.putEdgeValue(n, n2, v);
            return this;
        }

        public com.google.common.graph.ImmutableValueGraph.Builder<N, V> putEdgeValue(com.google.common.graph.EndpointPair<N> endpointPair, V v) {
            this.mutableValueGraph.putEdgeValue(endpointPair, v);
            return this;
        }

        public com.google.common.graph.ImmutableValueGraph<N, V> build() {
            return com.google.common.graph.ImmutableValueGraph.copyOf(this.mutableValueGraph);
        }
    }
}
