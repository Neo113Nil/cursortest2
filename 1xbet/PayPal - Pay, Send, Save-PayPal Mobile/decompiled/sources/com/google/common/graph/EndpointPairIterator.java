package com.google.common.graph;

/* loaded from: classes9.dex */
abstract class EndpointPairIterator<N> extends com.google.common.collect.AbstractIterator<com.google.common.graph.EndpointPair<N>> {
    private final com.google.common.graph.BaseGraph<N> graph;
    N node;
    private final java.util.Iterator<N> nodeIterator;
    java.util.Iterator<N> successorIterator;

    static <N> com.google.common.graph.EndpointPairIterator<N> of(com.google.common.graph.BaseGraph<N> baseGraph) {
        return baseGraph.isDirected() ? new com.google.common.graph.EndpointPairIterator.Directed(baseGraph) : new com.google.common.graph.EndpointPairIterator.Undirected(baseGraph);
    }

    private EndpointPairIterator(com.google.common.graph.BaseGraph<N> baseGraph) {
        this.node = null;
        this.successorIterator = com.google.common.collect.ImmutableSet.of().iterator();
        this.graph = baseGraph;
        this.nodeIterator = baseGraph.nodes().iterator();
    }

    final boolean advance() {
        com.google.common.base.Preconditions.checkState(!this.successorIterator.hasNext());
        if (!this.nodeIterator.hasNext()) {
            return false;
        }
        N next = this.nodeIterator.next();
        this.node = next;
        this.successorIterator = this.graph.successors((com.google.common.graph.BaseGraph<N>) next).iterator();
        return true;
    }

    static final class Directed<N> extends com.google.common.graph.EndpointPairIterator<N> {
        private Directed(com.google.common.graph.BaseGraph<N> baseGraph) {
            super(baseGraph);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        public final com.google.common.graph.EndpointPair<N> computeNext() {
            while (!this.successorIterator.hasNext()) {
                if (!advance()) {
                    return endOfData();
                }
            }
            return com.google.common.graph.EndpointPair.ordered(java.util.Objects.requireNonNull(this.node), this.successorIterator.next());
        }
    }

    static final class Undirected<N> extends com.google.common.graph.EndpointPairIterator<N> {
        private java.util.Set<N> visitedNodes;

        private Undirected(com.google.common.graph.BaseGraph<N> baseGraph) {
            super(baseGraph);
            this.visitedNodes = com.google.common.collect.Sets.newHashSetWithExpectedSize(baseGraph.nodes().size() + 1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        public final com.google.common.graph.EndpointPair<N> computeNext() {
            do {
                java.util.Objects.requireNonNull(this.visitedNodes);
                while (this.successorIterator.hasNext()) {
                    N next = this.successorIterator.next();
                    if (!this.visitedNodes.contains(next)) {
                        return com.google.common.graph.EndpointPair.unordered(java.util.Objects.requireNonNull(this.node), next);
                    }
                }
                this.visitedNodes.add(this.node);
            } while (advance());
            this.visitedNodes = null;
            return endOfData();
        }
    }
}
