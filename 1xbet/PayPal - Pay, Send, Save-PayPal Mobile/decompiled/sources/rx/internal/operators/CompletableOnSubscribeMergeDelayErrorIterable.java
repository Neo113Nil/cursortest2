package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CompletableOnSubscribeMergeDelayErrorIterable implements rx.Completable.OnSubscribe {
    final java.lang.Iterable<? extends rx.Completable> getHighSpeedVideoSizes;

    public CompletableOnSubscribeMergeDelayErrorIterable(java.lang.Iterable<? extends rx.Completable> iterable) {
        this.getHighSpeedVideoSizes = iterable;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.CompletableSubscriber completableSubscriber) {
        java.util.Queue mpscLinkedAtomicQueue;
        final rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        try {
            java.util.Iterator<? extends rx.Completable> it = this.getHighSpeedVideoSizes.iterator();
            if (it == null) {
                completableSubscriber.onError(new java.lang.NullPointerException("The source iterator returned is null"));
                return;
            }
            final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(1);
            if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
                mpscLinkedAtomicQueue = new rx.internal.util.unsafe.MpscLinkedQueue();
            } else {
                mpscLinkedAtomicQueue = new rx.internal.util.atomic.MpscLinkedAtomicQueue();
            }
            final java.util.Queue queue = mpscLinkedAtomicQueue;
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
                                queue.offer(new java.lang.NullPointerException("A completable source is null"));
                                if (atomicInteger.decrementAndGet() == 0) {
                                    if (queue.isEmpty()) {
                                        completableSubscriber.onCompleted();
                                        return;
                                    } else {
                                        completableSubscriber.onError(rx.internal.operators.CompletableOnSubscribeMerge.collectErrors(queue));
                                        return;
                                    }
                                }
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            next.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMergeDelayErrorIterable.1
                                @Override // rx.CompletableSubscriber
                                public void onSubscribe(rx.Subscription subscription) {
                                    compositeSubscription.add(subscription);
                                }

                                @Override // rx.CompletableSubscriber
                                public void onError(java.lang.Throwable th) {
                                    queue.offer(th);
                                    getHighSpeedVideoFpsRangesFor();
                                }

                                @Override // rx.CompletableSubscriber
                                public void onCompleted() {
                                    getHighSpeedVideoFpsRangesFor();
                                }

                                private void getHighSpeedVideoFpsRangesFor() {
                                    if (atomicInteger.decrementAndGet() == 0) {
                                        if (queue.isEmpty()) {
                                            completableSubscriber.onCompleted();
                                        } else {
                                            completableSubscriber.onError(rx.internal.operators.CompletableOnSubscribeMerge.collectErrors(queue));
                                        }
                                    }
                                }
                            });
                        } catch (java.lang.Throwable th) {
                            queue.offer(th);
                            if (atomicInteger.decrementAndGet() == 0) {
                                if (queue.isEmpty()) {
                                    completableSubscriber.onCompleted();
                                    return;
                                } else {
                                    completableSubscriber.onError(rx.internal.operators.CompletableOnSubscribeMerge.collectErrors(queue));
                                    return;
                                }
                            }
                            return;
                        }
                    } else {
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (queue.isEmpty()) {
                                completableSubscriber.onCompleted();
                                return;
                            } else {
                                completableSubscriber.onError(rx.internal.operators.CompletableOnSubscribeMerge.collectErrors(queue));
                                return;
                            }
                        }
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    queue.offer(th2);
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (queue.isEmpty()) {
                            completableSubscriber.onCompleted();
                            return;
                        } else {
                            completableSubscriber.onError(rx.internal.operators.CompletableOnSubscribeMerge.collectErrors(queue));
                            return;
                        }
                    }
                    return;
                }
            }
        } catch (java.lang.Throwable th3) {
            completableSubscriber.onError(th3);
        }
    }
}
