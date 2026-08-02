package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeUsing<T, Resource> implements rx.Observable.OnSubscribe<T> {
    private final rx.functions.Func0<Resource> Camera2StreamConfigurationMap;
    private final rx.functions.Func1<? super Resource, ? extends rx.Observable<? extends T>> getHighResolutionOutputSizeshNQ4ISI;
    private final rx.functions.Action1<? super Resource> getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;

    public OnSubscribeUsing(rx.functions.Func0<Resource> func0, rx.functions.Func1<? super Resource, ? extends rx.Observable<? extends T>> func1, rx.functions.Action1<? super Resource> action1, boolean z) {
        this.Camera2StreamConfigurationMap = func0;
        this.getHighResolutionOutputSizeshNQ4ISI = func1;
        this.getHighSpeedVideoFpsRanges = action1;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.Observable<? extends T> doAfterTerminate;
        try {
            Resource call = this.Camera2StreamConfigurationMap.call();
            rx.internal.operators.OnSubscribeUsing.DisposeAction disposeAction = new rx.internal.operators.OnSubscribeUsing.DisposeAction(this.getHighSpeedVideoFpsRanges, call);
            subscriber.add(disposeAction);
            try {
                rx.Observable<? extends T> call2 = this.getHighResolutionOutputSizeshNQ4ISI.call(call);
                if (this.getHighSpeedVideoFpsRangesFor) {
                    doAfterTerminate = call2.doOnTerminate(disposeAction);
                } else {
                    doAfterTerminate = call2.doAfterTerminate(disposeAction);
                }
                try {
                    doAfterTerminate.unsafeSubscribe(rx.observers.Subscribers.wrap(subscriber));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(disposeAction);
                    rx.exceptions.Exceptions.throwIfFatal(th);
                    rx.exceptions.Exceptions.throwIfFatal(highResolutionOutputSizeshNQ4ISI);
                    if (highResolutionOutputSizeshNQ4ISI != null) {
                        subscriber.onError(new rx.exceptions.CompositeException(th, highResolutionOutputSizeshNQ4ISI));
                    } else {
                        subscriber.onError(th);
                    }
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(disposeAction);
                rx.exceptions.Exceptions.throwIfFatal(th2);
                rx.exceptions.Exceptions.throwIfFatal(highResolutionOutputSizeshNQ4ISI2);
                if (highResolutionOutputSizeshNQ4ISI2 != null) {
                    subscriber.onError(new rx.exceptions.CompositeException(th2, highResolutionOutputSizeshNQ4ISI2));
                } else {
                    subscriber.onError(th2);
                }
            }
        } catch (java.lang.Throwable th3) {
            rx.exceptions.Exceptions.throwOrReport(th3, subscriber);
        }
    }

    private static java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI(rx.functions.Action0 action0) {
        try {
            action0.call();
            return null;
        } catch (java.lang.Throwable th) {
            return th;
        }
    }

    static final class DisposeAction<Resource> extends java.util.concurrent.atomic.AtomicBoolean implements rx.functions.Action0, rx.Subscription {
        private static final long serialVersionUID = 4262875056400218316L;
        private Resource Camera2StreamConfigurationMap;
        private rx.functions.Action1<? super Resource> getHighSpeedVideoFpsRanges;

        DisposeAction(rx.functions.Action1<? super Resource> action1, Resource resource) {
            this.getHighSpeedVideoFpsRanges = action1;
            this.Camera2StreamConfigurationMap = resource;
            lazySet(false);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Resource, rx.functions.Action1<? super Resource>] */
        @Override // rx.functions.Action0
        public final void call() {
            if (compareAndSet(false, true)) {
                ?? r0 = (Resource) null;
                try {
                    this.getHighSpeedVideoFpsRanges.call(this.Camera2StreamConfigurationMap);
                } finally {
                    this.Camera2StreamConfigurationMap = null;
                    this.getHighSpeedVideoFpsRanges = null;
                }
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return get();
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            call();
        }
    }
}
