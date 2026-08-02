package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeOnAssemblySingle<T> implements rx.Single.OnSubscribe<T> {
    public static volatile boolean fullStackTrace;
    final java.lang.String Camera2StreamConfigurationMap = rx.internal.operators.OnSubscribeOnAssembly.Camera2StreamConfigurationMap();
    final rx.Single.OnSubscribe<T> getHighSpeedVideoSizes;

    public OnSubscribeOnAssemblySingle(rx.Single.OnSubscribe<T> onSubscribe) {
        this.getHighSpeedVideoSizes = onSubscribe;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        this.getHighSpeedVideoSizes.call(new rx.internal.operators.OnSubscribeOnAssemblySingle.OnAssemblySingleSubscriber(singleSubscriber, this.Camera2StreamConfigurationMap));
    }

    static final class OnAssemblySingleSubscriber<T> extends rx.SingleSubscriber<T> {
        final java.lang.String getHighSpeedVideoFpsRanges;
        final rx.SingleSubscriber<? super T> getHighSpeedVideoFpsRangesFor;

        public OnAssemblySingleSubscriber(rx.SingleSubscriber<? super T> singleSubscriber, java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = singleSubscriber;
            this.getHighSpeedVideoFpsRanges = str;
            singleSubscriber.add(this);
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            new rx.exceptions.AssemblyStackTraceException(this.getHighSpeedVideoFpsRanges).attachTo(th);
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
        }
    }
}
