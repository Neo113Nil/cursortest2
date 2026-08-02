package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsAnalyticsHelper;", "", "<init>", "()V", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "experienceSessionId", "transactionAmount", "", "trackContinueButtonPressed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "trackSkipForNowPressed", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "p0", "p1", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RepaymentsAnalyticsHelper {
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen.$stable;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen Camera2StreamConfigurationMap = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsConstants.SCREEN_ID);
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.BUY_NOW_PAY_LATER, com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.UserIntent.FEATURE, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsConstants.ACTION);

    @javax.inject.Inject
    public RepaymentsAnalyticsHelper() {
    }

    public final void trackContinueButtonPressed(java.lang.String flowName, java.lang.String experienceSessionId, java.lang.String transactionAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsConstants.INSTANCE.getCONTINUE_BUTTON(), flowName, experienceSessionId, transactionAmount);
    }

    public final void trackSkipForNowPressed(java.lang.String flowName, java.lang.String experienceSessionId, java.lang.String transactionAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsConstants.INSTANCE.getSKIP_FOR_NOW_LINK(), flowName, experienceSessionId, transactionAmount);
    }

    private final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(this.Camera2StreamConfigurationMap, null, null, p0, 6, null);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.getHighSpeedVideoFpsRangesFor;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(p1, p2));
        if (p3 != null) {
            createListBuilder.add(new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext("", "", "", "", p3, "", "", null, 128, null));
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(uIContext, userIntentContext, kotlin.collections.CollectionsKt.build(createListBuilder)).track(com.paypal.oslo.feature.bnplacquisition.AnalyticsTrackerKt.analyticsTracker);
    }
}
