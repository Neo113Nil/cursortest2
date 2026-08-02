package androidx.compose.ui.input.nestedscroll;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 1}, l = {113, 118}, m = "onPostFling-RZ2iAVY", n = {"$v$c$androidx-compose-ui-unit-Velocity$-consumed$0", "$v$c$androidx-compose-ui-unit-Velocity$-available$0", "selfConsumed"}, s = {"J$0", "J$1", "J$0"}, v = 1)
/* loaded from: classes6.dex */
final class NestedScrollNode$onPostFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.ui.input.nestedscroll.NestedScrollNode Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.mo1528onPostFlingRZ2iAVY(0L, 0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollNode$onPostFling$1(androidx.compose.ui.input.nestedscroll.NestedScrollNode nestedScrollNode, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = nestedScrollNode;
    }
}
