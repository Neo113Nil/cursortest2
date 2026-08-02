package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableConcatWithSingle<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoSizes;

    public ObservableConcatWithSingle(io.reactivex.Observable<T> observable, io.reactivex.SingleSource<? extends T> singleSource) {
        super(observable);
        this.getHighSpeedVideoSizes = singleSource;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableConcatWithSingle.ConcatWithObserver(observer, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class ConcatWithObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -1953724749712440952L;
        io.reactivex.SingleSource<? extends T> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;

        ConcatWithObserver(io.reactivex.Observer<? super T> observer, io.reactivex.SingleSource<? extends T> singleSource) {
            this.getHighSpeedVideoSizes = observer;
            this.Camera2StreamConfigurationMap = singleSource;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (!io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable) || this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighSpeedVideoSizes.onSubscribe(this);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.onNext(t);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoSizes.onNext(t);
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, null);
            io.reactivex.SingleSource<? extends T> singleSource = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = null;
            singleSource.subscribe(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
