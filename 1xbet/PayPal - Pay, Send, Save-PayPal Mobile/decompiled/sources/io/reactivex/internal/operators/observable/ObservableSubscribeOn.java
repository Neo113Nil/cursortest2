package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSubscribeOn<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.Scheduler getHighSpeedVideoFpsRanges;

    public ObservableSubscribeOn(io.reactivex.ObservableSource<T> observableSource, io.reactivex.Scheduler scheduler) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = scheduler;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableSubscribeOn.SubscribeOnObserver subscribeOnObserver = new io.reactivex.internal.operators.observable.ObservableSubscribeOn.SubscribeOnObserver(observer);
        observer.onSubscribe(subscribeOnObserver);
        io.reactivex.internal.disposables.DisposableHelper.setOnce(subscribeOnObserver, this.getHighSpeedVideoFpsRanges.scheduleDirect(new io.reactivex.internal.operators.observable.ObservableSubscribeOn.SubscribeTask(subscribeOnObserver)));
    }

    /* loaded from: classes17.dex */
    static final class SubscribeOnObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8094547886072529208L;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();

        SubscribeOnObserver(io.reactivex.Observer<? super T> observer) {
            this.getHighSpeedVideoFpsRanges = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoSizes, disposable);
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

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }

    /* loaded from: classes17.dex */
    final class SubscribeTask implements java.lang.Runnable {
        private final io.reactivex.internal.operators.observable.ObservableSubscribeOn.SubscribeOnObserver<T> getHighSpeedVideoSizes;

        SubscribeTask(io.reactivex.internal.operators.observable.ObservableSubscribeOn.SubscribeOnObserver<T> subscribeOnObserver) {
            this.getHighSpeedVideoSizes = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            io.reactivex.internal.operators.observable.ObservableSubscribeOn.this.source.subscribe(this.getHighSpeedVideoSizes);
        }
    }
}
