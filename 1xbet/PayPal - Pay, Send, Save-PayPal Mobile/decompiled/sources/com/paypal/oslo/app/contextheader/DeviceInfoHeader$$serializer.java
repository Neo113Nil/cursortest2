package com.paypal.oslo.app.contextheader;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/app/contextheader/DeviceInfoHeader$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/app/contextheader/DeviceInfoHeader;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/app/contextheader/DeviceInfoHeader;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/app/contextheader/DeviceInfoHeader;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DeviceInfoHeader$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.app.contextheader.DeviceInfoHeader> {
    public static final int $stable;
    public static final com.paypal.oslo.app.contextheader.DeviceInfoHeader$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.app.contextheader.DeviceInfoHeader$$serializer deviceInfoHeader$$serializer = new com.paypal.oslo.app.contextheader.DeviceInfoHeader$$serializer();
        INSTANCE = deviceInfoHeader$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.app.contextheader.DeviceInfoHeader", deviceInfoHeader$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("deviceId", false);
        pluginGeneratedSerialDescriptor.addElement("deviceType", false);
        pluginGeneratedSerialDescriptor.addElement("os", false);
        pluginGeneratedSerialDescriptor.addElement("osVersion", true);
        pluginGeneratedSerialDescriptor.addElement("make", true);
        pluginGeneratedSerialDescriptor.addElement("model", true);
        pluginGeneratedSerialDescriptor.addElement("nfcSupported", true);
        pluginGeneratedSerialDescriptor.addElement("headerKey", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DeviceInfoHeader$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.app.contextheader.DeviceInfoHeader.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), lazyArr[2].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), lazyArr[7].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.app.contextheader.DeviceInfoHeader deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Boolean bool;
        com.paypal.oslo.app.contextheader.ContextHeaderKey contextHeaderKey;
        java.lang.String str3;
        int i;
        com.paypal.oslo.app.contextheader.DeviceType deviceType;
        java.lang.String str4;
        com.paypal.oslo.app.contextheader.DeviceOS deviceOS;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.app.contextheader.DeviceInfoHeader.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        int i4 = 3;
        java.lang.String str5 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.app.contextheader.DeviceType deviceType2 = (com.paypal.oslo.app.contextheader.DeviceType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.app.contextheader.DeviceOS deviceOS2 = (com.paypal.oslo.app.contextheader.DeviceOS) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Boolean bool2 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            contextHeaderKey = (com.paypal.oslo.app.contextheader.ContextHeaderKey) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            str3 = decodeStringElement;
            bool = bool2;
            str4 = str8;
            str2 = str6;
            str = str7;
            i = 255;
            deviceType = deviceType2;
            deviceOS = deviceOS2;
        } else {
            int i5 = 0;
            boolean z = true;
            java.lang.String str9 = null;
            com.paypal.oslo.app.contextheader.DeviceOS deviceOS3 = null;
            java.lang.Boolean bool3 = null;
            com.paypal.oslo.app.contextheader.ContextHeaderKey contextHeaderKey2 = null;
            java.lang.String str10 = null;
            com.paypal.oslo.app.contextheader.DeviceType deviceType3 = null;
            java.lang.String str11 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                    case 0:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                    case 1:
                        deviceType3 = (com.paypal.oslo.app.contextheader.DeviceType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), deviceType3);
                        i5 |= 2;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                    case 2:
                        deviceOS3 = (com.paypal.oslo.app.contextheader.DeviceOS) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), deviceOS3);
                        i5 |= 4;
                        i2 = 6;
                    case 3:
                        str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                        i5 |= 8;
                    case 4:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i5 |= 16;
                    case 5:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i5 |= 32;
                    case 6:
                        bool3 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool3);
                        i5 |= 64;
                    case 7:
                        contextHeaderKey2 = (com.paypal.oslo.app.contextheader.ContextHeaderKey) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), contextHeaderKey2);
                        i5 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.app.contextheader.DeviceType deviceType4 = deviceType3;
            str = str9;
            str2 = str5;
            bool = bool3;
            contextHeaderKey = contextHeaderKey2;
            str3 = str11;
            i = i5;
            deviceType = deviceType4;
            str4 = str10;
            deviceOS = deviceOS3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.app.contextheader.DeviceInfoHeader(i, str3, deviceType, deviceOS, str2, str, str4, bool, contextHeaderKey, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.app.contextheader.DeviceInfoHeader value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.app.contextheader.DeviceInfoHeader.write$Self$app_prodRelease(value, beginStructure, serialDescriptor);
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
