package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CompletableOnSubscribeConcatArray implements rx.Completable.OnSubscribe {
    final rx.Completable[] getHighSpeedVideoSizes;

    public CompletableOnSubscribeConcatArray(rx.Completable[] completableArr) {
        this.getHighSpeedVideoSizes = completableArr;
    }

    @Override // rx.functions.Action1
    public final void call(rx.CompletableSubscriber completableSubscriber) {
        rx.internal.operators.CompletableOnSubscribeConcatArray.ConcatInnerSubscriber concatInnerSubscriber = new rx.internal.operators.CompletableOnSubscribeConcatArray.ConcatInnerSubscriber(completableSubscriber, this.getHighSpeedVideoSizes);
        completableSubscriber.onSubscribe(concatInnerSubscriber.getHighSpeedVideoSizes);
        concatInnerSubscriber.getHighSpeedVideoSizes();
    }

    static final class ConcatInnerSubscriber extends java.util.concurrent.atomic.AtomicInteger implements rx.CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        int Camera2StreamConfigurationMap;
        final rx.CompletableSubscriber getHighResolutionOutputSizeshNQ4ISI;
        final rx.Completable[] getHighSpeedVideoFpsRanges;
        final rx.internal.subscriptions.SequentialSubscription getHighSpeedVideoSizes = new rx.internal.subscriptions.SequentialSubscription();

        public ConcatInnerSubscriber(rx.CompletableSubscriber completableSubscriber, rx.Completable[] completableArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = completableSubscriber;
            this.getHighSpeedVideoFpsRanges = completableArr;
        }

        @Override // rx.CompletableSubscriber
        public final void onSubscribe(rx.Subscription subscription) {
            this.getHighSpeedVideoSizes.replace(subscription);
        }

        @Override // rx.CompletableSubscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // rx.CompletableSubscriber
        public final void onCompleted() {
            getHighSpeedVideoSizes();
        }

        final void getHighSpeedVideoSizes() {
            if (this.getHighSpeedVideoSizes.isUnsubscribed() || getAndIncrement() != 0) {
                return;
            }
            rx.Completable[] completableArr = this.getHighSpeedVideoFpsRanges;
            while (!this.getHighSpeedVideoSizes.isUnsubscribed()) {
                int i = this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = i + 1;
                if (i == completableArr.length) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
                    return;
                } else {
                    completableArr[i].unsafeSubscribe(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }
}
