package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Label$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/Label;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/core/i18n/domain/model/Label;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/core/i18n/domain/model/Label;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Label$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.core.i18n.domain.model.Label> {
    public static final com.paypal.oslo.core.i18n.domain.model.Label$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.core.i18n.domain.model.Label$$serializer label$$serializer = new com.paypal.oslo.core.i18n.domain.model.Label$$serializer();
        INSTANCE = label$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.core.i18n.domain.model.Label", label$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("addressDetails.buildingName", true);
        pluginGeneratedSerialDescriptor.addElement("addressDetails.deliveryService", true);
        pluginGeneratedSerialDescriptor.addElement("addressDetails.streetName", true);
        pluginGeneratedSerialDescriptor.addElement("addressDetails.streetNumber", true);
        pluginGeneratedSerialDescriptor.addElement("addressDetails.streetType", true);
        pluginGeneratedSerialDescriptor.addElement("addressDetails.subBuilding", true);
        pluginGeneratedSerialDescriptor.addElement("addressLine1", true);
        pluginGeneratedSerialDescriptor.addElement("addressLine2", true);
        pluginGeneratedSerialDescriptor.addElement("addressLine3", true);
        pluginGeneratedSerialDescriptor.addElement("adminArea1", true);
        pluginGeneratedSerialDescriptor.addElement("adminArea2", true);
        pluginGeneratedSerialDescriptor.addElement("adminArea3", true);
        pluginGeneratedSerialDescriptor.addElement("adminArea4", true);
        pluginGeneratedSerialDescriptor.addElement(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, true);
        pluginGeneratedSerialDescriptor.addElement("optionalLabel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Label$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.core.i18n.domain.model.Label deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        java.lang.String str19 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str20 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str21 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str22 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str23 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str24 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str25 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str26 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str27 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str28 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str29 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str30 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str31 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str32 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str13 = str31;
            str3 = str30;
            str2 = str29;
            str14 = str28;
            str15 = str24;
            str4 = str32;
            str10 = str22;
            str = str26;
            str12 = str23;
            str7 = str21;
            i = 32767;
            str9 = str25;
            str11 = str20;
            str8 = str27;
        } else {
            int i4 = 14;
            int i5 = 0;
            boolean z = true;
            java.lang.String str33 = null;
            java.lang.String str34 = null;
            java.lang.String str35 = null;
            java.lang.String str36 = null;
            java.lang.String str37 = null;
            java.lang.String str38 = null;
            java.lang.String str39 = null;
            java.lang.String str40 = null;
            java.lang.String str41 = null;
            java.lang.String str42 = null;
            java.lang.String str43 = null;
            java.lang.String str44 = null;
            java.lang.String str45 = null;
            java.lang.String str46 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        str17 = str33;
                        str18 = str45;
                        z = false;
                        str33 = str17;
                        i4 = 14;
                        i2 = 11;
                        i3 = 10;
                        str45 = str18;
                    case 0:
                        str17 = str33;
                        str18 = str45;
                        str46 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str46);
                        i5 |= 1;
                        str33 = str17;
                        i4 = 14;
                        i2 = 11;
                        i3 = 10;
                        str45 = str18;
                    case 1:
                        i5 |= 2;
                        str33 = str33;
                        str41 = str41;
                        i2 = 11;
                        i3 = 10;
                        str45 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str45);
                        i4 = 14;
                    case 2:
                        str16 = str33;
                        str41 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str41);
                        i5 |= 4;
                        str42 = str42;
                        str33 = str16;
                        i4 = 14;
                        i2 = 11;
                        i3 = 10;
                    case 3:
                        str16 = str33;
                        str34 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str34);
                        i5 |= 8;
                        str33 = str16;
                        i4 = 14;
                        i2 = 11;
                        i3 = 10;
                    case 4:
                        str16 = str33;
                        str44 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str44);
                        i5 |= 16;
                        str33 = str16;
                        i4 = 14;
                        i2 = 11;
                        i3 = 10;
                    case 5:
                        str33 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str33);
                        i5 |= 32;
                        i4 = 14;
                        i2 = 11;
                        i3 = 10;
                    case 6:
                        str43 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str43);
                        i5 |= 64;
                        i4 = 14;
                        i2 = 11;
                        i3 = 10;
                    case 7:
                        str42 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str42);
                        i5 |= 128;
                        i4 = 14;
                        i2 = 11;
                    case 8:
                        str40 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, str40);
                        i5 |= 256;
                        i4 = 14;
                    case 9:
                        str35 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, str35);
                        i5 |= 512;
                        i4 = 14;
                    case 10:
                        str36 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str36);
                        i5 |= 1024;
                        i4 = 14;
                    case 11:
                        str19 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str19);
                        i5 |= 2048;
                        i4 = 14;
                    case 12:
                        str37 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, str37);
                        i5 |= 4096;
                        i4 = 14;
                    case 13:
                        str39 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, str39);
                        i5 |= 8192;
                        i4 = 14;
                    case 14:
                        str38 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str38);
                        i5 |= 16384;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str47 = str45;
            java.lang.String str48 = str41;
            str = str43;
            str2 = str35;
            str3 = str36;
            str4 = str37;
            str5 = str38;
            i = i5;
            str6 = str39;
            str7 = str47;
            str8 = str42;
            str9 = str33;
            str10 = str48;
            str11 = str46;
            str12 = str34;
            str13 = str19;
            str14 = str40;
            str15 = str44;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.core.i18n.domain.model.Label(i, str11, str7, str10, str12, str15, str9, str, str8, str14, str2, str3, str13, str4, str6, str5, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.core.i18n.domain.model.Label value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.core.i18n.domain.model.Label.write$Self$i18n_release(value, beginStructure, serialDescriptor);
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
