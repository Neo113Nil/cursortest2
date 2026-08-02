package rx.internal.util;

/* loaded from: classes18.dex */
public final class ActionObserver<T> implements rx.Observer<T> {
    final rx.functions.Action1<? super T> Camera2StreamConfigurationMap;
    final rx.functions.Action0 getHighSpeedVideoFpsRanges;
    final rx.functions.Action1<? super java.lang.Throwable> getHighSpeedVideoSizes;

    public ActionObserver(rx.functions.Action1<? super T> action1, rx.functions.Action1<? super java.lang.Throwable> action12, rx.functions.Action0 action0) {
        this.Camera2StreamConfigurationMap = action1;
        this.getHighSpeedVideoSizes = action12;
        this.getHighSpeedVideoFpsRanges = action0;
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        this.Camera2StreamConfigurationMap.call(t);
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoSizes.call(th);
    }

    @Override // rx.Observer
    public final void onCompleted() {
        this.getHighSpeedVideoFpsRanges.call();
    }
}
