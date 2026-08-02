package io.reactivex.parallel;

/* loaded from: classes3.dex */
public interface ParallelFlowableConverter<T, R> {
    R apply(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable);
}
