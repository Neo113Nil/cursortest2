package com.paypal.oslo.feature.activity.domain.detail.remote.mapper;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/TransactionDetailsResultSectionsMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "getTransactionDetailSectionsDomainList", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Ljava/util/List;", "input", "getActivityDetailTransactionSections$activity_prodRelease", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailsResultSectionsMapper {
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.TransactionDetailsResultSectionsMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.TransactionDetailsResultSectionsMapper();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper> getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper[]{com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailHeaderSectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailAdditionalInfoSectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailP2PMessageSectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetail1099KAndBUWSectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailFundingInstrumentSectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailCounterpartyInfoSectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailNetworksOfWalletMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailActionsSectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailRewardSectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailETATrackerSectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailOrderSummarySectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailShippingInfoSectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailCopyableIdSectionMapper.INSTANCE, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailHelpSectionMapper.INSTANCE});
    public static final int $stable = 8;

    private TransactionDetailsResultSectionsMapper() {
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel> getTransactionDetailSectionsDomainList(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(getActivityDetailTransactionSections$activity_prodRelease(data));
        return arrayList;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel> getActivityDetailTransactionSections$activity_prodRelease(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper iActivityTransactionDetailSectionMapper : getHighSpeedVideoSizes) {
            if (iActivityTransactionDetailSectionMapper.shouldShowSection(input) && (mapFromResult = iActivityTransactionDetailSectionMapper.mapFromResult(input)) != null) {
                arrayList.add(mapFromResult);
            }
        }
        return arrayList;
    }
}
