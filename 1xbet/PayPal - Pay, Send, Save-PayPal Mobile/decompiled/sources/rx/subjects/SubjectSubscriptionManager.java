package rx.subjects;

/* loaded from: classes18.dex */
final class SubjectSubscriptionManager<T> extends java.util.concurrent.atomic.AtomicReference<rx.subjects.SubjectSubscriptionManager.State<T>> implements rx.Observable.OnSubscribe<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    rx.functions.Action1<rx.subjects.SubjectSubscriptionManager.SubjectObserver<T>> Camera2StreamConfigurationMap;
    rx.functions.Action1<rx.subjects.SubjectSubscriptionManager.SubjectObserver<T>> getHighResolutionOutputSizeshNQ4ISI;
    rx.functions.Action1<rx.subjects.SubjectSubscriptionManager.SubjectObserver<T>> getHighSpeedVideoFpsRanges;
    volatile java.lang.Object getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    @Override // rx.functions.Action1
    public final /* synthetic */ void call(java.lang.Object obj) {
        rx.subjects.SubjectSubscriptionManager.State<T> state;
        rx.Subscriber subscriber = (rx.Subscriber) obj;
        final rx.subjects.SubjectSubscriptionManager.SubjectObserver<T> subjectObserver = new rx.subjects.SubjectSubscriptionManager.SubjectObserver<>(subscriber);
        subscriber.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.subjects.SubjectSubscriptionManager.1
            @Override // rx.functions.Action0
            public void call() {
                rx.subjects.SubjectSubscriptionManager.this.getHighSpeedVideoFpsRangesFor(subjectObserver);
            }
        }));
        this.getHighSpeedVideoFpsRanges.call(subjectObserver);
        if (subscriber.isUnsubscribed()) {
            return;
        }
        do {
            state = get();
            if (state.getHighSpeedVideoFpsRanges) {
                this.Camera2StreamConfigurationMap.call(subjectObserver);
                return;
            }
        } while (!compareAndSet(state, state.add(subjectObserver)));
        this.getHighResolutionOutputSizeshNQ4ISI.call(subjectObserver);
        if (subscriber.isUnsubscribed()) {
            getHighSpeedVideoFpsRangesFor(subjectObserver);
        }
    }

    public SubjectSubscriptionManager() {
        super(rx.subjects.SubjectSubscriptionManager.State.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizes = true;
        this.getHighSpeedVideoFpsRanges = rx.functions.Actions.empty();
        this.getHighResolutionOutputSizeshNQ4ISI = rx.functions.Actions.empty();
        this.Camera2StreamConfigurationMap = rx.functions.Actions.empty();
    }

    final void getHighSpeedVideoFpsRangesFor(rx.subjects.SubjectSubscriptionManager.SubjectObserver<T> subjectObserver) {
        rx.subjects.SubjectSubscriptionManager.State<T> state;
        rx.subjects.SubjectSubscriptionManager.State<T> remove;
        do {
            state = get();
            if (state.getHighSpeedVideoFpsRanges || (remove = state.remove(subjectObserver)) == state) {
                return;
            }
        } while (!compareAndSet(state, remove));
    }

    protected static final class State<T> {
        static final rx.subjects.SubjectSubscriptionManager.State getHighResolutionOutputSizeshNQ4ISI;
        static final rx.subjects.SubjectSubscriptionManager.State getHighSpeedVideoFpsRangesFor;
        static final rx.subjects.SubjectSubscriptionManager.SubjectObserver[] getHighSpeedVideoSizes;
        final rx.subjects.SubjectSubscriptionManager.SubjectObserver[] Camera2StreamConfigurationMap;
        final boolean getHighSpeedVideoFpsRanges;

        static {
            rx.subjects.SubjectSubscriptionManager.SubjectObserver[] subjectObserverArr = new rx.subjects.SubjectSubscriptionManager.SubjectObserver[0];
            getHighSpeedVideoSizes = subjectObserverArr;
            getHighResolutionOutputSizeshNQ4ISI = new rx.subjects.SubjectSubscriptionManager.State(true, subjectObserverArr);
            getHighSpeedVideoFpsRangesFor = new rx.subjects.SubjectSubscriptionManager.State(false, subjectObserverArr);
        }

        public State(boolean z, rx.subjects.SubjectSubscriptionManager.SubjectObserver[] subjectObserverArr) {
            this.getHighSpeedVideoFpsRanges = z;
            this.Camera2StreamConfigurationMap = subjectObserverArr;
        }

        public final rx.subjects.SubjectSubscriptionManager.State add(rx.subjects.SubjectSubscriptionManager.SubjectObserver subjectObserver) {
            rx.subjects.SubjectSubscriptionManager.SubjectObserver[] subjectObserverArr = this.Camera2StreamConfigurationMap;
            int length = subjectObserverArr.length;
            rx.subjects.SubjectSubscriptionManager.SubjectObserver[] subjectObserverArr2 = new rx.subjects.SubjectSubscriptionManager.SubjectObserver[length + 1];
            java.lang.System.arraycopy(subjectObserverArr, 0, subjectObserverArr2, 0, length);
            subjectObserverArr2[length] = subjectObserver;
            return new rx.subjects.SubjectSubscriptionManager.State(this.getHighSpeedVideoFpsRanges, subjectObserverArr2);
        }

        public final rx.subjects.SubjectSubscriptionManager.State remove(rx.subjects.SubjectSubscriptionManager.SubjectObserver subjectObserver) {
            rx.subjects.SubjectSubscriptionManager.SubjectObserver[] subjectObserverArr = this.Camera2StreamConfigurationMap;
            int length = subjectObserverArr.length;
            if (length == 1 && subjectObserverArr[0] == subjectObserver) {
                return getHighSpeedVideoFpsRangesFor;
            }
            if (length != 0) {
                int i = length - 1;
                rx.subjects.SubjectSubscriptionManager.SubjectObserver[] subjectObserverArr2 = new rx.subjects.SubjectSubscriptionManager.SubjectObserver[i];
                int i2 = 0;
                for (rx.subjects.SubjectSubscriptionManager.SubjectObserver subjectObserver2 : subjectObserverArr) {
                    if (subjectObserver2 != subjectObserver) {
                        if (i2 != i) {
                            subjectObserverArr2[i2] = subjectObserver2;
                            i2++;
                        }
                    }
                }
                if (i2 == 0) {
                    return getHighSpeedVideoFpsRangesFor;
                }
                if (i2 < i) {
                    rx.subjects.SubjectSubscriptionManager.SubjectObserver[] subjectObserverArr3 = new rx.subjects.SubjectSubscriptionManager.SubjectObserver[i2];
                    java.lang.System.arraycopy(subjectObserverArr2, 0, subjectObserverArr3, 0, i2);
                    subjectObserverArr2 = subjectObserverArr3;
                }
                return new rx.subjects.SubjectSubscriptionManager.State(this.getHighSpeedVideoFpsRanges, subjectObserverArr2);
            }
            return this;
        }
    }

    protected static final class SubjectObserver<T> implements rx.Observer<T> {
        java.util.List<java.lang.Object> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor = true;
        boolean getHighSpeedVideoSizes;
        private volatile java.lang.Object getOutputMinFrameDuration;

        public SubjectObserver(rx.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRanges = subscriber;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRanges.onNext(t);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRanges.onCompleted();
        }

        final void Camera2StreamConfigurationMap(java.lang.Object obj) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                synchronized (this) {
                    this.getHighSpeedVideoFpsRangesFor = false;
                    if (this.getHighSpeedVideoSizes) {
                        if (this.Camera2StreamConfigurationMap == null) {
                            this.Camera2StreamConfigurationMap = new java.util.ArrayList();
                        }
                        this.Camera2StreamConfigurationMap.add(obj);
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                }
            }
            rx.internal.operators.NotificationLite.accept(this.getHighSpeedVideoFpsRanges, obj);
        }

        final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRangesFor && !this.getHighSpeedVideoSizes) {
                    this.getHighSpeedVideoFpsRangesFor = false;
                    this.getHighSpeedVideoSizes = obj != null;
                    if (obj != null) {
                        getHighSpeedVideoFpsRanges(null, obj);
                    }
                }
            }
        }

        private void getHighSpeedVideoFpsRanges(java.util.List<java.lang.Object> list, java.lang.Object obj) {
            boolean z = true;
            while (true) {
                if (list != null) {
                    try {
                        for (java.lang.Object obj2 : list) {
                            if (obj2 != null) {
                                rx.internal.operators.NotificationLite.accept(this.getHighSpeedVideoFpsRanges, obj2);
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        synchronized (this) {
                            this.getHighSpeedVideoSizes = false;
                            throw th;
                        }
                    }
                }
                if (z) {
                    if (obj != null) {
                        rx.internal.operators.NotificationLite.accept(this.getHighSpeedVideoFpsRanges, obj);
                    }
                    z = false;
                }
                synchronized (this) {
                    list = this.Camera2StreamConfigurationMap;
                    this.Camera2StreamConfigurationMap = null;
                    if (list == null) {
                        this.getHighSpeedVideoSizes = false;
                        return;
                    }
                }
            }
        }

        public final <I> I index() {
            return (I) this.getOutputMinFrameDuration;
        }

        public final void index(java.lang.Object obj) {
            this.getOutputMinFrameDuration = obj;
        }
    }

    final rx.subjects.SubjectSubscriptionManager.SubjectObserver<T>[] getHighSpeedVideoSizes(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes = false;
        if (get().getHighSpeedVideoFpsRanges) {
            return rx.subjects.SubjectSubscriptionManager.State.getHighSpeedVideoSizes;
        }
        return getAndSet(rx.subjects.SubjectSubscriptionManager.State.getHighResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap;
    }
}
