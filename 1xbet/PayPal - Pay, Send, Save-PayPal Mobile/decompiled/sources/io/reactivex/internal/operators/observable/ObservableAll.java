package io.reactivex.internal.operators.observable;

/* loaded from: classes17.dex */
public final class ObservableAll<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, java.lang.Boolean> {
    final io.reactivex.functions.Predicate<? super T> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableAll(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Predicate<? super T> predicate) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = predicate;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super java.lang.Boolean> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableAll.AllObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    static final class AllObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.Predicate<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        AllObserver(io.reactivex.Observer<? super java.lang.Boolean> observer, io.reactivex.functions.Predicate<? super T> predicate) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.Camera2StreamConfigurationMap = predicate;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            try {
                if (this.Camera2StreamConfigurationMap.test(t)) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighSpeedVideoSizes.dispose();
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(java.lang.Boolean.FALSE);
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(java.lang.Boolean.TRUE);
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.isDisposed();
        }
    }
}
