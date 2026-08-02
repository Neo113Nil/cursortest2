package io.reactivex.subscribers;

/* loaded from: classes3.dex */
public final class SafeSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    org.reactivestreams.Subscription Camera2StreamConfigurationMap;
    final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoSizes;

    public SafeSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
            this.Camera2StreamConfigurationMap = subscription;
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes = true;
                try {
                    subscription.cancel();
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        if (this.Camera2StreamConfigurationMap == null) {
            this.getHighSpeedVideoSizes = true;
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE);
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(nullPointerException);
                    return;
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th));
                    return;
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th2));
                return;
            }
        }
        if (t == null) {
            java.lang.NullPointerException nullPointerException2 = new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.Camera2StreamConfigurationMap.cancel();
                onError(nullPointerException2);
                return;
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                onError(new io.reactivex.exceptions.CompositeException(nullPointerException2, th3));
                return;
            }
        }
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            try {
                this.Camera2StreamConfigurationMap.cancel();
                onError(th4);
            } catch (java.lang.Throwable th5) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th5);
                onError(new io.reactivex.exceptions.CompositeException(th4, th5));
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        if (this.getHighSpeedVideoSizes) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getHighSpeedVideoSizes = true;
        if (this.Camera2StreamConfigurationMap == null) {
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE);
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException));
                    return;
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException, th2));
                    return;
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException, th3));
                return;
            }
        }
        if (th == null) {
            th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th4));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        if (this.Camera2StreamConfigurationMap != null) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                return;
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE);
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(nullPointerException);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th2));
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th3));
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        try {
            this.Camera2StreamConfigurationMap.request(j);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            try {
                this.Camera2StreamConfigurationMap.cancel();
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        try {
            this.Camera2StreamConfigurationMap.cancel();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }
}
