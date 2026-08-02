package kotlinx.coroutines.sync;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {121}, m = "withLock", n = {"$this$withLock", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "action"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class MutexKt$withLock$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return kotlinx.coroutines.sync.MutexKt.withLock(null, null, null, this);
    }

    MutexKt$withLock$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.sync.MutexKt$withLock$1> continuation) {
        super(continuation);
    }
}
