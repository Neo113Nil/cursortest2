package com.paypal.oslo.feature.onboarding.signup.email.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\n\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/PhoneNumber;", "phoneNumber", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "emailSuggestionAnalyticsContexts-3sJRXbI", "(Ljava/lang/String;)Ljava/util/List;", "emailSuggestionAnalyticsContexts", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "trackEmailSuggestionDismissed-3sJRXbI", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "trackEmailSuggestionDismissed"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailSuggestionAnalyticsKt {
    /* renamed from: emailSuggestionAnalyticsContexts-3sJRXbI, reason: not valid java name */
    public static final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> m16338emailSuggestionAnalyticsContexts3sJRXbI(java.lang.String str) {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getACCOUNT_CREATION_USER_INTENT(), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.m15857toEmailSignupFlowName3sJRXbI(str), null)});
    }

    /* renamed from: trackEmailSuggestionDismissed-3sJRXbI, reason: not valid java name */
    public static final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed m16339trackEmailSuggestionDismissed3sJRXbI(java.lang.String str) {
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed itemPressed = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.onboarding.api.signup.email.analytics.EmailSuggestionAnalyticsConstants.SCREEN_ID), null, null, com.paypal.oslo.feature.onboarding.api.signup.email.analytics.EmailSuggestionAnalyticsConstants.INSTANCE.getDISMISS_ITEM(), 6, null), com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getACCOUNT_CREATION_USER_INTENT(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.m15857toEmailSignupFlowName3sJRXbI(str), null)));
        itemPressed.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return itemPressed;
    }
}
