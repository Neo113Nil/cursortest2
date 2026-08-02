package com.paypal.oslo.feature.activity.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/analytics/ActivityAnalyticsConstants;", "", "<init>", "()V", "", "UNKNOWN", "Ljava/lang/String;", "ENGAGE", "ACTION_LOAD", "Ledger", "Search"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityAnalyticsConstants {
    public static final int $stable = 0;
    public static final java.lang.String ACTION_LOAD = "load";
    public static final java.lang.String ENGAGE = "engage";
    public static final com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants();
    public static final java.lang.String UNKNOWN = "unknown";

    private ActivityAnalyticsConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/analytics/ActivityAnalyticsConstants$Ledger;", "", "<init>", "()V", "", "amount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/TransactionContext;", "getTransactionContext", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/TransactionContext;", "FILTER", "Ljava/lang/String;", "FILTER_DATES_ITEM", "FILTER_CHIP", "FILTER_BAR", "FILTER_ICON", "CLEAR_FILTER", "ACTION_CARD", "ACTION_NAVIGATE_TO_DETAIL", "ACTION_CTA", "TRANSACTION_LIST", "TRANSACTION_CARD", "LINK_EMAIL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Ledger {
        public static final int $stable = 0;
        public static final java.lang.String ACTION_CARD = "action_card";
        public static final java.lang.String ACTION_CTA = "action_cta";
        public static final java.lang.String ACTION_NAVIGATE_TO_DETAIL = "navigate_to_detail";
        public static final java.lang.String CLEAR_FILTER = "clear_filter";
        public static final java.lang.String FILTER = "filter";
        public static final java.lang.String FILTER_BAR = "filter_bar";
        public static final java.lang.String FILTER_CHIP = "filter_chip";
        public static final java.lang.String FILTER_DATES_ITEM = "dates";
        public static final java.lang.String FILTER_ICON = "filter_icon";
        public static final com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger INSTANCE = new com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger();
        public static final java.lang.String LINK_EMAIL = "link_email";
        public static final java.lang.String TRANSACTION_CARD = "transaction_card";
        public static final java.lang.String TRANSACTION_LIST = "transaction_list";

        private Ledger() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext getTransactionContext(java.lang.String amount, java.lang.String paymentType) {
            return new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext("unknown", "unknown", "unknown", "unknown", amount == null ? "unknown" : amount, paymentType == null ? "unknown" : paymentType, "unknown", null, 128, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/analytics/ActivityAnalyticsConstants$Search;", "", "<init>", "()V", "", "SEARCH_BAR", "Ljava/lang/String;", "SEARCH_ICON", "SEARCH_RESULTS", "SEARCH_INPUT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Search {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Search INSTANCE = new com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Search();
        public static final java.lang.String SEARCH_BAR = "search_bar";
        public static final java.lang.String SEARCH_ICON = "search_icon";
        public static final java.lang.String SEARCH_INPUT = "search_input";
        public static final java.lang.String SEARCH_RESULTS = "search_results";

        private Search() {
        }
    }
}
