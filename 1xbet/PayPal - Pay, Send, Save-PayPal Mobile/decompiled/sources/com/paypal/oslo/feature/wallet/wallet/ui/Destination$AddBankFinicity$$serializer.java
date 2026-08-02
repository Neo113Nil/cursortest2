package com.paypal.oslo.feature.wallet.wallet.ui;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankFinicity$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankFinicity;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankFinicity;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AddBankFinicity;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Destination$AddBankFinicity$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankFinicity$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankFinicity$$serializer destination$AddBankFinicity$$serializer = new com.paypal.oslo.feature.wallet.wallet.ui.Destination$AddBankFinicity$$serializer();
        INSTANCE = destination$AddBankFinicity$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity", destination$AddBankFinicity$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("aggregatorName", false);
        pluginGeneratedSerialDescriptor.addElement("externalBankId", false);
        pluginGeneratedSerialDescriptor.addElement("bankName", false);
        pluginGeneratedSerialDescriptor.addElement("countryCode", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, true);
        pluginGeneratedSerialDescriptor.addElement("bankLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, true);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("instrumentId", false);
        pluginGeneratedSerialDescriptor.addElement("bank", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Destination$AddBankFinicity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[4].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[6].getValue(), lazyArr[7].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;
        java.lang.String str6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity.$childSerializers;
        int i2 = 9;
        java.lang.String str7 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 3);
            com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType2 = (com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow2 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction2 = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            externalBankAccessAction = externalBankAccessAction2;
            str5 = decodeStringElement;
            instantBankConfirmationBankDetails = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$serializer.INSTANCE, null);
            str6 = str8;
            str3 = decodeStringElement4;
            str2 = str9;
            str = decodeStringElement3;
            i = 1023;
            addFIFlow = addFIFlow2;
            str4 = decodeStringElement2;
            integrationType = integrationType2;
        } else {
            int i3 = 0;
            boolean z = true;
            com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType3 = null;
            java.lang.String str10 = null;
            com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction3 = null;
            com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow3 = null;
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails2 = null;
            java.lang.String str11 = null;
            str = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                    case 0:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 9;
                    case 1:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 9;
                    case 2:
                        str = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 9;
                    case 3:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 9;
                    case 4:
                        integrationType3 = (com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), integrationType3);
                        i3 |= 16;
                        i2 = 9;
                    case 5:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i3 |= 32;
                    case 6:
                        addFIFlow3 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), addFIFlow3);
                        i3 |= 64;
                    case 7:
                        externalBankAccessAction3 = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), externalBankAccessAction3);
                        i3 |= 128;
                    case 8:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i3 |= 256;
                    case 9:
                        instantBankConfirmationBankDetails2 = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$serializer.INSTANCE, instantBankConfirmationBankDetails2);
                        i3 |= 512;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str2 = str10;
            externalBankAccessAction = externalBankAccessAction3;
            addFIFlow = addFIFlow3;
            instantBankConfirmationBankDetails = instantBankConfirmationBankDetails2;
            str3 = str11;
            str4 = str12;
            str5 = str13;
            i = i3;
            integrationType = integrationType3;
            str6 = str7;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity(i, str5, str4, str, str3, integrationType, str6, addFIFlow, externalBankAccessAction, str2, instantBankConfirmationBankDetails, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity.write$Self$wallet_prodRelease(value, beginStructure, serialDescriptor);
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
