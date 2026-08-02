package com.paypal.oslo.feature.onboarding.signup.password.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel$onNavigateNext$1", f = "PasswordViewModel.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PasswordViewModel$onNavigateNext$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.flow.StateFlow stateFlow;
        kotlinx.coroutines.flow.StateFlow stateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoSizes.validateAll()) {
                channel = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                stateFlow = this.getHighSpeedVideoSizes.getInputFormats;
                java.lang.String m16319getEmailBvNjjI = ((com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData) stateFlow.getValue()).m16319getEmailBvNjjI();
                stateFlow2 = this.getHighSpeedVideoSizes.getInputFormats;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (channel.send(new com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.LaunchSavePasswordManager(m16319getEmailBvNjjI, ((com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData) stateFlow2.getValue()).m16321getPasswordWarBkgA()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return kotlin.Unit.INSTANCE;
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
        return ((com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel$onNavigateNext$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel$onNavigateNext$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordViewModel$onNavigateNext$1(com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel$onNavigateNext$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = passwordViewModel;
    }
}
