package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorDebounceWithTime<T> implements rx.Observable.Operator<T, T> {
    final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
    final rx.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRanges;

    public OperatorDebounceWithTime(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = timeUnit;
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        rx.Scheduler.Worker createWorker = this.getHighResolutionOutputSizeshNQ4ISI.createWorker();
        rx.observers.SerializedSubscriber serializedSubscriber = new rx.observers.SerializedSubscriber(subscriber);
        rx.subscriptions.SerialSubscription serialSubscription = new rx.subscriptions.SerialSubscription();
        serializedSubscriber.add(createWorker);
        serializedSubscriber.add(serialSubscription);
        return new rx.internal.operators.OperatorDebounceWithTime.AnonymousClass1(subscriber, serialSubscription, createWorker, serializedSubscriber);
    }

    /* renamed from: rx.internal.operators.OperatorDebounceWithTime$1, reason: invalid class name */
    class AnonymousClass1 extends rx.Subscriber<T> {
        final rx.Subscriber<?> Camera2StreamConfigurationMap;
        final /* synthetic */ rx.observers.SerializedSubscriber getHighSpeedVideoFpsRanges;
        final /* synthetic */ rx.subscriptions.SerialSubscription getHighSpeedVideoFpsRangesFor;
        final rx.internal.operators.OperatorDebounceWithTime.DebounceState<T> getHighSpeedVideoSizes;
        final /* synthetic */ rx.Scheduler.Worker getInputSizeshNQ4ISI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(rx.Subscriber subscriber, rx.subscriptions.SerialSubscription serialSubscription, rx.Scheduler.Worker worker, rx.observers.SerializedSubscriber serializedSubscriber) {
            super(subscriber);
            this.getHighSpeedVideoFpsRangesFor = serialSubscription;
            this.getInputSizeshNQ4ISI = worker;
            this.getHighSpeedVideoFpsRanges = serializedSubscriber;
            this.getHighSpeedVideoSizes = new rx.internal.operators.OperatorDebounceWithTime.DebounceState<>();
            this.Camera2StreamConfigurationMap = this;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            final int Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(t);
            this.getHighSpeedVideoFpsRangesFor.set(this.getInputSizeshNQ4ISI.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorDebounceWithTime.1.1
                @Override // rx.functions.Action0
                public void call() {
                    rx.internal.operators.OperatorDebounceWithTime.AnonymousClass1.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, rx.internal.operators.OperatorDebounceWithTime.AnonymousClass1.this.getHighSpeedVideoFpsRanges, rx.internal.operators.OperatorDebounceWithTime.AnonymousClass1.this.Camera2StreamConfigurationMap);
                }
            }, rx.internal.operators.OperatorDebounceWithTime.this.getHighSpeedVideoFpsRanges, rx.internal.operators.OperatorDebounceWithTime.this.Camera2StreamConfigurationMap));
        }

        @Override // rx.Observer
        public void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
            unsubscribe();
            rx.internal.operators.OperatorDebounceWithTime.DebounceState<T> debounceState = this.getHighSpeedVideoSizes;
            synchronized (debounceState) {
                debounceState.getHighSpeedVideoFpsRangesFor++;
                debounceState.Camera2StreamConfigurationMap = null;
                debounceState.getHighSpeedVideoFpsRanges = false;
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this);
        }
    }

    static final class DebounceState<T> {
        T Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        DebounceState() {
        }

        public final int Camera2StreamConfigurationMap(T t) {
            int i;
            synchronized (this) {
                this.Camera2StreamConfigurationMap = t;
                this.getHighSpeedVideoFpsRanges = true;
                i = this.getHighSpeedVideoFpsRangesFor + 1;
                this.getHighSpeedVideoFpsRangesFor = i;
            }
            return i;
        }

        public final void getHighSpeedVideoFpsRanges(int i, rx.Subscriber<T> subscriber, rx.Subscriber<?> subscriber2) {
            synchronized (this) {
                if (!this.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges && i == this.getHighSpeedVideoFpsRangesFor) {
                    T t = this.Camera2StreamConfigurationMap;
                    this.Camera2StreamConfigurationMap = null;
                    this.getHighSpeedVideoFpsRanges = false;
                    this.getHighSpeedVideoSizes = true;
                    try {
                        subscriber.onNext(t);
                        synchronized (this) {
                            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                                this.getHighSpeedVideoSizes = false;
                            } else {
                                subscriber.onCompleted();
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        rx.exceptions.Exceptions.throwOrReport(th, subscriber2, t);
                    }
                }
            }
        }

        public final void getHighSpeedVideoFpsRangesFor(rx.Subscriber<T> subscriber, rx.Subscriber<?> subscriber2) {
            synchronized (this) {
                if (this.getHighSpeedVideoSizes) {
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    return;
                }
                T t = this.Camera2StreamConfigurationMap;
                boolean z = this.getHighSpeedVideoFpsRanges;
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoFpsRanges = false;
                this.getHighSpeedVideoSizes = true;
                if (z) {
                    try {
                        subscriber.onNext(t);
                    } catch (java.lang.Throwable th) {
                        rx.exceptions.Exceptions.throwOrReport(th, subscriber2, t);
                        return;
                    }
                }
                subscriber.onCompleted();
            }
        }
    }
}
