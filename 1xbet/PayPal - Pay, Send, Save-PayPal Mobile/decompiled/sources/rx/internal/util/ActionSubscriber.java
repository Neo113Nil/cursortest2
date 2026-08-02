package rx.internal.util;

/* loaded from: classes18.dex */
public final class ActionSubscriber<T> extends rx.Subscriber<T> {
    final rx.functions.Action0 getHighSpeedVideoFpsRanges;
    final rx.functions.Action1<java.lang.Throwable> getHighSpeedVideoFpsRangesFor;
    final rx.functions.Action1<? super T> getHighSpeedVideoSizes;

    public ActionSubscriber(rx.functions.Action1<? super T> action1, rx.functions.Action1<java.lang.Throwable> action12, rx.functions.Action0 action0) {
        this.getHighSpeedVideoSizes = action1;
        this.getHighSpeedVideoFpsRangesFor = action12;
        this.getHighSpeedVideoFpsRanges = action0;
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        this.getHighSpeedVideoSizes.call(t);
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRangesFor.call(th);
    }

    @Override // rx.Observer
    public final void onCompleted() {
        this.getHighSpeedVideoFpsRanges.call();
    }
}
