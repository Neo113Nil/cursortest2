package com.paypal.oslo.feature.savings.navigation.result;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class MoneyManagementSuccessNavResult$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult$$serializer moneyManagementSuccessNavResult$$serializer = new com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult$$serializer();
        INSTANCE = moneyManagementSuccessNavResult$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult", moneyManagementSuccessNavResult$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, false);
        pluginGeneratedSerialDescriptor.addElement("destinationFi", false);
        pluginGeneratedSerialDescriptor.addElement("sourceFi", true);
        pluginGeneratedSerialDescriptor.addElement("frequency", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MoneyManagementSuccessNavResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO$$serializer.INSTANCE), lazyArr[3].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO destinationFiDTO;
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult.$childSerializers;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO2 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType2 = (com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO destinationFiDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO3 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO$$serializer.INSTANCE, null);
            frequencyType = (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            moneyManagementFlowType = moneyManagementFlowType2;
            moneyMovementFiDTO = moneyMovementFiDTO3;
            i = 15;
            destinationFiDTO = destinationFiDTO2;
        } else {
            boolean z = true;
            int i2 = 0;
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType2 = null;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO destinationFiDTO3 = null;
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    moneyManagementFlowType3 = (com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), moneyManagementFlowType3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    destinationFiDTO3 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO$$serializer.INSTANCE, destinationFiDTO3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    moneyMovementFiDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO$$serializer.INSTANCE, moneyMovementFiDTO2);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    frequencyType2 = (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), frequencyType2);
                    i2 |= 8;
                }
            }
            i = i2;
            moneyMovementFiDTO = moneyMovementFiDTO2;
            frequencyType = frequencyType2;
            destinationFiDTO = destinationFiDTO3;
            moneyManagementFlowType = moneyManagementFlowType3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult(i, moneyManagementFlowType, destinationFiDTO, moneyMovementFiDTO, frequencyType, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult.write$Self$savings_prodRelease(value, beginStructure, serialDescriptor);
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
