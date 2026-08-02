package com.paypal.oslo.core.telemetry.analytics.context.global;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/context/global/VeniceContextProvider;", "Lcom/paypal/oslo/core/telemetry/analytics/context/ContextProvider;", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "appIdentity", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "event", "", "enrich", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VeniceContextProvider implements com.paypal.oslo.core.telemetry.analytics.context.ContextProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.appidentity.domain.AppIdentity getHighSpeedVideoSizes;

    @javax.inject.Inject
    public VeniceContextProvider(com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appIdentity, "");
        this.getHighSpeedVideoSizes = appIdentity;
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.context.ContextProvider
    public final void enrich(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        event.addContext$telemetry_release(new com.paypal.oslo.core.telemetry.analytics.schema.context.operational.VeniceContext(this.getHighSpeedVideoSizes.getVeniceSessionId()));
    }
}
