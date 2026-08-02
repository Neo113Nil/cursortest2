package com.paypal.oslo.feature.identity.emailconfirmation.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel$confirmEmail$1", f = "EmailConfirmationViewModel.kt", i = {0, 1, 1, 1, 1, 1}, l = {140, 153}, m = "invokeSuspend", n = {"request", "request", "this_$iv", "result", "$i$f$fold", "$i$a$-fold-EmailConfirmationViewModel$confirmEmail$1$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 154}, s = {"L$0", "L$0", "L$1", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class EmailConfirmationViewModel$confirmEmail$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r13 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest emailConfirmationRequest;
        com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase confirmEmailUseCase;
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel emailConfirmationViewModel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            emailConfirmationRequest = new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, null, null, null, 28, null);
            confirmEmailUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailConfirmationRequest);
            this.getOutputMinFrameDuration = 1;
            obj = confirmEmailUseCase.invoke(emailConfirmationRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                emailConfirmationViewModel = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel) this.getOutputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                emailConfirmationViewModel.processEvent(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.Dismiss.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            emailConfirmationRequest = (com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel emailConfirmationViewModel2 = this.getInputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult emailConfirmationResult = (com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult) ((arrow.core.Either.Right) either).getValue();
            if (!(emailConfirmationResult instanceof com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            emailConfirmationViewModel2.processEvent(new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.ConfirmationSuccess(((com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult.Success) emailConfirmationResult).getConfirmedEmail()));
            long autoDismissDelayMs = emailConfirmationViewModel2.getAutoDismissDelayMs();
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailConfirmationRequest);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputFormats = emailConfirmationViewModel2;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailConfirmationResult);
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getOutputMinFrameDuration = 2;
            if (kotlinx.coroutines.DelayKt.delay(autoDismissDelayMs, this) != coroutine_suspended) {
                emailConfirmationViewModel = emailConfirmationViewModel2;
                emailConfirmationViewModel.processEvent(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.Dismiss.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (either instanceof arrow.core.Either.Left) {
            emailConfirmationViewModel2.processEvent(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel.access$mapErrorToEvent(emailConfirmationViewModel2, (com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError) ((arrow.core.Either.Left) either).getValue()));
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel$confirmEmail$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel$confirmEmail$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailConfirmationViewModel$confirmEmail$1(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel emailConfirmationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel$confirmEmail$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getInputSizeshNQ4ISI = emailConfirmationViewModel;
    }
}
