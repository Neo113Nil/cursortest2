package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveSelectedTransferType$3$1", f = "ReviewScreen.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1600, 1612}, m = "invokeSuspend", n = {"updateReceiverAttempt", "attempt", "isPaymentLink", "$i$a$-let-ReviewScreenKt$ObserveSelectedTransferType$3$1$1", "attemptHash", "alreadyProcessed", "updateReceiverAttempt", "attempt", "isPaymentLink", "$i$a$-let-ReviewScreenKt$ObserveSelectedTransferType$3$1$1", "attemptHash", "alreadyProcessed"}, nl = {1611, 1566}, s = {"L$0", "L$2", "Z$0", "I$0", "I$1", "I$2", "L$0", "L$2", "Z$0", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes13.dex */
final class ReviewScreenKt$ObserveSelectedTransferType$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Integer> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    boolean getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$applyPredeterminedTransferType(r2, r6, r8, r9, r21) != r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x018c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018d, code lost:
    
        r1 = r2;
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018a, code lost:
    
        if (com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$applyPredeterminedTransferType(r2, r6, r8, r9, r21) == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01a2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt;
        com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels;
        com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver;
        com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels2;
        com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType;
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveSelectedTransferType$lambda$2(this.getHighResolutionOutputSizeshNQ4ISI).getContingenciesDetected()) {
                return kotlin.Unit.INSTANCE;
            }
            updateReceiverAttempt = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveSelectedTransferType$lambda$2(this.getHighResolutionOutputSizeshNQ4ISI).getUpdateReceiverAttempt();
            boolean isPaymentLinkSelected = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveSelectedTransferType$lambda$2(this.getHighResolutionOutputSizeshNQ4ISI).isPaymentLinkSelected();
            this.getInputFormats.getPaymentTypeAccordionViewModel().updateResolvedPaymentLink(updateReceiverAttempt != null ? updateReceiverAttempt.getPaymentLink() : null);
            if (updateReceiverAttempt != null) {
                reviewScreenViewModels = this.getInputFormats;
                kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizes;
                androidx.compose.runtime.MutableState<java.lang.Integer> mutableState = this.getHighSpeedVideoFpsRangesFor;
                androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2 = this.Camera2StreamConfigurationMap;
                int hashCode = updateReceiverAttempt.hashCode();
                java.lang.Integer access$ObserveSelectedTransferType$lambda$4 = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveSelectedTransferType$lambda$4(mutableState);
                int i2 = (access$ObserveSelectedTransferType$lambda$4 != null && hashCode == access$ObserveSelectedTransferType$lambda$4.intValue() && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(isPaymentLinkSelected), com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveSelectedTransferType$lambda$7(mutableState2))) ? 1 : 0;
                if (i2 != 0) {
                    return kotlin.Unit.INSTANCE;
                }
                mutableState.setValue(kotlin.coroutines.jvm.internal.Boxing.boxInt(hashCode));
                mutableState2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(isPaymentLinkSelected));
                if (updateReceiverAttempt.getPaymentLink() != null || isPaymentLinkSelected) {
                    com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$applyPaymentLinkReceiverState(updateReceiverAttempt, reviewScreenViewModels);
                    return kotlin.Unit.INSTANCE;
                }
                reviewScreenViewModels.getPaymentTypeAccordionViewModel().onSupportedTransferTypesLoaded(updateReceiverAttempt.getSupportedTransferTypes().size(), updateReceiverAttempt.getTransferSelectionRequirement());
                com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement = updateReceiverAttempt.getTransferSelectionRequirement();
                int i3 = transferSelectionRequirement == null ? -1 : com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveSelectedTransferType$3$1.WhenMappings.$EnumSwitchMapping$0[transferSelectionRequirement.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        reviewScreenViewModels.getPaymentTypeAccordionViewModel().updateSelectedType(null);
                        reviewScreenViewModels.getPaymentTypeAccordionViewModel().setAwaitingConfirmation(false);
                        if (!updateReceiverAttempt.getSupportedTransferTypes().isEmpty()) {
                            reviewScreenViewModels.getPaymentTypeAccordionViewModel().onExpanded();
                        }
                    } else if (i3 == 2) {
                        reviewScreenViewModels.getPaymentTypeAccordionViewModel().setAwaitingConfirmation(true);
                        com.paypal.oslo.feature.p2p.domain.model.PaymentTxType determineTransferTypeToSelect = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenMappersKt.determineTransferTypeToSelect(updateReceiverAttempt);
                        if (determineTransferTypeToSelect != null && (paymentType = com.paypal.oslo.feature.p2p.domain.model.PaymentTypeKt.toPaymentType(determineTransferTypeToSelect)) != null) {
                            reviewScreenViewModels.getPaymentTypeAccordionViewModel().updateSelectedType(com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.INSTANCE.toMmpId(paymentType));
                        }
                        reviewScreenViewModels.getPaymentTypeAccordionViewModel().onExpanded();
                    } else if (i3 == 3) {
                        reviewScreenViewModels.getPaymentTypeAccordionViewModel().setAwaitingConfirmation(false);
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, "Unexpected transferSelectionRequirement: UNKNOWN — defaulting to PREDETERMINED behaviour", null, null, 6, null);
                        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateReceiverAttempt);
                        this.getOutputSizeshNQ4ISI = reviewScreenViewModels;
                        this.getOutputSizes = updateReceiverAttempt;
                        this.getOutputStallDurationlomOqCM = isPaymentLinkSelected;
                        this.getOutputFormats = 0;
                        this.getHighSpeedVideoSizesFor = hashCode;
                        this.getInputSizeshNQ4ISI = i2;
                        this.getOutputMinFrameDurationlomOqCM = 1;
                    } else if (i3 != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    reviewScreenViewModels.getPaymentMethodAccordionViewModel().updateInstrumentAdditionConfig(updateReceiverAttempt.getInstrumentAdditionConfig());
                    fundingOptions = updateReceiverAttempt.getFundingOptions();
                    if (fundingOptions != null) {
                        reviewScreenViewModels.getPaymentMethodAccordionViewModel().updateFundingOptions(fundingOptions);
                    }
                    return kotlin.Unit.INSTANCE;
                }
                reviewScreenViewModels.getPaymentTypeAccordionViewModel().setAwaitingConfirmation(false);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateReceiverAttempt);
                this.getOutputSizeshNQ4ISI = reviewScreenViewModels;
                this.getOutputSizes = updateReceiverAttempt;
                this.getOutputStallDurationlomOqCM = isPaymentLinkSelected;
                this.getOutputFormats = 0;
                this.getHighSpeedVideoSizesFor = hashCode;
                this.getInputSizeshNQ4ISI = i2;
                this.getOutputMinFrameDurationlomOqCM = 2;
            } else {
                this.getHighSpeedVideoFpsRangesFor.setValue(null);
                this.Camera2StreamConfigurationMap.setValue(null);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            updatePaymentTransferAttemptReceiver = (com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver) this.getOutputSizes;
            reviewScreenViewModels2 = (com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels) this.getOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        reviewScreenViewModels = reviewScreenViewModels2;
        updateReceiverAttempt = updatePaymentTransferAttemptReceiver;
        reviewScreenViewModels.getPaymentMethodAccordionViewModel().updateInstrumentAdditionConfig(updateReceiverAttempt.getInstrumentAdditionConfig());
        fundingOptions = updateReceiverAttempt.getFundingOptions();
        if (fundingOptions != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveSelectedTransferType$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement.REQUIRES_SELECTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement.REQUIRES_CONFIRMATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement.PREDETERMINED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveSelectedTransferType$3$1(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewScreenKt$ObserveSelectedTransferType$3$1(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState> state, androidx.compose.runtime.MutableState<java.lang.Integer> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveSelectedTransferType$3$1> continuation) {
        super(2, continuation);
        this.getInputFormats = reviewScreenViewModels;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.Camera2StreamConfigurationMap = mutableState2;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoSizes = function0;
    }
}
