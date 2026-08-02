package rx.internal.operators;

/* loaded from: classes18.dex */
public class OperatorOnBackpressureDrop<T> implements rx.Observable.Operator<T, T> {
    final rx.functions.Action1<? super T> getHighSpeedVideoSizes;

    static final class Holder {
        static final rx.internal.operators.OperatorOnBackpressureDrop<java.lang.Object> Camera2StreamConfigurationMap = new rx.internal.operators.OperatorOnBackpressureDrop<>();

        Holder() {
        }
    }

    public static <T> rx.internal.operators.OperatorOnBackpressureDrop<T> instance() {
        return (rx.internal.operators.OperatorOnBackpressureDrop<T>) rx.internal.operators.OperatorOnBackpressureDrop.Holder.Camera2StreamConfigurationMap;
    }

    OperatorOnBackpressureDrop() {
        this(null);
    }

    public OperatorOnBackpressureDrop(rx.functions.Action1<? super T> action1) {
        this.getHighSpeedVideoSizes = action1;
    }

    @Override // rx.functions.Func1
    public rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        final java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorOnBackpressureDrop.1
            @Override // rx.Producer
            public void request(long j) {
                rx.internal.operators.BackpressureUtils.getAndAddRequest(atomicLong, j);
            }
        });
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorOnBackpressureDrop.2
            boolean getHighSpeedVideoFpsRangesFor;

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                if (!this.getHighSpeedVideoFpsRangesFor) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    subscriber.onError(th);
                } else {
                    rx.plugins.RxJavaHooks.onError(th);
                }
            }

            @Override // rx.Observer
            public void onNext(T t) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                if (atomicLong.get() > 0) {
                    subscriber.onNext(t);
                    atomicLong.decrementAndGet();
                } else if (rx.internal.operators.OperatorOnBackpressureDrop.this.getHighSpeedVideoSizes != null) {
                    try {
                        rx.internal.operators.OperatorOnBackpressureDrop.this.getHighSpeedVideoSizes.call(t);
                    } catch (java.lang.Throwable th) {
                        rx.exceptions.Exceptions.throwOrReport(th, this, t);
                    }
                }
            }
        };
    }
}
