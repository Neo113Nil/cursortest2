package androidx.compose.ui.platform;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 186}, m = "interceptedTextInputSession", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.Camera2StreamConfigurationMap(null, null, null, this);
        return Camera2StreamConfigurationMap;
    }

    PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1> continuation) {
        super(continuation);
    }
}
