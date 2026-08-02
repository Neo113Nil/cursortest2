package com.google.common.graph;

/* loaded from: classes9.dex */
public final class Graphs extends com.google.common.graph.GraphsBridgeMethods {

    enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    private Graphs() {
    }

    public static <N> boolean hasCycle(com.google.common.graph.Graph<N> graph) {
        int size = graph.edges().size();
        if (size == 0) {
            return false;
        }
        if (!graph.isDirected() && size >= graph.nodes().size()) {
            return true;
        }
        java.util.HashMap newHashMapWithExpectedSize = com.google.common.collect.Maps.newHashMapWithExpectedSize(graph.nodes().size());
        java.util.Iterator<N> it = graph.nodes().iterator();
        while (it.hasNext()) {
            if (subgraphHasCycle(graph, newHashMapWithExpectedSize, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasCycle(com.google.common.graph.Network<?, ?> network) {
        if (network.isDirected() || !network.allowsParallelEdges() || network.edges().size() <= network.asGraph().edges().size()) {
            return hasCycle(network.asGraph());
        }
        return true;
    }

    private static <N> boolean subgraphHasCycle(com.google.common.graph.Graph<N> graph, java.util.Map<java.lang.Object, com.google.common.graph.Graphs.NodeVisitState> map, N n) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.addLast(new com.google.common.graph.Graphs.NodeAndRemainingSuccessors(n));
        while (!arrayDeque.isEmpty()) {
            com.google.common.graph.Graphs.NodeAndRemainingSuccessors nodeAndRemainingSuccessors = (com.google.common.graph.Graphs.NodeAndRemainingSuccessors) arrayDeque.removeLast();
            com.google.common.graph.Graphs.NodeAndRemainingSuccessors nodeAndRemainingSuccessors2 = (com.google.common.graph.Graphs.NodeAndRemainingSuccessors) arrayDeque.peekLast();
            arrayDeque.addLast(nodeAndRemainingSuccessors);
            N n2 = nodeAndRemainingSuccessors.node;
            N n3 = nodeAndRemainingSuccessors2 == null ? null : nodeAndRemainingSuccessors2.node;
            if (nodeAndRemainingSuccessors.remainingSuccessors == null) {
                com.google.common.graph.Graphs.NodeVisitState nodeVisitState = map.get(n2);
                if (nodeVisitState == com.google.common.graph.Graphs.NodeVisitState.COMPLETE) {
                    arrayDeque.removeLast();
                } else {
                    if (nodeVisitState == com.google.common.graph.Graphs.NodeVisitState.PENDING) {
                        return true;
                    }
                    map.put(n2, com.google.common.graph.Graphs.NodeVisitState.PENDING);
                    nodeAndRemainingSuccessors.remainingSuccessors = new java.util.ArrayDeque(graph.successors((com.google.common.graph.Graph<N>) n2));
                }
            }
            if (!nodeAndRemainingSuccessors.remainingSuccessors.isEmpty()) {
                N remove = nodeAndRemainingSuccessors.remainingSuccessors.remove();
                if (canTraverseWithoutReusingEdge(graph, remove, n3)) {
                    arrayDeque.addLast(new com.google.common.graph.Graphs.NodeAndRemainingSuccessors(remove));
                }
            }
            arrayDeque.removeLast();
            map.put(n2, com.google.common.graph.Graphs.NodeVisitState.COMPLETE);
        }
        return false;
    }

    static final class NodeAndRemainingSuccessors<N> {
        final N node;
        java.util.Queue<N> remainingSuccessors;

        NodeAndRemainingSuccessors(N n) {
            this.node = n;
        }
    }

    private static boolean canTraverseWithoutReusingEdge(com.google.common.graph.Graph<?> graph, java.lang.Object obj, java.lang.Object obj2) {
        return graph.isDirected() || !java.util.Objects.equals(obj2, obj);
    }

    public static <N> com.google.common.graph.ImmutableGraph<N> transitiveClosure(com.google.common.graph.Graph<N> graph) {
        com.google.common.graph.ImmutableGraph.Builder<N1> immutable = com.google.common.graph.GraphBuilder.from(graph).allowsSelfLoops(true).immutable();
        if (graph.isDirected()) {
            for (N n : graph.nodes()) {
                java.util.Iterator it = reachableNodes((com.google.common.graph.Graph) graph, (java.lang.Object) n).iterator();
                while (it.hasNext()) {
                    immutable.putEdge(n, it.next());
                }
            }
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (N n2 : graph.nodes()) {
                if (!hashSet.contains(n2)) {
                    com.google.common.collect.ImmutableSet reachableNodes = reachableNodes((com.google.common.graph.Graph) graph, (java.lang.Object) n2);
                    hashSet.addAll(reachableNodes);
                    int i = 1;
                    for (java.lang.Object obj : reachableNodes) {
                        java.util.Iterator it2 = com.google.common.collect.Iterables.limit(reachableNodes, i).iterator();
                        while (it2.hasNext()) {
                            immutable.putEdge(obj, it2.next());
                        }
                        i++;
                    }
                }
            }
        }
        return immutable.build();
    }

    public static <N> com.google.common.collect.ImmutableSet<N> reachableNodes(com.google.common.graph.Graph<N> graph, N n) {
        com.google.common.base.Preconditions.checkArgument(graph.nodes().contains(n), "Node %s is not an element of this graph.", n);
        return com.google.common.collect.ImmutableSet.copyOf(com.google.common.graph.Traverser.forGraph(graph).breadthFirst((com.google.common.graph.Traverser) n));
    }

    public static <N> com.google.common.graph.Graph<N> transpose(com.google.common.graph.Graph<N> graph) {
        if (!graph.isDirected()) {
            return graph;
        }
        if (!(graph instanceof com.google.common.graph.Graphs.TransposedGraph)) {
            return new com.google.common.graph.Graphs.TransposedGraph(graph);
        }
        return ((com.google.common.graph.Graphs.TransposedGraph) graph).graph;
    }

    public static <N, V> com.google.common.graph.ValueGraph<N, V> transpose(com.google.common.graph.ValueGraph<N, V> valueGraph) {
        if (!valueGraph.isDirected()) {
            return valueGraph;
        }
        if (!(valueGraph instanceof com.google.common.graph.Graphs.TransposedValueGraph)) {
            return new com.google.common.graph.Graphs.TransposedValueGraph(valueGraph);
        }
        return ((com.google.common.graph.Graphs.TransposedValueGraph) valueGraph).graph;
    }

    public static <N, E> com.google.common.graph.Network<N, E> transpose(com.google.common.graph.Network<N, E> network) {
        if (!network.isDirected()) {
            return network;
        }
        if (!(network instanceof com.google.common.graph.Graphs.TransposedNetwork)) {
            return new com.google.common.graph.Graphs.TransposedNetwork(network);
        }
        return ((com.google.common.graph.Graphs.TransposedNetwork) network).network;
    }

    static <N> com.google.common.graph.EndpointPair<N> transpose(com.google.common.graph.EndpointPair<N> endpointPair) {
        return endpointPair.isOrdered() ? com.google.common.graph.EndpointPair.ordered(endpointPair.target(), endpointPair.source()) : endpointPair;
    }

    static final class TransposedGraph<N> extends com.google.common.graph.ForwardingGraph<N> {
        private final com.google.common.graph.Graph<N> graph;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public final /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object obj) {
            return predecessors((com.google.common.graph.Graphs.TransposedGraph<N>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public final /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object obj) {
            return successors((com.google.common.graph.Graphs.TransposedGraph<N>) obj);
        }

        TransposedGraph(com.google.common.graph.Graph<N> graph) {
            this.graph = graph;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.graph.ForwardingGraph
        public final com.google.common.graph.Graph<N> delegate() {
            return this.graph;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public final java.util.Set<N> predecessors(N n) {
            return delegate().successors((com.google.common.graph.Graph<N>) n);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public final java.util.Set<N> successors(N n) {
            return delegate().predecessors((com.google.common.graph.Graph<N>) n);
        }

        /* renamed from: com.google.common.graph.Graphs$TransposedGraph$1, reason: invalid class name */
        class AnonymousClass1 extends com.google.common.graph.IncidentEdgeSet<N> {
            AnonymousClass1(com.google.common.graph.BaseGraph baseGraph, java.lang.Object obj) {
                super(baseGraph, obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<com.google.common.graph.EndpointPair<N>> iterator() {
                return com.google.common.collect.Iterators.transform(com.google.common.graph.Graphs.TransposedGraph.this.delegate().incidentEdges(this.node).iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.Graphs$TransposedGraph$1$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.common.graph.Graphs.TransposedGraph.AnonymousClass1.this.m10336x5749e417((com.google.common.graph.EndpointPair) obj);
                    }
                });
            }

            /* renamed from: lambda$iterator$0$com-google-common-graph-Graphs$TransposedGraph$1, reason: not valid java name */
            /* synthetic */ com.google.common.graph.EndpointPair m10336x5749e417(com.google.common.graph.EndpointPair endpointPair) {
                return com.google.common.graph.EndpointPair.of((com.google.common.graph.Graph<?>) com.google.common.graph.Graphs.TransposedGraph.this.delegate(), endpointPair.nodeV(), endpointPair.nodeU());
            }
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public final java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N n) {
            return new com.google.common.graph.Graphs.TransposedGraph.AnonymousClass1(this, n);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public final int inDegree(N n) {
            return delegate().outDegree(n);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public final int outDegree(N n) {
            return delegate().inDegree(n);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public final boolean hasEdgeConnecting(N n, N n2) {
            return delegate().hasEdgeConnecting(n2, n);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public final boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(com.google.common.graph.Graphs.transpose(endpointPair));
        }
    }

    static final class TransposedValueGraph<N, V> extends com.google.common.graph.ForwardingValueGraph<N, V> {
        private final com.google.common.graph.ValueGraph<N, V> graph;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public final /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object obj) {
            return predecessors((com.google.common.graph.Graphs.TransposedValueGraph<N, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public final /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object obj) {
            return successors((com.google.common.graph.Graphs.TransposedValueGraph<N, V>) obj);
        }

        TransposedValueGraph(com.google.common.graph.ValueGraph<N, V> valueGraph) {
            this.graph = valueGraph;
        }

        @Override // com.google.common.graph.ForwardingValueGraph
        final com.google.common.graph.ValueGraph<N, V> delegate() {
            return this.graph;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public final java.util.Set<N> predecessors(N n) {
            return delegate().successors((com.google.common.graph.ValueGraph<N, V>) n);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public final java.util.Set<N> successors(N n) {
            return delegate().predecessors((com.google.common.graph.ValueGraph<N, V>) n);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public final int inDegree(N n) {
            return delegate().outDegree(n);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public final int outDegree(N n) {
            return delegate().inDegree(n);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public final boolean hasEdgeConnecting(N n, N n2) {
            return delegate().hasEdgeConnecting(n2, n);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public final boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(com.google.common.graph.Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        public final V edgeValueOrDefault(N n, N n2, V v) {
            return delegate().edgeValueOrDefault(n2, n, v);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        public final V edgeValueOrDefault(com.google.common.graph.EndpointPair<N> endpointPair, V v) {
            return delegate().edgeValueOrDefault(com.google.common.graph.Graphs.transpose(endpointPair), v);
        }
    }

    static final class TransposedNetwork<N, E> extends com.google.common.graph.ForwardingNetwork<N, E> {
        private final com.google.common.graph.Network<N, E> network;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public final /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object obj) {
            return predecessors((com.google.common.graph.Graphs.TransposedNetwork<N, E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public final /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object obj) {
            return successors((com.google.common.graph.Graphs.TransposedNetwork<N, E>) obj);
        }

        TransposedNetwork(com.google.common.graph.Network<N, E> network) {
            this.network = network;
        }

        @Override // com.google.common.graph.ForwardingNetwork
        final com.google.common.graph.Network<N, E> delegate() {
            return this.network;
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public final java.util.Set<N> predecessors(N n) {
            return delegate().successors((com.google.common.graph.Network<N, E>) n);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public final java.util.Set<N> successors(N n) {
            return delegate().predecessors((com.google.common.graph.Network<N, E>) n);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public final int inDegree(N n) {
            return delegate().outDegree(n);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public final int outDegree(N n) {
            return delegate().inDegree(n);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public final java.util.Set<E> inEdges(N n) {
            return delegate().outEdges(n);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public final java.util.Set<E> outEdges(N n) {
            return delegate().inEdges(n);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public final com.google.common.graph.EndpointPair<N> incidentNodes(E e) {
            com.google.common.graph.EndpointPair<N> incidentNodes = delegate().incidentNodes(e);
            return com.google.common.graph.EndpointPair.of((com.google.common.graph.Network<?, ?>) this.network, (java.lang.Object) incidentNodes.nodeV(), (java.lang.Object) incidentNodes.nodeU());
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public final java.util.Set<E> edgesConnecting(N n, N n2) {
            return delegate().edgesConnecting(n2, n);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public final java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> endpointPair) {
            return delegate().edgesConnecting(com.google.common.graph.Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public final E edgeConnectingOrNull(N n, N n2) {
            return delegate().edgeConnectingOrNull(n2, n);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public final E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> endpointPair) {
            return delegate().edgeConnectingOrNull(com.google.common.graph.Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public final boolean hasEdgeConnecting(N n, N n2) {
            return delegate().hasEdgeConnecting(n2, n);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public final boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(com.google.common.graph.Graphs.transpose(endpointPair));
        }
    }

    public static <N> com.google.common.graph.MutableGraph<N> inducedSubgraph(com.google.common.graph.Graph<N> graph, java.lang.Iterable<? extends N> iterable) {
        com.google.common.graph.StandardMutableGraph standardMutableGraph;
        if (iterable instanceof java.util.Collection) {
            standardMutableGraph = (com.google.common.graph.MutableGraph<N>) com.google.common.graph.GraphBuilder.from(graph).expectedNodeCount(((java.util.Collection) iterable).size()).build();
        } else {
            standardMutableGraph = (com.google.common.graph.MutableGraph<N>) com.google.common.graph.GraphBuilder.from(graph).build();
        }
        java.util.Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableGraph.addNode(it.next());
        }
        for (N n : standardMutableGraph.nodes()) {
            for (N n2 : graph.successors((com.google.common.graph.Graph<N>) n)) {
                if (standardMutableGraph.nodes().contains(n2)) {
                    standardMutableGraph.putEdge(n, n2);
                }
            }
        }
        return standardMutableGraph;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N, V> com.google.common.graph.MutableValueGraph<N, V> inducedSubgraph(com.google.common.graph.ValueGraph<N, V> valueGraph, java.lang.Iterable<? extends N> iterable) {
        com.google.common.graph.MutableValueGraph mutableValueGraph;
        if (iterable instanceof java.util.Collection) {
            mutableValueGraph = (com.google.common.graph.MutableValueGraph<N, V>) com.google.common.graph.ValueGraphBuilder.from(valueGraph).expectedNodeCount(((java.util.Collection) iterable).size()).build();
        } else {
            mutableValueGraph = (com.google.common.graph.MutableValueGraph<N, V>) com.google.common.graph.ValueGraphBuilder.from(valueGraph).build();
        }
        java.util.Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            mutableValueGraph.addNode(it.next());
        }
        for (N n : mutableValueGraph.nodes()) {
            for (N n2 : valueGraph.successors((com.google.common.graph.ValueGraph<N, V>) n)) {
                if (mutableValueGraph.nodes().contains(n2)) {
                    mutableValueGraph.putEdgeValue(n, n2, java.util.Objects.requireNonNull(valueGraph.edgeValueOrDefault(n, n2, null)));
                }
            }
        }
        return (com.google.common.graph.MutableValueGraph<N, V>) mutableValueGraph;
    }

    public static <N, E> com.google.common.graph.MutableNetwork<N, E> inducedSubgraph(com.google.common.graph.Network<N, E> network, java.lang.Iterable<? extends N> iterable) {
        com.google.common.graph.StandardMutableNetwork standardMutableNetwork;
        if (iterable instanceof java.util.Collection) {
            standardMutableNetwork = (com.google.common.graph.MutableNetwork<N, E>) com.google.common.graph.NetworkBuilder.from(network).expectedNodeCount(((java.util.Collection) iterable).size()).build();
        } else {
            standardMutableNetwork = (com.google.common.graph.MutableNetwork<N, E>) com.google.common.graph.NetworkBuilder.from(network).build();
        }
        java.util.Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            standardMutableNetwork.addNode(it.next());
        }
        for (E e : standardMutableNetwork.nodes()) {
            for (E e2 : network.outEdges(e)) {
                N adjacentNode = network.incidentNodes(e2).adjacentNode(e);
                if (standardMutableNetwork.nodes().contains(adjacentNode)) {
                    standardMutableNetwork.addEdge(e, adjacentNode, e2);
                }
            }
        }
        return standardMutableNetwork;
    }

    public static <N> com.google.common.graph.MutableGraph<N> copyOf(com.google.common.graph.Graph<N> graph) {
        com.google.common.graph.MutableGraph<N> mutableGraph = (com.google.common.graph.MutableGraph<N>) com.google.common.graph.GraphBuilder.from(graph).expectedNodeCount(graph.nodes().size()).build();
        java.util.Iterator<N> it = graph.nodes().iterator();
        while (it.hasNext()) {
            mutableGraph.addNode(it.next());
        }
        for (com.google.common.graph.EndpointPair<N> endpointPair : graph.edges()) {
            mutableGraph.putEdge(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return mutableGraph;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N, V> com.google.common.graph.MutableValueGraph<N, V> copyOf(com.google.common.graph.ValueGraph<N, V> valueGraph) {
        com.google.common.graph.StandardMutableValueGraph standardMutableValueGraph = (com.google.common.graph.MutableValueGraph<N, V>) com.google.common.graph.ValueGraphBuilder.from(valueGraph).expectedNodeCount(valueGraph.nodes().size()).build();
        java.util.Iterator<N> it = valueGraph.nodes().iterator();
        while (it.hasNext()) {
            standardMutableValueGraph.addNode(it.next());
        }
        for (com.google.common.graph.EndpointPair<N> endpointPair : valueGraph.edges()) {
            standardMutableValueGraph.putEdgeValue(endpointPair.nodeU(), endpointPair.nodeV(), java.util.Objects.requireNonNull(valueGraph.edgeValueOrDefault(endpointPair.nodeU(), endpointPair.nodeV(), null)));
        }
        return standardMutableValueGraph;
    }

    public static <N, E> com.google.common.graph.MutableNetwork<N, E> copyOf(com.google.common.graph.Network<N, E> network) {
        com.google.common.graph.MutableNetwork<N, E> mutableNetwork = (com.google.common.graph.MutableNetwork<N, E>) com.google.common.graph.NetworkBuilder.from(network).expectedNodeCount(network.nodes().size()).expectedEdgeCount(network.edges().size()).build();
        java.util.Iterator<N> it = network.nodes().iterator();
        while (it.hasNext()) {
            mutableNetwork.addNode(it.next());
        }
        for (E e : network.edges()) {
            com.google.common.graph.EndpointPair<N> incidentNodes = network.incidentNodes(e);
            mutableNetwork.addEdge(incidentNodes.nodeU(), incidentNodes.nodeV(), e);
        }
        return mutableNetwork;
    }

    static int checkNonNegative(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Not true that %s is non-negative.", i);
        return i;
    }

    static long checkNonNegative(long j) {
        com.google.common.base.Preconditions.checkArgument(j >= 0, "Not true that %s is non-negative.", j);
        return j;
    }

    static int checkPositive(int i) {
        com.google.common.base.Preconditions.checkArgument(i > 0, "Not true that %s is positive.", i);
        return i;
    }

    static long checkPositive(long j) {
        com.google.common.base.Preconditions.checkArgument(j > 0, "Not true that %s is positive.", j);
        return j;
    }
}
