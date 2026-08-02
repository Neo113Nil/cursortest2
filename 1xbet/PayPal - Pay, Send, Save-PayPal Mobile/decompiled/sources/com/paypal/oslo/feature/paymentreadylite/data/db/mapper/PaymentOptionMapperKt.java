package com.paypal.oslo.feature.paymentreadylite.data.db.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentOptionDto;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentOption;", "toDomain", "(Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentOptionDto;)Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentOption;", "toDto", "(Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentOption;)Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentOptionDto;", "", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentOptionMapperKt {
    public static final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption toDomain(com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto paymentOptionDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOptionDto, "");
        return new com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption(paymentOptionDto.getType(), paymentOptionDto.getRank());
    }

    public static final com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto toDto(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption paymentOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOption, "");
        return new com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto(paymentOption.getType(), paymentOption.getRank());
    }

    public static final java.util.List<com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption> toDomain(java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto) it.next()));
        }
        return arrayList;
    }

    public static final java.util.List<com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentOptionDto> toDto(java.util.List<com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto((com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption) it.next()));
        }
        return arrayList;
    }
}
