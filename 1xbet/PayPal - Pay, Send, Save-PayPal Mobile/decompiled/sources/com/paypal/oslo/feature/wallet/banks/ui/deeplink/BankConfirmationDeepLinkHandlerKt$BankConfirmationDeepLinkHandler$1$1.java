package com.paypal.oslo.feature.wallet.banks.ui.deeplink;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt$BankConfirmationDeepLinkHandler$1$1", f = "BankConfirmationDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BankConfirmationDeepLinkHandlerKt$BankConfirmationDeepLinkHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType highSpeedVideoFpsRanges;
        final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType highSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            highSpeedVideoFpsRanges = com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI.getAction());
            highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI.getAccountType());
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.Camera2StreamConfigurationMap;
            final com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink bankConfirmationDeepLink = this.getHighResolutionOutputSizeshNQ4ISI;
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt$BankConfirmationDeepLinkHandler$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt$BankConfirmationDeepLinkHandler$1$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink.this, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink bankConfirmationDeepLink, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType confirmFlowType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        java.lang.String bankInstrumentId = bankConfirmationDeepLink.getBankInstrumentId();
        if (bankInstrumentId == null) {
            bankInstrumentId = "";
        }
        java.lang.String lastNChars = bankConfirmationDeepLink.getLastNChars();
        navigationScope.replaceTop(new com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination(addFIAnalyticsContext, new com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig(bankInstrumentId, bankAccountType, lastNChars != null ? lastNChars : "", confirmFlowType)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt$BankConfirmationDeepLinkHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt$BankConfirmationDeepLinkHandler$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankConfirmationDeepLinkHandlerKt$BankConfirmationDeepLinkHandler$1$1(com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink bankConfirmationDeepLink, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt$BankConfirmationDeepLinkHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = bankConfirmationDeepLink;
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}
