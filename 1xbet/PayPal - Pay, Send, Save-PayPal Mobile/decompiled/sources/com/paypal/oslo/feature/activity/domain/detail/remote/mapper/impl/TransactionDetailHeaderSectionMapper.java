package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailHeaderSectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailHeaderSectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailHeaderSectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailHeaderSectionMapper();

    private TransactionDetailHeaderSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return input.getResult().getCounterparty().getActivityCounterpartyDetailFragment().getDisplayName().length() > 0;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.domain.detail.models.AmountColorType amountColorType;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result result = input.getResult();
        com.paypal.oslo.feature.activity.domain.common.models.CounterPartyAvatar counterPartyAvatar = com.paypal.oslo.feature.activity.domain.common.extensions.ActivityAvatarMapperExtensionsKt.toCounterPartyAvatar(result.getAvatar().getActivityAvatarDetailFragment());
        java.lang.String displayName = result.getCounterparty().getActivityCounterpartyDetailFragment().getDisplayName();
        java.lang.String displayStatus = result.getDisplayStatus();
        java.lang.String str2 = displayStatus == null ? "" : displayStatus;
        java.lang.String displayDateTimeFormat$activity_prodRelease = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.toDisplayDateTimeFormat$activity_prodRelease(result.getCreatedTime().toString(), result.getDisplayDateFormat());
        java.lang.String value = result.getAmountInfo().getActivityAmountInfoDetailFragment().getAmount().getActivityMoneyFragment().getValue();
        if (result.getMoneyMovementDirection() == com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection.CREDIT) {
            amountColorType = com.paypal.oslo.feature.activity.domain.detail.models.AmountColorType.GREEN;
        } else {
            amountColorType = com.paypal.oslo.feature.activity.domain.detail.models.AmountColorType.BLACK;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.AmountColorType amountColorType2 = amountColorType;
        java.lang.String obj = result.getAmountInfo().getActivityAmountInfoDetailFragment().getAmount().getActivityMoneyFragment().getCurrencyCode().toString();
        if (result.getMoneyMovementDirection() == com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection.CREDIT) {
            str = "+";
        } else {
            str = "-";
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHeaderModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHeaderSectionModel(counterPartyAvatar, displayName, str2, displayDateTimeFormat$activity_prodRelease, value, amountColorType2, obj, str, result.getStatus(), false, 512, null));
    }
}
