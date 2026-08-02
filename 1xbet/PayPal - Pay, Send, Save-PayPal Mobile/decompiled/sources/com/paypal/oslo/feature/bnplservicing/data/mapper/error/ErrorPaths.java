package com.paypal.oslo.feature.bnplservicing.data.mapper.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/mapper/error/ErrorPaths;", "", "<init>", "()V", "", "PREQUALIFICATION_SUMMARY", "Ljava/lang/String;", "PREQUALIFICATION_SUMMARY_AMOUNT", "PLANS_OVERVIEW_ACTIVE", "PLANS_OVERVIEW_ACTIVE_PAGE", "PLANS_OVERVIEW_ACTIVE_PAGE_ITEMS", "PLANS_OVERVIEW_HISTORY", "PLANS_OVERVIEW_HISTORY_PAGE", "PLANS_OVERVIEW_HISTORY_PAGE_ITEMS", "PLAN_DETAILS", "PLAN_DETAILS_AUTOPAY", "PLAN_DETAILS_FI", "PLAN_DETAILS_ACTIVITIES", "MAKE_A_PAYMENT", "MAKE_A_PAYMENT_FI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ErrorPaths {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths INSTANCE = new com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths();
    public static final java.lang.String MAKE_A_PAYMENT = "bnplMakePaymentOverview";
    public static final java.lang.String MAKE_A_PAYMENT_FI = "bnplMakePaymentOverview.autopay.paymentFundingInstrument";
    public static final java.lang.String PLANS_OVERVIEW_ACTIVE = "bnplServicingActivePlans";
    public static final java.lang.String PLANS_OVERVIEW_ACTIVE_PAGE = "bnplServicingActivePlans.page";
    public static final java.lang.String PLANS_OVERVIEW_ACTIVE_PAGE_ITEMS = "bnplServicingActivePlans.page.items";
    public static final java.lang.String PLANS_OVERVIEW_HISTORY = "bnplServicingHistoryPlans";
    public static final java.lang.String PLANS_OVERVIEW_HISTORY_PAGE = "bnplServicingHistoryPlans.page";
    public static final java.lang.String PLANS_OVERVIEW_HISTORY_PAGE_ITEMS = "bnplServicingHistoryPlans.page.items";
    public static final java.lang.String PLAN_DETAILS = "bnplPlan";
    public static final java.lang.String PLAN_DETAILS_ACTIVITIES = "bnplPlan.activities";
    public static final java.lang.String PLAN_DETAILS_AUTOPAY = "bnplPlan.autopay";
    public static final java.lang.String PLAN_DETAILS_FI = "bnplPlan.autopay.paymentFundingInstrument";
    public static final java.lang.String PREQUALIFICATION_SUMMARY = "bnplPrequalificationSummary";
    public static final java.lang.String PREQUALIFICATION_SUMMARY_AMOUNT = "bnplPrequalificationSummary.spendingPower";

    private ErrorPaths() {
    }
}
