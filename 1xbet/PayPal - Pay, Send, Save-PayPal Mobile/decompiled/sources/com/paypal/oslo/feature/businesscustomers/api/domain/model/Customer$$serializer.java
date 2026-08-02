package com.paypal.oslo.feature.businesscustomers.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Customer$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> {
    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer$$serializer customer$$serializer = new com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer$$serializer();
        INSTANCE = customer$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer", customer$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement("externalId", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("photoUrl", false);
        pluginGeneratedSerialDescriptor.addElement("addresses", false);
        pluginGeneratedSerialDescriptor.addElement("emails", false);
        pluginGeneratedSerialDescriptor.addElement("phoneNumbers", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("isFavorite", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Customer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[6].getValue(), lazyArr[7].getValue(), lazyArr[8].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        boolean z;
        java.util.List list;
        java.util.List list2;
        java.lang.String str;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName;
        java.util.List list3;
        int i;
        java.lang.String str6;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName2;
        java.lang.String str7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType2 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName3 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName$$serializer.INSTANCE, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.List list4 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            java.util.List list5 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            java.util.List list6 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            list2 = list6;
            z = beginStructure.decodeBooleanElement(serialDescriptor, 10);
            str2 = str11;
            str5 = str10;
            list = list5;
            list3 = list4;
            customerType = customerType2;
            customerName = customerName3;
            str = str8;
            i = 2047;
            str4 = decodeStringElement;
            str3 = str9;
        } else {
            boolean z2 = false;
            boolean z3 = true;
            java.util.List list7 = null;
            java.util.List list8 = null;
            java.util.List list9 = null;
            java.lang.String str12 = null;
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType3 = null;
            java.lang.String str13 = null;
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName customerName4 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            java.lang.String str16 = null;
            int i7 = 0;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        str6 = str13;
                        customerName2 = customerName4;
                        str7 = str14;
                        z3 = false;
                        str13 = str6;
                        customerName4 = customerName2;
                        str14 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 0:
                        str6 = str13;
                        customerName2 = customerName4;
                        str7 = str14;
                        str15 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        str13 = str6;
                        customerName4 = customerName2;
                        str14 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 1:
                        str6 = str13;
                        customerName2 = customerName4;
                        str7 = str14;
                        customerType3 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), customerType3);
                        i7 |= 2;
                        str13 = str6;
                        customerName4 = customerName2;
                        str14 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 2:
                        str6 = str13;
                        customerName2 = customerName4;
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i7 |= 4;
                        str7 = str14;
                        str13 = str6;
                        customerName4 = customerName2;
                        str14 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 3:
                        str6 = str13;
                        customerName2 = customerName4;
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i7 |= 8;
                        str7 = str14;
                        str13 = str6;
                        customerName4 = customerName2;
                        str14 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 4:
                        str6 = str13;
                        customerName4 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName$$serializer.INSTANCE, customerName4);
                        i7 |= 16;
                        customerName2 = customerName4;
                        str7 = str14;
                        str13 = str6;
                        customerName4 = customerName2;
                        str14 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 5:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i7 |= 32;
                        customerName2 = customerName4;
                        str7 = str14;
                        str13 = str6;
                        customerName4 = customerName2;
                        str14 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 6:
                        list8 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, i5, (kotlinx.serialization.DeserializationStrategy) lazyArr[i5].getValue(), list8);
                        i7 |= 64;
                        str6 = str13;
                        customerName2 = customerName4;
                        str7 = str14;
                        str13 = str6;
                        customerName4 = customerName2;
                        str14 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 7:
                        java.util.List list10 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, i4, (kotlinx.serialization.DeserializationStrategy) lazyArr[i4].getValue(), list7);
                        i7 |= 128;
                        str6 = str13;
                        customerName2 = customerName4;
                        str7 = str14;
                        list7 = list10;
                        str13 = str6;
                        customerName4 = customerName2;
                        str14 = str7;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 8:
                        list9 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, i6, (kotlinx.serialization.DeserializationStrategy) lazyArr[i6].getValue(), list9);
                        i7 |= 256;
                    case 9:
                        str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str16);
                        i7 |= 512;
                    case 10:
                        z2 = beginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i7 |= 1024;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType customerType4 = customerType3;
            z = z2;
            list = list7;
            list2 = list9;
            str = str14;
            customerType = customerType4;
            str2 = str16;
            str3 = str12;
            str4 = str15;
            str5 = str13;
            customerName = customerName4;
            int i8 = i7;
            list3 = list8;
            i = i8;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer(i, str4, customerType, str, str3, customerName, str5, list3, list, list2, str2, z, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.write$Self$business_customers_api_prodRelease(value, beginStructure, serialDescriptor);
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
