package com.google.common.graph;

/* loaded from: classes9.dex */
public interface MutableGraph<N> extends com.google.common.graph.Graph<N> {
    boolean addNode(N n);

    boolean putEdge(com.google.common.graph.EndpointPair<N> endpointPair);

    boolean putEdge(N n, N n2);

    boolean removeEdge(com.google.common.graph.EndpointPair<N> endpointPair);

    boolean removeEdge(N n, N n2);

    boolean removeNode(N n);
}
