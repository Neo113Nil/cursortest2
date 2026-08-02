package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$onEmailSuggestionAccepted$1", f = "EmailViewModel.kt", i = {}, l = {346}, m = "invokeSuspend", n = {}, nl = {347}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class EmailViewModel$onEmailSuggestionAccepted$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            channel = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            if (channel.send(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailNavigationEffect.NavigateNext.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
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
        return ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$onEmailSuggestionAccepted$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$onEmailSuggestionAccepted$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailViewModel$onEmailSuggestionAccepted$1(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$onEmailSuggestionAccepted$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = emailViewModel;
    }
}
