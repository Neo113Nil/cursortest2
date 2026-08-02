package com.paypal.oslo.feature.onboarding.signup.welcome.analytics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/welcome/analytics/WelcomeAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;", "", "toScreenName$onboarding_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;)Ljava/lang/String;", "toUserIntentAction$onboarding_prodRelease", "pageId", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAppeared;", "trackScreenAppeared$onboarding_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAppeared;", "itemName", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "trackItemPressed$onboarding_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "ITEM_LEFT_EDGE", "Ljava/lang/String;", "ITEM_RIGHT_EDGE", "ITEM_GET_STARTED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomeAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics INSTANCE = new com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics();
    public static final java.lang.String ITEM_GET_STARTED = "get_started";
    public static final java.lang.String ITEM_LEFT_EDGE = "left_edge";
    public static final java.lang.String ITEM_RIGHT_EDGE = "right_edge";

    private WelcomeAnalytics() {
    }

    public final java.lang.String toScreenName$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomePageId, "");
        int i = com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics.WhenMappings.$EnumSwitchMapping$0[welcomePageId.ordinal()];
        if (i == 1) {
            return "welcome_shop";
        }
        if (i == 2) {
            return "welcome_pay";
        }
        if (i == 3) {
            return "welcome_earn";
        }
        if (i == 4) {
            return "welcome_transfer";
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "welcome_paypal";
    }

    public final java.lang.String toUserIntentAction$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(welcomePageId, "");
        int i = com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics.WhenMappings.$EnumSwitchMapping$0[welcomePageId.ordinal()];
        if (i == 1) {
            return "browse_shop_value_prop";
        }
        if (i == 2) {
            return "browse_pay_value_prop";
        }
        if (i == 3) {
            return "browse_earn_value_prop";
        }
        if (i == 4) {
            return "browse_transfer_value_prop";
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "browse_paypal_brand";
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared trackScreenAppeared$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId pageId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageId, "");
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared screenAppeared = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(toScreenName$onboarding_prodRelease(pageId)), null, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getPRODUCT_MOBILE_ONBOARDING(), "welcome", toUserIntentAction$onboarding_prodRelease(pageId)), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext("tab_switch", null, null), null, null, 24, null);
        screenAppeared.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return screenAppeared;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed trackItemPressed$onboarding_prodRelease(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId pageId, java.lang.String itemName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemName, "");
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed itemPressed = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(toScreenName$onboarding_prodRelease(pageId)), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(itemName, 0, 2, null), 6, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getPRODUCT_MOBILE_ONBOARDING(), "welcome", toUserIntentAction$onboarding_prodRelease(pageId)), null, 4, null);
        itemPressed.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return itemPressed;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.SHOP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.PAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.EARN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.TRANSFER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.LAST.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
