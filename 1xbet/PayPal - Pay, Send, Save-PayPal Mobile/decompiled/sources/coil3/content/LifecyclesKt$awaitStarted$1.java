package coil3.content;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.util.LifecyclesKt", f = "lifecycles.kt", i = {0, 0}, l = {42}, m = "awaitStarted", n = {"$this$awaitStarted", "observer"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class LifecyclesKt$awaitStarted$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return coil3.content.LifecyclesKt.awaitStarted(null, this);
    }

    LifecyclesKt$awaitStarted$1(kotlin.coroutines.Continuation<? super coil3.content.LifecyclesKt$awaitStarted$1> continuation) {
        super(continuation);
    }
}
