package com.google.common.graph;

/* loaded from: classes9.dex */
interface BaseGraph<N> extends com.google.common.graph.SuccessorsFunction<N>, com.google.common.graph.PredecessorsFunction<N> {
    java.util.Set<N> adjacentNodes(N n);

    boolean allowsSelfLoops();

    int degree(N n);

    java.util.Set<com.google.common.graph.EndpointPair<N>> edges();

    boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpointPair);

    boolean hasEdgeConnecting(N n, N n2);

    int inDegree(N n);

    com.google.common.graph.ElementOrder<N> incidentEdgeOrder();

    java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N n);

    boolean isDirected();

    com.google.common.graph.ElementOrder<N> nodeOrder();

    java.util.Set<N> nodes();

    int outDegree(N n);

    java.util.Set<N> predecessors(N n);

    @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    java.util.Set<N> successors(N n);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default java.lang.Iterable predecessors(java.lang.Object obj) {
        return predecessors((com.google.common.graph.BaseGraph<N>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    /* bridge */ /* synthetic */ default java.lang.Iterable successors(java.lang.Object obj) {
        return successors((com.google.common.graph.BaseGraph<N>) obj);
    }
}
