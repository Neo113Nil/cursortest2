package com.paypal.oslo.feature.cryptocurrency.ui.common.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/CryptoAssetSymbol;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "descriptionResId", com.visa.cbp.getEncExpo.warmup, "getDescriptionResId$cryptocurrency_prodRelease", "()I", "BTC", "ETH", "BCH", "LTC", "PYUSD", "LINK", "SOL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoAssetSymbol {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol BCH;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol BTC;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol ETH;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol LINK;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol LTC;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol PYUSD;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol SOL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final int descriptionResId;

    private CryptoAssetSymbol(java.lang.String str, int i, int i2) {
        this.descriptionResId = i2;
    }

    /* renamed from: getDescriptionResId$cryptocurrency_prodRelease, reason: from getter */
    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol cryptoAssetSymbol = new com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol("BTC", 0, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_btc_description);
        BTC = cryptoAssetSymbol;
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol cryptoAssetSymbol2 = new com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol("ETH", 1, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_eth_description);
        ETH = cryptoAssetSymbol2;
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol cryptoAssetSymbol3 = new com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol("BCH", 2, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_bch_description);
        BCH = cryptoAssetSymbol3;
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol cryptoAssetSymbol4 = new com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol("LTC", 3, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_ltc_description);
        LTC = cryptoAssetSymbol4;
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol cryptoAssetSymbol5 = new com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol("PYUSD", 4, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_pyusd_description);
        PYUSD = cryptoAssetSymbol5;
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol cryptoAssetSymbol6 = new com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol("LINK", 5, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_link_description);
        LINK = cryptoAssetSymbol6;
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol cryptoAssetSymbol7 = new com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol("SOL", 6, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_sol_description);
        SOL = cryptoAssetSymbol7;
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol[] cryptoAssetSymbolArr = {cryptoAssetSymbol, cryptoAssetSymbol2, cryptoAssetSymbol3, cryptoAssetSymbol4, cryptoAssetSymbol5, cryptoAssetSymbol6, cryptoAssetSymbol7};
        Camera2StreamConfigurationMap = cryptoAssetSymbolArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cryptoAssetSymbolArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
