package kotlinx.coroutines.selects;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/selects/OnTimeout;", "", "", "p0", "<init>", "(J)V", "getHighSpeedVideoFpsRangesFor", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class OnTimeout {
    private final long getHighSpeedVideoFpsRangesFor;

    public OnTimeout(long j) {
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    public static final /* synthetic */ void Camera2StreamConfigurationMap(final kotlinx.coroutines.selects.OnTimeout onTimeout, final kotlinx.coroutines.selects.SelectInstance selectInstance, java.lang.Object obj) {
        if (onTimeout.getHighSpeedVideoFpsRangesFor <= 0) {
            selectInstance.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: kotlinx.coroutines.selects.OnTimeout$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                kotlinx.coroutines.selects.SelectInstance.this.trySelect(onTimeout, kotlin.Unit.INSTANCE);
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNull(selectInstance, "");
        kotlinx.coroutines.selects.SelectImplementation selectImplementation = (kotlinx.coroutines.selects.SelectImplementation) selectInstance;
        kotlin.coroutines.CoroutineContext getHighResolutionOutputSizeshNQ4ISI = selectImplementation.getGetHighResolutionOutputSizeshNQ4ISI();
        selectImplementation.disposeOnCompletion(kotlinx.coroutines.DelayKt.getDelay(getHighResolutionOutputSizeshNQ4ISI).invokeOnTimeout(onTimeout.getHighSpeedVideoFpsRangesFor, runnable, getHighResolutionOutputSizeshNQ4ISI));
    }
}
