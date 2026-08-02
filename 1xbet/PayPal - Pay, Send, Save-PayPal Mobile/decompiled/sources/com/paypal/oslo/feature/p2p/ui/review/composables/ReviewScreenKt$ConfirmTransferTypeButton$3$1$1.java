package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ConfirmTransferTypeButton$3$1$1", f = "ReviewScreen.kt", i = {0}, l = {2023}, m = "invokeSuspend", n = {"currentSelectedTypeId"}, nl = {2022}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class ReviewScreenKt$ConfirmTransferTypeButton$3$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.String> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        try {
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String access$ConfirmTransferTypeButton$lambda$3 = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ConfirmTransferTypeButton$lambda$3(this.getHighSpeedVideoSizes);
                    if (access$ConfirmTransferTypeButton$lambda$3 == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.getHighSpeedVideoSizesFor.getPaymentMethodAccordionViewModel().setLoading();
                    this.getHighSpeedVideoSizesFor.getShippingAccordionViewModel().setLoading();
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$ConfirmTransferTypeButton$lambda$3);
                    this.getOutputFormats = 1;
                    obj = this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().selectPaymentTypeAndUpdateBackend(access$ConfirmTransferTypeButton$lambda$3, com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ConfirmTransferTypeButton$lambda$2(this.Camera2StreamConfigurationMap), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult paymentTypeUpdateResult = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult) obj;
                if (paymentTypeUpdateResult instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed) {
                    this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().setAwaitingConfirmation(false);
                    this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().setAwaitingConfirmation(true);
                    this.getHighSpeedVideoSizesFor.getPaymentMethodAccordionViewModel().restoreFromCache();
                    this.getHighSpeedVideoSizesFor.getShippingAccordionViewModel().clearLoading();
                    this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().onExpanded();
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel = this.getHighSpeedVideoSizesFor.getPaymentMethodAccordionViewModel();
                com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult transferResult = paymentTypeUpdateResult.getTransferResult();
                paymentMethodAccordionViewModel.updateInstrumentAdditionConfig(transferResult != null ? transferResult.getInstrumentAdditionConfig() : null);
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel2 = this.getHighSpeedVideoSizesFor.getPaymentMethodAccordionViewModel();
                com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult transferResult2 = paymentTypeUpdateResult.getTransferResult();
                paymentMethodAccordionViewModel2.updateFundingOptions(transferResult2 != null ? transferResult2.getFundingOptions() : null);
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel = this.getHighSpeedVideoSizesFor.getShippingAccordionViewModel();
                com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult transferResult3 = paymentTypeUpdateResult.getTransferResult();
                java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> shippingAddresses = transferResult3 != null ? transferResult3.getShippingAddresses() : null;
                com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult transferResult4 = paymentTypeUpdateResult.getTransferResult();
                shippingAccordionViewModel.syncFromBackend(shippingAddresses, transferResult4 != null ? transferResult4.getSelectedShippingAddressId() : null);
                if (paymentTypeUpdateResult instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected) {
                    this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().setAwaitingConfirmation(false);
                    this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().setAwaitingConfirmation(true);
                    this.getHighSpeedVideoSizesFor.getPaymentMethodAccordionViewModel().restoreFromCache();
                    this.getHighSpeedVideoSizesFor.getShippingAccordionViewModel().clearLoading();
                    this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().onExpanded();
                    this.getHighResolutionOutputSizeshNQ4ISI.invoke(((com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected) paymentTypeUpdateResult).getScamAlertType());
                } else if (paymentTypeUpdateResult instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.HighRiskScamDeclined) {
                    this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().setAwaitingConfirmation(false);
                    this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().setAwaitingConfirmation(true);
                    this.getHighSpeedVideoSizesFor.getPaymentMethodAccordionViewModel().restoreFromCache();
                    this.getHighSpeedVideoSizesFor.getShippingAccordionViewModel().clearLoading();
                    this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().onExpanded();
                    this.getHighSpeedVideoFpsRanges.invoke();
                } else {
                    this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().setAwaitingConfirmation(false);
                    this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().onCollapsed();
                }
                this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(false));
                return kotlin.Unit.INSTANCE;
            } catch (java.util.concurrent.CancellationException e) {
                this.getHighSpeedVideoSizesFor.getPaymentMethodAccordionViewModel().restoreFromCache();
                this.getHighSpeedVideoSizesFor.getShippingAccordionViewModel().clearLoading();
                this.getHighSpeedVideoSizesFor.getPaymentTypeAccordionViewModel().onExpanded();
                throw e;
            }
        } finally {
            this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(false));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ConfirmTransferTypeButton$3$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ConfirmTransferTypeButton$3$1$1(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewScreenKt$ConfirmTransferTypeButton$3$1$1(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.State<java.lang.String> state, androidx.compose.runtime.State<java.lang.String> state2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ConfirmTransferTypeButton$3$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = reviewScreenViewModels;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighSpeedVideoSizes = state;
        this.Camera2StreamConfigurationMap = state2;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
