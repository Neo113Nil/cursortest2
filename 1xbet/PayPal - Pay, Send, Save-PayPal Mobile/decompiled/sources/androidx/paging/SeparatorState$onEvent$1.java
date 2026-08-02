package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SeparatorState", f = "Separators.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m = "onEvent", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class SeparatorState$onEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.paging.SeparatorState<R, T> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeparatorState$onEvent$1(androidx.paging.SeparatorState<R, T> separatorState, kotlin.coroutines.Continuation<? super androidx.paging.SeparatorState$onEvent$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = separatorState;
    }
}
