package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleOperatorZip {
    private SingleOperatorZip() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T, R> rx.Single<R> zip(final rx.Single<? extends T>[] singleArr, final rx.functions.FuncN<? extends R> funcN) {
        return rx.Single.create(new rx.Single.OnSubscribe<R>() { // from class: rx.internal.operators.SingleOperatorZip.1
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                final rx.SingleSubscriber singleSubscriber = (rx.SingleSubscriber) obj;
                if (singleArr.length == 0) {
                    singleSubscriber.onError(new java.util.NoSuchElementException("Can't zip 0 Singles."));
                    return;
                }
                final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(singleArr.length);
                final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
                final java.lang.Object[] objArr = new java.lang.Object[singleArr.length];
                rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
                singleSubscriber.add(compositeSubscription);
                for (int i = 0; i < singleArr.length && !compositeSubscription.isUnsubscribed() && !atomicBoolean.get(); i++) {
                    final int i2 = i;
                    rx.Subscription subscription = new rx.SingleSubscriber<T>() { // from class: rx.internal.operators.SingleOperatorZip.1.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // rx.SingleSubscriber
                        public void onSuccess(T t) {
                            objArr[i2] = t;
                            if (atomicInteger.decrementAndGet() == 0) {
                                try {
                                    singleSubscriber.onSuccess(funcN.call(objArr));
                                } catch (java.lang.Throwable th) {
                                    rx.exceptions.Exceptions.throwIfFatal(th);
                                    onError(th);
                                }
                            }
                        }

                        @Override // rx.SingleSubscriber
                        public void onError(java.lang.Throwable th) {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                singleSubscriber.onError(th);
                            } else {
                                rx.plugins.RxJavaHooks.onError(th);
                            }
                        }
                    };
                    compositeSubscription.add(subscription);
                    if (compositeSubscription.isUnsubscribed() || atomicBoolean.get()) {
                        return;
                    }
                    singleArr[i].subscribe((rx.SingleSubscriber) subscription);
                }
            }
        });
    }
}
