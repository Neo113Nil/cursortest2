package rx;

/* loaded from: classes18.dex */
public interface Observer<T> {
    void onCompleted();

    void onError(java.lang.Throwable th);

    void onNext(T t);
}
