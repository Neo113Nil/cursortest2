package com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/internal/ShippingOption;", "toShippingOption", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;)Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/internal/ShippingOption;", "", "toShippingOptions", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShippingMapperKt {
    public static final com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption toShippingOption(com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress shippingAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAddress, "");
        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingMapper.INSTANCE.mapToOption(shippingAddress);
    }

    public static final java.util.List<com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption> toShippingOptions(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingMapper.INSTANCE.mapToOptions(list);
    }
}
