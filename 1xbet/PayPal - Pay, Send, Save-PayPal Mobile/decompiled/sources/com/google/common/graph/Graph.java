package com.google.common.graph;

@com.google.errorprone.annotations.DoNotMock("Use GraphBuilder to create a real instance")
/* loaded from: classes9.dex */
public interface Graph<N> extends com.google.common.graph.BaseGraph<N> {
    java.util.Set<N> adjacentNodes(N n);

    boolean allowsSelfLoops();

    @Override // com.google.common.graph.BaseGraph
    int degree(N n);

    @Override // com.google.common.graph.BaseGraph
    java.util.Set<com.google.common.graph.EndpointPair<N>> edges();

    boolean equals(java.lang.Object obj);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpointPair);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(N n, N n2);

    int hashCode();

    @Override // com.google.common.graph.BaseGraph
    int inDegree(N n);

    @Override // com.google.common.graph.BaseGraph
    com.google.common.graph.ElementOrder<N> incidentEdgeOrder();

    @Override // com.google.common.graph.BaseGraph
    java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N n);

    boolean isDirected();

    com.google.common.graph.ElementOrder<N> nodeOrder();

    java.util.Set<N> nodes();

    @Override // com.google.common.graph.BaseGraph
    int outDegree(N n);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    java.util.Set<N> predecessors(N n);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    java.util.Set<N> successors(N n);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default java.lang.Iterable predecessors(java.lang.Object obj) {
        return predecessors((com.google.common.graph.Graph<N>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default java.lang.Iterable successors(java.lang.Object obj) {
        return successors((com.google.common.graph.Graph<N>) obj);
    }
}
