package com.google.common.graph;

/* loaded from: classes9.dex */
public interface MutableNetwork<N, E> extends com.google.common.graph.Network<N, E> {
    boolean addEdge(com.google.common.graph.EndpointPair<N> endpointPair, E e);

    boolean addEdge(N n, N n2, E e);

    boolean addNode(N n);

    boolean removeEdge(E e);

    boolean removeNode(N n);
}
