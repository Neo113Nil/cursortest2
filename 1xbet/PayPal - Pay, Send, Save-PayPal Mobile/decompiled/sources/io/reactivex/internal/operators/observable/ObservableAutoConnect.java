package io.reactivex.internal.operators.observable;

/* loaded from: classes17.dex */
public final class ObservableAutoConnect<T> extends io.reactivex.Observable<T> {
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger();
    final int getHighSpeedVideoFpsRangesFor;
    final io.reactivex.observables.ConnectableObservable<? extends T> getHighSpeedVideoSizes;

    public ObservableAutoConnect(io.reactivex.observables.ConnectableObservable<? extends T> connectableObservable, int i, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        this.getHighSpeedVideoSizes = connectableObservable;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = consumer;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.getHighSpeedVideoSizes.subscribe((io.reactivex.Observer<? super java.lang.Object>) observer);
        if (this.getHighSpeedVideoFpsRanges.incrementAndGet() == this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoSizes.connect(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
