package com.paypal.oslo.feature.publicprofile.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "code", "", "trackPublicProfileOperationError", "(Ljava/lang/String;)V", "trackRefreshPressed", "()V", "trackMoreOptionsDismissed", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "sheetModule", "trackConfirmationSheetDismissed", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PublicProfileAnalyticsTrackerKt {
    public static final void trackPublicProfileOperationError(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("public_profile"), null, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("public_profile", "public_profile", "view"), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str, str, "unknown", "api_call")).track(com.paypal.oslo.feature.publicprofile.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackRefreshPressed() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("public_profile"), null, null, com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.INSTANCE.getITEM_REFRESH(), 6, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("public_profile", "public_profile", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH), null, 4, null).track(com.paypal.oslo.feature.publicprofile.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackMoreOptionsDismissed() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("public_profile"), com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.INSTANCE.getMODULE_MORE_OPTIONS_SHEET(), null, com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.INSTANCE.getITEM_CANCEL(), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("public_profile", "public_profile", "dismiss"), null, 4, null).track(com.paypal.oslo.feature.publicprofile.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackConfirmationSheetDismissed(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("public_profile"), module, null, com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.INSTANCE.getITEM_CANCEL(), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("public_profile", "public_profile", "dismiss"), null, 4, null).track(com.paypal.oslo.feature.publicprofile.AnalyticsTrackerKt.analyticsTracker);
    }
}
