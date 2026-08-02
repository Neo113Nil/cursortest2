package com.paypal.oslo.feature.verificationcapture.navigation.result;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Success$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Success;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Success;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Success;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DaonFaceLivenessNavResult$Success$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Success$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Success$$serializer daonFaceLivenessNavResult$Success$$serializer = new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Success$$serializer();
        INSTANCE = daonFaceLivenessNavResult$Success$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success", daonFaceLivenessNavResult$Success$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("faceImageBytes", false);
        pluginGeneratedSerialDescriptor.addElement("activeLivenessScore", false);
        pluginGeneratedSerialDescriptor.addElement("qualityScore", false);
        pluginGeneratedSerialDescriptor.addElement("eyeOpenScore", false);
        pluginGeneratedSerialDescriptor.addElement("effortTimeSeconds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DaonFaceLivenessNavResult$Success$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, kotlinx.serialization.internal.FloatSerializer.INSTANCE, kotlinx.serialization.internal.FloatSerializer.INSTANCE, kotlinx.serialization.internal.FloatSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        byte[] bArr;
        float f;
        float f2;
        int i;
        float f3;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            byte[] bArr2 = (byte[]) beginStructure.decodeSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, null);
            float decodeFloatElement = beginStructure.decodeFloatElement(serialDescriptor, 1);
            float decodeFloatElement2 = beginStructure.decodeFloatElement(serialDescriptor, 2);
            bArr = bArr2;
            f = decodeFloatElement;
            f2 = beginStructure.decodeFloatElement(serialDescriptor, 3);
            i = beginStructure.decodeIntElement(serialDescriptor, 4);
            f3 = decodeFloatElement2;
            i2 = 31;
        } else {
            float f4 = 0.0f;
            float f5 = 0.0f;
            int i3 = 0;
            int i4 = 0;
            boolean z = true;
            byte[] bArr3 = null;
            float f6 = 0.0f;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    bArr3 = (byte[]) beginStructure.decodeSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, bArr3);
                    i4 |= 1;
                } else if (decodeElementIndex == 1) {
                    f6 = beginStructure.decodeFloatElement(serialDescriptor, 1);
                    i4 |= 2;
                } else if (decodeElementIndex == 2) {
                    f5 = beginStructure.decodeFloatElement(serialDescriptor, 2);
                    i4 |= 4;
                } else if (decodeElementIndex == 3) {
                    f4 = beginStructure.decodeFloatElement(serialDescriptor, 3);
                    i4 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    i3 = beginStructure.decodeIntElement(serialDescriptor, 4);
                    i4 |= 16;
                }
            }
            bArr = bArr3;
            f = f6;
            f2 = f4;
            i = i3;
            f3 = f5;
            i2 = i4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success(i2, bArr, f, f3, f2, i, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success.write$Self$verification_capture_prodRelease(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }
}
