package com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/paymenttypeaccordion/internal/TypeMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/paymenttypeaccordion/internal/TypeOption;", "mapToOption", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentType;)Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/paymenttypeaccordion/internal/TypeOption;", "", "types", "mapToOptions", "(Ljava/util/List;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TypeMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeMapper INSTANCE = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeMapper();

    private TypeMapper() {
    }

    public final com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeOption mapToOption(com.paypal.oslo.feature.moneymovement.api.domain.PaymentType paymentType) {
        com.paypal.pds.core.Icon.CheckCircle checkCircle;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentType, "");
        java.lang.String id = paymentType.getId();
        java.lang.String displayName = paymentType.getDisplayName();
        java.lang.String description = paymentType.getDescription();
        java.lang.String iconType = paymentType.getIconType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(iconType, "SMILEY")) {
            checkCircle = com.paypal.pds.core.Icon.FaceSmile.INSTANCE;
        } else {
            checkCircle = kotlin.jvm.internal.Intrinsics.areEqual(iconType, "STORE") ? com.paypal.pds.core.Icon.Store.INSTANCE : com.paypal.pds.core.Icon.CheckCircle.INSTANCE;
        }
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeOption(id, displayName, description, checkCircle, paymentType.getInfoLink());
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.ui.transfer.component.paymenttypeaccordion.internal.TypeOption> mapToOptions(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentType> types) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "");
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentType> list = types;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.mapToOption((com.paypal.oslo.feature.moneymovement.api.domain.PaymentType) it.next()));
        }
        return arrayList;
    }
}
