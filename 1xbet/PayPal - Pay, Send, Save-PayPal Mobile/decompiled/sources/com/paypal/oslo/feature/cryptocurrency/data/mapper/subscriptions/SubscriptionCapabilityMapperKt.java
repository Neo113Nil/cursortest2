package com.paypal.oslo.feature.cryptocurrency.data.mapper.subscriptions;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$Capability;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/SubscriptionCapability;", "toDomain", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$Capability;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/SubscriptionCapability;", "", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SubscriptionCapabilityMapperKt {
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability capability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capability, "");
        java.lang.String name2 = capability.getName();
        boolean provisioningRequired = capability.getProvisioningRequired();
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent intent = capability.getIntent();
        java.lang.String rawValue = intent != null ? intent.getRawValue() : null;
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability(name2, provisioningRequired, rawValue != null ? rawValue : "");
    }

    public static final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability> toDomain(java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability capability : list) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.SubscriptionCapability domain = capability != null ? toDomain(capability) : null;
            if (domain != null) {
                arrayList.add(domain);
            }
        }
        return arrayList;
    }
}
