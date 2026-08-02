package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSkipWhile<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableSkipWhile(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Predicate<? super T> predicate) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = predicate;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSkipWhile.SkipWhileObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class SkipWhileObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        SkipWhileObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Predicate<? super T> predicate) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighSpeedVideoFpsRangesFor = predicate;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRanges.onNext(t);
                return;
            }
            try {
                if (this.getHighSpeedVideoFpsRangesFor.test(t)) {
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoFpsRanges.onNext(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes.dispose();
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
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
}
