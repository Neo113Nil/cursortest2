package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class RepaymentActivity$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$serializer repaymentActivity$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity$$serializer();
        INSTANCE = repaymentActivity$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity", repaymentActivity$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("repaymentType", false);
        pluginGeneratedSerialDescriptor.addElement("cancelable", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("amount", false);
        pluginGeneratedSerialDescriptor.addElement("creationDate", false);
        pluginGeneratedSerialDescriptor.addElement("paymentTime", true);
        pluginGeneratedSerialDescriptor.addElement("paymentChannel", false);
        pluginGeneratedSerialDescriptor.addElement("fundingInstruments", true);
        pluginGeneratedSerialDescriptor.addElement("transactionFundingInstruments", true);
        pluginGeneratedSerialDescriptor.addElement("transactionType", true);
        pluginGeneratedSerialDescriptor.addElement("referenceId", true);
        pluginGeneratedSerialDescriptor.addElement("isCancellable", true);
        pluginGeneratedSerialDescriptor.addElement("transactionCashbackPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("transactionName", true);
        pluginGeneratedSerialDescriptor.addElement("transactionImage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RepaymentActivity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[3].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[5].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[6].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[7].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[8].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[9].getValue()), lazyArr[10].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType;
        java.lang.Boolean bool;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount;
        java.util.List list;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel;
        java.time.Instant instant;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus;
        java.lang.String str2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType;
        java.lang.String str3;
        java.lang.String str4;
        boolean z;
        int i;
        java.time.Instant instant2;
        java.util.List list2;
        kotlin.Lazy[] lazyArr2;
        java.lang.String str5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.Boolean bool2 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            java.time.Instant instant3 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            java.time.Instant instant4 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            java.util.List list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            java.util.List list4 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType) beginStructure.decodeSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 11);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 12);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            creditImage = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage$$serializer.INSTANCE, null);
            list = list3;
            currencyAmount = currencyAmount2;
            instant2 = instant3;
            str = decodeStringElement2;
            list2 = list4;
            repaymentChannel = repaymentChannel2;
            instant = instant4;
            z = decodeBooleanElement;
            str2 = str6;
            transactionType = transactionType3;
            repaymentStatus = repaymentStatus2;
            i = 65535;
            repaymentType = repaymentType2;
            str4 = decodeStringElement;
            bool = bool2;
        } else {
            int i5 = 15;
            boolean z2 = false;
            boolean z3 = true;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType4 = null;
            java.util.List list5 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage2 = null;
            java.time.Instant instant5 = null;
            java.util.List list6 = null;
            java.lang.String str7 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus3 = null;
            java.lang.Boolean bool3 = null;
            str = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel3 = null;
            java.time.Instant instant6 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType3 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            int i6 = 0;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        str5 = str9;
                        transactionType2 = transactionType4;
                        z3 = false;
                        lazyArr = lazyArr2;
                        transactionType4 = transactionType2;
                        str9 = str5;
                        i4 = 8;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                    case 0:
                        lazyArr2 = lazyArr;
                        str5 = str9;
                        transactionType2 = transactionType4;
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        lazyArr = lazyArr2;
                        transactionType4 = transactionType2;
                        str9 = str5;
                        i4 = 8;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                    case 1:
                        str5 = str9;
                        transactionType2 = transactionType4;
                        lazyArr2 = lazyArr;
                        repaymentType3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), repaymentType3);
                        i6 |= 2;
                        lazyArr = lazyArr2;
                        transactionType4 = transactionType2;
                        str9 = str5;
                        i4 = 8;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                    case 2:
                        str5 = str9;
                        transactionType2 = transactionType4;
                        bool3 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool3);
                        i6 |= 4;
                        transactionType4 = transactionType2;
                        str9 = str5;
                        i4 = 8;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                    case 3:
                        str5 = str9;
                        repaymentStatus3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), repaymentStatus3);
                        i6 |= 8;
                        str9 = str5;
                        i4 = 8;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                    case 4:
                        str5 = str9;
                        currencyAmount3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount3);
                        i6 |= 16;
                        str9 = str5;
                        i4 = 8;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                    case 5:
                        instant5 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), instant5);
                        i6 |= 32;
                        i4 = 8;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                    case 6:
                        instant6 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), instant6);
                        i6 |= 64;
                        i4 = 8;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                    case 7:
                        repaymentChannel3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), repaymentChannel3);
                        i6 |= 128;
                        i4 = 8;
                        i5 = 15;
                        i2 = 10;
                    case 8:
                        list5 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (kotlinx.serialization.DeserializationStrategy) lazyArr[i4].getValue(), list5);
                        i6 |= 256;
                        i5 = 15;
                    case 9:
                        list6 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (kotlinx.serialization.DeserializationStrategy) lazyArr[i3].getValue(), list6);
                        i6 |= 512;
                        i5 = 15;
                    case 10:
                        transactionType4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType) beginStructure.decodeSerializableElement(serialDescriptor, i2, (kotlinx.serialization.DeserializationStrategy) lazyArr[i2].getValue(), transactionType4);
                        i6 |= 1024;
                        i5 = 15;
                    case 11:
                        str = beginStructure.decodeStringElement(serialDescriptor, 11);
                        i6 |= 2048;
                        i5 = 15;
                    case 12:
                        z2 = beginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i6 |= 4096;
                        i5 = 15;
                    case 13:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i6 |= 8192;
                        i5 = 15;
                    case 14:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i6 |= 16384;
                        i5 = 15;
                    case 15:
                        creditImage2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage$$serializer.INSTANCE, creditImage2);
                        i6 |= 32768;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus4 = repaymentStatus3;
            repaymentType = repaymentType3;
            bool = bool3;
            currencyAmount = currencyAmount3;
            list = list5;
            creditImage = creditImage2;
            repaymentChannel = repaymentChannel3;
            instant = instant6;
            repaymentStatus = repaymentStatus4;
            str2 = str7;
            transactionType = transactionType4;
            str3 = str9;
            str4 = str8;
            z = z2;
            i = i6;
            instant2 = instant5;
            list2 = list6;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity(i, str4, repaymentType, bool, repaymentStatus, currencyAmount, instant2, instant, repaymentChannel, list, list2, transactionType, str, z, str2, str3, creditImage, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
