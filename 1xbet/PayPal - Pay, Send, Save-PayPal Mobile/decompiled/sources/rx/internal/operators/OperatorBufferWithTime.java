package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorBufferWithTime<T> implements rx.Observable.Operator<java.util.List<T>, T> {
    final long Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRanges;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;
    final rx.Scheduler getHighSpeedVideoSizes;

    public OperatorBufferWithTime(long j, long j2, java.util.concurrent.TimeUnit timeUnit, int i, rx.Scheduler scheduler) {
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighSpeedVideoFpsRangesFor = timeUnit;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super java.util.List<T>> subscriber) {
        rx.Scheduler.Worker createWorker = this.getHighSpeedVideoSizes.createWorker();
        rx.observers.SerializedSubscriber serializedSubscriber = new rx.observers.SerializedSubscriber(subscriber);
        if (this.getHighSpeedVideoFpsRanges == this.Camera2StreamConfigurationMap) {
            final rx.internal.operators.OperatorBufferWithTime.ExactSubscriber exactSubscriber = new rx.internal.operators.OperatorBufferWithTime.ExactSubscriber(serializedSubscriber, createWorker);
            exactSubscriber.add(createWorker);
            subscriber.add(exactSubscriber);
            exactSubscriber.getHighSpeedVideoFpsRanges.schedulePeriodically(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorBufferWithTime.ExactSubscriber.1
                @Override // rx.functions.Action0
                public void call() {
                    rx.internal.operators.OperatorBufferWithTime.ExactSubscriber exactSubscriber2 = rx.internal.operators.OperatorBufferWithTime.ExactSubscriber.this;
                    synchronized (exactSubscriber2) {
                        if (exactSubscriber2.getHighResolutionOutputSizeshNQ4ISI) {
                            return;
                        }
                        java.util.List<T> list = exactSubscriber2.getHighSpeedVideoSizes;
                        exactSubscriber2.getHighSpeedVideoSizes = new java.util.ArrayList();
                        try {
                            exactSubscriber2.Camera2StreamConfigurationMap.onNext(list);
                        } catch (java.lang.Throwable th) {
                            rx.exceptions.Exceptions.throwOrReport(th, exactSubscriber2);
                        }
                    }
                }
            }, rx.internal.operators.OperatorBufferWithTime.this.getHighSpeedVideoFpsRanges, rx.internal.operators.OperatorBufferWithTime.this.getHighSpeedVideoFpsRanges, rx.internal.operators.OperatorBufferWithTime.this.getHighSpeedVideoFpsRangesFor);
            return exactSubscriber;
        }
        final rx.internal.operators.OperatorBufferWithTime.InexactSubscriber inexactSubscriber = new rx.internal.operators.OperatorBufferWithTime.InexactSubscriber(serializedSubscriber, createWorker);
        inexactSubscriber.add(createWorker);
        subscriber.add(inexactSubscriber);
        inexactSubscriber.getHighSpeedVideoFpsRanges();
        inexactSubscriber.Camera2StreamConfigurationMap.schedulePeriodically(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorBufferWithTime.InexactSubscriber.1
            @Override // rx.functions.Action0
            public void call() {
                rx.internal.operators.OperatorBufferWithTime.InexactSubscriber.this.getHighSpeedVideoFpsRanges();
            }
        }, rx.internal.operators.OperatorBufferWithTime.this.Camera2StreamConfigurationMap, rx.internal.operators.OperatorBufferWithTime.this.Camera2StreamConfigurationMap, rx.internal.operators.OperatorBufferWithTime.this.getHighSpeedVideoFpsRangesFor);
        return inexactSubscriber;
    }

    final class InexactSubscriber extends rx.Subscriber<T> {
        final rx.Scheduler.Worker Camera2StreamConfigurationMap;
        final java.util.List<java.util.List<T>> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedList();
        boolean getHighSpeedVideoFpsRanges;
        final rx.Subscriber<? super java.util.List<T>> getHighSpeedVideoFpsRangesFor;

        public InexactSubscriber(rx.Subscriber<? super java.util.List<T>> subscriber, rx.Scheduler.Worker worker) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.Camera2StreamConfigurationMap = worker;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                java.util.Iterator<java.util.List<T>> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                java.util.LinkedList linkedList = null;
                while (it.hasNext()) {
                    java.util.List<T> next = it.next();
                    next.add(t);
                    if (next.size() == rx.internal.operators.OperatorBufferWithTime.this.getHighResolutionOutputSizeshNQ4ISI) {
                        it.remove();
                        if (linkedList == null) {
                            linkedList = new java.util.LinkedList();
                        }
                        linkedList.add(next);
                    }
                }
                if (linkedList != null) {
                    java.util.Iterator it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        this.getHighSpeedVideoFpsRangesFor.onNext((java.util.List) it2.next());
                    }
                }
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighResolutionOutputSizeshNQ4ISI.clear();
                this.getHighSpeedVideoFpsRangesFor.onError(th);
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            try {
                synchronized (this) {
                    if (this.getHighSpeedVideoFpsRanges) {
                        return;
                    }
                    this.getHighSpeedVideoFpsRanges = true;
                    java.util.LinkedList linkedList = new java.util.LinkedList(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighResolutionOutputSizeshNQ4ISI.clear();
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        this.getHighSpeedVideoFpsRangesFor.onNext((java.util.List) it.next());
                    }
                    this.getHighSpeedVideoFpsRangesFor.onCompleted();
                    unsubscribe();
                }
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, this.getHighSpeedVideoFpsRangesFor);
            }
        }

        final void getHighSpeedVideoFpsRanges() {
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.add(arrayList);
                this.Camera2StreamConfigurationMap.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorBufferWithTime.InexactSubscriber.2
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
                    
                        r2.remove();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
                    
                        r2 = true;
                     */
                    @Override // rx.functions.Action0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void call() {
                        boolean z;
                        rx.internal.operators.OperatorBufferWithTime.InexactSubscriber inexactSubscriber = rx.internal.operators.OperatorBufferWithTime.InexactSubscriber.this;
                        java.util.List<T> list = arrayList;
                        synchronized (inexactSubscriber) {
                            if (inexactSubscriber.getHighSpeedVideoFpsRanges) {
                                return;
                            }
                            java.util.Iterator<java.util.List<T>> it = inexactSubscriber.getHighResolutionOutputSizeshNQ4ISI.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                } else if (it.next() == list) {
                                    break;
                                }
                            }
                            if (z) {
                                try {
                                    inexactSubscriber.getHighSpeedVideoFpsRangesFor.onNext(list);
                                } catch (java.lang.Throwable th) {
                                    rx.exceptions.Exceptions.throwOrReport(th, inexactSubscriber);
                                }
                            }
                        }
                    }
                }, rx.internal.operators.OperatorBufferWithTime.this.getHighSpeedVideoFpsRanges, rx.internal.operators.OperatorBufferWithTime.this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }

    final class ExactSubscriber extends rx.Subscriber<T> {
        final rx.Subscriber<? super java.util.List<T>> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final rx.Scheduler.Worker getHighSpeedVideoFpsRanges;
        java.util.List<T> getHighSpeedVideoSizes = new java.util.ArrayList();

        public ExactSubscriber(rx.Subscriber<? super java.util.List<T>> subscriber, rx.Scheduler.Worker worker) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoFpsRanges = worker;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            java.util.List<T> list;
            synchronized (this) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                this.getHighSpeedVideoSizes.add(t);
                if (this.getHighSpeedVideoSizes.size() == rx.internal.operators.OperatorBufferWithTime.this.getHighResolutionOutputSizeshNQ4ISI) {
                    list = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = new java.util.ArrayList();
                } else {
                    list = null;
                }
                if (list != null) {
                    this.Camera2StreamConfigurationMap.onNext(list);
                }
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            synchronized (this) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizes = null;
                this.Camera2StreamConfigurationMap.onError(th);
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            try {
                this.getHighSpeedVideoFpsRanges.unsubscribe();
                synchronized (this) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    java.util.List<T> list = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = null;
                    this.Camera2StreamConfigurationMap.onNext(list);
                    this.Camera2StreamConfigurationMap.onCompleted();
                    unsubscribe();
                }
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, this.Camera2StreamConfigurationMap);
            }
        }
    }
}
