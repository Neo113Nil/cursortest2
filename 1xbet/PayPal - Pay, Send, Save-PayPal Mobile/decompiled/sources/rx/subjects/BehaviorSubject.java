package rx.subjects;

/* loaded from: classes18.dex */
public final class BehaviorSubject<T> extends rx.subjects.Subject<T, T> {
    private static final java.lang.Object[] Camera2StreamConfigurationMap = new java.lang.Object[0];
    private final rx.subjects.SubjectSubscriptionManager<T> getHighSpeedVideoFpsRanges;

    public static <T> rx.subjects.BehaviorSubject<T> create() {
        return Camera2StreamConfigurationMap(null, false);
    }

    public static <T> rx.subjects.BehaviorSubject<T> create(T t) {
        return Camera2StreamConfigurationMap(t, true);
    }

    private static <T> rx.subjects.BehaviorSubject<T> Camera2StreamConfigurationMap(T t, boolean z) {
        final rx.subjects.SubjectSubscriptionManager subjectSubscriptionManager = new rx.subjects.SubjectSubscriptionManager();
        if (z) {
            subjectSubscriptionManager.getHighSpeedVideoFpsRangesFor = rx.internal.operators.NotificationLite.next(t);
        }
        subjectSubscriptionManager.getHighResolutionOutputSizeshNQ4ISI = new rx.functions.Action1<rx.subjects.SubjectSubscriptionManager.SubjectObserver<T>>() { // from class: rx.subjects.BehaviorSubject.1
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                ((rx.subjects.SubjectSubscriptionManager.SubjectObserver) obj).getHighSpeedVideoFpsRangesFor(rx.subjects.SubjectSubscriptionManager.this.getHighSpeedVideoFpsRangesFor);
            }
        };
        subjectSubscriptionManager.Camera2StreamConfigurationMap = subjectSubscriptionManager.getHighResolutionOutputSizeshNQ4ISI;
        return new rx.subjects.BehaviorSubject<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    protected BehaviorSubject(rx.Observable.OnSubscribe<T> onSubscribe, rx.subjects.SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(onSubscribe);
        this.getHighSpeedVideoFpsRanges = subjectSubscriptionManager;
    }

    @Override // rx.Observer
    public final void onCompleted() {
        if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor == null || this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
            java.lang.Object completed = rx.internal.operators.NotificationLite.completed();
            for (rx.subjects.SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(completed)) {
                subjectObserver.Camera2StreamConfigurationMap(completed);
            }
        }
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor == null || this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
            java.lang.Object error = rx.internal.operators.NotificationLite.error(th);
            java.util.ArrayList arrayList = null;
            for (rx.subjects.SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(error)) {
                try {
                    subjectObserver.Camera2StreamConfigurationMap(error);
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
        if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor == null || this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
            java.lang.Object next = rx.internal.operators.NotificationLite.next(t);
            rx.subjects.SubjectSubscriptionManager<T> subjectSubscriptionManager = this.getHighSpeedVideoFpsRanges;
            subjectSubscriptionManager.getHighSpeedVideoFpsRangesFor = next;
            for (rx.subjects.SubjectSubscriptionManager.SubjectObserver subjectObserver : subjectSubscriptionManager.get().Camera2StreamConfigurationMap) {
                subjectObserver.Camera2StreamConfigurationMap(next);
            }
        }
    }

    @Override // rx.subjects.Subject
    public final boolean hasObservers() {
        return this.getHighSpeedVideoFpsRanges.get().Camera2StreamConfigurationMap.length > 0;
    }

    public final boolean hasValue() {
        return rx.internal.operators.NotificationLite.isNext(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean hasThrowable() {
        return rx.internal.operators.NotificationLite.isError(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean hasCompleted() {
        return rx.internal.operators.NotificationLite.isCompleted(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor);
    }

    public final T getValue() {
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        if (rx.internal.operators.NotificationLite.isNext(obj)) {
            return (T) rx.internal.operators.NotificationLite.getValue(obj);
        }
        return null;
    }

    public final java.lang.Throwable getThrowable() {
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        if (rx.internal.operators.NotificationLite.isError(obj)) {
            return rx.internal.operators.NotificationLite.getError(obj);
        }
        return null;
    }

    public final T[] getValues(T[] tArr) {
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        if (rx.internal.operators.NotificationLite.isNext(obj)) {
            if (tArr.length == 0) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), 1));
            }
            tArr[0] = rx.internal.operators.NotificationLite.getValue(obj);
            if (tArr.length > 1) {
                tArr[1] = null;
            }
            return tArr;
        }
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object[] getValues() {
        java.lang.Object[] objArr = Camera2StreamConfigurationMap;
        java.lang.Object[] values = getValues(objArr);
        return values == objArr ? new java.lang.Object[0] : values;
    }
}
