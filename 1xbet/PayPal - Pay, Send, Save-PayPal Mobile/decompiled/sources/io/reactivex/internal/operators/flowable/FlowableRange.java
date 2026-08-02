package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableRange extends io.reactivex.Flowable<java.lang.Integer> {
    final int Camera2StreamConfigurationMap;
    final int getHighSpeedVideoFpsRangesFor;

    public FlowableRange(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = i + i2;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Integer> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableRange.RangeConditionalSubscription((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap));
        } else {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableRange.RangeSubscription(subscriber, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap));
        }
    }

    /* loaded from: classes17.dex */
    static abstract class BaseRangeSubscription extends io.reactivex.internal.subscriptions.BasicQueueSubscription<java.lang.Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        final int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;

        abstract void getHighResolutionOutputSizeshNQ4ISI();

        abstract void getHighSpeedVideoFpsRanges(long j);

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 1;
        }

        BaseRangeSubscription(int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = i2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRanges;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) && io.reactivex.internal.util.BackpressureHelper.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    getHighResolutionOutputSizeshNQ4ISI();
                } else {
                    getHighSpeedVideoFpsRanges(j);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public /* synthetic */ java.lang.Object poll() throws java.lang.Exception {
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == this.getHighSpeedVideoFpsRanges) {
                return null;
            }
            this.getHighSpeedVideoFpsRangesFor = i + 1;
            return java.lang.Integer.valueOf(i);
        }
    }

    /* loaded from: classes17.dex */
    static final class RangeSubscription extends io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final org.reactivestreams.Subscriber<? super java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;

        RangeSubscription(org.reactivestreams.Subscriber<? super java.lang.Integer> subscriber, int i, int i2) {
            super(i, i2);
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        final void getHighResolutionOutputSizeshNQ4ISI() {
            int i = this.getHighSpeedVideoFpsRanges;
            org.reactivestreams.Subscriber<? super java.lang.Integer> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            for (int i2 = this.getHighSpeedVideoFpsRangesFor; i2 != i; i2++) {
                if (this.getHighSpeedVideoSizes) {
                    return;
                }
                subscriber.onNext(java.lang.Integer.valueOf(i2));
            }
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            subscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            r9.getHighSpeedVideoFpsRangesFor = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoFpsRanges(long j) {
            int i = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            org.reactivestreams.Subscriber<? super java.lang.Integer> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.getHighSpeedVideoSizes) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.getHighSpeedVideoSizes) {
                            return;
                        }
                        subscriber.onNext(java.lang.Integer.valueOf(i2));
                        j2++;
                        i2++;
                    }
                }
            } while (j != 0);
        }
    }

    /* loaded from: classes17.dex */
    static final class RangeConditionalSubscription extends io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;

        RangeConditionalSubscription(io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> conditionalSubscriber, int i, int i2) {
            super(i, i2);
            this.getHighResolutionOutputSizeshNQ4ISI = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        final void getHighResolutionOutputSizeshNQ4ISI() {
            int i = this.getHighSpeedVideoFpsRanges;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> conditionalSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            for (int i2 = this.getHighSpeedVideoFpsRangesFor; i2 != i; i2++) {
                if (this.getHighSpeedVideoSizes) {
                    return;
                }
                conditionalSubscriber.tryOnNext(java.lang.Integer.valueOf(i2));
            }
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            r9.getHighSpeedVideoFpsRangesFor = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoFpsRanges(long j) {
            int i = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> conditionalSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.getHighSpeedVideoSizes) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.getHighSpeedVideoSizes) {
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(java.lang.Integer.valueOf(i2))) {
                            j2++;
                        }
                        i2++;
                    }
                }
            } while (j != 0);
        }
    }
}
