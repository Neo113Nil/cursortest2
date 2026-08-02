package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivity;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class PromotionalActivity$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity$$serializer promotionalActivity$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity$$serializer();
        INSTANCE = promotionalActivity$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity", promotionalActivity$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("promoId", false);
        pluginGeneratedSerialDescriptor.addElement("purchaseDate", false);
        pluginGeneratedSerialDescriptor.addElement("purchaseAmount", false);
        pluginGeneratedSerialDescriptor.addElement("remainingBalance", false);
        pluginGeneratedSerialDescriptor.addElement("expirationDate", false);
        pluginGeneratedSerialDescriptor.addElement("accruedInterest", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("offerConstruct", false);
        pluginGeneratedSerialDescriptor.addElement("creditInstrument", true);
        pluginGeneratedSerialDescriptor.addElement("currentOfferContext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PromotionalActivity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[1].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[8].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstruct$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalCreditInstrument$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus promotionalActivityStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstruct offerConstruct;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext currentOfferContext;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalCreditInstrument promotionalCreditInstrument;
        java.time.Instant instant;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2;
        java.time.Instant instant2;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.util.UUID uuid;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4;
        java.time.Instant instant3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount6;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        int i5 = 8;
        java.util.UUID uuid2 = null;
        if (beginStructure.decodeSequentially()) {
            java.util.UUID uuid3 = (java.util.UUID) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            java.time.Instant instant4 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount7 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount8 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            java.time.Instant instant5 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount9 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            java.lang.String str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus promotionalActivityStatus2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus) beginStructure.decodeSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstruct offerConstruct2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstruct) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstruct$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalCreditInstrument promotionalCreditInstrument2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalCreditInstrument) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalCreditInstrument$$serializer.INSTANCE, null);
            promotionalActivityStatus = promotionalActivityStatus2;
            currentOfferContext = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext$$serializer.INSTANCE, null);
            promotionalCreditInstrument = promotionalCreditInstrument2;
            offerConstruct = offerConstruct2;
            str = str4;
            str2 = str3;
            currencyAmount2 = currencyAmount9;
            i = 4095;
            currencyAmount = currencyAmount7;
            instant2 = instant4;
            instant = instant5;
            currencyAmount3 = currencyAmount8;
            uuid = uuid3;
        } else {
            int i6 = 11;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus promotionalActivityStatus3 = null;
            java.lang.String str5 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstruct offerConstruct3 = null;
            java.lang.String str6 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount10 = null;
            java.time.Instant instant6 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount11 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount12 = null;
            java.time.Instant instant7 = null;
            int i7 = 0;
            boolean z = true;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext currentOfferContext2 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalCreditInstrument promotionalCreditInstrument3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i6 = 11;
                        i4 = 9;
                        i5 = 8;
                    case 0:
                        currencyAmount4 = currencyAmount10;
                        instant3 = instant6;
                        currencyAmount5 = currencyAmount11;
                        currencyAmount6 = currencyAmount12;
                        uuid2 = (java.util.UUID) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), uuid2);
                        i7 |= 1;
                        instant7 = instant7;
                        currencyAmount11 = currencyAmount5;
                        currencyAmount12 = currencyAmount6;
                        instant6 = instant3;
                        currencyAmount10 = currencyAmount4;
                        i6 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 1:
                        currencyAmount4 = currencyAmount10;
                        currencyAmount5 = currencyAmount11;
                        currencyAmount6 = currencyAmount12;
                        instant3 = instant6;
                        instant7 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), instant7);
                        i2 = i7 | 2;
                        i7 = i2;
                        currencyAmount11 = currencyAmount5;
                        currencyAmount12 = currencyAmount6;
                        instant6 = instant3;
                        currencyAmount10 = currencyAmount4;
                        i6 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 2:
                        currencyAmount5 = currencyAmount11;
                        currencyAmount4 = currencyAmount10;
                        currencyAmount12 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount12);
                        i2 = i7 | 4;
                        instant3 = instant6;
                        currencyAmount6 = currencyAmount12;
                        i7 = i2;
                        currencyAmount11 = currencyAmount5;
                        currencyAmount12 = currencyAmount6;
                        instant6 = instant3;
                        currencyAmount10 = currencyAmount4;
                        i6 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 3:
                        currencyAmount4 = currencyAmount10;
                        i2 = i7 | 8;
                        instant3 = instant6;
                        currencyAmount5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount11);
                        currencyAmount6 = currencyAmount12;
                        i7 = i2;
                        currencyAmount11 = currencyAmount5;
                        currencyAmount12 = currencyAmount6;
                        instant6 = instant3;
                        currencyAmount10 = currencyAmount4;
                        i6 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 4:
                        currencyAmount4 = currencyAmount10;
                        instant3 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), instant6);
                        i7 |= 16;
                        currencyAmount5 = currencyAmount11;
                        currencyAmount6 = currencyAmount12;
                        currencyAmount11 = currencyAmount5;
                        currencyAmount12 = currencyAmount6;
                        instant6 = instant3;
                        currencyAmount10 = currencyAmount4;
                        i6 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 5:
                        currencyAmount4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount10);
                        i7 |= 32;
                        instant3 = instant6;
                        currencyAmount5 = currencyAmount11;
                        currencyAmount6 = currencyAmount12;
                        currencyAmount11 = currencyAmount5;
                        currencyAmount12 = currencyAmount6;
                        instant6 = instant3;
                        currencyAmount10 = currencyAmount4;
                        i6 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 6:
                        i7 |= 64;
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        currencyAmount4 = currencyAmount10;
                        instant3 = instant6;
                        currencyAmount5 = currencyAmount11;
                        currencyAmount6 = currencyAmount12;
                        currencyAmount11 = currencyAmount5;
                        currencyAmount12 = currencyAmount6;
                        instant6 = instant3;
                        currencyAmount10 = currencyAmount4;
                        i6 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 7:
                        i7 |= 128;
                        str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                        currencyAmount4 = currencyAmount10;
                        instant3 = instant6;
                        currencyAmount5 = currencyAmount11;
                        currencyAmount6 = currencyAmount12;
                        currencyAmount11 = currencyAmount5;
                        currencyAmount12 = currencyAmount6;
                        instant6 = instant3;
                        currencyAmount10 = currencyAmount4;
                        i6 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 8:
                        promotionalActivityStatus3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus) beginStructure.decodeSerializableElement(serialDescriptor, i5, (kotlinx.serialization.DeserializationStrategy) lazyArr[i5].getValue(), promotionalActivityStatus3);
                        i7 |= 256;
                    case 9:
                        offerConstruct3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstruct) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstruct$$serializer.INSTANCE, offerConstruct3);
                        i7 |= 512;
                    case 10:
                        promotionalCreditInstrument3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalCreditInstrument) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalCreditInstrument$$serializer.INSTANCE, promotionalCreditInstrument3);
                        i7 |= 1024;
                    case 11:
                        currentOfferContext2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext) beginStructure.decodeNullableSerializableElement(serialDescriptor, i6, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.CurrentOfferContext$$serializer.INSTANCE, currentOfferContext2);
                        i7 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount13 = currencyAmount10;
            java.time.Instant instant8 = instant6;
            currencyAmount = currencyAmount12;
            promotionalActivityStatus = promotionalActivityStatus3;
            offerConstruct = offerConstruct3;
            currentOfferContext = currentOfferContext2;
            promotionalCreditInstrument = promotionalCreditInstrument3;
            instant = instant8;
            currencyAmount2 = currencyAmount13;
            instant2 = instant7;
            i = i7;
            str = str5;
            str2 = str6;
            uuid = uuid2;
            currencyAmount3 = currencyAmount11;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity(i, uuid, instant2, currencyAmount, currencyAmount3, instant, currencyAmount2, str2, str, promotionalActivityStatus, offerConstruct, promotionalCreditInstrument, currentOfferContext, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
