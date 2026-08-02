package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableAutoConnect<T> extends io.reactivex.Flowable<T> {
    final int Camera2StreamConfigurationMap;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger();
    final io.reactivex.flowables.ConnectableFlowable<? extends T> getHighSpeedVideoSizes;

    public FlowableAutoConnect(io.reactivex.flowables.ConnectableFlowable<? extends T> connectableFlowable, int i, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        this.getHighSpeedVideoSizes = connectableFlowable;
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = consumer;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoSizes.subscribe((org.reactivestreams.Subscriber<? super java.lang.Object>) subscriber);
        if (this.getHighSpeedVideoFpsRangesFor.incrementAndGet() == this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoSizes.connect(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
