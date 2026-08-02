package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MibiData$FaceSessionInfo$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$FaceSessionInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$FaceSessionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$FaceSessionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class MibiData$FaceSessionInfo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MibiData.FaceSessionInfo> {
    public static final com.miteksystems.misnap.core.MibiData$FaceSessionInfo$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MibiData.FaceSessionInfo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.String str;
        long j;
        int i;
        java.lang.Object obj7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i2 = 7;
        java.lang.Object obj8 = null;
        if (beginStructure.decodeSequentially()) {
            obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor, 3, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor, 5);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 6, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 7, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            str = beginStructure.decodeStringElement(descriptor, 8);
            j = decodeLongElement;
            obj2 = decodeNullableSerializableElement;
            obj = decodeNullableSerializableElement2;
            i = 511;
        } else {
            int i3 = 0;
            boolean z = true;
            java.lang.Object obj9 = null;
            java.lang.Object obj10 = null;
            obj = null;
            java.lang.Object obj11 = null;
            java.lang.Object obj12 = null;
            long j2 = 0;
            java.lang.String str2 = null;
            obj2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        obj12 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj12);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj2);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj8);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor, 3, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), obj);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj11);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        j2 = beginStructure.decodeLongElement(descriptor, 5);
                        i3 |= 32;
                    case 6:
                        obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 6, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj10);
                        i3 |= 64;
                    case 7:
                        obj9 = beginStructure.decodeNullableSerializableElement(descriptor, i2, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj9);
                        i3 |= 128;
                    case 8:
                        str2 = beginStructure.decodeStringElement(descriptor, 8);
                        i3 |= 256;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj3 = obj9;
            obj4 = obj10;
            obj5 = obj11;
            obj6 = obj8;
            str = str2;
            j = j2;
            i = i3;
            obj7 = obj12;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MibiData.FaceSessionInfo(i, (java.lang.String) obj7, (java.lang.Boolean) obj2, (java.lang.String) obj6, (java.util.List) obj, (java.lang.Integer) obj5, j, (java.lang.Integer) obj4, (java.lang.Integer) obj3, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MibiData.FaceSessionInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MibiData.FaceSessionInfo.write$Self(value, beginStructure, descriptor);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE)), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.internal.LongSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    private MibiData$FaceSessionInfo$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MibiData$FaceSessionInfo$$serializer mibiData$FaceSessionInfo$$serializer = new com.miteksystems.misnap.core.MibiData$FaceSessionInfo$$serializer();
        INSTANCE = mibiData$FaceSessionInfo$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.FaceSessionInfo", mibiData$FaceSessionInfo$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("Mode", true);
        pluginGeneratedSerialDescriptor.addElement("Smile", true);
        pluginGeneratedSerialDescriptor.addElement("DeviceOrientation", true);
        pluginGeneratedSerialDescriptor.addElement("Warnings", true);
        pluginGeneratedSerialDescriptor.addElement("JpegQuality", true);
        pluginGeneratedSerialDescriptor.addElement("TotalDuration", false);
        pluginGeneratedSerialDescriptor.addElement("AutoTries", true);
        pluginGeneratedSerialDescriptor.addElement("ManualTries", true);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, true);
        getHighResolutionOutputSizeshNQ4ISI = pluginGeneratedSerialDescriptor;
    }
}
