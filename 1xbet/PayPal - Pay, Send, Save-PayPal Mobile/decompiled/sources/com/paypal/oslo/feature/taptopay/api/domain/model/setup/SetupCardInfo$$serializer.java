package com.paypal.oslo.feature.taptopay.api.domain.model.setup;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class SetupCardInfo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo> {
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo$$serializer setupCardInfo$$serializer = new com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo$$serializer();
        INSTANCE = setupCardInfo$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo", setupCardInfo$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("cardNumber", false);
        pluginGeneratedSerialDescriptor.addElement("brand", true);
        pluginGeneratedSerialDescriptor.addElement("payLaterData", true);
        pluginGeneratedSerialDescriptor.addElement("cardArtCollection", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SetupCardInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection;
        java.lang.String str;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType;
        int i;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo.$childSerializers;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType3 = (com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData2 = (com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData$$serializer.INSTANCE, null);
            cardType = cardType3;
            str2 = decodeStringElement;
            cardArtCollection = (com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection$$serializer.INSTANCE, null);
            str = str4;
            payLaterData = payLaterData2;
            str3 = decodeStringElement2;
            i = 63;
        } else {
            int i2 = 0;
            boolean z = true;
            com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData3 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection2 = null;
            java.lang.String str7 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        cardType2 = (com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), cardType2);
                        i2 |= 2;
                        break;
                    case 2:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                        i2 |= 8;
                        break;
                    case 4:
                        payLaterData3 = (com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData$$serializer.INSTANCE, payLaterData3);
                        i2 |= 16;
                        break;
                    case 5:
                        cardArtCollection2 = (com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection$$serializer.INSTANCE, cardArtCollection2);
                        i2 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            cardArtCollection = cardArtCollection2;
            str = str5;
            cardType = cardType2;
            i = i2;
            java.lang.String str8 = str7;
            payLaterData = payLaterData3;
            str2 = str6;
            str3 = str8;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo(i, str2, cardType, str3, str, payLaterData, cardArtCollection, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo.write$Self$taptopay_api_prodRelease(value, beginStructure, serialDescriptor);
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
