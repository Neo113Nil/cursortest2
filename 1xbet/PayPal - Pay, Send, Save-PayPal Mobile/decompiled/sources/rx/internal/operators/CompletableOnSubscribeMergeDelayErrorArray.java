package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CompletableOnSubscribeMergeDelayErrorArray implements rx.Completable.OnSubscribe {
    final rx.Completable[] getHighSpeedVideoFpsRangesFor;

    public CompletableOnSubscribeMergeDelayErrorArray(rx.Completable[] completableArr) {
        this.getHighSpeedVideoFpsRangesFor = completableArr;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.CompletableSubscriber completableSubscriber) {
        final rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(this.getHighSpeedVideoFpsRangesFor.length + 1);
        final java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        completableSubscriber.onSubscribe(compositeSubscription);
        for (rx.Completable completable : this.getHighSpeedVideoFpsRangesFor) {
            if (compositeSubscription.isUnsubscribed()) {
                return;
            }
            if (completable == null) {
                concurrentLinkedQueue.offer(new java.lang.NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completable.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMergeDelayErrorArray.1
                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(rx.Subscription subscription) {
                        compositeSubscription.add(subscription);
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(java.lang.Throwable th) {
                        concurrentLinkedQueue.offer(th);
                        getHighSpeedVideoFpsRanges();
                    }

                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        getHighSpeedVideoFpsRanges();
                    }

                    private void getHighSpeedVideoFpsRanges() {
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (concurrentLinkedQueue.isEmpty()) {
                                completableSubscriber.onCompleted();
                            } else {
                                completableSubscriber.onError(rx.internal.operators.CompletableOnSubscribeMerge.collectErrors(concurrentLinkedQueue));
                            }
                        }
                    }
                });
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (concurrentLinkedQueue.isEmpty()) {
                completableSubscriber.onCompleted();
            } else {
                completableSubscriber.onError(rx.internal.operators.CompletableOnSubscribeMerge.collectErrors(concurrentLinkedQueue));
            }
        }
    }
}
