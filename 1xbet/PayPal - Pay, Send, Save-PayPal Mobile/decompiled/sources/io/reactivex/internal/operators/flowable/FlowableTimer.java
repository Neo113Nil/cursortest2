package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableTimer extends io.reactivex.Flowable<java.lang.Long> {
    final long Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;

    public FlowableTimer(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighResolutionOutputSizeshNQ4ISI = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableTimer.TimerSubscriber timerSubscriber = new io.reactivex.internal.operators.flowable.FlowableTimer.TimerSubscriber(subscriber);
        subscriber.onSubscribe(timerSubscriber);
        io.reactivex.internal.disposables.DisposableHelper.trySet(timerSubscriber, this.getHighSpeedVideoFpsRangesFor.scheduleDirect(timerSubscriber, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class TimerSubscriber extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final org.reactivestreams.Subscriber<? super java.lang.Long> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;

        TimerSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                this.getHighSpeedVideoSizes = true;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                if (this.getHighSpeedVideoSizes) {
                    this.getHighSpeedVideoFpsRangesFor.onNext(0L);
                    lazySet(io.reactivex.internal.disposables.EmptyDisposable.INSTANCE);
                    this.getHighSpeedVideoFpsRangesFor.onComplete();
                } else {
                    lazySet(io.reactivex.internal.disposables.EmptyDisposable.INSTANCE);
                    this.getHighSpeedVideoFpsRangesFor.onError(new io.reactivex.exceptions.MissingBackpressureException("Can't deliver value due to lack of requests"));
                }
            }
        }
    }
}
