package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AutopayOverview$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview$$serializer autopayOverview$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview$$serializer();
        INSTANCE = autopayOverview$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview", autopayOverview$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("enrolled", false);
        pluginGeneratedSerialDescriptor.addElement("enrollmentEligible", false);
        pluginGeneratedSerialDescriptor.addElement("repaymentOption", false);
        pluginGeneratedSerialDescriptor.addElement("customAmount", false);
        pluginGeneratedSerialDescriptor.addElement("fundingInstruments", false);
        pluginGeneratedSerialDescriptor.addElement("effectiveDueTime", false);
        pluginGeneratedSerialDescriptor.addElement("paymentConstraints", false);
        pluginGeneratedSerialDescriptor.addElement("effectiveInCurrentBillingCycle", false);
        pluginGeneratedSerialDescriptor.addElement("eligibleFundingInstruments", false);
        pluginGeneratedSerialDescriptor.addElement("autopayTermsUrl", false);
        pluginGeneratedSerialDescriptor.addElement("maxAllowableRepaymentAmount", false);
        pluginGeneratedSerialDescriptor.addElement("creditAccountId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AutopayOverview$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[2].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[5].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[8].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount;
        java.lang.Boolean bool;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2;
        java.time.Instant instant;
        java.lang.Boolean bool2;
        java.util.List list2;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints;
        boolean z;
        kotlin.Lazy[] lazyArr2;
        java.time.Instant instant2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3;
        java.util.List list3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        if (beginStructure.decodeSequentially()) {
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 0);
            bool2 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            java.util.List list4 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.time.Instant instant3 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints$$serializer.INSTANCE, null);
            java.lang.Boolean bool3 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            java.util.List list5 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            java.lang.String str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            list = list5;
            str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            currencyAmount = currencyAmount5;
            str = str3;
            bool = bool3;
            paymentConstraints = paymentConstraints2;
            instant = instant3;
            z = decodeBooleanElement;
            currencyAmount2 = currencyAmount4;
            i = 4095;
            paymentOption = paymentOption3;
            list2 = list4;
        } else {
            int i5 = 11;
            java.util.List list6 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints3 = null;
            java.lang.Boolean bool4 = null;
            java.lang.String str4 = null;
            java.time.Instant instant4 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount6 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption4 = null;
            java.lang.Boolean bool5 = null;
            java.util.List list7 = null;
            boolean z2 = true;
            int i6 = 0;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount7 = null;
            boolean z3 = false;
            java.lang.String str5 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        z2 = false;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 0:
                        lazyArr2 = lazyArr;
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i6 |= 1;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 1:
                        lazyArr2 = lazyArr;
                        instant2 = instant4;
                        currencyAmount3 = currencyAmount6;
                        list3 = list7;
                        paymentOption2 = paymentOption4;
                        i6 |= 2;
                        bool5 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool5);
                        currencyAmount6 = currencyAmount3;
                        instant4 = instant2;
                        list7 = list3;
                        paymentOption4 = paymentOption2;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 2:
                        instant2 = instant4;
                        currencyAmount3 = currencyAmount6;
                        list3 = list7;
                        lazyArr2 = lazyArr;
                        i6 |= 4;
                        paymentOption2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), paymentOption4);
                        currencyAmount6 = currencyAmount3;
                        instant4 = instant2;
                        list7 = list3;
                        paymentOption4 = paymentOption2;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 3:
                        instant2 = instant4;
                        list3 = list7;
                        currencyAmount3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount6);
                        lazyArr2 = lazyArr;
                        i6 |= 8;
                        paymentOption2 = paymentOption4;
                        currencyAmount6 = currencyAmount3;
                        instant4 = instant2;
                        list7 = list3;
                        paymentOption4 = paymentOption2;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 4:
                        instant2 = instant4;
                        lazyArr2 = lazyArr;
                        i6 |= 16;
                        currencyAmount3 = currencyAmount6;
                        paymentOption2 = paymentOption4;
                        list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list7);
                        currencyAmount6 = currencyAmount3;
                        instant4 = instant2;
                        list7 = list3;
                        paymentOption4 = paymentOption2;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 5:
                        lazyArr2 = lazyArr;
                        i6 |= 32;
                        paymentOption2 = paymentOption4;
                        list3 = list7;
                        instant2 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), instant4);
                        currencyAmount3 = currencyAmount6;
                        currencyAmount6 = currencyAmount3;
                        instant4 = instant2;
                        list7 = list3;
                        paymentOption4 = paymentOption2;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 6:
                        i6 |= 64;
                        lazyArr2 = lazyArr;
                        paymentConstraints3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints$$serializer.INSTANCE, paymentConstraints3);
                        instant2 = instant4;
                        currencyAmount3 = currencyAmount6;
                        paymentOption2 = paymentOption4;
                        list3 = list7;
                        currencyAmount6 = currencyAmount3;
                        instant4 = instant2;
                        list7 = list3;
                        paymentOption4 = paymentOption2;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 7:
                        i6 |= 128;
                        lazyArr2 = lazyArr;
                        bool4 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool4);
                        instant2 = instant4;
                        currencyAmount3 = currencyAmount6;
                        paymentOption2 = paymentOption4;
                        list3 = list7;
                        currencyAmount6 = currencyAmount3;
                        instant4 = instant2;
                        list7 = list3;
                        paymentOption4 = paymentOption2;
                        lazyArr = lazyArr2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 8:
                        list6 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (kotlinx.serialization.DeserializationStrategy) lazyArr[i4].getValue(), list6);
                        i6 |= 256;
                    case 9:
                        str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str4);
                        i6 |= 512;
                    case 10:
                        currencyAmount7 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount7);
                        i6 |= 1024;
                    case 11:
                        str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                        i6 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.time.Instant instant5 = instant4;
            list = list6;
            currencyAmount = currencyAmount7;
            bool = bool4;
            str = str4;
            str2 = str5;
            paymentOption = paymentOption4;
            currencyAmount2 = currencyAmount6;
            instant = instant5;
            bool2 = bool5;
            list2 = list7;
            i = i6;
            paymentConstraints = paymentConstraints3;
            z = z3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview(i, z, bool2, paymentOption, currencyAmount2, list2, instant, paymentConstraints, bool, list, str, currencyAmount, str2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
