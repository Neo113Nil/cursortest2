package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.MutexesKt", f = "Mutexes.kt", i = {0}, l = {107}, m = "acquireTokenAndSuspend", n = {"$this$acquireTokenAndSuspend"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class MutexesKt$acquireTokenAndSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return androidx.camera.camera2.pipe.core.MutexesKt.acquireTokenAndSuspend(null, this);
    }

    MutexesKt$acquireTokenAndSuspend$1(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.MutexesKt$acquireTokenAndSuspend$1> continuation) {
        super(continuation);
    }
}
