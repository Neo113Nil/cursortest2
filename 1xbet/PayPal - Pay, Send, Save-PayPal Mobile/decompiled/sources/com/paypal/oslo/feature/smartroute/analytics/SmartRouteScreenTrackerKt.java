package com.paypal.oslo.feature.smartroute.analytics;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "screenId", "", "trackSmartRouteScreen", "(Ljava/lang/String;)V", "moduleName", "action", "trackSmartRouteModule", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SmartRouteScreenTrackerKt {
    public static final void trackSmartRouteScreen(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), null, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("smart_route", "smart_route", "view"), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext("state_change", null, null), null, null, 24, null).track(com.paypal.oslo.feature.smartroute.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackSmartRouteModule(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Screen.SMART_ROUTE_SETUP), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(str, 0, null, null, 14, null), null, null, 12, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("smart_route", "smart_route", str2), null, 4, null).track(com.paypal.oslo.feature.smartroute.AnalyticsTrackerKt.analyticsTracker);
    }
}
