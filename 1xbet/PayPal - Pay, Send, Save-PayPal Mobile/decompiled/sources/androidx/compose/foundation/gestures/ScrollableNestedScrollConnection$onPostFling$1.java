package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", i = {0}, l = {977}, m = "onPostFling-RZ2iAVY", n = {"$v$c$androidx-compose-ui-unit-Velocity$-available$0"}, s = {"J$0"}, v = 1)
/* loaded from: classes6.dex */
final class ScrollableNestedScrollConnection$onPostFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollableNestedScrollConnection getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.mo1528onPostFlingRZ2iAVY(0L, 0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableNestedScrollConnection$onPostFling$1(androidx.compose.foundation.gestures.ScrollableNestedScrollConnection scrollableNestedScrollConnection, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = scrollableNestedScrollConnection;
    }
}
