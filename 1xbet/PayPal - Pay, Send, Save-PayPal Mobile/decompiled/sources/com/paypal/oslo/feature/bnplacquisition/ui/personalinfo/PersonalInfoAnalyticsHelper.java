package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoAnalyticsHelper;", "", "<init>", "()V", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "experienceSessionId", "transactionAmount", "", "trackContinueButtonPressed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoAnalyticsHelper {
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen.$stable;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen getHighSpeedVideoSizes = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAnalyticsConstants.SCREEN_ID);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.BUY_NOW_PAY_LATER, com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.UserIntent.FEATURE, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAnalyticsConstants.ACTION);

    @javax.inject.Inject
    public PersonalInfoAnalyticsHelper() {
    }

    public final void trackContinueButtonPressed(java.lang.String flowName, java.lang.String experienceSessionId, java.lang.String transactionAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(this.getHighSpeedVideoSizes, null, null, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAnalyticsConstants.INSTANCE.getCONTINUE_BUTTON(), 6, null);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.getHighSpeedVideoFpsRanges;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowName, experienceSessionId));
        if (transactionAmount != null) {
            createListBuilder.add(new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext("", "", "", "", transactionAmount, "", "", null, 128, null));
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(uIContext, userIntentContext, kotlin.collections.CollectionsKt.build(createListBuilder)).track(com.paypal.oslo.feature.bnplacquisition.AnalyticsTrackerKt.analyticsTracker);
    }
}
