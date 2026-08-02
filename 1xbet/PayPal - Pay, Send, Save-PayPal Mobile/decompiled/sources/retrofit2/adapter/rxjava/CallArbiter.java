package retrofit2.adapter.rxjava;

/* loaded from: classes18.dex */
final class CallArbiter<T> extends java.util.concurrent.atomic.AtomicInteger implements rx.Subscription, rx.Producer {
    private volatile boolean getHighResolutionOutputSizeshNQ4ISI;
    private final rx.Subscriber<? super retrofit2.Response<T>> getHighSpeedVideoFpsRanges;
    private volatile retrofit2.Response<T> getHighSpeedVideoFpsRangesFor;
    private final retrofit2.Call<T> getHighSpeedVideoSizes;

    CallArbiter(retrofit2.Call<T> call, rx.Subscriber<? super retrofit2.Response<T>> subscriber) {
        super(0);
        this.getHighSpeedVideoSizes = call;
        this.getHighSpeedVideoFpsRanges = subscriber;
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizes.cancel();
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // rx.Producer
    public final void request(long j) {
        if (j == 0) {
            return;
        }
        while (true) {
            int i = get();
            if (i != 0) {
                if (i == 1) {
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("Unknown state: ".concat(java.lang.String.valueOf(i)));
                    }
                    return;
                } else if (compareAndSet(2, 3)) {
                    Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor);
                    return;
                }
            } else if (compareAndSet(0, 1)) {
                return;
            }
        }
    }

    final void getHighSpeedVideoFpsRanges(retrofit2.Response<T> response) {
        while (true) {
            int i = get();
            if (i == 0) {
                this.getHighSpeedVideoFpsRangesFor = response;
                if (compareAndSet(0, 2)) {
                    return;
                }
            } else {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        throw new java.lang.AssertionError();
                    }
                    throw new java.lang.IllegalStateException("Unknown state: ".concat(java.lang.String.valueOf(i)));
                }
                if (compareAndSet(1, 3)) {
                    Camera2StreamConfigurationMap(response);
                    return;
                }
            }
        }
    }

    private void Camera2StreamConfigurationMap(retrofit2.Response<T> response) {
        java.lang.Throwable compositeException;
        try {
            if (!isUnsubscribed()) {
                this.getHighSpeedVideoFpsRanges.onNext(response);
            }
            try {
                if (isUnsubscribed()) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges.onCompleted();
            } catch (rx.exceptions.OnCompletedFailedException e) {
                e = e;
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
            } catch (rx.exceptions.OnErrorFailedException e2) {
                e = e2;
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
            } catch (rx.exceptions.OnErrorNotImplementedException e3) {
                e = e3;
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(th);
            }
        } catch (rx.exceptions.OnCompletedFailedException e4) {
            e = e4;
            rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
        } catch (rx.exceptions.OnErrorFailedException e5) {
            e = e5;
            rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
        } catch (rx.exceptions.OnErrorNotImplementedException e6) {
            e = e6;
            rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
        } catch (java.lang.Throwable th2) {
            rx.exceptions.Exceptions.throwIfFatal(th2);
            try {
                this.getHighSpeedVideoFpsRanges.onError(th2);
            } catch (rx.exceptions.OnCompletedFailedException e7) {
                e = e7;
                compositeException = e;
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
            } catch (rx.exceptions.OnErrorFailedException e8) {
                e = e8;
                compositeException = e;
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
            } catch (rx.exceptions.OnErrorNotImplementedException e9) {
                e = e9;
                compositeException = e;
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
            } catch (java.lang.Throwable th3) {
                rx.exceptions.Exceptions.throwIfFatal(th3);
                compositeException = new rx.exceptions.CompositeException(th2, th3);
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
            }
        }
    }

    final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
        java.lang.Throwable compositeException;
        set(3);
        if (isUnsubscribed()) {
            return;
        }
        try {
            this.getHighSpeedVideoFpsRanges.onError(th);
        } catch (rx.exceptions.OnCompletedFailedException e) {
            e = e;
            compositeException = e;
            rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
        } catch (rx.exceptions.OnErrorFailedException e2) {
            e = e2;
            compositeException = e;
            rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
        } catch (rx.exceptions.OnErrorNotImplementedException e3) {
            e = e3;
            compositeException = e;
            rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
        } catch (java.lang.Throwable th2) {
            rx.exceptions.Exceptions.throwIfFatal(th2);
            compositeException = new rx.exceptions.CompositeException(th, th2);
            rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
        }
    }
}
