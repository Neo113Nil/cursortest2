package com.paypal.oslo.feature.wallet.banks.ui.consent;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$2$1", f = "AddBankConsentScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddBankConsentScreenKt$AddBankConsentScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails) kotlin.collections.CollectionsKt.firstOrNull(com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt.access$AddBankConsentScreen$lambda$1(this.getHighResolutionOutputSizeshNQ4ISI));
        com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo access$AddBankConsentScreen$lambda$2 = com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt.access$AddBankConsentScreen$lambda$2(this.getHighSpeedVideoFpsRanges);
        final com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination noAuthSecureWebViewDestination = null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(access$AddBankConsentScreen$lambda$2, com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo.AddBankPlaidFlow.INSTANCE)) {
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow flow = this.getHighSpeedVideoFpsRangesFor.getAddBankConsentFlowContentId().getFlow();
            java.lang.String countryCode = com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt.getCountryCode(instantBankConfirmationBankDetails);
            com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAction = this.getHighSpeedVideoFpsRangesFor.getAddBankConsentFlowContentId().getExternalBankAction();
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount = this.Camera2StreamConfigurationMap;
            noAuthSecureWebViewDestination = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid(flow, externalBankAction, bankAccount != null ? bankAccount.getId() : null, countryCode, instantBankConfirmationBankDetails);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(access$AddBankConsentScreen$lambda$2, com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo.FinicityFlow.INSTANCE)) {
            if (com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$2$1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRangesFor.getAddBankConsentFlowContentId().getExternalBankAction().ordinal()] == 1) {
                noAuthSecureWebViewDestination = com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions.INSTANCE;
            } else {
                java.lang.String externalBankId = instantBankConfirmationBankDetails != null ? instantBankConfirmationBankDetails.getExternalBankId() : null;
                if (externalBankId == null) {
                    externalBankId = "";
                }
                java.lang.String bankName = instantBankConfirmationBankDetails != null ? instantBankConfirmationBankDetails.getBankName() : null;
                java.lang.String str = bankName == null ? "" : bankName;
                java.lang.String countryCode2 = com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt.getCountryCode(instantBankConfirmationBankDetails);
                if (instantBankConfirmationBankDetails == null || (integrationType = instantBankConfirmationBankDetails.getIntegrationType()) == null) {
                    integrationType = com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.UNKNOWN;
                }
                com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType2 = integrationType;
                java.lang.String inlineLogoUrl = instantBankConfirmationBankDetails != null ? instantBankConfirmationBankDetails.getInlineLogoUrl() : null;
                com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow flow2 = this.getHighSpeedVideoFpsRangesFor.getAddBankConsentFlowContentId().getFlow();
                com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAction2 = this.getHighSpeedVideoFpsRangesFor.getAddBankConsentFlowContentId().getExternalBankAction();
                com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount2 = this.Camera2StreamConfigurationMap;
                noAuthSecureWebViewDestination = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity("FINICITY", externalBankId, str, countryCode2, integrationType2, inlineLogoUrl, flow2, externalBankAction2, bankAccount2 != null ? bankAccount2.getId() : null, instantBankConfirmationBankDetails);
            }
        } else if (access$AddBankConsentScreen$lambda$2 instanceof com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo.WebView) {
            com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo access$AddBankConsentScreen$lambda$22 = com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt.access$AddBankConsentScreen$lambda$2(this.getHighSpeedVideoFpsRanges);
            kotlin.jvm.internal.Intrinsics.checkNotNull(access$AddBankConsentScreen$lambda$22, "");
            noAuthSecureWebViewDestination = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination(((com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo.WebView) access$AddBankConsentScreen$lambda$22).getUrlResId(), (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else if (access$AddBankConsentScreen$lambda$2 != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (noAuthSecureWebViewDestination != null) {
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$2$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.wallet.ui.Destination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            this.getHighSpeedVideoFpsRangesFor.resetNavigation();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.wallet.ui.Destination destination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(destination);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$2$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddBankConsentScreenKt$AddBankConsentScreen$2$1(com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel addBankConsentViewModel, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State<? extends java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails>> state, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.NavigateTo> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt$AddBankConsentScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = addBankConsentViewModel;
        this.Camera2StreamConfigurationMap = bankAccount;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.getHighSpeedVideoFpsRanges = state2;
    }
}
