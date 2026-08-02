package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CompletableOnSubscribeMergeIterable implements rx.Completable.OnSubscribe {
    final java.lang.Iterable<? extends rx.Completable> Camera2StreamConfigurationMap;

    public CompletableOnSubscribeMergeIterable(java.lang.Iterable<? extends rx.Completable> iterable) {
        this.Camera2StreamConfigurationMap = iterable;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.CompletableSubscriber completableSubscriber) {
        final rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        try {
            java.util.Iterator<? extends rx.Completable> it = this.Camera2StreamConfigurationMap.iterator();
            if (it == null) {
                completableSubscriber.onError(new java.lang.NullPointerException("The source iterator returned is null"));
                return;
            }
            final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(1);
            final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
            while (!compositeSubscription.isUnsubscribed()) {
                try {
                    if (it.hasNext()) {
                        if (compositeSubscription.isUnsubscribed()) {
                            return;
                        }
                        try {
                            rx.Completable next = it.next();
                            if (compositeSubscription.isUnsubscribed()) {
                                return;
                            }
                            if (next == null) {
                                compositeSubscription.unsubscribe();
                                java.lang.Throwable nullPointerException = new java.lang.NullPointerException("A completable source is null");
                                if (atomicBoolean.compareAndSet(false, true)) {
                                    completableSubscriber.onError(nullPointerException);
                                    return;
                                } else {
                                    rx.plugins.RxJavaHooks.onError(nullPointerException);
                                    return;
                                }
                            }
                            atomicInteger.getAndIncrement();
                            next.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMergeIterable.1
                                @Override // rx.CompletableSubscriber
                                public void onSubscribe(rx.Subscription subscription) {
                                    compositeSubscription.add(subscription);
                                }

                                @Override // rx.CompletableSubscriber
                                public void onError(java.lang.Throwable th) {
                                    compositeSubscription.unsubscribe();
                                    if (atomicBoolean.compareAndSet(false, true)) {
                                        completableSubscriber.onError(th);
                                    } else {
                                        rx.plugins.RxJavaHooks.onError(th);
                                    }
                                }

                                @Override // rx.CompletableSubscriber
                                public void onCompleted() {
                                    if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
                                        completableSubscriber.onCompleted();
                                    }
                                }
                            });
                        } catch (java.lang.Throwable th) {
                            compositeSubscription.unsubscribe();
                            if (atomicBoolean.compareAndSet(false, true)) {
                                completableSubscriber.onError(th);
                                return;
                            } else {
                                rx.plugins.RxJavaHooks.onError(th);
                                return;
                            }
                        }
                    } else {
                        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
                            completableSubscriber.onCompleted();
                            return;
                        }
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    compositeSubscription.unsubscribe();
                    if (atomicBoolean.compareAndSet(false, true)) {
                        completableSubscriber.onError(th2);
                        return;
                    } else {
                        rx.plugins.RxJavaHooks.onError(th2);
                        return;
                    }
                }
            }
        } catch (java.lang.Throwable th3) {
            completableSubscriber.onError(th3);
        }
    }
}
