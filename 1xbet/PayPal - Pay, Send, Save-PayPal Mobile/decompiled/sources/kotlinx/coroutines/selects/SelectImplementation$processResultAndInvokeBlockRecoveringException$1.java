package kotlinx.coroutines.selects;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {729}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
/* loaded from: classes3.dex */
final class SelectImplementation$processResultAndInvokeBlockRecoveringException$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ kotlinx.coroutines.selects.SelectImplementation<R> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectImplementation$processResultAndInvokeBlockRecoveringException$1(kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation, kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = selectImplementation;
    }
}
