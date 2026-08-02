package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face$Advanced$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face$Advanced;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face$Advanced;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face$Advanced;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class MiSnapSettings$Analysis$Face$Advanced$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Advanced> {
    public static final com.miteksystems.misnap.core.MiSnapSettings$Analysis$Face$Advanced$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoFpsRanges;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Advanced deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        int i;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        char c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i2 = 6;
        char c2 = 3;
        java.lang.Object obj8 = null;
        if (beginStructure.decodeSequentially()) {
            obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 6, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.FaceIqaCheck", com.miteksystems.misnap.core.FaceIqaCheck.values())), null);
            obj = decodeNullableSerializableElement;
            i = 127;
        } else {
            int i3 = 0;
            boolean z = true;
            java.lang.Object obj9 = null;
            java.lang.Object obj10 = null;
            java.lang.Object obj11 = null;
            obj = null;
            java.lang.Object obj12 = null;
            java.lang.Object obj13 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        c = c2;
                        obj13 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj13);
                        i3 |= 1;
                        c2 = c;
                        i2 = 6;
                    case 1:
                        c = c2;
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj8);
                        i3 |= 2;
                        c2 = c;
                        i2 = 6;
                    case 2:
                        obj12 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj12);
                        i3 |= 4;
                        c2 = c2;
                        i2 = 6;
                    case 3:
                        obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj10);
                        i3 |= 8;
                        c2 = 3;
                    case 4:
                        obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj11);
                        i3 |= 16;
                        c2 = 3;
                    case 5:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj);
                        i3 |= 32;
                        c2 = 3;
                    case 6:
                        obj9 = beginStructure.decodeNullableSerializableElement(descriptor, i2, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.FaceIqaCheck", com.miteksystems.misnap.core.FaceIqaCheck.values())), obj9);
                        i3 |= 64;
                        c2 = 3;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i3;
            obj2 = obj9;
            obj3 = obj10;
            obj4 = obj8;
            obj5 = obj11;
            obj6 = obj12;
            obj7 = obj13;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Advanced(i, (java.lang.Integer) obj7, (java.lang.Integer) obj4, (java.lang.Integer) obj6, (java.lang.Integer) obj3, (java.lang.Integer) obj5, (java.lang.Integer) obj, (java.util.List) obj2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Advanced value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Advanced.write$Self(value, beginStructure, descriptor);
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
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.FaceIqaCheck", com.miteksystems.misnap.core.FaceIqaCheck.values())))};
    }

    private MiSnapSettings$Analysis$Face$Advanced$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MiSnapSettings$Analysis$Face$Advanced$$serializer miSnapSettings$Analysis$Face$Advanced$$serializer = new com.miteksystems.misnap.core.MiSnapSettings$Analysis$Face$Advanced$$serializer();
        INSTANCE = miSnapSettings$Analysis$Face$Advanced$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Advanced", miSnapSettings$Analysis$Face$Advanced$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("minHorizontalFill", true);
        pluginGeneratedSerialDescriptor.addElement("minPadding", true);
        pluginGeneratedSerialDescriptor.addElement("maxAngle", true);
        pluginGeneratedSerialDescriptor.addElement("minSmileConfidence", true);
        pluginGeneratedSerialDescriptor.addElement("minEyesOpenConfidence", true);
        pluginGeneratedSerialDescriptor.addElement("triggerDelay", true);
        pluginGeneratedSerialDescriptor.addElement("prioritizedIqaChecks", true);
        getHighSpeedVideoFpsRanges = pluginGeneratedSerialDescriptor;
    }
}
