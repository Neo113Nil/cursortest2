package com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel$resolveScamContingency$1", f = "ScamAlertViewModel.kt", i = {1, 1}, l = {56, 65}, m = "invokeSuspend", n = {"transferAttempt", "attemptId"}, nl = {57, 72}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class ScamAlertViewModel$resolveScamContingency$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (r12 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003d, code lost:
    
        if (r12 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase resolvePaymentContingencyUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getPaymentTransferAttemptUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(getPaymentTransferAttemptUseCase.invoke(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Ior ior = (arrow.core.Ior) obj;
                mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel scamAlertViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
                if (ior instanceof arrow.core.Ior.Left) {
                    com.paypal.oslo.feature.p2p.domain.error.TransferError transferError = (com.paypal.oslo.feature.p2p.domain.error.TransferError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(transferError.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "Unknown";
                    }
                    com.paypal.android.logger.Logger.w$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.SCAM_CONTINGENCY_RESOLUTION_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName)), null, 4, null);
                } else if (ior instanceof arrow.core.Ior.Right) {
                    mutableStateFlow4 = scamAlertViewModel.getHighSpeedVideoSizes;
                    mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    mutableStateFlow3 = scamAlertViewModel.getHighSpeedVideoSizes;
                    mutableStateFlow3.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) obj;
        java.lang.String id = paymentTransferAttempt != null ? paymentTransferAttempt.getId() : null;
        if (id != null) {
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            resolvePaymentContingencyUseCase = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentTransferAttempt);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
            this.getHighSpeedVideoFpsRangesFor = 2;
            obj = resolvePaymentContingencyUseCase.invoke(id, new com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ScamWarningChoice(this.getHighSpeedVideoSizes), this);
        } else {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, "Cannot resolve scam contingency: transfer attempt ID not found", null, null, null, 14, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel$resolveScamContingency$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel$resolveScamContingency$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScamAlertViewModel$resolveScamContingency$1(com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel scamAlertViewModel, com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice scamCustomerChoice, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel$resolveScamContingency$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = scamAlertViewModel;
        this.getHighSpeedVideoSizes = scamCustomerChoice;
    }
}
