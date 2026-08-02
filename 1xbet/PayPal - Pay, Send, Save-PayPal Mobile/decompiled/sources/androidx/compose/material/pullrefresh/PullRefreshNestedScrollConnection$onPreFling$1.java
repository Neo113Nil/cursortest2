package androidx.compose.material.pullrefresh;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", i = {}, l = {98}, m = "onPreFling-QWom1Mo", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PullRefreshNestedScrollConnection$onPreFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    float Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.mo1753onPreFlingQWom1Mo(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullRefreshNestedScrollConnection$onPreFling$1(androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, kotlin.coroutines.Continuation<? super androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = pullRefreshNestedScrollConnection;
    }
}
