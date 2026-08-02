package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/ShippingAddressMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/ShippingAddressFragment;", "graphqlAddress", "", "recipientName", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "toDomain", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/ShippingAddressFragment;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "", "graphqlAddresses", "toDomainList", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShippingAddressMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.data.mapper.ShippingAddressMapper INSTANCE = new com.paypal.oslo.feature.p2p.data.mapper.ShippingAddressMapper();

    private ShippingAddressMapper() {
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress toDomain(com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment graphqlAddress, java.lang.String recipientName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphqlAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipientName, "");
        return new com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress(graphqlAddress.getId().toString(), recipientName, new com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address(graphqlAddress.getAddress().getAddressLine1(), graphqlAddress.getAddress().getAddressLine2(), graphqlAddress.getAddress().getAddressLine3(), graphqlAddress.getAddress().getAdminArea2(), graphqlAddress.getAddress().getAdminArea1(), graphqlAddress.getAddress().getPostalCode(), graphqlAddress.getAddress().getCountryCode().toString()), graphqlAddress.getDefault());
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> toDomainList(java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment> graphqlAddresses, java.lang.String recipientName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphqlAddresses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipientName, "");
        java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment> list = graphqlAddresses;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.toDomain((com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment) it.next(), recipientName));
        }
        return arrayList;
    }
}
