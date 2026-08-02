package com.google.common.graph;

/* loaded from: classes9.dex */
public abstract class AbstractValueGraph<N, V> extends com.google.common.graph.AbstractBaseGraph<N> implements com.google.common.graph.ValueGraph<N, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int degree(java.lang.Object obj) {
        return super.degree(obj);
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ java.util.Set edges() {
        return super.edges();
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(com.google.common.graph.EndpointPair endpointPair) {
        return super.hasEdgeConnecting(endpointPair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(java.lang.Object obj, java.lang.Object obj2) {
        return super.hasEdgeConnecting(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int inDegree(java.lang.Object obj) {
        return super.inDegree(obj);
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder incidentEdgeOrder() {
        return super.incidentEdgeOrder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ java.util.Set incidentEdges(java.lang.Object obj) {
        return super.incidentEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int outDegree(java.lang.Object obj) {
        return super.outDegree(obj);
    }

    @Override // com.google.common.graph.ValueGraph
    public com.google.common.graph.Graph<N> asGraph() {
        return new com.google.common.graph.AbstractGraph<N>() { // from class: com.google.common.graph.AbstractValueGraph.1
            @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
            public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object obj) {
                return predecessors((com.google.common.graph.AbstractValueGraph.AnonymousClass1) obj);
            }

            @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
            public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object obj) {
                return successors((com.google.common.graph.AbstractValueGraph.AnonymousClass1) obj);
            }

            @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
            public java.util.Set<N> nodes() {
                return com.google.common.graph.AbstractValueGraph.this.nodes();
            }

            @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
            public java.util.Set<com.google.common.graph.EndpointPair<N>> edges() {
                return com.google.common.graph.AbstractValueGraph.this.edges();
            }

            @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
            public boolean isDirected() {
                return com.google.common.graph.AbstractValueGraph.this.isDirected();
            }

            @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
            public boolean allowsSelfLoops() {
                return com.google.common.graph.AbstractValueGraph.this.allowsSelfLoops();
            }

            @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
            public com.google.common.graph.ElementOrder<N> nodeOrder() {
                return com.google.common.graph.AbstractValueGraph.this.nodeOrder();
            }

            @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
            public com.google.common.graph.ElementOrder<N> incidentEdgeOrder() {
                return com.google.common.graph.AbstractValueGraph.this.incidentEdgeOrder();
            }

            @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
            public java.util.Set<N> adjacentNodes(N n) {
                return com.google.common.graph.AbstractValueGraph.this.adjacentNodes(n);
            }

            @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
            public java.util.Set<N> predecessors(N n) {
                return com.google.common.graph.AbstractValueGraph.this.predecessors((java.lang.Object) n);
            }

            @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
            public java.util.Set<N> successors(N n) {
                return com.google.common.graph.AbstractValueGraph.this.successors((java.lang.Object) n);
            }

            @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
            public int degree(N n) {
                return com.google.common.graph.AbstractValueGraph.this.degree(n);
            }

            @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
            public int inDegree(N n) {
                return com.google.common.graph.AbstractValueGraph.this.inDegree(n);
            }

            @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
            public int outDegree(N n) {
                return com.google.common.graph.AbstractValueGraph.this.outDegree(n);
            }
        };
    }

    @Override // com.google.common.graph.ValueGraph
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.graph.ValueGraph)) {
            return false;
        }
        com.google.common.graph.ValueGraph valueGraph = (com.google.common.graph.ValueGraph) obj;
        return isDirected() == valueGraph.isDirected() && nodes().equals(valueGraph.nodes()) && edgeValueMap(this).equals(edgeValueMap(valueGraph));
    }

    @Override // com.google.common.graph.ValueGraph
    public final int hashCode() {
        return edgeValueMap(this).hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("isDirected: ");
        sb.append(isDirected());
        sb.append(", allowsSelfLoops: ");
        sb.append(allowsSelfLoops());
        sb.append(", nodes: ");
        sb.append(nodes());
        sb.append(", edges: ");
        sb.append(edgeValueMap(this));
        return sb.toString();
    }

    private static <N, V> java.util.Map<com.google.common.graph.EndpointPair<N>, V> edgeValueMap(final com.google.common.graph.ValueGraph<N, V> valueGraph) {
        return com.google.common.collect.Maps.asMap(valueGraph.edges(), new com.google.common.base.Function() { // from class: com.google.common.graph.AbstractValueGraph$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Object requireNonNull;
                requireNonNull = java.util.Objects.requireNonNull(com.google.common.graph.ValueGraph.this.edgeValueOrDefault(r2.nodeU(), ((com.google.common.graph.EndpointPair) obj).nodeV(), null));
                return requireNonNull;
            }
        });
    }
}
