package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "sortedByPriority", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentSortingKt {
    public static final java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> sortedByPriority(java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            if (((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj2).getType() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.SAVINGS) {
                arrayList.add(obj2);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list2) {
            if (obj3 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) {
                arrayList3.add(obj3);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj4 : arrayList3) {
            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) obj4;
            if (fundingInstrumentBankOption.getMode() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT && fundingInstrumentBankOption.getMaximumLimit() != null) {
                arrayList4.add(obj4);
            }
        }
        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList4, new java.util.Comparator() { // from class: com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSortingKt$sortedByPriority$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.math.BigDecimal bigDecimal;
                java.math.BigDecimal bigDecimal2;
                com.paypal.oslo.feature.balance.domain.model.Money maximumLimit = ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) t2).getMaximumLimit();
                if (maximumLimit == null || (bigDecimal = maximumLimit.getAmount()) == null) {
                    bigDecimal = java.math.BigDecimal.ZERO;
                }
                java.math.BigDecimal bigDecimal3 = bigDecimal;
                com.paypal.oslo.feature.balance.domain.model.Money maximumLimit2 = ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) t).getMaximumLimit();
                if (maximumLimit2 == null || (bigDecimal2 = maximumLimit2.getAmount()) == null) {
                    bigDecimal2 = java.math.BigDecimal.ZERO;
                }
                return kotlin.comparisons.ComparisonsKt.compareValues(bigDecimal3, bigDecimal2);
            }
        });
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj5 : list2) {
            if (obj5 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) {
                arrayList5.add(obj5);
            }
        }
        java.util.ArrayList arrayList6 = arrayList5;
        java.util.Iterator it = arrayList6.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption fundingInstrumentCardOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) obj;
            if (kotlin.text.StringsKt.equals(fundingInstrumentCardOption.getBrand(), "VISA", true) && kotlin.text.StringsKt.equals(fundingInstrumentCardOption.getProductClass(), "DEBIT", true)) {
                break;
            }
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption fundingInstrumentCardOption2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) obj;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.addAll(arrayList2);
        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) kotlin.collections.CollectionsKt.firstOrNull(sortedWith);
        if (fundingInstrumentBankOption2 != null) {
            createListBuilder.add(fundingInstrumentBankOption2);
        }
        if (fundingInstrumentCardOption2 != null) {
            createListBuilder.add(fundingInstrumentCardOption2);
        }
        createListBuilder.addAll(kotlin.collections.CollectionsKt.drop(sortedWith, 1));
        createListBuilder.addAll(kotlin.collections.CollectionsKt.minus((java.lang.Iterable) arrayList6, (java.lang.Iterable) kotlin.collections.CollectionsKt.toSet(kotlin.collections.CollectionsKt.listOfNotNull(fundingInstrumentCardOption2))));
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }
}
