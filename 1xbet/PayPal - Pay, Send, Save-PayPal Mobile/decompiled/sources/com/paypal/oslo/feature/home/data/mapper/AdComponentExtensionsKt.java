package com.paypal.oslo.feature.home.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/AdComponentFragment;", "takeIfValidOrLog", "(Lcom/paypal/oslo/feature/home/graphql/fragment/AdComponentFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/AdComponentFragment;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AdComponentExtensionsKt {
    public static final com.paypal.oslo.feature.home.graphql.fragment.AdComponentFragment takeIfValidOrLog(com.paypal.oslo.feature.home.graphql.fragment.AdComponentFragment adComponentFragment) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponentFragment, "");
        if (adComponentFragment.getPersonalizationTrackingId() != null && adComponentFragment.getAdVariant() != com.paypal.oslo.api.graphql.schema.type.AdComponentVariant.UNKNOWN__) {
            return adComponentFragment;
        }
        java.lang.String str = adComponentFragment.getPersonalizationTrackingId() == null ? "missing personalizationTrackingId" : "unsupported adVariant";
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.home.LoggerKt.log;
        com.paypal.android.logger.categories.Data.Warning warning = com.paypal.android.logger.categories.Data.Warning.INSTANCE;
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("reason", str);
        java.lang.Object personalizationTrackingId = adComponentFragment.getPersonalizationTrackingId();
        if (personalizationTrackingId != null && (obj = personalizationTrackingId.toString()) != null) {
            createMapBuilder.put("trackingId", obj);
        }
        createMapBuilder.put("adVariant", adComponentFragment.getAdVariant().getRawValue());
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(logger, warning, "Ad component dropped", kotlin.collections.MapsKt.build(createMapBuilder), null, 8, null);
        return null;
    }
}
