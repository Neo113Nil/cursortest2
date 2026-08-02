package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableUnsubscribeOn<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public ObservableUnsubscribeOn(io.reactivex.ObservableSource<T> observableSource, io.reactivex.Scheduler scheduler) {
        super(observableSource);
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableUnsubscribeOn.UnsubscribeObserver(observer, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class UnsubscribeObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1015244841293359600L;
        final io.reactivex.Scheduler Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRangesFor;

        UnsubscribeObserver(io.reactivex.Observer<? super T> observer, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.Camera2StreamConfigurationMap = scheduler;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (get()) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (get()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.Camera2StreamConfigurationMap.scheduleDirect(new io.reactivex.internal.operators.observable.ObservableUnsubscribeOn.UnsubscribeObserver.DisposeTask());
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }

        final class DisposeTask implements java.lang.Runnable {
            DisposeTask() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.observable.ObservableUnsubscribeOn.UnsubscribeObserver.this.getHighSpeedVideoFpsRanges.dispose();
            }
        }
    }
}
