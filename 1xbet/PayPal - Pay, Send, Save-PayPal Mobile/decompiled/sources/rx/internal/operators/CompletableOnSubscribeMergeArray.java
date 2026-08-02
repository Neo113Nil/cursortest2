package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CompletableOnSubscribeMergeArray implements rx.Completable.OnSubscribe {
    final rx.Completable[] getHighSpeedVideoFpsRangesFor;

    public CompletableOnSubscribeMergeArray(rx.Completable[] completableArr) {
        this.getHighSpeedVideoFpsRangesFor = completableArr;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.CompletableSubscriber completableSubscriber) {
        final rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
        boolean z = true;
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(this.getHighSpeedVideoFpsRangesFor.length + 1);
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        completableSubscriber.onSubscribe(compositeSubscription);
        rx.Completable[] completableArr = this.getHighSpeedVideoFpsRangesFor;
        int length = completableArr.length;
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            rx.Completable completable = completableArr[i];
            if (compositeSubscription.isUnsubscribed()) {
                return;
            }
            if (completable == null) {
                compositeSubscription.unsubscribe();
                java.lang.Throwable nullPointerException = new java.lang.NullPointerException("A completable source is null");
                if (atomicBoolean.compareAndSet(z2, z)) {
                    completableSubscriber.onError(nullPointerException);
                    return;
                }
                rx.plugins.RxJavaHooks.onError(nullPointerException);
            }
            completable.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMergeArray.1
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
            i++;
            z = true;
            z2 = false;
        }
        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
            completableSubscriber.onCompleted();
        }
    }
}
