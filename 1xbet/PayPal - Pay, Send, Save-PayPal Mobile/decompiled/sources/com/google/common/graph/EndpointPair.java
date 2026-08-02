package com.google.common.graph;

@com.google.errorprone.annotations.Immutable(containerOf = {"N"})
/* loaded from: classes9.dex */
public abstract class EndpointPair<N> implements java.lang.Iterable<N> {
    private final N nodeU;
    private final N nodeV;

    public abstract boolean equals(java.lang.Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    public abstract N source();

    public abstract N target();

    private EndpointPair(N n, N n2) {
        this.nodeU = (N) com.google.common.base.Preconditions.checkNotNull(n);
        this.nodeV = (N) com.google.common.base.Preconditions.checkNotNull(n2);
    }

    public static <N> com.google.common.graph.EndpointPair<N> ordered(N n, N n2) {
        return new com.google.common.graph.EndpointPair.Ordered(n, n2);
    }

    public static <N> com.google.common.graph.EndpointPair<N> unordered(N n, N n2) {
        return new com.google.common.graph.EndpointPair.Unordered(n2, n);
    }

    static <N> com.google.common.graph.EndpointPair<N> of(com.google.common.graph.Graph<?> graph, N n, N n2) {
        return graph.isDirected() ? ordered(n, n2) : unordered(n, n2);
    }

    static <N> com.google.common.graph.EndpointPair<N> of(com.google.common.graph.Network<?, ?> network, N n, N n2) {
        return network.isDirected() ? ordered(n, n2) : unordered(n, n2);
    }

    public final N nodeU() {
        return this.nodeU;
    }

    public final N nodeV() {
        return this.nodeV;
    }

    public final N adjacentNode(N n) {
        if (n.equals(this.nodeU)) {
            return this.nodeV;
        }
        if (n.equals(this.nodeV)) {
            return this.nodeU;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EndpointPair ");
        sb.append(this);
        sb.append(" does not contain node ");
        sb.append(n);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // java.lang.Iterable
    public final com.google.common.collect.UnmodifiableIterator<N> iterator() {
        return com.google.common.collect.Iterators.forArray(this.nodeU, this.nodeV);
    }

    static final class Ordered<N> extends com.google.common.graph.EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public final boolean isOrdered() {
            return true;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return super.iterator();
        }

        private Ordered(N n, N n2) {
            super(n, n2);
        }

        @Override // com.google.common.graph.EndpointPair
        public final N source() {
            return nodeU();
        }

        @Override // com.google.common.graph.EndpointPair
        public final N target() {
            return nodeV();
        }

        @Override // com.google.common.graph.EndpointPair
        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.common.graph.EndpointPair)) {
                return false;
            }
            com.google.common.graph.EndpointPair endpointPair = (com.google.common.graph.EndpointPair) obj;
            return isOrdered() == endpointPair.isOrdered() && source().equals(endpointPair.source()) && target().equals(endpointPair.target());
        }

        @Override // com.google.common.graph.EndpointPair
        public final int hashCode() {
            return java.util.Objects.hash(source(), target());
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("<");
            sb.append(source());
            sb.append(" -> ");
            sb.append(target());
            sb.append(">");
            return sb.toString();
        }
    }

    static final class Unordered<N> extends com.google.common.graph.EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public final boolean isOrdered() {
            return false;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return super.iterator();
        }

        private Unordered(N n, N n2) {
            super(n, n2);
        }

        @Override // com.google.common.graph.EndpointPair
        public final N source() {
            throw new java.lang.UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public final N target() {
            throw new java.lang.UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.common.graph.EndpointPair)) {
                return false;
            }
            com.google.common.graph.EndpointPair endpointPair = (com.google.common.graph.EndpointPair) obj;
            if (isOrdered() != endpointPair.isOrdered()) {
                return false;
            }
            if (nodeU().equals(endpointPair.nodeU())) {
                return nodeV().equals(endpointPair.nodeV());
            }
            return nodeU().equals(endpointPair.nodeV()) && nodeV().equals(endpointPair.nodeU());
        }

        @Override // com.google.common.graph.EndpointPair
        public final int hashCode() {
            return nodeU().hashCode() + nodeV().hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(nodeU());
            sb.append(", ");
            sb.append(nodeV());
            sb.append("]");
            return sb.toString();
        }
    }
}
