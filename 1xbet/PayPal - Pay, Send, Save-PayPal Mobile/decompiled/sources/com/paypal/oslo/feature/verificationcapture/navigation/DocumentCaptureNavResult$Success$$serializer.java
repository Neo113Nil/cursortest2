package com.paypal.oslo.feature.verificationcapture.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DocumentCaptureNavResult$Success$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Success$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Success$$serializer documentCaptureNavResult$Success$$serializer = new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Success$$serializer();
        INSTANCE = documentCaptureNavResult$Success$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success", documentCaptureNavResult$Success$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("imageBytes", false);
        pluginGeneratedSerialDescriptor.addElement("documentType", false);
        pluginGeneratedSerialDescriptor.addElement("documentSide", false);
        pluginGeneratedSerialDescriptor.addElement("documentDetectionScore", false);
        pluginGeneratedSerialDescriptor.addElement("captureTimeSeconds", false);
        pluginGeneratedSerialDescriptor.addElement("documentId", true);
        pluginGeneratedSerialDescriptor.addElement("verificationPlatformId", true);
        pluginGeneratedSerialDescriptor.addElement(com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, true);
        pluginGeneratedSerialDescriptor.addElement("extractedData", true);
        pluginGeneratedSerialDescriptor.addElement("metaData", true);
        pluginGeneratedSerialDescriptor.addElement("isManualCapture", true);
        pluginGeneratedSerialDescriptor.addElement("retryCount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DocumentCaptureNavResult$Success$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.FloatSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        byte[] bArr;
        java.lang.String str;
        boolean z;
        float f;
        int i2;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i3;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 11;
        int i5 = 10;
        int i6 = 9;
        if (beginStructure.decodeSequentially()) {
            byte[] bArr2 = (byte[]) beginStructure.decodeSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            str4 = beginStructure.decodeStringElement(serialDescriptor, 2);
            float decodeFloatElement = beginStructure.decodeFloatElement(serialDescriptor, 3);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 4);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 10);
            i = beginStructure.decodeIntElement(serialDescriptor, 11);
            z = decodeBooleanElement;
            str = str12;
            str3 = str10;
            str2 = str9;
            str5 = str8;
            str7 = str11;
            bArr = bArr2;
            f = decodeFloatElement;
            i3 = 4095;
            i2 = decodeIntElement;
            str6 = decodeStringElement;
        } else {
            float f2 = 0.0f;
            boolean z2 = true;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            java.lang.String str16 = null;
            java.lang.String str17 = null;
            java.lang.String str18 = null;
            byte[] bArr3 = null;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            boolean z3 = false;
            java.lang.String str19 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        i5 = 10;
                        i6 = 9;
                    case 0:
                        bArr3 = (byte[]) beginStructure.decodeSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, bArr3);
                        i8 |= 1;
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                    case 1:
                        str17 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i8 |= 2;
                        i4 = 11;
                    case 2:
                        str18 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i8 |= 4;
                        i4 = 11;
                    case 3:
                        f2 = beginStructure.decodeFloatElement(serialDescriptor, 3);
                        i8 |= 8;
                        i4 = 11;
                    case 4:
                        i9 = beginStructure.decodeIntElement(serialDescriptor, 4);
                        i8 |= 16;
                        i4 = 11;
                    case 5:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i8 |= 32;
                        i4 = 11;
                    case 6:
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i8 |= 64;
                        i4 = 11;
                    case 7:
                        str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str15);
                        i8 |= 128;
                    case 8:
                        str19 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, str19);
                        i8 |= 256;
                    case 9:
                        str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str16);
                        i8 |= 512;
                    case 10:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i8 |= 1024;
                    case 11:
                        i7 = beginStructure.decodeIntElement(serialDescriptor, i4);
                        i8 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i7;
            bArr = bArr3;
            str = str16;
            z = z3;
            f = f2;
            i2 = i9;
            str2 = str13;
            str3 = str15;
            str4 = str18;
            i3 = i8;
            java.lang.String str20 = str19;
            str5 = str14;
            str6 = str17;
            str7 = str20;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success(i3, bArr, str6, str4, f, i2, str5, str2, str3, str7, str, z, i, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success.write$Self$verification_capture_prodRelease(value, beginStructure, serialDescriptor);
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
