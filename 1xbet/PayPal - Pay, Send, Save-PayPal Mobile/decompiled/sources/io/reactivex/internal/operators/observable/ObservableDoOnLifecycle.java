package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDoOnLifecycle<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    private final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI;
    private final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;

    public ObservableDoOnLifecycle(io.reactivex.Observable<T> observable, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer, io.reactivex.functions.Action action) {
        super(observable);
        this.getHighResolutionOutputSizeshNQ4ISI = consumer;
        this.getHighSpeedVideoFpsRanges = action;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.observers.DisposableLambdaObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges));
    }
}
