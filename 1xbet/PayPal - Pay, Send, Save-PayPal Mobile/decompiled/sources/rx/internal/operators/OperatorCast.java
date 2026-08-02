package rx.internal.operators;

/* loaded from: classes18.dex */
public class OperatorCast<T, R> implements rx.Observable.Operator<R, T> {
    final java.lang.Class<R> getHighSpeedVideoSizes;

    public OperatorCast(java.lang.Class<R> cls) {
        this.getHighSpeedVideoSizes = cls;
    }

    @Override // rx.functions.Func1
    public rx.Subscriber<? super T> call(rx.Subscriber<? super R> subscriber) {
        rx.internal.operators.OperatorCast.CastSubscriber castSubscriber = new rx.internal.operators.OperatorCast.CastSubscriber(subscriber, this.getHighSpeedVideoSizes);
        subscriber.add(castSubscriber);
        return castSubscriber;
    }

    static final class CastSubscriber<T, R> extends rx.Subscriber<T> {
        final java.lang.Class<R> Camera2StreamConfigurationMap;
        final rx.Subscriber<? super R> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;

        public CastSubscriber(rx.Subscriber<? super R> subscriber, java.lang.Class<R> cls) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.Camera2StreamConfigurationMap = cls;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(this.Camera2StreamConfigurationMap.cast(t));
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                rx.plugins.RxJavaHooks.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.getHighResolutionOutputSizeshNQ4ISI.setProducer(producer);
        }
    }
}
