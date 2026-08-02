package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Address$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/core/i18n/domain/model/Address;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Address$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.core.i18n.domain.model.Address> {
    public static final com.paypal.oslo.core.i18n.domain.model.Address$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.core.i18n.domain.model.Address$$serializer address$$serializer = new com.paypal.oslo.core.i18n.domain.model.Address$$serializer();
        INSTANCE = address$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.core.i18n.domain.model.Address", address$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("addressLine1", true);
        pluginGeneratedSerialDescriptor.addElement("addressLine2", true);
        pluginGeneratedSerialDescriptor.addElement("addressLine3", true);
        pluginGeneratedSerialDescriptor.addElement("adminArea4", true);
        pluginGeneratedSerialDescriptor.addElement("adminArea3", true);
        pluginGeneratedSerialDescriptor.addElement("adminArea2", true);
        pluginGeneratedSerialDescriptor.addElement("adminArea1", true);
        pluginGeneratedSerialDescriptor.addElement(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, true);
        pluginGeneratedSerialDescriptor.addElement("countryCode", true);
        pluginGeneratedSerialDescriptor.addElement("detail", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Address$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.AddressLine1$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.AddressLine2$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.AddressLine3$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.AdminArea4$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.AdminArea3$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.AdminArea2$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.AdminArea1$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.PostalCode$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.CountryCode$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.core.i18n.domain.model.Address$Detail$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.core.i18n.domain.model.Address deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        com.paypal.oslo.core.i18n.domain.model.Address.Detail detail;
        java.lang.String str2;
        java.lang.String str3;
        int i;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        int i2;
        com.paypal.oslo.core.i18n.domain.model.AddressLine2 addressLine2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 7;
        int i4 = 9;
        int i5 = 0;
        com.paypal.oslo.core.i18n.domain.model.Address.Detail detail2 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.core.i18n.domain.model.AddressLine1 addressLine1 = (com.paypal.oslo.core.i18n.domain.model.AddressLine1) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, com.paypal.oslo.core.i18n.domain.model.AddressLine1$$serializer.INSTANCE, null);
            java.lang.String m11278unboximpl = addressLine1 != null ? addressLine1.m11278unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.AddressLine2 addressLine22 = (com.paypal.oslo.core.i18n.domain.model.AddressLine2) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.core.i18n.domain.model.AddressLine2$$serializer.INSTANCE, null);
            java.lang.String m11287unboximpl = addressLine22 != null ? addressLine22.m11287unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.AddressLine3 addressLine3 = (com.paypal.oslo.core.i18n.domain.model.AddressLine3) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.core.i18n.domain.model.AddressLine3$$serializer.INSTANCE, null);
            java.lang.String m11296unboximpl = addressLine3 != null ? addressLine3.m11296unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.AdminArea4 adminArea4 = (com.paypal.oslo.core.i18n.domain.model.AdminArea4) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.core.i18n.domain.model.AdminArea4$$serializer.INSTANCE, null);
            java.lang.String m11332unboximpl = adminArea4 != null ? adminArea4.m11332unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.AdminArea3 adminArea3 = (com.paypal.oslo.core.i18n.domain.model.AdminArea3) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.core.i18n.domain.model.AdminArea3$$serializer.INSTANCE, null);
            java.lang.String m11323unboximpl = adminArea3 != null ? adminArea3.m11323unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.AdminArea2 adminArea2 = (com.paypal.oslo.core.i18n.domain.model.AdminArea2) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.core.i18n.domain.model.AdminArea2$$serializer.INSTANCE, null);
            java.lang.String m11314unboximpl = adminArea2 != null ? adminArea2.m11314unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.AdminArea1 adminArea1 = (com.paypal.oslo.core.i18n.domain.model.AdminArea1) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, com.paypal.oslo.core.i18n.domain.model.AdminArea1$$serializer.INSTANCE, null);
            java.lang.String m11305unboximpl = adminArea1 != null ? adminArea1.m11305unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.PostalCode postalCode = (com.paypal.oslo.core.i18n.domain.model.PostalCode) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, com.paypal.oslo.core.i18n.domain.model.PostalCode$$serializer.INSTANCE, null);
            java.lang.String m11465unboximpl = postalCode != null ? postalCode.m11465unboximpl() : null;
            com.paypal.oslo.core.i18n.domain.model.CountryCode countryCode = (com.paypal.oslo.core.i18n.domain.model.CountryCode) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.core.i18n.domain.model.CountryCode$$serializer.INSTANCE, null);
            java.lang.String m11369unboximpl = countryCode != null ? countryCode.m11369unboximpl() : null;
            str9 = m11278unboximpl;
            str2 = m11465unboximpl;
            str8 = m11305unboximpl;
            str6 = m11314unboximpl;
            str4 = m11332unboximpl;
            detail = (com.paypal.oslo.core.i18n.domain.model.Address.Detail) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.core.i18n.domain.model.Address$Detail$$serializer.INSTANCE, null);
            str3 = m11369unboximpl;
            str = m11323unboximpl;
            str5 = m11296unboximpl;
            str7 = m11287unboximpl;
            i = 1023;
        } else {
            boolean z = true;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            str = null;
            java.lang.String str16 = null;
            java.lang.String str17 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                    case 0:
                        i2 = 1;
                        com.paypal.oslo.core.i18n.domain.model.AddressLine1 addressLine12 = (com.paypal.oslo.core.i18n.domain.model.AddressLine1) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, com.paypal.oslo.core.i18n.domain.model.AddressLine1$$serializer.INSTANCE, str10 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11272boximpl(str10) : null);
                        str10 = addressLine12 != null ? addressLine12.m11278unboximpl() : null;
                        i5 |= 1;
                        i3 = 7;
                        i4 = 9;
                    case 1:
                        com.paypal.oslo.core.i18n.domain.model.AddressLine2$$serializer addressLine2$$serializer = com.paypal.oslo.core.i18n.domain.model.AddressLine2$$serializer.INSTANCE;
                        if (str17 != null) {
                            addressLine2 = com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11281boximpl(str17);
                            i2 = 1;
                        } else {
                            i2 = 1;
                            addressLine2 = null;
                        }
                        com.paypal.oslo.core.i18n.domain.model.AddressLine2 addressLine23 = (com.paypal.oslo.core.i18n.domain.model.AddressLine2) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, addressLine2$$serializer, addressLine2);
                        str17 = addressLine23 != null ? addressLine23.m11287unboximpl() : null;
                        i5 |= 2;
                        i3 = 7;
                        i4 = 9;
                    case 2:
                        com.paypal.oslo.core.i18n.domain.model.AddressLine3 addressLine32 = (com.paypal.oslo.core.i18n.domain.model.AddressLine3) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.core.i18n.domain.model.AddressLine3$$serializer.INSTANCE, str16 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11290boximpl(str16) : null);
                        str16 = addressLine32 != null ? addressLine32.m11296unboximpl() : null;
                        i5 |= 4;
                        i4 = 9;
                    case 3:
                        com.paypal.oslo.core.i18n.domain.model.AdminArea4 adminArea42 = (com.paypal.oslo.core.i18n.domain.model.AdminArea4) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.core.i18n.domain.model.AdminArea4$$serializer.INSTANCE, str14 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11326boximpl(str14) : null);
                        str14 = adminArea42 != null ? adminArea42.m11332unboximpl() : null;
                        i5 |= 8;
                        i4 = 9;
                    case 4:
                        com.paypal.oslo.core.i18n.domain.model.AdminArea3 adminArea32 = (com.paypal.oslo.core.i18n.domain.model.AdminArea3) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.core.i18n.domain.model.AdminArea3$$serializer.INSTANCE, str != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11317boximpl(str) : null);
                        str = adminArea32 != null ? adminArea32.m11323unboximpl() : null;
                        i5 |= 16;
                        i4 = 9;
                    case 5:
                        com.paypal.oslo.core.i18n.domain.model.AdminArea2 adminArea22 = (com.paypal.oslo.core.i18n.domain.model.AdminArea2) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.core.i18n.domain.model.AdminArea2$$serializer.INSTANCE, str13 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11308boximpl(str13) : null);
                        str13 = adminArea22 != null ? adminArea22.m11314unboximpl() : null;
                        i5 |= 32;
                        i4 = 9;
                    case 6:
                        com.paypal.oslo.core.i18n.domain.model.AdminArea1 adminArea12 = (com.paypal.oslo.core.i18n.domain.model.AdminArea1) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, com.paypal.oslo.core.i18n.domain.model.AdminArea1$$serializer.INSTANCE, str12 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11299boximpl(str12) : null);
                        str12 = adminArea12 != null ? adminArea12.m11305unboximpl() : null;
                        i5 |= 64;
                        i4 = 9;
                    case 7:
                        com.paypal.oslo.core.i18n.domain.model.PostalCode postalCode2 = (com.paypal.oslo.core.i18n.domain.model.PostalCode) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, com.paypal.oslo.core.i18n.domain.model.PostalCode$$serializer.INSTANCE, str11 != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11459boximpl(str11) : null);
                        str11 = postalCode2 != null ? postalCode2.m11465unboximpl() : null;
                        i5 |= 128;
                        i4 = 9;
                    case 8:
                        com.paypal.oslo.core.i18n.domain.model.CountryCode countryCode2 = (com.paypal.oslo.core.i18n.domain.model.CountryCode) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.core.i18n.domain.model.CountryCode$$serializer.INSTANCE, str15 != null ? com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(str15) : null);
                        str15 = countryCode2 != null ? countryCode2.m11369unboximpl() : null;
                        i5 |= 256;
                        i4 = 9;
                    case 9:
                        detail2 = (com.paypal.oslo.core.i18n.domain.model.Address.Detail) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, com.paypal.oslo.core.i18n.domain.model.Address$Detail$$serializer.INSTANCE, detail2);
                        i5 |= 512;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            detail = detail2;
            str2 = str11;
            str3 = str15;
            i = i5;
            str4 = str14;
            str5 = str16;
            str6 = str13;
            str7 = str17;
            str8 = str12;
            str9 = str10;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.core.i18n.domain.model.Address(i, str9, str7, str5, str4, str, str6, str8, str2, str3, detail, null, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.core.i18n.domain.model.Address value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.core.i18n.domain.model.Address.write$Self$i18n_release(value, beginStructure, serialDescriptor);
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
