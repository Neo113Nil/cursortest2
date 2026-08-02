package com.paypal.oslo.feature.wallet.cards.ui.add;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$handleScannerResult$1", f = "AddCardFlowRouterViewModel.kt", i = {0, 1, 2}, l = {165, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 171}, m = "invokeSuspend", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME}, nl = {167, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 163}, s = {"L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes15.dex */
final class AddCardFlowRouterViewModelImpl$handleScannerResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl.access$handleScanSuccess(r12.getInputSizeshNQ4ISI, (com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success) r13, r12.Camera2StreamConfigurationMap, r12.getHighSpeedVideoFpsRangesFor, r12.getHighSpeedVideoSizes, r12.getHighResolutionOutputSizeshNQ4ISI, r12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl.access$handleScanCancellation(r12.getInputSizeshNQ4ISI, (com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled) r13, r12.Camera2StreamConfigurationMap, r12.getHighSpeedVideoFpsRangesFor, r12.getHighSpeedVideoSizes, r12.getHighResolutionOutputSizeshNQ4ISI, r12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl.access$handleScanError(r12.getInputSizeshNQ4ISI, (com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error) r13, r12.Camera2StreamConfigurationMap, r12.getHighSpeedVideoFpsRangesFor, r12.getHighSpeedVideoSizes, r12.getHighResolutionOutputSizeshNQ4ISI, r12) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome outcome = this.getHighSpeedVideoFpsRanges.getOutcome();
            if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success) {
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(outcome);
                this.getInputFormats = 1;
            } else if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled) {
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(outcome);
                this.getInputFormats = 2;
            } else {
                if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(outcome);
                this.getInputFormats = 3;
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$handleScannerResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$handleScannerResult$1(this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddCardFlowRouterViewModelImpl$handleScannerResult$1(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult scanCardNavResult, com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl addCardFlowRouterViewModelImpl, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$handleScannerResult$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = scanCardNavResult;
        this.getInputSizeshNQ4ISI = addCardFlowRouterViewModelImpl;
        this.Camera2StreamConfigurationMap = addFIAnalyticsContext;
        this.getHighSpeedVideoFpsRangesFor = header;
        this.getHighSpeedVideoSizes = config;
        this.getHighResolutionOutputSizeshNQ4ISI = options;
    }
}
