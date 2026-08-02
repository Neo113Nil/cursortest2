package rx.subjects;

/* loaded from: classes18.dex */
public class SerializedSubject<T, R> extends rx.subjects.Subject<T, R> {
    private final rx.observers.SerializedObserver<T> getHighResolutionOutputSizeshNQ4ISI;
    private final rx.subjects.Subject<T, R> getHighSpeedVideoFpsRanges;

    public SerializedSubject(final rx.subjects.Subject<T, R> subject) {
        super(new rx.Observable.OnSubscribe<R>() { // from class: rx.subjects.SerializedSubject.1
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Object obj) {
                rx.subjects.Subject.this.unsafeSubscribe((rx.Subscriber) obj);
            }
        });
        this.getHighSpeedVideoFpsRanges = subject;
        this.getHighResolutionOutputSizeshNQ4ISI = new rx.observers.SerializedObserver<>(subject);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
    }

    @Override // rx.Observer
    public void onError(java.lang.Throwable th) {
        this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.getHighSpeedVideoFpsRanges.hasObservers();
    }
}
