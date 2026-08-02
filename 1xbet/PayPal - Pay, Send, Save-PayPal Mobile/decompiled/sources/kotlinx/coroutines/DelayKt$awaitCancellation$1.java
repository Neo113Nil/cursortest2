package kotlinx.coroutines;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {160}, m = "awaitCancellation", n = {}, s = {})
/* loaded from: classes5.dex */
final class DelayKt$awaitCancellation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return kotlinx.coroutines.DelayKt.awaitCancellation(this);
    }

    DelayKt$awaitCancellation$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.DelayKt$awaitCancellation$1> continuation) {
        super(continuation);
    }
}
