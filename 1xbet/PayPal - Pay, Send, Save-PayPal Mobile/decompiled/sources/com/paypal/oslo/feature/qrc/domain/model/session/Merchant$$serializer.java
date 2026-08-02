package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/qrc/domain/model/session/Merchant;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Merchant$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.qrc.domain.model.session.Merchant> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.Merchant$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.Merchant$$serializer merchant$$serializer = new com.paypal.oslo.feature.qrc.domain.model.session.Merchant$$serializer();
        INSTANCE = merchant$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.qrc.domain.model.session.Merchant", merchant$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("accountId", true);
        pluginGeneratedSerialDescriptor.addElement("displayName", true);
        pluginGeneratedSerialDescriptor.addElement("externalId", true);
        pluginGeneratedSerialDescriptor.addElement("logoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("address", true);
        pluginGeneratedSerialDescriptor.addElement("partnerAccountId", true);
        pluginGeneratedSerialDescriptor.addElement("merchantCategoryCode", true);
        pluginGeneratedSerialDescriptor.addElement("merchantCategoryType", true);
        pluginGeneratedSerialDescriptor.addElement("displayInitials", true);
        pluginGeneratedSerialDescriptor.addElement("showAlternateLogo", true);
        pluginGeneratedSerialDescriptor.addElement("franchisorAccountId", true);
        pluginGeneratedSerialDescriptor.addElement("tenantName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Merchant$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.Address$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.qrc.domain.model.session.Merchant deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        com.paypal.oslo.feature.qrc.domain.model.session.Address address;
        java.lang.String str8;
        boolean z;
        int i;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        java.lang.String str12 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str17 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.Address address2 = (com.paypal.oslo.feature.qrc.domain.model.session.Address) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.qrc.domain.model.session.Address$$serializer.INSTANCE, null);
            java.lang.String str18 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str19 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str20 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str21 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 10);
            java.lang.String str22 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str2 = str22;
            z = decodeBooleanElement;
            str6 = str21;
            str10 = str19;
            str8 = str18;
            address = address2;
            str3 = str16;
            str5 = str20;
            str7 = str17;
            str11 = str14;
            str4 = str15;
            i = 8191;
            str = str13;
        } else {
            int i5 = 12;
            boolean z2 = true;
            java.lang.String str23 = null;
            java.lang.String str24 = null;
            java.lang.String str25 = null;
            java.lang.String str26 = null;
            java.lang.String str27 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.Address address3 = null;
            java.lang.String str28 = null;
            java.lang.String str29 = null;
            java.lang.String str30 = null;
            java.lang.String str31 = null;
            int i6 = 0;
            boolean z3 = false;
            java.lang.String str32 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        str23 = str23;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str30 = str30;
                        i5 = 12;
                    case 0:
                        i6 |= 1;
                        str23 = str23;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                        str30 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str30);
                    case 1:
                        str29 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str29);
                        i6 |= 2;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 12;
                    case 2:
                        str31 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str31);
                        i6 |= 4;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                    case 3:
                        str28 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str28);
                        i6 |= 8;
                        i2 = 11;
                        i3 = 10;
                    case 4:
                        str26 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str26);
                        i6 |= 16;
                        i2 = 11;
                    case 5:
                        address3 = (com.paypal.oslo.feature.qrc.domain.model.session.Address) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.qrc.domain.model.session.Address$$serializer.INSTANCE, address3);
                        i6 |= 32;
                        i2 = 11;
                    case 6:
                        str23 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str23);
                        i6 |= 64;
                        i2 = 11;
                    case 7:
                        str32 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str32);
                        i6 |= 128;
                        i2 = 11;
                    case 8:
                        str24 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, str24);
                        i6 |= 256;
                        i2 = 11;
                    case 9:
                        str25 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str25);
                        i6 |= 512;
                    case 10:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i6 |= 1024;
                    case 11:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i6 |= 2048;
                    case 12:
                        str27 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str27);
                        i6 |= 4096;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str33 = str29;
            str = str30;
            java.lang.String str34 = str31;
            str2 = str12;
            str3 = str28;
            str4 = str34;
            str5 = str24;
            str6 = str25;
            str7 = str26;
            address = address3;
            str8 = str23;
            z = z3;
            i = i6;
            str9 = str27;
            str10 = str32;
            str11 = str33;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.qrc.domain.model.session.Merchant(i, str, str11, str4, str3, str7, address, str8, str10, str5, str6, z, str2, str9, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.qrc.domain.model.session.Merchant value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.qrc.domain.model.session.Merchant.write$Self$qrc_prodRelease(value, beginStructure, serialDescriptor);
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
