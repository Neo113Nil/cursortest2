package com.paypal.oslo.feature.oneonboarding.api.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/analytics/AccountCreationFlowAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "flowContext", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "PRODUCT_MOBILE_ONBOARDING", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "getPRODUCT_MOBILE_ONBOARDING", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "", "Feature", "Ljava/lang/String;", "ActionSignup", "ErrorTypePage", "ErrorTypeField", "FlowNameManualSignupFromEmail", "FlowNameManualSignupFromPhone", "FlowNameSignupWithGoogle", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "AccountCreationUserIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getAccountCreationUserIntent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountCreationFlowAnalytics {
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext AccountCreationUserIntent;
    public static final java.lang.String ActionSignup = "signup";
    public static final java.lang.String ErrorTypeField = "field";
    public static final java.lang.String ErrorTypePage = "page";
    public static final java.lang.String Feature = "account_creation";
    public static final java.lang.String FlowNameManualSignupFromEmail = "manual_signup_from_email";
    public static final java.lang.String FlowNameManualSignupFromPhone = "manual_signup_from_phone";
    public static final java.lang.String FlowNameSignupWithGoogle = "signup_with_google";
    public static final com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.Product PRODUCT_MOBILE_ONBOARDING;

    private AccountCreationFlowAnalytics() {
    }

    static {
        com.paypal.oslo.core.telemetry.analytics.schema.Product product = com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_ONBOARDING;
        PRODUCT_MOBILE_ONBOARDING = product;
        AccountCreationUserIntent = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(product, "account_creation", "signup");
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.Product getPRODUCT_MOBILE_ONBOARDING() {
        return PRODUCT_MOBILE_ONBOARDING;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getAccountCreationUserIntent() {
        return AccountCreationUserIntent;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flowContext(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) {
            str = ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) intentId).getPhone() != null ? "manual_signup_from_phone" : "manual_signup_from_email";
        } else {
            str = intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle ? FlowNameSignupWithGoogle : "unknown";
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(str, null);
    }
}
