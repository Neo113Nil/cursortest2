package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class PaymentResponse$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse$$serializer paymentResponse$$serializer = new com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse$$serializer();
        INSTANCE = paymentResponse$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse", paymentResponse$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("paymentMethod", true);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("statusReason", true);
        pluginGeneratedSerialDescriptor.addElement("contingencies", true);
        pluginGeneratedSerialDescriptor.addElement("txnTimestamp", true);
        pluginGeneratedSerialDescriptor.addElement("requiredAction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[1].getValue()), lazyArr[2].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[6].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction;
        java.lang.String str;
        java.util.List list;
        java.lang.String str2;
        int i;
        java.lang.String str3;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod paymentMethod;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse.$childSerializers;
        int i2 = 5;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction qrcSessionRequiredAction2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod paymentMethod2 = (com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus paymentStatus2 = (com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.List list2 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            qrcSessionRequiredAction = (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            str2 = decodeStringElement;
            str = str5;
            str3 = str4;
            i = 127;
            paymentMethod = paymentMethod2;
            list = list2;
            paymentStatus = paymentStatus2;
        } else {
            int i3 = 0;
            boolean z = true;
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod paymentMethod3 = null;
            java.lang.String str6 = null;
            java.util.List list3 = null;
            java.lang.String str7 = null;
            paymentStatus = null;
            java.lang.String str8 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        paymentMethod3 = (com.paypal.oslo.feature.qrc.domain.model.session.PaymentMethod) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), paymentMethod3);
                        i3 |= 2;
                        i2 = 5;
                    case 2:
                        paymentStatus = (com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), paymentStatus);
                        i3 |= 4;
                    case 3:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i3 |= 8;
                    case 4:
                        list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list3);
                        i3 |= 16;
                    case 5:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        i3 |= 32;
                    case 6:
                        qrcSessionRequiredAction2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), qrcSessionRequiredAction2);
                        i3 |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            qrcSessionRequiredAction = qrcSessionRequiredAction2;
            str = str6;
            list = list3;
            str2 = str8;
            i = i3;
            str3 = str7;
            paymentMethod = paymentMethod3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse(i, str2, paymentMethod, paymentStatus, str3, list, str, qrcSessionRequiredAction, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse.write$Self$qrc_prodRelease(value, beginStructure, serialDescriptor);
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
