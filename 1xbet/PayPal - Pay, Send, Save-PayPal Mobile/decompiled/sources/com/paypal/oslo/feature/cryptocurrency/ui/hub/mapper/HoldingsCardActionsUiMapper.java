package com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/mapper/HoldingsCardActionsUiMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/CryptoUserCapabilities;", "cryptoUserCapabilities", "", "totalHoldingValue", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/HoldingsCardActionsUiState;", "map", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/CryptoUserCapabilities;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/HoldingsCardActionsUiState;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HoldingsCardActionsUiMapper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public HoldingsCardActionsUiMapper(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureGateManager;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState map(com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.CryptoUserCapabilities cryptoUserCapabilities, java.lang.String totalHoldingValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoUserCapabilities, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalHoldingValue, "");
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(totalHoldingValue);
        boolean z = doubleOrNull != null && doubleOrNull.doubleValue() > 0.0d;
        boolean isReceiveFeatureEnabled = this.getHighResolutionOutputSizeshNQ4ISI.isReceiveFeatureEnabled();
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState(cryptoUserCapabilities.isBuyEnabled(), cryptoUserCapabilities.isSellEnabled() && z, isReceiveFeatureEnabled && !z, isReceiveFeatureEnabled && z, this.getHighResolutionOutputSizeshNQ4ISI.isSendFeatureEnabled() && cryptoUserCapabilities.isSendEnabled() && z, this.getHighResolutionOutputSizeshNQ4ISI.isConvertToPYUSDEnabled() && cryptoUserCapabilities.isSwapEnabled() && z);
    }
}
