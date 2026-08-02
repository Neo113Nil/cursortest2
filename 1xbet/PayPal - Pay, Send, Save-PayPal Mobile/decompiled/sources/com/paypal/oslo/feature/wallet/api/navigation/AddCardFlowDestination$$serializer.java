package com.paypal.oslo.feature.wallet.api.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardFlowDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardFlowDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardFlowDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardFlowDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AddCardFlowDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination$$serializer addCardFlowDestination$$serializer = new com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination$$serializer();
        INSTANCE = addCardFlowDestination$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination", addCardFlowDestination$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("analyticsContext", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, true);
        pluginGeneratedSerialDescriptor.addElement("addCardFormConfig", true);
        pluginGeneratedSerialDescriptor.addElement("flowOptions", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private AddCardFlowDestination$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, lazyArr[1].getValue(), com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Options$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config;
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options;
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination.$childSerializers;
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config2 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext2 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header2 = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config3 = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer.INSTANCE, null);
            header = header2;
            addFIAnalyticsContext = addFIAnalyticsContext2;
            options = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Options$$serializer.INSTANCE, null);
            config = config3;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options2 = null;
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header3 = null;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    addFIAnalyticsContext3 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, addFIAnalyticsContext3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    header3 = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), header3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    config2 = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer.INSTANCE, config2);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    options2 = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Options$$serializer.INSTANCE, options2);
                    i2 |= 8;
                }
            }
            i = i2;
            config = config2;
            options = options2;
            header = header3;
            addFIAnalyticsContext = addFIAnalyticsContext3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination(i, addFIAnalyticsContext, header, config, options, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination.write$Self$wallet_api_prodRelease(value, beginStructure, serialDescriptor);
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
