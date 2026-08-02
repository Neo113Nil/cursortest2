package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorWindowWithTime<T> implements rx.Observable.Operator<rx.Observable<T>, T> {
    static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    final long Camera2StreamConfigurationMap;
    final long getHighSpeedVideoFpsRanges;
    final rx.Scheduler getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;
    final java.util.concurrent.TimeUnit getOutputMinFrameDuration;

    public OperatorWindowWithTime(long j, long j2, java.util.concurrent.TimeUnit timeUnit, int i, rx.Scheduler scheduler) {
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getOutputMinFrameDuration = timeUnit;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super rx.Observable<T>> subscriber) {
        rx.Scheduler.Worker createWorker = this.getHighSpeedVideoFpsRangesFor.createWorker();
        if (this.getHighSpeedVideoFpsRanges == this.Camera2StreamConfigurationMap) {
            final rx.internal.operators.OperatorWindowWithTime.ExactSubscriber exactSubscriber = new rx.internal.operators.OperatorWindowWithTime.ExactSubscriber(subscriber, createWorker);
            exactSubscriber.add(createWorker);
            exactSubscriber.getOutputFormats.schedulePeriodically(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.ExactSubscriber.2
                @Override // rx.functions.Action0
                public void call() {
                    java.util.List<java.lang.Object> list;
                    rx.internal.operators.OperatorWindowWithTime.ExactSubscriber exactSubscriber2 = rx.internal.operators.OperatorWindowWithTime.ExactSubscriber.this;
                    synchronized (exactSubscriber2.getHighResolutionOutputSizeshNQ4ISI) {
                        if (exactSubscriber2.Camera2StreamConfigurationMap) {
                            if (exactSubscriber2.getHighSpeedVideoFpsRanges == null) {
                                exactSubscriber2.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
                            }
                            exactSubscriber2.getHighSpeedVideoFpsRanges.add(rx.internal.operators.OperatorWindowWithTime.getHighResolutionOutputSizeshNQ4ISI);
                            return;
                        }
                        exactSubscriber2.Camera2StreamConfigurationMap = true;
                        try {
                            if (exactSubscriber2.getHighSpeedVideoFpsRanges()) {
                                do {
                                    synchronized (exactSubscriber2.getHighResolutionOutputSizeshNQ4ISI) {
                                        list = exactSubscriber2.getHighSpeedVideoFpsRanges;
                                        if (list == null) {
                                            exactSubscriber2.Camera2StreamConfigurationMap = false;
                                            return;
                                        }
                                        exactSubscriber2.getHighSpeedVideoFpsRanges = null;
                                    }
                                } while (exactSubscriber2.getHighSpeedVideoFpsRanges(list));
                                synchronized (exactSubscriber2.getHighResolutionOutputSizeshNQ4ISI) {
                                    exactSubscriber2.Camera2StreamConfigurationMap = false;
                                }
                                return;
                            }
                            synchronized (exactSubscriber2.getHighResolutionOutputSizeshNQ4ISI) {
                                exactSubscriber2.Camera2StreamConfigurationMap = false;
                            }
                        } catch (java.lang.Throwable th) {
                            synchronized (exactSubscriber2.getHighResolutionOutputSizeshNQ4ISI) {
                                exactSubscriber2.Camera2StreamConfigurationMap = false;
                                throw th;
                            }
                        }
                    }
                }
            }, 0L, rx.internal.operators.OperatorWindowWithTime.this.getHighSpeedVideoFpsRanges, rx.internal.operators.OperatorWindowWithTime.this.getOutputMinFrameDuration);
            return exactSubscriber;
        }
        final rx.internal.operators.OperatorWindowWithTime.InexactSubscriber inexactSubscriber = new rx.internal.operators.OperatorWindowWithTime.InexactSubscriber(subscriber, createWorker);
        inexactSubscriber.add(createWorker);
        inexactSubscriber.getHighResolutionOutputSizeshNQ4ISI();
        inexactSubscriber.getOutputFormats.schedulePeriodically(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.InexactSubscriber.1
            @Override // rx.functions.Action0
            public void call() {
                rx.internal.operators.OperatorWindowWithTime.InexactSubscriber.this.getHighResolutionOutputSizeshNQ4ISI();
            }
        }, rx.internal.operators.OperatorWindowWithTime.this.Camera2StreamConfigurationMap, rx.internal.operators.OperatorWindowWithTime.this.Camera2StreamConfigurationMap, rx.internal.operators.OperatorWindowWithTime.this.getOutputMinFrameDuration);
        return inexactSubscriber;
    }

    static final class State<T> {
        static final rx.internal.operators.OperatorWindowWithTime.State<java.lang.Object> getHighSpeedVideoFpsRangesFor = new rx.internal.operators.OperatorWindowWithTime.State<>(null, null, 0);
        final rx.Observer<T> Camera2StreamConfigurationMap;
        final rx.Observable<T> getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoSizes;

        public State(rx.Observer<T> observer, rx.Observable<T> observable, int i) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoFpsRanges = observable;
            this.getHighSpeedVideoSizes = i;
        }

        public static rx.internal.operators.OperatorWindowWithTime.State<T> Camera2StreamConfigurationMap(rx.Observer<T> observer, rx.Observable<T> observable) {
            return new rx.internal.operators.OperatorWindowWithTime.State<>(observer, observable, 0);
        }

        public static <T> rx.internal.operators.OperatorWindowWithTime.State<T> getHighSpeedVideoFpsRanges() {
            return (rx.internal.operators.OperatorWindowWithTime.State<T>) getHighSpeedVideoFpsRangesFor;
        }

        public static rx.internal.operators.OperatorWindowWithTime.State<T> getHighSpeedVideoFpsRangesFor() {
            return (rx.internal.operators.OperatorWindowWithTime.State<T>) getHighSpeedVideoFpsRangesFor;
        }
    }

    final class ExactSubscriber extends rx.Subscriber<T> {
        boolean Camera2StreamConfigurationMap;
        java.util.List<java.lang.Object> getHighSpeedVideoFpsRanges;
        final rx.Subscriber<? super rx.Observable<T>> getHighSpeedVideoFpsRangesFor;
        final rx.Scheduler.Worker getOutputFormats;
        final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        volatile rx.internal.operators.OperatorWindowWithTime.State<T> getHighSpeedVideoSizes = rx.internal.operators.OperatorWindowWithTime.State.getHighSpeedVideoFpsRanges();

        public ExactSubscriber(rx.Subscriber<? super rx.Observable<T>> subscriber, rx.Scheduler.Worker worker) {
            this.getHighSpeedVideoFpsRangesFor = new rx.observers.SerializedSubscriber(subscriber);
            this.getOutputFormats = worker;
            subscriber.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.ExactSubscriber.1
                @Override // rx.functions.Action0
                public void call() {
                    if (rx.internal.operators.OperatorWindowWithTime.ExactSubscriber.this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap == null) {
                        rx.internal.operators.OperatorWindowWithTime.ExactSubscriber.this.unsubscribe();
                    }
                }
            }));
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            java.util.List<java.lang.Object> list;
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.Camera2StreamConfigurationMap) {
                    if (this.getHighSpeedVideoFpsRanges == null) {
                        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
                    }
                    this.getHighSpeedVideoFpsRanges.add(t);
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                try {
                    if (Camera2StreamConfigurationMap(t)) {
                        do {
                            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                                list = this.getHighSpeedVideoFpsRanges;
                                if (list == null) {
                                    this.Camera2StreamConfigurationMap = false;
                                    return;
                                }
                                this.getHighSpeedVideoFpsRanges = null;
                            }
                        } while (getHighSpeedVideoFpsRanges(list));
                        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                            this.Camera2StreamConfigurationMap = false;
                        }
                        return;
                    }
                    synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                        this.Camera2StreamConfigurationMap = false;
                    }
                } catch (java.lang.Throwable th) {
                    synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                        this.Camera2StreamConfigurationMap = false;
                        throw th;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
        
            return true;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final boolean getHighSpeedVideoFpsRanges(java.util.List<java.lang.Object> list) {
            if (list == null) {
                return true;
            }
            java.util.Iterator<java.lang.Object> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (next == rx.internal.operators.OperatorWindowWithTime.getHighResolutionOutputSizeshNQ4ISI) {
                    if (!getHighSpeedVideoFpsRanges()) {
                        return false;
                    }
                } else {
                    if (rx.internal.operators.NotificationLite.isError(next)) {
                        getHighSpeedVideoSizes(rx.internal.operators.NotificationLite.getError(next));
                        break;
                    }
                    if (rx.internal.operators.NotificationLite.isCompleted(next)) {
                        getHighResolutionOutputSizeshNQ4ISI();
                        break;
                    }
                    if (!Camera2StreamConfigurationMap(next)) {
                        return false;
                    }
                }
            }
        }

        final boolean getHighSpeedVideoFpsRanges() {
            rx.Observer<T> observer = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            if (observer != null) {
                observer.onCompleted();
            }
            if (this.getHighSpeedVideoFpsRangesFor.isUnsubscribed()) {
                this.getHighSpeedVideoSizes = rx.internal.operators.OperatorWindowWithTime.State.getHighSpeedVideoFpsRangesFor();
                unsubscribe();
                return false;
            }
            rx.subjects.UnicastSubject create = rx.subjects.UnicastSubject.create();
            this.getHighSpeedVideoSizes = rx.internal.operators.OperatorWindowWithTime.State.Camera2StreamConfigurationMap(create, create);
            this.getHighSpeedVideoFpsRangesFor.onNext(create);
            return true;
        }

        private boolean Camera2StreamConfigurationMap(T t) {
            rx.internal.operators.OperatorWindowWithTime.State<T> state;
            rx.internal.operators.OperatorWindowWithTime.State<T> state2 = this.getHighSpeedVideoSizes;
            if (state2.Camera2StreamConfigurationMap == null) {
                if (!getHighSpeedVideoFpsRanges()) {
                    return false;
                }
                state2 = this.getHighSpeedVideoSizes;
            }
            state2.Camera2StreamConfigurationMap.onNext(t);
            if (state2.getHighSpeedVideoSizes == rx.internal.operators.OperatorWindowWithTime.this.getHighSpeedVideoSizes - 1) {
                state2.Camera2StreamConfigurationMap.onCompleted();
                state = rx.internal.operators.OperatorWindowWithTime.State.getHighSpeedVideoFpsRangesFor();
            } else {
                state = new rx.internal.operators.OperatorWindowWithTime.State<>(state2.Camera2StreamConfigurationMap, state2.getHighSpeedVideoFpsRanges, state2.getHighSpeedVideoSizes + 1);
            }
            this.getHighSpeedVideoSizes = state;
            return true;
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.Camera2StreamConfigurationMap) {
                    this.getHighSpeedVideoFpsRanges = java.util.Collections.singletonList(rx.internal.operators.NotificationLite.error(th));
                    return;
                }
                this.getHighSpeedVideoFpsRanges = null;
                this.Camera2StreamConfigurationMap = true;
                getHighSpeedVideoSizes(th);
            }
        }

        private void getHighSpeedVideoSizes(java.lang.Throwable th) {
            rx.Observer<T> observer = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = rx.internal.operators.OperatorWindowWithTime.State.getHighSpeedVideoFpsRangesFor();
            if (observer != null) {
                observer.onError(th);
            }
            this.getHighSpeedVideoFpsRangesFor.onError(th);
            unsubscribe();
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            rx.Observer<T> observer = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = rx.internal.operators.OperatorWindowWithTime.State.getHighSpeedVideoFpsRangesFor();
            if (observer != null) {
                observer.onCompleted();
            }
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
            unsubscribe();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.Camera2StreamConfigurationMap) {
                    if (this.getHighSpeedVideoFpsRanges == null) {
                        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
                    }
                    this.getHighSpeedVideoFpsRanges.add(rx.internal.operators.NotificationLite.completed());
                    return;
                }
                java.util.List<java.lang.Object> list = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = null;
                this.Camera2StreamConfigurationMap = true;
                try {
                    getHighSpeedVideoFpsRanges(list);
                    getHighResolutionOutputSizeshNQ4ISI();
                } catch (java.lang.Throwable th) {
                    getHighSpeedVideoSizes(th);
                }
            }
        }
    }

    static final class CountedSerializedSubject<T> {
        final rx.Observable<T> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final rx.Observer<T> getHighSpeedVideoFpsRangesFor;

        public CountedSerializedSubject(rx.Observer<T> observer, rx.Observable<T> observable) {
            this.getHighSpeedVideoFpsRangesFor = new rx.observers.SerializedObserver(observer);
            this.getHighResolutionOutputSizeshNQ4ISI = observable;
        }
    }

    final class InexactSubscriber extends rx.Subscriber<T> {
        boolean Camera2StreamConfigurationMap;
        final java.util.List<rx.internal.operators.OperatorWindowWithTime.CountedSerializedSubject<T>> getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.Object getHighSpeedVideoFpsRanges;
        final rx.Subscriber<? super rx.Observable<T>> getHighSpeedVideoFpsRangesFor;
        final rx.Scheduler.Worker getOutputFormats;

        public InexactSubscriber(rx.Subscriber<? super rx.Observable<T>> subscriber, rx.Scheduler.Worker worker) {
            super(subscriber);
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getOutputFormats = worker;
            this.getHighSpeedVideoFpsRanges = new java.lang.Object();
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedList();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                java.util.ArrayList<rx.internal.operators.OperatorWindowWithTime.CountedSerializedSubject> arrayList = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
                java.util.Iterator<rx.internal.operators.OperatorWindowWithTime.CountedSerializedSubject<T>> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                while (it.hasNext()) {
                    rx.internal.operators.OperatorWindowWithTime.CountedSerializedSubject<T> next = it.next();
                    int i = next.getHighSpeedVideoFpsRanges + 1;
                    next.getHighSpeedVideoFpsRanges = i;
                    if (i == rx.internal.operators.OperatorWindowWithTime.this.getHighSpeedVideoSizes) {
                        it.remove();
                    }
                }
                for (rx.internal.operators.OperatorWindowWithTime.CountedSerializedSubject countedSerializedSubject : arrayList) {
                    countedSerializedSubject.getHighSpeedVideoFpsRangesFor.onNext(t);
                    if (countedSerializedSubject.getHighSpeedVideoFpsRanges == rx.internal.operators.OperatorWindowWithTime.this.getHighSpeedVideoSizes) {
                        countedSerializedSubject.getHighSpeedVideoFpsRangesFor.onCompleted();
                    }
                }
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighResolutionOutputSizeshNQ4ISI.clear();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((rx.internal.operators.OperatorWindowWithTime.CountedSerializedSubject) it.next()).getHighSpeedVideoFpsRangesFor.onError(th);
                }
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighResolutionOutputSizeshNQ4ISI.clear();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((rx.internal.operators.OperatorWindowWithTime.CountedSerializedSubject) it.next()).getHighSpeedVideoFpsRangesFor.onCompleted();
                }
                this.getHighSpeedVideoFpsRangesFor.onCompleted();
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            rx.subjects.UnicastSubject create = rx.subjects.UnicastSubject.create();
            final rx.internal.operators.OperatorWindowWithTime.CountedSerializedSubject<T> countedSerializedSubject = new rx.internal.operators.OperatorWindowWithTime.CountedSerializedSubject<>(create, create);
            synchronized (this.getHighSpeedVideoFpsRanges) {
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.add(countedSerializedSubject);
                try {
                    this.getHighSpeedVideoFpsRangesFor.onNext(countedSerializedSubject.getHighResolutionOutputSizeshNQ4ISI);
                    this.getOutputFormats.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.InexactSubscriber.2
                        /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
                        
                            r0.remove();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
                        
                            r0 = true;
                         */
                        @Override // rx.functions.Action0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public void call() {
                            boolean z;
                            rx.internal.operators.OperatorWindowWithTime.InexactSubscriber inexactSubscriber = rx.internal.operators.OperatorWindowWithTime.InexactSubscriber.this;
                            rx.internal.operators.OperatorWindowWithTime.CountedSerializedSubject<T> countedSerializedSubject2 = countedSerializedSubject;
                            synchronized (inexactSubscriber.getHighSpeedVideoFpsRanges) {
                                if (inexactSubscriber.Camera2StreamConfigurationMap) {
                                    return;
                                }
                                java.util.Iterator<rx.internal.operators.OperatorWindowWithTime.CountedSerializedSubject<T>> it = inexactSubscriber.getHighResolutionOutputSizeshNQ4ISI.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = false;
                                        break;
                                    } else if (it.next() == countedSerializedSubject2) {
                                        break;
                                    }
                                }
                                if (z) {
                                    countedSerializedSubject2.getHighSpeedVideoFpsRangesFor.onCompleted();
                                }
                            }
                        }
                    }, rx.internal.operators.OperatorWindowWithTime.this.getHighSpeedVideoFpsRanges, rx.internal.operators.OperatorWindowWithTime.this.getOutputMinFrameDuration);
                } catch (java.lang.Throwable th) {
                    onError(th);
                }
            }
        }
    }
}
