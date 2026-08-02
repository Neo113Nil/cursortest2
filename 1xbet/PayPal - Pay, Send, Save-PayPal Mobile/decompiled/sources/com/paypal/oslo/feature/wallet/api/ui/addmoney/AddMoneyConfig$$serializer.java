package com.paypal.oslo.feature.wallet.api.ui.addmoney;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AddMoneyConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig$$serializer addMoneyConfig$$serializer = new com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig$$serializer();
        INSTANCE = addMoneyConfig$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig", addMoneyConfig$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("flowContext", false);
        pluginGeneratedSerialDescriptor.addElement("topBarConfig", true);
        pluginGeneratedSerialDescriptor.addElement("showPostAddMoneyFlow", true);
        pluginGeneratedSerialDescriptor.addElement("showIACHBanks", true);
        pluginGeneratedSerialDescriptor.addElement("addFIFlowType", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private AddMoneyConfig$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig$$serializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, lazyArr[4].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        boolean z;
        boolean z2;
        int i;
        com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig;
        com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType;
        com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow2 = (com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig2 = (com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig$$serializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
            addFIFlowType = (com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            transferFlow = transferFlow2;
            z = decodeBooleanElement2;
            z2 = decodeBooleanElement;
            topBarConfig = topBarConfig2;
            i = 31;
        } else {
            boolean z3 = true;
            com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig3 = null;
            com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType2 = null;
            com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow3 = null;
            boolean z4 = false;
            boolean z5 = false;
            int i2 = 0;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z3 = false;
                } else if (decodeElementIndex == 0) {
                    transferFlow3 = (com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), transferFlow3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    topBarConfig3 = (com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig$$serializer.INSTANCE, topBarConfig3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    z5 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    z4 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    addFIFlowType2 = (com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), addFIFlowType2);
                    i2 |= 16;
                }
            }
            z = z4;
            z2 = z5;
            i = i2;
            topBarConfig = topBarConfig3;
            addFIFlowType = addFIFlowType2;
            transferFlow = transferFlow3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig(i, transferFlow, topBarConfig, z2, z, addFIFlowType, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.write$Self$wallet_api_prodRelease(value, beginStructure, serialDescriptor);
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
