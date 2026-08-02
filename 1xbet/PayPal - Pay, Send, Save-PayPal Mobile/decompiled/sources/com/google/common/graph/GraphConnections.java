package com.google.common.graph;

/* loaded from: classes9.dex */
interface GraphConnections<N, V> {
    void addPredecessor(N n, V v);

    V addSuccessor(N n, V v);

    java.util.Set<N> adjacentNodes();

    java.util.Iterator<com.google.common.graph.EndpointPair<N>> incidentEdgeIterator(N n);

    java.util.Set<N> predecessors();

    void removePredecessor(N n);

    V removeSuccessor(N n);

    java.util.Set<N> successors();

    V value(N n);
}
