package com.miteksystems.misnap.core.serverconnection;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc> {
    public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoFpsRangesFor;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        int i;
        java.lang.Object obj8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i2 = 7;
        int i3 = 6;
        java.lang.Object obj9 = null;
        if (beginStructure.decodeSequentially()) {
            obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 3, new kotlinx.serialization.internal.LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 4, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput$$serializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            i = 255;
        } else {
            int i4 = 0;
            boolean z = true;
            java.lang.Object obj10 = null;
            java.lang.Object obj11 = null;
            java.lang.Object obj12 = null;
            java.lang.Object obj13 = null;
            java.lang.Object obj14 = null;
            java.lang.Object obj15 = null;
            java.lang.Object obj16 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 6;
                    case 0:
                        obj16 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj16);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                    case 1:
                        obj14 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj14);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        obj9 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj9);
                        i4 |= 4;
                        i2 = 7;
                        i3 = 6;
                    case 3:
                        kotlinx.serialization.internal.StringSerializer stringSerializer2 = kotlinx.serialization.internal.StringSerializer.INSTANCE;
                        obj13 = beginStructure.decodeNullableSerializableElement(descriptor, 3, new kotlinx.serialization.internal.LinkedHashMapSerializer(stringSerializer2, stringSerializer2), obj13);
                        i4 |= 8;
                        i2 = 7;
                    case 4:
                        obj15 = beginStructure.decodeNullableSerializableElement(descriptor, 4, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput$$serializer.INSTANCE, obj15);
                        i4 |= 16;
                    case 5:
                        obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj11);
                        i4 |= 32;
                    case 6:
                        obj12 = beginStructure.decodeNullableSerializableElement(descriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj12);
                        i4 |= 64;
                    case 7:
                        obj10 = beginStructure.decodeNullableSerializableElement(descriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj10);
                        i4 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj = obj10;
            obj2 = obj11;
            obj3 = obj12;
            obj4 = obj9;
            obj5 = obj13;
            obj6 = obj14;
            obj7 = obj15;
            i = i4;
            obj8 = obj16;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc(i, (java.lang.String) obj8, (java.lang.String) obj6, (java.lang.String) obj4, (java.util.Map) obj5, (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput) obj7, (java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) obj, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.a(value, beginStructure, descriptor);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlinx.serialization.KSerializer<?> nullable = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        kotlinx.serialization.KSerializer<?> nullable2 = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        kotlinx.serialization.KSerializer<?> nullable3 = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{nullable, nullable2, nullable3, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.LinkedHashMapSerializer(stringSerializer, stringSerializer)), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    private MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer mobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer();
        INSTANCE = mobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc", mobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("sod", true);
        pluginGeneratedSerialDescriptor.addElement("com", true);
        pluginGeneratedSerialDescriptor.addElement("dataFormat", true);
        pluginGeneratedSerialDescriptor.addElement("dataGroups", true);
        pluginGeneratedSerialDescriptor.addElement("activeAuthInput", true);
        pluginGeneratedSerialDescriptor.addElement("chipAuthOutput", true);
        pluginGeneratedSerialDescriptor.addElement("portrait", true);
        pluginGeneratedSerialDescriptor.addElement("mibi", true);
        getHighSpeedVideoFpsRangesFor = pluginGeneratedSerialDescriptor;
    }
}
