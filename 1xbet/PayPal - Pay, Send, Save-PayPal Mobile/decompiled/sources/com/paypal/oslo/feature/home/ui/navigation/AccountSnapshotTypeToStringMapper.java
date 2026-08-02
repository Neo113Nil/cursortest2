package com.paypal.oslo.feature.home.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/AccountSnapshotTypeToStringMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "type", "", "map", "(Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountSnapshotTypeToStringMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.navigation.AccountSnapshotTypeToStringMapper INSTANCE = new com.paypal.oslo.feature.home.ui.navigation.AccountSnapshotTypeToStringMapper();

    private AccountSnapshotTypeToStringMapper() {
    }

    public final java.lang.String map(com.paypal.oslo.feature.home.api.AccountSnapshotType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalBalance) {
            return "balance";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.Crypto) {
            return "crypto";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PayLater) {
            return "pay-later";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.Rewards) {
            return "rewards";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.Savings) {
            return "savings";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.Disabled) {
            return "disabled";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PyUsd) {
            return com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyusdItemFactoryKt.AccountSnapshotPyUsdId;
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.AddPaymentMethod) {
            return com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AddPaymentMethodItemFactoryKt.AddPaymentMethodSnapshotId;
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalMastercard) {
            return "paypal-mastercard";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.CreditCardUS) {
            return "credit-card-us";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalCredit) {
            return "paypal-credit";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.EbayMastercard) {
            return "ebay-mastercard";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalConsumerRewards) {
            return "consumer-rewards";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.SmartConnect) {
            return "smart-connect";
        }
        if (type instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.CashbackMastercard) {
            return "cashback";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
