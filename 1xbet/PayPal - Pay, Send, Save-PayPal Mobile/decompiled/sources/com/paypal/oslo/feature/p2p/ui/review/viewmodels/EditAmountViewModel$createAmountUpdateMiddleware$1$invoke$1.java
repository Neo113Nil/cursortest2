package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$createAmountUpdateMiddleware$1$invoke$1", f = "EditAmountViewModel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m = "invokeSuspend", n = {"domainAmount", "intentToUse"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class EditAmountViewModel$createAmountUpdateMiddleware$1$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase updateAmountAndIntentUseCase;
        java.lang.Object first;
        com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper;
        com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.p2p.domain.model.Amount amount = new com.paypal.oslo.feature.p2p.domain.model.Amount(((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) this.getHighSpeedVideoFpsRanges).getNewAmount(), ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) this.getHighSpeedVideoFpsRanges).getCurrencyCode(), ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) this.getHighSpeedVideoFpsRanges).getCurrencyCode());
                com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent selectedIntent = this.getHighSpeedVideoSizes.getSelectedIntent();
                if (selectedIntent == null) {
                    selectedIntent = com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND;
                }
                updateAmountAndIntentUseCase = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(amount);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(selectedIntent);
                this.getInputSizeshNQ4ISI = 1;
                first = kotlinx.coroutines.flow.FlowKt.first(updateAmountAndIntentUseCase.invoke(this.getHighSpeedVideoSizes.getTransferAttemptId(), amount, selectedIntent, ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) this.getHighSpeedVideoFpsRanges).getFxQuoteId()), this);
                if (first == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                first = obj;
            }
            arrow.core.Ior ior = (arrow.core.Ior) first;
            com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent editAmountEvent = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState editAmountUiState = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel = this.getOutputMinFrameDuration;
            if (ior instanceof arrow.core.Ior.Left) {
                com.paypal.oslo.feature.p2p.domain.error.TransferError transferError = (com.paypal.oslo.feature.p2p.domain.error.TransferError) ((arrow.core.Ior.Left) ior).getValue();
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to("amount", ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) editAmountEvent).getNewAmount());
                pairArr[1] = kotlin.TuplesKt.to("attemptId", editAmountUiState.getTransferAttemptId());
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(transferError.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "";
                }
                pairArr[2] = kotlin.TuplesKt.to("errorType", simpleName);
                com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.FAILED_TO_UPDATE_AMOUNT, kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
                function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateFailed(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_amount_error_load_failed));
            } else if (ior instanceof arrow.core.Ior.Right) {
                com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult updateAmountAndIntentResult = (com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult) ((arrow.core.Ior.Right) ior).getValue();
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.access$logAmountUpdatedSuccessfully(editAmountViewModel, ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) editAmountEvent).getNewAmount(), editAmountUiState.getTransferAttemptId(), editAmountUiState.getSelectedIntent());
                com.paypal.oslo.feature.p2p.domain.model.Amount transferAmount = updateAmountAndIntentResult.getPaymentTransferAttempt().getTransferAmount();
                if (transferAmount != null) {
                    amountToUiAmountMapper2 = editAmountViewModel.getHighSpeedVideoFpsRangesFor;
                    function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmount(amountToUiAmountMapper2.map(transferAmount)));
                }
                function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess(updateAmountAndIntentResult.getPaymentTransferAttempt(), updateAmountAndIntentResult.getFundingOptions(), updateAmountAndIntentResult.getFxQuote()));
            } else if (ior instanceof arrow.core.Ior.Both) {
                java.lang.Object leftValue = ((arrow.core.Ior.Both) ior).getLeftValue();
                com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult updateAmountAndIntentResult2 = (com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult) ((arrow.core.Ior.Both) ior).getRightValue();
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel.access$logAmountUpdatedSuccessfully(editAmountViewModel, ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) editAmountEvent).getNewAmount(), editAmountUiState.getTransferAttemptId(), editAmountUiState.getSelectedIntent());
                com.paypal.oslo.feature.p2p.domain.model.Amount transferAmount2 = updateAmountAndIntentResult2.getPaymentTransferAttempt().getTransferAmount();
                if (transferAmount2 != null) {
                    amountToUiAmountMapper = editAmountViewModel.getHighSpeedVideoFpsRangesFor;
                    function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmount(amountToUiAmountMapper.map(transferAmount2)));
                }
                function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess(updateAmountAndIntentResult2.getPaymentTransferAttempt(), updateAmountAndIntentResult2.getFundingOptions(), updateAmountAndIntentResult2.getFxQuote()));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } catch (java.lang.IllegalStateException e) {
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.p2p.LoggerKt.log;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
            pairArr2[0] = kotlin.TuplesKt.to("amount", ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) this.getHighSpeedVideoFpsRanges).getNewAmount());
            pairArr2[1] = kotlin.TuplesKt.to("attemptId", this.getHighSpeedVideoSizes.getTransferAttemptId());
            java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName();
            pairArr2[2] = kotlin.TuplesKt.to("errorType", simpleName2 != null ? simpleName2 : "");
            com.paypal.android.logger.Logger.e$default(logger2, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.FAILED_TO_UPDATE_AMOUNT, kotlin.collections.MapsKt.mapOf(pairArr2), null, e, 4, null);
            this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateFailed(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_amount_error_load_failed));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$createAmountUpdateMiddleware$1$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$createAmountUpdateMiddleware$1$invoke$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EditAmountViewModel$createAmountUpdateMiddleware$1$invoke$1(com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent editAmountEvent, com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState editAmountUiState, com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$createAmountUpdateMiddleware$1$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = editAmountEvent;
        this.getHighSpeedVideoSizes = editAmountUiState;
        this.getOutputMinFrameDuration = editAmountViewModel;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
