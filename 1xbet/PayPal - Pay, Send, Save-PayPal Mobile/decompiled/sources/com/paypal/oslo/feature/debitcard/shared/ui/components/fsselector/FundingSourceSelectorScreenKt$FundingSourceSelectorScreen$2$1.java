package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorScreenKt$FundingSourceSelectorScreen$2$1", f = "FundingSourceSelectorScreen.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, nl = {160}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class FundingSourceSelectorScreenKt$FundingSourceSelectorScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandler Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowHandler getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor.initialize(this.getHighSpeedVideoFpsRanges);
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoSizes.showSheet();
            }
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect> uiEffect = this.getHighSpeedVideoSizesFor.getUiEffect();
            final boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.pds.components.BottomSheetController bottomSheetController = this.getHighSpeedVideoSizes;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getOutputFormats;
            final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.getOutputMinFrameDuration;
            final com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandler addBankFlowHandler = this.Camera2StreamConfigurationMap;
            final com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowHandler addCardFlowHandler = this.getHighSpeedVideoFpsRangesFor;
            this.getInputSizeshNQ4ISI = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorScreenKt$FundingSourceSelectorScreen$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect fundingSourceSelectorEffect = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect) obj2;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(fundingSourceSelectorEffect, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.Dismiss.INSTANCE)) {
                        if (z) {
                            bottomSheetController.hideSheet();
                        }
                        function0.invoke();
                    } else if (fundingSourceSelectorEffect instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.FundingSourceSelected) {
                        if (z) {
                            bottomSheetController.hideSheet();
                        }
                        function1.invoke(((com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.FundingSourceSelected) fundingSourceSelectorEffect).getSelectedFundingSourceId());
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(fundingSourceSelectorEffect, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.NavigateToLinkBank.INSTANCE)) {
                        addBankFlowHandler.launchAddBankFlow();
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(fundingSourceSelectorEffect, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.NavigateToLinkCard.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        addCardFlowHandler.launchAddCardFlow();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorScreenKt$FundingSourceSelectorScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorScreenKt$FundingSourceSelectorScreen$2$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FundingSourceSelectorScreenKt$FundingSourceSelectorScreen$2$1(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel fundingSourceSelectorViewModel, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorConfig fundingSourceSelectorConfig, boolean z, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowHandler addBankFlowHandler, com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowHandler addCardFlowHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorScreenKt$FundingSourceSelectorScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = fundingSourceSelectorViewModel;
        this.getHighSpeedVideoFpsRanges = fundingSourceSelectorConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = bottomSheetController;
        this.getOutputFormats = function0;
        this.getOutputMinFrameDuration = function1;
        this.Camera2StreamConfigurationMap = addBankFlowHandler;
        this.getHighSpeedVideoFpsRangesFor = addCardFlowHandler;
    }
}
