package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/UnEnrolledAccountFeatureRowUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/accountfeatures/AccountFeaturesSectionUiState;", "mapToAccountFeaturesSection", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountFeaturesSectionUiStateMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState mapToAccountFeaturesSection(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView) {
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot> unenrolledAccountFeaturesSnapshot;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryOverView, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.AccountEngagementOverview accountEngagementOverview = accountSummaryOverView.getAccountEngagementOverview();
        if (accountEngagementOverview == null || (unenrolledAccountFeaturesSnapshot = accountEngagementOverview.getUnenrolledAccountFeaturesSnapshot()) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : unenrolledAccountFeaturesSnapshot) {
                if (((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot) obj).getAction() instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction.Redirect) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        java.util.ArrayList arrayList3 = arrayList;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error(null, 1, null);
        }
        java.util.List take = kotlin.collections.CollectionsKt.take(arrayList, 3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(take, 10));
        java.util.Iterator it = take.iterator();
        while (it.hasNext()) {
            arrayList4.add(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.AccountFeatureMapperKt.toUiModel((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot) it.next()));
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(arrayList4);
    }
}
