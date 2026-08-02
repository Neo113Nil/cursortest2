package com.paypal.oslo.feature.activity.ui.ledger.model.helper;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/helper/ActivityActionCardHelper;", "", "Lkotlin/Function0;", "", "isActionCardFeatureEnabled", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "reset", "()V", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "uiState", "emailLinkStatus", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "activityFilterType", "injectIntoUiState", "(Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "pagingData", "injectIntoPagingData", "(Landroidx/paging/PagingData;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Landroidx/paging/PagingData;", "p0", "p1", "Camera2StreamConfigurationMap", "(Ljava/lang/Boolean;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Z", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "isActionCardInjected", "Z", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityActionCardHelper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    private boolean isActionCardInjected;

    public ActivityActionCardHelper(kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }

    /* renamed from: isActionCardInjected, reason: from getter */
    public final boolean getIsActionCardInjected() {
        return this.isActionCardInjected;
    }

    public final void reset() {
        this.isActionCardInjected = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState injectIntoUiState(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState uiState, java.lang.Boolean emailLinkStatus, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
        if ((uiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success) && Camera2StreamConfigurationMap(emailLinkStatus, activityFilterType)) {
            com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success success = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success) uiState;
            com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult result = success.getResult();
            com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResult data = result != null ? result.getData() : null;
            com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult activityItemsResult = data instanceof com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult ? (com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult) data : null;
            if (activityItemsResult != null) {
                java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> activityItemDomainList$activity_prodRelease = activityItemsResult.getActivityItemDomainList$activity_prodRelease();
                java.util.Iterator<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> it = activityItemDomainList$activity_prodRelease.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem next = it.next();
                    if ((next instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) && com.paypal.oslo.feature.activity.domain.ledger.models.extension.ActivityTransactionModelExtensionsKt.isMerchantPhysicalGoodsTransaction(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) next).getData())) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    this.isActionCardInjected = true;
                    java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) activityItemDomainList$activity_prodRelease);
                    com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem = activityItemDomainList$activity_prodRelease.get(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(activityItem, "");
                    mutableList.set(i, new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem).getData(), new com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel(com.paypal.oslo.feature.activity.R.string.feature_activity_empty_package_tracking_filter_title, com.paypal.oslo.feature.activity.R.string.feature_activity_empty_package_tracking_filter_link_mail_cta_text, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.ACTION_CARD_IMAGE_URL), 0L, 4, null));
                    activityItemsResult.replaceActivityItems$activity_prodRelease(mutableList);
                    if (success != null) {
                        return success;
                    }
                }
            }
            success = null;
            if (success != null) {
            }
        }
        return uiState;
    }

    public final androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> injectIntoPagingData(androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> pagingData, java.lang.Boolean emailLinkStatus, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
        androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> map;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
        if (!Camera2StreamConfigurationMap(emailLinkStatus, activityFilterType)) {
            return pagingData;
        }
        map = androidx.paging.PagingDataTransforms__PagingDataTransformsKt.map(pagingData, new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper$injectIntoPagingData$1(this, null));
        return map;
    }

    private final boolean Camera2StreamConfigurationMap(java.lang.Boolean p0, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType p1) {
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke().booleanValue() && kotlin.jvm.internal.Intrinsics.areEqual(p1, new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null)) && !this.isActionCardInjected && kotlin.jvm.internal.Intrinsics.areEqual(p0, java.lang.Boolean.FALSE);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel access$buildActionCardModel(com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper activityActionCardHelper) {
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel(com.paypal.oslo.feature.activity.R.string.feature_activity_empty_package_tracking_filter_title, com.paypal.oslo.feature.activity.R.string.feature_activity_empty_package_tracking_filter_link_mail_cta_text, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.ACTION_CARD_IMAGE_URL);
    }
}
