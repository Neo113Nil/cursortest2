package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface Observable<T> {

    public interface Observer<T> {
        void onError(java.lang.Throwable th);

        void onNewData(T t);
    }

    void addObserver(java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<? super T> observer);

    com.google.common.util.concurrent.ListenableFuture<T> fetchData();

    void removeObserver(androidx.camera.core.impl.Observable.Observer<? super T> observer);
}
