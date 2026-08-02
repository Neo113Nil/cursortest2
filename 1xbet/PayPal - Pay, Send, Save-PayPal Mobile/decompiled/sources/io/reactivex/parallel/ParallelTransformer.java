package io.reactivex.parallel;

/* loaded from: classes3.dex */
public interface ParallelTransformer<Upstream, Downstream> {
    io.reactivex.parallel.ParallelFlowable<Downstream> apply(io.reactivex.parallel.ParallelFlowable<Upstream> parallelFlowable);
}
