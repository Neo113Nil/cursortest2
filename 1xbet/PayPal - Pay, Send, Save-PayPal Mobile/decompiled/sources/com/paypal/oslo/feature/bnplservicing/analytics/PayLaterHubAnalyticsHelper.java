package com.paypal.oslo.feature.bnplservicing.analytics;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0014B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/analytics/PayLaterHubAnalyticsHelper;", "", "", "entryPoint", "<init>", "(Ljava/lang/String;)V", "", "trackScreenLoaded", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "getHighSpeedVideoFpsRangesFor", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PayLaterHubAnalyticsHelper {

    @java.lang.Deprecated
    public static final java.lang.String ACTION_VIEW_HUB = "view_paylater_hub";

    @java.lang.Deprecated
    public static final java.lang.String FEATURE_NAME = "paylater_hub";

    @java.lang.Deprecated
    public static final java.lang.String PRODUCT = "paylater";

    @java.lang.Deprecated
    public static final java.lang.String SCREEN_NAME = "paylater_hub";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext> Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper.Companion Companion = new com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/analytics/PayLaterHubAnalyticsHelper$Factory;", "", "", "entryPoint", "Lcom/paypal/oslo/feature/bnplservicing/analytics/PayLaterHubAnalyticsHelper;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/analytics/PayLaterHubAnalyticsHelper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.bnplservicing.analytics.PayLaterHubAnalyticsHelper create(java.lang.String entryPoint);
    }

    @dagger.assisted.AssistedInject
    public PayLaterHubAnalyticsHelper(@dagger.assisted.Assisted java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext(str, null));
        this.getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("paylater_hub");
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/analytics/PayLaterHubAnalyticsHelper$Companion;", "", "<init>", "()V", "", "PRODUCT", "Ljava/lang/String;", "FEATURE_NAME", "SCREEN_NAME", "ACTION_VIEW_HUB"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void trackScreenLoaded() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(this.getHighSpeedVideoFpsRangesFor, null, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(PRODUCT, "paylater_hub", ACTION_VIEW_HUB), null, null, this.Camera2StreamConfigurationMap, 12, null).track(com.paypal.oslo.feature.bnplservicing.AnalyticsTrackerKt.analyticsTracker);
    }
}
