package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetail1099KAndBUWSectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "p0", "Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetail1099KAndBUWSectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetail1099KAndBUWSectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetail1099KAndBUWSectionMapper();

    private TransactionDetail1099KAndBUWSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return Camera2StreamConfigurationMap(input) != null;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(input);
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel = com.paypal.oslo.feature.activity.domain.detail.extensions.ActivityDetailExtensionsKt.toActivityTaxHoldBreakDownModel(input);
        if (Camera2StreamConfigurationMap != null) {
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetail1099KORBUWModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel(Camera2StreamConfigurationMap, activityTaxHoldBreakDownModel, com.paypal.pds.core.Color.BackgroundMuted.INSTANCE));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel Camera2StreamConfigurationMap(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data p0) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment.Action> actions;
        java.lang.Object obj;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityRegulatoryInfoFragment activityRegulatoryInfoFragment;
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo regulatoryInfo = p0.getResult().getRegulatoryInfo();
        java.util.ArrayList arrayList = null;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityRegulatoryInfoFragment.TaxHoldInfo taxHoldInfo = (regulatoryInfo == null || (activityRegulatoryInfoFragment = regulatoryInfo.getActivityRegulatoryInfoFragment()) == null) ? null : activityRegulatoryInfoFragment.getTaxHoldInfo();
        if (taxHoldInfo == null) {
            return null;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment activityInsightFragment = taxHoldInfo.getActivityInsightFragment();
        java.lang.String displayMessage = activityInsightFragment.getDisplayMessage();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List<java.lang.String> displaySubMessages = activityInsightFragment.getDisplaySubMessages();
        if (displaySubMessages != null) {
            for (java.lang.String str : displaySubMessages) {
                if (str.length() > 0) {
                    arrayList2.add(str);
                }
            }
        }
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment.Action> actions2 = activityInsightFragment.getActions();
        if (actions2 != null) {
            java.util.Iterator<T> it = actions2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE.getResIdForCTA$activity_prodRelease(((com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment.Action) obj).getActivityActionsFragment()) != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment.Action action = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment.Action) obj;
            if (action != null) {
                activityActionsFragment = action.getActivityActionsFragment();
                com.paypal.pds.core.Icon.Info info = com.paypal.pds.core.Icon.Info.INSTANCE;
                com.paypal.oslo.api.graphql.schema.type.ActivityInsightType type = taxHoldInfo.getActivityInsightFragment().getType();
                com.paypal.oslo.feature.activity.domain.detail.models.ActivityInsightAction actionData$activity_prodRelease = com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE.getActionData$activity_prodRelease(activityInsightFragment, p0);
                java.lang.String pathForWebViewNavigation$activity_prodRelease$default = com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.getPathForWebViewNavigation$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE, activityActionsFragment, null, 2, null);
                java.lang.Integer resIdForCTA$activity_prodRelease = com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE.getResIdForCTA$activity_prodRelease(activityActionsFragment);
                actions = activityInsightFragment.getActions();
                if (actions != null) {
                    java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment.Action> list = actions;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(com.paypal.oslo.feature.activity.domain.detail.extensions.ActivityDetailExtensionsKt.toActivityActionModel(((com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment.Action) it2.next()).getActivityActionsFragment(), p0));
                    }
                    arrayList = arrayList3;
                }
                return new com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel(info, displayMessage, arrayList2, type, actionData$activity_prodRelease, pathForWebViewNavigation$activity_prodRelease$default, resIdForCTA$activity_prodRelease, arrayList);
            }
        }
        activityActionsFragment = null;
        com.paypal.pds.core.Icon.Info info2 = com.paypal.pds.core.Icon.Info.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType type2 = taxHoldInfo.getActivityInsightFragment().getType();
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityInsightAction actionData$activity_prodRelease2 = com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE.getActionData$activity_prodRelease(activityInsightFragment, p0);
        java.lang.String pathForWebViewNavigation$activity_prodRelease$default2 = com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.getPathForWebViewNavigation$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE, activityActionsFragment, null, 2, null);
        java.lang.Integer resIdForCTA$activity_prodRelease2 = com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE.getResIdForCTA$activity_prodRelease(activityActionsFragment);
        actions = activityInsightFragment.getActions();
        if (actions != null) {
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel(info2, displayMessage, arrayList2, type2, actionData$activity_prodRelease2, pathForWebViewNavigation$activity_prodRelease$default2, resIdForCTA$activity_prodRelease2, arrayList);
    }
}
