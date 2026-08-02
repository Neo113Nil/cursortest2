package com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/analytics/RewardsErrorAnalytics;", "", "<init>", "()V", "", "screenName", "feature", "action", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "errorType", "errorDescription", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "createErrorShownEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsErrorAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics();

    private RewardsErrorAnalytics() {
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown createErrorShownEvent$default(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics rewardsErrorAnalytics, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str4 = "";
        }
        return rewardsErrorAnalytics.createErrorShownEvent(str, str2, str3, errorStateType, str4);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown createErrorShownEvent(java.lang.String screenName, java.lang.String feature, java.lang.String action, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType, java.lang.String errorDescription) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(screenName), null, null, null, 14, null);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("rewards", feature, action);
        int i = com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.WhenMappings.$EnumSwitchMapping$0[errorType.ordinal()];
        if (i == 1) {
            str = "NETWORK_ERROR";
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR;
        }
        int i2 = com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.WhenMappings.$EnumSwitchMapping$0[errorType.ordinal()];
        if (i2 == 1) {
            str2 = "network";
        } else {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str2 = "system";
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(uIContext, userIntentContext, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str, errorDescription, str2, "api_call"));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.NetworkError.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
