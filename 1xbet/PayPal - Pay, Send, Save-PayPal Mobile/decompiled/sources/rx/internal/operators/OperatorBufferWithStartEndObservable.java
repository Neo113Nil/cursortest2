package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorBufferWithStartEndObservable<T, TOpening, TClosing> implements rx.Observable.Operator<java.util.List<T>, T> {
    final rx.Observable<? extends TOpening> getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Func1<? super TOpening, ? extends rx.Observable<? extends TClosing>> getHighSpeedVideoFpsRanges;

    public OperatorBufferWithStartEndObservable(rx.Observable<? extends TOpening> observable, rx.functions.Func1<? super TOpening, ? extends rx.Observable<? extends TClosing>> func1) {
        this.getHighResolutionOutputSizeshNQ4ISI = observable;
        this.getHighSpeedVideoFpsRanges = func1;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super java.util.List<T>> subscriber) {
        final rx.internal.operators.OperatorBufferWithStartEndObservable.BufferingSubscriber bufferingSubscriber = new rx.internal.operators.OperatorBufferWithStartEndObservable.BufferingSubscriber(new rx.observers.SerializedSubscriber(subscriber));
        rx.Subscriber<TOpening> subscriber2 = new rx.Subscriber<TOpening>() { // from class: rx.internal.operators.OperatorBufferWithStartEndObservable.1
            @Override // rx.Observer
            public void onNext(TOpening topening) {
                final rx.internal.operators.OperatorBufferWithStartEndObservable.BufferingSubscriber bufferingSubscriber2 = bufferingSubscriber;
                final java.util.ArrayList arrayList = new java.util.ArrayList();
                synchronized (bufferingSubscriber2) {
                    if (bufferingSubscriber2.getHighSpeedVideoSizes) {
                        return;
                    }
                    bufferingSubscriber2.getHighResolutionOutputSizeshNQ4ISI.add(arrayList);
                    try {
                        rx.Observable<? extends TClosing> call = rx.internal.operators.OperatorBufferWithStartEndObservable.this.getHighSpeedVideoFpsRanges.call(topening);
                        rx.Subscriber<TClosing> subscriber3 = new rx.Subscriber<TClosing>() { // from class: rx.internal.operators.OperatorBufferWithStartEndObservable.BufferingSubscriber.1
                            @Override // rx.Observer
                            public void onNext(TClosing tclosing) {
                                rx.internal.operators.OperatorBufferWithStartEndObservable.BufferingSubscriber.this.getHighSpeedVideoFpsRangesFor.remove(this);
                                rx.internal.operators.OperatorBufferWithStartEndObservable.BufferingSubscriber.this.getHighSpeedVideoSizes(arrayList);
                            }

                            @Override // rx.Observer
                            public void onError(java.lang.Throwable th) {
                                rx.internal.operators.OperatorBufferWithStartEndObservable.BufferingSubscriber.this.onError(th);
                            }

                            @Override // rx.Observer
                            public void onCompleted() {
                                rx.internal.operators.OperatorBufferWithStartEndObservable.BufferingSubscriber.this.getHighSpeedVideoFpsRangesFor.remove(this);
                                rx.internal.operators.OperatorBufferWithStartEndObservable.BufferingSubscriber.this.getHighSpeedVideoSizes(arrayList);
                            }
                        };
                        bufferingSubscriber2.getHighSpeedVideoFpsRangesFor.add(subscriber3);
                        call.unsafeSubscribe(subscriber3);
                    } catch (java.lang.Throwable th) {
                        rx.exceptions.Exceptions.throwOrReport(th, bufferingSubscriber2);
                    }
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                bufferingSubscriber.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                bufferingSubscriber.onCompleted();
            }
        };
        subscriber.add(subscriber2);
        subscriber.add(bufferingSubscriber);
        this.getHighResolutionOutputSizeshNQ4ISI.unsafeSubscribe(subscriber2);
        return bufferingSubscriber;
    }

    final class BufferingSubscriber extends rx.Subscriber<T> {
        final java.util.List<java.util.List<T>> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedList();
        final rx.Subscriber<? super java.util.List<T>> getHighSpeedVideoFpsRanges;
        final rx.subscriptions.CompositeSubscription getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        public BufferingSubscriber(rx.Subscriber<? super java.util.List<T>> subscriber) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
            this.getHighSpeedVideoFpsRangesFor = compositeSubscription;
            add(compositeSubscription);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            synchronized (this) {
                java.util.Iterator<java.util.List<T>> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            synchronized (this) {
                if (this.getHighSpeedVideoSizes) {
                    return;
                }
                this.getHighSpeedVideoSizes = true;
                this.getHighResolutionOutputSizeshNQ4ISI.clear();
                this.getHighSpeedVideoFpsRanges.onError(th);
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            try {
                synchronized (this) {
                    if (this.getHighSpeedVideoSizes) {
                        return;
                    }
                    this.getHighSpeedVideoSizes = true;
                    java.util.LinkedList linkedList = new java.util.LinkedList(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighResolutionOutputSizeshNQ4ISI.clear();
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        this.getHighSpeedVideoFpsRanges.onNext((java.util.List) it.next());
                    }
                    this.getHighSpeedVideoFpsRanges.onCompleted();
                    unsubscribe();
                }
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, this.getHighSpeedVideoFpsRanges);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        
            r0.remove();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
        
            r0 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoSizes(java.util.List<T> list) {
            boolean z;
            synchronized (this) {
                if (this.getHighSpeedVideoSizes) {
                    return;
                }
                java.util.Iterator<java.util.List<T>> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (it.next() == list) {
                        break;
                    }
                }
                if (z) {
                    this.getHighSpeedVideoFpsRanges.onNext(list);
                }
            }
        }
    }
}
