package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingMobileDeepLinkFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/navigation/CreditMobileDeeplink;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingMobileDeepLinkFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/navigation/CreditMobileDeeplink;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MobileDeeplinkMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.navigation.CreditMobileDeeplink toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment revolvingCreditServicingMobileDeepLinkFragment) {
        java.util.LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingMobileDeepLinkFragment, "");
        java.lang.String title = revolvingCreditServicingMobileDeepLinkFragment.getTitle();
        java.lang.String obj = revolvingCreditServicingMobileDeepLinkFragment.getUrl().toString();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment.Parameter> parameters = revolvingCreditServicingMobileDeepLinkFragment.getParameters();
        if (parameters != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment.Parameter> list = parameters;
            linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment.Parameter parameter : list) {
                kotlin.Pair pair = kotlin.TuplesKt.to(parameter.getName(), parameter.getValue());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.navigation.CreditMobileDeeplink(title, obj, linkedHashMap);
    }
}
