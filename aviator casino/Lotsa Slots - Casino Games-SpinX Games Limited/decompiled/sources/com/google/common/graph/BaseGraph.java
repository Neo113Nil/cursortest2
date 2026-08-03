package com.google.common.graph;

@com.google.common.graph.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
interface BaseGraph<N> extends com.google.common.graph.SuccessorsFunction<N>, com.google.common.graph.PredecessorsFunction<N> {
    java.util.Set<N> adjacentNodes(N node);

    boolean allowsSelfLoops();

    int degree(N node);

    java.util.Set<com.google.common.graph.EndpointPair<N>> edges();

    boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints);

    boolean hasEdgeConnecting(N nodeU, N nodeV);

    int inDegree(N node);

    com.google.common.graph.ElementOrder<N> incidentEdgeOrder();

    java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N node);

    boolean isDirected();

    com.google.common.graph.ElementOrder<N> nodeOrder();

    java.util.Set<N> nodes();

    int outDegree(N node);

    @Override // com.google.common.graph.PredecessorsFunction
    java.util.Set<N> predecessors(N node);

    @Override // com.google.common.graph.SuccessorsFunction
    java.util.Set<N> successors(N node);

    /* renamed from: com.google.common.graph.BaseGraph$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
