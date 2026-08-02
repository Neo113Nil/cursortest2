package com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/mapper/ActivityDetailSectionComposableRegistry;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "T", "model", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/mapper/IActivityDetailSectionComposableMapper;", "findMapper", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;)Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/mapper/IActivityDetailSectionComposableMapper;", "", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailSectionComposableRegistry {
    public static final com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.ActivityDetailSectionComposableRegistry INSTANCE = new com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.ActivityDetailSectionComposableRegistry();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper<?>> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper[]{com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHeaderComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailP2PMessageComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAdditionalInfoComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetail1099KAndBUWComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailActionsComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailCounterpartyInfoComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRewardComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailTransactionIdComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailOrderSummaryComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailShippingInfoComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailEtaTrackerComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailRefundDetailComposableMapper.INSTANCE, com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailNetworksOfWalletComposableMapper.INSTANCE});
    public static final int $stable = 8;

    private ActivityDetailSectionComposableRegistry() {
    }

    public final <T extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel> com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper<T> findMapper(T model) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        java.util.Iterator<T> it = getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper) obj).canHandle(model)) {
                break;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return (com.paypal.oslo.feature.activity.ui.detail.view.compose.mapper.IActivityDetailSectionComposableMapper) obj;
    }
}
