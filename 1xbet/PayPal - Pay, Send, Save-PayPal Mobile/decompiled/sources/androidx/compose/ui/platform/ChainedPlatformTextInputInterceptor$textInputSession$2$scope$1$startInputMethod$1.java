package androidx.compose.ui.platform;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m = "startInputMethod", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.startInputMethod(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1;
    }
}
