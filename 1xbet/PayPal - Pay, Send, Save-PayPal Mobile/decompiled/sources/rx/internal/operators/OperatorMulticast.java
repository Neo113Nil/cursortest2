package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorMulticast<T, R> extends rx.observables.ConnectableObservable<R> {
    final rx.Observable<? extends T> Camera2StreamConfigurationMap;
    rx.Subscription getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicReference<rx.subjects.Subject<? super T, ? extends R>> getHighSpeedVideoFpsRanges;
    final java.lang.Object getHighSpeedVideoFpsRangesFor;
    final rx.functions.Func0<? extends rx.subjects.Subject<? super T, ? extends R>> getHighSpeedVideoSizesFor;
    final java.util.List<rx.Subscriber<? super R>> getInputFormats;
    rx.Subscriber<T> getOutputFormats;

    public OperatorMulticast(rx.Observable<? extends T> observable, rx.functions.Func0<? extends rx.subjects.Subject<? super T, ? extends R>> func0) {
        this(new java.lang.Object(), new java.util.concurrent.atomic.AtomicReference(), new java.util.ArrayList(), observable, func0);
    }

    private OperatorMulticast(final java.lang.Object obj, final java.util.concurrent.atomic.AtomicReference<rx.subjects.Subject<? super T, ? extends R>> atomicReference, final java.util.List<rx.Subscriber<? super R>> list, rx.Observable<? extends T> observable, rx.functions.Func0<? extends rx.subjects.Subject<? super T, ? extends R>> func0) {
        super(new rx.Observable.OnSubscribe<R>() { // from class: rx.internal.operators.OperatorMulticast.1
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Object obj2) {
                rx.Subscriber<? super T> subscriber = (rx.Subscriber) obj2;
                synchronized (obj) {
                    if (atomicReference.get() == null) {
                        list.add(subscriber);
                    } else {
                        ((rx.subjects.Subject) atomicReference.get()).unsafeSubscribe(subscriber);
                    }
                }
            }
        });
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges = atomicReference;
        this.getInputFormats = list;
        this.Camera2StreamConfigurationMap = observable;
        this.getHighSpeedVideoSizesFor = func0;
    }

    @Override // rx.observables.ConnectableObservable
    public final void connect(rx.functions.Action1<? super rx.Subscription> action1) {
        rx.Subscriber<T> subscriber;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getOutputFormats != null) {
                action1.call(this.getHighResolutionOutputSizeshNQ4ISI);
                return;
            }
            rx.subjects.Subject<? super T, ? extends R> call = this.getHighSpeedVideoSizesFor.call();
            this.getOutputFormats = rx.observers.Subscribers.from(call);
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            atomicReference.set(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorMulticast.2
                @Override // rx.functions.Action0
                public void call() {
                    synchronized (rx.internal.operators.OperatorMulticast.this.getHighSpeedVideoFpsRangesFor) {
                        if (rx.internal.operators.OperatorMulticast.this.getHighResolutionOutputSizeshNQ4ISI == atomicReference.get()) {
                            rx.Subscriber<T> subscriber2 = rx.internal.operators.OperatorMulticast.this.getOutputFormats;
                            rx.internal.operators.OperatorMulticast.this.getOutputFormats = null;
                            rx.internal.operators.OperatorMulticast.this.getHighResolutionOutputSizeshNQ4ISI = null;
                            rx.internal.operators.OperatorMulticast.this.getHighSpeedVideoFpsRanges.set(null);
                            if (subscriber2 != null) {
                                subscriber2.unsubscribe();
                            }
                        }
                    }
                }
            }));
            this.getHighResolutionOutputSizeshNQ4ISI = (rx.Subscription) atomicReference.get();
            for (final rx.Subscriber<? super R> subscriber2 : this.getInputFormats) {
                call.unsafeSubscribe(new rx.Subscriber<R>(subscriber2) { // from class: rx.internal.operators.OperatorMulticast.3
                    @Override // rx.Observer
                    public void onNext(R r) {
                        subscriber2.onNext(r);
                    }

                    @Override // rx.Observer
                    public void onError(java.lang.Throwable th) {
                        subscriber2.onError(th);
                    }

                    @Override // rx.Observer
                    public void onCompleted() {
                        subscriber2.onCompleted();
                    }
                });
            }
            this.getInputFormats.clear();
            this.getHighSpeedVideoFpsRanges.set(call);
            action1.call(this.getHighResolutionOutputSizeshNQ4ISI);
            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                subscriber = this.getOutputFormats;
            }
            if (subscriber != null) {
                this.Camera2StreamConfigurationMap.subscribe((rx.Subscriber<? super java.lang.Object>) subscriber);
            }
        }
    }
}
