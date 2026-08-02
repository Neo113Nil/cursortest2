package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class QrcSessionNavArgs$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs$$serializer qrcSessionNavArgs$$serializer = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs$$serializer();
        INSTANCE = qrcSessionNavArgs$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs", qrcSessionNavArgs$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("sessionId", false);
        pluginGeneratedSerialDescriptor.addElement("mode", false);
        pluginGeneratedSerialDescriptor.addElement("qrCodeType", false);
        pluginGeneratedSerialDescriptor.addElement("pointOfInitiationMethod", false);
        pluginGeneratedSerialDescriptor.addElement("productFlow", false);
        pluginGeneratedSerialDescriptor.addElement("requiredAction", false);
        pluginGeneratedSerialDescriptor.addElement("transactionDetails", false);
        pluginGeneratedSerialDescriptor.addElement("participants", false);
        pluginGeneratedSerialDescriptor.addElement("tipDetails", false);
        pluginGeneratedSerialDescriptor.addElement("paypalWorldDetails", false);
        pluginGeneratedSerialDescriptor.addElement("paymentResponse", false);
        pluginGeneratedSerialDescriptor.addElement("paymentOptions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private QrcSessionNavArgs$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[1].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[2].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[3].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[5].getValue()), com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails$$serializer.INSTANCE, com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants$$serializer.INSTANCE, com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails qrcTransactionDetails;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails qrcTipDetails;
        com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions;
        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails payPalWorldTransactionDetails;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse;
        java.lang.String str;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMode qrcMode;
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction;
        com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants qrcParticipants;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod qrcPointOfInitiationMethod;
        int i;
        kotlin.Lazy[] lazyArr2;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        java.lang.String str3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMode qrcMode2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMode) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod qrcPointOfInitiationMethod2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow2 = (com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails qrcTransactionDetails2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails) beginStructure.decodeSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants qrcParticipants2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants) beginStructure.decodeSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails qrcTipDetails2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails) beginStructure.decodeSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails payPalWorldTransactionDetails2 = (com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse2 = (com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse$$serializer.INSTANCE, null);
            qrcSessionRequiredAction = qrcSessionRequiredAction2;
            paymentOptions = (com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions$$serializer.INSTANCE, null);
            paymentResponse = paymentResponse2;
            payPalWorldTransactionDetails = payPalWorldTransactionDetails2;
            qrcParticipants = qrcParticipants2;
            qrcTransactionDetails = qrcTransactionDetails2;
            qrcTipDetails = qrcTipDetails2;
            i = 4095;
            str = decodeStringElement;
            qrcPointOfInitiationMethod = qrcPointOfInitiationMethod2;
            qrcMode = qrcMode2;
            qrCodeType = qrCodeType2;
            productFlow = productFlow2;
        } else {
            int i5 = 11;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails qrcTransactionDetails3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails qrcTipDetails3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants qrcParticipants3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails payPalWorldTransactionDetails3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod qrcPointOfInitiationMethod3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMode qrcMode3 = null;
            int i6 = 0;
            boolean z = true;
            com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions2 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        str2 = str3;
                        z = false;
                        lazyArr = lazyArr2;
                        str3 = str2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 0:
                        lazyArr2 = lazyArr;
                        str2 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        lazyArr = lazyArr2;
                        str3 = str2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 1:
                        str2 = str3;
                        lazyArr2 = lazyArr;
                        qrcMode3 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMode) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), qrcMode3);
                        i6 |= 2;
                        lazyArr = lazyArr2;
                        str3 = str2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 2:
                        str2 = str3;
                        qrCodeType3 = (com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), qrCodeType3);
                        i6 |= 4;
                        str3 = str2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 3:
                        qrcPointOfInitiationMethod3 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcPointOfInitiationMethod) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), qrcPointOfInitiationMethod3);
                        i6 |= 8;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 4:
                        productFlow3 = (com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), productFlow3);
                        i6 |= 16;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                    case 5:
                        qrcSessionRequiredAction3 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), qrcSessionRequiredAction3);
                        i6 |= 32;
                        i5 = 11;
                        i2 = 10;
                    case 6:
                        qrcTransactionDetails3 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails) beginStructure.decodeSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails$$serializer.INSTANCE, qrcTransactionDetails3);
                        i6 |= 64;
                        i5 = 11;
                    case 7:
                        qrcParticipants3 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants) beginStructure.decodeSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.qrc.domain.model.session.QrcParticipants$$serializer.INSTANCE, qrcParticipants3);
                        i6 |= 128;
                        i5 = 11;
                    case 8:
                        qrcTipDetails3 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails) beginStructure.decodeSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails$$serializer.INSTANCE, qrcTipDetails3);
                        i6 |= 256;
                    case 9:
                        payPalWorldTransactionDetails3 = (com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails$$serializer.INSTANCE, payPalWorldTransactionDetails3);
                        i6 |= 512;
                    case 10:
                        paymentResponse3 = (com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse$$serializer.INSTANCE, paymentResponse3);
                        i6 |= 1024;
                    case 11:
                        paymentOptions2 = (com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions$$serializer.INSTANCE, paymentOptions2);
                        i6 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction4 = qrcSessionRequiredAction3;
            qrcTransactionDetails = qrcTransactionDetails3;
            qrcTipDetails = qrcTipDetails3;
            paymentOptions = paymentOptions2;
            payPalWorldTransactionDetails = payPalWorldTransactionDetails3;
            paymentResponse = paymentResponse3;
            str = str3;
            qrcMode = qrcMode3;
            qrCodeType = qrCodeType3;
            qrcSessionRequiredAction = qrcSessionRequiredAction4;
            productFlow = productFlow3;
            qrcParticipants = qrcParticipants3;
            qrcPointOfInitiationMethod = qrcPointOfInitiationMethod3;
            i = i6;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs(i, str, qrcMode, qrCodeType, qrcPointOfInitiationMethod, productFlow, qrcSessionRequiredAction, qrcTransactionDetails, qrcParticipants, qrcTipDetails, payPalWorldTransactionDetails, paymentResponse, paymentOptions, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs.write$Self$qrc_prodRelease(value, beginStructure, serialDescriptor);
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
