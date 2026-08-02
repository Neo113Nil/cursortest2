package com.paypal.oslo.feature.identity.api.navigation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/PasskeyDestinationAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "getHighSpeedVideoFpsRangesFor", "", "SCREEN_MANAGEMENT", "Ljava/lang/String;", "SCREEN_ENROLLMENT", "SCREEN_LIST", "SCREEN_HOW_PASSKEYS_WORK", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "viewPasskeyManagement", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getViewPasskeyManagement", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "viewPasskeyEnrollment", "getViewPasskeyEnrollment", "viewPasskeyList", "getViewPasskeyList", "viewHowPasskeysWork", "getViewHowPasskeysWork"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyDestinationAnalytics {
    public static final com.paypal.oslo.feature.identity.api.navigation.PasskeyDestinationAnalytics INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.PasskeyDestinationAnalytics();
    public static final java.lang.String SCREEN_ENROLLMENT = "passkey_enrollment";
    public static final java.lang.String SCREEN_HOW_PASSKEYS_WORK = "passkey_how_passkeys_work";
    public static final java.lang.String SCREEN_LIST = "passkey_list";
    public static final java.lang.String SCREEN_MANAGEMENT = "passkey_management";

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final com.paypal.oslo.core.telemetry.analytics.schema.Product getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext viewHowPasskeysWork;
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext viewPasskeyEnrollment;
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext viewPasskeyList;
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext viewPasskeyManagement;

    private PasskeyDestinationAnalytics() {
    }

    static {
        com.paypal.oslo.core.telemetry.analytics.schema.Product product = com.paypal.oslo.core.telemetry.analytics.schema.Product.IDENTITY;
        getHighSpeedVideoFpsRangesFor = product;
        viewPasskeyManagement = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(product, com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.FEATURE, "passkey_management_viewed");
        viewPasskeyEnrollment = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(product, com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.FEATURE, "passkey_enrollment_viewed");
        viewPasskeyList = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(product, com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.FEATURE, "passkey_list_viewed");
        viewHowPasskeysWork = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(product, com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.FEATURE, "passkey_how_passkeys_work_viewed");
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getViewPasskeyManagement() {
        return viewPasskeyManagement;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getViewPasskeyEnrollment() {
        return viewPasskeyEnrollment;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getViewPasskeyList() {
        return viewPasskeyList;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getViewHowPasskeysWork() {
        return viewHowPasskeysWork;
    }
}
