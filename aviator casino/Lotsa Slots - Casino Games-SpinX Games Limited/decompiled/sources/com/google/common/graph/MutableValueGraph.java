package com.google.common.graph;

@com.google.common.graph.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface MutableValueGraph<N, V> extends com.google.common.graph.ValueGraph<N, V> {
    boolean addNode(N node);

    @javax.annotation.CheckForNull
    V putEdgeValue(com.google.common.graph.EndpointPair<N> endpoints, V value);

    @javax.annotation.CheckForNull
    V putEdgeValue(N nodeU, N nodeV, V value);

    @javax.annotation.CheckForNull
    V removeEdge(com.google.common.graph.EndpointPair<N> endpoints);

    @javax.annotation.CheckForNull
    V removeEdge(N nodeU, N nodeV);

    boolean removeNode(N node);
}
