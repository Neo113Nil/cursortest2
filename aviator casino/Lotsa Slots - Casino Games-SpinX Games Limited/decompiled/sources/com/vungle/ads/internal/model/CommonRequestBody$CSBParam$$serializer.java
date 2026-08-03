package com.vungle.ads.internal.model;

/* compiled from: CommonRequestBody.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.CSBParam.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/CommonRequestBody$CSBParam;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes6.dex */
public final class CommonRequestBody$CSBParam$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.vungle.ads.internal.model.CommonRequestBody.CSBParam> {
    public static final com.vungle.ads.internal.model.CommonRequestBody$CSBParam$$serializer INSTANCE;
    public static final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        com.vungle.ads.internal.model.CommonRequestBody$CSBParam$$serializer commonRequestBody$CSBParam$$serializer = new com.vungle.ads.internal.model.CommonRequestBody$CSBParam$$serializer();
        INSTANCE = commonRequestBody$CSBParam$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.CSBParam", commonRequestBody$CSBParam$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("bidfloor", false);
        pluginGeneratedSerialDescriptor.addElement("phase", false);
        pluginGeneratedSerialDescriptor.addElement("is_vx_winner", false);
        pluginGeneratedSerialDescriptor.addElement("parent_auction_id", false);
        pluginGeneratedSerialDescriptor.addElement("creative_id", false);
        pluginGeneratedSerialDescriptor.addElement(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, false);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CommonRequestBody$CSBParam$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.DoubleSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public com.vungle.ads.internal.model.CommonRequestBody.CSBParam deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        java.lang.String str;
        java.lang.Object obj;
        int i2;
        boolean z;
        java.lang.String str2;
        java.lang.String str3;
        double d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            double decodeDoubleElement = beginStructure.decodeDoubleElement(descriptor2, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 1);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 2);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 3);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 4);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 5);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            i2 = decodeIntElement;
            str = decodeStringElement3;
            str2 = decodeStringElement;
            str3 = decodeStringElement2;
            z = decodeBooleanElement;
            d = decodeDoubleElement;
            i = 127;
        } else {
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.Object obj2 = null;
            double d2 = 0.0d;
            int i3 = 0;
            i = 0;
            boolean z2 = true;
            java.lang.String str6 = null;
            boolean z3 = false;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        d2 = beginStructure.decodeDoubleElement(descriptor2, 0);
                        i |= 1;
                        continue;
                    case 1:
                        i3 = beginStructure.decodeIntElement(descriptor2, 1);
                        i |= 2;
                        break;
                    case 2:
                        z3 = beginStructure.decodeBooleanElement(descriptor2, 2);
                        i |= 4;
                        break;
                    case 3:
                        str6 = beginStructure.decodeStringElement(descriptor2, 3);
                        i |= 8;
                        break;
                    case 4:
                        str4 = beginStructure.decodeStringElement(descriptor2, 4);
                        i |= 16;
                        break;
                    case 5:
                        str5 = beginStructure.decodeStringElement(descriptor2, 5);
                        i |= 32;
                        break;
                    case 6:
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj2);
                        i |= 64;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str5;
            obj = obj2;
            i2 = i3;
            z = z3;
            double d3 = d2;
            str2 = str6;
            str3 = str4;
            d = d3;
        }
        beginStructure.endStructure(descriptor2);
        return new com.vungle.ads.internal.model.CommonRequestBody.CSBParam(i, d, i2, z, str2, str3, str, (java.lang.String) obj, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.vungle.ads.internal.model.CommonRequestBody.CSBParam value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.vungle.ads.internal.model.CommonRequestBody.CSBParam.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
