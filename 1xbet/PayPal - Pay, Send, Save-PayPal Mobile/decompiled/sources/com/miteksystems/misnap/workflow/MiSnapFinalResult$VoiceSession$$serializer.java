package com.miteksystems.misnap.workflow;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class MiSnapFinalResult$VoiceSession$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession> {
    public static final com.miteksystems.misnap.workflow.MiSnapFinalResult$VoiceSession$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoFpsRangesFor;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        int i;
        java.lang.Object obj2;
        java.lang.String str;
        boolean z;
        java.lang.Object obj3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (beginStructure.decodeSequentially()) {
            obj3 = beginStructure.decodeSerializableElement(descriptor, 0, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.ByteArraySerializer.INSTANCE), null);
            str = beginStructure.decodeStringElement(descriptor, 1);
            obj2 = beginStructure.decodeSerializableElement(descriptor, 2, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE), null);
            z = beginStructure.decodeBooleanElement(descriptor, 3);
            obj = beginStructure.decodeSerializableElement(descriptor, 4, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)), null);
            i = 31;
        } else {
            boolean z2 = false;
            boolean z3 = true;
            java.lang.Object obj4 = null;
            obj = null;
            java.lang.Object obj5 = null;
            java.lang.String str2 = null;
            int i2 = 0;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                if (decodeElementIndex == -1) {
                    z3 = false;
                } else if (decodeElementIndex == 0) {
                    obj4 = beginStructure.decodeSerializableElement(descriptor, 0, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.ByteArraySerializer.INSTANCE), obj4);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str2 = beginStructure.decodeStringElement(descriptor, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj5 = beginStructure.decodeSerializableElement(descriptor, 2, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE), obj5);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    z2 = beginStructure.decodeBooleanElement(descriptor, 3);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    obj = beginStructure.decodeSerializableElement(descriptor, 4, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)), obj);
                    i2 |= 16;
                }
            }
            i = i2;
            obj2 = obj5;
            str = str2;
            z = z2;
            obj3 = obj4;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession(i, (java.util.List) obj3, str, (java.util.List) obj2, z, (java.util.List) obj, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession.write$Self(value, beginStructure, descriptor);
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
        return new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.ByteArraySerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE))};
    }

    private MiSnapFinalResult$VoiceSession$$serializer() {
    }

    static {
        com.miteksystems.misnap.workflow.MiSnapFinalResult$VoiceSession$$serializer miSnapFinalResult$VoiceSession$$serializer = new com.miteksystems.misnap.workflow.MiSnapFinalResult$VoiceSession$$serializer();
        INSTANCE = miSnapFinalResult$VoiceSession$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession", miSnapFinalResult$VoiceSession$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("voiceSamples", false);
        pluginGeneratedSerialDescriptor.addElement("phrase", false);
        pluginGeneratedSerialDescriptor.addElement("misnapMibiData", false);
        pluginGeneratedSerialDescriptor.addElement("licenseExpired", false);
        pluginGeneratedSerialDescriptor.addElement("rts", true);
        getHighSpeedVideoFpsRangesFor = pluginGeneratedSerialDescriptor;
    }
}
