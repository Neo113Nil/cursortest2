package rx.subjects;

/* loaded from: classes18.dex */
public abstract class Subject<T, R> extends rx.Observable<R> implements rx.Observer<T> {
    public abstract boolean hasObservers();

    public Subject(rx.Observable.OnSubscribe<R> onSubscribe) {
        super(onSubscribe);
    }

    public final rx.subjects.SerializedSubject<T, R> toSerialized() {
        if (getClass() == rx.subjects.SerializedSubject.class) {
            return (rx.subjects.SerializedSubject) this;
        }
        return new rx.subjects.SerializedSubject<>(this);
    }
}
