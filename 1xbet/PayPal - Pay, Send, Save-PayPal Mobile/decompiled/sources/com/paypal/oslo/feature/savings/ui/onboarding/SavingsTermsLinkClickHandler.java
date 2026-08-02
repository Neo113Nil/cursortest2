package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\r\u0010\u000bJM\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsLinkClickHandler;", "", "<init>", "()V", "", "tag", "Lkotlin/Function0;", "", "onFdicInsuredClick", "", "handleFdicInsuredLinkClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Z", "onFdicRatesClick", "handleFdicRatesLinkClick", "onRateInfoClick", "onEDeliveryClick", "onDepositAccountClick", "onPrivacyClick", "handleTermsFooterLinkClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsTermsLinkClickHandler {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkClickHandler INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkClickHandler();

    private SavingsTermsLinkClickHandler() {
    }

    public final boolean handleFdicInsuredLinkClick(java.lang.String tag, kotlin.jvm.functions.Function0<kotlin.Unit> onFdicInsuredClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFdicInsuredClick, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(tag, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.FdicInsured)) {
            return false;
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackLinkClick(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Onboarding.INSTANCE.getTERMS_FDIC_INSURED_LINK());
        onFdicInsuredClick.invoke();
        return true;
    }

    public final boolean handleFdicRatesLinkClick(java.lang.String tag, kotlin.jvm.functions.Function0<kotlin.Unit> onFdicRatesClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFdicRatesClick, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(tag, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.FdicRates)) {
            return false;
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackLinkClick(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Onboarding.INSTANCE.getTERMS_FDIC_RATES_LINK());
        onFdicRatesClick.invoke();
        return true;
    }

    public final boolean handleTermsFooterLinkClick(java.lang.String tag, kotlin.jvm.functions.Function0<kotlin.Unit> onRateInfoClick, kotlin.jvm.functions.Function0<kotlin.Unit> onEDeliveryClick, kotlin.jvm.functions.Function0<kotlin.Unit> onDepositAccountClick, kotlin.jvm.functions.Function0<kotlin.Unit> onPrivacyClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onRateInfoClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEDeliveryClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDepositAccountClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPrivacyClick, "");
        switch (tag.hashCode()) {
            case -1754009970:
                if (tag.equals(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.EDelivery)) {
                    com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackLinkClick(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Onboarding.INSTANCE.getTERMS_E_DELIVERY_LINK());
                    onEDeliveryClick.invoke();
                    break;
                }
                break;
            case -314498168:
                if (tag.equals(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy)) {
                    com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackLinkClick(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Onboarding.INSTANCE.getTERMS_PRIVACY_LINK());
                    onPrivacyClick.invoke();
                    break;
                }
                break;
            case 216259757:
                if (tag.equals(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.RateInfo)) {
                    com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackLinkClick(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Onboarding.INSTANCE.getTERMS_RATE_INFO_LINK());
                    onRateInfoClick.invoke();
                    break;
                }
                break;
            case 1875954060:
                if (tag.equals(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.DepositAccount)) {
                    com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackLinkClick(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Onboarding.INSTANCE.getTERMS_DEPOSIT_ACCOUNT_LINK());
                    onDepositAccountClick.invoke();
                    break;
                }
                break;
        }
        return true;
    }
}
