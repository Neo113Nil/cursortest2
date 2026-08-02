package com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/analytics/RedemptionAnalytics;", "", "<init>", "()V", "", "redemptionType", "currencyCode", "redeemAmount", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "createConfirmRedemptionEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAppeared;", "createRedemptionSuccessEvent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAppeared;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedemptionAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RedemptionAnalytics INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RedemptionAnalytics();

    private RedemptionAnalytics() {
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed createConfirmRedemptionEvent$default(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RedemptionAnalytics redemptionAnalytics, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        return redemptionAnalytics.createConfirmRedemptionEvent(str, str2, str3);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed createConfirmRedemptionEvent(java.lang.String redemptionType, java.lang.String currencyCode, java.lang.String redeemAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemAmount, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SCREEN_NAME), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(redemptionType, 0, 2, null), 6, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("rewards", "redeem", "confirm"), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "", currencyCode, "", redeemAmount, redemptionType, "", "")));
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared createRedemptionSuccessEvent() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.CONFIRMATION_SCREEN), null, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("rewards", "redeem", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType.FORWARD, null, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.FLOW_NAME, null), null, 16, null);
    }
}
