package com.paypal.oslo.feature.qrc.domain.model.review;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingPlan$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingPlan;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingPlan;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingPlan;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FundingPlan$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan$$serializer fundingPlan$$serializer = new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan$$serializer();
        INSTANCE = fundingPlan$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan", fundingPlan$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("rank", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("payPalBalanceFundingSource", false);
        pluginGeneratedSerialDescriptor.addElement("isPPBalanceOptOutDefaultPlan", false);
        pluginGeneratedSerialDescriptor.addElement("fundingInstruments", false);
        pluginGeneratedSerialDescriptor.addElement("chargeableFundingSourceInOptOut", false);
        pluginGeneratedSerialDescriptor.addElement("currencyConversionInOptOut", false);
        pluginGeneratedSerialDescriptor.addElement("currencyConversionOverrideInOptOut", false);
        pluginGeneratedSerialDescriptor.addElement("currencyOverridePayPalBalanceFundingSource", false);
        pluginGeneratedSerialDescriptor.addElement("currencyOverrideFundingInstrument", false);
        pluginGeneratedSerialDescriptor.addElement("currencyOverrideDisallowedFundingSource", false);
        pluginGeneratedSerialDescriptor.addElement("currencyOverrideChargeableFundingInstrument", false);
        pluginGeneratedSerialDescriptor.addElement("currencyConversion", false);
        pluginGeneratedSerialDescriptor.addElement("currencyConversionOverride", false);
        pluginGeneratedSerialDescriptor.addElement("currencyConverterOptions", false);
        pluginGeneratedSerialDescriptor.addElement("currencyConversionProvider", false);
        pluginGeneratedSerialDescriptor.addElement("currencyConversionProviderInOptOut", false);
        pluginGeneratedSerialDescriptor.addElement("contingency", false);
        pluginGeneratedSerialDescriptor.addElement("contingencyInOptOut", false);
        pluginGeneratedSerialDescriptor.addElement("feeAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FundingPlan$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, lazyArr[2].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[15].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[16].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[17].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion2;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource2;
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency;
        java.util.List list;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter2;
        int i2;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource3;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion3;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource4;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource5;
        java.lang.String str;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion4;
        boolean z;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource6;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney;
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency2;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource7;
        kotlin.Lazy[] lazyArr2;
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency3;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource8;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion5;
        boolean z2;
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency4;
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency5;
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency6;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 1);
            com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus2 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource9 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 4);
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource10 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource11 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion6 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion7 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource12 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource13 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource14 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource15 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion8 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion9 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, null);
            java.util.List list2 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, (kotlinx.serialization.DeserializationStrategy) lazyArr[15].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter3 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter) beginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (kotlinx.serialization.DeserializationStrategy) lazyArr[16].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter4 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter) beginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (kotlinx.serialization.DeserializationStrategy) lazyArr[17].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency7 = (com.paypal.oslo.feature.qrc.domain.model.review.Contingency) beginStructure.decodeNullableSerializableElement(serialDescriptor, 18, com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE, null);
            contingency = (com.paypal.oslo.feature.qrc.domain.model.review.Contingency) beginStructure.decodeNullableSerializableElement(serialDescriptor, 19, com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE, null);
            currencyConverter = currencyConverter3;
            fundingSource6 = fundingSource9;
            qrcMoney = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 20, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, null);
            currencyConversion = currencyConversion6;
            contingency2 = contingency7;
            currencyConverter2 = currencyConverter4;
            currencyConversion2 = currencyConversion9;
            list = list2;
            currencyConversion3 = currencyConversion7;
            i2 = decodeIntElement;
            fundingSource5 = fundingSource13;
            fundingSource3 = fundingSource11;
            fundingSource7 = fundingSource10;
            z = decodeBooleanElement;
            fundingOptionStatus = fundingOptionStatus2;
            i = 2097151;
            fundingSource4 = fundingSource12;
            str = decodeStringElement;
            currencyConversion4 = currencyConversion8;
            fundingSource = fundingSource15;
            fundingSource2 = fundingSource14;
        } else {
            i = 0;
            int i4 = 0;
            boolean z3 = true;
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource16 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion10 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter5 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion11 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource17 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource18 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency8 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2 = null;
            java.util.List list3 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion12 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion13 = null;
            java.lang.String str2 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter6 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource19 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource20 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus3 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource21 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource22 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency9 = null;
            boolean z4 = false;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        contingency3 = contingency9;
                        fundingSource8 = fundingSource16;
                        currencyConversion5 = currencyConversion10;
                        z2 = z4;
                        z3 = false;
                        contingency9 = contingency3;
                        lazyArr = lazyArr2;
                        fundingSource16 = fundingSource8;
                        currencyConversion10 = currencyConversion5;
                        z4 = z2;
                    case 0:
                        lazyArr2 = lazyArr;
                        contingency3 = contingency9;
                        fundingSource8 = fundingSource16;
                        currencyConversion5 = currencyConversion10;
                        z2 = z4;
                        str2 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        contingency9 = contingency3;
                        lazyArr = lazyArr2;
                        fundingSource16 = fundingSource8;
                        currencyConversion10 = currencyConversion5;
                        z4 = z2;
                    case 1:
                        lazyArr2 = lazyArr;
                        contingency3 = contingency9;
                        fundingSource8 = fundingSource16;
                        currencyConversion5 = currencyConversion10;
                        z2 = z4;
                        i4 = beginStructure.decodeIntElement(serialDescriptor, 1);
                        i |= 2;
                        contingency9 = contingency3;
                        lazyArr = lazyArr2;
                        fundingSource16 = fundingSource8;
                        currencyConversion10 = currencyConversion5;
                        z4 = z2;
                    case 2:
                        contingency3 = contingency9;
                        fundingSource8 = fundingSource16;
                        currencyConversion5 = currencyConversion10;
                        z2 = z4;
                        lazyArr2 = lazyArr;
                        fundingOptionStatus3 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), fundingOptionStatus3);
                        i |= 4;
                        contingency9 = contingency3;
                        lazyArr = lazyArr2;
                        fundingSource16 = fundingSource8;
                        currencyConversion10 = currencyConversion5;
                        z4 = z2;
                    case 3:
                        contingency4 = contingency9;
                        fundingSource8 = fundingSource16;
                        currencyConversion5 = currencyConversion10;
                        z2 = z4;
                        fundingSource21 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, fundingSource21);
                        i |= 8;
                        contingency9 = contingency4;
                        fundingSource16 = fundingSource8;
                        currencyConversion10 = currencyConversion5;
                        z4 = z2;
                    case 4:
                        i |= 16;
                        contingency9 = contingency9;
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                        fundingSource16 = fundingSource16;
                        currencyConversion10 = currencyConversion10;
                    case 5:
                        contingency4 = contingency9;
                        currencyConversion5 = currencyConversion10;
                        z2 = z4;
                        fundingSource8 = fundingSource16;
                        fundingSource22 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, fundingSource22);
                        i |= 32;
                        contingency9 = contingency4;
                        fundingSource16 = fundingSource8;
                        currencyConversion10 = currencyConversion5;
                        z4 = z2;
                    case 6:
                        contingency5 = contingency9;
                        currencyConversion5 = currencyConversion10;
                        z2 = z4;
                        fundingSource16 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, fundingSource16);
                        i |= 64;
                        contingency9 = contingency5;
                        currencyConversion10 = currencyConversion5;
                        z4 = z2;
                    case 7:
                        currencyConversion5 = currencyConversion10;
                        z2 = z4;
                        currencyConversion13 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, currencyConversion13);
                        i |= 128;
                        contingency9 = contingency9;
                        currencyConversion12 = currencyConversion12;
                        currencyConversion10 = currencyConversion5;
                        z4 = z2;
                    case 8:
                        currencyConversion5 = currencyConversion10;
                        z2 = z4;
                        currencyConversion12 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, currencyConversion12);
                        i |= 256;
                        contingency9 = contingency9;
                        fundingSource19 = fundingSource19;
                        currencyConversion10 = currencyConversion5;
                        z4 = z2;
                    case 9:
                        currencyConversion5 = currencyConversion10;
                        z2 = z4;
                        fundingSource19 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, fundingSource19);
                        i |= 512;
                        contingency9 = contingency9;
                        fundingSource20 = fundingSource20;
                        currencyConversion10 = currencyConversion5;
                        z4 = z2;
                    case 10:
                        contingency5 = contingency9;
                        z2 = z4;
                        currencyConversion5 = currencyConversion10;
                        fundingSource20 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, fundingSource20);
                        i |= 1024;
                        contingency9 = contingency5;
                        currencyConversion10 = currencyConversion5;
                        z4 = z2;
                    case 11:
                        contingency6 = contingency9;
                        z2 = z4;
                        fundingSource18 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, fundingSource18);
                        i |= 2048;
                        contingency9 = contingency6;
                        z4 = z2;
                    case 12:
                        contingency6 = contingency9;
                        z2 = z4;
                        fundingSource17 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, com.paypal.oslo.feature.qrc.domain.model.review.FundingSource$$serializer.INSTANCE, fundingSource17);
                        i |= 4096;
                        contingency9 = contingency6;
                        z4 = z2;
                    case 13:
                        contingency6 = contingency9;
                        z2 = z4;
                        currencyConversion10 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, currencyConversion10);
                        i |= 8192;
                        contingency9 = contingency6;
                        z4 = z2;
                    case 14:
                        z2 = z4;
                        currencyConversion11 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion$$serializer.INSTANCE, currencyConversion11);
                        i |= 16384;
                        contingency9 = contingency9;
                        currencyConverter6 = currencyConverter6;
                        z4 = z2;
                    case 15:
                        contingency6 = contingency9;
                        z2 = z4;
                        list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, (kotlinx.serialization.DeserializationStrategy) lazyArr[15].getValue(), list3);
                        i |= 32768;
                        contingency9 = contingency6;
                        z4 = z2;
                    case 16:
                        contingency6 = contingency9;
                        z2 = z4;
                        currencyConverter5 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter) beginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (kotlinx.serialization.DeserializationStrategy) lazyArr[16].getValue(), currencyConverter5);
                        i |= 65536;
                        contingency9 = contingency6;
                        z4 = z2;
                    case 17:
                        z2 = z4;
                        contingency6 = contingency9;
                        currencyConverter6 = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter) beginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (kotlinx.serialization.DeserializationStrategy) lazyArr[17].getValue(), currencyConverter6);
                        i |= 131072;
                        contingency9 = contingency6;
                        z4 = z2;
                    case 18:
                        z2 = z4;
                        contingency9 = (com.paypal.oslo.feature.qrc.domain.model.review.Contingency) beginStructure.decodeNullableSerializableElement(serialDescriptor, 18, com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE, contingency9);
                        i3 = 262144;
                        i |= i3;
                        z4 = z2;
                    case 19:
                        z2 = z4;
                        contingency8 = (com.paypal.oslo.feature.qrc.domain.model.review.Contingency) beginStructure.decodeNullableSerializableElement(serialDescriptor, 19, com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE, contingency8);
                        i3 = 524288;
                        i |= i3;
                        z4 = z2;
                    case 20:
                        qrcMoney2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 20, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, qrcMoney2);
                        i |= 1048576;
                        z4 = z4;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            currencyConversion = currencyConversion13;
            currencyConverter = currencyConverter5;
            currencyConversion2 = currencyConversion11;
            fundingSource = fundingSource17;
            fundingSource2 = fundingSource18;
            contingency = contingency8;
            list = list3;
            currencyConverter2 = currencyConverter6;
            i2 = i4;
            fundingSource3 = fundingSource16;
            currencyConversion3 = currencyConversion12;
            fundingSource4 = fundingSource19;
            fundingSource5 = fundingSource20;
            str = str2;
            currencyConversion4 = currencyConversion10;
            z = z4;
            fundingSource6 = fundingSource21;
            qrcMoney = qrcMoney2;
            contingency2 = contingency9;
            fundingOptionStatus = fundingOptionStatus3;
            fundingSource7 = fundingSource22;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(i, str, i2, fundingOptionStatus, fundingSource6, z, fundingSource7, fundingSource3, currencyConversion, currencyConversion3, fundingSource4, fundingSource5, fundingSource2, fundingSource, currencyConversion4, currencyConversion2, list, currencyConverter, currencyConverter2, contingency2, contingency, qrcMoney, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan.write$Self$qrc_prodRelease(value, beginStructure, serialDescriptor);
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
