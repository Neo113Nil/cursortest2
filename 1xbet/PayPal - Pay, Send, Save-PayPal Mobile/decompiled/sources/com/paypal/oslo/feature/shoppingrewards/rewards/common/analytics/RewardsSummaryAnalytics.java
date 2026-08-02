package com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/analytics/RewardsSummaryAnalytics;", "", "<init>", "()V", "", "tabIndex", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAvailable;", "createScreenLoadedEvent", "(I)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAvailable;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ComponentClicked;", "createTabSelectedEvent", "(I)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ComponentClicked;", "horizontalPosition", "verticalPosition", "", "offerId", "componentName", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ComponentAppeared;", "createEarnComponentShownEvent", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ComponentAppeared;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType;", "offerProgressType", "createActiveOfferShownEvent", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType;I)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ComponentAppeared;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsSummaryAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsSummaryAnalytics INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsSummaryAnalytics();

    private RewardsSummaryAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared createEarnComponentShownEvent(int horizontalPosition, int verticalPosition, java.lang.String offerId, java.lang.String componentName, java.lang.String flowName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.SCREEN_NAME), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.EarnTab.MODULE_NAME, 0, null, java.lang.Integer.valueOf(verticalPosition), 6, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(componentName, 0, java.lang.Integer.valueOf(horizontalPosition), null, 10, null), null, 8, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("rewards", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.Tab.EARN, "view"), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(offerId, componentName), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowName, null)}));
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared createActiveOfferShownEvent$default(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsSummaryAnalytics rewardsSummaryAnalytics, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType offerProgressType, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return rewardsSummaryAnalytics.createActiveOfferShownEvent(str, offerProgressType, i);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared createActiveOfferShownEvent(java.lang.String offerId, com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType offerProgressType, int horizontalPosition) {
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerProgressType, "");
        if (offerProgressType instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar avatar = (com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar) offerProgressType;
            int progressValue = avatar.getProgressValue();
            int maxValue = avatar.getMaxValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(progressValue);
            sb.append(com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates.SEPARATOR);
            sb.append(maxValue);
            str = sb.toString();
        } else if (offerProgressType instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear) {
            int percentCompleted = (int) ((com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear) offerProgressType).getPercentCompleted();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(percentCompleted);
            sb2.append(" | 100");
            str = sb2.toString();
        } else if (!(offerProgressType instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.None)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.SCREEN_NAME), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.EarnTab.ACTIVE_OFFER, 0, java.lang.Integer.valueOf(horizontalPosition), null, 10, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(str, 0, 2, null), 2, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("rewards", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.Tab.EARN, "view"), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(offerId, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.EarnTab.ACTIVE_OFFER)));
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable createScreenLoadedEvent(int tabIndex) {
        java.lang.String str;
        if (tabIndex == 0) {
            str = com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.Tab.EARN;
        } else if (tabIndex == 1) {
            str = "redeem";
        } else if (tabIndex == 2) {
            str = "activity";
        } else {
            str = "unknown";
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen screen = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.SCREEN_NAME);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("_tab");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(screen, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(sb.toString(), 0, null, null, 14, null), null, null, 12, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("rewards", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.FEATURE, "load"), null, null, null, 28, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked createTabSelectedEvent(int tabIndex) {
        java.lang.String str;
        if (tabIndex == 0) {
            str = com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.Tab.EARN;
        } else if (tabIndex == 1) {
            str = "redeem";
        } else if (tabIndex == 2) {
            str = "activity";
        } else {
            str = "unknown";
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen screen = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.SCREEN_NAME);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Summary.Tab.MODULE_NAME, 0, null, null, 14, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("_tab");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(screen, module, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(sb.toString(), 0, null, null, 14, null), null, 8, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("rewards", str, "select"), null, 4, null);
    }
}
