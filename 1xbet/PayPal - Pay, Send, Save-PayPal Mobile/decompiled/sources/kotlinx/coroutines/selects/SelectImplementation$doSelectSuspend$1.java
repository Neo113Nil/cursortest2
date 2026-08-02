package kotlinx.coroutines.selects;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {453, 456}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SelectImplementation$doSelectSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.selects.SelectImplementation<R> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectImplementation$doSelectSuspend$1(kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation, kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = selectImplementation;
    }
}
