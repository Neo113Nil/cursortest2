package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0, 0, 1, 1, 1}, l = {120, 91}, m = "tryEnqueue", n = {"job", "$this$withLock_u24default$iv", "priority", "job", "$this$withLock_u24default$iv", "priority"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"}, v = 1)
/* loaded from: classes7.dex */
final class SingleRunner$Holder$tryEnqueue$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.paging.SingleRunner.Holder getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(0, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleRunner$Holder$tryEnqueue$1(androidx.paging.SingleRunner.Holder holder, kotlin.coroutines.Continuation<? super androidx.paging.SingleRunner$Holder$tryEnqueue$1> continuation) {
        super(continuation);
        this.getInputFormats = holder;
    }
}
