package com.paypal.oslo.feature.directdeposit.data.repository;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$VirtualBankAccounts;", "Lcom/paypal/oslo/feature/directdeposit/domain/model/VbaItem;", "toVbaItem", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetVirtualBankAccountsQuery$VirtualBankAccounts;)Lcom/paypal/oslo/feature/directdeposit/domain/model/VbaItem;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VirtualBankAccountRepositoryImplKt {
    public static final com.paypal.oslo.feature.directdeposit.domain.model.VbaItem toVbaItem(com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.api.graphql.schema.type.DirectDebitStatus status;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccounts, "");
        if (virtualBankAccounts.getPage().getItems().isEmpty()) {
            return null;
        }
        com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Item item = virtualBankAccounts.getPage().getItems().get(0);
        java.lang.String bankAccountNumber = item.getBankAccountNumber();
        java.lang.String str = bankAccountNumber == null ? "" : bankAccountNumber;
        java.lang.String routingNumber = item.getRoutingNumber();
        java.lang.String str2 = routingNumber == null ? "" : routingNumber;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountCapability> capabilities = item.getCapabilities();
        if (capabilities != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountCapability virtualBankAccountCapability : capabilities) {
                java.lang.String name2 = virtualBankAccountCapability != null ? virtualBankAccountCapability.name() : null;
                if (name2 != null) {
                    arrayList2.add(name2);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
        java.lang.String id = item.getId();
        java.lang.String str3 = id == null ? "" : id;
        java.lang.String productName = item.getProductName();
        java.lang.String str4 = productName == null ? "" : productName;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus status2 = item.getStatus();
        java.lang.String name3 = status2 != null ? status2.name() : null;
        java.lang.String str5 = name3 == null ? "" : name3;
        com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.DirectDebit directDebit = item.getDirectDebit();
        java.lang.String name4 = (directDebit == null || (status = directDebit.getStatus()) == null) ? null : status.name();
        com.paypal.oslo.feature.directdeposit.graphql.GetVirtualBankAccountsQuery.Issuer issuer = item.getIssuer();
        java.lang.String name5 = issuer != null ? issuer.getName() : null;
        return new com.paypal.oslo.feature.directdeposit.domain.model.VbaItem(str, emptyList, str3, str4, str5, str2, name4, name5 == null ? "" : name5);
    }
}
