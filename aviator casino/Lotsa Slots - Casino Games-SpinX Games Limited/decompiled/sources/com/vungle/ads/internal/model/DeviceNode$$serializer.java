package com.vungle.ads.internal.model;

/* compiled from: DeviceNode.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes6.dex */
public final class DeviceNode$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.vungle.ads.internal.model.DeviceNode> {
    public static final com.vungle.ads.internal.model.DeviceNode$$serializer INSTANCE;
    public static final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        com.vungle.ads.internal.model.DeviceNode$$serializer deviceNode$$serializer = new com.vungle.ads.internal.model.DeviceNode$$serializer();
        INSTANCE = deviceNode$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode", deviceNode$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement(com.ironsource.M6.t, false);
        pluginGeneratedSerialDescriptor.addElement("model", false);
        pluginGeneratedSerialDescriptor.addElement("osv", false);
        pluginGeneratedSerialDescriptor.addElement(com.ironsource.M6.R0, true);
        pluginGeneratedSerialDescriptor.addElement(com.ironsource.M6.F, false);
        pluginGeneratedSerialDescriptor.addElement("w", false);
        pluginGeneratedSerialDescriptor.addElement(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, false);
        pluginGeneratedSerialDescriptor.addElement(com.ironsource.M6.d0, true);
        pluginGeneratedSerialDescriptor.addElement("ifa", true);
        pluginGeneratedSerialDescriptor.addElement("lmt", true);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeviceNode$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.DeviceNode$VungleExt$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public com.vungle.ads.internal.model.DeviceNode deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int i;
        java.lang.String str2;
        java.lang.String str3;
        int i2;
        int i3;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i4 = 10;
        int i5 = 9;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 2);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 4);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 5);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 6);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, com.vungle.ads.internal.model.DeviceNode$VungleExt$$serializer.INSTANCE, null);
            i2 = decodeIntElement2;
            i3 = decodeIntElement;
            str4 = decodeStringElement4;
            str = decodeStringElement2;
            str2 = decodeStringElement;
            str3 = decodeStringElement3;
            obj = decodeNullableSerializableElement;
            i = 2047;
        } else {
            java.lang.Object obj6 = null;
            java.lang.Object obj7 = null;
            obj = null;
            java.lang.Object obj8 = null;
            java.lang.Object obj9 = null;
            java.lang.String str5 = null;
            str = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        i4 = 10;
                        z = false;
                    case 0:
                        str5 = beginStructure.decodeStringElement(descriptor2, 0);
                        i8 |= 1;
                        i4 = 10;
                        i5 = 9;
                    case 1:
                        str = beginStructure.decodeStringElement(descriptor2, 1);
                        i8 |= 2;
                        i4 = 10;
                        i5 = 9;
                    case 2:
                        str6 = beginStructure.decodeStringElement(descriptor2, 2);
                        i8 |= 4;
                        i4 = 10;
                        i5 = 9;
                    case 3:
                        obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj9);
                        i8 |= 8;
                        i4 = 10;
                        i5 = 9;
                    case 4:
                        str7 = beginStructure.decodeStringElement(descriptor2, 4);
                        i8 |= 16;
                        i4 = 10;
                    case 5:
                        i7 = beginStructure.decodeIntElement(descriptor2, 5);
                        i8 |= 32;
                    case 6:
                        i6 = beginStructure.decodeIntElement(descriptor2, 6);
                        i8 |= 64;
                    case 7:
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj8);
                        i8 |= 128;
                    case 8:
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj);
                        i8 |= 256;
                    case 9:
                        obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, i5, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj6);
                        i8 |= 512;
                    case 10:
                        obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, i4, com.vungle.ads.internal.model.DeviceNode$VungleExt$$serializer.INSTANCE, obj7);
                        i8 |= 1024;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
            obj5 = obj9;
            i = i8;
            str2 = str5;
            str3 = str6;
            i2 = i6;
            i3 = i7;
            str4 = str7;
        }
        beginStructure.endStructure(descriptor2);
        return new com.vungle.ads.internal.model.DeviceNode(i, str2, str, str3, (java.lang.String) obj5, str4, i3, i2, (java.lang.String) obj4, (java.lang.String) obj, (java.lang.Integer) obj2, (com.vungle.ads.internal.model.DeviceNode.VungleExt) obj3, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.vungle.ads.internal.model.DeviceNode value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.vungle.ads.internal.model.DeviceNode.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
