package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelFromArray<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final org.reactivestreams.Publisher<T>[] Camera2StreamConfigurationMap;

    public ParallelFromArray(org.reactivestreams.Publisher<T>[] publisherArr) {
        this.Camera2StreamConfigurationMap = publisherArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final int parallelism() {
        return this.Camera2StreamConfigurationMap.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            for (int i = 0; i < length; i++) {
                this.Camera2StreamConfigurationMap[i].subscribe(subscriberArr[i]);
            }
        }
    }
}
