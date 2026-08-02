package com.google.common.graph;

@com.google.errorprone.annotations.DoNotMock("Implement with a lambda, or use GraphBuilder to build a Graph with the desired edges")
/* loaded from: classes9.dex */
public interface SuccessorsFunction<N> {
    java.lang.Iterable<? extends N> successors(N n);
}
