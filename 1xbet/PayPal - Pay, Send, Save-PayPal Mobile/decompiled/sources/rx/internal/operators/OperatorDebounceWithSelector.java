package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorDebounceWithSelector<T, U> implements rx.Observable.Operator<T, T> {
    final rx.functions.Func1<? super T, ? extends rx.Observable<U>> getHighSpeedVideoFpsRangesFor;

    public OperatorDebounceWithSelector(rx.functions.Func1<? super T, ? extends rx.Observable<U>> func1) {
        this.getHighSpeedVideoFpsRangesFor = func1;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        rx.observers.SerializedSubscriber serializedSubscriber = new rx.observers.SerializedSubscriber(subscriber);
        rx.subscriptions.SerialSubscription serialSubscription = new rx.subscriptions.SerialSubscription();
        subscriber.add(serialSubscription);
        return new rx.internal.operators.OperatorDebounceWithSelector.AnonymousClass1(subscriber, serializedSubscriber, serialSubscription);
    }

    /* renamed from: rx.internal.operators.OperatorDebounceWithSelector$1, reason: invalid class name */
    class AnonymousClass1 extends rx.Subscriber<T> {
        final rx.internal.operators.OperatorDebounceWithTime.DebounceState<T> Camera2StreamConfigurationMap;
        final /* synthetic */ rx.subscriptions.SerialSubscription getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ rx.observers.SerializedSubscriber getHighSpeedVideoFpsRangesFor;
        final rx.Subscriber<?> getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(rx.Subscriber subscriber, rx.observers.SerializedSubscriber serializedSubscriber, rx.subscriptions.SerialSubscription serialSubscription) {
            super(subscriber);
            this.getHighSpeedVideoFpsRangesFor = serializedSubscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = serialSubscription;
            this.Camera2StreamConfigurationMap = new rx.internal.operators.OperatorDebounceWithTime.DebounceState<>();
            this.getHighSpeedVideoSizes = this;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                rx.Observable<U> call = rx.internal.operators.OperatorDebounceWithSelector.this.getHighSpeedVideoFpsRangesFor.call(t);
                final int Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(t);
                rx.Subscriber<U> subscriber = new rx.Subscriber<U>() { // from class: rx.internal.operators.OperatorDebounceWithSelector.1.1
                    @Override // rx.Observer
                    public void onNext(U u) {
                        onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(java.lang.Throwable th) {
                        rx.internal.operators.OperatorDebounceWithSelector.AnonymousClass1.this.getHighSpeedVideoSizes.onError(th);
                    }

                    @Override // rx.Observer
                    public void onCompleted() {
                        rx.internal.operators.OperatorDebounceWithSelector.AnonymousClass1.this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, rx.internal.operators.OperatorDebounceWithSelector.AnonymousClass1.this.getHighSpeedVideoFpsRangesFor, rx.internal.operators.OperatorDebounceWithSelector.AnonymousClass1.this.getHighSpeedVideoSizes);
                        unsubscribe();
                    }
                };
                this.getHighResolutionOutputSizeshNQ4ISI.set(subscriber);
                call.unsafeSubscribe(subscriber);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, this);
            }
        }

        @Override // rx.Observer
        public void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
            unsubscribe();
            rx.internal.operators.OperatorDebounceWithTime.DebounceState<T> debounceState = this.Camera2StreamConfigurationMap;
            synchronized (debounceState) {
                debounceState.getHighSpeedVideoFpsRangesFor++;
                debounceState.Camera2StreamConfigurationMap = null;
                debounceState.getHighSpeedVideoFpsRanges = false;
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this);
        }
    }
}
