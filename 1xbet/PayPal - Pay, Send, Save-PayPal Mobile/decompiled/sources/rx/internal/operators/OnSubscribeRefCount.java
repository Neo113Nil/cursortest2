package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeRefCount<T> implements rx.Observable.OnSubscribe<T> {
    final rx.observables.ConnectableObservable<? extends T> Camera2StreamConfigurationMap;
    volatile rx.subscriptions.CompositeSubscription getHighSpeedVideoFpsRangesFor = new rx.subscriptions.CompositeSubscription();
    final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger(0);
    final java.util.concurrent.locks.ReentrantLock getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.locks.ReentrantLock();

    public OnSubscribeRefCount(rx.observables.ConnectableObservable<? extends T> connectableObservable) {
        this.Camera2StreamConfigurationMap = connectableObservable;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.Subscriber<? super T> subscriber) {
        boolean z;
        this.getHighResolutionOutputSizeshNQ4ISI.lock();
        if (this.getHighSpeedVideoSizes.incrementAndGet() == 1) {
            final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
            try {
                this.Camera2StreamConfigurationMap.connect(new rx.functions.Action1<rx.Subscription>() { // from class: rx.internal.operators.OnSubscribeRefCount.1
                    @Override // rx.functions.Action1
                    public /* synthetic */ void call(rx.Subscription subscription) {
                        try {
                            rx.internal.operators.OnSubscribeRefCount.this.getHighSpeedVideoFpsRangesFor.add(subscription);
                            rx.internal.operators.OnSubscribeRefCount onSubscribeRefCount = rx.internal.operators.OnSubscribeRefCount.this;
                            rx.Subscriber subscriber2 = subscriber;
                            rx.subscriptions.CompositeSubscription compositeSubscription = onSubscribeRefCount.getHighSpeedVideoFpsRangesFor;
                            subscriber2.add(rx.subscriptions.Subscriptions.create(new rx.internal.operators.OnSubscribeRefCount.AnonymousClass3(compositeSubscription)));
                            onSubscribeRefCount.Camera2StreamConfigurationMap.unsafeSubscribe(new rx.internal.operators.OnSubscribeRefCount.AnonymousClass2(subscriber2, subscriber2, compositeSubscription));
                        } finally {
                            rx.internal.operators.OnSubscribeRefCount.this.getHighResolutionOutputSizeshNQ4ISI.unlock();
                            atomicBoolean.set(false);
                        }
                    }
                });
                if (z) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (atomicBoolean.get()) {
                }
            }
        }
        try {
            rx.subscriptions.CompositeSubscription compositeSubscription = this.getHighSpeedVideoFpsRangesFor;
            subscriber.add(rx.subscriptions.Subscriptions.create(new rx.internal.operators.OnSubscribeRefCount.AnonymousClass3(compositeSubscription)));
            this.Camera2StreamConfigurationMap.unsafeSubscribe(new rx.internal.operators.OnSubscribeRefCount.AnonymousClass2(subscriber, subscriber, compositeSubscription));
        } finally {
            this.getHighResolutionOutputSizeshNQ4ISI.unlock();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRefCount$2, reason: invalid class name */
    class AnonymousClass2 extends rx.Subscriber<T> {
        final /* synthetic */ rx.Subscriber Camera2StreamConfigurationMap;
        final /* synthetic */ rx.subscriptions.CompositeSubscription getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(rx.Subscriber subscriber, rx.Subscriber subscriber2, rx.subscriptions.CompositeSubscription compositeSubscription) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = subscriber2;
            this.getHighSpeedVideoFpsRangesFor = compositeSubscription;
        }

        @Override // rx.Observer
        public void onError(java.lang.Throwable th) {
            getHighSpeedVideoFpsRangesFor();
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.Camera2StreamConfigurationMap.onNext(t);
        }

        @Override // rx.Observer
        public void onCompleted() {
            getHighSpeedVideoFpsRangesFor();
            this.Camera2StreamConfigurationMap.onCompleted();
        }

        private void getHighSpeedVideoFpsRangesFor() {
            rx.internal.operators.OnSubscribeRefCount.this.getHighResolutionOutputSizeshNQ4ISI.lock();
            try {
                if (rx.internal.operators.OnSubscribeRefCount.this.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRangesFor) {
                    if (rx.internal.operators.OnSubscribeRefCount.this.Camera2StreamConfigurationMap instanceof rx.Subscription) {
                        ((rx.Subscription) rx.internal.operators.OnSubscribeRefCount.this.Camera2StreamConfigurationMap).unsubscribe();
                    }
                    rx.internal.operators.OnSubscribeRefCount.this.getHighSpeedVideoFpsRangesFor.unsubscribe();
                    rx.internal.operators.OnSubscribeRefCount.this.getHighSpeedVideoFpsRangesFor = new rx.subscriptions.CompositeSubscription();
                    rx.internal.operators.OnSubscribeRefCount.this.getHighSpeedVideoSizes.set(0);
                }
            } finally {
                rx.internal.operators.OnSubscribeRefCount.this.getHighResolutionOutputSizeshNQ4ISI.unlock();
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRefCount$3, reason: invalid class name */
    class AnonymousClass3 implements rx.functions.Action0 {
        final /* synthetic */ rx.subscriptions.CompositeSubscription getHighResolutionOutputSizeshNQ4ISI;

        AnonymousClass3(rx.subscriptions.CompositeSubscription compositeSubscription) {
            this.getHighResolutionOutputSizeshNQ4ISI = compositeSubscription;
        }

        @Override // rx.functions.Action0
        public void call() {
            rx.internal.operators.OnSubscribeRefCount.this.getHighResolutionOutputSizeshNQ4ISI.lock();
            try {
                if (rx.internal.operators.OnSubscribeRefCount.this.getHighSpeedVideoFpsRangesFor == this.getHighResolutionOutputSizeshNQ4ISI && rx.internal.operators.OnSubscribeRefCount.this.getHighSpeedVideoSizes.decrementAndGet() == 0) {
                    if (rx.internal.operators.OnSubscribeRefCount.this.Camera2StreamConfigurationMap instanceof rx.Subscription) {
                        ((rx.Subscription) rx.internal.operators.OnSubscribeRefCount.this.Camera2StreamConfigurationMap).unsubscribe();
                    }
                    rx.internal.operators.OnSubscribeRefCount.this.getHighSpeedVideoFpsRangesFor.unsubscribe();
                    rx.internal.operators.OnSubscribeRefCount.this.getHighSpeedVideoFpsRangesFor = new rx.subscriptions.CompositeSubscription();
                }
            } finally {
                rx.internal.operators.OnSubscribeRefCount.this.getHighResolutionOutputSizeshNQ4ISI.unlock();
            }
        }
    }
}
