package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MibiData$Mibi$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$Mibi;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$Mibi;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$Mibi;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class MibiData$Mibi$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MibiData.Mibi> {
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor Camera2StreamConfigurationMap;
    public static final com.miteksystems.misnap.core.MibiData$Mibi$$serializer INSTANCE;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MibiData.Mibi deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.String str2;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        int i2 = 1;
        java.lang.String str3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(descriptor, 1);
            obj4 = beginStructure.decodeSerializableElement(descriptor, 2, com.miteksystems.misnap.core.MibiData$DeviceInfo$$serializer.INSTANCE, null);
            obj3 = beginStructure.decodeSerializableElement(descriptor, 3, com.miteksystems.misnap.core.MibiData$SdkInfo$$serializer.INSTANCE, null);
            obj = beginStructure.decodeSerializableElement(descriptor, 4, com.miteksystems.misnap.core.MibiData$PlatformPrivate$$serializer.INSTANCE, null);
            obj2 = beginStructure.decodeSerializableElement(descriptor, 5, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.MibiData.SessionInfoSerializer.INSTANCE), null);
            str = decodeStringElement;
            str2 = decodeStringElement2;
            i = 63;
        } else {
            int i3 = 0;
            boolean z = true;
            str = null;
            java.lang.Object obj5 = null;
            java.lang.Object obj6 = null;
            java.lang.Object obj7 = null;
            java.lang.Object obj8 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str = beginStructure.decodeStringElement(descriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        str3 = beginStructure.decodeStringElement(descriptor, i2);
                        i3 |= 2;
                        continue;
                    case 2:
                        obj8 = beginStructure.decodeSerializableElement(descriptor, 2, com.miteksystems.misnap.core.MibiData$DeviceInfo$$serializer.INSTANCE, obj8);
                        i3 |= 4;
                        break;
                    case 3:
                        obj7 = beginStructure.decodeSerializableElement(descriptor, 3, com.miteksystems.misnap.core.MibiData$SdkInfo$$serializer.INSTANCE, obj7);
                        i3 |= 8;
                        break;
                    case 4:
                        obj5 = beginStructure.decodeSerializableElement(descriptor, 4, com.miteksystems.misnap.core.MibiData$PlatformPrivate$$serializer.INSTANCE, obj5);
                        i3 |= 16;
                        break;
                    case 5:
                        obj6 = beginStructure.decodeSerializableElement(descriptor, 5, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.MibiData.SessionInfoSerializer.INSTANCE), obj6);
                        i3 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
                i2 = 1;
            }
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
            str2 = str3;
            i = i3;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MibiData.Mibi(i, str, str2, (com.miteksystems.misnap.core.MibiData.DeviceInfo) obj4, (com.miteksystems.misnap.core.MibiData.SdkInfo) obj3, (com.miteksystems.misnap.core.MibiData.PlatformPrivate) obj, (java.util.List) obj2);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MibiData.Mibi value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MibiData.Mibi.getHighSpeedVideoFpsRangesFor(value, beginStructure, descriptor);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return Camera2StreamConfigurationMap;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer, com.miteksystems.misnap.core.MibiData$DeviceInfo$$serializer.INSTANCE, com.miteksystems.misnap.core.MibiData$SdkInfo$$serializer.INSTANCE, com.miteksystems.misnap.core.MibiData$PlatformPrivate$$serializer.INSTANCE, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.MibiData.SessionInfoSerializer.INSTANCE)};
    }

    private MibiData$Mibi$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MibiData$Mibi$$serializer mibiData$Mibi$$serializer = new com.miteksystems.misnap.core.MibiData$Mibi$$serializer();
        INSTANCE = mibiData$Mibi$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.Mibi", mibiData$Mibi$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_MIBI_VERSION, false);
        pluginGeneratedSerialDescriptor.addElement("Platform", false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_DEVICE_INFO, false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_SDK_INFO, false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_PLATFORM_PRIVATE, false);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.MibiData.KEY_SESSION_INFO, false);
        Camera2StreamConfigurationMap = pluginGeneratedSerialDescriptor;
    }
}
