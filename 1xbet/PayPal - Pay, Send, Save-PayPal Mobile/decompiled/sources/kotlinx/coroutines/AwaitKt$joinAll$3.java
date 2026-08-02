package kotlinx.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {58}, m = "joinAll", n = {}, s = {})
/* loaded from: classes5.dex */
final class AwaitKt$joinAll$3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return kotlinx.coroutines.AwaitKt.joinAll((java.util.Collection<? extends kotlinx.coroutines.Job>) null, this);
    }

    AwaitKt$joinAll$3(kotlin.coroutines.Continuation<? super kotlinx.coroutines.AwaitKt$joinAll$3> continuation) {
        super(continuation);
    }
}
