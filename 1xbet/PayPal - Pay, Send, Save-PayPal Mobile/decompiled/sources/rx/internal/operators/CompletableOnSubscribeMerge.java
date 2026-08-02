package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CompletableOnSubscribeMerge implements rx.Completable.OnSubscribe {
    final int getHighResolutionOutputSizeshNQ4ISI;
    final rx.Observable<rx.Completable> getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletableOnSubscribeMerge(rx.Observable<? extends rx.Completable> observable, int i, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // rx.functions.Action1
    public final void call(rx.CompletableSubscriber completableSubscriber) {
        rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber completableMergeSubscriber = new rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber(completableSubscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        completableSubscriber.onSubscribe(completableMergeSubscriber);
        this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(completableMergeSubscriber);
    }

    static final class CompletableMergeSubscriber extends rx.Subscriber<rx.Completable> {
        final rx.CompletableSubscriber Camera2StreamConfigurationMap;
        final boolean getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final rx.subscriptions.CompositeSubscription getOutputMinFrameDuration = new rx.subscriptions.CompositeSubscription();
        final java.util.concurrent.atomic.AtomicInteger getInputFormats = new java.util.concurrent.atomic.AtomicInteger(1);
        final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicReference<java.util.Queue<java.lang.Throwable>> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();

        @Override // rx.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            rx.Completable completable = (rx.Completable) obj;
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getInputFormats.getAndIncrement();
            completable.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.1
                boolean getHighResolutionOutputSizeshNQ4ISI;
                rx.Subscription getHighSpeedVideoFpsRangesFor;

                @Override // rx.CompletableSubscriber
                public void onSubscribe(rx.Subscription subscription) {
                    this.getHighSpeedVideoFpsRangesFor = subscription;
                    rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.this.getOutputMinFrameDuration.add(subscription);
                }

                @Override // rx.CompletableSubscriber
                public void onError(java.lang.Throwable th) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        rx.plugins.RxJavaHooks.onError(th);
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.this.getOutputMinFrameDuration.remove(this.getHighSpeedVideoFpsRangesFor);
                    rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.this.getHighSpeedVideoSizes().offer(th);
                    rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.this.getHighSpeedVideoFpsRangesFor();
                    if (!rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.this.getHighSpeedVideoFpsRangesFor || rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.this.getHighSpeedVideoSizes) {
                        return;
                    }
                    rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.this.request(1L);
                }

                @Override // rx.CompletableSubscriber
                public void onCompleted() {
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.this.getOutputMinFrameDuration.remove(this.getHighSpeedVideoFpsRangesFor);
                    rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.this.getHighSpeedVideoFpsRangesFor();
                    if (rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.this.getHighSpeedVideoSizes) {
                        return;
                    }
                    rx.internal.operators.CompletableOnSubscribeMerge.CompletableMergeSubscriber.this.request(1L);
                }
            });
        }

        public CompletableMergeSubscriber(rx.CompletableSubscriber completableSubscriber, int i, boolean z) {
            this.Camera2StreamConfigurationMap = completableSubscriber;
            this.getHighSpeedVideoFpsRangesFor = z;
            if (i == Integer.MAX_VALUE) {
                request(Long.MAX_VALUE);
            } else {
                request(i);
            }
        }

        final java.util.Queue<java.lang.Throwable> getHighSpeedVideoSizes() {
            java.util.Queue<java.lang.Throwable> queue = this.getHighSpeedVideoFpsRanges.get();
            if (queue != null) {
                return queue;
            }
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
            return androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, null, concurrentLinkedQueue) ? concurrentLinkedQueue : this.getHighSpeedVideoFpsRanges.get();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                rx.plugins.RxJavaHooks.onError(th);
                return;
            }
            getHighSpeedVideoSizes().offer(th);
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoFpsRangesFor();
        }

        final void getHighSpeedVideoFpsRangesFor() {
            java.util.Queue<java.lang.Throwable> queue;
            if (this.getInputFormats.decrementAndGet() == 0) {
                java.util.Queue<java.lang.Throwable> queue2 = this.getHighSpeedVideoFpsRanges.get();
                if (queue2 == null || queue2.isEmpty()) {
                    this.Camera2StreamConfigurationMap.onCompleted();
                    return;
                }
                java.lang.Throwable collectErrors = rx.internal.operators.CompletableOnSubscribeMerge.collectErrors(queue2);
                if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                    this.Camera2StreamConfigurationMap.onError(collectErrors);
                    return;
                } else {
                    rx.plugins.RxJavaHooks.onError(collectErrors);
                    return;
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor || (queue = this.getHighSpeedVideoFpsRanges.get()) == null || queue.isEmpty()) {
                return;
            }
            java.lang.Throwable collectErrors2 = rx.internal.operators.CompletableOnSubscribeMerge.collectErrors(queue);
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                this.Camera2StreamConfigurationMap.onError(collectErrors2);
            } else {
                rx.plugins.RxJavaHooks.onError(collectErrors2);
            }
        }
    }

    public static java.lang.Throwable collectErrors(java.util.Queue<java.lang.Throwable> queue) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.lang.Throwable poll = queue.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (java.lang.Throwable) arrayList.get(0);
        }
        return new rx.exceptions.CompositeException(arrayList);
    }
}
