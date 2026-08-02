package com.paypal.oslo.feature.checkcapture.data.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/data/remoteconfig/CheckCaptureConfigManagerImpl;", "Lcom/paypal/oslo/feature/checkcapture/domain/remoteconfig/CheckCaptureConfig$Manager;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "getIngoBaseUrl", "()Ljava/lang/String;", "getIngoPrivacyPolicyUrl", "getIngoTermsAndConditionsUrl", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckCaptureConfigManagerImpl implements com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CheckCaptureConfigManagerImpl(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.Camera2StreamConfigurationMap = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager
    public final java.lang.String getIngoBaseUrl() {
        return (java.lang.String) this.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Configs.INSTANCE.getIngoBaseUrl());
    }

    @Override // com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager
    public final java.lang.String getIngoPrivacyPolicyUrl() {
        return (java.lang.String) this.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Configs.INSTANCE.getIngoPrivacyPolicyUrl());
    }

    @Override // com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Manager
    public final java.lang.String getIngoTermsAndConditionsUrl() {
        return (java.lang.String) this.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.checkcapture.domain.remoteconfig.CheckCaptureConfig.Configs.INSTANCE.getIngoTermsAndConditionsUrl());
    }
}
