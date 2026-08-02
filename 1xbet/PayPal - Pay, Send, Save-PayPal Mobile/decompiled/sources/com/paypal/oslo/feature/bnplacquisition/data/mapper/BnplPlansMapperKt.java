package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/plans/BnplPlansResponse;", "toBnplPlansResponse", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/plans/BnplPlansResponse;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansRequest;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplPlansMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse toBnplPlansResponse(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.BnplPlans bnplPlans;
        if (data == null || (bnplPlans = data.getBnplPlans()) == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item> items = bnplPlans.getPage().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            java.lang.Object creditAccountId = ((com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Item) it.next()).getCreditAccountId();
            java.lang.String str = creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null;
            com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlanItem bnplPlanItem = str != null ? new com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlanItem(str) : null;
            if (bnplPlanItem != null) {
                arrayList.add(bnplPlanItem);
            }
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse(new com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage(arrayList));
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest bnplPlansRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplPlansRequest, "");
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansFilterOptions filterOptions = bnplPlansRequest.getFilterOptions();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplServicingPlanStatus> planStatuses = filterOptions.getPlanStatuses();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(planStatuses, 10));
        java.util.Iterator<T> it = planStatuses.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplServicingPlanStatus) it.next()).name()));
        }
        com.apollographql.apollo.api.Optional.Present present = companion.present(arrayList);
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> creditProductIdentifiers = filterOptions.getCreditProductIdentifiers();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(creditProductIdentifiers, 10));
        java.util.Iterator<T> it2 = creditProductIdentifiers.iterator();
        while (it2.hasNext()) {
            arrayList2.add(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier) it2.next()).name()));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus> accountStatuses = filterOptions.getAccountStatuses();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(accountStatuses, 10));
        java.util.Iterator<T> it3 = accountStatuses.iterator();
        while (it3.hasNext()) {
            arrayList4.add(com.paypal.oslo.api.graphql.schema.type.BNPLAccountStatus.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus) it3.next()).name()));
        }
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput(new com.paypal.oslo.api.graphql.schema.type.BNPLPlansFilterOptionsInput(null, present, null, arrayList3, null, companion2.present(arrayList4), 21, null), null, null, null, 14, null);
    }
}
