package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class MiSnapSettings$Analysis$Document$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document> {
    public static final com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        int i;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.lang.Object obj13;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i2 = 8;
        java.lang.Object obj14 = null;
        if (beginStructure.decodeSequentially()) {
            obj2 = beginStructure.decodeSerializableElement(descriptor, 0, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$Advanced$$serializer.INSTANCE, null);
            obj8 = beginStructure.decodeSerializableElement(descriptor, 1, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$Check$$serializer.INSTANCE, null);
            obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.values()), null);
            obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.values()), null);
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation.values()), null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 6, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.values()), null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 7, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj9 = beginStructure.decodeNullableSerializableElement(descriptor, 8, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 9, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 10, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj = decodeNullableSerializableElement;
            i = 2047;
        } else {
            int i3 = 10;
            int i4 = 0;
            java.lang.Object obj15 = null;
            java.lang.Object obj16 = null;
            java.lang.Object obj17 = null;
            java.lang.Object obj18 = null;
            java.lang.Object obj19 = null;
            java.lang.Object obj20 = null;
            java.lang.Object obj21 = null;
            java.lang.Object obj22 = null;
            java.lang.Object obj23 = null;
            boolean z = true;
            java.lang.Object obj24 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        obj12 = obj15;
                        obj13 = obj23;
                        z = false;
                        i3 = 10;
                        i2 = 8;
                        obj23 = obj13;
                        obj15 = obj12;
                    case 0:
                        obj12 = obj15;
                        obj13 = beginStructure.decodeSerializableElement(descriptor, 0, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$Advanced$$serializer.INSTANCE, obj23);
                        i4 |= 1;
                        obj20 = obj20;
                        i3 = 10;
                        i2 = 8;
                        obj23 = obj13;
                        obj15 = obj12;
                    case 1:
                        obj20 = beginStructure.decodeSerializableElement(descriptor, 1, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$Check$$serializer.INSTANCE, obj20);
                        i4 |= 2;
                        obj15 = obj15;
                        i3 = 10;
                        i2 = 8;
                    case 2:
                        obj21 = beginStructure.decodeNullableSerializableElement(descriptor, 2, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.values()), obj21);
                        i4 |= 4;
                        obj22 = obj22;
                        i3 = 10;
                        i2 = 8;
                    case 3:
                        i4 |= 8;
                        obj22 = beginStructure.decodeNullableSerializableElement(descriptor, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj22);
                        i3 = 10;
                        i2 = 8;
                    case 4:
                        obj15 = beginStructure.decodeNullableSerializableElement(descriptor, 4, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.values()), obj15);
                        i4 |= 16;
                        i3 = 10;
                    case 5:
                        obj24 = beginStructure.decodeNullableSerializableElement(descriptor, 5, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation.values()), obj24);
                        i4 |= 32;
                        i3 = 10;
                    case 6:
                        obj18 = beginStructure.decodeNullableSerializableElement(descriptor, 6, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.values()), obj18);
                        i4 |= 64;
                        i3 = 10;
                    case 7:
                        obj16 = beginStructure.decodeNullableSerializableElement(descriptor, 7, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj16);
                        i4 |= 128;
                        i3 = 10;
                    case 8:
                        obj14 = beginStructure.decodeNullableSerializableElement(descriptor, i2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj14);
                        i4 |= 256;
                        i3 = 10;
                    case 9:
                        obj17 = beginStructure.decodeNullableSerializableElement(descriptor, 9, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj17);
                        i4 |= 512;
                        i3 = 10;
                    case 10:
                        obj19 = beginStructure.decodeNullableSerializableElement(descriptor, i3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj19);
                        i4 |= 1024;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj = obj15;
            obj2 = obj23;
            obj3 = obj16;
            obj4 = obj17;
            obj5 = obj18;
            obj6 = obj24;
            obj7 = obj22;
            obj8 = obj20;
            i = i4;
            obj9 = obj14;
            obj10 = obj19;
            obj11 = obj21;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document(i, (com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced) obj2, (com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Check) obj8, (com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement) obj11, (java.lang.Boolean) obj7, (com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement) obj, (com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation) obj6, (com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger) obj5, (java.lang.Boolean) obj3, (java.lang.Boolean) obj9, (java.lang.Boolean) obj4, (java.lang.Boolean) obj10, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.write$Self(value, beginStructure, descriptor);
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
        return new kotlinx.serialization.KSerializer[]{com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$Advanced$$serializer.INSTANCE, com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$Check$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.values())), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.values())), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation.values())), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger", com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.values())), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE)};
    }

    private MiSnapSettings$Analysis$Document$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$$serializer miSnapSettings$Analysis$Document$$serializer = new com.miteksystems.misnap.core.MiSnapSettings$Analysis$Document$$serializer();
        INSTANCE = miSnapSettings$Analysis$Document$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document", miSnapSettings$Analysis$Document$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("advanced", true);
        pluginGeneratedSerialDescriptor.addElement("check", true);
        pluginGeneratedSerialDescriptor.addElement("documentExtractionRequirement", true);
        pluginGeneratedSerialDescriptor.addElement("prioritizeDocumentExtractionOverImageQuality", true);
        pluginGeneratedSerialDescriptor.addElement("barcodeExtractionRequirement", true);
        pluginGeneratedSerialDescriptor.addElement("orientation", true);
        pluginGeneratedSerialDescriptor.addElement("trigger", true);
        pluginGeneratedSerialDescriptor.addElement("redactOptionalData", true);
        pluginGeneratedSerialDescriptor.addElement("enableEnhancedManual", true);
        pluginGeneratedSerialDescriptor.addElement("enableDocumentClassification", true);
        pluginGeneratedSerialDescriptor.addElement("enableFocusOnFinalFrame", true);
        getHighResolutionOutputSizeshNQ4ISI = pluginGeneratedSerialDescriptor;
    }
}
