package com.google.common.graph;

/* loaded from: classes9.dex */
abstract class ForwardingValueGraph<N, V> extends com.google.common.graph.AbstractValueGraph<N, V> {
    abstract com.google.common.graph.ValueGraph<N, V> delegate();

    ForwardingValueGraph() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object obj) {
        return predecessors((com.google.common.graph.ForwardingValueGraph<N, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object obj) {
        return successors((com.google.common.graph.ForwardingValueGraph<N, V>) obj);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> nodes() {
        return delegate().nodes();
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    protected long edgeCount() {
        return delegate().edges().size();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
        return delegate().isDirected();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return delegate().allowsSelfLoops();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
        return delegate().nodeOrder();
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
        return delegate().incidentEdgeOrder();
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> adjacentNodes(N n) {
        return delegate().adjacentNodes(n);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> predecessors(N n) {
        return delegate().predecessors((com.google.common.graph.ValueGraph<N, V>) n);
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public java.util.Set<N> successors(N n) {
        return delegate().successors((com.google.common.graph.ValueGraph<N, V>) n);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int degree(N n) {
        return delegate().degree(n);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int inDegree(N n) {
        return delegate().inDegree(n);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public int outDegree(N n) {
        return delegate().outDegree(n);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n, N n2) {
        return delegate().hasEdgeConnecting(n, n2);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpointPair) {
        return delegate().hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.ValueGraph
    public V edgeValueOrDefault(N n, N n2, V v) {
        return delegate().edgeValueOrDefault(n, n2, v);
    }

    @Override // com.google.common.graph.ValueGraph
    public V edgeValueOrDefault(com.google.common.graph.EndpointPair<N> endpointPair, V v) {
        return delegate().edgeValueOrDefault(endpointPair, v);
    }
}
