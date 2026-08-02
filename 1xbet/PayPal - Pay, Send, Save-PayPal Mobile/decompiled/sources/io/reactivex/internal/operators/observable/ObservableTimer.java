package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableTimer extends io.reactivex.Observable<java.lang.Long> {
    final long Camera2StreamConfigurationMap;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRanges;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;

    public ObservableTimer(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRangesFor = timeUnit;
        this.getHighSpeedVideoFpsRanges = scheduler;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super java.lang.Long> observer) {
        io.reactivex.internal.operators.observable.ObservableTimer.TimerObserver timerObserver = new io.reactivex.internal.operators.observable.ObservableTimer.TimerObserver(observer);
        observer.onSubscribe(timerObserver);
        io.reactivex.internal.disposables.DisposableHelper.trySet(timerObserver, this.getHighSpeedVideoFpsRanges.scheduleDirect(timerObserver, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class TimerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final io.reactivex.Observer<? super java.lang.Long> Camera2StreamConfigurationMap;

        TimerObserver(io.reactivex.Observer<? super java.lang.Long> observer) {
            this.Camera2StreamConfigurationMap = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (isDisposed()) {
                return;
            }
            this.Camera2StreamConfigurationMap.onNext(0L);
            lazySet(io.reactivex.internal.disposables.EmptyDisposable.INSTANCE);
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }
}
