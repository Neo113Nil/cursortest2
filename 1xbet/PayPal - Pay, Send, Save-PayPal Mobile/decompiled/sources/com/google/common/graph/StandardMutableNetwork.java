package com.google.common.graph;

/* loaded from: classes9.dex */
final class StandardMutableNetwork<N, E> extends com.google.common.graph.StandardNetwork<N, E> implements com.google.common.graph.MutableNetwork<N, E> {
    StandardMutableNetwork(com.google.common.graph.NetworkBuilder<? super N, ? super E> networkBuilder) {
        super(networkBuilder);
    }

    @Override // com.google.common.graph.MutableNetwork
    public final boolean addNode(N n) {
        com.google.common.base.Preconditions.checkNotNull(n, "node");
        if (containsNode(n)) {
            return false;
        }
        addNodeInternal(n);
        return true;
    }

    private com.google.common.graph.NetworkConnections<N, E> addNodeInternal(N n) {
        com.google.common.graph.NetworkConnections<N, E> newConnections = newConnections();
        com.google.common.base.Preconditions.checkState(this.nodeConnections.put(n, newConnections) == null);
        return newConnections;
    }

    @Override // com.google.common.graph.MutableNetwork
    public final boolean addEdge(N n, N n2, E e) {
        com.google.common.base.Preconditions.checkNotNull(n, "nodeU");
        com.google.common.base.Preconditions.checkNotNull(n2, "nodeV");
        com.google.common.base.Preconditions.checkNotNull(e, "edge");
        if (containsEdge(e)) {
            com.google.common.graph.EndpointPair<N> incidentNodes = incidentNodes(e);
            com.google.common.graph.EndpointPair of = com.google.common.graph.EndpointPair.of(this, n, n2);
            com.google.common.base.Preconditions.checkArgument(incidentNodes.equals(of), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", e, incidentNodes, of);
            return false;
        }
        com.google.common.graph.NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n);
        if (!allowsParallelEdges()) {
            com.google.common.base.Preconditions.checkArgument(networkConnections == null || !networkConnections.successors().contains(n2), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", n, n2);
        }
        boolean equals = n.equals(n2);
        if (!allowsSelfLoops()) {
            com.google.common.base.Preconditions.checkArgument(!equals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n);
        }
        if (networkConnections == null) {
            networkConnections = addNodeInternal(n);
        }
        networkConnections.addOutEdge(e, n2);
        com.google.common.graph.NetworkConnections<N, E> networkConnections2 = this.nodeConnections.get(n2);
        if (networkConnections2 == null) {
            networkConnections2 = addNodeInternal(n2);
        }
        networkConnections2.addInEdge(e, n, equals);
        this.edgeToReferenceNode.put(e, n);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public final boolean addEdge(com.google.common.graph.EndpointPair<N> endpointPair, E e) {
        validateEndpoints(endpointPair);
        return addEdge(endpointPair.nodeU(), endpointPair.nodeV(), e);
    }

    @Override // com.google.common.graph.MutableNetwork
    public final boolean removeNode(N n) {
        com.google.common.base.Preconditions.checkNotNull(n, "node");
        com.google.common.graph.NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n);
        if (networkConnections == null) {
            return false;
        }
        com.google.common.collect.UnmodifiableIterator<E> it = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) networkConnections.incidentEdges()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.nodeConnections.remove(n);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public final boolean removeEdge(E e) {
        com.google.common.base.Preconditions.checkNotNull(e, "edge");
        N n = this.edgeToReferenceNode.get(e);
        boolean z = false;
        if (n == null) {
            return false;
        }
        com.google.common.graph.NetworkConnections networkConnections = (com.google.common.graph.NetworkConnections) java.util.Objects.requireNonNull(this.nodeConnections.get(n));
        java.lang.Object adjacentNode = networkConnections.adjacentNode(e);
        com.google.common.graph.NetworkConnections networkConnections2 = (com.google.common.graph.NetworkConnections) java.util.Objects.requireNonNull(this.nodeConnections.get(adjacentNode));
        networkConnections.removeOutEdge(e);
        if (allowsSelfLoops() && n.equals(adjacentNode)) {
            z = true;
        }
        networkConnections2.removeInEdge(e, z);
        this.edgeToReferenceNode.remove(e);
        return true;
    }

    private com.google.common.graph.NetworkConnections<N, E> newConnections() {
        if (isDirected()) {
            if (allowsParallelEdges()) {
                return com.google.common.graph.DirectedMultiNetworkConnections.of();
            }
            return com.google.common.graph.DirectedNetworkConnections.of();
        }
        if (allowsParallelEdges()) {
            return com.google.common.graph.UndirectedMultiNetworkConnections.of();
        }
        return com.google.common.graph.UndirectedNetworkConnections.of();
    }
}
