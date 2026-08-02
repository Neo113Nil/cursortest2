package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFromIterable<T> extends io.reactivex.Flowable<T> {
    final java.lang.Iterable<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    public FlowableFromIterable(java.lang.Iterable<? extends T> iterable) {
        this.getHighResolutionOutputSizeshNQ4ISI = iterable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        try {
            subscribe(subscriber, this.getHighResolutionOutputSizeshNQ4ISI.iterator());
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    public static <T> void subscribe(org.reactivestreams.Subscriber<? super T> subscriber, java.util.Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
            } else if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
                subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableFromIterable.IteratorConditionalSubscription((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, it));
            } else {
                subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableFromIterable.IteratorSubscription(subscriber, it));
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static abstract class BaseRangeSubscription<T> extends io.reactivex.internal.subscriptions.BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        java.util.Iterator<? extends T> Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;

        abstract void getHighSpeedVideoFpsRanges(long j);

        abstract void getHighSpeedVideoFpsRangesFor();

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 1;
        }

        BaseRangeSubscription(java.util.Iterator<? extends T> it) {
            this.Camera2StreamConfigurationMap = it;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            java.util.Iterator<? extends T> it = this.Camera2StreamConfigurationMap;
            if (it == null) {
                return null;
            }
            if (!this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRangesFor = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.next(), "Iterator.next() returned a null value");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            java.util.Iterator<? extends T> it = this.Camera2StreamConfigurationMap;
            return it == null || !it.hasNext();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.Camera2StreamConfigurationMap = null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) && io.reactivex.internal.util.BackpressureHelper.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    getHighSpeedVideoFpsRangesFor();
                } else {
                    getHighSpeedVideoFpsRanges(j);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges = true;
        }
    }

    /* loaded from: classes17.dex */
    static final class IteratorSubscription<T> extends io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;

        IteratorSubscription(org.reactivestreams.Subscriber<? super T> subscriber, java.util.Iterator<? extends T> it) {
            super(it);
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        final void getHighSpeedVideoFpsRangesFor() {
            java.util.Iterator<? extends T> it = this.Camera2StreamConfigurationMap;
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            while (!this.getHighSpeedVideoFpsRanges) {
                try {
                    T next = it.next();
                    if (this.getHighSpeedVideoFpsRanges) {
                        return;
                    }
                    if (next == null) {
                        subscriber.onError(new java.lang.NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    subscriber.onNext(next);
                    if (this.getHighSpeedVideoFpsRanges) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.getHighSpeedVideoFpsRanges) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        subscriber.onError(th);
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    subscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoFpsRanges(long j) {
            java.util.Iterator<? extends T> it = this.Camera2StreamConfigurationMap;
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.getHighSpeedVideoFpsRanges) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.getHighSpeedVideoFpsRanges) {
                                return;
                            }
                            if (next == null) {
                                subscriber.onError(new java.lang.NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            subscriber.onNext(next);
                            if (this.getHighSpeedVideoFpsRanges) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.getHighSpeedVideoFpsRanges) {
                                        return;
                                    }
                                    subscriber.onComplete();
                                    return;
                                }
                                j2++;
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                subscriber.onError(th);
                                return;
                            }
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            subscriber.onError(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* loaded from: classes17.dex */
    static final class IteratorConditionalSubscription<T> extends io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;

        IteratorConditionalSubscription(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, java.util.Iterator<? extends T> it) {
            super(it);
            this.getHighResolutionOutputSizeshNQ4ISI = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        final void getHighSpeedVideoFpsRangesFor() {
            java.util.Iterator<? extends T> it = this.Camera2StreamConfigurationMap;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            while (!this.getHighSpeedVideoFpsRanges) {
                try {
                    T next = it.next();
                    if (this.getHighSpeedVideoFpsRanges) {
                        return;
                    }
                    if (next == null) {
                        conditionalSubscriber.onError(new java.lang.NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.tryOnNext(next);
                    if (this.getHighSpeedVideoFpsRanges) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.getHighSpeedVideoFpsRanges) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        conditionalSubscriber.onError(th);
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoFpsRanges(long j) {
            java.util.Iterator<? extends T> it = this.Camera2StreamConfigurationMap;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j) {
                        if (this.getHighSpeedVideoFpsRanges) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.getHighSpeedVideoFpsRanges) {
                                return;
                            }
                            if (next == null) {
                                conditionalSubscriber.onError(new java.lang.NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean tryOnNext = conditionalSubscriber.tryOnNext(next);
                            if (this.getHighSpeedVideoFpsRanges) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.getHighSpeedVideoFpsRanges) {
                                        return;
                                    }
                                    conditionalSubscriber.onComplete();
                                    return;
                                } else if (tryOnNext) {
                                    j2++;
                                }
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                conditionalSubscriber.onError(th);
                                return;
                            }
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            conditionalSubscriber.onError(th2);
                            return;
                        }
                    } else {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    }
                }
            } while (j != 0);
        }
    }
}
