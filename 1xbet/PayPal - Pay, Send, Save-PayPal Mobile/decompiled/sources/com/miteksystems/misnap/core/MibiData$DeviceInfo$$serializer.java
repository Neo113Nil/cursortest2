package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/MibiData$DeviceInfo$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/MibiData$DeviceInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/MibiData$DeviceInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/MibiData$DeviceInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes.dex */
public final class MibiData$DeviceInfo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.MibiData.DeviceInfo> {
    public static final com.miteksystems.misnap.core.MibiData$DeviceInfo$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoFpsRanges;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.MibiData.DeviceInfo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(descriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(descriptor, 2);
            str = decodeStringElement;
            str2 = beginStructure.decodeStringElement(descriptor, 3);
            str3 = beginStructure.decodeStringElement(descriptor, 4);
            str4 = decodeStringElement3;
            str5 = decodeStringElement2;
            i = 31;
        } else {
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str6 = beginStructure.decodeStringElement(descriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str10 = beginStructure.decodeStringElement(descriptor, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    str9 = beginStructure.decodeStringElement(descriptor, 2);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    str7 = beginStructure.decodeStringElement(descriptor, 3);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    str8 = beginStructure.decodeStringElement(descriptor, 4);
                    i2 |= 16;
                }
            }
            str = str6;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            str5 = str10;
            i = i2;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.MibiData.DeviceInfo(i, str, str5, str4, str2, str3, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.MibiData.DeviceInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.MibiData.DeviceInfo.write$Self(value, beginStructure, descriptor);
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
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    private MibiData$DeviceInfo$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.MibiData$DeviceInfo$$serializer mibiData$DeviceInfo$$serializer = new com.miteksystems.misnap.core.MibiData$DeviceInfo$$serializer();
        INSTANCE = mibiData$DeviceInfo$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.MibiData.DeviceInfo", mibiData$DeviceInfo$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("Manufacturer", false);
        pluginGeneratedSerialDescriptor.addElement("Device", false);
        pluginGeneratedSerialDescriptor.addElement(androidx.exifinterface.media.ExifInterface.TAG_MODEL, false);
        pluginGeneratedSerialDescriptor.addElement("OS", false);
        pluginGeneratedSerialDescriptor.addElement("ID", false);
        getHighSpeedVideoFpsRanges = pluginGeneratedSerialDescriptor;
    }
}
