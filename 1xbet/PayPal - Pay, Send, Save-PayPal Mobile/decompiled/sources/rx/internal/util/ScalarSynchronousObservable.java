package rx.internal.util;

/* loaded from: classes18.dex */
public final class ScalarSynchronousObservable<T> extends rx.Observable<T> {
    static final boolean getHighSpeedVideoFpsRanges = java.lang.Boolean.valueOf(java.lang.System.getProperty("rx.just.strong-mode", "false")).booleanValue();
    final T Camera2StreamConfigurationMap;

    static <T> rx.Producer getHighSpeedVideoFpsRangesFor(rx.Subscriber<? super T> subscriber, T t) {
        if (getHighSpeedVideoFpsRanges) {
            return new rx.internal.producers.SingleProducer(subscriber, t);
        }
        return new rx.internal.util.ScalarSynchronousObservable.WeakSingleProducer(subscriber, t);
    }

    public static <T> rx.internal.util.ScalarSynchronousObservable<T> create(T t) {
        return new rx.internal.util.ScalarSynchronousObservable<>(t);
    }

    protected ScalarSynchronousObservable(T t) {
        super(rx.plugins.RxJavaHooks.onCreate(new rx.internal.util.ScalarSynchronousObservable.JustOnSubscribe(t)));
        this.Camera2StreamConfigurationMap = t;
    }

    public final T get() {
        return this.Camera2StreamConfigurationMap;
    }

    public final rx.Observable<T> scalarScheduleOn(final rx.Scheduler scheduler) {
        rx.functions.Func1<rx.functions.Action0, rx.Subscription> func1;
        if (scheduler instanceof rx.internal.schedulers.EventLoopsScheduler) {
            final rx.internal.schedulers.EventLoopsScheduler eventLoopsScheduler = (rx.internal.schedulers.EventLoopsScheduler) scheduler;
            func1 = new rx.functions.Func1<rx.functions.Action0, rx.Subscription>() { // from class: rx.internal.util.ScalarSynchronousObservable.1
                @Override // rx.functions.Func1
                public /* synthetic */ rx.Subscription call(rx.functions.Action0 action0) {
                    return eventLoopsScheduler.scheduleDirect(action0);
                }
            };
        } else {
            func1 = new rx.functions.Func1<rx.functions.Action0, rx.Subscription>() { // from class: rx.internal.util.ScalarSynchronousObservable.2
                @Override // rx.functions.Func1
                public /* synthetic */ rx.Subscription call(rx.functions.Action0 action0) {
                    final rx.functions.Action0 action02 = action0;
                    final rx.Scheduler.Worker createWorker = scheduler.createWorker();
                    createWorker.schedule(new rx.functions.Action0() { // from class: rx.internal.util.ScalarSynchronousObservable.2.1
                        @Override // rx.functions.Action0
                        public void call() {
                            try {
                                action02.call();
                            } finally {
                                createWorker.unsubscribe();
                            }
                        }
                    });
                    return createWorker;
                }
            };
        }
        return unsafeCreate(new rx.internal.util.ScalarSynchronousObservable.ScalarAsyncOnSubscribe(this.Camera2StreamConfigurationMap, func1));
    }

    static final class JustOnSubscribe<T> implements rx.Observable.OnSubscribe<T> {
        final T getHighSpeedVideoFpsRanges;

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.Subscriber subscriber = (rx.Subscriber) obj;
            subscriber.setProducer(rx.internal.util.ScalarSynchronousObservable.getHighSpeedVideoFpsRangesFor(subscriber, this.getHighSpeedVideoFpsRanges));
        }

        JustOnSubscribe(T t) {
            this.getHighSpeedVideoFpsRanges = t;
        }
    }

    static final class ScalarAsyncOnSubscribe<T> implements rx.Observable.OnSubscribe<T> {
        final rx.functions.Func1<rx.functions.Action0, rx.Subscription> Camera2StreamConfigurationMap;
        final T getHighSpeedVideoSizes;

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.Subscriber subscriber = (rx.Subscriber) obj;
            subscriber.setProducer(new rx.internal.util.ScalarSynchronousObservable.ScalarAsyncProducer(subscriber, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap));
        }

        ScalarAsyncOnSubscribe(T t, rx.functions.Func1<rx.functions.Action0, rx.Subscription> func1) {
            this.getHighSpeedVideoSizes = t;
            this.Camera2StreamConfigurationMap = func1;
        }
    }

    static final class ScalarAsyncProducer<T> extends java.util.concurrent.atomic.AtomicBoolean implements rx.Producer, rx.functions.Action0 {
        private static final long serialVersionUID = -2466317989629281651L;
        final rx.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final T getHighSpeedVideoFpsRanges;
        final rx.functions.Func1<rx.functions.Action0, rx.Subscription> getHighSpeedVideoFpsRangesFor;

        public ScalarAsyncProducer(rx.Subscriber<? super T> subscriber, T t, rx.functions.Func1<rx.functions.Action0, rx.Subscription> func1) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoFpsRanges = t;
            this.getHighSpeedVideoFpsRangesFor = func1;
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
            }
            if (j == 0 || !compareAndSet(false, true)) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.add(this.getHighSpeedVideoFpsRangesFor.call(this));
        }

        @Override // rx.functions.Action0
        public final void call() {
            rx.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            if (subscriber.isUnsubscribed()) {
                return;
            }
            T t = this.getHighSpeedVideoFpsRanges;
            try {
                subscriber.onNext(t);
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onCompleted();
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, subscriber, t);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScalarAsyncProducer[");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", ");
            sb.append(get());
            sb.append("]");
            return sb.toString();
        }
    }

    public final <R> rx.Observable<R> scalarFlatMap(final rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1) {
        return unsafeCreate(new rx.Observable.OnSubscribe<R>() { // from class: rx.internal.util.ScalarSynchronousObservable.3
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Object obj) {
                rx.Subscriber subscriber = (rx.Subscriber) obj;
                rx.Observable observable = (rx.Observable) func1.call(rx.internal.util.ScalarSynchronousObservable.this.Camera2StreamConfigurationMap);
                if (observable instanceof rx.internal.util.ScalarSynchronousObservable) {
                    subscriber.setProducer(rx.internal.util.ScalarSynchronousObservable.getHighSpeedVideoFpsRangesFor(subscriber, ((rx.internal.util.ScalarSynchronousObservable) observable).Camera2StreamConfigurationMap));
                } else {
                    observable.unsafeSubscribe(rx.observers.Subscribers.wrap(subscriber));
                }
            }
        });
    }

    static final class WeakSingleProducer<T> implements rx.Producer {
        final rx.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final T getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;

        public WeakSingleProducer(rx.Subscriber<? super T> subscriber, T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoFpsRanges = t;
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            if (j < 0) {
                throw new java.lang.IllegalStateException("n >= required but it was ".concat(java.lang.String.valueOf(j)));
            }
            if (j != 0) {
                this.getHighSpeedVideoFpsRangesFor = true;
                rx.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                T t = this.getHighSpeedVideoFpsRanges;
                try {
                    subscriber.onNext(t);
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    subscriber.onCompleted();
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, subscriber, t);
                }
            }
        }
    }
}
