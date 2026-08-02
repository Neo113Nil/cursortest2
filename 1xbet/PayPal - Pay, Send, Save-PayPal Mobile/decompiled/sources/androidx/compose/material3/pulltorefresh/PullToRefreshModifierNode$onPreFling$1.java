package androidx.compose.material3.pulltorefresh;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE}, m = "onPreFling-QWom1Mo", n = {}, s = {})
/* loaded from: classes6.dex */
final class PullToRefreshModifierNode$onPreFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    float Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.mo1753onPreFlingQWom1Mo(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullToRefreshModifierNode$onPreFling$1(androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = pullToRefreshModifierNode;
    }
}
