package com.google.common.graph;

/* loaded from: classes9.dex */
public interface MutableValueGraph<N, V> extends com.google.common.graph.ValueGraph<N, V> {
    boolean addNode(N n);

    V putEdgeValue(com.google.common.graph.EndpointPair<N> endpointPair, V v);

    V putEdgeValue(N n, N n2, V v);

    V removeEdge(com.google.common.graph.EndpointPair<N> endpointPair);

    V removeEdge(N n, N n2);

    boolean removeNode(N n);
}
