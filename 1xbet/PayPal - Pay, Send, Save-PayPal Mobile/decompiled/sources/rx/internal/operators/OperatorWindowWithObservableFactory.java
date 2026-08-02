package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorWindowWithObservableFactory<T, U> implements rx.Observable.Operator<rx.Observable<T>, T> {
    static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    final rx.functions.Func0<? extends rx.Observable<? extends U>> Camera2StreamConfigurationMap;

    public OperatorWindowWithObservableFactory(rx.functions.Func0<? extends rx.Observable<? extends U>> func0) {
        this.Camera2StreamConfigurationMap = func0;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super rx.Observable<T>> subscriber) {
        rx.internal.operators.OperatorWindowWithObservableFactory.SourceSubscriber sourceSubscriber = new rx.internal.operators.OperatorWindowWithObservableFactory.SourceSubscriber(subscriber, this.Camera2StreamConfigurationMap);
        subscriber.add(sourceSubscriber);
        sourceSubscriber.getHighSpeedVideoSizes();
        return sourceSubscriber;
    }

    static final class SourceSubscriber<T, U> extends rx.Subscriber<T> {
        rx.Observer<T> Camera2StreamConfigurationMap;
        final rx.functions.Func0<? extends rx.Observable<? extends U>> getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super rx.Observable<T>> getHighSpeedVideoFpsRanges;
        final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
        boolean getHighSpeedVideoSizes;
        final rx.subscriptions.SerialSubscription getInputFormats;
        java.util.List<java.lang.Object> getOutputFormats;
        rx.Observable<T> getOutputMinFrameDuration;

        public SourceSubscriber(rx.Subscriber<? super rx.Observable<T>> subscriber, rx.functions.Func0<? extends rx.Observable<? extends U>> func0) {
            this.getHighSpeedVideoFpsRanges = new rx.observers.SerializedSubscriber(subscriber);
            rx.subscriptions.SerialSubscription serialSubscription = new rx.subscriptions.SerialSubscription();
            this.getInputFormats = serialSubscription;
            this.getHighResolutionOutputSizeshNQ4ISI = func0;
            add(serialSubscription);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                if (this.getHighSpeedVideoSizes) {
                    if (this.getOutputFormats == null) {
                        this.getOutputFormats = new java.util.ArrayList();
                    }
                    this.getOutputFormats.add(t);
                    return;
                }
                java.util.List<java.lang.Object> list = this.getOutputFormats;
                this.getOutputFormats = null;
                boolean z = true;
                this.getHighSpeedVideoSizes = true;
                while (true) {
                    try {
                        getHighSpeedVideoSizes(list);
                        if (z) {
                            rx.Observer<T> observer = this.Camera2StreamConfigurationMap;
                            if (observer != null) {
                                observer.onNext(t);
                            }
                            z = false;
                        }
                        synchronized (this.getHighSpeedVideoFpsRangesFor) {
                            java.util.List<java.lang.Object> list2 = this.getOutputFormats;
                            this.getOutputFormats = null;
                            if (list2 == null) {
                                this.getHighSpeedVideoSizes = false;
                                return;
                            } else {
                                if (this.getHighSpeedVideoFpsRanges.isUnsubscribed()) {
                                    synchronized (this.getHighSpeedVideoFpsRangesFor) {
                                        this.getHighSpeedVideoSizes = false;
                                    }
                                    return;
                                }
                                list = list2;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        synchronized (this.getHighSpeedVideoFpsRangesFor) {
                            this.getHighSpeedVideoSizes = false;
                            throw th;
                        }
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void getHighSpeedVideoSizes(java.util.List<java.lang.Object> list) {
            if (list != null) {
                for (java.lang.Object obj : list) {
                    if (obj != rx.internal.operators.OperatorWindowWithObservableFactory.getHighSpeedVideoFpsRangesFor) {
                        if (rx.internal.operators.NotificationLite.isError(obj)) {
                            getHighSpeedVideoSizes(rx.internal.operators.NotificationLite.getError(obj));
                            return;
                        } else if (rx.internal.operators.NotificationLite.isCompleted(obj)) {
                            getHighResolutionOutputSizeshNQ4ISI();
                            return;
                        } else {
                            rx.Observer<T> observer = this.Camera2StreamConfigurationMap;
                            if (observer != 0) {
                                observer.onNext(obj);
                            }
                        }
                    } else {
                        rx.Observer<T> observer2 = this.Camera2StreamConfigurationMap;
                        if (observer2 != null) {
                            observer2.onCompleted();
                        }
                        getHighSpeedVideoFpsRangesFor();
                        this.getHighSpeedVideoFpsRanges.onNext(this.getOutputMinFrameDuration);
                    }
                }
            }
        }

        private void getHighSpeedVideoFpsRangesFor() {
            rx.subjects.UnicastSubject create = rx.subjects.UnicastSubject.create();
            this.Camera2StreamConfigurationMap = create;
            this.getOutputMinFrameDuration = create;
            try {
                rx.Observable<? extends U> call = this.getHighResolutionOutputSizeshNQ4ISI.call();
                rx.internal.operators.OperatorWindowWithObservableFactory.BoundarySubscriber boundarySubscriber = new rx.internal.operators.OperatorWindowWithObservableFactory.BoundarySubscriber(this);
                this.getInputFormats.set(boundarySubscriber);
                call.unsafeSubscribe(boundarySubscriber);
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRanges.onError(th);
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                if (this.getHighSpeedVideoSizes) {
                    this.getOutputFormats = java.util.Collections.singletonList(rx.internal.operators.NotificationLite.error(th));
                    return;
                }
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizes = true;
                getHighSpeedVideoSizes(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                if (this.getHighSpeedVideoSizes) {
                    if (this.getOutputFormats == null) {
                        this.getOutputFormats = new java.util.ArrayList();
                    }
                    this.getOutputFormats.add(rx.internal.operators.NotificationLite.completed());
                    return;
                }
                java.util.List<java.lang.Object> list = this.getOutputFormats;
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizes = true;
                try {
                    getHighSpeedVideoSizes(list);
                    getHighResolutionOutputSizeshNQ4ISI();
                } catch (java.lang.Throwable th) {
                    getHighSpeedVideoSizes(th);
                }
            }
        }

        final void getHighSpeedVideoSizes() {
            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                if (this.getHighSpeedVideoSizes) {
                    if (this.getOutputFormats == null) {
                        this.getOutputFormats = new java.util.ArrayList();
                    }
                    this.getOutputFormats.add(rx.internal.operators.OperatorWindowWithObservableFactory.getHighSpeedVideoFpsRangesFor);
                    return;
                }
                java.util.List<java.lang.Object> list = this.getOutputFormats;
                this.getOutputFormats = null;
                boolean z = true;
                this.getHighSpeedVideoSizes = true;
                while (true) {
                    try {
                        getHighSpeedVideoSizes(list);
                        if (z) {
                            rx.Observer<T> observer = this.Camera2StreamConfigurationMap;
                            if (observer != null) {
                                observer.onCompleted();
                            }
                            getHighSpeedVideoFpsRangesFor();
                            this.getHighSpeedVideoFpsRanges.onNext(this.getOutputMinFrameDuration);
                            z = false;
                        }
                        synchronized (this.getHighSpeedVideoFpsRangesFor) {
                            java.util.List<java.lang.Object> list2 = this.getOutputFormats;
                            this.getOutputFormats = null;
                            if (list2 == null) {
                                this.getHighSpeedVideoSizes = false;
                                return;
                            } else {
                                if (this.getHighSpeedVideoFpsRanges.isUnsubscribed()) {
                                    synchronized (this.getHighSpeedVideoFpsRangesFor) {
                                        this.getHighSpeedVideoSizes = false;
                                    }
                                    return;
                                }
                                list = list2;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        synchronized (this.getHighSpeedVideoFpsRangesFor) {
                            this.getHighSpeedVideoSizes = false;
                            throw th;
                        }
                    }
                }
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            rx.Observer<T> observer = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = null;
            this.getOutputMinFrameDuration = null;
            if (observer != null) {
                observer.onCompleted();
            }
            this.getHighSpeedVideoFpsRanges.onCompleted();
            unsubscribe();
        }

        private void getHighSpeedVideoSizes(java.lang.Throwable th) {
            rx.Observer<T> observer = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = null;
            this.getOutputMinFrameDuration = null;
            if (observer != null) {
                observer.onError(th);
            }
            this.getHighSpeedVideoFpsRanges.onError(th);
            unsubscribe();
        }
    }

    static final class BoundarySubscriber<T, U> extends rx.Subscriber<U> {
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final rx.internal.operators.OperatorWindowWithObservableFactory.SourceSubscriber<T, U> getHighSpeedVideoFpsRanges;

        public BoundarySubscriber(rx.internal.operators.OperatorWindowWithObservableFactory.SourceSubscriber<T, U> sourceSubscriber) {
            this.getHighSpeedVideoFpsRanges = sourceSubscriber;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onNext(U u) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRanges.onCompleted();
        }
    }
}
