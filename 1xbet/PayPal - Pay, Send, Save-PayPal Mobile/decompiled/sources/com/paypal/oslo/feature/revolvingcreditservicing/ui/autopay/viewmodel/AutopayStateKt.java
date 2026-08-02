package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "", "", "toIds", "(Ljava/util/List;)Ljava/util/Set;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayStateKt {
    public static final java.util.Set<java.lang.String> toIds(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list) {
        if (list != null) {
            java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) it.next()).getId());
            }
            java.util.Set<java.lang.String> set = kotlin.collections.CollectionsKt.toSet(arrayList);
            if (set != null) {
                return set;
            }
        }
        return kotlin.collections.SetsKt.emptySet();
    }
}
