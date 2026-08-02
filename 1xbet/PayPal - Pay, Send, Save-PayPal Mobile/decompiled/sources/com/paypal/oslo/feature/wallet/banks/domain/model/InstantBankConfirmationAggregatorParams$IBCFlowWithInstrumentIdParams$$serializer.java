package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer instantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer = new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer();
        INSTANCE = instantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams", instantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("instrumentId", false);
        pluginGeneratedSerialDescriptor.addElement("productFlow", false);
        pluginGeneratedSerialDescriptor.addElement("countryCode", true);
        pluginGeneratedSerialDescriptor.addElement("excludeAggregators", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstantBankConfirmationAggregatorParams$IBCFlowWithInstrumentIdParams$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[3].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.lang.String str;
        java.util.List list;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams.$childSerializers;
        java.lang.String str3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow2 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            str2 = decodeStringElement;
            str = decodeStringElement2;
            addFIFlow = addFIFlow2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            java.util.List list2 = null;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow3 = null;
            java.lang.String str4 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str4 = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    addFIFlow3 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), addFIFlow3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    str3 = beginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), list2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            list = list2;
            addFIFlow = addFIFlow3;
            str2 = str4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams(i, str2, addFIFlow, str, list, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams.write$Self$wallet_prodRelease(value, beginStructure, serialDescriptor);
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
