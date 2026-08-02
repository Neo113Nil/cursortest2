package com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.analytics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cipw9/analytics/CIPW9StepAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "errorDescription", "", "trackDobFieldError$one_onboarding_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;", "taxpayerIdType", "trackTaxpayerIdFieldError$one_onboarding_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;Ljava/lang/String;)V", "SCREEN_ID_CIP_FULL", "Ljava/lang/String;", "ITEM_BACK", "ITEM_W9_INSTRUCTION", "ITEM_CONFIRM_AND_SUBMIT", "MODULE_DOB", "MODULE_ID_TYPE", "MODULE_SSN", "MODULE_ITIN", "MODULE_COMPRESSED_ADDRESS", "MODULE_W9_CONSENT", "ERROR_DOB_VALIDATION_FAILED", "ERROR_ITIN_VALIDATION_FAILED", "ERROR_SSN_VALIDATION_FAILED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CIPW9StepAnalytics {
    public static final int $stable = 0;
    public static final java.lang.String ERROR_DOB_VALIDATION_FAILED = "dob_validation_failed";
    public static final java.lang.String ERROR_ITIN_VALIDATION_FAILED = "itin_validation_failed";
    public static final java.lang.String ERROR_SSN_VALIDATION_FAILED = "ssn_validation_failed";
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.analytics.CIPW9StepAnalytics INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.steps.cipw9.analytics.CIPW9StepAnalytics();
    public static final java.lang.String ITEM_BACK = "back";
    public static final java.lang.String ITEM_CONFIRM_AND_SUBMIT = "confirm_and_submit";
    public static final java.lang.String ITEM_W9_INSTRUCTION = "w9_instruction";
    public static final java.lang.String MODULE_COMPRESSED_ADDRESS = "compressed_address";
    public static final java.lang.String MODULE_DOB = "dob";
    public static final java.lang.String MODULE_ID_TYPE = "id_type";
    public static final java.lang.String MODULE_ITIN = "id_number_itin";
    public static final java.lang.String MODULE_SSN = "id_number_ssn";
    public static final java.lang.String MODULE_W9_CONSENT = "w9_consent";
    public static final java.lang.String SCREEN_ID_CIP_FULL = "cip_full";

    private CIPW9StepAnalytics() {
    }

    public final void trackDobFieldError$one_onboarding_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String errorDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
        com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.trackFieldError(intentId, "cip_full", "dob", com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalytics.ACTION_PROVISION_PRODUCT, "dob_validation_failed", errorDescription);
    }

    public final void trackTaxpayerIdFieldError$one_onboarding_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType, java.lang.String errorDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
        boolean z = taxpayerIdType == com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN || taxpayerIdType == com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN4;
        com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.trackFieldError(intentId, "cip_full", z ? "id_number_itin" : "id_number_ssn", com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalytics.ACTION_PROVISION_PRODUCT, z ? "itin_validation_failed" : "ssn_validation_failed", errorDescription);
    }
}
