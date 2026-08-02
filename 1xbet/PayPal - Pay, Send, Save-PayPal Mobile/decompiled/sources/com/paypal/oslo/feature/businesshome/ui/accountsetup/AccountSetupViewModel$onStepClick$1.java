package com.paypal.oslo.feature.businesshome.ui.accountsetup;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel$onStepClick$1", f = "AccountSetupViewModel.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, nl = {107}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AccountSetupViewModel$onStepClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow4;
        com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase completeDemoAccountSetupStepUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            featureGate = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            if (featureGate.checkGate(com.paypal.oslo.feature.businesshome.featureflags.BusinessHomeConfig.INSTANCE.getMockApiEnabled$business_home_prodRelease())) {
                completeDemoAccountSetupStepUseCase = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                this.Camera2StreamConfigurationMap = 1;
                if (completeDemoAccountSetupStepUseCase.invoke(com.paypal.oslo.feature.businesshome.ui.mapper.AccountSetupUiMapperKt.toDomainStepType(this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType stepType = this.getHighSpeedVideoSizes;
                if (stepType == com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.VERIFY_ACCOUNT) {
                    mutableSharedFlow4 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                    mutableSharedFlow4.tryEmit(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect.NavigateToVerifyAccount.INSTANCE);
                } else if (stepType == com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.CONFIRM_EMAIL) {
                    mutableSharedFlow3 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                    mutableSharedFlow3.tryEmit(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect.NavigateToConfirmEmail.INSTANCE);
                } else if (stepType == com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.ADD_BANK_ACCOUNT) {
                    mutableSharedFlow2 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                    mutableSharedFlow2.tryEmit(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect.NavigateToAddBankAccount.INSTANCE);
                } else if (stepType == com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.Engagement.REQUEST_DEBIT_CARD) {
                    mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                    mutableSharedFlow.tryEmit(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect.NavigateToDebitCard.INSTANCE);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoFpsRangesFor.loadData$business_home_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel$onStepClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel$onStepClick$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSetupViewModel$onStepClick$1(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel accountSetupViewModel, com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType stepType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel$onStepClick$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = accountSetupViewModel;
        this.getHighSpeedVideoSizes = stepType;
    }
}
