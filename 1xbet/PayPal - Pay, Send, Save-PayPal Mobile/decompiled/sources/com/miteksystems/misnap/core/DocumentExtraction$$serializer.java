package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/DocumentExtraction$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/DocumentExtraction;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/DocumentExtraction;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/DocumentExtraction;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class DocumentExtraction$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.DocumentExtraction> {
    public static final com.miteksystems.misnap.core.DocumentExtraction$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoSizes;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.DocumentExtraction deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        int i;
        java.lang.Object obj3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        java.lang.Object obj4 = null;
        if (beginStructure.decodeSequentially()) {
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 0, com.miteksystems.misnap.core.Mrz.INSTANCE.serializer(), null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, com.miteksystems.misnap.core.DocumentData$$serializer.INSTANCE, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor, 2, com.miteksystems.misnap.core.ExtractedDataCorners$$serializer.INSTANCE, null);
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.Object obj5 = null;
            java.lang.Object obj6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 0, com.miteksystems.misnap.core.Mrz.INSTANCE.serializer(), obj6);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 1, com.miteksystems.misnap.core.DocumentData$$serializer.INSTANCE, obj5);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 2, com.miteksystems.misnap.core.ExtractedDataCorners$$serializer.INSTANCE, obj4);
                    i2 |= 4;
                }
            }
            obj = obj4;
            obj2 = obj5;
            i = i2;
            obj3 = obj6;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.DocumentExtraction(i, (com.miteksystems.misnap.core.Mrz) obj3, (com.miteksystems.misnap.core.DocumentData) obj2, (com.miteksystems.misnap.core.ExtractedDataCorners) obj, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.DocumentExtraction value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.DocumentExtraction.write$Self(value, beginStructure, descriptor);
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
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.miteksystems.misnap.core.Mrz.INSTANCE.serializer()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.miteksystems.misnap.core.DocumentData$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.miteksystems.misnap.core.ExtractedDataCorners$$serializer.INSTANCE)};
    }

    private DocumentExtraction$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.DocumentExtraction$$serializer documentExtraction$$serializer = new com.miteksystems.misnap.core.DocumentExtraction$$serializer();
        INSTANCE = documentExtraction$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.DocumentExtraction", documentExtraction$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MiSnapSettings.KEY_NFC_MRZ, true);
        pluginGeneratedSerialDescriptor.addElement("extractedData", true);
        pluginGeneratedSerialDescriptor.addElement("extractedDataCorners", true);
        getHighSpeedVideoSizes = pluginGeneratedSerialDescriptor;
    }
}
