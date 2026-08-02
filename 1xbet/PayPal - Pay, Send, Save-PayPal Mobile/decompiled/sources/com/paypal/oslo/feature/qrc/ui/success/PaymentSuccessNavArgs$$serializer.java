package com.paypal.oslo.feature.qrc.ui.success;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessNavArgs$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessNavArgs;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessNavArgs;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessNavArgs;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class PaymentSuccessNavArgs$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs$$serializer paymentSuccessNavArgs$$serializer = new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs$$serializer();
        INSTANCE = paymentSuccessNavArgs$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs", paymentSuccessNavArgs$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("transactionId", false);
        pluginGeneratedSerialDescriptor.addElement("paymentAmountValue", false);
        pluginGeneratedSerialDescriptor.addElement("paymentAmountCurrencyCode", false);
        pluginGeneratedSerialDescriptor.addElement("txnTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("merchantDisplayName", false);
        pluginGeneratedSerialDescriptor.addElement("merchantName", false);
        pluginGeneratedSerialDescriptor.addElement("merchantDisplayInitials", false);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("sourceAmountValue", true);
        pluginGeneratedSerialDescriptor.addElement("sourceAmountCurrencyCode", true);
        pluginGeneratedSerialDescriptor.addElement("isPayPalWorld", true);
        pluginGeneratedSerialDescriptor.addElement("ppwFxRate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentSuccessNavArgs$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[7].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.DoubleSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.Double d;
        boolean z;
        int i;
        java.lang.String str9;
        kotlin.Lazy[] lazyArr2;
        java.lang.String str10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        java.lang.String str11 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str17 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus2 = (com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            java.lang.String str18 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str19 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 10);
            paymentStatus = paymentStatus2;
            str2 = decodeStringElement;
            d = (java.lang.Double) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, null);
            z = decodeBooleanElement;
            str9 = str19;
            str5 = str17;
            str7 = str16;
            str4 = str14;
            str8 = str18;
            str = str15;
            str6 = str13;
            i = 4095;
            str3 = str12;
        } else {
            int i5 = 11;
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus3 = null;
            java.lang.String str20 = null;
            java.lang.String str21 = null;
            java.lang.String str22 = null;
            str = null;
            java.lang.String str23 = null;
            java.lang.String str24 = null;
            java.lang.String str25 = null;
            boolean z2 = true;
            int i6 = 0;
            boolean z3 = false;
            java.lang.String str26 = null;
            java.lang.Double d2 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        str10 = str11;
                        z2 = false;
                        str11 = str10;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 0:
                        lazyArr2 = lazyArr;
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        str11 = str10;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 1:
                        lazyArr2 = lazyArr;
                        str10 = str11;
                        str25 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str25);
                        i6 |= 2;
                        str11 = str10;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 2:
                        lazyArr2 = lazyArr;
                        str24 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str24);
                        i6 |= 4;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 3:
                        str23 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str23);
                        i6 |= 8;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 4:
                        str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str);
                        i6 |= 16;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                    case 5:
                        str21 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str21);
                        i6 |= 32;
                        i5 = 11;
                        i2 = 10;
                    case 6:
                        str20 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str20);
                        i6 |= 64;
                        i5 = 11;
                        i2 = 10;
                    case 7:
                        paymentStatus3 = (com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), paymentStatus3);
                        i6 |= 128;
                        i5 = 11;
                    case 8:
                        str22 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str22);
                        i6 |= 256;
                    case 9:
                        str26 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str26);
                        i6 |= 512;
                    case 10:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i6 |= 1024;
                    case 11:
                        d2 = (java.lang.Double) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, d2);
                        i6 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str2 = str11;
            java.lang.String str27 = str24;
            str3 = str25;
            str4 = str23;
            paymentStatus = paymentStatus3;
            str5 = str20;
            str6 = str27;
            str7 = str21;
            str8 = str22;
            d = d2;
            z = z3;
            i = i6;
            str9 = str26;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs(i, str2, str3, str6, str4, str, str7, str5, paymentStatus, str8, str9, z, d, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs.write$Self$qrc_prodRelease(value, beginStructure, serialDescriptor);
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
