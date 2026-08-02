package com.paypal.oslo.feature.onboarding.signup.welcome.ui.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageNavigation;", "", "<init>", "(Ljava/lang/String;I)V", "NEXT_FRAME", "PREVIOUS_FRAME", "AUTO_NAV"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomePageNavigation {
    public static final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation AUTO_NAV;
    private static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation NEXT_FRAME;
    public static final com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation PREVIOUS_FRAME;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private WelcomePageNavigation(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation welcomePageNavigation = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation("NEXT_FRAME", 0);
        NEXT_FRAME = welcomePageNavigation;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation welcomePageNavigation2 = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation("PREVIOUS_FRAME", 1);
        PREVIOUS_FRAME = welcomePageNavigation2;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation welcomePageNavigation3 = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation("AUTO_NAV", 2);
        AUTO_NAV = welcomePageNavigation3;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation[] welcomePageNavigationArr = {welcomePageNavigation, welcomePageNavigation2, welcomePageNavigation3};
        Camera2StreamConfigurationMap = welcomePageNavigationArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(welcomePageNavigationArr);
    }

    public static com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation[] values() {
        return (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
