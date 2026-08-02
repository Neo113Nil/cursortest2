package io.reactivex.internal.operators.observable;

/* loaded from: classes17.dex */
public final class ObservableElementAt<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long Camera2StreamConfigurationMap;
    final boolean getHighSpeedVideoFpsRangesFor;
    final T getHighSpeedVideoSizes;

    public ObservableElementAt(io.reactivex.ObservableSource<T> observableSource, long j, T t, boolean z) {
        super(observableSource);
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoSizes = t;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableElementAt.ElementAtObserver(observer, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor));
    }

    static final class ElementAtObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final boolean Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        final T getHighSpeedVideoSizes;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizesFor;
        final long getOutputFormats;

        ElementAtObserver(io.reactivex.Observer<? super T> observer, long j, T t, boolean z) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getOutputFormats = j;
            this.getHighSpeedVideoSizes = t;
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizesFor, disposable)) {
                this.getHighSpeedVideoSizesFor = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizesFor.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j == this.getOutputFormats) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizesFor.dispose();
                this.getHighSpeedVideoFpsRanges.onNext(t);
                this.getHighSpeedVideoFpsRanges.onComplete();
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
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            T t = this.getHighSpeedVideoSizes;
            if (t == null && this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRanges.onError(new java.util.NoSuchElementException());
                return;
            }
            if (t != null) {
                this.getHighSpeedVideoFpsRanges.onNext(t);
            }
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
