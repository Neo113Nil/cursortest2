package com.paypal.oslo.feature.wallet.cards.domain.add.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "address", "addNewBillingAddress", "(Ljava/util/List;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;)Ljava/util/List;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "toBillingAddress", "(Lcom/paypal/oslo/core/userstore/model/ProfileAddress;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BillingAddressKt {
    public static final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress> addNewBillingAddress(java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress> list, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress> list2 = list;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress) it.next()).getId(), billingAddress.getId())) {
                    return null;
                }
            }
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf(billingAddress), (java.lang.Iterable) list2);
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress toBillingAddress(com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileAddress, "");
        com.paypal.oslo.core.userstore.model.ProfileAddress.Address address = profileAddress.getAddress();
        java.lang.String addressLine1 = address.getAddressLine1();
        java.lang.String adminArea2 = address.getAdminArea2();
        java.lang.String adminArea1 = address.getAdminArea1();
        java.lang.String postalCode = address.getPostalCode();
        if (addressLine1 == null || adminArea2 == null || adminArea1 == null || postalCode == null) {
            return null;
        }
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress(profileAddress.getId(), addressLine1, address.getAddressLine2(), adminArea2, adminArea1, postalCode, address.getCountryCode());
    }
}
