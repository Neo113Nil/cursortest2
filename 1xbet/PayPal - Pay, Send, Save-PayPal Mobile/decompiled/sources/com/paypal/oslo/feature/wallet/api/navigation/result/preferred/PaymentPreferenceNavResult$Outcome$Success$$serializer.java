package com.paypal.oslo.feature.wallet.api.navigation.result.preferred;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class PaymentPreferenceNavResult$Outcome$Success$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$$serializer paymentPreferenceNavResult$Outcome$Success$$serializer = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$$serializer();
        INSTANCE = paymentPreferenceNavResult$Outcome$Success$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success", paymentPreferenceNavResult$Outcome$Success$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("preferredInstrument", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private PaymentPreferenceNavResult$Outcome$Success$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument preferredInstrument;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.$childSerializers;
        int i = 1;
        if (beginStructure.decodeSequentially()) {
            preferredInstrument = (com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
        } else {
            com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument preferredInstrument2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else {
                    if (decodeElementIndex != 0) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    preferredInstrument2 = (com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), preferredInstrument2);
                    i2 = 1;
                }
            }
            preferredInstrument = preferredInstrument2;
            i = i2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success(i, preferredInstrument, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        beginStructure.encodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.$childSerializers[0].getValue(), value.preferredInstrument);
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
