package com.vungle.ads.internal.model;

/* compiled from: CommonRequestBody.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.RequestParam.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes6.dex */
public final class CommonRequestBody$RequestParam$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.vungle.ads.internal.model.CommonRequestBody.RequestParam> {
    public static final com.vungle.ads.internal.model.CommonRequestBody$RequestParam$$serializer INSTANCE;
    public static final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        com.vungle.ads.internal.model.CommonRequestBody$RequestParam$$serializer commonRequestBody$RequestParam$$serializer = new com.vungle.ads.internal.model.CommonRequestBody$RequestParam$$serializer();
        INSTANCE = commonRequestBody$RequestParam$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", commonRequestBody$RequestParam$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement(com.ironsource.C3225pd.c, true);
        pluginGeneratedSerialDescriptor.addElement("ad_size", true);
        pluginGeneratedSerialDescriptor.addElement("ad_start_time", true);
        pluginGeneratedSerialDescriptor.addElement("app_id", true);
        pluginGeneratedSerialDescriptor.addElement("placement_reference_id", true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement("csb", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommonRequestBody$RequestParam$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE)), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.CommonRequestBody$AdSizeParam$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.LongSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.CommonRequestBody$CSBParam$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public com.vungle.ads.internal.model.CommonRequestBody.RequestParam deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        int i;
        java.lang.Object obj7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i2 = 6;
        java.lang.Object obj8 = null;
        if (beginStructure.decodeSequentially()) {
            obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, com.vungle.ads.internal.model.CommonRequestBody$AdSizeParam$$serializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, kotlinx.serialization.internal.LongSerializer.INSTANCE, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 6, com.vungle.ads.internal.model.CommonRequestBody$CSBParam$$serializer.INSTANCE, null);
            i = 127;
        } else {
            java.lang.Object obj9 = null;
            java.lang.Object obj10 = null;
            java.lang.Object obj11 = null;
            java.lang.Object obj12 = null;
            java.lang.Object obj13 = null;
            java.lang.Object obj14 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        i2 = 6;
                        z = false;
                    case 0:
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), obj8);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        obj10 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, com.vungle.ads.internal.model.CommonRequestBody$AdSizeParam$$serializer.INSTANCE, obj10);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        obj11 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, kotlinx.serialization.internal.LongSerializer.INSTANCE, obj11);
                        i3 |= 4;
                    case 3:
                        obj12 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj12);
                        i3 |= 8;
                    case 4:
                        obj13 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj13);
                        i3 |= 16;
                    case 5:
                        obj14 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj14);
                        i3 |= 32;
                    case 6:
                        obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, i2, com.vungle.ads.internal.model.CommonRequestBody$CSBParam$$serializer.INSTANCE, obj9);
                        i3 |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj = obj9;
            obj2 = obj10;
            obj3 = obj11;
            obj4 = obj12;
            obj5 = obj13;
            obj6 = obj14;
            java.lang.Object obj15 = obj8;
            i = i3;
            obj7 = obj15;
        }
        beginStructure.endStructure(descriptor2);
        return new com.vungle.ads.internal.model.CommonRequestBody.RequestParam(i, (java.util.List) obj7, (com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam) obj2, (java.lang.Long) obj3, (java.lang.String) obj4, (java.lang.String) obj5, (java.lang.String) obj6, (com.vungle.ads.internal.model.CommonRequestBody.CSBParam) obj, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.vungle.ads.internal.model.CommonRequestBody.RequestParam value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.vungle.ads.internal.model.CommonRequestBody.RequestParam.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
