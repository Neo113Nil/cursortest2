package com.paypal.oslo.feature.verificationcapture.api.models;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationResult$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationResult;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationResult;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationResult;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class VerificationResult$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult$$serializer verificationResult$$serializer = new com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult$$serializer();
        INSTANCE = verificationResult$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult", verificationResult$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("documentId", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("qualityScore", true);
        pluginGeneratedSerialDescriptor.addElement("verifiedAt", true);
        pluginGeneratedSerialDescriptor.addElement("extractedData", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private VerificationResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.FloatSerializer.INSTANCE, kotlinx.serialization.internal.LongSerializer.INSTANCE, lazyArr[4].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        float f;
        com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus verificationStatus;
        java.util.Map map;
        java.lang.String str;
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus verificationStatus2 = (com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            float decodeFloatElement = beginStructure.decodeFloatElement(serialDescriptor, 2);
            long decodeLongElement = beginStructure.decodeLongElement(serialDescriptor, 3);
            map = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            str = decodeStringElement;
            i = 31;
            f = decodeFloatElement;
            verificationStatus = verificationStatus2;
            j = decodeLongElement;
        } else {
            java.lang.String str2 = null;
            boolean z = true;
            long j2 = 0;
            float f2 = 0.0f;
            int i2 = 0;
            com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus verificationStatus3 = null;
            java.util.Map map2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    verificationStatus3 = (com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), verificationStatus3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    f2 = beginStructure.decodeFloatElement(serialDescriptor, 2);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    j2 = beginStructure.decodeLongElement(serialDescriptor, 3);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    map2 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), map2);
                    i2 |= 16;
                }
            }
            i = i2;
            f = f2;
            verificationStatus = verificationStatus3;
            map = map2;
            str = str2;
            j = j2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult(i, str, verificationStatus, f, j, map, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult.write$Self$verification_capture_api_prodRelease(value, beginStructure, serialDescriptor);
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
