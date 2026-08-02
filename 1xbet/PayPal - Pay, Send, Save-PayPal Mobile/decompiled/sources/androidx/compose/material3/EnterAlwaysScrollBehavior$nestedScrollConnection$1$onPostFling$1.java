package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0}, l = {3354, 3356}, m = "onPostFling-RZ2iAVY", n = {com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY}, s = {"J$0"})
/* loaded from: classes6.dex */
final class EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1 getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1528onPostFlingRZ2iAVY(0L, 0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1, kotlin.coroutines.Continuation<? super androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = enterAlwaysScrollBehavior$nestedScrollConnection$1;
    }
}
