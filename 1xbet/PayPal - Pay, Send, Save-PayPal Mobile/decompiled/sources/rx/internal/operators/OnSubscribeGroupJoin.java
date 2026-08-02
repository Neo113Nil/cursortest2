package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeGroupJoin<T1, T2, D1, D2, R> implements rx.Observable.OnSubscribe<R> {
    final rx.functions.Func2<? super T1, ? super rx.Observable<T2>, ? extends R> Camera2StreamConfigurationMap;
    final rx.functions.Func1<? super T1, ? extends rx.Observable<D1>> getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Func1<? super T2, ? extends rx.Observable<D2>> getHighSpeedVideoFpsRanges;
    final rx.Observable<T1> getHighSpeedVideoFpsRangesFor;
    final rx.Observable<T2> getHighSpeedVideoSizes;

    public OnSubscribeGroupJoin(rx.Observable<T1> observable, rx.Observable<T2> observable2, rx.functions.Func1<? super T1, ? extends rx.Observable<D1>> func1, rx.functions.Func1<? super T2, ? extends rx.Observable<D2>> func12, rx.functions.Func2<? super T1, ? super rx.Observable<T2>, ? extends R> func2) {
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.getHighSpeedVideoSizes = observable2;
        this.getHighResolutionOutputSizeshNQ4ISI = func1;
        this.getHighSpeedVideoFpsRanges = func12;
        this.Camera2StreamConfigurationMap = func2;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super R> subscriber) {
        rx.internal.operators.OnSubscribeGroupJoin.ResultManager resultManager = new rx.internal.operators.OnSubscribeGroupJoin.ResultManager(new rx.observers.SerializedSubscriber(subscriber));
        subscriber.add(resultManager);
        rx.internal.operators.OnSubscribeGroupJoin.ResultManager.LeftObserver leftObserver = resultManager.new LeftObserver();
        rx.internal.operators.OnSubscribeGroupJoin.ResultManager.RightObserver rightObserver = resultManager.new RightObserver();
        resultManager.getHighSpeedVideoSizes.add(leftObserver);
        resultManager.getHighSpeedVideoSizes.add(rightObserver);
        rx.internal.operators.OnSubscribeGroupJoin.this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(leftObserver);
        rx.internal.operators.OnSubscribeGroupJoin.this.getHighSpeedVideoSizes.unsafeSubscribe(rightObserver);
    }

    final class ResultManager extends java.util.HashMap<java.lang.Integer, rx.Observer<T2>> implements rx.Subscription {
        private static final long serialVersionUID = -3035156013812425335L;
        boolean Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final rx.subscriptions.RefCountSubscription getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final rx.subscriptions.CompositeSubscription getHighSpeedVideoSizes;
        final java.util.Map<java.lang.Integer, T2> getHighSpeedVideoSizesFor = new java.util.HashMap();
        int getInputFormats;
        final rx.Subscriber<? super R> getOutputFormats;

        public ResultManager(rx.Subscriber<? super R> subscriber) {
            this.getOutputFormats = subscriber;
            rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
            this.getHighSpeedVideoSizes = compositeSubscription;
            this.getHighSpeedVideoFpsRanges = new rx.subscriptions.RefCountSubscription(compositeSubscription);
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            this.getHighSpeedVideoFpsRanges.unsubscribe();
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoFpsRanges.isUnsubscribed();
        }

        final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
            java.util.ArrayList arrayList;
            synchronized (this) {
                arrayList = new java.util.ArrayList(values());
                clear();
                this.getHighSpeedVideoSizesFor.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((rx.Observer) it.next()).onError(th);
            }
            this.getOutputFormats.onError(th);
            this.getHighSpeedVideoFpsRanges.unsubscribe();
        }

        final void getHighSpeedVideoSizes(java.lang.Throwable th) {
            synchronized (this) {
                clear();
                this.getHighSpeedVideoSizesFor.clear();
            }
            this.getOutputFormats.onError(th);
            this.getHighSpeedVideoFpsRanges.unsubscribe();
        }

        final void Camera2StreamConfigurationMap(java.util.List<rx.Observer<T2>> list) {
            if (list != null) {
                java.util.Iterator<rx.Observer<T2>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onCompleted();
                }
                this.getOutputFormats.onCompleted();
                this.getHighSpeedVideoFpsRanges.unsubscribe();
            }
        }

        final class LeftObserver extends rx.Subscriber<T1> {
            LeftObserver() {
            }

            @Override // rx.Observer
            public final void onNext(T1 t1) {
                int i;
                java.util.ArrayList arrayList;
                try {
                    rx.subjects.PublishSubject create = rx.subjects.PublishSubject.create();
                    rx.observers.SerializedObserver serializedObserver = new rx.observers.SerializedObserver(create);
                    synchronized (rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this) {
                        rx.internal.operators.OnSubscribeGroupJoin.ResultManager resultManager = rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this;
                        i = resultManager.getHighSpeedVideoFpsRangesFor;
                        resultManager.getHighSpeedVideoFpsRangesFor = i + 1;
                        rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.put(java.lang.Integer.valueOf(i), serializedObserver);
                    }
                    rx.Observable unsafeCreate = rx.Observable.unsafeCreate(new rx.internal.operators.OnSubscribeGroupJoin.WindowObservableFunc(create, rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoFpsRanges));
                    rx.Observable<D1> call = rx.internal.operators.OnSubscribeGroupJoin.this.getHighResolutionOutputSizeshNQ4ISI.call(t1);
                    rx.internal.operators.OnSubscribeGroupJoin.ResultManager.LeftDurationObserver leftDurationObserver = rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.new LeftDurationObserver(i);
                    rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoSizes.add(leftDurationObserver);
                    call.unsafeSubscribe(leftDurationObserver);
                    R call2 = rx.internal.operators.OnSubscribeGroupJoin.this.Camera2StreamConfigurationMap.call(t1, unsafeCreate);
                    synchronized (rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this) {
                        arrayList = new java.util.ArrayList(rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoSizesFor.values());
                    }
                    rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getOutputFormats.onNext(call2);
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        serializedObserver.onNext(it.next());
                    }
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, this);
                }
            }

            @Override // rx.Observer
            public final void onCompleted() {
                java.util.ArrayList arrayList;
                synchronized (rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this) {
                    rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighResolutionOutputSizeshNQ4ISI = true;
                    if (rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.Camera2StreamConfigurationMap) {
                        arrayList = new java.util.ArrayList(rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.values());
                        rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.clear();
                        rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoSizesFor.clear();
                    } else {
                        arrayList = null;
                    }
                }
                rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.Camera2StreamConfigurationMap(arrayList);
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoFpsRanges(th);
            }
        }

        final class RightObserver extends rx.Subscriber<T2> {
            RightObserver() {
            }

            @Override // rx.Observer
            public final void onNext(T2 t2) {
                int i;
                java.util.ArrayList arrayList;
                try {
                    synchronized (rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this) {
                        rx.internal.operators.OnSubscribeGroupJoin.ResultManager resultManager = rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this;
                        i = resultManager.getInputFormats;
                        resultManager.getInputFormats = i + 1;
                        rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoSizesFor.put(java.lang.Integer.valueOf(i), t2);
                    }
                    rx.Observable<D2> call = rx.internal.operators.OnSubscribeGroupJoin.this.getHighSpeedVideoFpsRanges.call(t2);
                    rx.internal.operators.OnSubscribeGroupJoin.ResultManager.RightDurationObserver rightDurationObserver = rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.new RightDurationObserver(i);
                    rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoSizes.add(rightDurationObserver);
                    call.unsafeSubscribe(rightDurationObserver);
                    synchronized (rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this) {
                        arrayList = new java.util.ArrayList(rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.values());
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((rx.Observer) it.next()).onNext(t2);
                    }
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, this);
                }
            }

            @Override // rx.Observer
            public final void onCompleted() {
                java.util.ArrayList arrayList;
                synchronized (rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this) {
                    rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.Camera2StreamConfigurationMap = true;
                    if (rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighResolutionOutputSizeshNQ4ISI) {
                        arrayList = new java.util.ArrayList(rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.values());
                        rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.clear();
                        rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoSizesFor.clear();
                    } else {
                        arrayList = null;
                    }
                }
                rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.Camera2StreamConfigurationMap(arrayList);
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoFpsRanges(th);
            }
        }

        final class LeftDurationObserver extends rx.Subscriber<D1> {
            boolean Camera2StreamConfigurationMap = true;
            final int getHighSpeedVideoSizes;

            public LeftDurationObserver(int i) {
                this.getHighSpeedVideoSizes = i;
            }

            @Override // rx.Observer
            public final void onCompleted() {
                rx.Observer<T2> remove;
                if (this.Camera2StreamConfigurationMap) {
                    this.Camera2StreamConfigurationMap = false;
                    synchronized (rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this) {
                        remove = rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.remove(java.lang.Integer.valueOf(this.getHighSpeedVideoSizes));
                    }
                    if (remove != null) {
                        remove.onCompleted();
                    }
                    rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoSizes.remove(this);
                }
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoSizes(th);
            }

            @Override // rx.Observer
            public final void onNext(D1 d1) {
                onCompleted();
            }
        }

        final class RightDurationObserver extends rx.Subscriber<D2> {
            final int getHighSpeedVideoFpsRangesFor;
            boolean getHighSpeedVideoSizes = true;

            public RightDurationObserver(int i) {
                this.getHighSpeedVideoFpsRangesFor = i;
            }

            @Override // rx.Observer
            public final void onCompleted() {
                if (this.getHighSpeedVideoSizes) {
                    this.getHighSpeedVideoSizes = false;
                    synchronized (rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this) {
                        rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoSizesFor.remove(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor));
                    }
                    rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoSizes.remove(this);
                }
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.OnSubscribeGroupJoin.ResultManager.this.getHighSpeedVideoSizes(th);
            }

            @Override // rx.Observer
            public final void onNext(D2 d2) {
                onCompleted();
            }
        }
    }

    static final class WindowObservableFunc<T> implements rx.Observable.OnSubscribe<T> {
        final rx.Observable<T> Camera2StreamConfigurationMap;
        final rx.subscriptions.RefCountSubscription getHighSpeedVideoSizes;

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.Subscription subscription = this.getHighSpeedVideoSizes.get();
            rx.internal.operators.OnSubscribeGroupJoin.WindowObservableFunc.WindowSubscriber windowSubscriber = new rx.internal.operators.OnSubscribeGroupJoin.WindowObservableFunc.WindowSubscriber((rx.Subscriber) obj, subscription);
            windowSubscriber.add(subscription);
            this.Camera2StreamConfigurationMap.unsafeSubscribe(windowSubscriber);
        }

        public WindowObservableFunc(rx.Observable<T> observable, rx.subscriptions.RefCountSubscription refCountSubscription) {
            this.getHighSpeedVideoSizes = refCountSubscription;
            this.Camera2StreamConfigurationMap = observable;
        }

        final class WindowSubscriber extends rx.Subscriber<T> {
            private final rx.Subscription getHighResolutionOutputSizeshNQ4ISI;
            final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;

            public WindowSubscriber(rx.Subscriber<? super T> subscriber, rx.Subscription subscription) {
                super(subscriber);
                this.getHighSpeedVideoFpsRanges = subscriber;
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
            }

            @Override // rx.Observer
            public final void onNext(T t) {
                this.getHighSpeedVideoFpsRanges.onNext(t);
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRanges.onError(th);
                this.getHighResolutionOutputSizeshNQ4ISI.unsubscribe();
            }

            @Override // rx.Observer
            public final void onCompleted() {
                this.getHighSpeedVideoFpsRanges.onCompleted();
                this.getHighResolutionOutputSizeshNQ4ISI.unsubscribe();
            }
        }
    }
}
