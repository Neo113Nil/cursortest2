package com.google.common.graph;

/* loaded from: classes9.dex */
abstract class GraphsBridgeMethods {
    GraphsBridgeMethods() {
    }

    public static <N> com.google.common.graph.Graph<N> transitiveClosure(com.google.common.graph.Graph<N> graph) {
        return com.google.common.graph.Graphs.transitiveClosure((com.google.common.graph.Graph) graph);
    }

    public static <N> java.util.Set<N> reachableNodes(com.google.common.graph.Graph<N> graph, N n) {
        return com.google.common.graph.Graphs.reachableNodes((com.google.common.graph.Graph) graph, (java.lang.Object) n);
    }
}
