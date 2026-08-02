package com.paypal.oslo.feature.settings.featureflags.dynamicconfig;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfigurationImpl;", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "", "", "getEnabledFeatures", "()Ljava/util/Map;", "getLegalLinks", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsDynamicConfigurationImpl implements com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SettingsDynamicConfigurationImpl(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoFpsRangesFor = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration
    public final java.util.Map<java.lang.String, java.lang.Boolean> getEnabledFeatures() {
        return (java.util.Map) this.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.INSTANCE.getAllRows());
    }

    @Override // com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration
    public final java.util.Map<java.lang.String, java.lang.String> getLegalLinks() {
        return (java.util.Map) this.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsLegalConfigSpecs.INSTANCE.getLegalLinks());
    }
}
