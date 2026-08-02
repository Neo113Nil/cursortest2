package com.google.common.graph;

/* loaded from: classes9.dex */
public final class ValueGraphBuilder<N, V> extends com.google.common.graph.AbstractGraphBuilder<N> {
    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, V1 extends V> com.google.common.graph.ValueGraphBuilder<N1, V1> cast() {
        return this;
    }

    private ValueGraphBuilder(boolean z) {
        super(z);
    }

    public static com.google.common.graph.ValueGraphBuilder<java.lang.Object, java.lang.Object> directed() {
        return new com.google.common.graph.ValueGraphBuilder<>(true);
    }

    public static com.google.common.graph.ValueGraphBuilder<java.lang.Object, java.lang.Object> undirected() {
        return new com.google.common.graph.ValueGraphBuilder<>(false);
    }

    public static <N, V> com.google.common.graph.ValueGraphBuilder<N, V> from(com.google.common.graph.ValueGraph<N, V> valueGraph) {
        return new com.google.common.graph.ValueGraphBuilder(valueGraph.isDirected()).allowsSelfLoops(valueGraph.allowsSelfLoops()).nodeOrder(valueGraph.nodeOrder()).incidentEdgeOrder(valueGraph.incidentEdgeOrder());
    }

    public final <N1 extends N, V1 extends V> com.google.common.graph.ImmutableValueGraph.Builder<N1, V1> immutable() {
        return new com.google.common.graph.ImmutableValueGraph.Builder<>(cast());
    }

    public final com.google.common.graph.ValueGraphBuilder<N, V> allowsSelfLoops(boolean z) {
        this.allowsSelfLoops = z;
        return this;
    }

    public final com.google.common.graph.ValueGraphBuilder<N, V> expectedNodeCount(int i) {
        this.expectedNodeCount = com.google.common.base.Optional.of(java.lang.Integer.valueOf(com.google.common.graph.Graphs.checkNonNegative(i)));
        return this;
    }

    public final <N1 extends N> com.google.common.graph.ValueGraphBuilder<N1, V> nodeOrder(com.google.common.graph.ElementOrder<N1> elementOrder) {
        com.google.common.graph.ValueGraphBuilder<N1, V> valueGraphBuilder = (com.google.common.graph.ValueGraphBuilder<N1, V>) cast();
        valueGraphBuilder.nodeOrder = (com.google.common.graph.ElementOrder) com.google.common.base.Preconditions.checkNotNull(elementOrder);
        return valueGraphBuilder;
    }

    public final <N1 extends N> com.google.common.graph.ValueGraphBuilder<N1, V> incidentEdgeOrder(com.google.common.graph.ElementOrder<N1> elementOrder) {
        com.google.common.base.Preconditions.checkArgument(elementOrder.type() == com.google.common.graph.ElementOrder.Type.UNORDERED || elementOrder.type() == com.google.common.graph.ElementOrder.Type.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", elementOrder);
        com.google.common.graph.ValueGraphBuilder<N1, V> valueGraphBuilder = (com.google.common.graph.ValueGraphBuilder<N1, V>) cast();
        valueGraphBuilder.incidentEdgeOrder = (com.google.common.graph.ElementOrder) com.google.common.base.Preconditions.checkNotNull(elementOrder);
        return valueGraphBuilder;
    }

    public final <N1 extends N, V1 extends V> com.google.common.graph.MutableValueGraph<N1, V1> build() {
        return new com.google.common.graph.StandardMutableValueGraph(this);
    }

    final com.google.common.graph.ValueGraphBuilder<N, V> copy() {
        com.google.common.graph.ValueGraphBuilder<N, V> valueGraphBuilder = new com.google.common.graph.ValueGraphBuilder<>(this.directed);
        valueGraphBuilder.allowsSelfLoops = this.allowsSelfLoops;
        valueGraphBuilder.nodeOrder = this.nodeOrder;
        valueGraphBuilder.expectedNodeCount = this.expectedNodeCount;
        valueGraphBuilder.incidentEdgeOrder = this.incidentEdgeOrder;
        return valueGraphBuilder;
    }
}
