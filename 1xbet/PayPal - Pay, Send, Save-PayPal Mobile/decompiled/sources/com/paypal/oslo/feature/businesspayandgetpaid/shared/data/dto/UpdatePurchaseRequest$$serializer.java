package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/UpdatePurchaseRequest$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/UpdatePurchaseRequest;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/UpdatePurchaseRequest;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/dto/UpdatePurchaseRequest;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class UpdatePurchaseRequest$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.UpdatePurchaseRequest> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.UpdatePurchaseRequest$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.UpdatePurchaseRequest$$serializer updatePurchaseRequest$$serializer = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.UpdatePurchaseRequest$$serializer();
        INSTANCE = updatePurchaseRequest$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.UpdatePurchaseRequest", updatePurchaseRequest$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("paymentUuid", false);
        pluginGeneratedSerialDescriptor.addElement("originalPurchaseUuid", true);
        pluginGeneratedSerialDescriptor.addElement("amount", false);
        pluginGeneratedSerialDescriptor.addElement(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, false);
        pluginGeneratedSerialDescriptor.addElement(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_ENTRY_MODE, false);
        pluginGeneratedSerialDescriptor.addElement(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_APPLICATION_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("applicationIdentifier", true);
        pluginGeneratedSerialDescriptor.addElement("referenceId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UpdatePurchaseRequest$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto$$serializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.UpdatePurchaseRequest deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i;
        java.lang.String str6;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto amountDto;
        java.lang.String str7;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        java.lang.String str8 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto amountDto2 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto$$serializer.INSTANCE, null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str5 = decodeStringElement;
            str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str4 = str11;
            str = str10;
            str2 = decodeStringElement2;
            str7 = decodeStringElement3;
            amountDto = amountDto2;
            str6 = str9;
            i = 255;
        } else {
            int i4 = 0;
            boolean z2 = true;
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto amountDto3 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            java.lang.String str16 = null;
            java.lang.String str17 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 7;
                    case 0:
                        z = true;
                        str17 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                    case 1:
                        z = true;
                        i4 |= 2;
                        str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str16);
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        amountDto3 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.AmountDto$$serializer.INSTANCE, amountDto3);
                        i4 |= 4;
                    case 3:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                    case 4:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                    case 5:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i4 |= 32;
                    case 6:
                        str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str15);
                        i4 |= 64;
                    case 7:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i4 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str18 = str16;
            str = str12;
            str2 = str13;
            str3 = str14;
            str4 = str15;
            str5 = str17;
            i = i4;
            str6 = str18;
            amountDto = amountDto3;
            str7 = str8;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.UpdatePurchaseRequest(i, str5, str6, amountDto, str2, str7, str, str4, str3, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.UpdatePurchaseRequest value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.UpdatePurchaseRequest.write$Self$business_pay_and_get_paid_prodRelease(value, beginStructure, serialDescriptor);
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
