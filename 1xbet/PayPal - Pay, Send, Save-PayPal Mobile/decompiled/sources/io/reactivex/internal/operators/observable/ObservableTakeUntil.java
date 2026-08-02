package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableTakeUntil<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<? extends U> getHighSpeedVideoSizes;

    public ObservableTakeUntil(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.getHighSpeedVideoSizes = observableSource2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.observers.SerializedObserver serializedObserver = new io.reactivex.observers.SerializedObserver(observer);
        io.reactivex.internal.disposables.ArrayCompositeDisposable arrayCompositeDisposable = new io.reactivex.internal.disposables.ArrayCompositeDisposable(2);
        io.reactivex.internal.operators.observable.ObservableTakeUntil.TakeUntilObserver takeUntilObserver = new io.reactivex.internal.operators.observable.ObservableTakeUntil.TakeUntilObserver(serializedObserver, arrayCompositeDisposable);
        observer.onSubscribe(arrayCompositeDisposable);
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.observable.ObservableTakeUntil.TakeUntil(arrayCompositeDisposable, serializedObserver));
        this.source.subscribe(takeUntilObserver);
    }

    /* loaded from: classes17.dex */
    static final class TakeUntilObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = 3451719290311127173L;
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.internal.disposables.ArrayCompositeDisposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;

        TakeUntilObserver(io.reactivex.Observer<? super T> observer, io.reactivex.internal.disposables.ArrayCompositeDisposable arrayCompositeDisposable) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = arrayCompositeDisposable;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.setResource(0, disposable);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            this.getHighSpeedVideoSizes.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    final class TakeUntil implements io.reactivex.Observer<U> {
        private final io.reactivex.internal.disposables.ArrayCompositeDisposable Camera2StreamConfigurationMap;
        private final io.reactivex.observers.SerializedObserver<T> getHighSpeedVideoSizes;

        TakeUntil(io.reactivex.internal.disposables.ArrayCompositeDisposable arrayCompositeDisposable, io.reactivex.observers.SerializedObserver<T> serializedObserver) {
            this.Camera2StreamConfigurationMap = arrayCompositeDisposable;
            this.getHighSpeedVideoSizes = serializedObserver;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.Camera2StreamConfigurationMap.setResource(1, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(U u) {
            this.Camera2StreamConfigurationMap.dispose();
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.dispose();
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.dispose();
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
