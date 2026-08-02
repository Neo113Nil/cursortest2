package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorSingle<T> implements rx.Observable.Operator<T, T> {
    private final T getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;

    static final class Holder {
        static final rx.internal.operators.OperatorSingle<?> getHighSpeedVideoFpsRanges = new rx.internal.operators.OperatorSingle<>();

        Holder() {
        }
    }

    public static <T> rx.internal.operators.OperatorSingle<T> instance() {
        return (rx.internal.operators.OperatorSingle<T>) rx.internal.operators.OperatorSingle.Holder.getHighSpeedVideoFpsRanges;
    }

    OperatorSingle() {
        this(false, null);
    }

    public OperatorSingle(T t) {
        this(true, t);
    }

    private OperatorSingle(boolean z, T t) {
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges = t;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OperatorSingle.ParentSubscriber parentSubscriber = new rx.internal.operators.OperatorSingle.ParentSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        subscriber.add(parentSubscriber);
        return parentSubscriber;
    }

    static final class ParentSubscriber<T> extends rx.Subscriber<T> {
        private boolean Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        private final T getHighSpeedVideoFpsRangesFor;
        private final boolean getHighSpeedVideoSizes;
        private T getOutputMinFrameDuration;

        ParentSubscriber(rx.Subscriber<? super T> subscriber, boolean z, T t) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighSpeedVideoSizes = z;
            this.getHighSpeedVideoFpsRangesFor = t;
            request(2L);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoFpsRanges.onError(new java.lang.IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
            } else {
                this.getOutputMinFrameDuration = t;
                this.getHighResolutionOutputSizeshNQ4ISI = true;
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRanges.setProducer(new rx.internal.producers.SingleProducer(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration));
            } else if (this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRanges.setProducer(new rx.internal.producers.SingleProducer(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor));
            } else {
                this.getHighSpeedVideoFpsRanges.onError(new java.util.NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                rx.plugins.RxJavaHooks.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }
    }
}
