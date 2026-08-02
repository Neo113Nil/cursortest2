package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletTokenState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVATED", "REQUIRES_ACTIVATION", "ACTIVATING", "SUSPENDED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WalletTokenState {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState ACTIVATED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState ACTIVATING;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState REQUIRES_ACTIVATION;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState SUSPENDED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState[] getHighSpeedVideoFpsRangesFor;

    private WalletTokenState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState walletTokenState = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState("ACTIVATED", 0);
        ACTIVATED = walletTokenState;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState walletTokenState2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState("REQUIRES_ACTIVATION", 1);
        REQUIRES_ACTIVATION = walletTokenState2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState walletTokenState3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState("ACTIVATING", 2);
        ACTIVATING = walletTokenState3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState walletTokenState4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState("SUSPENDED", 3);
        SUSPENDED = walletTokenState4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState walletTokenState5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState("UNKNOWN", 4);
        UNKNOWN = walletTokenState5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState[] walletTokenStateArr = {walletTokenState, walletTokenState2, walletTokenState3, walletTokenState4, walletTokenState5};
        getHighSpeedVideoFpsRangesFor = walletTokenStateArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(walletTokenStateArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
