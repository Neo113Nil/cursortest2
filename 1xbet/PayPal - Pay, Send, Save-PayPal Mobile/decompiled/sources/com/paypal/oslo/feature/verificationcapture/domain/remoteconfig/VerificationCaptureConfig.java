package com.paypal.oslo.feature.verificationcapture.domain.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/remoteconfig/VerificationCaptureConfig;", "", "Manager"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface VerificationCaptureConfig {

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH&¢\u0006\u0004\b\u0016\u0010\u0017À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/remoteconfig/VerificationCaptureConfig$Manager;", "", "", "isFeatureEnabled", "()Z", "isTwoSidedCaptureEnabled", "isLivenessDetectionEnabled", "isBarcodeDetectionEnabled", "isManualCaptureAllowed", "useBackendErrorMessages", "", "getTwoSidedCaptureConfig", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/TwoSidedCaptureRule;", "getTwoSidedCaptureRules", "()Ljava/util/List;", "client", "product", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "documentType", "requiresTwoSidedCapture", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Manager {
        java.lang.String getTwoSidedCaptureConfig();

        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.TwoSidedCaptureRule> getTwoSidedCaptureRules();

        boolean isBarcodeDetectionEnabled();

        boolean isFeatureEnabled();

        boolean isLivenessDetectionEnabled();

        boolean isManualCaptureAllowed();

        boolean isTwoSidedCaptureEnabled();

        boolean requiresTwoSidedCapture(java.lang.String client, java.lang.String product, java.lang.String flowName, java.lang.String country, java.lang.String documentType);

        boolean useBackendErrorMessages();
    }
}
