package com.paypal.oslo.feature.wallet.wallet.ui;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OBConsentScreen$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OBConsentScreen;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OBConsentScreen;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$OBConsentScreen;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Destination$OBConsentScreen$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination$OBConsentScreen$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.wallet.ui.Destination$OBConsentScreen$$serializer destination$OBConsentScreen$$serializer = new com.paypal.oslo.feature.wallet.wallet.ui.Destination$OBConsentScreen$$serializer();
        INSTANCE = destination$OBConsentScreen$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen", destination$OBConsentScreen$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("addBankConsentFlowContentId", true);
        pluginGeneratedSerialDescriptor.addElement("analyticsContext", false);
        pluginGeneratedSerialDescriptor.addElement("config", false);
        pluginGeneratedSerialDescriptor.addElement("bankAccount", true);
        pluginGeneratedSerialDescriptor.addElement("instantBankConfirmationAggregatorParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Destination$OBConsentScreen$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext;
        com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen.$childSerializers;
        com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig2 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId2 = (com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext2 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig3 = (com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount2 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount$$serializer.INSTANCE, null);
            instantBankConfirmationAggregatorParams = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            addBankConsentFlowContentId = addBankConsentFlowContentId2;
            bankAccount = bankAccount2;
            addBankConfig = addBankConfig3;
            addFIAnalyticsContext = addFIAnalyticsContext2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams2 = null;
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount3 = null;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext3 = null;
            com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    addBankConsentFlowContentId3 = (com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), addBankConsentFlowContentId3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    addFIAnalyticsContext3 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, addFIAnalyticsContext3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    addBankConfig2 = (com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig$$serializer.INSTANCE, addBankConfig2);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    bankAccount3 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount$$serializer.INSTANCE, bankAccount3);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    instantBankConfirmationAggregatorParams2 = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), instantBankConfirmationAggregatorParams2);
                    i2 |= 16;
                }
            }
            i = i2;
            addBankConfig = addBankConfig2;
            instantBankConfirmationAggregatorParams = instantBankConfirmationAggregatorParams2;
            bankAccount = bankAccount3;
            addFIAnalyticsContext = addFIAnalyticsContext3;
            addBankConsentFlowContentId = addBankConsentFlowContentId3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen(i, addBankConsentFlowContentId, addFIAnalyticsContext, addBankConfig, bankAccount, instantBankConfirmationAggregatorParams, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen.write$Self$wallet_prodRelease(value, beginStructure, serialDescriptor);
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
