package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MibiData$VoiceSessionInfo$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$VoiceSessionInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$VoiceSessionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$VoiceSessionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class MibiData$VoiceSessionInfo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MibiData.VoiceSessionInfo> {
    public static final com.miteksystems.misnap.core.MibiData$VoiceSessionInfo$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoSizes;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MibiData.VoiceSessionInfo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        long j;
        java.lang.String str;
        int i;
        java.lang.Object obj5;
        char c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i2 = 6;
        int i3 = 5;
        int i4 = 3;
        java.lang.String str2 = null;
        if (beginStructure.decodeSequentially()) {
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MibiData.VoiceSessionInfo.Flow", com.miteksystems.misnap.core.MibiData.VoiceSessionInfo.Flow.values()), null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.FloatSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE)), null);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor, 4);
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            str = beginStructure.decodeStringElement(descriptor, 6);
            j = decodeLongElement;
            obj = decodeNullableSerializableElement;
            i = 127;
        } else {
            long j2 = 0;
            int i5 = 0;
            boolean z = true;
            java.lang.Object obj6 = null;
            obj = null;
            java.lang.Object obj7 = null;
            java.lang.Object obj8 = null;
            java.lang.Object obj9 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 5;
                        i4 = 3;
                    case 0:
                        obj9 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MibiData.VoiceSessionInfo.Flow", com.miteksystems.misnap.core.MibiData.VoiceSessionInfo.Flow.values()), obj9);
                        i5 |= 1;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                    case 1:
                        c = 2;
                        obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.FloatSerializer.INSTANCE, obj7);
                        i5 |= 2;
                        i2 = 6;
                        i3 = 5;
                    case 2:
                        c = 2;
                        obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj6);
                        i5 |= 4;
                        i2 = 6;
                        i3 = 5;
                    case 3:
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor, i4, new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE)), obj8);
                        i5 |= 8;
                        i2 = 6;
                        i3 = 5;
                    case 4:
                        j2 = beginStructure.decodeLongElement(descriptor, 4);
                        i5 |= 16;
                    case 5:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor, i3, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj);
                        i5 |= 32;
                    case 6:
                        str2 = beginStructure.decodeStringElement(descriptor, i2);
                        i5 |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
            j = j2;
            str = str2;
            i = i5;
            obj5 = obj9;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MibiData.VoiceSessionInfo(i, (com.miteksystems.misnap.core.MibiData.VoiceSessionInfo.Flow) obj5, (java.lang.Float) obj3, (java.lang.Integer) obj2, (java.util.List) obj4, j, (java.lang.Integer) obj, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MibiData.VoiceSessionInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MibiData.VoiceSessionInfo.write$Self(value, beginStructure, descriptor);
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
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MibiData.VoiceSessionInfo.Flow", com.miteksystems.misnap.core.MibiData.VoiceSessionInfo.Flow.values())), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.FloatSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE))), kotlinx.serialization.internal.LongSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    private MibiData$VoiceSessionInfo$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MibiData$VoiceSessionInfo$$serializer mibiData$VoiceSessionInfo$$serializer = new com.miteksystems.misnap.core.MibiData$VoiceSessionInfo$$serializer();
        INSTANCE = mibiData$VoiceSessionInfo$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.VoiceSessionInfo", mibiData$VoiceSessionInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("Flow", true);
        pluginGeneratedSerialDescriptor.addElement("SNR", true);
        pluginGeneratedSerialDescriptor.addElement("SpeechDuration", true);
        pluginGeneratedSerialDescriptor.addElement("Warnings", true);
        pluginGeneratedSerialDescriptor.addElement("TotalDuration", false);
        pluginGeneratedSerialDescriptor.addElement("Tries", true);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, true);
        getHighSpeedVideoSizes = pluginGeneratedSerialDescriptor;
    }
}
