package androidx.compose.material3.pulltorefresh;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", i = {0}, l = {345}, m = "onRelease", n = {"consumed"}, s = {"F$0"})
/* loaded from: classes6.dex */
final class PullToRefreshModifierNode$onRelease$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode Camera2StreamConfigurationMap;
    float getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(0.0f, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullToRefreshModifierNode$onRelease$1(androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = pullToRefreshModifierNode;
    }
}
