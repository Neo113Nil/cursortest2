package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeFlatMapSingle<T, R> implements rx.Observable.OnSubscribe<R> {
    final rx.functions.Func1<? super T, ? extends rx.Single<? extends R>> Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final rx.Observable<T> getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoSizes;

    public OnSubscribeFlatMapSingle(rx.Observable<T> observable, rx.functions.Func1<? super T, ? extends rx.Single<? extends R>> func1, boolean z, int i) {
        if (func1 == null) {
            throw new java.lang.NullPointerException("mapper is null");
        }
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("maxConcurrency > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        this.getHighSpeedVideoFpsRanges = observable;
        this.Camera2StreamConfigurationMap = func1;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super R> subscriber) {
        rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber flatMapSingleSubscriber = new rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        subscriber.add(flatMapSingleSubscriber.getOutputSizeshNQ4ISI);
        subscriber.add(flatMapSingleSubscriber.getOutputMinFrameDuration);
        subscriber.setProducer(flatMapSingleSubscriber.getOutputMinFrameDuration);
        this.getHighSpeedVideoFpsRanges.unsafeSubscribe(flatMapSingleSubscriber);
    }

    static final class FlatMapSingleSubscriber<T, R> extends rx.Subscriber<T> {
        final boolean Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final rx.Subscriber<? super R> getHighSpeedVideoSizes;
        final int getHighSpeedVideoSizesFor;
        final rx.functions.Func1<? super T, ? extends rx.Single<? extends R>> getInputFormats;
        final java.util.Queue<java.lang.Object> getOutputFormats;
        final java.util.concurrent.atomic.AtomicInteger getOutputStallDuration = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        final rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber<T, R>.Requested getOutputMinFrameDuration = new rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.Requested();
        final rx.subscriptions.CompositeSubscription getOutputSizeshNQ4ISI = new rx.subscriptions.CompositeSubscription();
        final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();

        FlatMapSingleSubscriber(rx.Subscriber<? super R> subscriber, rx.functions.Func1<? super T, ? extends rx.Single<? extends R>> func1, boolean z, int i) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getInputFormats = func1;
            this.Camera2StreamConfigurationMap = z;
            this.getHighSpeedVideoSizesFor = i;
            if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
                this.getOutputFormats = new rx.internal.util.unsafe.MpscLinkedQueue();
            } else {
                this.getOutputFormats = new rx.internal.util.atomic.MpscLinkedAtomicQueue();
            }
            request(i != Integer.MAX_VALUE ? i : Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            try {
                rx.Single<? extends R> call = this.getInputFormats.call(t);
                if (call == null) {
                    throw new java.lang.NullPointerException("The mapper returned a null Single");
                }
                rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.InnerSubscriber innerSubscriber = new rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.InnerSubscriber();
                this.getOutputSizeshNQ4ISI.add(innerSubscriber);
                this.getHighResolutionOutputSizeshNQ4ISI.incrementAndGet();
                call.subscribe(innerSubscriber);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                rx.internal.util.ExceptionsUtils.addThrowable(this.getInputSizeshNQ4ISI, th);
            } else {
                this.getOutputSizeshNQ4ISI.unsubscribe();
                if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, null, th)) {
                    rx.plugins.RxJavaHooks.onError(th);
                    return;
                }
            }
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoFpsRangesFor();
        }

        final void getHighSpeedVideoFpsRangesFor() {
            if (this.getOutputStallDuration.getAndIncrement() == 0) {
                rx.Subscriber<? super R> subscriber = this.getHighSpeedVideoSizes;
                java.util.Queue<java.lang.Object> queue = this.getOutputFormats;
                boolean z = this.Camera2StreamConfigurationMap;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = this.getHighResolutionOutputSizeshNQ4ISI;
                int i = 1;
                do {
                    long j = this.getOutputMinFrameDuration.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.getHighSpeedVideoFpsRangesFor) {
                            queue.clear();
                            return;
                        }
                        boolean z2 = this.getHighSpeedVideoFpsRanges;
                        if (!z && z2 && this.getInputSizeshNQ4ISI.get() != null) {
                            queue.clear();
                            subscriber.onError(rx.internal.util.ExceptionsUtils.terminate(this.getInputSizeshNQ4ISI));
                            return;
                        }
                        java.lang.Object poll = queue.poll();
                        boolean z3 = poll == null;
                        if (!z2 || atomicInteger.get() != 0 || !z3) {
                            if (z3) {
                                break;
                            }
                            subscriber.onNext((java.lang.Object) rx.internal.operators.NotificationLite.getValue(poll));
                            j2++;
                        } else if (this.getInputSizeshNQ4ISI.get() != null) {
                            subscriber.onError(rx.internal.util.ExceptionsUtils.terminate(this.getInputSizeshNQ4ISI));
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (this.getHighSpeedVideoFpsRangesFor) {
                            queue.clear();
                            return;
                        }
                        if (this.getHighSpeedVideoFpsRanges) {
                            if (z) {
                                if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                    if (this.getInputSizeshNQ4ISI.get() != null) {
                                        subscriber.onError(rx.internal.util.ExceptionsUtils.terminate(this.getInputSizeshNQ4ISI));
                                        return;
                                    } else {
                                        subscriber.onCompleted();
                                        return;
                                    }
                                }
                            } else if (this.getInputSizeshNQ4ISI.get() != null) {
                                queue.clear();
                                subscriber.onError(rx.internal.util.ExceptionsUtils.terminate(this.getInputSizeshNQ4ISI));
                                return;
                            } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                subscriber.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        rx.internal.operators.BackpressureUtils.produced(this.getOutputMinFrameDuration, j2);
                        if (!this.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizesFor != Integer.MAX_VALUE) {
                            request(j2);
                        }
                    }
                    i = this.getOutputStallDuration.addAndGet(-i);
                } while (i != 0);
            }
        }

        final class Requested extends java.util.concurrent.atomic.AtomicLong implements rx.Producer, rx.Subscription {
            private static final long serialVersionUID = -887187595446742742L;

            Requested() {
            }

            @Override // rx.Producer
            public final void request(long j) {
                if (j > 0) {
                    rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j);
                    rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.this.getHighSpeedVideoFpsRangesFor();
                }
            }

            @Override // rx.Subscription
            public final void unsubscribe() {
                rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.this.getHighSpeedVideoFpsRangesFor = true;
                rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.this.unsubscribe();
                if (rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.this.getOutputStallDuration.getAndIncrement() == 0) {
                    rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.this.getOutputFormats.clear();
                }
            }

            @Override // rx.Subscription
            public final boolean isUnsubscribed() {
                return rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.this.getHighSpeedVideoFpsRangesFor;
            }
        }

        final class InnerSubscriber extends rx.SingleSubscriber<R> {
            InnerSubscriber() {
            }

            @Override // rx.SingleSubscriber
            public final void onSuccess(R r) {
                rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber flatMapSingleSubscriber = rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.this;
                flatMapSingleSubscriber.getOutputFormats.offer(rx.internal.operators.NotificationLite.next(r));
                flatMapSingleSubscriber.getOutputSizeshNQ4ISI.remove(this);
                flatMapSingleSubscriber.getHighResolutionOutputSizeshNQ4ISI.decrementAndGet();
                flatMapSingleSubscriber.getHighSpeedVideoFpsRangesFor();
            }

            @Override // rx.SingleSubscriber
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber flatMapSingleSubscriber = rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.this;
                if (flatMapSingleSubscriber.Camera2StreamConfigurationMap) {
                    rx.internal.util.ExceptionsUtils.addThrowable(flatMapSingleSubscriber.getInputSizeshNQ4ISI, th);
                    flatMapSingleSubscriber.getOutputSizeshNQ4ISI.remove(this);
                    if (!flatMapSingleSubscriber.getHighSpeedVideoFpsRanges && flatMapSingleSubscriber.getHighSpeedVideoSizesFor != Integer.MAX_VALUE) {
                        flatMapSingleSubscriber.request(1L);
                    }
                } else {
                    flatMapSingleSubscriber.getOutputSizeshNQ4ISI.unsubscribe();
                    flatMapSingleSubscriber.unsubscribe();
                    if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(flatMapSingleSubscriber.getInputSizeshNQ4ISI, null, th)) {
                        rx.plugins.RxJavaHooks.onError(th);
                        return;
                    }
                    flatMapSingleSubscriber.getHighSpeedVideoFpsRanges = true;
                }
                flatMapSingleSubscriber.getHighResolutionOutputSizeshNQ4ISI.decrementAndGet();
                flatMapSingleSubscriber.getHighSpeedVideoFpsRangesFor();
            }
        }
    }
}
