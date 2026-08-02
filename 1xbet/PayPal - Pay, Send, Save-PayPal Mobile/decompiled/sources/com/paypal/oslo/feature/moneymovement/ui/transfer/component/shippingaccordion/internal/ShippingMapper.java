package com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/internal/ShippingMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "shippingAddress", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/internal/ShippingOption;", "mapToOption", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;)Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/internal/ShippingOption;", "", "addresses", "mapToOptions", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress$Address;", "p0", "", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress$Address;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShippingMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingMapper INSTANCE = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingMapper();

    private ShippingMapper() {
    }

    public final com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption mapToOption(com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress shippingAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAddress, "");
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption(shippingAddress.getId(), shippingAddress.getRecipientName(), getHighSpeedVideoSizes(shippingAddress.getAddress()), getHighSpeedVideoSizes(shippingAddress.getAddress()));
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption> mapToOptions(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> addresses) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> list = addresses;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.mapToOption((com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress) it.next()));
        }
        return arrayList;
    }

    private static java.lang.String getHighSpeedVideoSizes(com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress.Address p0) {
        return kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{p0.getLine1(), p0.getState(), p0.getPostalCode()}), " ", null, null, 0, null, null, 62, null);
    }
}
