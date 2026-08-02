package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableTakeWhile<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoSizes;

    public ObservableTakeWhile(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Predicate<? super T> predicate) {
        super(observableSource);
        this.getHighSpeedVideoSizes = predicate;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableTakeWhile.TakeWhileObserver(observer, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class TakeWhileObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.Predicate<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        TakeWhileObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Predicate<? super T> predicate) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = predicate;
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
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            try {
                if (!this.getHighResolutionOutputSizeshNQ4ISI.test(t)) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    this.getHighSpeedVideoSizes.dispose();
                    this.getHighSpeedVideoFpsRanges.onComplete();
                    return;
                }
                this.getHighSpeedVideoFpsRanges.onNext(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRangesFor = true;
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
