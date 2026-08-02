package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeDetach<T> implements rx.Observable.OnSubscribe<T> {
    final rx.Observable<T> getHighSpeedVideoFpsRangesFor;

    enum TerminatedProducer implements rx.Producer {
        INSTANCE;

        @Override // rx.Producer
        public final void request(long j) {
        }
    }

    public OnSubscribeDetach(rx.Observable<T> observable) {
        this.getHighSpeedVideoFpsRangesFor = observable;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OnSubscribeDetach.DetachSubscriber detachSubscriber = new rx.internal.operators.OnSubscribeDetach.DetachSubscriber(subscriber);
        rx.internal.operators.OnSubscribeDetach.DetachProducer detachProducer = new rx.internal.operators.OnSubscribeDetach.DetachProducer(detachSubscriber);
        subscriber.add(detachProducer);
        subscriber.setProducer(detachProducer);
        this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(detachSubscriber);
    }

    static final class DetachSubscriber<T> extends rx.Subscriber<T> {
        final java.util.concurrent.atomic.AtomicReference<rx.Producer> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<rx.Subscriber<? super T>> getHighSpeedVideoSizes;

        public DetachSubscriber(rx.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(subscriber);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            rx.Subscriber<? super T> subscriber = this.getHighSpeedVideoSizes.get();
            if (subscriber != null) {
                subscriber.onNext(t);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.lazySet(rx.internal.operators.OnSubscribeDetach.TerminatedProducer.INSTANCE);
            rx.Subscriber<? super T> andSet = this.getHighSpeedVideoSizes.getAndSet(null);
            if (andSet != null) {
                andSet.onError(th);
            } else {
                rx.plugins.RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighResolutionOutputSizeshNQ4ISI.lazySet(rx.internal.operators.OnSubscribeDetach.TerminatedProducer.INSTANCE);
            rx.Subscriber<? super T> andSet = this.getHighSpeedVideoSizes.getAndSet(null);
            if (andSet != null) {
                andSet.onCompleted();
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, null, producer)) {
                producer.request(this.getHighSpeedVideoFpsRanges.getAndSet(0L));
            } else if (this.getHighResolutionOutputSizeshNQ4ISI.get() != rx.internal.operators.OnSubscribeDetach.TerminatedProducer.INSTANCE) {
                throw new java.lang.IllegalStateException("Producer already set!");
            }
        }
    }

    static final class DetachProducer<T> implements rx.Producer, rx.Subscription {
        final rx.internal.operators.OnSubscribeDetach.DetachSubscriber<T> getHighSpeedVideoFpsRanges;

        public DetachProducer(rx.internal.operators.OnSubscribeDetach.DetachSubscriber<T> detachSubscriber) {
            this.getHighSpeedVideoFpsRanges = detachSubscriber;
        }

        @Override // rx.Producer
        public final void request(long j) {
            rx.internal.operators.OnSubscribeDetach.DetachSubscriber<T> detachSubscriber = this.getHighSpeedVideoFpsRanges;
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
            }
            rx.Producer producer = detachSubscriber.getHighResolutionOutputSizeshNQ4ISI.get();
            if (producer != null) {
                producer.request(j);
                return;
            }
            rx.internal.operators.BackpressureUtils.getAndAddRequest(detachSubscriber.getHighSpeedVideoFpsRanges, j);
            rx.Producer producer2 = detachSubscriber.getHighResolutionOutputSizeshNQ4ISI.get();
            if (producer2 == null || producer2 == rx.internal.operators.OnSubscribeDetach.TerminatedProducer.INSTANCE) {
                return;
            }
            producer2.request(detachSubscriber.getHighSpeedVideoFpsRanges.getAndSet(0L));
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoFpsRanges.isUnsubscribed();
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            rx.internal.operators.OnSubscribeDetach.DetachSubscriber<T> detachSubscriber = this.getHighSpeedVideoFpsRanges;
            detachSubscriber.getHighResolutionOutputSizeshNQ4ISI.lazySet(rx.internal.operators.OnSubscribeDetach.TerminatedProducer.INSTANCE);
            detachSubscriber.getHighSpeedVideoSizes.lazySet(null);
            detachSubscriber.unsubscribe();
        }
    }
}
