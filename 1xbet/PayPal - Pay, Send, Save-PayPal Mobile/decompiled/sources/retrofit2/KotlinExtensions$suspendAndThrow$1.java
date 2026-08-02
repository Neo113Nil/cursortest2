package retrofit2;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {119}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class KotlinExtensions$suspendAndThrow$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return retrofit2.KotlinExtensions.suspendAndThrow(null, this);
    }

    KotlinExtensions$suspendAndThrow$1(kotlin.coroutines.Continuation<? super retrofit2.KotlinExtensions$suspendAndThrow$1> continuation) {
        super(continuation);
    }
}
