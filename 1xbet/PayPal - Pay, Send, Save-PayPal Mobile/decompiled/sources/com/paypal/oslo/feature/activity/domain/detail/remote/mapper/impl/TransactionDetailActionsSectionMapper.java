package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailActionsSectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailActionsSectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailActionsSectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailActionsSectionMapper();

    private TransactionDetailActionsSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> actions = input.getResult().getActions();
        return !(actions == null || actions.isEmpty());
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> actions = input.getResult().getActions();
        java.util.ArrayList arrayList = null;
        if (actions != null) {
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> list = actions;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action action : list) {
                com.paypal.oslo.api.graphql.schema.type.ActivityActionType type = action.getActivityActionsFragment().getType();
                java.lang.Object url = action.getActivityActionsFragment().getUrl();
                java.lang.String obj = url != null ? url.toString() : null;
                java.lang.String id = input.getResult().getId();
                java.lang.String groupId = input.getResult().getGroupId();
                java.lang.String invoiceId = input.getResult().getInvoiceId();
                com.paypal.oslo.api.graphql.schema.type.ActivityType type2 = input.getResult().getType();
                com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags flags = input.getResult().getFlags();
                arrayList2.add(new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel(type, obj, new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo(id, groupId, invoiceId, type2, (flags == null || (activityFlagsFragment = flags.getActivityFlagsFragment()) == null) ? null : com.paypal.oslo.feature.activity.domain.common.extensions.ActivityModelMapperExtensionsKt.toActivityFlags(activityFlagsFragment), com.paypal.oslo.feature.activity.domain.detail.extensions.ActivityDetailExtensionsKt.toActivityCounterPartyAmountInformation(input.getResult().getAmountInfo()), (java.lang.String) null, (java.lang.Boolean) null, input.getResult().getCreatedTime().toString(), 192, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailActionsModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel(arrayList));
    }
}
