package rx.subjects;

/* loaded from: classes18.dex */
public final class TestSubject<T> extends rx.subjects.Subject<T, T> {
    final rx.subjects.SubjectSubscriptionManager<T> Camera2StreamConfigurationMap;
    private final rx.Scheduler.Worker getHighSpeedVideoFpsRanges;

    public static <T> rx.subjects.TestSubject<T> create(rx.schedulers.TestScheduler testScheduler) {
        final rx.subjects.SubjectSubscriptionManager subjectSubscriptionManager = new rx.subjects.SubjectSubscriptionManager();
        subjectSubscriptionManager.getHighResolutionOutputSizeshNQ4ISI = new rx.functions.Action1<rx.subjects.SubjectSubscriptionManager.SubjectObserver<T>>() { // from class: rx.subjects.TestSubject.1
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                ((rx.subjects.SubjectSubscriptionManager.SubjectObserver) obj).getHighSpeedVideoFpsRangesFor(rx.subjects.SubjectSubscriptionManager.this.getHighSpeedVideoFpsRangesFor);
            }
        };
        subjectSubscriptionManager.Camera2StreamConfigurationMap = subjectSubscriptionManager.getHighResolutionOutputSizeshNQ4ISI;
        return new rx.subjects.TestSubject<>(subjectSubscriptionManager, subjectSubscriptionManager, testScheduler);
    }

    protected TestSubject(rx.Observable.OnSubscribe<T> onSubscribe, rx.subjects.SubjectSubscriptionManager<T> subjectSubscriptionManager, rx.schedulers.TestScheduler testScheduler) {
        super(onSubscribe);
        this.Camera2StreamConfigurationMap = subjectSubscriptionManager;
        this.getHighSpeedVideoFpsRanges = testScheduler.createWorker();
    }

    @Override // rx.Observer
    public final void onCompleted() {
        onCompleted(0L);
    }

    public final void onCompleted(long j) {
        this.getHighSpeedVideoFpsRanges.schedule(new rx.functions.Action0() { // from class: rx.subjects.TestSubject.2
            @Override // rx.functions.Action0
            public void call() {
                rx.subjects.TestSubject testSubject = rx.subjects.TestSubject.this;
                if (testSubject.Camera2StreamConfigurationMap.getHighSpeedVideoSizes) {
                    for (rx.subjects.SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : testSubject.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(rx.internal.operators.NotificationLite.completed())) {
                        subjectObserver.onCompleted();
                    }
                }
            }
        }, j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        onError(th, 0L);
    }

    public final void onError(final java.lang.Throwable th, long j) {
        this.getHighSpeedVideoFpsRanges.schedule(new rx.functions.Action0() { // from class: rx.subjects.TestSubject.3
            @Override // rx.functions.Action0
            public void call() {
                rx.subjects.TestSubject testSubject = rx.subjects.TestSubject.this;
                java.lang.Throwable th2 = th;
                if (testSubject.Camera2StreamConfigurationMap.getHighSpeedVideoSizes) {
                    for (rx.subjects.SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : testSubject.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(rx.internal.operators.NotificationLite.error(th2))) {
                        subjectObserver.onError(th2);
                    }
                }
            }
        }, j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        onNext(t, 0L);
    }

    public final void onNext(final T t, long j) {
        this.getHighSpeedVideoFpsRanges.schedule(new rx.functions.Action0() { // from class: rx.subjects.TestSubject.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.functions.Action0
            public void call() {
                rx.subjects.TestSubject testSubject = rx.subjects.TestSubject.this;
                java.lang.Object obj = t;
                for (rx.internal.operators.BlockingOperatorToFuture.AnonymousClass1 anonymousClass1 : testSubject.Camera2StreamConfigurationMap.get().Camera2StreamConfigurationMap) {
                    anonymousClass1.onNext(obj);
                }
            }
        }, j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // rx.subjects.Subject
    public final boolean hasObservers() {
        return this.Camera2StreamConfigurationMap.get().Camera2StreamConfigurationMap.length > 0;
    }
}
