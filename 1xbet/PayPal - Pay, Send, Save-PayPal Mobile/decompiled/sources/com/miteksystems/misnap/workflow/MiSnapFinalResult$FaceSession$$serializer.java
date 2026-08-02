package com.miteksystems.misnap.workflow;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class MiSnapFinalResult$FaceSession$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession> {
    public static final com.miteksystems.misnap.workflow.MiSnapFinalResult$FaceSession$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoSizes;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        int i;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        boolean z;
        java.lang.Object obj6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i2 = 6;
        int i3 = 5;
        if (beginStructure.decodeSequentially()) {
            obj6 = beginStructure.decodeSerializableElement(descriptor, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, null);
            java.lang.Object decodeSerializableElement = beginStructure.decodeSerializableElement(descriptor, 2, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.UserAction.INSTANCE.serializer()), null);
            obj3 = beginStructure.decodeSerializableElement(descriptor, 3, com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor, 4);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 6, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, null);
            z = decodeBooleanElement;
            obj = decodeSerializableElement;
            i = 127;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            java.lang.Object obj7 = null;
            java.lang.Object obj8 = null;
            java.lang.Object obj9 = null;
            java.lang.Object obj10 = null;
            obj = null;
            java.lang.Object obj11 = null;
            int i4 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                    case 0:
                        obj9 = beginStructure.decodeSerializableElement(descriptor, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, obj9);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, obj10);
                        i4 |= 2;
                        i2 = 6;
                    case 2:
                        obj = beginStructure.decodeSerializableElement(descriptor, 2, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.UserAction.INSTANCE.serializer()), obj);
                        i4 |= 4;
                        i2 = 6;
                    case 3:
                        obj7 = beginStructure.decodeSerializableElement(descriptor, 3, com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE, obj7);
                        i4 |= 8;
                    case 4:
                        z3 = beginStructure.decodeBooleanElement(descriptor, 4);
                        i4 |= 16;
                    case 5:
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj8);
                        i4 |= 32;
                    case 6:
                        obj11 = beginStructure.decodeNullableSerializableElement(descriptor, i2, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, obj11);
                        i4 |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj2 = obj11;
            i = i4;
            obj3 = obj7;
            obj4 = obj8;
            obj5 = obj10;
            z = z3;
            obj6 = obj9;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession(i, (byte[]) obj6, (byte[]) obj5, (java.util.List) obj, (com.miteksystems.misnap.core.MiSnapMibiData) obj3, z, (java.lang.String) obj4, (byte[]) obj2, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession.write$Self(value, beginStructure, descriptor);
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
        kotlinx.serialization.internal.ByteArraySerializer byteArraySerializer = kotlinx.serialization.internal.ByteArraySerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{byteArraySerializer, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(byteArraySerializer), new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.UserAction.INSTANCE.serializer()), com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.ByteArraySerializer.INSTANCE)};
    }

    private MiSnapFinalResult$FaceSession$$serializer() {
    }

    static {
        com.miteksystems.misnap.workflow.MiSnapFinalResult$FaceSession$$serializer miSnapFinalResult$FaceSession$$serializer = new com.miteksystems.misnap.workflow.MiSnapFinalResult$FaceSession$$serializer();
        INSTANCE = miSnapFinalResult$FaceSession$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession", miSnapFinalResult$FaceSession$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("jpegImage", false);
        pluginGeneratedSerialDescriptor.addElement("video", true);
        pluginGeneratedSerialDescriptor.addElement("warnings", false);
        pluginGeneratedSerialDescriptor.addElement("misnapMibiData", false);
        pluginGeneratedSerialDescriptor.addElement("licenseExpired", false);
        pluginGeneratedSerialDescriptor.addElement("rts", true);
        pluginGeneratedSerialDescriptor.addElement("aIBasedRts", true);
        getHighSpeedVideoSizes = pluginGeneratedSerialDescriptor;
    }
}
