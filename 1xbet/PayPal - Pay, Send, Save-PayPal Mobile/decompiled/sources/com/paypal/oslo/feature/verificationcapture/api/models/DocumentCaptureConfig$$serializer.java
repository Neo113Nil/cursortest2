package com.paypal.oslo.feature.verificationcapture.api.models;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/models/DocumentCaptureConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/DocumentCaptureConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/verificationcapture/api/models/DocumentCaptureConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/verificationcapture/api/models/DocumentCaptureConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DocumentCaptureConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig$$serializer documentCaptureConfig$$serializer = new com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig$$serializer();
        INSTANCE = documentCaptureConfig$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig", documentCaptureConfig$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("vendor", true);
        pluginGeneratedSerialDescriptor.addElement("sessionToken", true);
        pluginGeneratedSerialDescriptor.addElement("maxDocuments", true);
        pluginGeneratedSerialDescriptor.addElement("isTwoSided", true);
        pluginGeneratedSerialDescriptor.addElement("allowManualUpload", true);
        pluginGeneratedSerialDescriptor.addElement("documentType", true);
        pluginGeneratedSerialDescriptor.addElement("retryLimit", true);
        pluginGeneratedSerialDescriptor.addElement(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, true);
        pluginGeneratedSerialDescriptor.addElement("captureMode", true);
        pluginGeneratedSerialDescriptor.addElement("options", true);
        pluginGeneratedSerialDescriptor.addElement("isHandleManualCapture", true);
        pluginGeneratedSerialDescriptor.addElement("locale", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private DocumentCaptureConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[11].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale;
        java.lang.String str;
        int i;
        int i2;
        boolean z;
        boolean z2;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Integer num;
        java.lang.String str4;
        boolean z3;
        java.lang.String str5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 0;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Integer num2 = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 6);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 7);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 8);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(serialDescriptor, 10);
            supportedLocale = (com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), null);
            z3 = decodeBooleanElement3;
            str = str8;
            i = decodeIntElement2;
            i2 = decodeIntElement;
            str4 = str7;
            z = decodeBooleanElement;
            str2 = decodeStringElement2;
            z2 = decodeBooleanElement2;
            num = num2;
            str5 = str6;
            i6 = 4095;
            str3 = decodeStringElement;
        } else {
            int i7 = 11;
            int i8 = 0;
            int i9 = 0;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = true;
            com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale2 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.Integer num3 = null;
            java.lang.String str13 = null;
            boolean z7 = false;
            while (z6) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z6 = false;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                    case 0:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                    case 1:
                        str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str11);
                        i6 |= 2;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                    case 2:
                        num3 = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.IntSerializer.INSTANCE, num3);
                        i6 |= 4;
                        i7 = 11;
                        i3 = 10;
                        i4 = 9;
                    case 3:
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i6 |= 8;
                        i7 = 11;
                    case 4:
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i6 |= 16;
                    case 5:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i6 |= 32;
                    case 6:
                        i9 = beginStructure.decodeIntElement(serialDescriptor, 6);
                        i6 |= 64;
                    case 7:
                        i8 = beginStructure.decodeIntElement(serialDescriptor, i5);
                        i6 |= 128;
                    case 8:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 8);
                        i6 |= 256;
                    case 9:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i6 |= 512;
                    case 10:
                        z7 = beginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i6 |= 1024;
                    case 11:
                        supportedLocale2 = (com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale) beginStructure.decodeNullableSerializableElement(serialDescriptor, i7, (kotlinx.serialization.DeserializationStrategy) lazyArr[i7].getValue(), supportedLocale2);
                        i6 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str14 = str11;
            java.lang.Integer num4 = num3;
            supportedLocale = supportedLocale2;
            str = str10;
            i = i8;
            i2 = i9;
            z = z4;
            z2 = z5;
            str2 = str12;
            str3 = str13;
            num = num4;
            str4 = str9;
            z3 = z7;
            str5 = str14;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig(i6, str3, str5, num, z, z2, str4, i2, i, str2, str, z3, supportedLocale, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig.write$Self$verification_capture_api_prodRelease(value, beginStructure, serialDescriptor);
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
