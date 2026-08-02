package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletTokenState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVATED", "ACTIVATING", "PENDING_ACTIVATION", com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, "SUSPENDED", com.payair.model.TokenStatusKt.TOKEN_DELETED, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalWalletTokenState {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState ACTIVATED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState ACTIVATING;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState DEACTIVATED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState DELETED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState PENDING_ACTIVATION;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState SUSPENDED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ExternalWalletTokenState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState("ACTIVATED", 0);
        ACTIVATED = externalWalletTokenState;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState("ACTIVATING", 1);
        ACTIVATING = externalWalletTokenState2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState("PENDING_ACTIVATION", 2);
        PENDING_ACTIVATION = externalWalletTokenState3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState(com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, 3);
        DEACTIVATED = externalWalletTokenState4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState("SUSPENDED", 4);
        SUSPENDED = externalWalletTokenState5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState6 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState(com.payair.model.TokenStatusKt.TOKEN_DELETED, 5);
        DELETED = externalWalletTokenState6;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState7 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState("UNKNOWN", 6);
        UNKNOWN = externalWalletTokenState7;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState[] externalWalletTokenStateArr = {externalWalletTokenState, externalWalletTokenState2, externalWalletTokenState3, externalWalletTokenState4, externalWalletTokenState5, externalWalletTokenState6, externalWalletTokenState7};
        getHighResolutionOutputSizeshNQ4ISI = externalWalletTokenStateArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(externalWalletTokenStateArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
