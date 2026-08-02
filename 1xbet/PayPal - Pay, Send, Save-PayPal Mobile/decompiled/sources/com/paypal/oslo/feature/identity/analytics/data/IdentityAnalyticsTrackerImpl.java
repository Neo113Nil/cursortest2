package com.paypal.oslo.feature.identity.analytics.data;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/analytics/data/IdentityAnalyticsTrackerImpl;", "Lcom/paypal/oslo/feature/identity/analytics/domain/IdentityAnalyticsTracker;", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "analyticsTracker", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;)V", "", "trackLoginInitiated", "()V", "trackLoginSuccess", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdentityAnalyticsTrackerImpl implements com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker {
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker.$stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public IdentityAnalyticsTrackerImpl(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracker, "");
        this.getHighSpeedVideoFpsRangesFor = analyticsTracker;
    }

    @Override // com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker
    public final void trackLoginInitiated() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.FlowTransitionEvent(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.Login.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.Triggered.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext(com.paypal.oslo.feature.identity.analytics.domain.Event.LoginInitiated.getValue()), null, 4, null).track(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker
    public final void trackLoginSuccess() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.FlowTransitionEvent(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("identity", com.paypal.oslo.feature.identity.analytics.domain.Feature.Login.getValue(), com.paypal.oslo.feature.identity.analytics.domain.Action.Completed.getValue()), new com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext(com.paypal.oslo.feature.identity.analytics.domain.Event.LoginSuccess.getValue()), null, 4, null).track(this.getHighSpeedVideoFpsRangesFor);
    }
}
