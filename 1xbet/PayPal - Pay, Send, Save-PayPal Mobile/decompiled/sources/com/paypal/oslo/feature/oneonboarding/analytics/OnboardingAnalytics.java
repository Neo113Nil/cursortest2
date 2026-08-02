package com.paypal.oslo.feature.oneonboarding.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/analytics/OnboardingAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "PRODUCT", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "getPRODUCT", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "", "ACTION_PROVISION_PRODUCT", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnboardingAnalytics {
    public static final int $stable = 0;
    public static final java.lang.String ACTION_PROVISION_PRODUCT = "provision_product";
    public static final com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalytics INSTANCE = new com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.Product PRODUCT = com.paypal.oslo.core.telemetry.analytics.schema.Product.PRODUCT_ONBOARDING;

    private OnboardingAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.Product getPRODUCT() {
        return PRODUCT;
    }
}
