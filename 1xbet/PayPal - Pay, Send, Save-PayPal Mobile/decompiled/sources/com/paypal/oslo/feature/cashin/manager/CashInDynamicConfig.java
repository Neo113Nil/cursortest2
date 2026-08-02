package com.paypal.oslo.feature.cashin.manager;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/manager/CashInDynamicConfig;", "Lcom/paypal/oslo/feature/cashin/manager/CashInDynamicConfiguration;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfigManager", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighResolutionOutputSizeshNQ4ISI", "", "getTransactionTimeDelay", "()Ljava/lang/String;", "transactionTimeDelay", "getTransactionMinLimitPerDay", "transactionMinLimitPerDay", "getTransactionMaxLimitPerMonth", "transactionMaxLimitPerMonth", "getMinLimitPerTransaction", "minLimitPerTransaction", "getMaxLimitPerTransaction", "maxLimitPerTransaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CashInDynamicConfig implements com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CashInDynamicConfig(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighResolutionOutputSizeshNQ4ISI = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration
    public final java.lang.String getTransactionTimeDelay() {
        return (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.cashin.manager.CashInConfigs.getHighResolutionOutputSizeshNQ4ISI.getValue(com.paypal.oslo.feature.cashin.manager.CashInConfigs.INSTANCE, com.paypal.oslo.feature.cashin.manager.CashInConfigs.getHighResolutionOutputSizeshNQ4ISI[0]));
    }

    @Override // com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration
    public final java.lang.String getTransactionMinLimitPerDay() {
        return (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.cashin.manager.CashInConfigs.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.cashin.manager.CashInConfigs.INSTANCE, com.paypal.oslo.feature.cashin.manager.CashInConfigs.getHighResolutionOutputSizeshNQ4ISI[1]));
    }

    @Override // com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration
    public final java.lang.String getTransactionMaxLimitPerMonth() {
        return (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.cashin.manager.CashInConfigs.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.cashin.manager.CashInConfigs.INSTANCE, com.paypal.oslo.feature.cashin.manager.CashInConfigs.getHighResolutionOutputSizeshNQ4ISI[2]));
    }

    @Override // com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration
    public final java.lang.String getMinLimitPerTransaction() {
        return (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.cashin.manager.CashInConfigs.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.cashin.manager.CashInConfigs.INSTANCE, com.paypal.oslo.feature.cashin.manager.CashInConfigs.getHighResolutionOutputSizeshNQ4ISI[3]));
    }

    @Override // com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration
    public final java.lang.String getMaxLimitPerTransaction() {
        return (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.cashin.manager.CashInConfigs.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.cashin.manager.CashInConfigs.INSTANCE, com.paypal.oslo.feature.cashin.manager.CashInConfigs.getHighResolutionOutputSizeshNQ4ISI[4]));
    }
}
