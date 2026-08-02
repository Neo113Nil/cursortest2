package com.paypal.oslo.feature.cryptocurrency.ui.assetselection;

/* loaded from: classes12.dex */
public final class CryptoAssetSelectionViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.C0336CryptoAssetSelectionViewModel_Factory getHighSpeedVideoSizes;

    private CryptoAssetSelectionViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.C0336CryptoAssetSelectionViewModel_Factory c0336CryptoAssetSelectionViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0336CryptoAssetSelectionViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel create(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType) {
        return this.getHighSpeedVideoSizes.get(assetSelectionOperationType);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.C0336CryptoAssetSelectionViewModel_Factory c0336CryptoAssetSelectionViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel_Factory_Impl(c0336CryptoAssetSelectionViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.C0336CryptoAssetSelectionViewModel_Factory c0336CryptoAssetSelectionViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel_Factory_Impl(c0336CryptoAssetSelectionViewModel_Factory));
    }
}
