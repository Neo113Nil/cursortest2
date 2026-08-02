package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.MutexesKt", f = "Mutexes.kt", i = {0}, l = {98}, m = "acquireToken", n = {"$this$acquireToken"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class MutexesKt$acquireToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return androidx.camera.camera2.pipe.core.MutexesKt.acquireToken(null, this);
    }

    MutexesKt$acquireToken$1(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.MutexesKt$acquireToken$1> continuation) {
        super(continuation);
    }
}
