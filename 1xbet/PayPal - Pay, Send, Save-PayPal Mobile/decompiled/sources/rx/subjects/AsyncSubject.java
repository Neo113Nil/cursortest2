package rx.subjects;

/* loaded from: classes18.dex */
public final class AsyncSubject<T> extends rx.subjects.Subject<T, T> {
    volatile java.lang.Object Camera2StreamConfigurationMap;
    final rx.subjects.SubjectSubscriptionManager<T> getHighResolutionOutputSizeshNQ4ISI;

    public static <T> rx.subjects.AsyncSubject<T> create() {
        final rx.subjects.SubjectSubscriptionManager subjectSubscriptionManager = new rx.subjects.SubjectSubscriptionManager();
        subjectSubscriptionManager.Camera2StreamConfigurationMap = new rx.functions.Action1<rx.subjects.SubjectSubscriptionManager.SubjectObserver<T>>() { // from class: rx.subjects.AsyncSubject.1
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                rx.subjects.SubjectSubscriptionManager.SubjectObserver subjectObserver = (rx.subjects.SubjectSubscriptionManager.SubjectObserver) obj;
                java.lang.Object obj2 = rx.subjects.SubjectSubscriptionManager.this.getHighSpeedVideoFpsRangesFor;
                if (obj2 == null || rx.internal.operators.NotificationLite.isCompleted(obj2)) {
                    subjectObserver.onCompleted();
                } else if (rx.internal.operators.NotificationLite.isError(obj2)) {
                    subjectObserver.onError(rx.internal.operators.NotificationLite.getError(obj2));
                } else {
                    subjectObserver.getHighSpeedVideoFpsRanges.setProducer(new rx.internal.producers.SingleProducer(subjectObserver.getHighSpeedVideoFpsRanges, rx.internal.operators.NotificationLite.getValue(obj2)));
                }
            }
        };
        return new rx.subjects.AsyncSubject<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    protected AsyncSubject(rx.Observable.OnSubscribe<T> onSubscribe, rx.subjects.SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(onSubscribe);
        this.getHighResolutionOutputSizeshNQ4ISI = subjectSubscriptionManager;
    }

    @Override // rx.Observer
    public final void onCompleted() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes) {
            java.lang.Object obj = this.Camera2StreamConfigurationMap;
            if (obj == null) {
                obj = rx.internal.operators.NotificationLite.completed();
            }
            for (rx.subjects.SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(obj)) {
                if (obj == rx.internal.operators.NotificationLite.completed()) {
                    subjectObserver.onCompleted();
                } else {
                    subjectObserver.getHighSpeedVideoFpsRanges.setProducer(new rx.internal.producers.SingleProducer(subjectObserver.getHighSpeedVideoFpsRanges, rx.internal.operators.NotificationLite.getValue(obj)));
                }
            }
        }
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes) {
            java.util.ArrayList arrayList = null;
            for (rx.subjects.SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(rx.internal.operators.NotificationLite.error(th))) {
                try {
                    subjectObserver.onError(th);
                } catch (java.lang.Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            rx.exceptions.Exceptions.throwIfAny(arrayList);
        }
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        this.Camera2StreamConfigurationMap = rx.internal.operators.NotificationLite.next(t);
    }

    @Override // rx.subjects.Subject
    public final boolean hasObservers() {
        return this.getHighResolutionOutputSizeshNQ4ISI.get().Camera2StreamConfigurationMap.length > 0;
    }

    public final boolean hasValue() {
        return !rx.internal.operators.NotificationLite.isError(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor) && rx.internal.operators.NotificationLite.isNext(this.Camera2StreamConfigurationMap);
    }

    public final boolean hasThrowable() {
        return rx.internal.operators.NotificationLite.isError(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean hasCompleted() {
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        return (obj == null || rx.internal.operators.NotificationLite.isError(obj)) ? false : true;
    }

    public final T getValue() {
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        if (rx.internal.operators.NotificationLite.isError(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor) || !rx.internal.operators.NotificationLite.isNext(obj)) {
            return null;
        }
        return (T) rx.internal.operators.NotificationLite.getValue(obj);
    }

    public final java.lang.Throwable getThrowable() {
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        if (rx.internal.operators.NotificationLite.isError(obj)) {
            return rx.internal.operators.NotificationLite.getError(obj);
        }
        return null;
    }
}
