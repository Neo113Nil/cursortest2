package com.paypal.oslo.feature.activity.domain.usecase.common.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$CustomDateRange;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$CustomDateRange;", "toCustomRangeDateFilter", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$CustomDateRange;)Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$CustomDateRange;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityFilterExtensionsKt {
    public static final com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange toCustomRangeDateFilter(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange customDateRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customDateRange, "");
        com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel filterModel = customDateRange.getFilterModel();
        java.lang.String startDate = filterModel != null ? filterModel.getStartDate() : null;
        java.lang.String str = startDate == null ? "" : startDate;
        com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel filterModel2 = customDateRange.getFilterModel();
        java.lang.String endDate = filterModel2 != null ? filterModel2.getEndDate() : null;
        return new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange(str, endDate == null ? "" : endDate, 0, 0, 12, null);
    }
}
