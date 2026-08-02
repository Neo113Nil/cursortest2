package com.paypal.oslo.feature.p2p.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NavigationModule$provideP2PEntryProviderInstaller$1$3$10$1 implements kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultRequestId, com.paypal.oslo.feature.p2p.domain.model.FundingSource, kotlin.Unit> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId, com.paypal.oslo.feature.p2p.domain.model.FundingSource fundingSource) {
        java.lang.String m11592unboximpl = navResultRequestId.m11592unboximpl();
        com.paypal.oslo.feature.p2p.domain.model.FundingSource fundingSource2 = fundingSource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m11592unboximpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSource2, "");
        java.lang.String id = fundingSource2.getId();
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType walletBankAccountType = com.paypal.oslo.feature.p2p.ui.review.mappers.BankAccountTypeMapperKt.toWalletBankAccountType(fundingSource2.getBankAccountType());
        java.lang.String lastNChars = fundingSource2.getLastNChars();
        final com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig confirmBankConfig = new com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig(id, walletBankAccountType, lastNChars != null ? lastNChars : "", com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.RECONNECT);
        this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(m11592unboximpl, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$10$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$3$10$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig confirmBankConfig, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.P2P, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), confirmBankConfig));
        return kotlin.Unit.INSTANCE;
    }

    NavigationModule$provideP2PEntryProviderInstaller$1$3$10$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }
}
