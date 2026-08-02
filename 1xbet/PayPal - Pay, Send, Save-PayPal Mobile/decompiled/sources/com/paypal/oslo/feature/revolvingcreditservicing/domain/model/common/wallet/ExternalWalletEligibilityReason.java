package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;", "", "<init>", "(Ljava/lang/String;I)V", "CARD_IN_WALLET", "CARD_NOT_IN_WALLET", "CARD_PENDING_ACTIVATION", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalWalletEligibilityReason {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason CARD_IN_WALLET;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason CARD_NOT_IN_WALLET;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason CARD_PENDING_ACTIVATION;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private ExternalWalletEligibilityReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason("CARD_IN_WALLET", 0);
        CARD_IN_WALLET = externalWalletEligibilityReason;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason("CARD_NOT_IN_WALLET", 1);
        CARD_NOT_IN_WALLET = externalWalletEligibilityReason2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason("CARD_PENDING_ACTIVATION", 2);
        CARD_PENDING_ACTIVATION = externalWalletEligibilityReason3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason("UNKNOWN", 3);
        UNKNOWN = externalWalletEligibilityReason4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason[] externalWalletEligibilityReasonArr = {externalWalletEligibilityReason, externalWalletEligibilityReason2, externalWalletEligibilityReason3, externalWalletEligibilityReason4};
        Camera2StreamConfigurationMap = externalWalletEligibilityReasonArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(externalWalletEligibilityReasonArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
