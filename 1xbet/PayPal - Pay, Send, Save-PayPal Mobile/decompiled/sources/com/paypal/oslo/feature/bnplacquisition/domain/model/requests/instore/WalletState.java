package com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/WalletState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVATED", "ACTIVATING", com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, "PENDING_ACTIVATION", "SUSPENDED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WalletState {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState ACTIVATED;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState ACTIVATING;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState DEACTIVATED;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState PENDING_ACTIVATION;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState SUSPENDED;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState[] getHighResolutionOutputSizeshNQ4ISI;

    private WalletState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState walletState = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState("ACTIVATED", 0);
        ACTIVATED = walletState;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState walletState2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState("ACTIVATING", 1);
        ACTIVATING = walletState2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState walletState3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState(com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED, 2);
        DEACTIVATED = walletState3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState walletState4 = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState("PENDING_ACTIVATION", 3);
        PENDING_ACTIVATION = walletState4;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState walletState5 = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState("SUSPENDED", 4);
        SUSPENDED = walletState5;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState walletState6 = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState("UNKNOWN", 5);
        UNKNOWN = walletState6;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState[] walletStateArr = {walletState, walletState2, walletState3, walletState4, walletState5, walletState6};
        getHighResolutionOutputSizeshNQ4ISI = walletStateArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(walletStateArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
