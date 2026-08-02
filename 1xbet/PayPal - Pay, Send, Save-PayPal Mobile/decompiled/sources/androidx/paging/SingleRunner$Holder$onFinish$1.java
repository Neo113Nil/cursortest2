package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0}, l = {120}, m = "onFinish", n = {"job", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class SingleRunner$Holder$onFinish$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.paging.SingleRunner.Holder Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleRunner$Holder$onFinish$1(androidx.paging.SingleRunner.Holder holder, kotlin.coroutines.Continuation<? super androidx.paging.SingleRunner$Holder$onFinish$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = holder;
    }
}
