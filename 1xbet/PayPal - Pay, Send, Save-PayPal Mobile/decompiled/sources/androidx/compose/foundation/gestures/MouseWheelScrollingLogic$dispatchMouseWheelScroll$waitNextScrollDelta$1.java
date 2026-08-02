package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m = "dispatchMouseWheelScroll$waitNextScrollDelta", n = {"this$0", "targetScrollDelta", "targetValue", "$this_dispatchMouseWheelScroll", "animationState"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 1)
/* loaded from: classes6.dex */
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highSpeedVideoSizes = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.getHighSpeedVideoSizes(null, null, null, null, null, 0L, this);
        return highSpeedVideoSizes;
    }

    MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1> continuation) {
        super(continuation);
    }
}
