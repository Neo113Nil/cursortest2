package com.moloco.sdk.publisher.bidrequest;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0007R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/moloco/sdk/publisher/bidrequest/Geo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class Geo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.moloco.sdk.publisher.bidrequest.Geo> {
    public static final int $stable;
    public static final com.moloco.sdk.publisher.bidrequest.Geo$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.moloco.sdk.publisher.bidrequest.Geo$$serializer geo$$serializer = new com.moloco.sdk.publisher.bidrequest.Geo$$serializer();
        INSTANCE = geo$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.moloco.sdk.publisher.bidrequest.Geo", geo$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("city", false);
        pluginGeneratedSerialDescriptor.addElement("country", false);
        pluginGeneratedSerialDescriptor.addElement("region", false);
        pluginGeneratedSerialDescriptor.addElement(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.KEY_ZIPCODE, false);
        pluginGeneratedSerialDescriptor.addElement("latitude", false);
        pluginGeneratedSerialDescriptor.addElement("longitude", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Geo$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        kotlinx.serialization.KSerializer<?> nullable = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer);
        kotlinx.serialization.KSerializer<?> nullable2 = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer);
        kotlinx.serialization.KSerializer<?> nullable3 = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer);
        kotlinx.serialization.KSerializer<?> nullable4 = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer);
        kotlinx.serialization.internal.FloatSerializer floatSerializer = kotlinx.serialization.internal.FloatSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{nullable, nullable2, nullable3, nullable4, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(floatSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.moloco.sdk.publisher.bidrequest.Geo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Float f;
        java.lang.Float f2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        java.lang.String str5 = null;
        if (beginStructure.decodeSequentially()) {
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            kotlinx.serialization.internal.FloatSerializer floatSerializer = kotlinx.serialization.internal.FloatSerializer.INSTANCE;
            java.lang.Float f3 = (java.lang.Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, floatSerializer, null);
            str2 = str9;
            f2 = (java.lang.Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, floatSerializer, null);
            f = f3;
            str = str8;
            str4 = str7;
            str3 = str6;
            i = 63;
        } else {
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.Float f4 = null;
            java.lang.Float f5 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        i2 = 5;
                        z = false;
                        continue;
                    case 0:
                        str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                        i3 |= 1;
                        i2 = 5;
                        break;
                    case 1:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i3 |= 2;
                        break;
                    case 2:
                        str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str11);
                        i3 |= 4;
                        break;
                    case 3:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i3 |= 8;
                        break;
                    case 4:
                        f4 = (java.lang.Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.FloatSerializer.INSTANCE, f4);
                        i3 |= 16;
                        break;
                    case 5:
                        f5 = (java.lang.Float) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.FloatSerializer.INSTANCE, f5);
                        i3 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            f = f4;
            f2 = f5;
            str = str11;
            str2 = str12;
            str3 = str5;
            str4 = str10;
            i = i3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.moloco.sdk.publisher.bidrequest.Geo(i, str3, str4, str, str2, f, f2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.moloco.sdk.publisher.bidrequest.Geo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.moloco.sdk.publisher.bidrequest.Geo.write$Self$moloco_sdk_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.CC.$default$typeParametersSerializers(this);
    }
}
