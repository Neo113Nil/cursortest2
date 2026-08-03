package com.google.common.graph;

@com.google.common.graph.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
abstract class ForwardingNetwork<N, E> extends com.google.common.graph.AbstractNetwork<N, E> {
    abstract com.google.common.graph.Network<N, E> delegate();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object node) {
        return predecessors((com.google.common.graph.ForwardingNetwork<N, E>) node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object node) {
        return successors((com.google.common.graph.ForwardingNetwork<N, E>) node);
    }

    ForwardingNetwork() {
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
    public java.util.Set<N> adjacentNodes(N node) {
        return delegate().adjacentNodes(node);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.PredecessorsFunction
    public java.util.Set<N> predecessors(N node) {
        return delegate().predecessors((com.google.common.graph.Network<N, E>) node);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.SuccessorsFunction
    public java.util.Set<N> successors(N node) {
        return delegate().successors((com.google.common.graph.Network<N, E>) node);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> incidentEdges(N node) {
        return delegate().incidentEdges(node);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> inEdges(N node) {
        return delegate().inEdges(node);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> outEdges(N node) {
        return delegate().outEdges(node);
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.EndpointPair<N> incidentNodes(E edge) {
        return delegate().incidentNodes(edge);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> adjacentEdges(E edge) {
        return delegate().adjacentEdges(edge);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int degree(N node) {
        return delegate().degree(node);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int inDegree(N node) {
        return delegate().inDegree(node);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int outDegree(N node) {
        return delegate().outDegree(node);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(N nodeU, N nodeV) {
        return delegate().edgesConnecting(nodeU, nodeV);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> endpoints) {
        return delegate().edgesConnecting(endpoints);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    @javax.annotation.CheckForNull
    public E edgeConnectingOrNull(N nodeU, N nodeV) {
        return delegate().edgeConnectingOrNull(nodeU, nodeV);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    @javax.annotation.CheckForNull
    public E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> endpoints) {
        return delegate().edgeConnectingOrNull(endpoints);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(N nodeU, N nodeV) {
        return delegate().hasEdgeConnecting(nodeU, nodeV);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpoints) {
        return delegate().hasEdgeConnecting(endpoints);
    }
}
