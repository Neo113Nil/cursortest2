package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel$TransactionItemUiModel;", "newPendingTransactions", "newCompletedTransactions", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel;", "newPaginationState", "addMoreTransactions", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityPaginationStateUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityUiModelMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel addMoreTransactions(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel> list, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel> list2, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel activityPaginationStateUiModel) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready ready;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState activitySectionUiState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityPaginationStateUiModel, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState pending = activityUiModel.getPending();
        if (pending instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready ready2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready) pending;
            ready = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready.copy$default(ready2, null, kotlin.collections.CollectionsKt.plus((java.util.Collection) ready2.getTransactions(), (java.lang.Iterable) list), 1, null);
        } else {
            ready = pending;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState completed = activityUiModel.getCompleted();
        if (completed instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready ready3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready) completed;
            activitySectionUiState = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Ready.copy$default(ready3, null, kotlin.collections.CollectionsKt.plus((java.util.Collection) ready3.getTransactions(), (java.lang.Iterable) list2), 1, null);
        } else {
            activitySectionUiState = completed;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.copy$default(activityUiModel, null, ready, activitySectionUiState, activityPaginationStateUiModel, null, null, 49, null);
    }
}
