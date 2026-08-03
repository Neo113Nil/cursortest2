package com.google.common.graph;

@com.google.errorprone.annotations.DoNotMock("Implement with a lambda, or use GraphBuilder to build a Graph with the desired edges")
@com.google.common.graph.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface PredecessorsFunction<N> {
    java.lang.Iterable<? extends N> predecessors(N node);
}
