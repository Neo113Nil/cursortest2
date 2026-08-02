package com.google.common.graph;

@com.google.errorprone.annotations.Immutable(containerOf = {"N"})
/* loaded from: classes9.dex */
public class ImmutableGraph<N> extends com.google.common.graph.ForwardingGraph<N> {
    private final com.google.common.graph.BaseGraph<N> backingGraph;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set adjacentNodes(java.lang.Object obj) {
        return super.adjacentNodes(obj);
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int degree(java.lang.Object obj) {
        return super.degree(obj);
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(com.google.common.graph.EndpointPair endpointPair) {
        return super.hasEdgeConnecting(endpointPair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(java.lang.Object obj, java.lang.Object obj2) {
        return super.hasEdgeConnecting(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int inDegree(java.lang.Object obj) {
        return super.inDegree(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ java.util.Set incidentEdges(java.lang.Object obj) {
        return super.incidentEdges(obj);
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set nodes() {
        return super.nodes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int outDegree(java.lang.Object obj) {
        return super.outDegree(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set predecessors(java.lang.Object obj) {
        return super.predecessors((com.google.common.graph.ImmutableGraph<N>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set successors(java.lang.Object obj) {
        return super.successors((com.google.common.graph.ImmutableGraph<N>) obj);
    }

    ImmutableGraph(com.google.common.graph.BaseGraph<N> baseGraph) {
        this.backingGraph = baseGraph;
    }

    public static <N> com.google.common.graph.ImmutableGraph<N> copyOf(com.google.common.graph.Graph<N> graph) {
        if (graph instanceof com.google.common.graph.ImmutableGraph) {
            return (com.google.common.graph.ImmutableGraph) graph;
        }
        return new com.google.common.graph.ImmutableGraph<>(new com.google.common.graph.StandardValueGraph(com.google.common.graph.GraphBuilder.from(graph), getNodeConnections(graph), graph.edges().size()));
    }

    @java.lang.Deprecated
    public static <N> com.google.common.graph.ImmutableGraph<N> copyOf(com.google.common.graph.ImmutableGraph<N> immutableGraph) {
        return (com.google.common.graph.ImmutableGraph) com.google.common.base.Preconditions.checkNotNull(immutableGraph);
    }

    @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
        return com.google.common.graph.ElementOrder.stable();
    }

    private static <N> com.google.common.collect.ImmutableMap<N, com.google.common.graph.GraphConnections<N, com.google.common.graph.GraphConstants.Presence>> getNodeConnections(com.google.common.graph.Graph<N> graph) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        for (N n : graph.nodes()) {
            builder.put(n, connectionsOf(graph, n));
        }
        return builder.buildOrThrow();
    }

    private static <N> com.google.common.graph.GraphConnections<N, com.google.common.graph.GraphConstants.Presence> connectionsOf(com.google.common.graph.Graph<N> graph, N n) {
        com.google.common.base.Function constant = com.google.common.base.Functions.constant(com.google.common.graph.GraphConstants.Presence.EDGE_EXISTS);
        if (graph.isDirected()) {
            return com.google.common.graph.DirectedGraphConnections.ofImmutable(n, graph.incidentEdges(n), constant);
        }
        return com.google.common.graph.UndirectedGraphConnections.ofImmutable(com.google.common.collect.Maps.asMap(graph.adjacentNodes(n), constant));
    }

    @Override // com.google.common.graph.ForwardingGraph
    com.google.common.graph.BaseGraph<N> delegate() {
        return this.backingGraph;
    }

    public static class Builder<N> {
        private final com.google.common.graph.MutableGraph<N> mutableGraph;

        Builder(com.google.common.graph.GraphBuilder<N> graphBuilder) {
            this.mutableGraph = graphBuilder.copy().incidentEdgeOrder(com.google.common.graph.ElementOrder.stable()).build();
        }

        public com.google.common.graph.ImmutableGraph.Builder<N> addNode(N n) {
            this.mutableGraph.addNode(n);
            return this;
        }

        public com.google.common.graph.ImmutableGraph.Builder<N> putEdge(N n, N n2) {
            this.mutableGraph.putEdge(n, n2);
            return this;
        }

        public com.google.common.graph.ImmutableGraph.Builder<N> putEdge(com.google.common.graph.EndpointPair<N> endpointPair) {
            this.mutableGraph.putEdge(endpointPair);
            return this;
        }

        public com.google.common.graph.ImmutableGraph<N> build() {
            return com.google.common.graph.ImmutableGraph.copyOf(this.mutableGraph);
        }
    }
}
