package com.paypal.oslo.feature.verificationcapture.api.models;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/models/CaptureSessionInfo$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/CaptureSessionInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/verificationcapture/api/models/CaptureSessionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/verificationcapture/api/models/CaptureSessionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CaptureSessionInfo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo$$serializer captureSessionInfo$$serializer = new com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo$$serializer();
        INSTANCE = captureSessionInfo$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo", captureSessionInfo$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("sessionId", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("documentsUploaded", true);
        pluginGeneratedSerialDescriptor.addElement("livenessCompleted", true);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private CaptureSessionInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, lazyArr[4].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        boolean z;
        int i;
        int i2;
        com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus sessionStatus;
        java.util.Map map;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus sessionStatus2 = (com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 2);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 3);
            map = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            str = decodeStringElement;
            z = decodeBooleanElement;
            i = decodeIntElement;
            i2 = 31;
            sessionStatus = sessionStatus2;
        } else {
            com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus sessionStatus3 = null;
            java.util.Map map2 = null;
            java.lang.String str2 = null;
            boolean z2 = false;
            int i3 = 0;
            int i4 = 0;
            boolean z3 = true;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z3 = false;
                } else if (decodeElementIndex == 0) {
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i4 |= 1;
                } else if (decodeElementIndex == 1) {
                    sessionStatus3 = (com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), sessionStatus3);
                    i4 |= 2;
                } else if (decodeElementIndex == 2) {
                    i3 = beginStructure.decodeIntElement(serialDescriptor, 2);
                    i4 |= 4;
                } else if (decodeElementIndex == 3) {
                    z2 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i4 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    map2 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), map2);
                    i4 |= 16;
                }
            }
            z = z2;
            i = i3;
            i2 = i4;
            sessionStatus = sessionStatus3;
            map = map2;
            str = str2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo(i2, str, sessionStatus, i, z, map, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo.write$Self$verification_capture_api_prodRelease(value, beginStructure, serialDescriptor);
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
