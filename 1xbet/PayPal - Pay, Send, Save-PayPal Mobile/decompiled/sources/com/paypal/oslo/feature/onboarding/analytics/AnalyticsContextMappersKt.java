package com.paypal.oslo.feature.onboarding.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/analytics/UserIntent;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "toUserIntentContext", "(Lcom/paypal/oslo/feature/onboarding/api/analytics/UserIntent;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "Lcom/paypal/oslo/feature/onboarding/api/analytics/BusinessFlow;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "toBusinessFlowContext", "(Lcom/paypal/oslo/feature/onboarding/api/analytics/BusinessFlow;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnalyticsContextMappersKt {
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext toUserIntentContext(com.paypal.oslo.feature.onboarding.api.analytics.UserIntent userIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(userIntent.getProduct(), userIntent.getFeature(), userIntent.getAction());
    }

    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext toBusinessFlowContext(com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow businessFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlow, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(businessFlow.getName(), businessFlow.getAttemptId());
    }
}
