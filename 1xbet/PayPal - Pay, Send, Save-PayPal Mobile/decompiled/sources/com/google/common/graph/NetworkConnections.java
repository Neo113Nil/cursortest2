package com.google.common.graph;

/* loaded from: classes9.dex */
interface NetworkConnections<N, E> {
    void addInEdge(E e, N n, boolean z);

    void addOutEdge(E e, N n);

    N adjacentNode(E e);

    java.util.Set<N> adjacentNodes();

    java.util.Set<E> edgesConnecting(N n);

    java.util.Set<E> inEdges();

    java.util.Set<E> incidentEdges();

    java.util.Set<E> outEdges();

    java.util.Set<N> predecessors();

    N removeInEdge(E e, boolean z);

    N removeOutEdge(E e);

    java.util.Set<N> successors();
}
