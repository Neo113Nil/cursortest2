package androidx.compose.ui.platform;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "textInputSession", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ChainedPlatformTextInputInterceptor$textInputSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChainedPlatformTextInputInterceptor$textInputSession$1(androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = chainedPlatformTextInputInterceptor;
    }
}
