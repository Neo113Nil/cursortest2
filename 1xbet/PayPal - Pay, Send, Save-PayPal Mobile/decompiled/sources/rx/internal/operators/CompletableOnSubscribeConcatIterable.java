package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CompletableOnSubscribeConcatIterable implements rx.Completable.OnSubscribe {
    final java.lang.Iterable<? extends rx.Completable> getHighSpeedVideoFpsRangesFor;

    public CompletableOnSubscribeConcatIterable(java.lang.Iterable<? extends rx.Completable> iterable) {
        this.getHighSpeedVideoFpsRangesFor = iterable;
    }

    @Override // rx.functions.Action1
    public final void call(rx.CompletableSubscriber completableSubscriber) {
        try {
            java.util.Iterator<? extends rx.Completable> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            if (it == null) {
                completableSubscriber.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
                completableSubscriber.onError(new java.lang.NullPointerException("The iterator returned is null"));
            } else {
                rx.internal.operators.CompletableOnSubscribeConcatIterable.ConcatInnerSubscriber concatInnerSubscriber = new rx.internal.operators.CompletableOnSubscribeConcatIterable.ConcatInnerSubscriber(completableSubscriber, it);
                completableSubscriber.onSubscribe(concatInnerSubscriber.Camera2StreamConfigurationMap);
                concatInnerSubscriber.Camera2StreamConfigurationMap();
            }
        } catch (java.lang.Throwable th) {
            completableSubscriber.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
            completableSubscriber.onError(th);
        }
    }

    static final class ConcatInnerSubscriber extends java.util.concurrent.atomic.AtomicInteger implements rx.CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        final rx.internal.subscriptions.SequentialSubscription Camera2StreamConfigurationMap = new rx.internal.subscriptions.SequentialSubscription();
        final rx.CompletableSubscriber getHighSpeedVideoFpsRanges;
        final java.util.Iterator<? extends rx.Completable> getHighSpeedVideoFpsRangesFor;

        public ConcatInnerSubscriber(rx.CompletableSubscriber completableSubscriber, java.util.Iterator<? extends rx.Completable> it) {
            this.getHighSpeedVideoFpsRanges = completableSubscriber;
            this.getHighSpeedVideoFpsRangesFor = it;
        }

        @Override // rx.CompletableSubscriber
        public final void onSubscribe(rx.Subscription subscription) {
            this.Camera2StreamConfigurationMap.replace(subscription);
        }

        @Override // rx.CompletableSubscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // rx.CompletableSubscriber
        public final void onCompleted() {
            Camera2StreamConfigurationMap();
        }

        final void Camera2StreamConfigurationMap() {
            if (this.Camera2StreamConfigurationMap.isUnsubscribed() || getAndIncrement() != 0) {
                return;
            }
            java.util.Iterator<? extends rx.Completable> it = this.getHighSpeedVideoFpsRangesFor;
            while (!this.Camera2StreamConfigurationMap.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        this.getHighSpeedVideoFpsRanges.onCompleted();
                        return;
                    }
                    try {
                        rx.Completable next = it.next();
                        if (next == null) {
                            this.getHighSpeedVideoFpsRanges.onError(new java.lang.NullPointerException("The completable returned is null"));
                            return;
                        } else {
                            next.unsafeSubscribe(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        this.getHighSpeedVideoFpsRanges.onError(th);
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    this.getHighSpeedVideoFpsRanges.onError(th2);
                    return;
                }
            }
        }
    }
}
