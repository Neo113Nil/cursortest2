package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$2", f = "AddUserAccountScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AddUserAccountScreenKt$AddUserAccountScreen$2$1$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.MerchantOnboardingUrlResult generateMerchantOnboardingUrl = this.Camera2StreamConfigurationMap.generateMerchantOnboardingUrl();
        this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$2.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.MerchantOnboardingUrlResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.MerchantOnboardingUrlResult merchantOnboardingUrlResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination(merchantOnboardingUrlResult.getUrl(), merchantOnboardingUrlResult.getCodeVerifier(), null, 4, null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddUserAccountScreenKt$AddUserAccountScreen$2$1$2(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel addUserAccountViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = addUserAccountViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
    }
}
