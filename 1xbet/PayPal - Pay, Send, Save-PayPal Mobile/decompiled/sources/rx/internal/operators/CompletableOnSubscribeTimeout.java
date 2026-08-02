package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CompletableOnSubscribeTimeout implements rx.Completable.OnSubscribe {
    final rx.Completable Camera2StreamConfigurationMap;
    final rx.Completable getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRanges;
    final rx.Scheduler getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;

    public CompletableOnSubscribeTimeout(rx.Completable completable, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler, rx.Completable completable2) {
        this.getHighResolutionOutputSizeshNQ4ISI = completable;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoSizes = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.Camera2StreamConfigurationMap = completable2;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.CompletableSubscriber completableSubscriber) {
        final rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        rx.Scheduler.Worker createWorker = this.getHighSpeedVideoFpsRangesFor.createWorker();
        compositeSubscription.add(createWorker);
        createWorker.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.CompletableOnSubscribeTimeout.1
            @Override // rx.functions.Action0
            public void call() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    compositeSubscription.clear();
                    if (rx.internal.operators.CompletableOnSubscribeTimeout.this.Camera2StreamConfigurationMap == null) {
                        completableSubscriber.onError(new java.util.concurrent.TimeoutException());
                    } else {
                        rx.internal.operators.CompletableOnSubscribeTimeout.this.Camera2StreamConfigurationMap.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeTimeout.1.1
                            @Override // rx.CompletableSubscriber
                            public void onSubscribe(rx.Subscription subscription) {
                                compositeSubscription.add(subscription);
                            }

                            @Override // rx.CompletableSubscriber
                            public void onError(java.lang.Throwable th) {
                                compositeSubscription.unsubscribe();
                                completableSubscriber.onError(th);
                            }

                            @Override // rx.CompletableSubscriber
                            public void onCompleted() {
                                compositeSubscription.unsubscribe();
                                completableSubscriber.onCompleted();
                            }
                        });
                    }
                }
            }
        }, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        this.getHighResolutionOutputSizeshNQ4ISI.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeTimeout.2
            @Override // rx.CompletableSubscriber
            public void onSubscribe(rx.Subscription subscription) {
                compositeSubscription.add(subscription);
            }

            @Override // rx.CompletableSubscriber
            public void onError(java.lang.Throwable th) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    compositeSubscription.unsubscribe();
                    completableSubscriber.onError(th);
                } else {
                    rx.plugins.RxJavaHooks.onError(th);
                }
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    compositeSubscription.unsubscribe();
                    completableSubscriber.onCompleted();
                }
            }
        });
    }
}
