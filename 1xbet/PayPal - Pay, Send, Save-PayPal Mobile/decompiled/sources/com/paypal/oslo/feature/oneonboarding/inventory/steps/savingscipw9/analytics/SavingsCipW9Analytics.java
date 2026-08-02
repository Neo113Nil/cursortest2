package com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.analytics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/savingscipw9/analytics/SavingsCipW9Analytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "trackW9InstructionPressed$one_onboarding_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "", "SCREEN_ID_CIP_FULL", "Ljava/lang/String;", "ITEM_W9_INSTRUCTION", "ITEM_CONFIRM_AND_SUBMIT", "MODULE_DOB", "MODULE_SSN", "MODULE_ITIN", "ERROR_DOB_VALIDATION_FAILED", "ERROR_SSN_VALIDATION_FAILED", "ERROR_ITIN_VALIDATION_FAILED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SavingsCipW9Analytics {
    public static final int $stable = 0;
    public static final java.lang.String ERROR_DOB_VALIDATION_FAILED = "dob_validation_failed";
    public static final java.lang.String ERROR_ITIN_VALIDATION_FAILED = "itin_validation_failed";
    public static final java.lang.String ERROR_SSN_VALIDATION_FAILED = "ssn_validation_failed";
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.analytics.SavingsCipW9Analytics INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.analytics.SavingsCipW9Analytics();
    public static final java.lang.String ITEM_CONFIRM_AND_SUBMIT = "confirm_and_submit";
    public static final java.lang.String ITEM_W9_INSTRUCTION = "w9_instruction";
    public static final java.lang.String MODULE_DOB = "dob";
    public static final java.lang.String MODULE_ITIN = "id_number_itin";
    public static final java.lang.String MODULE_SSN = "id_number_ssn";
    public static final java.lang.String SCREEN_ID_CIP_FULL = "cip_full";

    private SavingsCipW9Analytics() {
    }

    public final void trackW9InstructionPressed$one_onboarding_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("cip_full"), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("w9_instruction", 0, 2, null), 6, null), com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(intentId), null, 4, null).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }
}
