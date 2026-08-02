package com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terms/analytics/BalanceTermsAnalytics;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ViewComponentConfig;", "components", "", "resolveScreenId$one_onboarding_prodRelease", "(Ljava/util/List;)Ljava/lang/String;", "SCREEN_ID_BALANCE_TERMS", "Ljava/lang/String;", "SCREEN_ID_BALANCE_AND_PPDC_TERMS", "ITEM_DISMISS", "ITEM_BACK", "ITEM_SCROLL_TO_REVIEW", "ITEM_AGREE_AND_CONTINUE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BalanceTermsAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.analytics.BalanceTermsAnalytics INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.steps.terms.analytics.BalanceTermsAnalytics();
    public static final java.lang.String ITEM_AGREE_AND_CONTINUE = "agree_and_continue";
    public static final java.lang.String ITEM_BACK = "back";
    public static final java.lang.String ITEM_DISMISS = "dismiss";
    public static final java.lang.String ITEM_SCROLL_TO_REVIEW = "scroll_to_review";
    public static final java.lang.String SCREEN_ID_BALANCE_AND_PPDC_TERMS = "balance_and_ppdc_terms";
    public static final java.lang.String SCREEN_ID_BALANCE_TERMS = "balance_terms";

    private BalanceTermsAnalytics() {
    }

    public final java.lang.String resolveScreenId$one_onboarding_prodRelease(java.util.List<? extends com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig> components) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "");
        java.util.List<? extends com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig> list = components;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return "balance_terms";
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) it.next()) instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.ppdcterms.domain.PPDCTermsViewComponentConfig) {
                return "balance_and_ppdc_terms";
            }
        }
        return "balance_terms";
    }
}
