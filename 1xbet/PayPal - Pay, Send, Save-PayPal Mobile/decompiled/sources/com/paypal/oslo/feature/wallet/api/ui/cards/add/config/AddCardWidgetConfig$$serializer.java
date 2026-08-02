package com.paypal.oslo.feature.wallet.api.ui.cards.add.config;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardWidgetConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardWidgetConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardWidgetConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardWidgetConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AddCardWidgetConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardWidgetConfig> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardWidgetConfig$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardWidgetConfig$$serializer addCardWidgetConfig$$serializer = new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardWidgetConfig$$serializer();
        INSTANCE = addCardWidgetConfig$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardWidgetConfig", addCardWidgetConfig$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("analyticsContext", false);
        pluginGeneratedSerialDescriptor.addElement("skip3DS2Confirmation", true);
        pluginGeneratedSerialDescriptor.addElement("showSuccessScreen", true);
        pluginGeneratedSerialDescriptor.addElement("addCardFormConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private AddCardWidgetConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardWidgetConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        boolean z;
        int i;
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext2 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
            addFIAnalyticsContext = addFIAnalyticsContext2;
            config = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer.INSTANCE, null);
            z = decodeBooleanElement2;
            i = 15;
            z2 = decodeBooleanElement;
        } else {
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config2 = null;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext3 = null;
            boolean z3 = true;
            boolean z4 = false;
            int i2 = 0;
            boolean z5 = false;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z3 = false;
                } else if (decodeElementIndex == 0) {
                    addFIAnalyticsContext3 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, addFIAnalyticsContext3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    z5 = beginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    z4 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    config2 = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer.INSTANCE, config2);
                    i2 |= 8;
                }
            }
            z = z4;
            i = i2;
            config = config2;
            addFIAnalyticsContext = addFIAnalyticsContext3;
            z2 = z5;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardWidgetConfig(i, addFIAnalyticsContext, z2, z, config, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardWidgetConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardWidgetConfig.write$Self$wallet_api_prodRelease(value, beginStructure, serialDescriptor);
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
