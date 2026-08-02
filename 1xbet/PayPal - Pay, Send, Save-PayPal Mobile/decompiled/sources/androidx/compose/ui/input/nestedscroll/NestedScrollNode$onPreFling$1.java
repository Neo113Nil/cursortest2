package androidx.compose.ui.input.nestedscroll;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 1}, l = {106, 107}, m = "onPreFling-QWom1Mo", n = {"$v$c$androidx-compose-ui-unit-Velocity$-available$0", "parentPreConsumed"}, s = {"J$0", "J$0"}, v = 1)
/* loaded from: classes6.dex */
final class NestedScrollNode$onPreFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.ui.input.nestedscroll.NestedScrollNode Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.mo1753onPreFlingQWom1Mo(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollNode$onPreFling$1(androidx.compose.ui.input.nestedscroll.NestedScrollNode nestedScrollNode, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = nestedScrollNode;
    }
}
