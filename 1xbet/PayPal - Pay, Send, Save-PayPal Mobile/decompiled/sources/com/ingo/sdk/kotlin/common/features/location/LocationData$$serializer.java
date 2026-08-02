package com.ingo.sdk.kotlin.common.features.location;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/location/LocationData$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/ingo/sdk/kotlin/common/features/location/LocationData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingo/sdk/kotlin/common/features/location/LocationData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingo/sdk/kotlin/common/features/location/LocationData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes.dex */
public final /* synthetic */ class LocationData$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.ingo.sdk.kotlin.common.features.location.LocationData> {
    public static final com.ingo.sdk.kotlin.common.features.location.LocationData$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.ingo.sdk.kotlin.common.features.location.LocationData$$serializer locationData$$serializer = new com.ingo.sdk.kotlin.common.features.location.LocationData$$serializer();
        INSTANCE = locationData$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.ingo.sdk.kotlin.common.features.location.LocationData", locationData$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("latitude", false);
        pluginGeneratedSerialDescriptor.addElement("longitude", false);
        pluginGeneratedSerialDescriptor.addElement("horizontalAccuracy", false);
        pluginGeneratedSerialDescriptor.addElement("verticalAccuracy", false);
        pluginGeneratedSerialDescriptor.addElement("altitude", false);
        pluginGeneratedSerialDescriptor.addElement("bearing", false);
        pluginGeneratedSerialDescriptor.addElement(androidx.core.location.LocationCompat.EXTRA_BEARING_ACCURACY, false);
        pluginGeneratedSerialDescriptor.addElement("speed", false);
        pluginGeneratedSerialDescriptor.addElement(androidx.core.location.LocationCompat.EXTRA_SPEED_ACCURACY, false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.DoubleSerializer.INSTANCE, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.LongSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.ingo.sdk.kotlin.common.features.location.LocationData deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        long j;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        double d;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        double d2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            double decodeDoubleElement = beginStructure.decodeDoubleElement(serialDescriptor, 0);
            double decodeDoubleElement2 = beginStructure.decodeDoubleElement(serialDescriptor, 1);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 6);
            str2 = decodeStringElement;
            str3 = beginStructure.decodeStringElement(serialDescriptor, 7);
            str4 = decodeStringElement5;
            str5 = decodeStringElement4;
            str7 = decodeStringElement2;
            str = beginStructure.decodeStringElement(serialDescriptor, 8);
            str6 = decodeStringElement3;
            j = beginStructure.decodeLongElement(serialDescriptor, 9);
            d2 = decodeDoubleElement2;
            d = decodeDoubleElement;
            i = 1023;
        } else {
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            boolean z = true;
            double d3 = 0.0d;
            double d4 = 0.0d;
            long j2 = 0;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            i = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        d4 = beginStructure.decodeDoubleElement(serialDescriptor, 0);
                        i |= 1;
                        continue;
                    case 1:
                        d3 = beginStructure.decodeDoubleElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        str14 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        break;
                    case 8:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        break;
                    case 9:
                        j2 = beginStructure.decodeLongElement(serialDescriptor, 9);
                        i |= 512;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            j = j2;
            str = str10;
            str2 = str8;
            double d5 = d4;
            str3 = str12;
            str4 = str13;
            d = d5;
            double d6 = d3;
            str5 = str14;
            str6 = str11;
            str7 = str9;
            d2 = d6;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.ingo.sdk.kotlin.common.features.location.LocationData(i, d, d2, str2, str7, str6, str5, str4, str3, str, j, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.ingo.sdk.kotlin.common.features.location.LocationData value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.ingo.sdk.kotlin.common.features.location.LocationData.write$Self$ingoCore_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private LocationData$$serializer() {
    }
}
