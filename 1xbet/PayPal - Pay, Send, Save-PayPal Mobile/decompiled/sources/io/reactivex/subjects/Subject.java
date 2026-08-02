package io.reactivex.subjects;

/* loaded from: classes17.dex */
public abstract class Subject<T> extends io.reactivex.Observable<T> implements io.reactivex.Observer<T> {
    public abstract java.lang.Throwable getThrowable();

    public abstract boolean hasComplete();

    public abstract boolean hasObservers();

    public abstract boolean hasThrowable();

    public final io.reactivex.subjects.Subject<T> toSerialized() {
        return this instanceof io.reactivex.subjects.SerializedSubject ? this : new io.reactivex.subjects.SerializedSubject(this);
    }
}
