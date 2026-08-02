package com.paypal.oslo.feature.oneonboarding.analytics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "toAnalyticsContexts", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Ljava/util/List;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "toUserIntentContext", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "toAccountCreationFlowContext", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnboardingAnalyticsKt {
    public static final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> toAnalyticsContexts(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        if ((intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) || (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle)) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent(), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.flowContext(intentId)});
        }
        return kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(intentId));
    }

    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext toUserIntentContext(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        if ((intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) || (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle)) {
            return com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent();
        }
        return com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(intentId);
    }

    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext toAccountCreationFlowContext(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        if ((intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) || (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle)) {
            return com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.flowContext(intentId);
        }
        return null;
    }
}
