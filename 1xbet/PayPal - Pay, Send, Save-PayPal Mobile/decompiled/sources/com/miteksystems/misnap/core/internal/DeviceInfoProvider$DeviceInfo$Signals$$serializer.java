package com.miteksystems.misnap.core.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider$DeviceInfo$Signals;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class DeviceInfoProvider$DeviceInfo$Signals$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals> {
    public static final com.miteksystems.misnap.core.internal.DeviceInfoProvider$DeviceInfo$Signals$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoSizes;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i;
        java.lang.String str5;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor, 1);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(descriptor, 2);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(descriptor, 3);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(descriptor, 4);
            str3 = decodeStringElement;
            str = beginStructure.decodeStringElement(descriptor, 5);
            str4 = decodeStringElement3;
            str2 = decodeStringElement4;
            str5 = decodeStringElement2;
            i2 = decodeIntElement;
            i = 63;
        } else {
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            boolean z = true;
            int i3 = 0;
            int i4 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str6 = beginStructure.decodeStringElement(descriptor, 0);
                        i4 |= 1;
                        continue;
                    case 1:
                        i3 = beginStructure.decodeIntElement(descriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        str10 = beginStructure.decodeStringElement(descriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        str8 = beginStructure.decodeStringElement(descriptor, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        str9 = beginStructure.decodeStringElement(descriptor, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        str7 = beginStructure.decodeStringElement(descriptor, 5);
                        i4 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str7;
            str2 = str9;
            str3 = str6;
            int i5 = i4;
            str4 = str8;
            i = i5;
            int i6 = i3;
            str5 = str10;
            i2 = i6;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals(i, str3, i2, str5, str4, str2, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals.a(value, beginStructure, descriptor);
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
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    private DeviceInfoProvider$DeviceInfo$Signals$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.internal.DeviceInfoProvider$DeviceInfo$Signals$$serializer deviceInfoProvider$DeviceInfo$Signals$$serializer = new com.miteksystems.misnap.core.internal.DeviceInfoProvider$DeviceInfo$Signals$$serializer();
        INSTANCE = deviceInfoProvider$DeviceInfo$Signals$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.internal.DeviceInfoProvider.DeviceInfo.Signals", deviceInfoProvider$DeviceInfo$Signals$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("osVersion", false);
        pluginGeneratedSerialDescriptor.addElement("sdkLevel", false);
        pluginGeneratedSerialDescriptor.addElement("timeZone", false);
        pluginGeneratedSerialDescriptor.addElement("device", false);
        pluginGeneratedSerialDescriptor.addElement("manufacturer", false);
        pluginGeneratedSerialDescriptor.addElement("model", false);
        getHighSpeedVideoSizes = pluginGeneratedSerialDescriptor;
    }
}
