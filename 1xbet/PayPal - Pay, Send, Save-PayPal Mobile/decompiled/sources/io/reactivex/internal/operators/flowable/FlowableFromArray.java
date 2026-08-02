package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFromArray<T> extends io.reactivex.Flowable<T> {
    final T[] Camera2StreamConfigurationMap;

    public FlowableFromArray(T[] tArr) {
        this.Camera2StreamConfigurationMap = tArr;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableFromArray.ArrayConditionalSubscription((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.Camera2StreamConfigurationMap));
        } else {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableFromArray.ArraySubscription(subscriber, this.Camera2StreamConfigurationMap));
        }
    }

    /* loaded from: classes17.dex */
    static abstract class BaseArraySubscription<T> extends io.reactivex.internal.subscriptions.BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        int Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        final T[] getHighSpeedVideoFpsRangesFor;

        abstract void getHighResolutionOutputSizeshNQ4ISI(long j);

        abstract void getHighSpeedVideoFpsRanges();

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 1;
        }

        BaseArraySubscription(T[] tArr) {
            this.getHighSpeedVideoFpsRangesFor = tArr;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            int i = this.Camera2StreamConfigurationMap;
            T[] tArr = this.getHighSpeedVideoFpsRangesFor;
            if (i == tArr.length) {
                return null;
            }
            this.Camera2StreamConfigurationMap = i + 1;
            return (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(tArr[i], "array element is null");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.Camera2StreamConfigurationMap == this.getHighSpeedVideoFpsRangesFor.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.length;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) && io.reactivex.internal.util.BackpressureHelper.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    getHighSpeedVideoFpsRanges();
                } else {
                    getHighResolutionOutputSizeshNQ4ISI(j);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges = true;
        }
    }

    /* loaded from: classes17.dex */
    static final class ArraySubscription<T> extends io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;

        ArraySubscription(org.reactivestreams.Subscriber<? super T> subscriber, T[] tArr) {
            super(tArr);
            this.getHighSpeedVideoSizes = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        final void getHighSpeedVideoFpsRanges() {
            T[] tArr = this.getHighSpeedVideoFpsRangesFor;
            int length = tArr.length;
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoSizes;
            for (int i = this.Camera2StreamConfigurationMap; i != length; i++) {
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    subscriber.onError(new java.lang.NullPointerException("array element is null"));
                    return;
                }
                subscriber.onNext(t);
            }
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            subscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
        
            r10.Camera2StreamConfigurationMap = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            T[] tArr = this.getHighSpeedVideoFpsRangesFor;
            int length = tArr.length;
            int i = this.Camera2StreamConfigurationMap;
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoSizes;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.getHighSpeedVideoFpsRanges) {
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
                        if (this.getHighSpeedVideoFpsRanges) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            subscriber.onError(new java.lang.NullPointerException("array element is null"));
                            return;
                        } else {
                            subscriber.onNext(t);
                            j2++;
                            i++;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* loaded from: classes17.dex */
    static final class ArrayConditionalSubscription<T> extends io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;

        ArrayConditionalSubscription(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.getHighResolutionOutputSizeshNQ4ISI = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        final void getHighSpeedVideoFpsRanges() {
            T[] tArr = this.getHighSpeedVideoFpsRangesFor;
            int length = tArr.length;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            for (int i = this.Camera2StreamConfigurationMap; i != length; i++) {
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    conditionalSubscriber.onError(new java.lang.NullPointerException("array element is null"));
                    return;
                }
                conditionalSubscriber.tryOnNext(t);
            }
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        
            r10.Camera2StreamConfigurationMap = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            T[] tArr = this.getHighSpeedVideoFpsRangesFor;
            int length = tArr.length;
            int i = this.Camera2StreamConfigurationMap;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.getHighSpeedVideoFpsRanges) {
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
                        if (this.getHighSpeedVideoFpsRanges) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            conditionalSubscriber.onError(new java.lang.NullPointerException("array element is null"));
                            return;
                        } else {
                            if (conditionalSubscriber.tryOnNext(t)) {
                                j2++;
                            }
                            i++;
                        }
                    }
                }
            } while (j != 0);
        }
    }
}
