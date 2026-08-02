package com.paypal.oslo.feature.p2p.ui.review.extensions;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u0000*\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u0000*\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0014\u001a\u0004\u0018\u00010\u0000*\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\t*\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0016\u0010\u000b\u001a\u001f\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\bH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00000\u0017*\u00020\bH\u0000¢\u0006\u0004\b\u001b\u0010\u001a\u001a'\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001e0\u0017*\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0015\u0010!\u001a\u00020\t*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingency;", "unresolvedContingencies", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;Ljava/util/Set;)Ljava/util/List;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "", "hasAmexCard", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)Z", "defaultFundingOption", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "", "id", "findById", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "oldSelectedId", "resetUserSelection", "resolveSelectedFundingOption", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "hasForeignTaxDisclosure", "", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "toCurrencyExchangeMap", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)Ljava/util/Map;", "toFundingOptionMap", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/PaymentLinkDisclosureMapper;", "mapper", "Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "toPaymentLinkDisclosureMap", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;Lcom/paypal/oslo/feature/p2p/ui/review/mappers/PaymentLinkDisclosureMapper;)Ljava/util/Map;", "hasUnresolvedCvvContingency", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FundingOptionsExtensionsKt {
    public static final java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> unresolvedContingencies(com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption, java.util.Set<? extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction> set) {
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> contingencies;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        if (fundingOption == null || (contingencies = fundingOption.getContingencies()) == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : contingencies) {
            com.paypal.oslo.feature.p2p.domain.model.PlanContingency planContingency = (com.paypal.oslo.feature.p2p.domain.model.PlanContingency) obj;
            if (planContingency.getStatus() == com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.UNRESOLVED && set.contains(planContingency.getAction())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean hasAmexCard(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingOption> allowedOptions = fundingOptions.getAllowedOptions();
        if ((allowedOptions instanceof java.util.Collection) && allowedOptions.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = allowedOptions.iterator();
        while (it.hasNext()) {
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> fundingSources = ((com.paypal.oslo.feature.p2p.domain.model.FundingOption) it.next()).getFundingSources();
            if (!(fundingSources instanceof java.util.Collection) || !fundingSources.isEmpty()) {
                java.util.Iterator<T> it2 = fundingSources.iterator();
                while (it2.hasNext()) {
                    java.lang.String brand = ((com.paypal.oslo.feature.p2p.domain.model.FundingSource) it2.next()).getBrand();
                    if (brand != null && kotlin.text.StringsKt.contains((java.lang.CharSequence) brand, (java.lang.CharSequence) com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_AMEX, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final com.paypal.oslo.feature.p2p.domain.model.FundingOption defaultFundingOption(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
        java.util.Iterator<T> it = fundingOptions.getAllowedOptions().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.p2p.domain.model.FundingOption) obj).isDefault()) {
                break;
            }
        }
        return (com.paypal.oslo.feature.p2p.domain.model.FundingOption) obj;
    }

    public static final com.paypal.oslo.feature.p2p.domain.model.FundingOption findById(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
        java.lang.Object obj = null;
        if (str == null) {
            return null;
        }
        java.util.Iterator<T> it = fundingOptions.getAllowedOptions().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.p2p.domain.model.FundingOption) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (com.paypal.oslo.feature.p2p.domain.model.FundingOption) obj;
    }

    public static final com.paypal.oslo.feature.p2p.domain.model.FundingOption resolveSelectedFundingOption(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
        if (z) {
            return defaultFundingOption(fundingOptions);
        }
        com.paypal.oslo.feature.p2p.domain.model.FundingOption findById = findById(fundingOptions, str);
        return findById == null ? defaultFundingOption(fundingOptions) : findById;
    }

    public static final boolean hasForeignTaxDisclosure(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> disclosures;
        if (fundingOptions != null && (disclosures = fundingOptions.getDisclosures()) != null) {
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> list = disclosures;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return false;
            }
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.p2p.domain.model.Disclosure) it.next()).getType(), com.paypal.oslo.feature.p2p.domain.model.Disclosure.TYPENAME_FOREIGN_TAX_DISCLOSURE)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> toCurrencyExchangeMap(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingOption> allowedOptions = fundingOptions.getAllowedOptions();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption : allowedOptions) {
            com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange currencyExchange = fundingOption.getCurrencyExchange();
            kotlin.Pair pair = currencyExchange != null ? kotlin.TuplesKt.to(fundingOption.getId(), currencyExchange) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.MapsKt.toMap(arrayList);
    }

    public static final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> toFundingOptionMap(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingOption> allowedOptions = fundingOptions.getAllowedOptions();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(allowedOptions, 10)), 16));
        for (java.lang.Object obj : allowedOptions) {
            linkedHashMap.put(((com.paypal.oslo.feature.p2p.domain.model.FundingOption) obj).getId(), obj);
        }
        return linkedHashMap;
    }

    public static final java.util.Map<java.lang.String, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> toPaymentLinkDisclosureMap(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentLinkDisclosureMapper paymentLinkDisclosureMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentLinkDisclosureMapper, "");
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingOption> allowedOptions = fundingOptions.getAllowedOptions();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption : allowedOptions) {
            com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType map = paymentLinkDisclosureMapper.map(fundingOption);
            kotlin.Pair pair = map != null ? kotlin.TuplesKt.to(fundingOption.getId(), map) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.MapsKt.toMap(arrayList);
    }

    public static final boolean hasUnresolvedCvvContingency(com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption) {
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> contingencies;
        if (fundingOption == null || (contingencies = fundingOption.getContingencies()) == null) {
            return false;
        }
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> list = contingencies;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        for (com.paypal.oslo.feature.p2p.domain.model.PlanContingency planContingency : list) {
            if (planContingency.getAction() == com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.CARD_VERIFICATION_DATA_COLLECTION_REQUIRED && planContingency.getStatus() == com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.UNRESOLVED) {
                return true;
            }
        }
        return false;
    }
}
