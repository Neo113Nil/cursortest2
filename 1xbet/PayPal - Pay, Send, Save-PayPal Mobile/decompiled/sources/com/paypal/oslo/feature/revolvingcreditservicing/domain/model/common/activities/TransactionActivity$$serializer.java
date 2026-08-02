package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class TransactionActivity$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity$$serializer transactionActivity$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity$$serializer();
        INSTANCE = transactionActivity$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity", transactionActivity$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("amount", false);
        pluginGeneratedSerialDescriptor.addElement("creationDate", false);
        pluginGeneratedSerialDescriptor.addElement("transactionImage", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("isSettled", false);
        pluginGeneratedSerialDescriptor.addElement("transactionCashbackPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("businessName", false);
        pluginGeneratedSerialDescriptor.addElement("referenceId", false);
        pluginGeneratedSerialDescriptor.addElement("transactionType", true);
        pluginGeneratedSerialDescriptor.addElement("transactionName", true);
        pluginGeneratedSerialDescriptor.addElement("transactionFundingInstruments", true);
        pluginGeneratedSerialDescriptor.addElement("isCancellable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TransactionActivity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[3].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[10].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[12].getValue()), kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType;
        java.lang.String str;
        java.lang.Boolean bool;
        java.lang.String str2;
        java.time.Instant instant;
        java.lang.String str3;
        boolean z;
        java.lang.String str4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount;
        java.lang.String str5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage;
        int i;
        java.util.List list;
        java.lang.String str6;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType;
        kotlin.Lazy[] lazyArr2;
        java.util.List list2;
        java.time.Instant instant2;
        java.lang.String str7;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2;
        java.lang.String str8;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity.$childSerializers;
        int i2 = 9;
        char c = '\b';
        int i3 = 10;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            currencyAmount = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            instant = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage$$serializer.INSTANCE, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Boolean bool2 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType) beginStructure.decodeSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            java.lang.String str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), null);
            str3 = str13;
            z = beginStructure.decodeBooleanElement(serialDescriptor, 13);
            str6 = str12;
            str2 = str10;
            bool = bool2;
            transactionType = transactionType3;
            creditImage = creditImage4;
            activityType = activityType2;
            str5 = str9;
            i = 16383;
            str = str11;
            str4 = decodeStringElement;
        } else {
            int i4 = 13;
            int i5 = 0;
            boolean z2 = false;
            java.util.List list3 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            java.lang.Boolean bool3 = null;
            java.lang.String str16 = null;
            java.time.Instant instant3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType3 = null;
            java.lang.String str17 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage5 = null;
            java.lang.String str18 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = null;
            boolean z3 = true;
            java.lang.String str19 = null;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        list2 = list3;
                        z3 = false;
                        lazyArr = lazyArr2;
                        list3 = list2;
                        i4 = 13;
                        i2 = 9;
                        c = '\b';
                        i3 = 10;
                    case 0:
                        lazyArr2 = lazyArr;
                        list2 = list3;
                        instant2 = instant3;
                        str7 = str17;
                        creditImage2 = creditImage5;
                        currencyAmount2 = currencyAmount3;
                        i5 |= 1;
                        str18 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        activityType3 = activityType3;
                        currencyAmount3 = currencyAmount2;
                        str17 = str7;
                        creditImage5 = creditImage2;
                        instant3 = instant2;
                        lazyArr = lazyArr2;
                        list3 = list2;
                        i4 = 13;
                        i2 = 9;
                        c = '\b';
                        i3 = 10;
                    case 1:
                        list2 = list3;
                        instant2 = instant3;
                        str7 = str17;
                        creditImage2 = creditImage5;
                        currencyAmount2 = currencyAmount3;
                        lazyArr2 = lazyArr;
                        activityType3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), activityType3);
                        i5 |= 2;
                        currencyAmount3 = currencyAmount2;
                        str17 = str7;
                        creditImage5 = creditImage2;
                        instant3 = instant2;
                        lazyArr = lazyArr2;
                        list3 = list2;
                        i4 = 13;
                        i2 = 9;
                        c = '\b';
                        i3 = 10;
                    case 2:
                        instant2 = instant3;
                        str7 = str17;
                        creditImage2 = creditImage5;
                        list2 = list3;
                        currencyAmount2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount3);
                        i5 |= 4;
                        lazyArr2 = lazyArr;
                        currencyAmount3 = currencyAmount2;
                        str17 = str7;
                        creditImage5 = creditImage2;
                        instant3 = instant2;
                        lazyArr = lazyArr2;
                        list3 = list2;
                        i4 = 13;
                        i2 = 9;
                        c = '\b';
                        i3 = 10;
                    case 3:
                        str8 = str17;
                        creditImage3 = creditImage5;
                        i5 |= 8;
                        instant3 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), instant3);
                        str17 = str8;
                        creditImage5 = creditImage3;
                        i4 = 13;
                        i2 = 9;
                        c = '\b';
                        i3 = 10;
                    case 4:
                        str8 = str17;
                        i5 |= 16;
                        creditImage3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage$$serializer.INSTANCE, creditImage5);
                        str17 = str8;
                        creditImage5 = creditImage3;
                        i4 = 13;
                        i2 = 9;
                        c = '\b';
                        i3 = 10;
                    case 5:
                        i5 |= 32;
                        creditImage3 = creditImage5;
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str17);
                        str17 = str8;
                        creditImage5 = creditImage3;
                        i4 = 13;
                        i2 = 9;
                        c = '\b';
                        i3 = 10;
                    case 6:
                        i5 |= 64;
                        bool3 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool3);
                        str8 = str17;
                        creditImage3 = creditImage5;
                        str17 = str8;
                        creditImage5 = creditImage3;
                        i4 = 13;
                        i2 = 9;
                        c = '\b';
                        i3 = 10;
                    case 7:
                        i5 |= 128;
                        str19 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str19);
                        str8 = str17;
                        creditImage3 = creditImage5;
                        str17 = str8;
                        creditImage5 = creditImage3;
                        i4 = 13;
                        i2 = 9;
                        c = '\b';
                        i3 = 10;
                    case 8:
                        i5 |= 256;
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        str8 = str17;
                        creditImage3 = creditImage5;
                        str17 = str8;
                        creditImage5 = creditImage3;
                        i4 = 13;
                        i2 = 9;
                        c = '\b';
                        i3 = 10;
                    case 9:
                        i5 |= 512;
                        str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str15);
                        str8 = str17;
                        creditImage3 = creditImage5;
                        str17 = str8;
                        creditImage5 = creditImage3;
                        i4 = 13;
                        i2 = 9;
                        c = '\b';
                        i3 = 10;
                    case 10:
                        transactionType2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType) beginStructure.decodeSerializableElement(serialDescriptor, i3, (kotlinx.serialization.DeserializationStrategy) lazyArr[i3].getValue(), transactionType2);
                        i5 |= 1024;
                        i4 = 13;
                        c = '\b';
                    case 11:
                        str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, str16);
                        i5 |= 2048;
                        i4 = 13;
                        c = '\b';
                    case 12:
                        list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), list3);
                        i5 |= 4096;
                        i4 = 13;
                    case 13:
                        z2 = beginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i5 |= 8192;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.time.Instant instant4 = instant3;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType4 = activityType3;
            transactionType = transactionType2;
            str = str14;
            bool = bool3;
            str2 = str19;
            instant = instant4;
            str3 = str16;
            z = z2;
            str4 = str18;
            currencyAmount = currencyAmount3;
            str5 = str17;
            creditImage = creditImage5;
            i = i5;
            list = list3;
            str6 = str15;
            activityType = activityType4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity(i, str4, activityType, currencyAmount, instant, creditImage, str5, bool, str2, str, str6, transactionType, str3, list, z, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
