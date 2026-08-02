package com.google.common.graph;

/* loaded from: classes9.dex */
final class UndirectedGraphConnections<N, V> implements com.google.common.graph.GraphConnections<N, V> {
    private final java.util.Map<N, V> adjacentNodeValues;

    private UndirectedGraphConnections(java.util.Map<N, V> map) {
        this.adjacentNodeValues = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
    }

    /* renamed from: com.google.common.graph.UndirectedGraphConnections$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type;

        static {
            int[] iArr = new int[com.google.common.graph.ElementOrder.Type.values().length];
            $SwitchMap$com$google$common$graph$ElementOrder$Type = iArr;
            try {
                iArr[com.google.common.graph.ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[com.google.common.graph.ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static <N, V> com.google.common.graph.UndirectedGraphConnections<N, V> of(com.google.common.graph.ElementOrder<N> elementOrder) {
        int i = com.google.common.graph.UndirectedGraphConnections.AnonymousClass1.$SwitchMap$com$google$common$graph$ElementOrder$Type[elementOrder.type().ordinal()];
        if (i == 1) {
            return new com.google.common.graph.UndirectedGraphConnections<>(new java.util.HashMap(2, 1.0f));
        }
        if (i == 2) {
            return new com.google.common.graph.UndirectedGraphConnections<>(new java.util.LinkedHashMap(2, 1.0f));
        }
        throw new java.lang.AssertionError(elementOrder.type());
    }

    static <N, V> com.google.common.graph.UndirectedGraphConnections<N, V> ofImmutable(java.util.Map<N, V> map) {
        return new com.google.common.graph.UndirectedGraphConnections<>(com.google.common.collect.ImmutableMap.copyOf((java.util.Map) map));
    }

    @Override // com.google.common.graph.GraphConnections
    public final java.util.Set<N> adjacentNodes() {
        return java.util.Collections.unmodifiableSet(this.adjacentNodeValues.keySet());
    }

    @Override // com.google.common.graph.GraphConnections
    public final java.util.Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.GraphConnections
    public final java.util.Set<N> successors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.GraphConnections
    public final java.util.Iterator<com.google.common.graph.EndpointPair<N>> incidentEdgeIterator(final N n) {
        return com.google.common.collect.Iterators.transform(this.adjacentNodeValues.keySet().iterator(), new com.google.common.base.Function() { // from class: com.google.common.graph.UndirectedGraphConnections$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.common.graph.EndpointPair unordered;
                unordered = com.google.common.graph.EndpointPair.unordered(n, obj);
                return unordered;
            }
        });
    }

    @Override // com.google.common.graph.GraphConnections
    public final V value(N n) {
        return this.adjacentNodeValues.get(n);
    }

    @Override // com.google.common.graph.GraphConnections
    public final void removePredecessor(N n) {
        removeSuccessor(n);
    }

    @Override // com.google.common.graph.GraphConnections
    public final V removeSuccessor(N n) {
        return this.adjacentNodeValues.remove(n);
    }

    @Override // com.google.common.graph.GraphConnections
    public final void addPredecessor(N n, V v) {
        addSuccessor(n, v);
    }

    @Override // com.google.common.graph.GraphConnections
    public final V addSuccessor(N n, V v) {
        return this.adjacentNodeValues.put(n, v);
    }
}
