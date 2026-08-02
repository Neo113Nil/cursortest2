package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleOnSubscribeUsing<T, Resource> implements rx.Single.OnSubscribe<T> {
    final boolean Camera2StreamConfigurationMap;
    final rx.functions.Action1<? super Resource> getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Func1<? super Resource, ? extends rx.Single<? extends T>> getHighSpeedVideoFpsRangesFor;
    final rx.functions.Func0<Resource> getHighSpeedVideoSizes;

    public SingleOnSubscribeUsing(rx.functions.Func0<Resource> func0, rx.functions.Func1<? super Resource, ? extends rx.Single<? extends T>> func1, rx.functions.Action1<? super Resource> action1, boolean z) {
        this.getHighSpeedVideoSizes = func0;
        this.getHighSpeedVideoFpsRangesFor = func1;
        this.getHighResolutionOutputSizeshNQ4ISI = action1;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.SingleSubscriber<? super T> singleSubscriber) {
        try {
            final Resource call = this.getHighSpeedVideoSizes.call();
            try {
                rx.Single<? extends T> call2 = this.getHighSpeedVideoFpsRangesFor.call(call);
                if (call2 == null) {
                    getHighSpeedVideoFpsRangesFor(singleSubscriber, call, new java.lang.NullPointerException("The single"));
                    return;
                }
                rx.SingleSubscriber<T> singleSubscriber2 = new rx.SingleSubscriber<T>() { // from class: rx.internal.operators.SingleOnSubscribeUsing.1
                    @Override // rx.SingleSubscriber
                    public void onSuccess(T t) {
                        if (rx.internal.operators.SingleOnSubscribeUsing.this.Camera2StreamConfigurationMap) {
                            try {
                                rx.internal.operators.SingleOnSubscribeUsing.this.getHighResolutionOutputSizeshNQ4ISI.call((java.lang.Object) call);
                            } catch (java.lang.Throwable th) {
                                rx.exceptions.Exceptions.throwIfFatal(th);
                                singleSubscriber.onError(th);
                                return;
                            }
                        }
                        singleSubscriber.onSuccess(t);
                        if (rx.internal.operators.SingleOnSubscribeUsing.this.Camera2StreamConfigurationMap) {
                            return;
                        }
                        try {
                            rx.internal.operators.SingleOnSubscribeUsing.this.getHighResolutionOutputSizeshNQ4ISI.call((java.lang.Object) call);
                        } catch (java.lang.Throwable th2) {
                            rx.exceptions.Exceptions.throwIfFatal(th2);
                            rx.plugins.RxJavaHooks.onError(th2);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // rx.SingleSubscriber
                    public void onError(java.lang.Throwable th) {
                        rx.internal.operators.SingleOnSubscribeUsing.this.getHighSpeedVideoFpsRangesFor(singleSubscriber, call, th);
                    }
                };
                singleSubscriber.add(singleSubscriber2);
                call2.subscribe((rx.SingleSubscriber<? super java.lang.Object>) singleSubscriber2);
            } catch (java.lang.Throwable th) {
                getHighSpeedVideoFpsRangesFor(singleSubscriber, call, th);
            }
        } catch (java.lang.Throwable th2) {
            rx.exceptions.Exceptions.throwIfFatal(th2);
            singleSubscriber.onError(th2);
        }
    }

    final void getHighSpeedVideoFpsRangesFor(rx.SingleSubscriber<? super T> singleSubscriber, Resource resource, java.lang.Throwable th) {
        rx.exceptions.Exceptions.throwIfFatal(th);
        if (this.Camera2StreamConfigurationMap) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.call(resource);
            } catch (java.lang.Throwable th2) {
                rx.exceptions.Exceptions.throwIfFatal(th2);
                th = new rx.exceptions.CompositeException(java.util.Arrays.asList(th, th2));
            }
        }
        singleSubscriber.onError(th);
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.call(resource);
        } catch (java.lang.Throwable th3) {
            rx.exceptions.Exceptions.throwIfFatal(th3);
            rx.plugins.RxJavaHooks.onError(th3);
        }
    }
}
