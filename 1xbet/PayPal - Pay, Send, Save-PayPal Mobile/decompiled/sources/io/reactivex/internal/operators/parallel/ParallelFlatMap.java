package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelFlatMap<T, R> extends io.reactivex.parallel.ParallelFlowable<R> {
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> Camera2StreamConfigurationMap;
    final io.reactivex.parallel.ParallelFlowable<T> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public ParallelFlatMap(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, boolean z, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = parallelFlowable;
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = i2;
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
                subscriberArr2[i] = io.reactivex.internal.operators.flowable.FlowableFlatMap.subscribe(subscriberArr[i], this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(subscriberArr2);
        }
    }
}
