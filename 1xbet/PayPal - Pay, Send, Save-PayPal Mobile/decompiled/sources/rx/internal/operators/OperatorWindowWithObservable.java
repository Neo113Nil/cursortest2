package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorWindowWithObservable<T, U> implements rx.Observable.Operator<rx.Observable<T>, T> {
    static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
    final rx.Observable<U> Camera2StreamConfigurationMap;

    public OperatorWindowWithObservable(rx.Observable<U> observable) {
        this.Camera2StreamConfigurationMap = observable;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super rx.Observable<T>> subscriber) {
        rx.internal.operators.OperatorWindowWithObservable.SourceSubscriber sourceSubscriber = new rx.internal.operators.OperatorWindowWithObservable.SourceSubscriber(subscriber);
        rx.internal.operators.OperatorWindowWithObservable.BoundarySubscriber boundarySubscriber = new rx.internal.operators.OperatorWindowWithObservable.BoundarySubscriber(sourceSubscriber);
        subscriber.add(sourceSubscriber);
        subscriber.add(boundarySubscriber);
        sourceSubscriber.getHighSpeedVideoFpsRanges();
        this.Camera2StreamConfigurationMap.unsafeSubscribe(boundarySubscriber);
        return sourceSubscriber;
    }

    static final class SourceSubscriber<T> extends rx.Subscriber<T> {
        rx.Observer<T> Camera2StreamConfigurationMap;
        final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        boolean getHighSpeedVideoFpsRanges;
        rx.Observable<T> getHighSpeedVideoFpsRangesFor;
        final rx.Subscriber<? super rx.Observable<T>> getHighSpeedVideoSizes;
        java.util.List<java.lang.Object> getInputSizeshNQ4ISI;

        public SourceSubscriber(rx.Subscriber<? super rx.Observable<T>> subscriber) {
            this.getHighSpeedVideoSizes = new rx.observers.SerializedSubscriber(subscriber);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoFpsRanges) {
                    if (this.getInputSizeshNQ4ISI == null) {
                        this.getInputSizeshNQ4ISI = new java.util.ArrayList();
                    }
                    this.getInputSizeshNQ4ISI.add(t);
                    return;
                }
                java.util.List<java.lang.Object> list = this.getInputSizeshNQ4ISI;
                this.getInputSizeshNQ4ISI = null;
                boolean z = true;
                this.getHighSpeedVideoFpsRanges = true;
                while (true) {
                    try {
                        Camera2StreamConfigurationMap(list);
                        if (z) {
                            rx.Observer<T> observer = this.Camera2StreamConfigurationMap;
                            if (observer != null) {
                                observer.onNext(t);
                            }
                            z = false;
                        }
                        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                            java.util.List<java.lang.Object> list2 = this.getInputSizeshNQ4ISI;
                            this.getInputSizeshNQ4ISI = null;
                            if (list2 == null) {
                                this.getHighSpeedVideoFpsRanges = false;
                                return;
                            } else {
                                if (this.getHighSpeedVideoSizes.isUnsubscribed()) {
                                    synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                                        this.getHighSpeedVideoFpsRanges = false;
                                    }
                                    return;
                                }
                                list = list2;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                            this.getHighSpeedVideoFpsRanges = false;
                            throw th;
                        }
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void Camera2StreamConfigurationMap(java.util.List<java.lang.Object> list) {
            if (list != null) {
                for (java.lang.Object obj : list) {
                    if (obj != rx.internal.operators.OperatorWindowWithObservable.getHighSpeedVideoSizes) {
                        if (rx.internal.operators.NotificationLite.isError(obj)) {
                            getHighSpeedVideoSizes(rx.internal.operators.NotificationLite.getError(obj));
                            return;
                        } else if (rx.internal.operators.NotificationLite.isCompleted(obj)) {
                            getHighSpeedVideoSizes();
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
                        rx.subjects.UnicastSubject create = rx.subjects.UnicastSubject.create();
                        this.Camera2StreamConfigurationMap = create;
                        this.getHighSpeedVideoFpsRangesFor = create;
                        this.getHighSpeedVideoSizes.onNext(create);
                    }
                }
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            rx.Observer<T> observer = this.Camera2StreamConfigurationMap;
            if (observer != null) {
                observer.onCompleted();
            }
            rx.subjects.UnicastSubject create = rx.subjects.UnicastSubject.create();
            this.Camera2StreamConfigurationMap = create;
            this.getHighSpeedVideoFpsRangesFor = create;
            this.getHighSpeedVideoSizes.onNext(create);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoFpsRanges) {
                    this.getInputSizeshNQ4ISI = java.util.Collections.singletonList(rx.internal.operators.NotificationLite.error(th));
                    return;
                }
                this.getInputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRanges = true;
                getHighSpeedVideoSizes(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoFpsRanges) {
                    if (this.getInputSizeshNQ4ISI == null) {
                        this.getInputSizeshNQ4ISI = new java.util.ArrayList();
                    }
                    this.getInputSizeshNQ4ISI.add(rx.internal.operators.NotificationLite.completed());
                    return;
                }
                java.util.List<java.lang.Object> list = this.getInputSizeshNQ4ISI;
                this.getInputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRanges = true;
                try {
                    Camera2StreamConfigurationMap(list);
                    getHighSpeedVideoSizes();
                } catch (java.lang.Throwable th) {
                    getHighSpeedVideoSizes(th);
                }
            }
        }

        final void getHighSpeedVideoFpsRanges() {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoFpsRanges) {
                    if (this.getInputSizeshNQ4ISI == null) {
                        this.getInputSizeshNQ4ISI = new java.util.ArrayList();
                    }
                    this.getInputSizeshNQ4ISI.add(rx.internal.operators.OperatorWindowWithObservable.getHighSpeedVideoSizes);
                    return;
                }
                java.util.List<java.lang.Object> list = this.getInputSizeshNQ4ISI;
                this.getInputSizeshNQ4ISI = null;
                boolean z = true;
                this.getHighSpeedVideoFpsRanges = true;
                while (true) {
                    try {
                        Camera2StreamConfigurationMap(list);
                        if (z) {
                            getHighResolutionOutputSizeshNQ4ISI();
                            z = false;
                        }
                        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                            java.util.List<java.lang.Object> list2 = this.getInputSizeshNQ4ISI;
                            this.getInputSizeshNQ4ISI = null;
                            if (list2 == null) {
                                this.getHighSpeedVideoFpsRanges = false;
                                return;
                            } else {
                                if (this.getHighSpeedVideoSizes.isUnsubscribed()) {
                                    synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                                        this.getHighSpeedVideoFpsRanges = false;
                                    }
                                    return;
                                }
                                list = list2;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                            this.getHighSpeedVideoFpsRanges = false;
                            throw th;
                        }
                    }
                }
            }
        }

        private void getHighSpeedVideoSizes() {
            rx.Observer<T> observer = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            if (observer != null) {
                observer.onCompleted();
            }
            this.getHighSpeedVideoSizes.onCompleted();
            unsubscribe();
        }

        private void getHighSpeedVideoSizes(java.lang.Throwable th) {
            rx.Observer<T> observer = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            if (observer != null) {
                observer.onError(th);
            }
            this.getHighSpeedVideoSizes.onError(th);
            unsubscribe();
        }
    }

    static final class BoundarySubscriber<T, U> extends rx.Subscriber<U> {
        final rx.internal.operators.OperatorWindowWithObservable.SourceSubscriber<T> getHighSpeedVideoSizes;

        public BoundarySubscriber(rx.internal.operators.OperatorWindowWithObservable.SourceSubscriber<T> sourceSubscriber) {
            this.getHighSpeedVideoSizes = sourceSubscriber;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onNext(U u) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoSizes.onCompleted();
        }
    }
}
