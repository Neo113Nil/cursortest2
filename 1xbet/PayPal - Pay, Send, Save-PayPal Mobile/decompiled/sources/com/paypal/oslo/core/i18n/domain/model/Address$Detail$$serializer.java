package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Address$Detail$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/Address$Detail;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/core/i18n/domain/model/Address$Detail;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/core/i18n/domain/model/Address$Detail;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Address$Detail$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.core.i18n.domain.model.Address.Detail> {
    public static final com.paypal.oslo.core.i18n.domain.model.Address$Detail$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.core.i18n.domain.model.Address$Detail$$serializer address$Detail$$serializer = new com.paypal.oslo.core.i18n.domain.model.Address$Detail$$serializer();
        INSTANCE = address$Detail$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.core.i18n.domain.model.Address.Detail", address$Detail$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("streetType", true);
        pluginGeneratedSerialDescriptor.addElement("streetName", true);
        pluginGeneratedSerialDescriptor.addElement("streetNumber", true);
        pluginGeneratedSerialDescriptor.addElement("buildingName", true);
        pluginGeneratedSerialDescriptor.addElement("subBuilding", true);
        pluginGeneratedSerialDescriptor.addElement("deliveryService", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Address$Detail$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.StreetType$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.StreetName$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.StreetNumber$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.BuildingName$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.SubBuilding$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.DeliveryService$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.core.i18n.domain.model.Address.Detail deserialize(kotlinx.serialization.encoding.Decoder decoder) {
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
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.core.i18n.domain.model.StreetType streetType = (com.paypal.oslo.core.i18n.domain.model.StreetType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, com.paypal.oslo.core.i18n.domain.model.StreetType$$serializer.INSTANCE, null);
            java.lang.String m11510unboximpl = streetType != null ? streetType.m11510unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.StreetName streetName = (com.paypal.oslo.core.i18n.domain.model.StreetName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.core.i18n.domain.model.StreetName$$serializer.INSTANCE, null);
            java.lang.String m11492unboximpl = streetName != null ? streetName.m11492unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.StreetNumber streetNumber = (com.paypal.oslo.core.i18n.domain.model.StreetNumber) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.core.i18n.domain.model.StreetNumber$$serializer.INSTANCE, null);
            java.lang.String m11501unboximpl = streetNumber != null ? streetNumber.m11501unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.BuildingName buildingName = (com.paypal.oslo.core.i18n.domain.model.BuildingName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.core.i18n.domain.model.BuildingName$$serializer.INSTANCE, null);
            java.lang.String m11342unboximpl = buildingName != null ? buildingName.m11342unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.SubBuilding subBuilding = (com.paypal.oslo.core.i18n.domain.model.SubBuilding) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.core.i18n.domain.model.SubBuilding$$serializer.INSTANCE, null);
            java.lang.String m11519unboximpl = subBuilding != null ? subBuilding.m11519unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.DeliveryService deliveryService = (com.paypal.oslo.core.i18n.domain.model.DeliveryService) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.core.i18n.domain.model.DeliveryService$$serializer.INSTANCE, null);
            str3 = m11510unboximpl;
            i = 63;
            str4 = m11342unboximpl;
            str = m11519unboximpl;
            str5 = m11501unboximpl;
            str6 = m11492unboximpl;
            str2 = deliveryService != null ? deliveryService.m11404unboximpl() : null;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        com.paypal.oslo.core.i18n.domain.model.StreetType streetType2 = (com.paypal.oslo.core.i18n.domain.model.StreetType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, com.paypal.oslo.core.i18n.domain.model.StreetType$$serializer.INSTANCE, str7 != null ? com.paypal.oslo.core.i18n.domain.model.StreetType.m11504boximpl(str7) : null);
                        str7 = streetType2 != null ? streetType2.m11510unboximpl() : null;
                        i2 |= 1;
                        break;
                    case 1:
                        com.paypal.oslo.core.i18n.domain.model.StreetName streetName2 = (com.paypal.oslo.core.i18n.domain.model.StreetName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.core.i18n.domain.model.StreetName$$serializer.INSTANCE, str11 != null ? com.paypal.oslo.core.i18n.domain.model.StreetName.m11486boximpl(str11) : null);
                        str11 = streetName2 != null ? streetName2.m11492unboximpl() : null;
                        i2 |= 2;
                        break;
                    case 2:
                        com.paypal.oslo.core.i18n.domain.model.StreetNumber streetNumber2 = (com.paypal.oslo.core.i18n.domain.model.StreetNumber) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.core.i18n.domain.model.StreetNumber$$serializer.INSTANCE, str10 != null ? com.paypal.oslo.core.i18n.domain.model.StreetNumber.m11495boximpl(str10) : null);
                        str10 = streetNumber2 != null ? streetNumber2.m11501unboximpl() : null;
                        i2 |= 4;
                        break;
                    case 3:
                        com.paypal.oslo.core.i18n.domain.model.BuildingName buildingName2 = (com.paypal.oslo.core.i18n.domain.model.BuildingName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.core.i18n.domain.model.BuildingName$$serializer.INSTANCE, str8 != null ? com.paypal.oslo.core.i18n.domain.model.BuildingName.m11336boximpl(str8) : null);
                        str8 = buildingName2 != null ? buildingName2.m11342unboximpl() : null;
                        i2 |= 8;
                        break;
                    case 4:
                        com.paypal.oslo.core.i18n.domain.model.SubBuilding subBuilding2 = (com.paypal.oslo.core.i18n.domain.model.SubBuilding) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.core.i18n.domain.model.SubBuilding$$serializer.INSTANCE, str9 != null ? com.paypal.oslo.core.i18n.domain.model.SubBuilding.m11513boximpl(str9) : null);
                        str9 = subBuilding2 != null ? subBuilding2.m11519unboximpl() : null;
                        i2 |= 16;
                        break;
                    case 5:
                        com.paypal.oslo.core.i18n.domain.model.DeliveryService deliveryService2 = (com.paypal.oslo.core.i18n.domain.model.DeliveryService) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.core.i18n.domain.model.DeliveryService$$serializer.INSTANCE, str12 != null ? com.paypal.oslo.core.i18n.domain.model.DeliveryService.m11398boximpl(str12) : null);
                        str12 = deliveryService2 != null ? deliveryService2.m11404unboximpl() : null;
                        i2 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str9;
            str2 = str12;
            str3 = str7;
            str4 = str8;
            i = i2;
            java.lang.String str13 = str11;
            str5 = str10;
            str6 = str13;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.core.i18n.domain.model.Address.Detail(i, str3, str6, str5, str4, str, str2, null, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.core.i18n.domain.model.Address.Detail value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.core.i18n.domain.model.Address.Detail.write$Self$i18n_release(value, beginStructure, serialDescriptor);
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
