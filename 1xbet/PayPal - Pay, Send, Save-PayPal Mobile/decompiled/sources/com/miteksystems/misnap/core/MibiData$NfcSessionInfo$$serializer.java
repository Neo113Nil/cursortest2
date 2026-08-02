package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MibiData$NfcSessionInfo$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$NfcSessionInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$NfcSessionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$NfcSessionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class MibiData$NfcSessionInfo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MibiData.NfcSessionInfo> {
    public static final com.miteksystems.misnap.core.MibiData$NfcSessionInfo$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoSizes;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MibiData.NfcSessionInfo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String str;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        long j;
        int i;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i2 = 9;
        int i3 = 8;
        java.lang.Object obj11 = null;
        if (beginStructure.decodeSequentially()) {
            obj9 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement3 = beginStructure.decodeNullableSerializableElement(descriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, com.miteksystems.misnap.core.MibiData$NfcChipAuthentication$$serializer.INSTANCE, null);
            obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 6, new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE)), null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 7, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 8, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor, 9);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 10, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            str = beginStructure.decodeStringElement(descriptor, 11);
            obj8 = decodeNullableSerializableElement;
            j = decodeLongElement;
            obj3 = decodeNullableSerializableElement2;
            obj2 = decodeNullableSerializableElement3;
            obj = decodeNullableSerializableElement4;
            i = 4095;
        } else {
            int i4 = 11;
            long j2 = 0;
            int i5 = 0;
            boolean z = true;
            java.lang.String str2 = null;
            java.lang.Object obj12 = null;
            java.lang.Object obj13 = null;
            obj = null;
            java.lang.Object obj14 = null;
            obj2 = null;
            obj3 = null;
            java.lang.Object obj15 = null;
            java.lang.Object obj16 = null;
            java.lang.Object obj17 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 11;
                        i3 = 8;
                    case 0:
                        i5 |= 1;
                        obj16 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj16);
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                    case 1:
                        obj17 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj17);
                        i5 |= 2;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                    case 2:
                        obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj3);
                        i5 |= 4;
                        i4 = 11;
                        i2 = 9;
                    case 3:
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj2);
                        i5 |= 8;
                        i4 = 11;
                        i2 = 9;
                    case 4:
                        obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj11);
                        i5 |= 16;
                        i4 = 11;
                        i2 = 9;
                    case 5:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor, 5, com.miteksystems.misnap.core.MibiData$NfcChipAuthentication$$serializer.INSTANCE, obj);
                        i5 |= 32;
                        i4 = 11;
                        i2 = 9;
                    case 6:
                        obj15 = beginStructure.decodeNullableSerializableElement(descriptor, 6, new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE)), obj15);
                        i5 |= 64;
                        i4 = 11;
                        i2 = 9;
                    case 7:
                        obj13 = beginStructure.decodeNullableSerializableElement(descriptor, 7, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), obj13);
                        i5 |= 128;
                        i4 = 11;
                    case 8:
                        obj12 = beginStructure.decodeNullableSerializableElement(descriptor, i3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj12);
                        i5 |= 256;
                        i4 = 11;
                    case 9:
                        j2 = beginStructure.decodeLongElement(descriptor, i2);
                        i5 |= 512;
                        i4 = 11;
                    case 10:
                        obj14 = beginStructure.decodeNullableSerializableElement(descriptor, 10, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj14);
                        i5 |= 1024;
                        i4 = 11;
                    case 11:
                        str2 = beginStructure.decodeStringElement(descriptor, i4);
                        i5 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str2;
            obj4 = obj13;
            obj5 = obj14;
            obj6 = obj11;
            j = j2;
            i = i5;
            obj7 = obj15;
            java.lang.Object obj18 = obj12;
            obj8 = obj17;
            obj9 = obj16;
            obj10 = obj18;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MibiData.NfcSessionInfo(i, (java.lang.String) obj9, (java.lang.String) obj8, (java.lang.String) obj3, (java.lang.String) obj2, (java.lang.String) obj6, (com.miteksystems.misnap.core.MibiData.NfcChipAuthentication) obj, (java.util.List) obj7, (java.util.List) obj4, (java.lang.Boolean) obj10, j, (java.lang.Integer) obj5, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MibiData.NfcSessionInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MibiData.NfcSessionInfo.write$Self(value, beginStructure, descriptor);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return getHighSpeedVideoSizes;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.miteksystems.misnap.core.MibiData$NfcChipAuthentication$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE))), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE)), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.internal.LongSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    private MibiData$NfcSessionInfo$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MibiData$NfcSessionInfo$$serializer mibiData$NfcSessionInfo$$serializer = new com.miteksystems.misnap.core.MibiData$NfcSessionInfo$$serializer();
        INSTANCE = mibiData$NfcSessionInfo$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.NfcSessionInfo", mibiData$NfcSessionInfo$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("DocumentCode", true);
        pluginGeneratedSerialDescriptor.addElement("IssuingCountry", true);
        pluginGeneratedSerialDescriptor.addElement(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Nationality, true);
        pluginGeneratedSerialDescriptor.addElement("IssueDate", true);
        pluginGeneratedSerialDescriptor.addElement("Unlock", true);
        pluginGeneratedSerialDescriptor.addElement("CA", true);
        pluginGeneratedSerialDescriptor.addElement("Warnings", true);
        pluginGeneratedSerialDescriptor.addElement("DGs", true);
        pluginGeneratedSerialDescriptor.addElement("OptionalDataRedacted", true);
        pluginGeneratedSerialDescriptor.addElement("TotalDuration", false);
        pluginGeneratedSerialDescriptor.addElement("Tries", true);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, true);
        getHighSpeedVideoSizes = pluginGeneratedSerialDescriptor;
    }
}
