package com.paypal.oslo.feature.businesscustomers.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerAddress;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CustomerAddress$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress> {
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress$$serializer customerAddress$$serializer = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress$$serializer();
        INSTANCE = customerAddress$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress", customerAddress$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("addressLine1", false);
        pluginGeneratedSerialDescriptor.addElement("addressLine2", false);
        pluginGeneratedSerialDescriptor.addElement("adminArea1", false);
        pluginGeneratedSerialDescriptor.addElement("adminArea2", false);
        pluginGeneratedSerialDescriptor.addElement(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, false);
        pluginGeneratedSerialDescriptor.addElement("countryCode", false);
        pluginGeneratedSerialDescriptor.addElement("addressType", false);
        pluginGeneratedSerialDescriptor.addElement("recipientName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CustomerAddress$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[6].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i;
        java.lang.String str5;
        java.lang.String str6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress.$childSerializers;
        int i2 = 7;
        int i3 = 5;
        int i4 = 3;
        java.lang.String str7 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 5);
            addressType = (com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            str6 = str8;
            customerName = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName$$serializer.INSTANCE, null);
            str = decodeStringElement;
            str3 = str11;
            str2 = str12;
            str4 = str10;
            str5 = str9;
            i = 255;
        } else {
            int i5 = 0;
            boolean z = true;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName2 = null;
            com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType addressType2 = null;
            java.lang.String str15 = null;
            java.lang.String str16 = null;
            java.lang.String str17 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 5;
                        i4 = 3;
                    case 0:
                        str17 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str17);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 5;
                        i4 = 3;
                    case 1:
                        str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str16);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 5;
                    case 2:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i5 |= 4;
                        i2 = 7;
                    case 3:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i5 |= 8;
                    case 4:
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i5 |= 16;
                    case 5:
                        str15 = beginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 |= 32;
                    case 6:
                        addressType2 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.AddressType) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), addressType2);
                        i5 |= 64;
                    case 7:
                        customerName2 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName$$serializer.INSTANCE, customerName2);
                        i5 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str18 = str16;
            java.lang.String str19 = str17;
            customerName = customerName2;
            addressType = addressType2;
            str = str15;
            str2 = str13;
            str3 = str14;
            str4 = str7;
            i = i5;
            str5 = str18;
            str6 = str19;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress(i, str6, str5, str4, str3, str2, str, addressType, customerName, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerAddress.write$Self$business_customers_api_prodRelease(value, beginStructure, serialDescriptor);
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
