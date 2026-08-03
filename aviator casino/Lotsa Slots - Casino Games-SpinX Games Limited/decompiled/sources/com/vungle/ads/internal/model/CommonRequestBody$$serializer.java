package com.vungle.ads.internal.model;

/* compiled from: CommonRequestBody.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes6.dex */
public final class CommonRequestBody$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.vungle.ads.internal.model.CommonRequestBody> {
    public static final com.vungle.ads.internal.model.CommonRequestBody$$serializer INSTANCE;
    public static final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        com.vungle.ads.internal.model.CommonRequestBody$$serializer commonRequestBody$$serializer = new com.vungle.ads.internal.model.CommonRequestBody$$serializer();
        INSTANCE = commonRequestBody$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody", commonRequestBody$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("device", false);
        pluginGeneratedSerialDescriptor.addElement("app", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        pluginGeneratedSerialDescriptor.addElement("request", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommonRequestBody$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.vungle.ads.internal.model.DeviceNode$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.AppNode$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.CommonRequestBody$User$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.CommonRequestBody$RequestExt$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.CommonRequestBody$RequestParam$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public com.vungle.ads.internal.model.CommonRequestBody deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i;
        java.lang.Object obj5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        java.lang.Object obj6 = null;
        if (beginStructure.decodeSequentially()) {
            obj5 = beginStructure.decodeSerializableElement(descriptor2, 0, com.vungle.ads.internal.model.DeviceNode$$serializer.INSTANCE, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, com.vungle.ads.internal.model.AppNode$$serializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, com.vungle.ads.internal.model.CommonRequestBody$User$$serializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, com.vungle.ads.internal.model.CommonRequestBody$RequestExt$$serializer.INSTANCE, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, com.vungle.ads.internal.model.CommonRequestBody$RequestParam$$serializer.INSTANCE, null);
            i = 31;
        } else {
            java.lang.Object obj7 = null;
            java.lang.Object obj8 = null;
            java.lang.Object obj9 = null;
            java.lang.Object obj10 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj6 = beginStructure.decodeSerializableElement(descriptor2, 0, com.vungle.ads.internal.model.DeviceNode$$serializer.INSTANCE, obj6);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, com.vungle.ads.internal.model.AppNode$$serializer.INSTANCE, obj7);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, com.vungle.ads.internal.model.CommonRequestBody$User$$serializer.INSTANCE, obj8);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, com.vungle.ads.internal.model.CommonRequestBody$RequestExt$$serializer.INSTANCE, obj9);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    obj10 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, com.vungle.ads.internal.model.CommonRequestBody$RequestParam$$serializer.INSTANCE, obj10);
                    i2 |= 16;
                }
            }
            obj = obj7;
            obj2 = obj8;
            obj3 = obj9;
            obj4 = obj10;
            java.lang.Object obj11 = obj6;
            i = i2;
            obj5 = obj11;
        }
        beginStructure.endStructure(descriptor2);
        return new com.vungle.ads.internal.model.CommonRequestBody(i, (com.vungle.ads.internal.model.DeviceNode) obj5, (com.vungle.ads.internal.model.AppNode) obj, (com.vungle.ads.internal.model.CommonRequestBody.User) obj2, (com.vungle.ads.internal.model.CommonRequestBody.RequestExt) obj3, (com.vungle.ads.internal.model.CommonRequestBody.RequestParam) obj4, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.vungle.ads.internal.model.CommonRequestBody value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.vungle.ads.internal.model.CommonRequestBody.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
