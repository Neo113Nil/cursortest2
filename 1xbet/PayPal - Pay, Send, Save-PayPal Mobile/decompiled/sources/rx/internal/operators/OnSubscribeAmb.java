package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeAmb<T> implements rx.Observable.OnSubscribe<T> {
    final java.lang.Iterable<? extends rx.Observable<? extends T>> getHighSpeedVideoFpsRanges;

    public static <T> rx.Observable.OnSubscribe<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        return amb(arrayList);
    }

    public static <T> rx.Observable.OnSubscribe<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        return amb(arrayList);
    }

    public static <T> rx.Observable.OnSubscribe<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        return amb(arrayList);
    }

    public static <T> rx.Observable.OnSubscribe<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        return amb(arrayList);
    }

    public static <T> rx.Observable.OnSubscribe<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        return amb(arrayList);
    }

    public static <T> rx.Observable.OnSubscribe<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        return amb(arrayList);
    }

    public static <T> rx.Observable.OnSubscribe<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        arrayList.add(observable8);
        return amb(arrayList);
    }

    public static <T> rx.Observable.OnSubscribe<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8, rx.Observable<? extends T> observable9) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        arrayList.add(observable8);
        arrayList.add(observable9);
        return amb(arrayList);
    }

    public static <T> rx.Observable.OnSubscribe<T> amb(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable) {
        return new rx.internal.operators.OnSubscribeAmb(iterable);
    }

    static final class AmbSubscriber<T> extends rx.Subscriber<T> {
        private final rx.internal.operators.OnSubscribeAmb.Selection<T> getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private final rx.Subscriber<? super T> getHighSpeedVideoSizes;

        AmbSubscriber(rx.Subscriber<? super T> subscriber, rx.internal.operators.OnSubscribeAmb.Selection<T> selection) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRanges = selection;
            request(0L);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (Camera2StreamConfigurationMap()) {
                this.getHighSpeedVideoSizes.onNext(t);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (Camera2StreamConfigurationMap()) {
                this.getHighSpeedVideoSizes.onCompleted();
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (Camera2StreamConfigurationMap()) {
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        private boolean Camera2StreamConfigurationMap() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return true;
            }
            if (this.getHighSpeedVideoFpsRanges.get() == this) {
                this.getHighSpeedVideoFpsRangesFor = true;
                return true;
            }
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(null, this)) {
                this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(this);
                this.getHighSpeedVideoFpsRangesFor = true;
                return true;
            }
            rx.internal.operators.OnSubscribeAmb.Selection<T> selection = this.getHighSpeedVideoFpsRanges;
            rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T> ambSubscriber = selection.get();
            if (ambSubscriber == null) {
                return false;
            }
            selection.getHighResolutionOutputSizeshNQ4ISI(ambSubscriber);
            return false;
        }
    }

    static final class Selection<T> extends java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T>> {
        final java.util.Collection<rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T>> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.ConcurrentLinkedQueue();

        Selection() {
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T> ambSubscriber) {
            for (rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T> ambSubscriber2 : this.getHighSpeedVideoFpsRangesFor) {
                if (ambSubscriber2 != ambSubscriber) {
                    ambSubscriber2.unsubscribe();
                }
            }
            this.getHighSpeedVideoFpsRangesFor.clear();
        }
    }

    private OnSubscribeAmb(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable) {
        this.getHighSpeedVideoFpsRanges = iterable;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        final rx.internal.operators.OnSubscribeAmb.Selection selection = new rx.internal.operators.OnSubscribeAmb.Selection();
        subscriber.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.operators.OnSubscribeAmb.1
            @Override // rx.functions.Action0
            public void call() {
                rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T> ambSubscriber = selection.get();
                if (ambSubscriber != null) {
                    ambSubscriber.unsubscribe();
                }
                rx.internal.operators.OnSubscribeAmb.getHighSpeedVideoFpsRangesFor(selection.getHighSpeedVideoFpsRangesFor);
            }
        }));
        for (rx.Observable<? extends T> observable : this.getHighSpeedVideoFpsRanges) {
            if (subscriber.isUnsubscribed()) {
                break;
            }
            rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T> ambSubscriber = new rx.internal.operators.OnSubscribeAmb.AmbSubscriber<>(subscriber, selection);
            selection.getHighSpeedVideoFpsRangesFor.add(ambSubscriber);
            rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T> ambSubscriber2 = selection.get();
            if (ambSubscriber2 != null) {
                selection.getHighResolutionOutputSizeshNQ4ISI(ambSubscriber2);
                return;
            }
            observable.unsafeSubscribe(ambSubscriber);
        }
        if (subscriber.isUnsubscribed()) {
            getHighSpeedVideoFpsRangesFor(selection.getHighSpeedVideoFpsRangesFor);
        }
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OnSubscribeAmb.2
            @Override // rx.Producer
            public void request(long j) {
                rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T> ambSubscriber3 = selection.get();
                if (ambSubscriber3 == null) {
                    for (rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T> ambSubscriber4 : selection.getHighSpeedVideoFpsRangesFor) {
                        if (!ambSubscriber4.isUnsubscribed()) {
                            if (selection.get() == ambSubscriber4) {
                                ambSubscriber4.request(j);
                                return;
                            }
                            ambSubscriber4.request(j);
                        }
                    }
                    return;
                }
                ambSubscriber3.request(j);
            }
        });
    }

    static <T> void getHighSpeedVideoFpsRangesFor(java.util.Collection<rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T>> collection) {
        if (collection.isEmpty()) {
            return;
        }
        java.util.Iterator<rx.internal.operators.OnSubscribeAmb.AmbSubscriber<T>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().unsubscribe();
        }
        collection.clear();
    }
}
