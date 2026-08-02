package com.paypal.oslo.feature.dataprivacy.config;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfigurationImpl;", "Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "", "", "getL2EnabledFeatures", "()Ljava/util/Map;", "isNativeDownloadEnabled", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataPrivacyDynamicConfigurationImpl implements com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DataPrivacyDynamicConfigurationImpl(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoFpsRangesFor = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration
    public final java.util.Map<java.lang.String, java.lang.Boolean> getL2EnabledFeatures() {
        return (java.util.Map) this.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2EnabledFeaturesSpecs.INSTANCE.getAllRows());
    }

    @Override // com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration
    public final boolean isNativeDownloadEnabled() {
        return java.lang.Boolean.parseBoolean((java.lang.String) this.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.dataprivacy.config.DataPrivacyNativeDownloadSpec.INSTANCE.getEnabled()));
    }
}
