package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorWindowWithStartEndObservable<T, U, V> implements rx.Observable.Operator<rx.Observable<T>, T> {
    final rx.functions.Func1<? super U, ? extends rx.Observable<? extends V>> getHighResolutionOutputSizeshNQ4ISI;
    final rx.Observable<? extends U> getHighSpeedVideoFpsRangesFor;

    public OperatorWindowWithStartEndObservable(rx.Observable<? extends U> observable, rx.functions.Func1<? super U, ? extends rx.Observable<? extends V>> func1) {
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.getHighResolutionOutputSizeshNQ4ISI = func1;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super rx.Observable<T>> subscriber) {
        rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
        subscriber.add(compositeSubscription);
        final rx.internal.operators.OperatorWindowWithStartEndObservable.SourceSubscriber sourceSubscriber = new rx.internal.operators.OperatorWindowWithStartEndObservable.SourceSubscriber(subscriber, compositeSubscription);
        rx.Subscriber<U> subscriber2 = new rx.Subscriber<U>() { // from class: rx.internal.operators.OperatorWindowWithStartEndObservable.1
            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }

            @Override // rx.Observer
            public void onNext(U u) {
                final rx.internal.operators.OperatorWindowWithStartEndObservable.SourceSubscriber sourceSubscriber2 = sourceSubscriber;
                final rx.internal.operators.OperatorWindowWithStartEndObservable.SerializedSubject<T> highSpeedVideoSizes = rx.internal.operators.OperatorWindowWithStartEndObservable.SourceSubscriber.getHighSpeedVideoSizes();
                synchronized (sourceSubscriber2.getHighSpeedVideoFpsRanges) {
                    if (sourceSubscriber2.getHighSpeedVideoFpsRangesFor) {
                        return;
                    }
                    sourceSubscriber2.Camera2StreamConfigurationMap.add(highSpeedVideoSizes);
                    sourceSubscriber2.getHighResolutionOutputSizeshNQ4ISI.onNext(highSpeedVideoSizes.getHighSpeedVideoFpsRanges);
                    try {
                        rx.Observable<? extends V> call = rx.internal.operators.OperatorWindowWithStartEndObservable.this.getHighResolutionOutputSizeshNQ4ISI.call(u);
                        rx.Subscriber<V> subscriber3 = new rx.Subscriber<V>() { // from class: rx.internal.operators.OperatorWindowWithStartEndObservable.SourceSubscriber.1
                            boolean getHighSpeedVideoFpsRanges = true;

                            @Override // rx.Observer
                            public void onNext(V v) {
                                onCompleted();
                            }

                            @Override // rx.Observer
                            public void onError(java.lang.Throwable th) {
                                rx.internal.operators.OperatorWindowWithStartEndObservable.SourceSubscriber.this.onError(th);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
                            
                                r1.remove();
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
                            
                                r0 = true;
                             */
                            @Override // rx.Observer
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public void onCompleted() {
                                if (this.getHighSpeedVideoFpsRanges) {
                                    boolean z = false;
                                    this.getHighSpeedVideoFpsRanges = false;
                                    rx.internal.operators.OperatorWindowWithStartEndObservable.SourceSubscriber sourceSubscriber3 = rx.internal.operators.OperatorWindowWithStartEndObservable.SourceSubscriber.this;
                                    rx.internal.operators.OperatorWindowWithStartEndObservable.SerializedSubject<T> serializedSubject = highSpeedVideoSizes;
                                    synchronized (sourceSubscriber3.getHighSpeedVideoFpsRanges) {
                                        if (!sourceSubscriber3.getHighSpeedVideoFpsRangesFor) {
                                            java.util.Iterator<rx.internal.operators.OperatorWindowWithStartEndObservable.SerializedSubject<T>> it = sourceSubscriber3.Camera2StreamConfigurationMap.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                } else if (it.next() == serializedSubject) {
                                                    break;
                                                }
                                            }
                                            if (z) {
                                                serializedSubject.getHighSpeedVideoFpsRangesFor.onCompleted();
                                            }
                                        }
                                    }
                                    rx.internal.operators.OperatorWindowWithStartEndObservable.SourceSubscriber.this.getHighSpeedVideoSizes.remove(this);
                                }
                            }
                        };
                        sourceSubscriber2.getHighSpeedVideoSizes.add(subscriber3);
                        call.unsafeSubscribe(subscriber3);
                    } catch (java.lang.Throwable th) {
                        sourceSubscriber2.onError(th);
                    }
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                sourceSubscriber.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                sourceSubscriber.onCompleted();
            }
        };
        compositeSubscription.add(sourceSubscriber);
        compositeSubscription.add(subscriber2);
        this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(subscriber2);
        return sourceSubscriber;
    }

    static final class SerializedSubject<T> {
        final rx.Observable<T> getHighSpeedVideoFpsRanges;
        final rx.Observer<T> getHighSpeedVideoFpsRangesFor;

        public SerializedSubject(rx.Observer<T> observer, rx.Observable<T> observable) {
            this.getHighSpeedVideoFpsRangesFor = new rx.observers.SerializedObserver(observer);
            this.getHighSpeedVideoFpsRanges = observable;
        }
    }

    final class SourceSubscriber extends rx.Subscriber<T> {
        final rx.Subscriber<? super rx.Observable<T>> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRangesFor;
        final rx.subscriptions.CompositeSubscription getHighSpeedVideoSizes;
        final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
        final java.util.List<rx.internal.operators.OperatorWindowWithStartEndObservable.SerializedSubject<T>> Camera2StreamConfigurationMap = new java.util.LinkedList();

        public SourceSubscriber(rx.Subscriber<? super rx.Observable<T>> subscriber, rx.subscriptions.CompositeSubscription compositeSubscription) {
            this.getHighResolutionOutputSizeshNQ4ISI = new rx.observers.SerializedSubscriber(subscriber);
            this.getHighSpeedVideoSizes = compositeSubscription;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                java.util.Iterator it = new java.util.ArrayList(this.Camera2StreamConfigurationMap).iterator();
                while (it.hasNext()) {
                    ((rx.internal.operators.OperatorWindowWithStartEndObservable.SerializedSubject) it.next()).getHighSpeedVideoFpsRangesFor.onNext(t);
                }
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            try {
                synchronized (this.getHighSpeedVideoFpsRanges) {
                    if (!this.getHighSpeedVideoFpsRangesFor) {
                        this.getHighSpeedVideoFpsRangesFor = true;
                        java.util.ArrayList arrayList = new java.util.ArrayList(this.Camera2StreamConfigurationMap);
                        this.Camera2StreamConfigurationMap.clear();
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((rx.internal.operators.OperatorWindowWithStartEndObservable.SerializedSubject) it.next()).getHighSpeedVideoFpsRangesFor.onError(th);
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                    }
                }
            } finally {
                this.getHighSpeedVideoSizes.unsubscribe();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            try {
                synchronized (this.getHighSpeedVideoFpsRanges) {
                    if (!this.getHighSpeedVideoFpsRangesFor) {
                        this.getHighSpeedVideoFpsRangesFor = true;
                        java.util.ArrayList arrayList = new java.util.ArrayList(this.Camera2StreamConfigurationMap);
                        this.Camera2StreamConfigurationMap.clear();
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((rx.internal.operators.OperatorWindowWithStartEndObservable.SerializedSubject) it.next()).getHighSpeedVideoFpsRangesFor.onCompleted();
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
                    }
                }
            } finally {
                this.getHighSpeedVideoSizes.unsubscribe();
            }
        }

        static rx.internal.operators.OperatorWindowWithStartEndObservable.SerializedSubject<T> getHighSpeedVideoSizes() {
            rx.subjects.UnicastSubject create = rx.subjects.UnicastSubject.create();
            return new rx.internal.operators.OperatorWindowWithStartEndObservable.SerializedSubject<>(create, create);
        }
    }
}
