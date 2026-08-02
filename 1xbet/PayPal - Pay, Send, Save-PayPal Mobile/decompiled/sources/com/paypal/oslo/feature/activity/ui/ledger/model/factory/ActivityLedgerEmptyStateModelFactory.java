package com.paypal.oslo.feature.activity.ui.ledger.model.factory;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/factory/ActivityLedgerEmptyStateModelFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/factory/ActivityLedgerEmptyStateModel;", "createDefaultEmptyStateModel$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/ui/ledger/model/factory/ActivityLedgerEmptyStateModel;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "activityFilterType", "createFilterEmptyStateModel$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/factory/ActivityLedgerEmptyStateModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerEmptyStateModelFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModelFactory INSTANCE = new com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModelFactory();

    private ActivityLedgerEmptyStateModelFactory() {
    }

    public final com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel createDefaultEmptyStateModel$activity_prodRelease() {
        return new com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel(com.paypal.oslo.feature.activity.R.string.feature_activity_no_activity_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_no_activity_description), null, null, 12, null);
    }

    public final com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel createFilterEmptyStateModel$activity_prodRelease(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages) {
            return new com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel(com.paypal.oslo.feature.activity.R.string.feature_activity_empty_package_tracking_filter_title, null, null, com.paypal.pds.core.Icon.Truck.INSTANCE, 4, null);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth) {
            return new com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel(com.paypal.oslo.feature.activity.R.string.feature_activity_filters_no_activity_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_filters_no_activity_description_this_month), null, null, 12, null);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth) {
            return new com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel(com.paypal.oslo.feature.activity.R.string.feature_activity_filters_no_activity_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_filters_no_activity_description_past_month), null, null, 12, null);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent) {
            return new com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel(com.paypal.oslo.feature.activity.R.string.feature_activity_filters_no_activity_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_filters_no_activity_description_payments_sent), null, null, 12, null);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived) {
            return new com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel(com.paypal.oslo.feature.activity.R.string.feature_activity_filters_no_activity_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_filters_no_activity_description_payment_received), null, null, 12, null);
        }
        if (activityFilterType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth) {
            return new com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel(com.paypal.oslo.feature.activity.R.string.feature_activity_filters_no_activity_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_filters_no_activity_description_past_three_month), null, null, 12, null);
        }
        return new com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel(com.paypal.oslo.feature.activity.R.string.feature_activity_filters_no_activity_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_no_activity_description), null, null, 12, null);
    }
}
