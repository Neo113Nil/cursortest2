package com.paypal.oslo.feature.directdeposit.data.repository;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;", "Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;", "toSmartRoutePreferences", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;)Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRoutePreferences;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SmartRoutePreferencesRepositoryImplKt {
    public static final com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences toSmartRoutePreferences(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRoutePreferences, "");
        com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution distribution = smartRoutePreferences.getDistribution();
        java.lang.String name2 = distribution.getMethod().name();
        java.lang.String name3 = distribution.getSource().name();
        java.util.List<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target> targets = distribution.getTargets();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(targets, 10));
        for (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target target : targets) {
            arrayList.add(new com.paypal.oslo.feature.directdeposit.domain.model.Target(target.getAccountType().name(), target.getAllocation().getOnSmartRoutePercentage() != null ? java.lang.Double.valueOf(r6.getValue()) : null, target.getEligibilityStatus().name()));
        }
        return new com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences(new com.paypal.oslo.feature.directdeposit.domain.model.Distribution(name2, name3, arrayList), smartRoutePreferences.getStatus().name(), smartRoutePreferences.getVersion());
    }
}
