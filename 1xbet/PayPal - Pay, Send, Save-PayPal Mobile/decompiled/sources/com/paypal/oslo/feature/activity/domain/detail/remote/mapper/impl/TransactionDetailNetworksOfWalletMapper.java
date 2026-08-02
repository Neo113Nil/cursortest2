package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailNetworksOfWalletMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailNetworksOfWalletMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailNetworksOfWalletMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailNetworksOfWalletMapper();

    private TransactionDetailNetworksOfWalletMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags flags = input.getResult().getFlags();
        return (flags == null || (activityFlagsFragment = flags.getActivityFlagsFragment()) == null || !activityFlagsFragment.isPaypalWorldTransaction()) ? false : true;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags flags = input.getResult().getFlags();
        if (flags != null && (activityFlagsFragment = flags.getActivityFlagsFragment()) != null && activityFlagsFragment.isPaypalWorldTransaction()) {
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailNetworksOfWalletModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel(java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_transaction_powered_by), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PP_WORLD_LOGO_URL, false, 4, null));
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailNetworksOfWalletModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel(null, null, false, 7, null));
    }
}
