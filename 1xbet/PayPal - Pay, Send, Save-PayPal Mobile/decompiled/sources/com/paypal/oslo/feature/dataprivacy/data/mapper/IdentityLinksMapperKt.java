package com.paypal.oslo.feature.dataprivacy.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/GetDataPrivacyIdentityLinksQuery$Data;", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/LinkedAccount;", "toLinkedAccounts", "(Lcom/paypal/oslo/feature/dataprivacy/graphql/GetDataPrivacyIdentityLinksQuery$Data;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IdentityLinksMapperKt {
    public static final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount> toLinkedAccounts(com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Data data) {
        com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount linkedAccount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Item> items = data.getIdentityLinks().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : items) {
            if (!((com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Item) obj).getInactive()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.ExternalIdentifier> externalIdentifiers = ((com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.Item) it.next()).getExternalIdentifiers();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : externalIdentifiers) {
                if (!((com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.ExternalIdentifier) obj2).getInactive()) {
                    arrayList3.add(obj2);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                java.lang.String upperCase = ((com.paypal.oslo.feature.dataprivacy.graphql.GetDataPrivacyIdentityLinksQuery.ExternalIdentifier) it2.next()).getTenantName().toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                int hashCode = upperCase.hashCode();
                if (hashCode == -1288775891) {
                    if (upperCase.equals("IZETTLE")) {
                        linkedAccount = com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.ZETTLE;
                    }
                    linkedAccount = null;
                } else if (hashCode != 2700053) {
                    if (hashCode == 68924187 && upperCase.equals("HONEY")) {
                        linkedAccount = com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.HONEY;
                    }
                    linkedAccount = null;
                } else {
                    if (upperCase.equals("XOOM")) {
                        linkedAccount = com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.XOOM;
                    }
                    linkedAccount = null;
                }
                if (linkedAccount != null) {
                    arrayList4.add(linkedAccount);
                }
            }
            kotlin.collections.CollectionsKt.addAll(arrayList2, arrayList4);
        }
        return kotlin.collections.CollectionsKt.distinct(arrayList2);
    }
}
