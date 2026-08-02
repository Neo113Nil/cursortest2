package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class PayPalDigitizedCard$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard$$serializer payPalDigitizedCard$$serializer = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard$$serializer();
        INSTANCE = payPalDigitizedCard$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard", payPalDigitizedCard$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("payPalCardId", false);
        pluginGeneratedSerialDescriptor.addElement("deviceWalletServiceCardId", false);
        pluginGeneratedSerialDescriptor.addElement("digitizedCard", false);
        pluginGeneratedSerialDescriptor.addElement("cardArtCollection", true);
        pluginGeneratedSerialDescriptor.addElement("cardInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PayPalDigitizedCard$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId$PayPalCardId$$serializer.INSTANCE, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId$DeviceWalletServiceCardId$$serializer.INSTANCE, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard.$childSerializers;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard2 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId$PayPalCardId$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId$DeviceWalletServiceCardId$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard3 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection$$serializer.INSTANCE, null);
            cardInfo = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            payPalCardId = payPalCardId2;
            cardArtCollection = cardArtCollection2;
            digitizedCard = digitizedCard3;
            deviceWalletServiceCardId = deviceWalletServiceCardId2;
            i = 31;
        } else {
            int i2 = 0;
            boolean z = true;
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo2 = null;
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection3 = null;
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId3 = null;
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    payPalCardId3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId$PayPalCardId$$serializer.INSTANCE, payPalCardId3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    deviceWalletServiceCardId3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId$DeviceWalletServiceCardId$$serializer.INSTANCE, deviceWalletServiceCardId3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    digitizedCard2 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard$$serializer.INSTANCE, digitizedCard2);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    cardArtCollection3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection$$serializer.INSTANCE, cardArtCollection3);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    cardInfo2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), cardInfo2);
                    i2 |= 16;
                }
            }
            i = i2;
            digitizedCard = digitizedCard2;
            cardInfo = cardInfo2;
            cardArtCollection = cardArtCollection3;
            deviceWalletServiceCardId = deviceWalletServiceCardId3;
            payPalCardId = payPalCardId3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(i, payPalCardId, deviceWalletServiceCardId, digitizedCard, cardArtCollection, cardInfo, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard.write$Self$taptopay_prodRelease(value, beginStructure, serialDescriptor);
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
