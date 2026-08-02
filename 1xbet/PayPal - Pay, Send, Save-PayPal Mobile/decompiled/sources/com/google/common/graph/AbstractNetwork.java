package com.google.common.graph;

/* loaded from: classes9.dex */
public abstract class AbstractNetwork<N, E> implements com.google.common.graph.Network<N, E> {

    /* renamed from: com.google.common.graph.AbstractNetwork$1, reason: invalid class name */
    class AnonymousClass1 extends com.google.common.graph.AbstractGraph<N> {
        AnonymousClass1() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object obj) {
            return predecessors((com.google.common.graph.AbstractNetwork.AnonymousClass1) obj);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object obj) {
            return successors((com.google.common.graph.AbstractNetwork.AnonymousClass1) obj);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public java.util.Set<N> nodes() {
            return com.google.common.graph.AbstractNetwork.this.nodes();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public java.util.Set<com.google.common.graph.EndpointPair<N>> edges() {
            if (com.google.common.graph.AbstractNetwork.this.allowsParallelEdges()) {
                return super.edges();
            }
            return new com.google.common.graph.AbstractNetwork.AnonymousClass1.C00731();
        }

        /* renamed from: com.google.common.graph.AbstractNetwork$1$1, reason: invalid class name and collision with other inner class name */
        class C00731 extends java.util.AbstractSet<com.google.common.graph.EndpointPair<N>> {
            C00731() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<com.google.common.graph.EndpointPair<N>> iterator() {
                return com.google.common.collect.Iterators.transform(com.google.common.graph.AbstractNetwork.this.edges().iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.AbstractNetwork$1$1$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.common.graph.AbstractNetwork.AnonymousClass1.C00731.this.m10335lambda$iterator$0$comgooglecommongraphAbstractNetwork$1$1(obj);
                    }
                });
            }

            /* renamed from: lambda$iterator$0$com-google-common-graph-AbstractNetwork$1$1, reason: not valid java name */
            /* synthetic */ com.google.common.graph.EndpointPair m10335lambda$iterator$0$comgooglecommongraphAbstractNetwork$1$1(java.lang.Object obj) {
                return com.google.common.graph.AbstractNetwork.this.incidentNodes(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return com.google.common.graph.AbstractNetwork.this.edges().size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object obj) {
                if (!(obj instanceof com.google.common.graph.EndpointPair)) {
                    return false;
                }
                com.google.common.graph.EndpointPair<?> endpointPair = (com.google.common.graph.EndpointPair) obj;
                return com.google.common.graph.AbstractNetwork.AnonymousClass1.this.isOrderingCompatible(endpointPair) && com.google.common.graph.AbstractNetwork.AnonymousClass1.this.nodes().contains(endpointPair.nodeU()) && com.google.common.graph.AbstractNetwork.AnonymousClass1.this.successors((com.google.common.graph.AbstractNetwork.AnonymousClass1) endpointPair.nodeU()).contains(endpointPair.nodeV());
            }
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public com.google.common.graph.ElementOrder<N> nodeOrder() {
            return com.google.common.graph.AbstractNetwork.this.nodeOrder();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
            return com.google.common.graph.ElementOrder.unordered();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean isDirected() {
            return com.google.common.graph.AbstractNetwork.this.isDirected();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
            return com.google.common.graph.AbstractNetwork.this.allowsSelfLoops();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public java.util.Set<N> adjacentNodes(N n) {
            return com.google.common.graph.AbstractNetwork.this.adjacentNodes(n);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public java.util.Set<N> predecessors(N n) {
            return com.google.common.graph.AbstractNetwork.this.predecessors((java.lang.Object) n);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public java.util.Set<N> successors(N n) {
            return com.google.common.graph.AbstractNetwork.this.successors((java.lang.Object) n);
        }
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.Graph<N> asGraph() {
        return new com.google.common.graph.AbstractNetwork.AnonymousClass1();
    }

    @Override // com.google.common.graph.Network
    public int degree(N n) {
        if (isDirected()) {
            return com.google.common.math.IntMath.saturatedAdd(inEdges(n).size(), outEdges(n).size());
        }
        return com.google.common.math.IntMath.saturatedAdd(incidentEdges(n).size(), edgesConnecting(n, n).size());
    }

    @Override // com.google.common.graph.Network
    public int inDegree(N n) {
        return isDirected() ? inEdges(n).size() : degree(n);
    }

    @Override // com.google.common.graph.Network
    public int outDegree(N n) {
        return isDirected() ? outEdges(n).size() : degree(n);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> adjacentEdges(E e) {
        com.google.common.graph.EndpointPair<N> incidentNodes = incidentNodes(e);
        return (java.util.Set<E>) edgeInvalidatableSet(com.google.common.collect.Sets.difference(com.google.common.collect.Sets.union(incidentEdges(incidentNodes.nodeU()), incidentEdges(incidentNodes.nodeV())), com.google.common.collect.ImmutableSet.of((java.lang.Object) e)), e);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(N n, N n2) {
        java.util.Set set;
        java.util.Set<E> outEdges = outEdges(n);
        java.util.Set<E> inEdges = inEdges(n2);
        if (outEdges.size() <= inEdges.size()) {
            set = java.util.Collections.unmodifiableSet(com.google.common.collect.Sets.filter(outEdges, connectedPredicate(n, n2)));
        } else {
            set = java.util.Collections.unmodifiableSet(com.google.common.collect.Sets.filter(inEdges, connectedPredicate(n2, n)));
        }
        return (java.util.Set<E>) nodePairInvalidatableSet(set, n, n2);
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return edgesConnecting(endpointPair.nodeU(), endpointPair.nodeV());
    }

    private com.google.common.base.Predicate<E> connectedPredicate(final N n, final N n2) {
        return new com.google.common.base.Predicate() { // from class: com.google.common.graph.AbstractNetwork$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.lang.Object obj) {
                return com.google.common.graph.AbstractNetwork.this.m10331xee41fe46(n, n2, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda$connectedPredicate$0$com-google-common-graph-AbstractNetwork, reason: not valid java name */
    /* synthetic */ boolean m10331xee41fe46(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return incidentNodes(obj3).adjacentNode(obj).equals(obj2);
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(N n, N n2) {
        java.util.Set<E> edgesConnecting = edgesConnecting(n, n2);
        int size = edgesConnecting.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return edgesConnecting.iterator().next();
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", n, n2));
    }

    @Override // com.google.common.graph.Network
    public E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return edgeConnectingOrNull(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n, N n2) {
        com.google.common.base.Preconditions.checkNotNull(n);
        com.google.common.base.Preconditions.checkNotNull(n2);
        return nodes().contains(n) && successors((java.lang.Object) n).contains(n2);
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> endpointPair) {
        com.google.common.base.Preconditions.checkNotNull(endpointPair);
        if (isOrderingCompatible(endpointPair)) {
            return hasEdgeConnecting(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return false;
    }

    protected final void validateEndpoints(com.google.common.graph.EndpointPair<?> endpointPair) {
        com.google.common.base.Preconditions.checkNotNull(endpointPair);
        com.google.common.base.Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    protected final boolean isOrderingCompatible(com.google.common.graph.EndpointPair<?> endpointPair) {
        return endpointPair.isOrdered() == isDirected();
    }

    @Override // com.google.common.graph.Network
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.graph.Network)) {
            return false;
        }
        com.google.common.graph.Network network = (com.google.common.graph.Network) obj;
        return isDirected() == network.isDirected() && nodes().equals(network.nodes()) && edgeIncidentNodesMap(this).equals(edgeIncidentNodesMap(network));
    }

    @Override // com.google.common.graph.Network
    public final int hashCode() {
        return edgeIncidentNodesMap(this).hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("isDirected: ");
        sb.append(isDirected());
        sb.append(", allowsParallelEdges: ");
        sb.append(allowsParallelEdges());
        sb.append(", allowsSelfLoops: ");
        sb.append(allowsSelfLoops());
        sb.append(", nodes: ");
        sb.append(nodes());
        sb.append(", edges: ");
        sb.append(edgeIncidentNodesMap(this));
        return sb.toString();
    }

    protected final <T> java.util.Set<T> edgeInvalidatableSet(java.util.Set<T> set, final E e) {
        return com.google.common.graph.InvalidatableSet.of((java.util.Set) set, (com.google.common.base.Supplier<java.lang.Boolean>) new com.google.common.base.Supplier() { // from class: com.google.common.graph.AbstractNetwork$$ExternalSyntheticLambda5
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.graph.AbstractNetwork.this.m10332xa0c212f3(e);
            }
        }, (com.google.common.base.Supplier<java.lang.String>) new com.google.common.base.Supplier() { // from class: com.google.common.graph.AbstractNetwork$$ExternalSyntheticLambda6
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                java.lang.String format;
                format = java.lang.String.format("Edge %s that was used to generate this set is no longer in the graph.", e);
                return format;
            }
        });
    }

    /* renamed from: lambda$edgeInvalidatableSet$0$com-google-common-graph-AbstractNetwork, reason: not valid java name */
    /* synthetic */ java.lang.Boolean m10332xa0c212f3(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(edges().contains(obj));
    }

    protected final <T> java.util.Set<T> nodeInvalidatableSet(java.util.Set<T> set, final N n) {
        return com.google.common.graph.InvalidatableSet.of((java.util.Set) set, (com.google.common.base.Supplier<java.lang.Boolean>) new com.google.common.base.Supplier() { // from class: com.google.common.graph.AbstractNetwork$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.graph.AbstractNetwork.this.m10333xc7f682f8(n);
            }
        }, (com.google.common.base.Supplier<java.lang.String>) new com.google.common.base.Supplier() { // from class: com.google.common.graph.AbstractNetwork$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                java.lang.String format;
                format = java.lang.String.format("Node %s that was used to generate this set is no longer in the graph.", n);
                return format;
            }
        });
    }

    /* renamed from: lambda$nodeInvalidatableSet$0$com-google-common-graph-AbstractNetwork, reason: not valid java name */
    /* synthetic */ java.lang.Boolean m10333xc7f682f8(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(nodes().contains(obj));
    }

    protected final <T> java.util.Set<T> nodePairInvalidatableSet(java.util.Set<T> set, final N n, final N n2) {
        return com.google.common.graph.InvalidatableSet.of((java.util.Set) set, (com.google.common.base.Supplier<java.lang.Boolean>) new com.google.common.base.Supplier() { // from class: com.google.common.graph.AbstractNetwork$$ExternalSyntheticLambda3
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.graph.AbstractNetwork.this.m10334x73a8b5f2(n, n2);
            }
        }, (com.google.common.base.Supplier<java.lang.String>) new com.google.common.base.Supplier() { // from class: com.google.common.graph.AbstractNetwork$$ExternalSyntheticLambda4
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                java.lang.String format;
                format = java.lang.String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", n, n2);
                return format;
            }
        });
    }

    /* renamed from: lambda$nodePairInvalidatableSet$0$com-google-common-graph-AbstractNetwork, reason: not valid java name */
    /* synthetic */ java.lang.Boolean m10334x73a8b5f2(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Boolean.valueOf(nodes().contains(obj) && nodes().contains(obj2));
    }

    private static <N, E> java.util.Map<E, com.google.common.graph.EndpointPair<N>> edgeIncidentNodesMap(final com.google.common.graph.Network<N, E> network) {
        java.util.Set<E> edges = network.edges();
        java.util.Objects.requireNonNull(network);
        return com.google.common.collect.Maps.asMap(edges, new com.google.common.base.Function() { // from class: com.google.common.graph.AbstractNetwork$$ExternalSyntheticLambda7
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.graph.Network.this.incidentNodes(obj);
            }
        });
    }
}
