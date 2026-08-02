package com.paypal.oslo.feature.inappcheckout.analytics.econsent;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsTracker;", "", "Lcom/paypal/oslo/feature/inappcheckout/analytics/AnalyticsContextMapper;", "contextMapper", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/AnalyticsContextMapper;)V", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;", "event", "", "trackEvent", "(Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/analytics/AnalyticsContextMapper;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EConsentAnalyticsTracker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public EConsentAnalyticsTracker(com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper analyticsContextMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContextMapper, "");
        this.Camera2StreamConfigurationMap = analyticsContextMapper;
    }

    public final void trackEvent(com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        try {
            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenShown)) {
                if (!(event instanceof com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenLoaded)) {
                    if (!(event instanceof com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenDismissed)) {
                        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentViewed)) {
                            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked componentClicked = (com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked) event;
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Tracking component_clicked event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Screen.ID), kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, componentClicked.getCompName())), null, 4, null);
                            new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(this.Camera2StreamConfigurationMap.buildUiContext(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Screen.ID, componentClicked.getCompName(), componentClicked.getItemName()), com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUserIntentContext$default(this.Camera2StreamConfigurationMap, null, 1, null), null, 4, null).track(com.paypal.oslo.feature.inappcheckout.AnalyticsTrackerKt.analyticsTracker);
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully tracked component_clicked event", null, null, 6, null);
                            return;
                        }
                        com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentViewed componentViewed = (com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentViewed) event;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Tracking component_viewed event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Screen.ID), kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, componentViewed.getCompName())), null, 4, null);
                        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared(this.Camera2StreamConfigurationMap.buildUiContext(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Screen.ID, componentViewed.getCompName(), componentViewed.getItemName()), com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUserIntentContext$default(this.Camera2StreamConfigurationMap, null, 1, null), null, 4, null).track(com.paypal.oslo.feature.inappcheckout.AnalyticsTrackerKt.analyticsTracker);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully tracked component_viewed event", null, null, 6, null);
                        return;
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Tracking screen_exit event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Screen.ID)), null, 4, null);
                    new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenDisappeared(com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUiContext$default(this.Camera2StreamConfigurationMap, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Screen.ID, null, null, 6, null), com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUserIntentContext$default(this.Camera2StreamConfigurationMap, null, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType.FORWARD, null, null), this.Camera2StreamConfigurationMap.buildBusinessFlowContext(), null, 16, null).track(com.paypal.oslo.feature.inappcheckout.AnalyticsTrackerKt.analyticsTracker);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully tracked screen_exit event", null, null, 6, null);
                    return;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Tracking screen_loaded event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Screen.ID)), null, 4, null);
                new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUiContext$default(this.Camera2StreamConfigurationMap, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Screen.ID, null, null, 6, null), com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUserIntentContext$default(this.Camera2StreamConfigurationMap, null, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType.FORWARD, null, null), this.Camera2StreamConfigurationMap.buildBusinessFlowContext(), null, 16, null).track(com.paypal.oslo.feature.inappcheckout.AnalyticsTrackerKt.analyticsTracker);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully tracked screen_loaded event", null, null, 6, null);
                return;
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Tracking screen_shown event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Screen.ID)), null, 4, null);
            new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUiContext$default(this.Camera2StreamConfigurationMap, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Screen.ID, null, null, 6, null), com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper.buildUserIntentContext$default(this.Camera2StreamConfigurationMap, null, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType.FORWARD, null, null), this.Camera2StreamConfigurationMap.buildBusinessFlowContext(), null, 16, null).track(com.paypal.oslo.feature.inappcheckout.AnalyticsTrackerKt.analyticsTracker);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully tracked screen_shown event", null, null, 6, null);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Failed to track analytics event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(event.getClass()).getSimpleName()), kotlin.TuplesKt.to("screen", com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Screen.ID), kotlin.TuplesKt.to("exception_type", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName())), null, e, 4, null);
        }
    }
}
