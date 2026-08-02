package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CompletableOnSubscribeConcat implements rx.Completable.OnSubscribe {
    final rx.Observable<rx.Completable> Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletableOnSubscribeConcat(rx.Observable<? extends rx.Completable> observable, int i) {
        this.Camera2StreamConfigurationMap = observable;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // rx.functions.Action1
    public final void call(rx.CompletableSubscriber completableSubscriber) {
        rx.internal.operators.CompletableOnSubscribeConcat.CompletableConcatSubscriber completableConcatSubscriber = new rx.internal.operators.CompletableOnSubscribeConcat.CompletableConcatSubscriber(completableSubscriber, this.getHighResolutionOutputSizeshNQ4ISI);
        completableSubscriber.onSubscribe(completableConcatSubscriber);
        this.Camera2StreamConfigurationMap.unsafeSubscribe(completableConcatSubscriber);
    }

    static final class CompletableConcatSubscriber extends rx.Subscriber<rx.Completable> {
        volatile boolean Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;
        final rx.internal.operators.CompletableOnSubscribeConcat.CompletableConcatSubscriber.ConcatInnerSubscriber getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final rx.CompletableSubscriber getHighSpeedVideoSizes;
        final rx.internal.subscriptions.SequentialSubscription getInputFormats;
        final rx.internal.util.unsafe.SpscArrayQueue<rx.Completable> getOutputFormats;

        @Override // rx.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            if (!this.getOutputFormats.offer((rx.Completable) obj)) {
                onError(new rx.exceptions.MissingBackpressureException());
            } else {
                getHighSpeedVideoFpsRangesFor();
            }
        }

        public CompletableConcatSubscriber(rx.CompletableSubscriber completableSubscriber, int i) {
            this.getHighSpeedVideoSizes = completableSubscriber;
            this.getOutputFormats = new rx.internal.util.unsafe.SpscArrayQueue<>(i);
            rx.internal.subscriptions.SequentialSubscription sequentialSubscription = new rx.internal.subscriptions.SequentialSubscription();
            this.getInputFormats = sequentialSubscription;
            this.getHighSpeedVideoFpsRanges = new rx.internal.operators.CompletableOnSubscribeConcat.CompletableConcatSubscriber.ConcatInnerSubscriber();
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
            add(sequentialSubscription);
            request(i);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.onError(th);
            } else {
                rx.plugins.RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            getHighSpeedVideoFpsRangesFor();
        }

        final void getHighSpeedVideoFpsRangesFor() {
            rx.internal.operators.CompletableOnSubscribeConcat.CompletableConcatSubscriber.ConcatInnerSubscriber concatInnerSubscriber = this.getHighSpeedVideoFpsRanges;
            if (concatInnerSubscriber.getAndIncrement() == 0) {
                while (!isUnsubscribed()) {
                    if (!this.getHighSpeedVideoFpsRangesFor) {
                        boolean z = this.Camera2StreamConfigurationMap;
                        rx.Completable poll = this.getOutputFormats.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            this.getHighSpeedVideoSizes.onCompleted();
                            return;
                        } else if (!z2) {
                            this.getHighSpeedVideoFpsRangesFor = true;
                            poll.subscribe(concatInnerSubscriber);
                            request(1L);
                        }
                    }
                    if (concatInnerSubscriber.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        final class ConcatInnerSubscriber extends java.util.concurrent.atomic.AtomicInteger implements rx.CompletableSubscriber {
            private static final long serialVersionUID = 7233503139645205620L;

            ConcatInnerSubscriber() {
            }

            @Override // rx.CompletableSubscriber
            public final void onSubscribe(rx.Subscription subscription) {
                rx.internal.operators.CompletableOnSubscribeConcat.CompletableConcatSubscriber.this.getInputFormats.set(subscription);
            }

            @Override // rx.CompletableSubscriber
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.CompletableOnSubscribeConcat.CompletableConcatSubscriber completableConcatSubscriber = rx.internal.operators.CompletableOnSubscribeConcat.CompletableConcatSubscriber.this;
                completableConcatSubscriber.unsubscribe();
                completableConcatSubscriber.onError(th);
            }

            @Override // rx.CompletableSubscriber
            public final void onCompleted() {
                rx.internal.operators.CompletableOnSubscribeConcat.CompletableConcatSubscriber completableConcatSubscriber = rx.internal.operators.CompletableOnSubscribeConcat.CompletableConcatSubscriber.this;
                completableConcatSubscriber.getHighSpeedVideoFpsRangesFor = false;
                completableConcatSubscriber.getHighSpeedVideoFpsRangesFor();
            }
        }
    }
}
