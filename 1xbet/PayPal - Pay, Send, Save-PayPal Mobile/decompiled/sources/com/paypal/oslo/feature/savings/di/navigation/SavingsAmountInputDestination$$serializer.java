package com.paypal.oslo.feature.savings.di.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/savings/di/navigation/SavingsAmountInputDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/savings/di/navigation/SavingsAmountInputDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/savings/di/navigation/SavingsAmountInputDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/savings/di/navigation/SavingsAmountInputDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class SavingsAmountInputDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination$$serializer savingsAmountInputDestination$$serializer = new com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination$$serializer();
        INSTANCE = savingsAmountInputDestination$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination", savingsAmountInputDestination$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("goal", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, false);
        pluginGeneratedSerialDescriptor.addElement("requestId", true);
        pluginGeneratedSerialDescriptor.addElement("preselectedFiType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SavingsAmountInputDestination$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO$$serializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination.$childSerializers;
        java.lang.String str3 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType2 = (com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            moneyManagementFlowType = moneyManagementFlowType2;
            goalSummaryDTO = goalSummaryDTO2;
            str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str = str4;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.String str5 = null;
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType3 = null;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    goalSummaryDTO3 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO$$serializer.INSTANCE, goalSummaryDTO3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    moneyManagementFlowType3 = (com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), moneyManagementFlowType3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str3);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            str2 = str5;
            moneyManagementFlowType = moneyManagementFlowType3;
            goalSummaryDTO = goalSummaryDTO3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination(i, goalSummaryDTO, moneyManagementFlowType, str, str2, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination.write$Self$savings_prodRelease(value, beginStructure, serialDescriptor);
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
