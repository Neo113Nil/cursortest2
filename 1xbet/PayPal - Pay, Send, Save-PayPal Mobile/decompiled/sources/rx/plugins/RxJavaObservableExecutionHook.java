package rx.plugins;

/* loaded from: classes18.dex */
public abstract class RxJavaObservableExecutionHook {
    @java.lang.Deprecated
    public <T> rx.Observable.OnSubscribe<T> onCreate(rx.Observable.OnSubscribe<T> onSubscribe) {
        return onSubscribe;
    }

    @java.lang.Deprecated
    public <T, R> rx.Observable.Operator<? extends R, ? super T> onLift(rx.Observable.Operator<? extends R, ? super T> operator) {
        return operator;
    }

    @java.lang.Deprecated
    public <T> java.lang.Throwable onSubscribeError(java.lang.Throwable th) {
        return th;
    }

    @java.lang.Deprecated
    public <T> rx.Subscription onSubscribeReturn(rx.Subscription subscription) {
        return subscription;
    }

    @java.lang.Deprecated
    public <T> rx.Observable.OnSubscribe<T> onSubscribeStart(rx.Observable<? extends T> observable, rx.Observable.OnSubscribe<T> onSubscribe) {
        return onSubscribe;
    }
}
