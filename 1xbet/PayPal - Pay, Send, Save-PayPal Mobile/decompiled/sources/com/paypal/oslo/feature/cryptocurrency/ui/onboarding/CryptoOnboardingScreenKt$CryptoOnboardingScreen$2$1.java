package com.paypal.oslo.feature.cryptocurrency.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$2$1", f = "CryptoOnboardingScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoOnboardingScreenKt$CryptoOnboardingScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.getHighSpeedVideoSizes.getValue().booleanValue()) {
            this.getHighSpeedVideoSizes.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.getHighResolutionOutputSizeshNQ4ISI;
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$2$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination(intentId));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$2$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOnboardingScreenKt$CryptoOnboardingScreen$2$1(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt$CryptoOnboardingScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = intentId;
    }
}
