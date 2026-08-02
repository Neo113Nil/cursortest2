package com.google.common.graph;

/* loaded from: classes9.dex */
final class StandardMutableGraph<N> extends com.google.common.graph.ForwardingGraph<N> implements com.google.common.graph.MutableGraph<N> {
    private final com.google.common.graph.MutableValueGraph<N, com.google.common.graph.GraphConstants.Presence> backingValueGraph;

    StandardMutableGraph(com.google.common.graph.AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        this.backingValueGraph = new com.google.common.graph.StandardMutableValueGraph(abstractGraphBuilder);
    }

    @Override // com.google.common.graph.ForwardingGraph
    final com.google.common.graph.BaseGraph<N> delegate() {
        return this.backingValueGraph;
    }

    @Override // com.google.common.graph.MutableGraph
    public final boolean addNode(N n) {
        return this.backingValueGraph.addNode(n);
    }

    @Override // com.google.common.graph.MutableGraph
    public final boolean putEdge(N n, N n2) {
        return this.backingValueGraph.putEdgeValue(n, n2, com.google.common.graph.GraphConstants.Presence.EDGE_EXISTS) == null;
    }

    @Override // com.google.common.graph.MutableGraph
    public final boolean putEdge(com.google.common.graph.EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return putEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.MutableGraph
    public final boolean removeNode(N n) {
        return this.backingValueGraph.removeNode(n);
    }

    @Override // com.google.common.graph.MutableGraph
    public final boolean removeEdge(N n, N n2) {
        return this.backingValueGraph.removeEdge(n, n2) != null;
    }

    @Override // com.google.common.graph.MutableGraph
    public final boolean removeEdge(com.google.common.graph.EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return removeEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }
}
