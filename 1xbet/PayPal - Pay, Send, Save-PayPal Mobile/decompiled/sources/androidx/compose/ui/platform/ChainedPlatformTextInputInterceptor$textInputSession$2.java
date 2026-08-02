package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ChainedPlatformTextInputInterceptor$textInputSession$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.platform.PlatformTextInputSessionScope, kotlin.coroutines.Continuation<?>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.platform.PlatformTextInputSessionScope, kotlin.coroutines.Continuation<?>, java.lang.Object> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1((androidx.compose.ui.platform.PlatformTextInputSessionScope) this.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.ui.SessionMutex.m5517constructorimpl(), this.Camera2StreamConfigurationMap);
            kotlin.jvm.functions.Function2<androidx.compose.ui.platform.PlatformTextInputSessionScope, kotlin.coroutines.Continuation<?>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (function2.invoke(chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.platform.PlatformTextInputSessionScope platformTextInputSessionScope, kotlin.coroutines.Continuation<?> continuation) {
        return ((androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2) create(platformTextInputSessionScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        chainedPlatformTextInputInterceptor$textInputSession$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return chainedPlatformTextInputInterceptor$textInputSession$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChainedPlatformTextInputInterceptor$textInputSession$2(kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> function2, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = function2;
        this.Camera2StreamConfigurationMap = chainedPlatformTextInputInterceptor;
    }
}
