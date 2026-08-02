package com.paypal.oslo.feature.activity.ui.ledger.model.helper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/helper/ActivityLedgerFiltersUIHelper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "activityFilterType", "", "getFilterLabelResIdByType$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Ljava/lang/Integer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerFiltersUIHelper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerFiltersUIHelper INSTANCE = new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerFiltersUIHelper();

    private ActivityLedgerFiltersUIHelper() {
    }

    public final java.lang.Integer getFilterLabelResIdByType$activity_prodRelease(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_filter_purchase);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_filter_package);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_filter_sent_and_received);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_filter_this_month);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_filter_past_month);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_filter_three_month);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_smb_payments_received);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_smb_payments_sent);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_custom_date_format);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
