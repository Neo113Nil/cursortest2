package com.vungle.ads.internal.network;

/* compiled from: TpatSender.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/network/FailedTpat.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/network/FailedTpat;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes6.dex */
public final class FailedTpat$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.vungle.ads.internal.network.FailedTpat> {
    public static final com.vungle.ads.internal.network.FailedTpat$$serializer INSTANCE;
    public static final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        com.vungle.ads.internal.network.FailedTpat$$serializer failedTpat$$serializer = new com.vungle.ads.internal.network.FailedTpat$$serializer();
        INSTANCE = failedTpat$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.vungle.ads.internal.network.FailedTpat", failedTpat$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("method", true);
        pluginGeneratedSerialDescriptor.addElement("headers", true);
        pluginGeneratedSerialDescriptor.addElement("body", true);
        pluginGeneratedSerialDescriptor.addElement("retryAttempt", true);
        pluginGeneratedSerialDescriptor.addElement("retryCount", false);
        pluginGeneratedSerialDescriptor.addElement("tpatKey", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FailedTpat$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.vungle.ads.internal.network.HttpMethod$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE)), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public com.vungle.ads.internal.network.FailedTpat deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i2;
        int i3;
        java.lang.Object obj4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i4 = 5;
        int i5 = 3;
        if (beginStructure.decodeSequentially()) {
            obj4 = beginStructure.decodeSerializableElement(descriptor2, 0, com.vungle.ads.internal.network.HttpMethod$$serializer.INSTANCE, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 3);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 4);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            i3 = decodeIntElement;
            i2 = decodeIntElement2;
            i = 63;
        } else {
            java.lang.Object obj5 = null;
            java.lang.Object obj6 = null;
            java.lang.Object obj7 = null;
            java.lang.Object obj8 = null;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        i5 = 3;
                        z = false;
                    case 0:
                        obj5 = beginStructure.decodeSerializableElement(descriptor2, 0, com.vungle.ads.internal.network.HttpMethod$$serializer.INSTANCE, obj5);
                        i8 |= 1;
                        i4 = 5;
                        i5 = 3;
                    case 1:
                        obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE), obj6);
                        i8 |= 2;
                        i4 = 5;
                        i5 = 3;
                    case 2:
                        obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj7);
                        i8 |= 4;
                    case 3:
                        i6 = beginStructure.decodeIntElement(descriptor2, i5);
                        i8 |= 8;
                    case 4:
                        i7 = beginStructure.decodeIntElement(descriptor2, 4);
                        i8 |= 16;
                    case 5:
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj8);
                        i8 |= 32;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i8;
            obj = obj6;
            obj2 = obj7;
            obj3 = obj8;
            i2 = i7;
            i3 = i6;
            obj4 = obj5;
        }
        beginStructure.endStructure(descriptor2);
        return new com.vungle.ads.internal.network.FailedTpat(i, (com.vungle.ads.internal.network.HttpMethod) obj4, (java.util.Map) obj, (java.lang.String) obj2, i3, i2, (java.lang.String) obj3, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.vungle.ads.internal.network.FailedTpat value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.vungle.ads.internal.network.FailedTpat.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
