package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailAdditionalInfoSectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailAdditionalInfoSectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailAdditionalInfoSectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailAdditionalInfoSectionMapper();

    private TransactionDetailAdditionalInfoSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result result = input.getResult();
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight> activityInsights = result.getActivityInsights();
        if (activityInsights != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : activityInsights) {
                if (((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight) obj).getActivityInsightFragment().getType() != com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.P2P_META) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.ArrayList arrayList3 = arrayList;
        boolean z = arrayList3 == null || arrayList3.isEmpty();
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute dispute = result.getDispute();
        return !z || ((dispute != null ? dispute.getActivityDisputeFragment() : null) != null);
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment.Action action;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight> activityInsights = input.getResult().getActivityInsights();
        if (activityInsights != null) {
            java.util.Iterator<T> it = activityInsights.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment activityInsightFragment = ((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight) it.next()).getActivityInsightFragment();
                if (activityInsightFragment.getType() != com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.P2P_META) {
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
                    java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment.Action> actions = activityInsightFragment.getActions();
                    com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment = (actions == null || (action = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment.Action) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) actions)) == null) ? null : action.getActivityActionsFragment();
                    arrayList.add(new com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel(null, displayMessage, arrayList2, activityInsightFragment.getType(), com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE.getActionData$activity_prodRelease(activityInsightFragment, input), com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.getPathForWebViewNavigation$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE, activityActionsFragment, null, 2, null), com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE.getResIdForCTA$activity_prodRelease(activityActionsFragment), activityActionsFragment != null ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.activity.domain.detail.extensions.ActivityDetailExtensionsKt.toActivityActionModel(activityActionsFragment, input)) : null, 1, null));
                }
            }
        }
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute dispute = input.getResult().getDispute();
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment activityDisputeFragment = dispute != null ? dispute.getActivityDisputeFragment() : null;
        if (activityDisputeFragment != null) {
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment2 = activityDisputeFragment.getAction().getActivityActionsFragment();
            arrayList.add(new com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel(null, activityDisputeFragment.getSummary(), kotlin.collections.CollectionsKt.listOf(activityDisputeFragment.getDescription()), com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.UNKNOWN__, null, com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE.getPathForWebViewNavigation$activity_prodRelease(activityActionsFragment2, activityDisputeFragment.getId()), com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.INSTANCE.getResIdForCTA$activity_prodRelease(activityActionsFragment2), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.activity.domain.detail.extensions.ActivityDetailExtensionsKt.toActivityActionModel(activityActionsFragment2, input)), 17, null));
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailAdditionalInfoModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel(arrayList, null, 2, null));
    }
}
