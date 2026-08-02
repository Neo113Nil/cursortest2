package kotlinx.coroutines.sync;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {81}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class SemaphoreKt$withPermit$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return kotlinx.coroutines.sync.SemaphoreKt.withPermit(null, null, this);
    }

    SemaphoreKt$withPermit$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.sync.SemaphoreKt$withPermit$1> continuation) {
        super(continuation);
    }
}
