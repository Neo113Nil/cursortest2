package com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadVbaData$1", f = "DirectDepositSummaryViewModel.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, nl = {95}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositSummaryViewModel$loadVbaData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.directdeposit.domain.usecase.GetVbaUseCase getVbaUseCase;
        com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager directDepositFeatureManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadVbaData$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadVbaData$1.getHighSpeedVideoSizes((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj2);
                }
            });
            getVbaUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            obj = getVbaUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel = this.Camera2StreamConfigurationMap;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.access$handleVbaLoadError(directDepositSummaryViewModel, (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.directdeposit.domain.model.VbaItem vbaItem = (com.paypal.oslo.feature.directdeposit.domain.model.VbaItem) ((arrow.core.Ior.Right) ior).getValue();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Successfully loaded vba details", null, null, 6, null);
            com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.access$handleVbaLoadSuccess(directDepositSummaryViewModel, vbaItem, null);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.feature.directdeposit.domain.model.VbaItem vbaItem2 = (com.paypal.oslo.feature.directdeposit.domain.model.VbaItem) both.getRightValue();
            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Loaded partial vba details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("callError", callError.toString())), null, 4, null);
            com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.access$handleVbaLoadSuccess(directDepositSummaryViewModel, vbaItem2, callError.toString());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        directDepositFeatureManager = this.Camera2StreamConfigurationMap.getOutputFormats;
        if (directDepositFeatureManager.isBalanceL2SmartRouteEnabled()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "SmartRoute entry point enabled - loading preferences", null, null, 6, null);
            this.Camera2StreamConfigurationMap.processIntent((com.paypal.oslo.feature.directdeposit.ui.summary.intent.SummaryIntent) com.paypal.oslo.feature.directdeposit.ui.summary.intent.SummaryIntent.LoadSmartRoutePreferences.INSTANCE);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "SmartRoute entry point disabled - skipping preferences load", null, null, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState getHighSpeedVideoSizes(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : true, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.NONE, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadVbaData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadVbaData$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositSummaryViewModel$loadVbaData$1(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadVbaData$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = directDepositSummaryViewModel;
    }
}
