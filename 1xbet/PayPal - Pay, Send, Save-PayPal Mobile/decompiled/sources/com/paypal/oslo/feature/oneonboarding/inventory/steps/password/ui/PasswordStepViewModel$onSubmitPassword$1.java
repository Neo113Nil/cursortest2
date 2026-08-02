package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$onSubmitPassword$1", f = "PasswordStepViewModel.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PasswordStepViewModel$onSubmitPassword$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel.access$validateAll(this.getHighResolutionOutputSizeshNQ4ISI)) {
                channel = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                java.lang.String access$getEmailAddress = com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel.access$getEmailAddress(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
                mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = 1;
                if (channel.send(new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordStepAction.LaunchSavePasswordManager(access$getEmailAddress, ((com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.model.PasswordData) mutableStateFlow.getValue()).getPassword()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel.access$trackValidationErrors(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
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
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$onSubmitPassword$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$onSubmitPassword$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordStepViewModel$onSubmitPassword$1(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel passwordStepViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepViewModel$onSubmitPassword$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = passwordStepViewModel;
        this.getHighSpeedVideoSizes = intentId;
    }
}
