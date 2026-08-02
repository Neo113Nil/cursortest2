package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailCounterpartyInfoSectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailCounterpartyInfoSectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailCounterpartyInfoSectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailCounterpartyInfoSectionMapper();

    private TransactionDetailCounterpartyInfoSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight> activityInsights = input.getResult().getActivityInsights();
        java.lang.Object obj = null;
        if (activityInsights != null) {
            java.util.Iterator<T> it = activityInsights.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight) next).getActivityInsightFragment().getType() == com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.P2P_META) {
                    obj = next;
                    break;
                }
            }
            obj = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight) obj;
        }
        return obj != null;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight activityInsight;
        java.lang.Integer num;
        int i;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment activityInsightFragment;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight> activityInsights = input.getResult().getActivityInsights();
        java.lang.String str = null;
        if (activityInsights != null) {
            java.util.Iterator<T> it = activityInsights.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight) obj).getActivityInsightFragment().getType() == com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.P2P_META) {
                    break;
                }
            }
            activityInsight = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight) obj;
        } else {
            activityInsight = null;
        }
        com.paypal.oslo.api.graphql.schema.type.ActivityType type = input.getResult().getType();
        com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection moneyMovementDirection = input.getResult().getMoneyMovementDirection();
        if (type == com.paypal.oslo.api.graphql.schema.type.ActivityType.MONEY_REQUEST) {
            num = java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_requested_from_label);
        } else if (type == com.paypal.oslo.api.graphql.schema.type.ActivityType.PAYMENT) {
            if (moneyMovementDirection == com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection.DEBIT) {
                i = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_sent_to_label;
            } else {
                i = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_paid_by_label;
            }
            num = java.lang.Integer.valueOf(i);
        } else {
            num = null;
        }
        if (activityInsight != null && (activityInsightFragment = activityInsight.getActivityInsightFragment()) != null) {
            str = activityInsightFragment.getDisplayMessage();
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailCounterpartyInfoSectionModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel(num, str));
    }
}
