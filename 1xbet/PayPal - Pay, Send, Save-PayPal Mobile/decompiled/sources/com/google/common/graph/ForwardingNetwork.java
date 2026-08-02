package com.google.common.graph;

/* loaded from: classes9.dex */
abstract class ForwardingNetwork<N, E> extends com.google.common.graph.AbstractNetwork<N, E> {
    abstract com.google.common.graph.Network<N, E> delegate();

    ForwardingNetwork() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object obj) {
        return predecessors((com.google.common.graph.ForwardingNetwork<N, E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object obj) {
        return successors((com.google.common.graph.ForwardingNetwork<N, E>) obj);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> nodes() {
        return delegate().nodes();
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edges() {
        return delegate().edges();
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return delegate().isDirected();
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return delegate().allowsParallelEdges();
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return delegate().allowsSelfLoops();
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
        return delegate().nodeOrder();
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<E> edgeOrder() {
        return delegate().edgeOrder();
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> adjacentNodes(N n) {
        return delegate().adjacentNodes(n);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> predecessors(N n) {
        return delegate().predecessors((com.google.common.graph.Network<N, E>) n);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> successors(N n) {
        return delegate().successors((com.google.common.graph.Network<N, E>) n);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> incidentEdges(N n) {
        return delegate().incidentEdges(n);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> inEdges(N n) {
        return delegate().inEdges(n);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> outEdges(N n) {
        return delegate().outEdges(n);
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.EndpointPair<N> incidentNodes(E e) {
        return delegate().incidentNodes(e);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> adjacentEdges(E e) {
        return delegate().adjacentEdges(e);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int degree(N n) {
        return delegate().degree(n);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int inDegree(N n) {
        return delegate().inDegree(n);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int outDegree(N n) {
        return delegate().outDegree(n);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(N n, N n2) {
        return delegate().edgesConnecting(n, n2);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> endpointPair) {
        return delegate().edgesConnecting(endpointPair);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public E edgeConnectingOrNull(N n, N n2) {
        return delegate().edgeConnectingOrNull(n, n2);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> endpointPair) {
        return delegate().edgeConnectingOrNull(endpointPair);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n, N n2) {
        return delegate().hasEdgeConnecting(n, n2);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpointPair) {
        return delegate().hasEdgeConnecting(endpointPair);
    }
}
