package com.paypal.oslo.feature.onboarding.signup.email.analytics;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\f\"\u001a\u0010\u000f\u001a\u00020\u000e8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "emailEntryAnalyticsContexts", "()Ljava/util/List;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAppeared;", "trackEmailEntryScreenAppeared", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAppeared;", "", "errorCode", "errorDescription", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "trackEmailFieldError", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "trackEmailPageError", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "SCREEN", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "getSCREEN", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailEntryAnalyticsKt {
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen SCREEN = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalytics.SCREEN_ID);

    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen getSCREEN() {
        return SCREEN;
    }

    public static final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> emailEntryAnalyticsContexts() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getACCOUNT_CREATION_USER_INTENT(), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext("manual_signup_from_phone", null)});
    }

    public static final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared trackEmailEntryScreenAppeared() {
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared screenAppeared = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(SCREEN, null, null, null, 14, null), com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getACCOUNT_CREATION_USER_INTENT(), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType.FORWARD, null, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext("manual_signup_from_phone", null), null, 16, null);
        screenAppeared.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return screenAppeared;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown trackEmailFieldError$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return trackEmailFieldError(str, str2);
    }

    public static final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown trackEmailFieldError(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown errorShown = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(SCREEN, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("email", 0, null, null, 14, null), null, null, 12, null), com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getACCOUNT_CREATION_USER_INTENT(), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str, str2, "field", "email"));
        errorShown.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return errorShown;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown trackEmailPageError$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return trackEmailPageError(str, str2);
    }

    public static final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown trackEmailPageError(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown errorShown = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(SCREEN, null, null, null, 14, null), com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getACCOUNT_CREATION_USER_INTENT(), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str, str2, "page", "email"));
        errorShown.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return errorShown;
    }
}
