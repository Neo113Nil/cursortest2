package com.google.common.graph;

/* loaded from: classes9.dex */
abstract class AbstractGraphBuilder<N> {
    final boolean directed;
    boolean allowsSelfLoops = false;
    com.google.common.graph.ElementOrder<N> nodeOrder = com.google.common.graph.ElementOrder.insertion();
    com.google.common.graph.ElementOrder<N> incidentEdgeOrder = com.google.common.graph.ElementOrder.unordered();
    com.google.common.base.Optional<java.lang.Integer> expectedNodeCount = com.google.common.base.Optional.absent();

    AbstractGraphBuilder(boolean z) {
        this.directed = z;
    }
}
