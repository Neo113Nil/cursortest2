package com.paypal.oslo.feature.oneonboarding.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "", "toOneOnboardingFeature", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "toProvisionUserIntent", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "intentId", "screenId", "moduleName", "action", "errorCode", "errorDescription", "", "trackFieldError", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "trackPageError", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProvisioningAnalyticsKt {
    public static final java.lang.String toOneOnboardingFeature(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        if (!(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle) && !(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings) && !(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto) && !(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro) && !(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds) && !(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) && !(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String value = intentId.getValue();
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = value.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext toProvisionUserIntent(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalytics.INSTANCE.getPRODUCT(), toOneOnboardingFeature(intentId), com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalytics.ACTION_PROVISION_PRODUCT);
    }

    public static final void trackFieldError(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(str2, 0, null, null, 14, null), null, null, 12, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalytics.INSTANCE.getPRODUCT(), toOneOnboardingFeature(intentId), str3), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str4, str5, "field", str2)).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackPageError(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), null, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalytics.INSTANCE.getPRODUCT(), toOneOnboardingFeature(intentId), str2), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str3, str4, "page", str)).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }
}
