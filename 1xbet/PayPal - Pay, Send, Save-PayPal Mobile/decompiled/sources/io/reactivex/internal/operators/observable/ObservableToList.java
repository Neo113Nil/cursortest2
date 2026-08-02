package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableToList<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> getHighSpeedVideoFpsRanges;

    public ObservableToList(io.reactivex.ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = io.reactivex.internal.functions.Functions.createArrayList(i);
    }

    public ObservableToList(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<U> callable) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = callable;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super U> observer) {
        try {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableToList.ToListObserver(observer, (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    /* loaded from: classes17.dex */
    static final class ToListObserver<T, U extends java.util.Collection<? super T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        U getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super U> getHighSpeedVideoFpsRangesFor;

        ToListObserver(io.reactivex.Observer<? super U> observer, U u) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getHighSpeedVideoFpsRanges = u;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRanges.add(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            U u = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoFpsRangesFor.onNext(u);
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }
    }
}
