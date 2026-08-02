package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelConcatMap<T, R> extends io.reactivex.parallel.ParallelFlowable<R> {
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> Camera2StreamConfigurationMap;
    final io.reactivex.parallel.ParallelFlowable<T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.internal.util.ErrorMode getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoSizes;

    public ParallelConcatMap(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
        this.getHighResolutionOutputSizeshNQ4ISI = parallelFlowable;
        this.Camera2StreamConfigurationMap = (io.reactivex.functions.Function) io.reactivex.internal.functions.ObjectHelper.requireNonNull(function, "mapper");
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = (io.reactivex.internal.util.ErrorMode) io.reactivex.internal.functions.ObjectHelper.requireNonNull(errorMode, "errorMode");
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final int parallelism() {
        return this.getHighResolutionOutputSizeshNQ4ISI.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                subscriberArr2[i] = io.reactivex.internal.operators.flowable.FlowableConcatMap.subscribe(subscriberArr[i], this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(subscriberArr2);
        }
    }
}
