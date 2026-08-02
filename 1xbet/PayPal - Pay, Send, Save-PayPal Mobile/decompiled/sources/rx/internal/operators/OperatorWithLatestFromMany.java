package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorWithLatestFromMany<T, R> implements rx.Observable.OnSubscribe<R> {
    final rx.Observable<?>[] Camera2StreamConfigurationMap;
    final rx.Observable<T> getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.Iterable<rx.Observable<?>> getHighSpeedVideoFpsRangesFor;
    final rx.functions.FuncN<R> getHighSpeedVideoSizes;

    public OperatorWithLatestFromMany(rx.Observable<T> observable, rx.Observable<?>[] observableArr, java.lang.Iterable<rx.Observable<?>> iterable, rx.functions.FuncN<R> funcN) {
        this.getHighResolutionOutputSizeshNQ4ISI = observable;
        this.Camera2StreamConfigurationMap = observableArr;
        this.getHighSpeedVideoFpsRangesFor = iterable;
        this.getHighSpeedVideoSizes = funcN;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super R> subscriber) {
        int i;
        rx.observers.SerializedSubscriber serializedSubscriber = new rx.observers.SerializedSubscriber(subscriber);
        rx.Observable<?>[] observableArr = this.Camera2StreamConfigurationMap;
        int i2 = 0;
        if (observableArr != null) {
            i = observableArr.length;
        } else {
            observableArr = new rx.Observable[8];
            int i3 = 0;
            for (rx.Observable<?> observable : this.getHighSpeedVideoFpsRangesFor) {
                if (i3 == observableArr.length) {
                    observableArr = (rx.Observable[]) java.util.Arrays.copyOf(observableArr, (i3 >> 2) + i3);
                }
                observableArr[i3] = observable;
                i3++;
            }
            i = i3;
        }
        rx.internal.operators.OperatorWithLatestFromMany.WithLatestMainSubscriber withLatestMainSubscriber = new rx.internal.operators.OperatorWithLatestFromMany.WithLatestMainSubscriber(subscriber, this.getHighSpeedVideoSizes, i);
        serializedSubscriber.add(withLatestMainSubscriber);
        while (i2 < i) {
            if (serializedSubscriber.isUnsubscribed()) {
                return;
            }
            int i4 = i2 + 1;
            rx.internal.operators.OperatorWithLatestFromMany.WithLatestOtherSubscriber withLatestOtherSubscriber = new rx.internal.operators.OperatorWithLatestFromMany.WithLatestOtherSubscriber(withLatestMainSubscriber, i4);
            withLatestMainSubscriber.add(withLatestOtherSubscriber);
            observableArr[i2].unsafeSubscribe(withLatestOtherSubscriber);
            i2 = i4;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.unsafeSubscribe(withLatestMainSubscriber);
    }

    static final class WithLatestMainSubscriber<T, R> extends rx.Subscriber<T> {
        static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
        final rx.functions.FuncN<R> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final rx.Subscriber<? super R> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicInteger getOutputFormats;

        public WithLatestMainSubscriber(rx.Subscriber<? super R> subscriber, rx.functions.FuncN<R> funcN, int i) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = funcN;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = new java.util.concurrent.atomic.AtomicReferenceArray<>(i + 1);
            for (int i2 = 0; i2 <= i; i2++) {
                atomicReferenceArray.lazySet(i2, Camera2StreamConfigurationMap);
            }
            this.getHighSpeedVideoSizes = atomicReferenceArray;
            this.getOutputFormats = new java.util.concurrent.atomic.AtomicInteger(i);
            request(0L);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (this.getOutputFormats.get() == 0) {
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.getHighSpeedVideoSizes;
                int length = atomicReferenceArray.length();
                atomicReferenceArray.lazySet(0, t);
                java.lang.Object[] objArr = new java.lang.Object[atomicReferenceArray.length()];
                for (int i = 0; i < length; i++) {
                    objArr[i] = atomicReferenceArray.get(i);
                }
                try {
                    this.getHighSpeedVideoFpsRangesFor.onNext(this.getHighResolutionOutputSizeshNQ4ISI.call(objArr));
                    return;
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwIfFatal(th);
                    onError(th);
                    return;
                }
            }
            request(1L);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                rx.plugins.RxJavaHooks.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            unsubscribe();
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            unsubscribe();
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            super.setProducer(producer);
            this.getHighSpeedVideoFpsRangesFor.setProducer(producer);
        }
    }

    static final class WithLatestOtherSubscriber extends rx.Subscriber<java.lang.Object> {
        final int getHighSpeedVideoFpsRanges;
        final rx.internal.operators.OperatorWithLatestFromMany.WithLatestMainSubscriber<?, ?> getHighSpeedVideoFpsRangesFor;

        public WithLatestOtherSubscriber(rx.internal.operators.OperatorWithLatestFromMany.WithLatestMainSubscriber<?, ?> withLatestMainSubscriber, int i) {
            this.getHighSpeedVideoFpsRangesFor = withLatestMainSubscriber;
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // rx.Observer
        public final void onNext(java.lang.Object obj) {
            rx.internal.operators.OperatorWithLatestFromMany.WithLatestMainSubscriber<?, ?> withLatestMainSubscriber = this.getHighSpeedVideoFpsRangesFor;
            if (withLatestMainSubscriber.getHighSpeedVideoSizes.getAndSet(this.getHighSpeedVideoFpsRanges, obj) == rx.internal.operators.OperatorWithLatestFromMany.WithLatestMainSubscriber.Camera2StreamConfigurationMap) {
                withLatestMainSubscriber.getOutputFormats.decrementAndGet();
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            rx.internal.operators.OperatorWithLatestFromMany.WithLatestMainSubscriber<?, ?> withLatestMainSubscriber = this.getHighSpeedVideoFpsRangesFor;
            if (withLatestMainSubscriber.getHighSpeedVideoSizes.get(this.getHighSpeedVideoFpsRanges) == rx.internal.operators.OperatorWithLatestFromMany.WithLatestMainSubscriber.Camera2StreamConfigurationMap) {
                withLatestMainSubscriber.onCompleted();
            }
        }
    }
}
