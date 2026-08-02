package com.google.common.graph;

/* loaded from: classes9.dex */
public abstract class AbstractGraph<N> extends com.google.common.graph.AbstractBaseGraph<N> implements com.google.common.graph.Graph<N> {
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

    @Override // com.google.common.graph.Graph
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.graph.Graph)) {
            return false;
        }
        com.google.common.graph.Graph graph = (com.google.common.graph.Graph) obj;
        return isDirected() == graph.isDirected() && nodes().equals(graph.nodes()) && edges().equals(graph.edges());
    }

    @Override // com.google.common.graph.Graph
    public final int hashCode() {
        return edges().hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("isDirected: ");
        sb.append(isDirected());
        sb.append(", allowsSelfLoops: ");
        sb.append(allowsSelfLoops());
        sb.append(", nodes: ");
        sb.append(nodes());
        sb.append(", edges: ");
        sb.append(edges());
        return sb.toString();
    }
}
