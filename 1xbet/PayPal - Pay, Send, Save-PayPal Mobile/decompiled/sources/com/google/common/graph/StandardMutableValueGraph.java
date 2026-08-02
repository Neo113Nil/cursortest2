package com.google.common.graph;

/* loaded from: classes9.dex */
final class StandardMutableValueGraph<N, V> extends com.google.common.graph.StandardValueGraph<N, V> implements com.google.common.graph.MutableValueGraph<N, V> {
    private final com.google.common.graph.ElementOrder<N> incidentEdgeOrder;

    StandardMutableValueGraph(com.google.common.graph.AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        super(abstractGraphBuilder);
        this.incidentEdgeOrder = (com.google.common.graph.ElementOrder<N>) abstractGraphBuilder.incidentEdgeOrder.cast();
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public final com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
        return this.incidentEdgeOrder;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public final boolean addNode(N n) {
        com.google.common.base.Preconditions.checkNotNull(n, "node");
        if (containsNode(n)) {
            return false;
        }
        addNodeInternal(n);
        return true;
    }

    private com.google.common.graph.GraphConnections<N, V> addNodeInternal(N n) {
        com.google.common.graph.GraphConnections<N, V> newConnections = newConnections();
        com.google.common.base.Preconditions.checkState(this.nodeConnections.put(n, newConnections) == null);
        return newConnections;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public final V putEdgeValue(N n, N n2, V v) {
        com.google.common.base.Preconditions.checkNotNull(n, "nodeU");
        com.google.common.base.Preconditions.checkNotNull(n2, "nodeV");
        com.google.common.base.Preconditions.checkNotNull(v, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        if (!allowsSelfLoops()) {
            com.google.common.base.Preconditions.checkArgument(!n.equals(n2), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n);
        }
        com.google.common.graph.GraphConnections<N, V> graphConnections = this.nodeConnections.get(n);
        if (graphConnections == null) {
            graphConnections = addNodeInternal(n);
        }
        V addSuccessor = graphConnections.addSuccessor(n2, v);
        com.google.common.graph.GraphConnections<N, V> graphConnections2 = this.nodeConnections.get(n2);
        if (graphConnections2 == null) {
            graphConnections2 = addNodeInternal(n2);
        }
        graphConnections2.addPredecessor(n, v);
        if (addSuccessor == null) {
            long j = this.edgeCount + 1;
            this.edgeCount = j;
            com.google.common.graph.Graphs.checkPositive(j);
        }
        return addSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public final V putEdgeValue(com.google.common.graph.EndpointPair<N> endpointPair, V v) {
        validateEndpoints(endpointPair);
        return putEdgeValue(endpointPair.nodeU(), endpointPair.nodeV(), v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.MutableValueGraph
    public final boolean removeNode(N n) {
        com.google.common.base.Preconditions.checkNotNull(n, "node");
        com.google.common.graph.GraphConnections<N, V> graphConnections = this.nodeConnections.get(n);
        if (graphConnections == 0) {
            return false;
        }
        if (allowsSelfLoops() && graphConnections.removeSuccessor(n) != null) {
            graphConnections.removePredecessor(n);
            this.edgeCount--;
        }
        java.util.Iterator it = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) graphConnections.successors()).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            ((com.google.common.graph.GraphConnections) java.util.Objects.requireNonNull(this.nodeConnections.getWithoutCaching(next))).removePredecessor(n);
            java.util.Objects.requireNonNull(graphConnections.removeSuccessor(next));
            this.edgeCount--;
        }
        if (isDirected()) {
            java.util.Iterator it2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) graphConnections.predecessors()).iterator();
            while (it2.hasNext()) {
                java.lang.Object next2 = it2.next();
                com.google.common.base.Preconditions.checkState(((com.google.common.graph.GraphConnections) java.util.Objects.requireNonNull(this.nodeConnections.getWithoutCaching(next2))).removeSuccessor(n) != null);
                graphConnections.removePredecessor(next2);
                this.edgeCount--;
            }
        }
        this.nodeConnections.remove(n);
        com.google.common.graph.Graphs.checkNonNegative(this.edgeCount);
        return true;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public final V removeEdge(N n, N n2) {
        com.google.common.base.Preconditions.checkNotNull(n, "nodeU");
        com.google.common.base.Preconditions.checkNotNull(n2, "nodeV");
        com.google.common.graph.GraphConnections<N, V> graphConnections = this.nodeConnections.get(n);
        com.google.common.graph.GraphConnections<N, V> graphConnections2 = this.nodeConnections.get(n2);
        if (graphConnections == null || graphConnections2 == null) {
            return null;
        }
        V removeSuccessor = graphConnections.removeSuccessor(n2);
        if (removeSuccessor != null) {
            graphConnections2.removePredecessor(n);
            long j = this.edgeCount - 1;
            this.edgeCount = j;
            com.google.common.graph.Graphs.checkNonNegative(j);
        }
        return removeSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public final V removeEdge(com.google.common.graph.EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return removeEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    private com.google.common.graph.GraphConnections<N, V> newConnections() {
        if (isDirected()) {
            return com.google.common.graph.DirectedGraphConnections.of(this.incidentEdgeOrder);
        }
        return com.google.common.graph.UndirectedGraphConnections.of(this.incidentEdgeOrder);
    }
}
