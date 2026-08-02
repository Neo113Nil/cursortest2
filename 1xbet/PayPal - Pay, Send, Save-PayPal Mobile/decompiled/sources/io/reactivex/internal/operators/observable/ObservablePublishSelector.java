package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservablePublishSelector<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> getHighResolutionOutputSizeshNQ4ISI;

    public ObservablePublishSelector(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> function) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = function;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        io.reactivex.subjects.PublishSubject create = io.reactivex.subjects.PublishSubject.create();
        try {
            io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(create), "The selector returned a null ObservableSource");
            io.reactivex.internal.operators.observable.ObservablePublishSelector.TargetObserver targetObserver = new io.reactivex.internal.operators.observable.ObservablePublishSelector.TargetObserver(observer);
            observableSource.subscribe(targetObserver);
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservablePublishSelector.SourceObserver(create, targetObserver));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    /* loaded from: classes17.dex */
    static final class SourceObserver<T, R> implements io.reactivex.Observer<T> {
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.subjects.PublishSubject<T> getHighSpeedVideoFpsRanges;

        SourceObserver(io.reactivex.subjects.PublishSubject<T> publishSubject, java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference) {
            this.getHighSpeedVideoFpsRanges = publishSubject;
            this.getHighResolutionOutputSizeshNQ4ISI = atomicReference;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighResolutionOutputSizeshNQ4ISI, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRanges.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class TargetObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<R>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 854110278590336484L;
        final io.reactivex.Observer<? super R> Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;

        TargetObserver(io.reactivex.Observer<? super R> observer) {
            this.Camera2StreamConfigurationMap = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(R r) {
            this.Camera2StreamConfigurationMap.onNext(r);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.Camera2StreamConfigurationMap.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.isDisposed();
        }
    }
}
