package com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AddCardScreenArgs$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs$$serializer addCardScreenArgs$$serializer = new com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs$$serializer();
        INSTANCE = addCardScreenArgs$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs", addCardScreenArgs$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("analyticsContext", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, false);
        pluginGeneratedSerialDescriptor.addElement("formConfig", false);
        pluginGeneratedSerialDescriptor.addElement("flowOptions", false);
        pluginGeneratedSerialDescriptor.addElement("prefilledCardNumber", true);
        pluginGeneratedSerialDescriptor.addElement("prefilledExpiryDate", true);
        pluginGeneratedSerialDescriptor.addElement("errorMessage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AddCardScreenArgs$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, lazyArr[1].getValue(), com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Options$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options;
        int i;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext;
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        int i4 = 3;
        java.lang.String str4 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext2 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header2 = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config2 = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options2 = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Options$$serializer.INSTANCE, null);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            header = header2;
            addFIAnalyticsContext = addFIAnalyticsContext2;
            str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str2 = str6;
            options = options2;
            str3 = str5;
            config = config2;
            i = 127;
        } else {
            int i5 = 0;
            boolean z = true;
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header3 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options3 = null;
            config = null;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 5;
                        i4 = 3;
                    case 0:
                        addFIAnalyticsContext3 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, addFIAnalyticsContext3);
                        i5 |= 1;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                    case 1:
                        header3 = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), header3);
                        i5 |= 2;
                        i2 = 6;
                    case 2:
                        config = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm$Config$$serializer.INSTANCE, config);
                        i5 |= 4;
                    case 3:
                        options3 = (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options) beginStructure.decodeSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Options$$serializer.INSTANCE, options3);
                        i5 |= 8;
                    case 4:
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i5 |= 16;
                    case 5:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i5 |= 32;
                    case 6:
                        str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str4);
                        i5 |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext4 = addFIAnalyticsContext3;
            str = str4;
            str2 = str7;
            str3 = str8;
            options = options3;
            i = i5;
            addFIAnalyticsContext = addFIAnalyticsContext4;
            header = header3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs(i, addFIAnalyticsContext, header, config, options, str3, str2, str, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs.write$Self$wallet_prodRelease(value, beginStructure, serialDescriptor);
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
