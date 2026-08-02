package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/prioritizedaccountactionmodule/PrioritizedAccountActionSectionUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/prioritizedaccountactionmodule/PrioritizedAccountActionSectionUiState;", "mapToPrioritizedAccountActionSectionUiState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", "itemId", "removeDismissedItem", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/PrioritizedAccountAction;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/PrioritizedAccountAction;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PrioritizedAccountActionsMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> mapToPrioritizedAccountActionSectionUiState(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView) {
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction> prioritizedAccountActions;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryOverView, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.AccountEngagementOverview accountEngagementOverview = accountSummaryOverView.getAccountEngagementOverview();
        if (accountEngagementOverview == null || (prioritizedAccountActions = accountEngagementOverview.getPrioritizedAccountActions()) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : prioritizedAccountActions) {
                if (((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction) obj).getAction() != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        java.util.ArrayList arrayList3 = arrayList;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden.INSTANCE;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction) obj2).isDismissible()) {
                arrayList4.add(obj2);
            } else {
                arrayList5.add(obj2);
            }
        }
        kotlin.Pair pair = new kotlin.Pair(arrayList4, arrayList5);
        java.util.List list = (java.util.List) pair.component1();
        java.util.List list2 = (java.util.List) pair.component2();
        java.util.List list3 = list;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
        java.util.Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList6.add(toUiModel((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction) it.next()));
        }
        java.util.ArrayList arrayList7 = arrayList6;
        java.util.List list4 = list2;
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
        java.util.Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList8.add(toUiModel((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction) it2.next()));
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel(arrayList7, arrayList8));
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel toUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction prioritizedAccountAction) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prioritizedAccountAction, "");
        java.lang.String name2 = prioritizedAccountAction.getName();
        java.lang.String title = prioritizedAccountAction.getTitle();
        java.lang.String description = prioritizedAccountAction.getDescription();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel uiModel = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.util.CreditImageToCreditAvatarUiModelMapperKt.toUiModel(prioritizedAccountAction.getIcon(), com.paypal.pds.core.Icon.NoIcon.INSTANCE);
        com.paypal.pds.core.Color.BackgroundBase backgroundBase = com.paypal.pds.core.Color.BackgroundBase.INSTANCE;
        com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
        if (prioritizedAccountAction.isDismissible()) {
            actionType = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.DISMISSIBLE;
        } else {
            actionType = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.NAVIGATION;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel(name2, title, description, uiModel, backgroundBase, contentBase, actionType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> removeDismissedItem(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, ? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> accountSummarySectionUiState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummarySectionUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (accountSummarySectionUiState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel prioritizedAccountActionSectionUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel) ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready) accountSummarySectionUiState).getData();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> dismissible = prioritizedAccountActionSectionUiModel.getDismissible();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : dismissible) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel) obj).getId(), str)) {
                    arrayList.add(obj);
                }
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel.copy$default(prioritizedAccountActionSectionUiModel, arrayList, null, 2, null));
        }
        if ((accountSummarySectionUiState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error) || (accountSummarySectionUiState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden) || (accountSummarySectionUiState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty)) {
            return accountSummarySectionUiState;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
