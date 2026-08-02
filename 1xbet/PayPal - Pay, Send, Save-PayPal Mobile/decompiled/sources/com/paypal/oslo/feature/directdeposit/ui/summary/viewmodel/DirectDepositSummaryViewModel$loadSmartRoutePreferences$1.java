package com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1", f = "DirectDepositSummaryViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositSummaryViewModel$loadSmartRoutePreferences$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase getSmartRoutePreferencesUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Loading smart route preferences", null, null, 6, null);
            getSmartRoutePreferencesUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizes = 1;
            obj = getSmartRoutePreferencesUseCase.invoke(this);
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
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Failed to load smart route preferences", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName()), kotlin.TuplesKt.to("currentRetryCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(directDepositSummaryViewModel.getState().getValue().getSmartRoutePreferencesErrorRetryCount()))), null, new java.lang.Exception("Failed to load SmartRoute preferences: ".concat(java.lang.String.valueOf(callError))), 4, null);
            directDepositSummaryViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj2);
                }
            });
        } else if (ior instanceof arrow.core.Ior.Right) {
            final com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences = (com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences) ((arrow.core.Ior.Right) ior).getValue();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Successfully loaded smart route preferences", null, null, 6, null);
            directDepositSummaryViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences.this, (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj2);
                }
            });
            com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createPaypalSmartRouteModuleShownEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            final com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences2 = (com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences) both.getRightValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.directdeposit.LoggerKt.log, "Loaded partial smart route preferences", null, null, 6, null);
            directDepositSummaryViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences.this, (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj2);
                }
            });
            com.paypal.oslo.feature.directdeposit.analytics.DirectDepositSummaryAnalytics.INSTANCE.createPaypalSmartRouteModuleShownEvent().track(com.paypal.oslo.feature.directdeposit.AnalyticsTrackerKt.analyticsTracker);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState Camera2StreamConfigurationMap(com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : smartRoutePreferences, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : null, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : directDepositUiState.getSmartRoutePreferencesErrorRetryCount() + 1, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : true);
        return copy;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState getHighSpeedVideoSizes(com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState directDepositUiState) {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState copy;
        copy = directDepositUiState.copy((r45 & 1) != 0 ? directDepositUiState.isLoading : false, (r45 & 2) != 0 ? directDepositUiState.accountNumber : null, (r45 & 4) != 0 ? directDepositUiState.maskedAccountNumber : null, (r45 & 8) != 0 ? directDepositUiState.isAccountNumberVisible : false, (r45 & 16) != 0 ? directDepositUiState.routingNumber : null, (r45 & 32) != 0 ? directDepositUiState.bankName : null, (r45 & 64) != 0 ? directDepositUiState.directDebitStatus : null, (r45 & 128) != 0 ? directDepositUiState.isDirectDebitEnabled : false, (r45 & 256) != 0 ? directDepositUiState.isDirectDepositInfoExpanded : false, (r45 & 512) != 0 ? directDepositUiState.isDirectDebitInfoExpanded : false, (r45 & 1024) != 0 ? directDepositUiState.error : null, (r45 & 2048) != 0 ? directDepositUiState.errorType : null, (r45 & 4096) != 0 ? directDepositUiState.showErrorScreen : false, (r45 & 8192) != 0 ? directDepositUiState.showIntroScreen : false, (r45 & 16384) != 0 ? directDepositUiState.toastMessage : null, (r45 & 32768) != 0 ? directDepositUiState.toastMessageResId : null, (r45 & 65536) != 0 ? directDepositUiState.retryCount : 0, (r45 & 131072) != 0 ? directDepositUiState.isFillOutFormEnabled : false, (r45 & 262144) != 0 ? directDepositUiState.smartRoutePreferences : smartRoutePreferences, (r45 & 524288) != 0 ? directDepositUiState.directDebitErrorRetryCount : 0, (r45 & 1048576) != 0 ? directDepositUiState.showDirectDebitErrorHalfSheet : false, (r45 & 2097152) != 0 ? directDepositUiState.atomicSetupErrorRetryCount : 0, (r45 & 4194304) != 0 ? directDepositUiState.showAtomicSetupErrorHalfSheet : false, (r45 & 8388608) != 0 ? directDepositUiState.linkAccountErrorRetryCount : 0, (r45 & 16777216) != 0 ? directDepositUiState.showLinkAccountErrorHalfSheet : false, (r45 & 33554432) != 0 ? directDepositUiState.smartRoutePreferencesErrorRetryCount : 0, (r45 & 67108864) != 0 ? directDepositUiState.showSmartRoutePreferencesErrorHalfSheet : false);
        return copy;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositSummaryViewModel$loadSmartRoutePreferences$1(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$loadSmartRoutePreferences$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = directDepositSummaryViewModel;
    }
}
