package com.paypal.oslo.feature.bnplacquisition.domain.model.productselection;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/EligibleProductOffer;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "toCreditProductIdentifiers", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EligibleProductOfferKt {
    public static final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> toCreditProductIdentifiers(java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer) it.next()).getCreditProductIdentifier());
        }
        return arrayList;
    }
}
