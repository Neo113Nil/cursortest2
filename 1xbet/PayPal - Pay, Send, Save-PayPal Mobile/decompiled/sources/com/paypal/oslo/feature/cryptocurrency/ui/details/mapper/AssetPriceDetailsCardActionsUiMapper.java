package com.paypal.oslo.feature.cryptocurrency.ui.details.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/mapper/AssetPriceDetailsCardActionsUiMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/AssetCapabilities;", "capabilitiesState", "", "totalHoldingValue", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsCardActionsUiState;", "map", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/AssetCapabilities;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsCardActionsUiState;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AssetPriceDetailsCardActionsUiMapper {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AssetPriceDetailsCardActionsUiMapper(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoSizes = featureGateManager;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState map(com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities capabilitiesState, java.lang.String totalHoldingValue) {
        java.lang.Double doubleOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capabilitiesState, "");
        boolean z = (totalHoldingValue == null || (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(totalHoldingValue)) == null || doubleOrNull.doubleValue() <= 0.0d) ? false : true;
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState(capabilitiesState.isBuyEnabled(), capabilitiesState.isSellEnabled() && z, this.getHighSpeedVideoSizes.isReceiveFeatureEnabled() && capabilitiesState.isReceiveEnabled() && z, this.getHighSpeedVideoSizes.isSendFeatureEnabled() && capabilitiesState.isSendEnabled() && z, this.getHighSpeedVideoSizes.isConvertToPYUSDEnabled() && capabilitiesState.isSwapEnabled() && z);
    }
}
