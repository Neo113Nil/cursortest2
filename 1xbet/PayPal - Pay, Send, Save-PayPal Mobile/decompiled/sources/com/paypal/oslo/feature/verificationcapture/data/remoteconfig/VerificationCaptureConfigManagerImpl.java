package com.paypal.oslo.feature.verificationcapture.data.remoteconfig;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/remoteconfig/VerificationCaptureConfigManagerImpl;", "Lcom/paypal/oslo/feature/verificationcapture/domain/remoteconfig/VerificationCaptureConfig$Manager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "isFeatureEnabled", "()Z", "isTwoSidedCaptureEnabled", "isLivenessDetectionEnabled", "isBarcodeDetectionEnabled", "isManualCaptureAllowed", "useBackendErrorMessages", "", "getTwoSidedCaptureConfig", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/TwoSidedCaptureRule;", "getTwoSidedCaptureRules", "()Ljava/util/List;", "client", "product", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "documentType", "requiresTwoSidedCapture", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationCaptureConfigManagerImpl implements com.paypal.oslo.feature.verificationcapture.domain.remoteconfig.VerificationCaptureConfig.Manager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public VerificationCaptureConfigManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.Camera2StreamConfigurationMap = featureGate;
        this.getHighSpeedVideoSizes = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.remoteconfig.VerificationCaptureConfig.Manager
    public final boolean isFeatureEnabled() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.INSTANCE.getFeatureEnabled());
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.remoteconfig.VerificationCaptureConfig.Manager
    public final boolean isTwoSidedCaptureEnabled() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.INSTANCE.getTwoSidedCaptureEnabled());
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.remoteconfig.VerificationCaptureConfig.Manager
    public final boolean isLivenessDetectionEnabled() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.INSTANCE.getLivenessDetectionEnabled());
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.remoteconfig.VerificationCaptureConfig.Manager
    public final boolean isBarcodeDetectionEnabled() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.INSTANCE.getBarcodeDetectionEnabled());
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.remoteconfig.VerificationCaptureConfig.Manager
    public final boolean isManualCaptureAllowed() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.INSTANCE.getAllowManualCapture());
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.remoteconfig.VerificationCaptureConfig.Manager
    public final boolean useBackendErrorMessages() {
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.INSTANCE.getUseBackendErrorMessages());
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.remoteconfig.VerificationCaptureConfig.Manager
    public final java.lang.String getTwoSidedCaptureConfig() {
        return (java.lang.String) this.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureDynamicConfigs.INSTANCE.getTwoSidedCapture());
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.remoteconfig.VerificationCaptureConfig.Manager
    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.TwoSidedCaptureRule> getTwoSidedCaptureRules() {
        return com.paypal.oslo.feature.verificationcapture.data.remoteconfig.TwoSidedCaptureConfigParser.INSTANCE.parse(getTwoSidedCaptureConfig());
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.remoteconfig.VerificationCaptureConfig.Manager
    public final boolean requiresTwoSidedCapture(java.lang.String client, java.lang.String product, java.lang.String flowName, java.lang.String country, java.lang.String documentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        return com.paypal.oslo.feature.verificationcapture.data.remoteconfig.TwoSidedCaptureConfigParser.INSTANCE.matches(getTwoSidedCaptureConfig(), client, product, flowName, country, documentType);
    }
}
