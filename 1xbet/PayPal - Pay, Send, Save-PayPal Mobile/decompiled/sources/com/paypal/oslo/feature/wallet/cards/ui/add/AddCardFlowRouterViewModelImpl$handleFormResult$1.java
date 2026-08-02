package com.paypal.oslo.feature.wallet.cards.ui.add;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$handleFormResult$1", f = "AddCardFlowRouterViewModel.kt", i = {}, l = {263, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddCardFlowRouterViewModelImpl$handleFormResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r5.emit(new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToSuccess(r4.getHighResolutionOutputSizeshNQ4ISI), r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r5.emit(new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.ExitFlow(r4.getHighResolutionOutputSizeshNQ4ISI), r4) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            options = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            if (options == null || !options.getShowSuccessScreen() || !(this.getHighResolutionOutputSizeshNQ4ISI.getOutcome() instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success)) {
                mutableSharedFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRanges = 2;
            } else {
                mutableSharedFlow2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRanges = 1;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$handleFormResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$handleFormResult$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddCardFlowRouterViewModelImpl$handleFormResult$1(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl addCardFlowRouterViewModelImpl, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$handleFormResult$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = addCardFlowRouterViewModelImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = addCardFlowNavResult;
    }
}
