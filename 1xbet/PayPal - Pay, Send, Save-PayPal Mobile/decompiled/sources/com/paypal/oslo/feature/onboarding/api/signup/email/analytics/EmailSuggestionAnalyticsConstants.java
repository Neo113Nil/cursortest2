package com.paypal.oslo.feature.onboarding.api.signup.email.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/email/analytics/EmailSuggestionAnalyticsConstants;", "", "<init>", "()V", "", "SCREEN_ID", "Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "SUGGEST_EMAIL_ITEM", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getSUGGEST_EMAIL_ITEM", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ORIGINAL_EMAIL_ITEM", "getORIGINAL_EMAIL_ITEM", "DISMISS_ITEM", "getDISMISS_ITEM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailSuggestionAnalyticsConstants {
    public static final com.paypal.oslo.feature.onboarding.api.signup.email.analytics.EmailSuggestionAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.onboarding.api.signup.email.analytics.EmailSuggestionAnalyticsConstants();
    public static final java.lang.String SCREEN_ID = "suggest_email";
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item SUGGEST_EMAIL_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(SCREEN_ID, 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ORIGINAL_EMAIL_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("original_email", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DISMISS_ITEM = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("dismiss", 0, 2, null);

    private EmailSuggestionAnalyticsConstants() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSUGGEST_EMAIL_ITEM() {
        return SUGGEST_EMAIL_ITEM;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getORIGINAL_EMAIL_ITEM() {
        return ORIGINAL_EMAIL_ITEM;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDISMISS_ITEM() {
        return DISMISS_ITEM;
    }
}
