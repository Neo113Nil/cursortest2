package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/analytics/PasswordErrorCode;", "errorCode", "", "errorDescription", "", "trackPasswordPageError", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/analytics/PasswordErrorCode;Ljava/lang/String;)V", "trackPasswordFieldError", "trackSavePasswordScreenShown", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "itemName", "trackSavePasswordItemPressed", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PasswordStepAnalyticsKt {
    public static final void trackPasswordPageError(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordErrorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordStepAnalytics.SCREEN_ID), null, null, null, 14, null), com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toUserIntentContext(intentId), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(passwordErrorCode.name(), str, "page", com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordStepAnalytics.SCREEN_ID)).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }

    public static /* synthetic */ void trackPasswordFieldError$default(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        trackPasswordFieldError(intentId, passwordErrorCode, str);
    }

    public static final void trackPasswordFieldError(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordErrorCode passwordErrorCode, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordErrorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordStepAnalytics.SCREEN_ID), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("password", 0, null, null, 14, null), null, null, 12, null), com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toUserIntentContext(intentId), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(passwordErrorCode.name(), str, "field", "password")).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackSavePasswordScreenShown(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("save_password"), null, null, null, 14, null), com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toUserIntentContext(intentId), null, com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toAccountCreationFlowContext(intentId), null, 20, null).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackSavePasswordItemPressed(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.analytics.PasswordStepAnalytics.SAVE_PASSWORD_ITEM_SCREEN_ID), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(str, 0, 2, null), 6, null), com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toUserIntentContext(intentId), kotlin.collections.CollectionsKt.listOfNotNull(com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toAccountCreationFlowContext(intentId))).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }
}
