package com.paypal.oslo.feature.verificationcapture.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/CaptureResult$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/CaptureResult;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/CaptureResult;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/CaptureResult;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CaptureResult$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult$$serializer captureResult$$serializer = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult$$serializer();
        INSTANCE = captureResult$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult", captureResult$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("documentContext", true);
        pluginGeneratedSerialDescriptor.addElement("faceScan", true);
        pluginGeneratedSerialDescriptor.addElement("auditTrailImages", true);
        pluginGeneratedSerialDescriptor.addElement("lowQualityAuditTrailImages", true);
        pluginGeneratedSerialDescriptor.addElement("documentId", true);
        pluginGeneratedSerialDescriptor.addElement("vpId", true);
        pluginGeneratedSerialDescriptor.addElement("sessionId", true);
        pluginGeneratedSerialDescriptor.addElement("retryCount", true);
        pluginGeneratedSerialDescriptor.addElement("isManualCapture", true);
        pluginGeneratedSerialDescriptor.addElement(com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, true);
        pluginGeneratedSerialDescriptor.addElement("extractedData", true);
        pluginGeneratedSerialDescriptor.addElement("metaData", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private CaptureResult$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.ByteArraySerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.ByteArraySerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[2].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[3].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        int i;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        byte[] bArr;
        int i2;
        boolean z;
        java.lang.String str6;
        byte[] bArr2;
        java.util.List list;
        java.util.List list2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 8;
        java.lang.String str7 = null;
        if (beginStructure.decodeSequentially()) {
            byte[] bArr3 = (byte[]) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, null);
            byte[] bArr4 = (byte[]) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, null);
            java.util.List list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.util.List list4 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 7);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 8);
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str = str12;
            str5 = str11;
            i2 = decodeIntElement;
            str3 = str10;
            str2 = str9;
            z = decodeBooleanElement;
            str6 = str8;
            i = 4095;
            bArr = bArr4;
            list2 = list3;
            list = list4;
            bArr2 = bArr3;
        } else {
            int i7 = 11;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            java.lang.String str16 = null;
            java.util.List list5 = null;
            byte[] bArr5 = null;
            java.util.List list6 = null;
            boolean z2 = true;
            int i8 = 0;
            int i9 = 0;
            boolean z3 = false;
            java.lang.String str17 = null;
            byte[] bArr6 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i6 = 8;
                    case 0:
                        bArr5 = (byte[]) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, bArr5);
                        i8 |= 1;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                    case 1:
                        bArr6 = (byte[]) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, bArr6);
                        i8 |= 2;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                    case 2:
                        list6 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), list6);
                        i8 |= 4;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                    case 3:
                        list5 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), list5);
                        i8 |= 8;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                    case 4:
                        str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str16);
                        i8 |= 16;
                        i7 = 11;
                        i3 = 10;
                    case 5:
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i8 |= 32;
                        i7 = 11;
                    case 6:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i8 |= 64;
                        i7 = 11;
                    case 7:
                        i9 = beginStructure.decodeIntElement(serialDescriptor, i5);
                        i8 |= 128;
                    case 8:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i8 |= 256;
                    case 9:
                        str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str15);
                        i8 |= 512;
                    case 10:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i8 |= 1024;
                    case 11:
                        str17 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str17);
                        i8 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str18 = str16;
            java.util.List list7 = list5;
            byte[] bArr7 = bArr5;
            str = str7;
            i = i8;
            str2 = str13;
            str3 = str14;
            str4 = str17;
            str5 = str15;
            bArr = bArr6;
            i2 = i9;
            z = z3;
            str6 = str18;
            bArr2 = bArr7;
            list = list7;
            list2 = list6;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult(i, bArr2, bArr, list2, list, str6, str2, str3, i2, z, str5, str, str4, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult.write$Self$verification_capture_api_prodRelease(value, beginStructure, serialDescriptor);
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
