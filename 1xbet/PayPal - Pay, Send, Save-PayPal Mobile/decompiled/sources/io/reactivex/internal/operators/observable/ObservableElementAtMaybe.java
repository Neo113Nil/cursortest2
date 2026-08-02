package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableElementAtMaybe<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.FuseToObservable<T> {
    final io.reactivex.ObservableSource<T> getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoSizes;

    public ObservableElementAtMaybe(io.reactivex.ObservableSource<T> observableSource, long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = observableSource;
        this.getHighSpeedVideoSizes = j;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.observable.ObservableElementAtMaybe.ElementAtObserver(maybeObserver, this.getHighSpeedVideoSizes));
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final io.reactivex.Observable<T> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableElementAt(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null, false));
    }

    /* loaded from: classes17.dex */
    static final class ElementAtObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final long Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoSizes;

        ElementAtObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, long j) {
            this.getHighSpeedVideoSizes = maybeObserver;
            this.Camera2StreamConfigurationMap = j;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j == this.Camera2StreamConfigurationMap) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoFpsRanges.dispose();
                this.getHighSpeedVideoSizes.onSuccess(t);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = j + 1;
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
