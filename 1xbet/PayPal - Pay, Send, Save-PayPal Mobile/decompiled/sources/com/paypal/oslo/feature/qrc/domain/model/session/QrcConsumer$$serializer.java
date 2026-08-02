package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcConsumer;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class QrcConsumer$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer$$serializer qrcConsumer$$serializer = new com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer$$serializer();
        INSTANCE = qrcConsumer$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer", qrcConsumer$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("accountId", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("address", true);
        pluginGeneratedSerialDescriptor.addElement("email", true);
        pluginGeneratedSerialDescriptor.addElement("tenantName", true);
        pluginGeneratedSerialDescriptor.addElement("externalId", true);
        pluginGeneratedSerialDescriptor.addElement("countryCode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private QrcConsumer$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.Address$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.qrc.domain.model.session.Address address;
        java.lang.String str5;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        java.lang.String str6 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.Address address2 = (com.paypal.oslo.feature.qrc.domain.model.session.Address) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.qrc.domain.model.session.Address$$serializer.INSTANCE, null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str = str7;
            str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str3 = str10;
            str5 = str8;
            str4 = str9;
            address = address2;
            qrcPersonName = qrcPersonName2;
            i = 127;
        } else {
            int i3 = 0;
            boolean z = true;
            com.paypal.oslo.feature.qrc.domain.model.session.Address address3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName qrcPersonName3 = null;
            str = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        qrcPersonName3 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.qrc.domain.model.session.QrcPersonName$$serializer.INSTANCE, qrcPersonName3);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        address3 = (com.paypal.oslo.feature.qrc.domain.model.session.Address) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.qrc.domain.model.session.Address$$serializer.INSTANCE, address3);
                        i3 |= 4;
                    case 3:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        i3 |= 8;
                    case 4:
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i3 |= 16;
                    case 5:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i3 |= 32;
                    case 6:
                        str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str11);
                        i3 |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str2 = str11;
            str3 = str12;
            str4 = str13;
            address = address3;
            str5 = str6;
            qrcPersonName = qrcPersonName3;
            i = i3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer(i, str, qrcPersonName, address, str5, str4, str3, str2, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.qrc.domain.model.session.QrcConsumer.write$Self$qrc_prodRelease(value, beginStructure, serialDescriptor);
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
