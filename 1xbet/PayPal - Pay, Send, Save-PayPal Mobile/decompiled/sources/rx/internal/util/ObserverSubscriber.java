package rx.internal.util;

/* loaded from: classes18.dex */
public final class ObserverSubscriber<T> extends rx.Subscriber<T> {
    final rx.Observer<? super T> getHighSpeedVideoFpsRanges;

    public ObserverSubscriber(rx.Observer<? super T> observer) {
        this.getHighSpeedVideoFpsRanges = observer;
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        this.getHighSpeedVideoFpsRanges.onNext(t);
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRanges.onError(th);
    }

    @Override // rx.Observer
    public final void onCompleted() {
        this.getHighSpeedVideoFpsRanges.onCompleted();
    }
}
