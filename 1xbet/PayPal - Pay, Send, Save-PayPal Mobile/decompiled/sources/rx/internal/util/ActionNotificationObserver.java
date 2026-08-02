package rx.internal.util;

/* loaded from: classes18.dex */
public final class ActionNotificationObserver<T> implements rx.Observer<T> {
    final rx.functions.Action1<rx.Notification<? super T>> Camera2StreamConfigurationMap;

    public ActionNotificationObserver(rx.functions.Action1<rx.Notification<? super T>> action1) {
        this.Camera2StreamConfigurationMap = action1;
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        this.Camera2StreamConfigurationMap.call(rx.Notification.createOnNext(t));
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap.call(rx.Notification.createOnError(th));
    }

    @Override // rx.Observer
    public final void onCompleted() {
        this.Camera2StreamConfigurationMap.call(rx.Notification.createOnCompleted());
    }
}
