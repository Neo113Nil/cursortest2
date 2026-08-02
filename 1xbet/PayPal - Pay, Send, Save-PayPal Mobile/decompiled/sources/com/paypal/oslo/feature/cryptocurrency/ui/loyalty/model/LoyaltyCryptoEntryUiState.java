package com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/loyalty/model/LoyaltyCryptoEntryUiState;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyCryptoEntryUiState {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState ERROR;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState LOADING;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState[] getHighSpeedVideoFpsRangesFor;

    private LoyaltyCryptoEntryUiState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState loyaltyCryptoEntryUiState = new com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState("LOADING", 0);
        LOADING = loyaltyCryptoEntryUiState;
        com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState loyaltyCryptoEntryUiState2 = new com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState("ERROR", 1);
        ERROR = loyaltyCryptoEntryUiState2;
        com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState[] loyaltyCryptoEntryUiStateArr = {loyaltyCryptoEntryUiState, loyaltyCryptoEntryUiState2};
        getHighSpeedVideoFpsRangesFor = loyaltyCryptoEntryUiStateArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(loyaltyCryptoEntryUiStateArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
