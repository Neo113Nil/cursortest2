package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableRangeLong extends io.reactivex.Flowable<java.lang.Long> {
    final long getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRangesFor;

    public FlowableRangeLong(long j, long j2) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRangesFor = j + j2;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableRangeLong.RangeConditionalSubscription((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
        } else {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableRangeLong.RangeSubscription(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
        }
    }

    /* loaded from: classes17.dex */
    static abstract class BaseRangeSubscription extends io.reactivex.internal.subscriptions.BasicQueueSubscription<java.lang.Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        final long Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRangesFor;

        abstract void getHighResolutionOutputSizeshNQ4ISI();

        abstract void getHighSpeedVideoSizes(long j);

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 1;
        }

        BaseRangeSubscription(long j, long j2) {
            this.getHighSpeedVideoFpsRangesFor = j;
            this.Camera2StreamConfigurationMap = j2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighSpeedVideoFpsRangesFor == this.Camera2StreamConfigurationMap;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) && io.reactivex.internal.util.BackpressureHelper.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    getHighResolutionOutputSizeshNQ4ISI();
                } else {
                    getHighSpeedVideoSizes(j);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public /* synthetic */ java.lang.Object poll() throws java.lang.Exception {
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j == this.Camera2StreamConfigurationMap) {
                return null;
            }
            this.getHighSpeedVideoFpsRangesFor = 1 + j;
            return java.lang.Long.valueOf(j);
        }
    }

    /* loaded from: classes17.dex */
    static final class RangeSubscription extends io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final org.reactivestreams.Subscriber<? super java.lang.Long> getHighSpeedVideoSizes;

        RangeSubscription(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber, long j, long j2) {
            super(j, j2);
            this.getHighSpeedVideoSizes = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        final void getHighResolutionOutputSizeshNQ4ISI() {
            long j = this.Camera2StreamConfigurationMap;
            org.reactivestreams.Subscriber<? super java.lang.Long> subscriber = this.getHighSpeedVideoSizes;
            for (long j2 = this.getHighSpeedVideoFpsRangesFor; j2 != j; j2++) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                subscriber.onNext(java.lang.Long.valueOf(j2));
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            subscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            r11.getHighSpeedVideoFpsRangesFor = r2;
            r12 = addAndGet(-r7);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoSizes(long j) {
            long j2 = this.Camera2StreamConfigurationMap;
            long j3 = this.getHighSpeedVideoFpsRangesFor;
            org.reactivestreams.Subscriber<? super java.lang.Long> subscriber = this.getHighSpeedVideoSizes;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (j3 == j2) {
                            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j4 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.getHighResolutionOutputSizeshNQ4ISI) {
                            return;
                        }
                        subscriber.onNext(java.lang.Long.valueOf(j3));
                        j4++;
                        j3++;
                    }
                }
            } while (j != 0);
        }
    }

    /* loaded from: classes17.dex */
    static final class RangeConditionalSubscription extends io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> getHighSpeedVideoFpsRanges;

        RangeConditionalSubscription(io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> conditionalSubscriber, long j, long j2) {
            super(j, j2);
            this.getHighSpeedVideoFpsRanges = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        final void getHighResolutionOutputSizeshNQ4ISI() {
            long j = this.Camera2StreamConfigurationMap;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> conditionalSubscriber = this.getHighSpeedVideoFpsRanges;
            for (long j2 = this.getHighSpeedVideoFpsRangesFor; j2 != j; j2++) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                conditionalSubscriber.tryOnNext(java.lang.Long.valueOf(j2));
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            r12.getHighSpeedVideoFpsRangesFor = r2;
            r13 = addAndGet(-r7);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoSizes(long j) {
            long j2 = this.Camera2StreamConfigurationMap;
            long j3 = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> conditionalSubscriber = this.getHighSpeedVideoFpsRanges;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (j3 == j2) {
                            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j4 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.getHighResolutionOutputSizeshNQ4ISI) {
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(java.lang.Long.valueOf(j3))) {
                            j4++;
                        }
                        j3++;
                    }
                }
            } while (j != 0);
        }
    }
}
