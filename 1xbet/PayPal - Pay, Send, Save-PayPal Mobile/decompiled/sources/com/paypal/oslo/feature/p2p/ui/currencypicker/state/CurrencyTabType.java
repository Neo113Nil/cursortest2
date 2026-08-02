package com.paypal.oslo.feature.p2p.ui.currencypicker.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/currencypicker/state/CurrencyTabType;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", com.daon.sdk.face.license.License.FEATURE_POSITION, com.visa.cbp.getEncExpo.warmup, "getPosition", "()I", "CASH", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyTabType {
    public static final com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType CASH;
    public static final com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType CRYPTO;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final int position;

    private CurrencyTabType(java.lang.String str, int i, int i2) {
        this.position = i2;
    }

    public final int getPosition() {
        return this.position;
    }

    static {
        com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType currencyTabType = new com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType("CASH", 0, 0);
        CASH = currencyTabType;
        com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType currencyTabType2 = new com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 1, 1);
        CRYPTO = currencyTabType2;
        com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType[] currencyTabTypeArr = {currencyTabType, currencyTabType2};
        Camera2StreamConfigurationMap = currencyTabTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(currencyTabTypeArr);
    }

    public static com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType[] values() {
        return (com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.ui.currencypicker.state.CurrencyTabType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
