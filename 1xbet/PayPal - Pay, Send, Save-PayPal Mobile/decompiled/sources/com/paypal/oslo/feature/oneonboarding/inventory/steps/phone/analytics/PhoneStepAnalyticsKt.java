package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "error", "", "trackPhoneFieldError", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;)V", "", "errorCode", "errorDescription", "trackPhonePageError", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/lang/String;Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneStepAnalyticsKt {
    public static final void trackPhoneFieldError(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberError, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.analytics.PhoneStepAnalytics.INSTANCE.getSCREEN(), com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.analytics.PhoneStepAnalytics.INSTANCE.getMODULE(), null, null, 12, null), com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toUserIntentContext(intentId), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(phoneNumberError.name(), phoneNumberError.getMessage(), "field", com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.analytics.PhoneStepAnalytics.INSTANCE.getMODULE().getName())).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackPhonePageError(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.analytics.PhoneStepAnalytics.INSTANCE.getSCREEN(), null, null, null, 14, null), com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toUserIntentContext(intentId), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str, str2, "page", com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.analytics.PhoneStepAnalytics.INSTANCE.getSCREEN().getName())).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }
}
