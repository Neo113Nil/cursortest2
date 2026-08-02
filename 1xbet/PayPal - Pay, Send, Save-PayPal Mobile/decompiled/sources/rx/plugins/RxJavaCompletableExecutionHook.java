package rx.plugins;

/* loaded from: classes18.dex */
public abstract class RxJavaCompletableExecutionHook {
    @java.lang.Deprecated
    public rx.Completable.OnSubscribe onCreate(rx.Completable.OnSubscribe onSubscribe) {
        return onSubscribe;
    }

    @java.lang.Deprecated
    public rx.Completable.Operator onLift(rx.Completable.Operator operator) {
        return operator;
    }

    @java.lang.Deprecated
    public java.lang.Throwable onSubscribeError(java.lang.Throwable th) {
        return th;
    }

    @java.lang.Deprecated
    public rx.Completable.OnSubscribe onSubscribeStart(rx.Completable completable, rx.Completable.OnSubscribe onSubscribe) {
        return onSubscribe;
    }
}
