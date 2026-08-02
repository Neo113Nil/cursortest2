package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, 346}, m = "dispatchMouseWheelScroll", n = {"$this$dispatchMouseWheelScroll", "targetValue", "speed"}, s = {"L$0", "L$1", "F$0"}, v = 1)
/* loaded from: classes6.dex */
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    float Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.gestures.MouseWheelScrollingLogic getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(null, null, 0.0f, 0.0f, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = mouseWheelScrollingLogic;
    }
}
