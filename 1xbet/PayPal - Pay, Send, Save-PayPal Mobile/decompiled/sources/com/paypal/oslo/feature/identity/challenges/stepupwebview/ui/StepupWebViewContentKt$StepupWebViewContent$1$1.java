package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$StepupWebViewContent$1$1", f = "StepupWebViewContent.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, nl = {98}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class StepupWebViewContentKt$StepupWebViewContent$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.storage.IdentityTokenStorage Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.MutableState<java.lang.String> mutableState;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.runtime.MutableState<java.lang.String> mutableState2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = mutableState2;
            this.getHighSpeedVideoFpsRanges = 1;
            java.lang.Object selectAccessToken = com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentHelperKt.selectAccessToken(this.Camera2StreamConfigurationMap, this);
            if (selectAccessToken == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableState = mutableState2;
            obj = selectAccessToken;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (androidx.compose.runtime.MutableState) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((java.lang.String) obj);
        this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(true));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$StepupWebViewContent$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$StepupWebViewContent$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupWebViewContentKt$StepupWebViewContent$1$1(com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewContentKt$StepupWebViewContent$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = identityTokenStorage;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        this.getHighSpeedVideoSizes = mutableState2;
    }
}
