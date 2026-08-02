package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/qrc/domain/model/session/PayPalWorldTransactionDetails;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class PayPalWorldTransactionDetails$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails$$serializer payPalWorldTransactionDetails$$serializer = new com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails$$serializer();
        INSTANCE = payPalWorldTransactionDetails$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails", payPalWorldTransactionDetails$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("sourceAmount", false);
        pluginGeneratedSerialDescriptor.addElement("destinationAmount", false);
        pluginGeneratedSerialDescriptor.addElement("totalAmount", false);
        pluginGeneratedSerialDescriptor.addElement("feeAmount", false);
        pluginGeneratedSerialDescriptor.addElement("paypalWorldFxRate", false);
        pluginGeneratedSerialDescriptor.addElement("transactionIntentId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PayPalWorldTransactionDetails$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney;
        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate payPalWorldFxRate;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney3;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney4;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney5 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney6 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney7 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney8 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney9 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate payPalWorldFxRate2 = (com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate$$serializer.INSTANCE, null);
            qrcMoney2 = qrcMoney6;
            str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            qrcMoney = qrcMoney9;
            payPalWorldFxRate = payPalWorldFxRate2;
            qrcMoney3 = qrcMoney8;
            qrcMoney4 = qrcMoney7;
            i = 63;
        } else {
            int i3 = 0;
            boolean z = true;
            com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate payPalWorldFxRate3 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney10 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney11 = null;
            java.lang.String str2 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney12 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        qrcMoney11 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, qrcMoney11);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        qrcMoney5 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, qrcMoney5);
                        i3 |= 2;
                    case 2:
                        qrcMoney10 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, qrcMoney10);
                        i3 |= 4;
                    case 3:
                        qrcMoney12 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, qrcMoney12);
                        i3 |= 8;
                    case 4:
                        payPalWorldFxRate3 = (com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate$$serializer.INSTANCE, payPalWorldFxRate3);
                        i3 |= 16;
                    case 5:
                        str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str2);
                        i3 |= 32;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str2;
            qrcMoney = qrcMoney12;
            payPalWorldFxRate = payPalWorldFxRate3;
            qrcMoney2 = qrcMoney11;
            qrcMoney3 = qrcMoney10;
            qrcMoney4 = qrcMoney5;
            i = i3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails(i, qrcMoney2, qrcMoney4, qrcMoney3, qrcMoney, payPalWorldFxRate, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails.write$Self$qrc_prodRelease(value, beginStructure, serialDescriptor);
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
