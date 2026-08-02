package com.paypal.oslo.feature.wallet.banks.ui.details;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/GetBankBannersUiUtil;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "bankAccountDetails", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankBanner;", "invoke", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;)Ljava/util/List;", "", "p0", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetBankBannersUiUtil {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GetBankBannersUiUtil() {
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner> invoke(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails) {
        java.util.List emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountDetails, "");
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation confirmation = bankAccountDetails.getConfirmation();
        boolean contains = bankAccountDetails.getAvailableActions().contains(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.COMPLETE_INSTANT_CONFIRMATION);
        if ((confirmation != null ? confirmation.getState() : null) == com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.INITIATED && confirmation.getStatus() == com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.UNCONFIRMED) {
            java.lang.String initiationTime = confirmation.getInitiationTime();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.Object highSpeedVideoSizes = initiationTime != null ? getHighSpeedVideoSizes(initiationTime) : null;
            int i = com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_banner_check_deposits;
            if (highSpeedVideoSizes == null || (emptyList = kotlin.collections.CollectionsKt.listOf(highSpeedVideoSizes)) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            arrayList.add(new com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner(i, emptyList, com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle.ERROR, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_banner_confirm_your_bank_text, new com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation(bankAccountDetails, true)))));
            if (contains) {
                arrayList.add(new com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_banner_cant_find_deposits_with_link, null, com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle.INFO, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_confirm_instantly_instead, new com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, (java.lang.String) null, (java.util.Map) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig(bankAccountDetails.getId(), com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtilKt.access$toDomainBankAccountType(bankAccountDetails.getType()), bankAccountDetails.getLastNChars(), com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.IBC)))), 2, null));
            }
            return arrayList;
        }
        if ((confirmation != null ? confirmation.getState() : null) != com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.INITIATION_PENDING || confirmation.getStatus() != com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.UNCONFIRMED) {
            if ((confirmation != null ? confirmation.getStatus() : null) != com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.CONFIRMED || !contains) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_banner_upgrade_connection_full, null, com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle.INFO, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_upgrade_your_bank_connection, new com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, (java.lang.String) null, (java.util.Map) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig(bankAccountDetails.getId(), com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtilKt.access$toDomainBankAccountType(bankAccountDetails.getType()), bankAccountDetails.getLastNChars(), com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.UPGRADE)))), 2, null));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_banner_initiation_pending_deposits, null, com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle.WARNING, kotlin.collections.CollectionsKt.emptyList(), 2, null));
        if (contains) {
            arrayList2.add(new com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_confirm_instantly_instead, null, com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle.INFO, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_confirm_instantly_instead, new com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, (java.lang.String) null, (java.util.Map) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig(bankAccountDetails.getId(), com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtilKt.access$toDomainBankAccountType(bankAccountDetails.getType()), bankAccountDetails.getLastNChars(), com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.IBC)))), 2, null));
        }
        return arrayList2;
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String p0) {
        try {
            return java.time.format.DateTimeFormatter.ofPattern(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_DAY_MONTH_YEAR_DATE_FORMAT).withZone(java.time.ZoneId.systemDefault()).format(java.time.Instant.parse(p0));
        } catch (java.time.format.DateTimeParseException unused) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to parse bank confirmation initiation timestamp", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("timestamp", p0)), null, 4, null);
            return null;
        }
    }
}
