package com.paypal.oslo.feature.verificationcapture.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0018\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/common/VerificationCaptureFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "twoSidedCaptureEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getTwoSidedCaptureEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "twoSidedCaptureEnabled", "barcodeDetectionEnabled$delegate", "getBarcodeDetectionEnabled", "barcodeDetectionEnabled", "allowManualCapture$delegate", "getAllowManualCapture", "allowManualCapture", "useBackendErrorMessages$delegate", "getUseBackendErrorMessages", "useBackendErrorMessages", "featureEnabled$delegate", "getFeatureEnabled", "featureEnabled", "livenessDetectionEnabled$delegate", "getLivenessDetectionEnabled", "livenessDetectionEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationCaptureFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates INSTANCE;

    /* renamed from: allowManualCapture$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty allowManualCapture;

    /* renamed from: barcodeDetectionEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty barcodeDetectionEnabled;

    /* renamed from: featureEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty featureEnabled;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.class, "twoSidedCaptureEnabled", "getTwoSidedCaptureEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.class, "barcodeDetectionEnabled", "getBarcodeDetectionEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.class, "allowManualCapture", "getAllowManualCapture()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.class, "useBackendErrorMessages", "getUseBackendErrorMessages()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.class, "featureEnabled", "getFeatureEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates.class, "livenessDetectionEnabled", "getLivenessDetectionEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: livenessDetectionEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty livenessDetectionEnabled;

    /* renamed from: twoSidedCaptureEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty twoSidedCaptureEnabled;

    /* renamed from: useBackendErrorMessages$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty useBackendErrorMessages;

    private VerificationCaptureFeatureGates() {
        super("verification-capture");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getTwoSidedCaptureEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) twoSidedCaptureEnabled.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getBarcodeDetectionEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) barcodeDetectionEnabled.getValue(this, getHighResolutionOutputSizeshNQ4ISI[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAllowManualCapture() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) allowManualCapture.getValue(this, getHighResolutionOutputSizeshNQ4ISI[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getUseBackendErrorMessages() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) useBackendErrorMessages.getValue(this, getHighResolutionOutputSizeshNQ4ISI[3]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getFeatureEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) featureEnabled.getValue(this, getHighResolutionOutputSizeshNQ4ISI[4]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getLivenessDetectionEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) livenessDetectionEnabled.getValue(this, getHighResolutionOutputSizeshNQ4ISI[5]);
    }

    static {
        com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates verificationCaptureFeatureGates = new com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureFeatureGates();
        INSTANCE = verificationCaptureFeatureGates;
        twoSidedCaptureEnabled = verificationCaptureFeatureGates.create("two_sided_capture_enabled");
        barcodeDetectionEnabled = verificationCaptureFeatureGates.create("barcode_detection_enabled");
        allowManualCapture = verificationCaptureFeatureGates.create("allow_manual_capture");
        useBackendErrorMessages = verificationCaptureFeatureGates.create("use_backend_error_messages");
        featureEnabled = verificationCaptureFeatureGates.create("feature_enabled");
        livenessDetectionEnabled = verificationCaptureFeatureGates.create("liveness_detection_enabled");
        $stable = 8;
    }
}
