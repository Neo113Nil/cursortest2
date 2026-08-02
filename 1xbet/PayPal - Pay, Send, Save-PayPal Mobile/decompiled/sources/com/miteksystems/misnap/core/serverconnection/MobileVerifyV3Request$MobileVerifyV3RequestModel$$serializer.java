package com.miteksystems.misnap.core.serverconnection;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class MobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel> {
    public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor getHighSpeedVideoSizes;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i;
        java.lang.Object obj4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        java.lang.Object obj5 = null;
        if (beginStructure.decodeSequentially()) {
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj3 = beginStructure.decodeSerializableElement(descriptor, 2, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage$$serializer.INSTANCE), null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor, 3, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer.INSTANCE), null);
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.Object obj6 = null;
            java.lang.Object obj7 = null;
            java.lang.Object obj8 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj8);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    obj6 = beginStructure.decodeNullableSerializableElement(descriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj6);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    obj7 = beginStructure.decodeSerializableElement(descriptor, 2, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage$$serializer.INSTANCE), obj7);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 3, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer.INSTANCE), obj5);
                    i2 |= 8;
                }
            }
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            i = i2;
            obj4 = obj8;
        }
        beginStructure.endStructure(descriptor);
        return new com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel(i, (java.lang.String) obj4, (java.lang.String) obj2, (java.util.List) obj3, (java.util.List) obj, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.a(value, beginStructure, descriptor);
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
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer.INSTANCE))};
    }

    private MobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer() {
    }

    static {
        com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer mobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer();
        INSTANCE = mobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel", mobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.TRANSACTION_REQUEST_KEY, true);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.CUSTOMER_REFERENCE_ID_KEY, true);
        pluginGeneratedSerialDescriptor.addElement(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.IMAGES_KEY, false);
        pluginGeneratedSerialDescriptor.addElement("deviceExtractedData", true);
        getHighSpeedVideoSizes = pluginGeneratedSerialDescriptor;
    }
}
