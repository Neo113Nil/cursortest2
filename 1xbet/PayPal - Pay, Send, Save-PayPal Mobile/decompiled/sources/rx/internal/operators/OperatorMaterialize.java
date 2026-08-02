package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorMaterialize<T> implements rx.Observable.Operator<rx.Notification<T>, T> {

    static final class Holder {
        static final rx.internal.operators.OperatorMaterialize<java.lang.Object> getHighSpeedVideoFpsRangesFor = new rx.internal.operators.OperatorMaterialize<>();

        Holder() {
        }
    }

    public static <T> rx.internal.operators.OperatorMaterialize<T> instance() {
        return (rx.internal.operators.OperatorMaterialize<T>) rx.internal.operators.OperatorMaterialize.Holder.getHighSpeedVideoFpsRangesFor;
    }

    OperatorMaterialize() {
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super rx.Notification<T>> subscriber) {
        final rx.internal.operators.OperatorMaterialize.ParentSubscriber parentSubscriber = new rx.internal.operators.OperatorMaterialize.ParentSubscriber(subscriber);
        subscriber.add(parentSubscriber);
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorMaterialize.1
            @Override // rx.Producer
            public void request(long j) {
                if (j > 0) {
                    rx.internal.operators.OperatorMaterialize.ParentSubscriber parentSubscriber2 = parentSubscriber;
                    rx.internal.operators.BackpressureUtils.getAndAddRequest(parentSubscriber2.getHighSpeedVideoSizes, j);
                    parentSubscriber2.request(j);
                    parentSubscriber2.getHighSpeedVideoSizes();
                }
            }
        });
        return parentSubscriber;
    }

    static class ParentSubscriber<T> extends rx.Subscriber<T> {
        private boolean Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private volatile rx.Notification<T> getHighSpeedVideoFpsRanges;
        private final rx.Subscriber<? super rx.Notification<T>> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicLong();

        ParentSubscriber(rx.Subscriber<? super rx.Notification<T>> subscriber) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(0L);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.getHighSpeedVideoFpsRanges = rx.Notification.createOnCompleted();
            getHighSpeedVideoSizes();
        }

        @Override // rx.Observer
        public void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = rx.Notification.createOnError(th);
            rx.plugins.RxJavaHooks.onError(th);
            getHighSpeedVideoSizes();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long j;
            this.getHighSpeedVideoFpsRangesFor.onNext(rx.Notification.createOnNext(t));
            java.util.concurrent.atomic.AtomicLong atomicLong = this.getHighSpeedVideoSizes;
            do {
                j = atomicLong.get();
                if (j == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j - 1));
        }

        final void getHighSpeedVideoSizes() {
            synchronized (this) {
                if (this.Camera2StreamConfigurationMap) {
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                java.util.concurrent.atomic.AtomicLong atomicLong = this.getHighSpeedVideoSizes;
                while (!this.getHighSpeedVideoFpsRangesFor.isUnsubscribed()) {
                    rx.Notification<T> notification = this.getHighSpeedVideoFpsRanges;
                    if (notification != null && atomicLong.get() > 0) {
                        this.getHighSpeedVideoFpsRanges = null;
                        this.getHighSpeedVideoFpsRangesFor.onNext(notification);
                        if (this.getHighSpeedVideoFpsRangesFor.isUnsubscribed()) {
                            return;
                        }
                        this.getHighSpeedVideoFpsRangesFor.onCompleted();
                        return;
                    }
                    synchronized (this) {
                        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                            this.Camera2StreamConfigurationMap = false;
                            return;
                        }
                    }
                }
            }
        }
    }
}
