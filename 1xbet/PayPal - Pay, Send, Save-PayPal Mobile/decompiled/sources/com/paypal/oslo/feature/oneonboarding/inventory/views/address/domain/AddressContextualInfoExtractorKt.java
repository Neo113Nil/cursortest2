package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "contextualInfoMap", "addressComponentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/AddressCorrectionMetadata;", "extractAddressCorrectionMetadata-BEc_t1A", "(Ljava/util/Map;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/domain/AddressCorrectionMetadata;", "extractAddressCorrectionMetadata"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressContextualInfoExtractorKt {
    /* renamed from: extractAddressCorrectionMetadata-BEc_t1A, reason: not valid java name */
    public static final com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata m16910extractAddressCorrectionMetadataBEc_t1A(java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> map, java.lang.String str) {
        com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list = map.get(str != null ? com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(str) : null);
        java.lang.Object metadata = (list == null || (contextualInfo = (com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list)) == null) ? null : contextualInfo.getMetadata();
        com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata addressCorrectionMetadata = metadata instanceof com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata ? (com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata) metadata : null;
        if (metadata != null && addressCorrectionMetadata == null) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.oneonboarding.LoggerKt.log;
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(metadata.getClass()).getSimpleName();
            com.paypal.android.logger.Logger.w$default(logger, "Unexpected contextual info metadata type for address", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", simpleName != null ? simpleName : "")), null, 4, null);
        }
        return addressCorrectionMetadata;
    }
}
