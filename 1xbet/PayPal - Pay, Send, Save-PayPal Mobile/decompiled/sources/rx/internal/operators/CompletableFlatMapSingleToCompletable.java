package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CompletableFlatMapSingleToCompletable<T> implements rx.Completable.OnSubscribe {
    final rx.Single<T> Camera2StreamConfigurationMap;
    final rx.functions.Func1<? super T, ? extends rx.Completable> getHighSpeedVideoFpsRanges;

    public CompletableFlatMapSingleToCompletable(rx.Single<T> single, rx.functions.Func1<? super T, ? extends rx.Completable> func1) {
        this.Camera2StreamConfigurationMap = single;
        this.getHighSpeedVideoFpsRanges = func1;
    }

    @Override // rx.functions.Action1
    public final void call(rx.CompletableSubscriber completableSubscriber) {
        rx.internal.operators.CompletableFlatMapSingleToCompletable.SourceSubscriber sourceSubscriber = new rx.internal.operators.CompletableFlatMapSingleToCompletable.SourceSubscriber(completableSubscriber, this.getHighSpeedVideoFpsRanges);
        completableSubscriber.onSubscribe(sourceSubscriber);
        this.Camera2StreamConfigurationMap.subscribe(sourceSubscriber);
    }

    static final class SourceSubscriber<T> extends rx.SingleSubscriber<T> implements rx.CompletableSubscriber {
        final rx.functions.Func1<? super T, ? extends rx.Completable> getHighSpeedVideoFpsRanges;
        final rx.CompletableSubscriber getHighSpeedVideoFpsRangesFor;

        public SourceSubscriber(rx.CompletableSubscriber completableSubscriber, rx.functions.Func1<? super T, ? extends rx.Completable> func1) {
            this.getHighSpeedVideoFpsRangesFor = completableSubscriber;
            this.getHighSpeedVideoFpsRanges = func1;
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            try {
                rx.Completable call = this.getHighSpeedVideoFpsRanges.call(t);
                if (call == null) {
                    onError(new java.lang.NullPointerException("The mapper returned a null Completable"));
                } else {
                    call.subscribe(this);
                }
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // rx.CompletableSubscriber
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
        }

        @Override // rx.CompletableSubscriber
        public final void onSubscribe(rx.Subscription subscription) {
            add(subscription);
        }
    }
}
