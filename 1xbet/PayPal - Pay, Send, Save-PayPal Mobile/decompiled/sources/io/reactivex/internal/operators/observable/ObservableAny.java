package io.reactivex.internal.operators.observable;

/* loaded from: classes17.dex */
public final class ObservableAny<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, java.lang.Boolean> {
    final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoSizes;

    public ObservableAny(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Predicate<? super T> predicate) {
        super(observableSource);
        this.getHighSpeedVideoSizes = predicate;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super java.lang.Boolean> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableAny.AnyObserver(observer, this.getHighSpeedVideoSizes));
    }

    static final class AnyObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super java.lang.Boolean> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRangesFor;

        AnyObserver(io.reactivex.Observer<? super java.lang.Boolean> observer, io.reactivex.functions.Predicate<? super T> predicate) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighSpeedVideoFpsRangesFor = predicate;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            try {
                if (this.getHighSpeedVideoFpsRangesFor.test(t)) {
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    this.Camera2StreamConfigurationMap.dispose();
                    this.getHighSpeedVideoFpsRanges.onNext(java.lang.Boolean.TRUE);
                    this.getHighSpeedVideoFpsRanges.onComplete();
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.Camera2StreamConfigurationMap.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRanges.onNext(java.lang.Boolean.FALSE);
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }
    }
}
