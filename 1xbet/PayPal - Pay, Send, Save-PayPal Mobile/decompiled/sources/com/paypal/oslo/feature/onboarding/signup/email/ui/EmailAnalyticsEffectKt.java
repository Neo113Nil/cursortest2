package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect;", "effect", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "handleAnalyticsEffect", "(Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect;Landroid/content/Context;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailAnalyticsEffectKt {
    public static final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown handleAnalyticsEffect(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect emailAnalyticsEffect, android.content.Context context) {
        java.lang.String value;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAnalyticsEffect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.core.commonui.utils.RefText description = emailAnalyticsEffect.getDescription();
        if (description != null && (value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(description, context)) != null) {
            str = value;
        }
        if (emailAnalyticsEffect instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.FieldError) {
            return com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalyticsKt.trackEmailFieldError(((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.FieldError) emailAnalyticsEffect).getErrorCode(), str);
        }
        if (emailAnalyticsEffect instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError) {
            return com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalyticsKt.trackEmailPageError(((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError) emailAnalyticsEffect).getErrorCode(), str);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
