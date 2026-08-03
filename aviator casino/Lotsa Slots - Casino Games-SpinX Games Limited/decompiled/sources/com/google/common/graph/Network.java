package com.google.common.graph;

@com.google.errorprone.annotations.DoNotMock("Use NetworkBuilder to create a real instance")
@com.google.common.graph.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface Network<N, E> extends com.google.common.graph.SuccessorsFunction<N>, com.google.common.graph.PredecessorsFunction<N> {
    java.util.Set<E> adjacentEdges(E edge);

    java.util.Set<N> adjacentNodes(N node);

    boolean allowsParallelEdges();

    boolean allowsSelfLoops();

    com.google.common.graph.Graph<N> asGraph();

    int degree(N node);

    @javax.annotation.CheckForNull
    E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> endpoints);

    @javax.annotation.CheckForNull
    E edgeConnectingOrNull(N nodeU, N nodeV);

    com.google.common.graph.ElementOrder<E> edgeOrder();

    java.util.Set<E> edges();

    java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> endpoints);

    java.util.Set<E> edgesConnecting(N nodeU, N nodeV);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object object);

    boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints);

    boolean hasEdgeConnecting(N nodeU, N nodeV);

    int hashCode();

    int inDegree(N node);

    java.util.Set<E> inEdges(N node);

    java.util.Set<E> incidentEdges(N node);

    com.google.common.graph.EndpointPair<N> incidentNodes(E edge);

    boolean isDirected();

    com.google.common.graph.ElementOrder<N> nodeOrder();

    java.util.Set<N> nodes();

    int outDegree(N node);

    java.util.Set<E> outEdges(N node);

    @Override // com.google.common.graph.PredecessorsFunction
    java.util.Set<N> predecessors(N node);

    @Override // com.google.common.graph.SuccessorsFunction
    java.util.Set<N> successors(N node);

    /* renamed from: com.google.common.graph.Network$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
