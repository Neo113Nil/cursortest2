package com.paypal.oslo.feature.wallet.wallet.ui;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AutoLink$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AutoLink;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AutoLink;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination$AutoLink;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Destination$AutoLink$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.wallet.ui.Destination$AutoLink$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.wallet.ui.Destination$AutoLink$$serializer destination$AutoLink$$serializer = new com.paypal.oslo.feature.wallet.wallet.ui.Destination$AutoLink$$serializer();
        INSTANCE = destination$AutoLink$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink", destination$AutoLink$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("aggregatorName", false);
        pluginGeneratedSerialDescriptor.addElement("externalBankId", false);
        pluginGeneratedSerialDescriptor.addElement("countryCode", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, true);
        pluginGeneratedSerialDescriptor.addElement("bankName", true);
        pluginGeneratedSerialDescriptor.addElement("bankLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("credentialToken", true);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("bank", true);
        pluginGeneratedSerialDescriptor.addElement("instrumentId", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Destination$AutoLink$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[7].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[10].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction;
        java.lang.String str;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink.$childSerializers;
        int i2 = 9;
        int i3 = 6;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction2 = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails2 = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$serializer.INSTANCE, null);
            java.lang.String str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            addFIFlow = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow) beginStructure.decodeSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            str = str12;
            str6 = str11;
            str7 = str10;
            instantBankConfirmationBankDetails = instantBankConfirmationBankDetails2;
            i = 2047;
            externalBankAccessAction = externalBankAccessAction2;
            str2 = decodeStringElement4;
            str3 = decodeStringElement3;
            str4 = decodeStringElement2;
            str5 = str9;
            str8 = decodeStringElement;
        } else {
            int i4 = 0;
            boolean z = true;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction3 = null;
            java.lang.String str15 = null;
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails3 = null;
            java.lang.String str16 = null;
            java.lang.String str17 = null;
            java.lang.String str18 = null;
            java.lang.String str19 = null;
            java.lang.String str20 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i3 = 6;
                    case 0:
                        str20 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 9;
                        i3 = 6;
                    case 1:
                        str19 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 9;
                        i3 = 6;
                    case 2:
                        str18 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i2 = 9;
                        i3 = 6;
                    case 3:
                        str17 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        i2 = 9;
                        i3 = 6;
                    case 4:
                        str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str16);
                        i4 |= 16;
                        i2 = 9;
                        i3 = 6;
                    case 5:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i4 |= 32;
                        i2 = 9;
                    case 6:
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i4 |= 64;
                    case 7:
                        externalBankAccessAction3 = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), externalBankAccessAction3);
                        i4 |= 128;
                    case 8:
                        instantBankConfirmationBankDetails3 = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails$$serializer.INSTANCE, instantBankConfirmationBankDetails3);
                        i4 |= 256;
                    case 9:
                        str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str15);
                        i4 |= 512;
                    case 10:
                        addFIFlow2 = (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow) beginStructure.decodeSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), addFIFlow2);
                        i4 |= 1024;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i4;
            externalBankAccessAction = externalBankAccessAction3;
            str = str15;
            instantBankConfirmationBankDetails = instantBankConfirmationBankDetails3;
            addFIFlow = addFIFlow2;
            str2 = str17;
            str3 = str18;
            str4 = str19;
            str5 = str16;
            str6 = str13;
            str7 = str14;
            str8 = str20;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink(i, str8, str4, str3, str2, str5, str7, str6, externalBankAccessAction, instantBankConfirmationBankDetails, str, addFIFlow, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink.write$Self$wallet_prodRelease(value, beginStructure, serialDescriptor);
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
