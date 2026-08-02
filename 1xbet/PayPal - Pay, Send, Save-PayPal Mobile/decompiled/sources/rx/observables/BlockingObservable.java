package rx.observables;

/* loaded from: classes18.dex */
public final class BlockingObservable<T> {
    private final rx.Observable<? extends T> getHighSpeedVideoSizes;
    static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

    private BlockingObservable(rx.Observable<? extends T> observable) {
        this.getHighSpeedVideoSizes = observable;
    }

    public static <T> rx.observables.BlockingObservable<T> from(rx.Observable<? extends T> observable) {
        return new rx.observables.BlockingObservable<>(observable);
    }

    public final void forEach(final rx.functions.Action1<? super T> action1) {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        rx.internal.util.BlockingUtils.awaitForComplete(countDownLatch, this.getHighSpeedVideoSizes.subscribe((rx.Subscriber<? super java.lang.Object>) new rx.Subscriber<T>() { // from class: rx.observables.BlockingObservable.1
            @Override // rx.Observer
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                atomicReference.set(th);
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onNext(T t) {
                action1.call(t);
            }
        }));
        if (atomicReference.get() != null) {
            rx.exceptions.Exceptions.propagate((java.lang.Throwable) atomicReference.get());
        }
    }

    public final java.util.Iterator<T> getIterator() {
        return rx.internal.operators.BlockingOperatorToIterator.toIterator(this.getHighSpeedVideoSizes);
    }

    public final T first() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.first());
    }

    public final T first(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.first(func1));
    }

    public final T firstOrDefault(T t) {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.map(rx.internal.util.UtilityFunctions.identity()).firstOrDefault(t));
    }

    public final T firstOrDefault(T t, rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.filter(func1).map(rx.internal.util.UtilityFunctions.identity()).firstOrDefault(t));
    }

    public final T last() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.last());
    }

    public final T last(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.last(func1));
    }

    public final T lastOrDefault(T t) {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.map(rx.internal.util.UtilityFunctions.identity()).lastOrDefault(t));
    }

    public final T lastOrDefault(T t, rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.filter(func1).map(rx.internal.util.UtilityFunctions.identity()).lastOrDefault(t));
    }

    public final java.lang.Iterable<T> mostRecent(T t) {
        return rx.internal.operators.BlockingOperatorMostRecent.mostRecent(this.getHighSpeedVideoSizes, t);
    }

    public final java.lang.Iterable<T> next() {
        return rx.internal.operators.BlockingOperatorNext.next(this.getHighSpeedVideoSizes);
    }

    public final java.lang.Iterable<T> latest() {
        return rx.internal.operators.BlockingOperatorLatest.latest(this.getHighSpeedVideoSizes);
    }

    public final T single() {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.single());
    }

    public final T single(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.single(func1));
    }

    public final T singleOrDefault(T t) {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.map(rx.internal.util.UtilityFunctions.identity()).singleOrDefault(t));
    }

    public final T singleOrDefault(T t, rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.filter(func1).map(rx.internal.util.UtilityFunctions.identity()).singleOrDefault(t));
    }

    public final java.util.concurrent.Future<T> toFuture() {
        return rx.internal.operators.BlockingOperatorToFuture.toFuture(this.getHighSpeedVideoSizes);
    }

    public final java.lang.Iterable<T> toIterable() {
        return new java.lang.Iterable<T>() { // from class: rx.observables.BlockingObservable.2
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return rx.observables.BlockingObservable.this.getIterator();
            }
        };
    }

    private T getHighResolutionOutputSizeshNQ4ISI(rx.Observable<? extends T> observable) {
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        final java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        rx.internal.util.BlockingUtils.awaitForComplete(countDownLatch, observable.subscribe((rx.Subscriber<? super java.lang.Object>) new rx.Subscriber<T>() { // from class: rx.observables.BlockingObservable.3
            @Override // rx.Observer
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                atomicReference2.set(th);
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onNext(T t) {
                atomicReference.set(t);
            }
        }));
        if (atomicReference2.get() != null) {
            rx.exceptions.Exceptions.propagate((java.lang.Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }

    public final void subscribe() {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.lang.Throwable[] thArr = {null};
        rx.internal.util.BlockingUtils.awaitForComplete(countDownLatch, this.getHighSpeedVideoSizes.subscribe((rx.Subscriber<? super java.lang.Object>) new rx.Subscriber<T>() { // from class: rx.observables.BlockingObservable.4
            @Override // rx.Observer
            public void onNext(T t) {
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                thArr[0] = th;
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public void onCompleted() {
                countDownLatch.countDown();
            }
        }));
        java.lang.Throwable th = thArr[0];
        if (th != null) {
            rx.exceptions.Exceptions.propagate(th);
        }
    }

    public final void subscribe(rx.Observer<? super T> observer) {
        java.lang.Object poll;
        final java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        rx.Subscription subscribe = this.getHighSpeedVideoSizes.subscribe((rx.Subscriber<? super java.lang.Object>) new rx.Subscriber<T>() { // from class: rx.observables.BlockingObservable.5
            @Override // rx.Observer
            public void onNext(T t) {
                linkedBlockingQueue.offer(rx.internal.operators.NotificationLite.next(t));
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                linkedBlockingQueue.offer(rx.internal.operators.NotificationLite.error(th));
            }

            @Override // rx.Observer
            public void onCompleted() {
                linkedBlockingQueue.offer(rx.internal.operators.NotificationLite.completed());
            }
        });
        do {
            try {
                poll = linkedBlockingQueue.poll();
                if (poll == null) {
                    poll = linkedBlockingQueue.take();
                }
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                observer.onError(e);
                return;
            } finally {
                subscribe.unsubscribe();
            }
        } while (!rx.internal.operators.NotificationLite.accept(observer, poll));
    }

    public final void subscribe(rx.Subscriber<? super T> subscriber) {
        final java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        final rx.Producer[] producerArr = {null};
        rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>() { // from class: rx.observables.BlockingObservable.6
            @Override // rx.Observer
            public void onNext(T t) {
                linkedBlockingQueue.offer(rx.internal.operators.NotificationLite.next(t));
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                linkedBlockingQueue.offer(rx.internal.operators.NotificationLite.error(th));
            }

            @Override // rx.Observer
            public void onCompleted() {
                linkedBlockingQueue.offer(rx.internal.operators.NotificationLite.completed());
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(rx.Producer producer) {
                producerArr[0] = producer;
                linkedBlockingQueue.offer(rx.observables.BlockingObservable.getHighSpeedVideoFpsRangesFor);
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void onStart() {
                linkedBlockingQueue.offer(rx.observables.BlockingObservable.Camera2StreamConfigurationMap);
            }
        };
        subscriber.add(subscriber2);
        subscriber.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.observables.BlockingObservable.7
            @Override // rx.functions.Action0
            public void call() {
                linkedBlockingQueue.offer(rx.observables.BlockingObservable.getHighResolutionOutputSizeshNQ4ISI);
            }
        }));
        this.getHighSpeedVideoSizes.subscribe((rx.Subscriber<? super java.lang.Object>) subscriber2);
        while (!subscriber.isUnsubscribed()) {
            try {
                java.lang.Object poll = linkedBlockingQueue.poll();
                if (poll == null) {
                    poll = linkedBlockingQueue.take();
                }
                if (subscriber.isUnsubscribed() || poll == getHighResolutionOutputSizeshNQ4ISI) {
                    break;
                }
                if (poll == Camera2StreamConfigurationMap) {
                    subscriber.onStart();
                } else if (poll == getHighSpeedVideoFpsRangesFor) {
                    subscriber.setProducer(producerArr[0]);
                } else if (rx.internal.operators.NotificationLite.accept(subscriber, poll)) {
                    return;
                }
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                subscriber.onError(e);
                return;
            } finally {
                subscriber2.unsubscribe();
            }
        }
    }

    public final void subscribe(rx.functions.Action1<? super T> action1) {
        subscribe(action1, new rx.functions.Action1<java.lang.Throwable>() { // from class: rx.observables.BlockingObservable.8
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Throwable th) {
                throw new rx.exceptions.OnErrorNotImplementedException(th);
            }
        }, rx.functions.Actions.empty());
    }

    public final void subscribe(rx.functions.Action1<? super T> action1, rx.functions.Action1<? super java.lang.Throwable> action12) {
        subscribe(action1, action12, rx.functions.Actions.empty());
    }

    public final void subscribe(final rx.functions.Action1<? super T> action1, final rx.functions.Action1<? super java.lang.Throwable> action12, final rx.functions.Action0 action0) {
        subscribe(new rx.Observer<T>() { // from class: rx.observables.BlockingObservable.9
            @Override // rx.Observer
            public void onNext(T t) {
                action1.call(t);
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                action12.call(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                action0.call();
            }
        });
    }
}
