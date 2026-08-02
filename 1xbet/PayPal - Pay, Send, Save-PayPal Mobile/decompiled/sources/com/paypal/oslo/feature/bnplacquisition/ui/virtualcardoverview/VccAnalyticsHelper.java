package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\tJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0016\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001a\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VccAnalyticsHelper;", "", "<init>", "()V", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "experienceSessionId", "", "trackScreenShown", "(Ljava/lang/String;Ljava/lang/String;)V", "trackScreenExit", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "trackModuleShown", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;Ljava/lang/String;Ljava/lang/String;)V", "componentName", "trackComponentShown", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "analyticsItemId", "trackItemPressed", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VccAnalyticsHelper {
    public static final int $stable = ((com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen.$stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen getHighSpeedVideoSizes;

    @javax.inject.Inject
    public VccAnalyticsHelper() {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen screen = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.SCREEN_ID);
        this.getHighSpeedVideoSizes = screen;
        this.Camera2StreamConfigurationMap = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(screen, null, null, null, 14, null);
        this.getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.BUY_NOW_PAY_LATER, com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.UserIntent.FEATURE, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsConstants.ACTION);
        this.getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType.FORWARD, null, null);
    }

    public final void trackScreenShown(java.lang.String flowName, java.lang.String experienceSessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowName, experienceSessionId), null, 16, null).track(com.paypal.oslo.feature.bnplacquisition.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackScreenExit(java.lang.String flowName, java.lang.String experienceSessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenDisappeared(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowName, experienceSessionId), null, 16, null).track(com.paypal.oslo.feature.bnplacquisition.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackModuleShown(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, java.lang.String flowName, java.lang.String experienceSessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(this.getHighSpeedVideoSizes, module, null, null, 12, null), this.getHighSpeedVideoFpsRangesFor, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowName, experienceSessionId))).track(com.paypal.oslo.feature.bnplacquisition.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackComponentShown(java.lang.String componentName, java.lang.String flowName, java.lang.String experienceSessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(this.getHighSpeedVideoSizes, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(componentName, 0, null, null, 14, null), null, 10, null), this.getHighSpeedVideoFpsRangesFor, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowName, experienceSessionId))).track(com.paypal.oslo.feature.bnplacquisition.AnalyticsTrackerKt.analyticsTracker);
    }

    public static /* synthetic */ void trackItemPressed$default(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VccAnalyticsHelper vccAnalyticsHelper, java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            module = null;
        }
        vccAnalyticsHelper.trackItemPressed(str, module, str2, str3);
    }

    public final void trackItemPressed(java.lang.String analyticsItemId, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, java.lang.String flowName, java.lang.String experienceSessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsItemId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(this.getHighSpeedVideoSizes, module, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(analyticsItemId, 0, 2, null), 4, null), this.getHighSpeedVideoFpsRangesFor, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowName, experienceSessionId))).track(com.paypal.oslo.feature.bnplacquisition.AnalyticsTrackerKt.analyticsTracker);
    }
}
