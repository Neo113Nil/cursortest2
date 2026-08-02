package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MiSnapSettings;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MiSnapSettings;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class MiSnapSettings$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MiSnapSettings> {
    public static final com.miteksystems.misnap.core.MiSnapSettings$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoFpsRanges;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MiSnapSettings deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        int i;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String str;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        char c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i2 = 6;
        int i3 = 5;
        java.lang.String str2 = null;
        if (beginStructure.decodeSequentially()) {
            obj5 = beginStructure.decodeSerializableElement(descriptor, 0, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.UseCase", com.miteksystems.misnap.core.MiSnapSettings.UseCase.values()), null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor, 1);
            obj6 = beginStructure.decodeSerializableElement(descriptor, 2, com.miteksystems.misnap.core.MiSnapSettings$Camera$$serializer.INSTANCE, null);
            obj4 = beginStructure.decodeSerializableElement(descriptor, 3, com.miteksystems.misnap.core.MiSnapSettings$Analysis$$serializer.INSTANCE, null);
            java.lang.Object decodeSerializableElement = beginStructure.decodeSerializableElement(descriptor, 4, com.miteksystems.misnap.core.MiSnapSettings$Workflow$$serializer.INSTANCE, null);
            obj2 = beginStructure.decodeSerializableElement(descriptor, 5, com.miteksystems.misnap.core.MiSnapSettings$Nfc$$serializer.INSTANCE, null);
            obj3 = beginStructure.decodeSerializableElement(descriptor, 6, com.miteksystems.misnap.core.MiSnapSettings$Voice$$serializer.INSTANCE, null);
            obj = decodeSerializableElement;
            i = 127;
            str = decodeStringElement;
        } else {
            int i4 = 0;
            boolean z = true;
            java.lang.Object obj7 = null;
            java.lang.Object obj8 = null;
            java.lang.Object obj9 = null;
            java.lang.Object obj10 = null;
            obj = null;
            java.lang.Object obj11 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 5;
                    case 0:
                        obj10 = beginStructure.decodeSerializableElement(descriptor, 0, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.UseCase", com.miteksystems.misnap.core.MiSnapSettings.UseCase.values()), obj10);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        c = 2;
                        str2 = beginStructure.decodeStringElement(descriptor, 1);
                        i4 |= 2;
                        i2 = 6;
                    case 2:
                        c = 2;
                        obj11 = beginStructure.decodeSerializableElement(descriptor, 2, com.miteksystems.misnap.core.MiSnapSettings$Camera$$serializer.INSTANCE, obj11);
                        i4 |= 4;
                        i2 = 6;
                    case 3:
                        obj9 = beginStructure.decodeSerializableElement(descriptor, 3, com.miteksystems.misnap.core.MiSnapSettings$Analysis$$serializer.INSTANCE, obj9);
                        i4 |= 8;
                    case 4:
                        obj = beginStructure.decodeSerializableElement(descriptor, 4, com.miteksystems.misnap.core.MiSnapSettings$Workflow$$serializer.INSTANCE, obj);
                        i4 |= 16;
                    case 5:
                        obj7 = beginStructure.decodeSerializableElement(descriptor, i3, com.miteksystems.misnap.core.MiSnapSettings$Nfc$$serializer.INSTANCE, obj7);
                        i4 |= 32;
                    case 6:
                        obj8 = beginStructure.decodeSerializableElement(descriptor, i2, com.miteksystems.misnap.core.MiSnapSettings$Voice$$serializer.INSTANCE, obj8);
                        i4 |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i4;
            obj2 = obj7;
            obj3 = obj8;
            str = str2;
            obj4 = obj9;
            obj5 = obj10;
            obj6 = obj11;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MiSnapSettings(i, (com.miteksystems.misnap.core.MiSnapSettings.UseCase) obj5, str, (com.miteksystems.misnap.core.MiSnapSettings.Camera) obj6, (com.miteksystems.misnap.core.MiSnapSettings.Analysis) obj4, (com.miteksystems.misnap.core.MiSnapSettings.Workflow) obj, (com.miteksystems.misnap.core.MiSnapSettings.Nfc) obj2, (com.miteksystems.misnap.core.MiSnapSettings.Voice) obj3, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MiSnapSettings value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MiSnapSettings.write$Self(value, beginStructure, descriptor);
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
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.MiSnapSettings.UseCase", com.miteksystems.misnap.core.MiSnapSettings.UseCase.values()), kotlinx.serialization.internal.StringSerializer.INSTANCE, com.miteksystems.misnap.core.MiSnapSettings$Camera$$serializer.INSTANCE, com.miteksystems.misnap.core.MiSnapSettings$Analysis$$serializer.INSTANCE, com.miteksystems.misnap.core.MiSnapSettings$Workflow$$serializer.INSTANCE, com.miteksystems.misnap.core.MiSnapSettings$Nfc$$serializer.INSTANCE, com.miteksystems.misnap.core.MiSnapSettings$Voice$$serializer.INSTANCE};
    }

    private MiSnapSettings$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MiSnapSettings$$serializer miSnapSettings$$serializer = new com.miteksystems.misnap.core.MiSnapSettings$$serializer();
        INSTANCE = miSnapSettings$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MiSnapSettings", miSnapSettings$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("useCase", false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MiSnapSettings.KEY_LICENSE, false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, true);
        pluginGeneratedSerialDescriptor.addElement("analysis", true);
        pluginGeneratedSerialDescriptor.addElement("workflow", true);
        pluginGeneratedSerialDescriptor.addElement("nfc", true);
        pluginGeneratedSerialDescriptor.addElement("voice", true);
        getHighSpeedVideoFpsRanges = pluginGeneratedSerialDescriptor;
    }
}
