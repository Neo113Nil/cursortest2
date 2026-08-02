package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MibiData$DocumentSessionInfo$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$DocumentSessionInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$DocumentSessionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$DocumentSessionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class MibiData$DocumentSessionInfo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MibiData.DocumentSessionInfo> {
    public static final com.miteksystems.misnap.core.MibiData$DocumentSessionInfo$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoFpsRanges;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MibiData.DocumentSessionInfo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        int i;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.String str;
        long j;
        java.lang.Object obj12;
        java.lang.Object obj13;
        java.lang.Object obj14;
        java.lang.Object obj15;
        java.lang.Object obj16;
        java.lang.Object obj17;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        java.lang.Object obj18 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement3 = beginStructure.decodeNullableSerializableElement(descriptor, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj12 = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj9 = beginStructure.decodeNullableSerializableElement(descriptor, 6, new kotlinx.serialization.internal.ReferenceArraySerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(int[].class), kotlinx.serialization.internal.IntArraySerializer.INSTANCE), null);
            obj13 = beginStructure.decodeNullableSerializableElement(descriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 9, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            obj14 = beginStructure.decodeNullableSerializableElement(descriptor, 10, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor, 11);
            java.lang.Object decodeNullableSerializableElement4 = beginStructure.decodeNullableSerializableElement(descriptor, 12, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 13, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement5 = beginStructure.decodeNullableSerializableElement(descriptor, 14, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            str = beginStructure.decodeStringElement(descriptor, 15);
            obj5 = decodeNullableSerializableElement3;
            i = 65535;
            j = decodeLongElement;
            obj3 = decodeNullableSerializableElement4;
            obj4 = decodeNullableSerializableElement2;
            obj = decodeNullableSerializableElement5;
            obj6 = decodeNullableSerializableElement;
        } else {
            int i2 = 15;
            int i3 = 0;
            boolean z = true;
            java.lang.Object obj19 = null;
            java.lang.Object obj20 = null;
            obj = null;
            obj2 = null;
            java.lang.Object obj21 = null;
            java.lang.Object obj22 = null;
            java.lang.Object obj23 = null;
            obj3 = null;
            java.lang.Object obj24 = null;
            java.lang.Object obj25 = null;
            java.lang.Object obj26 = null;
            java.lang.String str2 = null;
            long j2 = 0;
            java.lang.Object obj27 = null;
            java.lang.Object obj28 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        obj20 = obj20;
                        obj19 = obj19;
                    case 0:
                        obj15 = obj19;
                        obj16 = obj20;
                        i3 |= 1;
                        obj25 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj25);
                        obj20 = obj16;
                        obj19 = obj15;
                        i2 = 15;
                    case 1:
                        obj15 = obj19;
                        obj16 = obj20;
                        obj18 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj18);
                        i3 |= 2;
                        obj20 = obj16;
                        obj19 = obj15;
                        i2 = 15;
                    case 2:
                        obj15 = obj19;
                        obj24 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj24);
                        i3 |= 4;
                        obj20 = obj20;
                        obj26 = obj26;
                        obj19 = obj15;
                        i2 = 15;
                    case 3:
                        obj16 = obj20;
                        obj15 = obj19;
                        obj26 = beginStructure.decodeNullableSerializableElement(descriptor, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj26);
                        i3 |= 8;
                        obj20 = obj16;
                        obj19 = obj15;
                        i2 = 15;
                    case 4:
                        obj17 = obj20;
                        obj19 = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj19);
                        i3 |= 16;
                        obj20 = obj17;
                        i2 = 15;
                    case 5:
                        obj17 = obj20;
                        obj28 = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj28);
                        i3 |= 32;
                        obj20 = obj17;
                        i2 = 15;
                    case 6:
                        obj17 = obj20;
                        obj23 = beginStructure.decodeNullableSerializableElement(descriptor, 6, new kotlinx.serialization.internal.ReferenceArraySerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(int[].class), kotlinx.serialization.internal.IntArraySerializer.INSTANCE), obj23);
                        i3 |= 64;
                        obj20 = obj17;
                        i2 = 15;
                    case 7:
                        obj17 = obj20;
                        obj21 = beginStructure.decodeNullableSerializableElement(descriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj21);
                        i3 |= 128;
                        obj20 = obj17;
                        i2 = 15;
                    case 8:
                        obj17 = obj20;
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj2);
                        i3 |= 256;
                        obj20 = obj17;
                        i2 = 15;
                    case 9:
                        obj27 = beginStructure.decodeNullableSerializableElement(descriptor, 9, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), obj27);
                        i3 |= 512;
                        obj20 = obj20;
                        i2 = 15;
                    case 10:
                        obj17 = obj20;
                        obj22 = beginStructure.decodeNullableSerializableElement(descriptor, 10, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj22);
                        i3 |= 1024;
                        obj20 = obj17;
                        i2 = 15;
                    case 11:
                        j2 = beginStructure.decodeLongElement(descriptor, 11);
                        i3 |= 2048;
                        i2 = 15;
                    case 12:
                        obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 12, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj3);
                        i3 |= 4096;
                        i2 = 15;
                    case 13:
                        obj20 = beginStructure.decodeNullableSerializableElement(descriptor, 13, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj20);
                        i3 |= 8192;
                        i2 = 15;
                    case 14:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor, 14, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj);
                        i3 |= 16384;
                        i2 = 15;
                    case 15:
                        str2 = beginStructure.decodeStringElement(descriptor, i2);
                        i3 |= 32768;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.Object obj29 = obj19;
            java.lang.Object obj30 = obj20;
            obj4 = obj24;
            obj5 = obj26;
            obj6 = obj25;
            obj7 = obj18;
            obj8 = obj27;
            obj9 = obj23;
            i = i3;
            obj10 = obj30;
            obj11 = obj29;
            str = str2;
            j = j2;
            java.lang.Object obj31 = obj22;
            obj12 = obj28;
            obj13 = obj21;
            obj14 = obj31;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MibiData.DocumentSessionInfo(i, (java.lang.String) obj6, (java.lang.String) obj7, (java.lang.Boolean) obj4, (java.lang.Boolean) obj5, (java.lang.Boolean) obj11, (java.lang.String) obj12, (int[][]) obj9, (java.lang.String) obj13, (java.lang.String) obj2, (java.util.List) obj8, (java.lang.Integer) obj14, j, (java.lang.Integer) obj3, (java.lang.Integer) obj10, (java.lang.Boolean) obj, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MibiData.DocumentSessionInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MibiData.DocumentSessionInfo.write$Self(value, beginStructure, descriptor);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return getHighSpeedVideoFpsRanges;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ReferenceArraySerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(int[].class), kotlinx.serialization.internal.IntArraySerializer.INSTANCE)), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE)), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.internal.LongSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    private MibiData$DocumentSessionInfo$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MibiData$DocumentSessionInfo$$serializer mibiData$DocumentSessionInfo$$serializer = new com.miteksystems.misnap.core.MibiData$DocumentSessionInfo$$serializer();
        INSTANCE = mibiData$DocumentSessionInfo$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.DocumentSessionInfo", mibiData$DocumentSessionInfo$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("DocType", true);
        pluginGeneratedSerialDescriptor.addElement("ClassificationType", true);
        pluginGeneratedSerialDescriptor.addElement("MrzExtracted", true);
        pluginGeneratedSerialDescriptor.addElement("OptionalDataRedacted", true);
        pluginGeneratedSerialDescriptor.addElement("EnhancedManual", true);
        pluginGeneratedSerialDescriptor.addElement("Mode", true);
        pluginGeneratedSerialDescriptor.addElement("FourCorners", true);
        pluginGeneratedSerialDescriptor.addElement("DeviceOrientation", true);
        pluginGeneratedSerialDescriptor.addElement("DocumentOrientation", true);
        pluginGeneratedSerialDescriptor.addElement("Warnings", true);
        pluginGeneratedSerialDescriptor.addElement("JpegQuality", true);
        pluginGeneratedSerialDescriptor.addElement("TotalDuration", false);
        pluginGeneratedSerialDescriptor.addElement("AutoTries", true);
        pluginGeneratedSerialDescriptor.addElement("ManualTries", true);
        pluginGeneratedSerialDescriptor.addElement("IqaRequired", true);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, true);
        getHighSpeedVideoFpsRanges = pluginGeneratedSerialDescriptor;
    }
}
