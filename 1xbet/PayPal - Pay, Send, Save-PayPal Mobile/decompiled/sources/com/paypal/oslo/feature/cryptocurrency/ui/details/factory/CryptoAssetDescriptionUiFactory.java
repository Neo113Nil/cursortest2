package com.paypal.oslo.feature.cryptocurrency.ui.details.factory;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/factory/CryptoAssetDescriptionUiFactory;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;)V", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/CryptoAssetDescriptionUiState;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/CryptoAssetDescriptionUiState;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoAssetDescriptionUiFactory {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CryptoAssetDescriptionUiFactory(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRanges = featureGateManager;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState create(java.lang.String assetSymbol) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        java.util.Iterator<E> it = com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol) obj).name(), assetSymbol)) {
                break;
            }
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol cryptoAssetSymbol = (com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol) obj;
        if (cryptoAssetSymbol == null) {
            return null;
        }
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState(cryptoAssetSymbol.getDescriptionResId(), cryptoAssetSymbol == com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol.PYUSD ? null : java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_exchange_rate_disclaimer), com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_regulatory_disclaimer, this.getHighSpeedVideoFpsRanges.isPpdDisclaimersEnabled() ? java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_hub_ppd_disclosure) : null, com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory.WhenMappings.$EnumSwitchMapping$0[cryptoAssetSymbol.ordinal()] == 1 ? "https://www.paypal.com/us/webapps/mpp/ua/cryptocurrencies-tnc" : null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol.PYUSD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
