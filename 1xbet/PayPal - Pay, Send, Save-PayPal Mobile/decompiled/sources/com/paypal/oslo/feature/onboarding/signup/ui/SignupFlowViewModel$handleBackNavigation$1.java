package com.paypal.oslo.feature.onboarding.signup.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$handleBackNavigation$1", f = "SignupFlowViewModel.kt", i = {0}, l = {com.visa.cbp.getCertUsage.setAucAID}, m = "invokeSuspend", n = {"previousStep"}, nl = {com.visa.cbp.getCertUsage.getAppPrgrmIDAID}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class SignupFlowViewModel$handleBackNavigation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService backstackFlowStepService;
        com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService backstackFlowStepService2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            backstackFlowStepService = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            backstackFlowStepService.popBackStack();
            backstackFlowStepService2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.onboarding.steps.nav.domain.Step peekBackStack = backstackFlowStepService2.peekBackStack();
            if (peekBackStack != null) {
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(peekBackStack);
                this.getHighSpeedVideoSizes = 1;
                if (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.m16441access$handleLoadStepConfiguration4HgBkxg(this.Camera2StreamConfigurationMap, peekBackStack.m16524getStepIdeVUBM90(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.Camera2StreamConfigurationMap.exitFlow(new com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult(com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult.Status.Cancelled.INSTANCE));
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$handleBackNavigation$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$handleBackNavigation$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SignupFlowViewModel$handleBackNavigation$1(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel$handleBackNavigation$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = signupFlowViewModel;
    }
}
