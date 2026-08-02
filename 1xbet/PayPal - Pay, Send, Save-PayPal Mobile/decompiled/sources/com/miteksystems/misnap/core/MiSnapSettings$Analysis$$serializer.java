package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class MiSnapSettings$Analysis$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MiSnapSettings.Analysis> {
    public static final com.miteksystems.misnap.core.MiSnapSettings$Analysis$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoFpsRanges;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MiSnapSettings.Analysis deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        int i;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i2 = 7;
        int i3 = 6;
        java.lang.Object obj9 = null;
        if (beginStructure.decodeSequentially()) {
            obj2 = beginStructure.decodeSerializableElement(descriptor, 0, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$$serializer.INSTANCE, null);
            obj8 = beginStructure.decodeSerializableElement(descriptor, 1, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Face$$serializer.INSTANCE, null);
            obj6 = beginStructure.decodeSerializableElement(descriptor, 2, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Barcode$$serializer.INSTANCE, null);
            obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity", com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity.values()), null);
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor, 6, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 7, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize", com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize.values()), null);
            obj = decodeNullableSerializableElement;
            i = 255;
        } else {
            int i4 = 0;
            boolean z = true;
            java.lang.Object obj10 = null;
            java.lang.Object obj11 = null;
            java.lang.Object obj12 = null;
            obj = null;
            java.lang.Object obj13 = null;
            java.lang.Object obj14 = null;
            java.lang.Object obj15 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 6;
                    case 0:
                        obj15 = beginStructure.decodeSerializableElement(descriptor, 0, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$$serializer.INSTANCE, obj15);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                    case 1:
                        obj14 = beginStructure.decodeSerializableElement(descriptor, 1, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Face$$serializer.INSTANCE, obj14);
                        i4 |= 2;
                        i2 = 7;
                    case 2:
                        obj9 = beginStructure.decodeSerializableElement(descriptor, 2, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Barcode$$serializer.INSTANCE, obj9);
                        i4 |= 4;
                        i2 = 7;
                    case 3:
                        obj13 = beginStructure.decodeNullableSerializableElement(descriptor, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj13);
                        i4 |= 8;
                        i2 = 7;
                    case 4:
                        obj12 = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj12);
                        i4 |= 16;
                        i2 = 7;
                    case 5:
                        obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity", com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity.values()), obj11);
                        i4 |= 32;
                    case 6:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor, i3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj);
                        i4 |= 64;
                    case 7:
                        obj10 = beginStructure.decodeNullableSerializableElement(descriptor, i2, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize", com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize.values()), obj10);
                        i4 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i4;
            obj2 = obj15;
            obj3 = obj10;
            obj4 = obj11;
            obj5 = obj12;
            obj6 = obj9;
            obj7 = obj13;
            obj8 = obj14;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MiSnapSettings.Analysis(i, (com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document) obj2, (com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face) obj8, (com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode) obj6, (java.lang.Integer) obj7, (java.lang.Integer) obj5, (com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity) obj4, (java.lang.Boolean) obj, (com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize) obj3, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MiSnapSettings.Analysis value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MiSnapSettings.Analysis.write$Self(value, beginStructure, descriptor);
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
        return new kotlinx.serialization.KSerializer[]{com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$$serializer.INSTANCE, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Face$$serializer.INSTANCE, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Barcode$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity", com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity.values())), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize", com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize.values()))};
    }

    private MiSnapSettings$Analysis$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MiSnapSettings$Analysis$$serializer miSnapSettings$Analysis$$serializer = new com.miteksystems.misnap.core.MiSnapSettings$Analysis$$serializer();
        INSTANCE = miSnapSettings$Analysis$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Analysis", miSnapSettings$Analysis$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("document", true);
        pluginGeneratedSerialDescriptor.addElement("face", true);
        pluginGeneratedSerialDescriptor.addElement(com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, true);
        pluginGeneratedSerialDescriptor.addElement("jpgQuality", true);
        pluginGeneratedSerialDescriptor.addElement("initialDelay", true);
        pluginGeneratedSerialDescriptor.addElement("motionDetectorSensitivity", true);
        pluginGeneratedSerialDescriptor.addElement("enableAiBasedRts", true);
        pluginGeneratedSerialDescriptor.addElement("aiBasedRtsPayloadSize", true);
        getHighSpeedVideoFpsRanges = pluginGeneratedSerialDescriptor;
    }
}
