package rx.internal.operators;

/* loaded from: classes18.dex */
public class OnSubscribeDoOnEach<T> implements rx.Observable.OnSubscribe<T> {
    private final rx.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
    private final rx.Observable<T> getHighSpeedVideoFpsRangesFor;

    public OnSubscribeDoOnEach(rx.Observable<T> observable, rx.Observer<? super T> observer) {
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.getHighResolutionOutputSizeshNQ4ISI = observer;
    }

    @Override // rx.functions.Action1
    public void call(rx.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(new rx.internal.operators.OnSubscribeDoOnEach.DoOnEachSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    static final class DoOnEachSubscriber<T> extends rx.Subscriber<T> {
        private final rx.Subscriber<? super T> Camera2StreamConfigurationMap;
        private boolean getHighSpeedVideoFpsRanges;
        private final rx.Observer<? super T> getHighSpeedVideoFpsRangesFor;

        DoOnEachSubscriber(rx.Subscriber<? super T> subscriber, rx.Observer<? super T> observer) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoFpsRangesFor = observer;
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor.onCompleted();
                this.getHighSpeedVideoFpsRanges = true;
                this.Camera2StreamConfigurationMap.onCompleted();
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, this);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                rx.plugins.RxJavaHooks.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            try {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
                this.Camera2StreamConfigurationMap.onError(th);
            } catch (java.lang.Throwable th2) {
                rx.exceptions.Exceptions.throwIfFatal(th2);
                this.Camera2StreamConfigurationMap.onError(new rx.exceptions.CompositeException(java.util.Arrays.asList(th, th2)));
            }
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor.onNext(t);
                this.Camera2StreamConfigurationMap.onNext(t);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, this, t);
            }
        }
    }
}
