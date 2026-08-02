package androidx.compose.foundation.layout;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", i = {0, 0, 1, 1, 2}, l = {301, 327, 352}, m = "fling-huYlsQE", n = {"$v$c$androidx-compose-ui-unit-Velocity$-available$0", "flingAmount", "endVelocity", "$v$c$androidx-compose-ui-unit-Velocity$-available$0", "$v$c$androidx-compose-ui-unit-Velocity$-available$0"}, s = {"J$0", "F$0", "L$0", "J$0", "J$0"}, v = 1)
/* loaded from: classes6.dex */
final class WindowInsetsNestedScrollConnection$fling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    float Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI(0L, 0.0f, false, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$1(androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, kotlin.coroutines.Continuation<? super androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = windowInsetsNestedScrollConnection;
    }
}
