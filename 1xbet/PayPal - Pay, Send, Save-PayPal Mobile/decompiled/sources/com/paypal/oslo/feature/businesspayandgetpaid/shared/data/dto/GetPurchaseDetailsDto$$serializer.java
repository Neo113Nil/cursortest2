package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/GetPurchaseDetailsDto$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/GetPurchaseDetailsDto;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/GetPurchaseDetailsDto;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/GetPurchaseDetailsDto;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class GetPurchaseDetailsDto$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto$$serializer getPurchaseDetailsDto$$serializer = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto$$serializer();
        INSTANCE = getPurchaseDetailsDto$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto", getPurchaseDetailsDto$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement("totalAmount", true);
        pluginGeneratedSerialDescriptor.addElement("itemTotal", true);
        pluginGeneratedSerialDescriptor.addElement("taxTotal", true);
        pluginGeneratedSerialDescriptor.addElement("itemDiscount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetPurchaseDetailsDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto purchaseAmountDto;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto purchaseAmountDto2;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto purchaseAmountDto3;
        java.util.List list;
        java.lang.String str;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto purchaseAmountDto4;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto.$childSerializers;
        int i2 = 5;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto purchaseAmountDto5 = null;
        if (beginStructure.decodeSequentially()) {
            java.util.List list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto purchaseAmountDto6 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto purchaseAmountDto7 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto purchaseAmountDto8 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE, null);
            list = list2;
            str = decodeStringElement;
            purchaseAmountDto2 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE, null);
            purchaseAmountDto4 = purchaseAmountDto7;
            purchaseAmountDto = purchaseAmountDto8;
            purchaseAmountDto3 = purchaseAmountDto6;
            i = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto purchaseAmountDto9 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto purchaseAmountDto10 = null;
            java.util.List list3 = null;
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto purchaseAmountDto11 = null;
            java.lang.String str2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), list3);
                        i3 |= 1;
                        i2 = 5;
                        continue;
                    case 1:
                        str2 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        purchaseAmountDto10 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE, purchaseAmountDto10);
                        i3 |= 4;
                        break;
                    case 3:
                        purchaseAmountDto9 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE, purchaseAmountDto9);
                        i3 |= 8;
                        break;
                    case 4:
                        purchaseAmountDto5 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE, purchaseAmountDto5);
                        i3 |= 16;
                        break;
                    case 5:
                        purchaseAmountDto11 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto$$serializer.INSTANCE, purchaseAmountDto11);
                        i3 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            purchaseAmountDto = purchaseAmountDto5;
            purchaseAmountDto2 = purchaseAmountDto11;
            purchaseAmountDto3 = purchaseAmountDto10;
            list = list3;
            str = str2;
            purchaseAmountDto4 = purchaseAmountDto9;
            i = i3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto(i, list, str, purchaseAmountDto3, purchaseAmountDto4, purchaseAmountDto, purchaseAmountDto2, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto.write$Self$business_pay_and_get_paid_prodRelease(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }
}
