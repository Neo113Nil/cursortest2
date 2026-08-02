package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeOnAssemblyCompletable<T> implements rx.Completable.OnSubscribe {
    public static volatile boolean fullStackTrace;
    final java.lang.String Camera2StreamConfigurationMap = rx.internal.operators.OnSubscribeOnAssembly.Camera2StreamConfigurationMap();
    final rx.Completable.OnSubscribe getHighResolutionOutputSizeshNQ4ISI;

    public OnSubscribeOnAssemblyCompletable(rx.Completable.OnSubscribe onSubscribe) {
        this.getHighResolutionOutputSizeshNQ4ISI = onSubscribe;
    }

    @Override // rx.functions.Action1
    public final void call(rx.CompletableSubscriber completableSubscriber) {
        this.getHighResolutionOutputSizeshNQ4ISI.call(new rx.internal.operators.OnSubscribeOnAssemblyCompletable.OnAssemblyCompletableSubscriber(completableSubscriber, this.Camera2StreamConfigurationMap));
    }

    static final class OnAssemblyCompletableSubscriber implements rx.CompletableSubscriber {
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final rx.CompletableSubscriber getHighSpeedVideoFpsRangesFor;

        public OnAssemblyCompletableSubscriber(rx.CompletableSubscriber completableSubscriber, java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = completableSubscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        @Override // rx.CompletableSubscriber
        public final void onSubscribe(rx.Subscription subscription) {
            this.getHighSpeedVideoFpsRangesFor.onSubscribe(subscription);
        }

        @Override // rx.CompletableSubscriber
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
        }

        @Override // rx.CompletableSubscriber
        public final void onError(java.lang.Throwable th) {
            new rx.exceptions.AssemblyStackTraceException(this.getHighResolutionOutputSizeshNQ4ISI).attachTo(th);
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }
    }
}
