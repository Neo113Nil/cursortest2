package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/Billing$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/Billing;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/Billing;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/Billing;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Billing$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing$$serializer billing$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing$$serializer();
        INSTANCE = billing$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing", billing$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("autopayEnabled", false);
        pluginGeneratedSerialDescriptor.addElement("creditLine", false);
        pluginGeneratedSerialDescriptor.addElement("temporaryCreditLine", false);
        pluginGeneratedSerialDescriptor.addElement("currentBalance", false);
        pluginGeneratedSerialDescriptor.addElement("statementBalance", false);
        pluginGeneratedSerialDescriptor.addElement("remainingStatementBalance", false);
        pluginGeneratedSerialDescriptor.addElement("pastDueAmount", false);
        pluginGeneratedSerialDescriptor.addElement("minimumPaymentDue", false);
        pluginGeneratedSerialDescriptor.addElement("minimumPaymentToAvoidInterest", false);
        pluginGeneratedSerialDescriptor.addElement("nextPaymentDueTime", false);
        pluginGeneratedSerialDescriptor.addElement("openToBuy", false);
        pluginGeneratedSerialDescriptor.addElement("paymentStatus", false);
        pluginGeneratedSerialDescriptor.addElement("paymentStatusActions", false);
        pluginGeneratedSerialDescriptor.addElement("maxRepayableAmount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Billing$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[9].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[11].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[12].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus paymentStatus;
        java.time.Instant instant;
        java.util.List list;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount6;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount7;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount8;
        java.lang.Boolean bool;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount9;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount10;
        int i;
        kotlin.Lazy[] lazyArr2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount11;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount12;
        kotlin.Lazy[] lazyArr3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount13 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.Boolean bool2 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount14 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount15 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount16 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount17 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount18 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount19 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount20 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount21 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            java.time.Instant instant2 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount22 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus paymentStatus2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), null);
            list = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), null);
            paymentStatus = paymentStatus2;
            currencyAmount3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, null);
            currencyAmount4 = currencyAmount22;
            currencyAmount = currencyAmount20;
            currencyAmount9 = currencyAmount19;
            currencyAmount2 = currencyAmount21;
            currencyAmount5 = currencyAmount17;
            currencyAmount8 = currencyAmount15;
            instant = instant2;
            i = 16383;
            currencyAmount6 = currencyAmount14;
            bool = bool2;
            currencyAmount10 = currencyAmount18;
            currencyAmount7 = currencyAmount16;
        } else {
            int i4 = 13;
            int i5 = 0;
            boolean z = true;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount23 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount24 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount25 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus paymentStatus3 = null;
            java.time.Instant instant3 = null;
            java.util.List list2 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount26 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount27 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount28 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount29 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount30 = null;
            java.lang.Boolean bool3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount31 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        currencyAmount11 = currencyAmount23;
                        currencyAmount12 = currencyAmount30;
                        z = false;
                        currencyAmount23 = currencyAmount11;
                        lazyArr = lazyArr2;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        currencyAmount30 = currencyAmount12;
                    case 0:
                        lazyArr2 = lazyArr;
                        currencyAmount11 = currencyAmount23;
                        currencyAmount12 = currencyAmount30;
                        bool3 = (java.lang.Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, bool3);
                        i5 |= 1;
                        currencyAmount23 = currencyAmount11;
                        lazyArr = lazyArr2;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        currencyAmount30 = currencyAmount12;
                    case 1:
                        i5 |= 2;
                        lazyArr = lazyArr;
                        currencyAmount31 = currencyAmount31;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        currencyAmount30 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount30);
                        currencyAmount23 = currencyAmount23;
                    case 2:
                        lazyArr3 = lazyArr;
                        currencyAmount31 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount31);
                        i5 |= 4;
                        currencyAmount23 = currencyAmount23;
                        lazyArr = lazyArr3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                    case 3:
                        lazyArr3 = lazyArr;
                        currencyAmount23 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount23);
                        i5 |= 8;
                        lazyArr = lazyArr3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                    case 4:
                        lazyArr3 = lazyArr;
                        currencyAmount29 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount29);
                        i5 |= 16;
                        lazyArr = lazyArr3;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                    case 5:
                        currencyAmount28 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount28);
                        i5 |= 32;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                    case 6:
                        currencyAmount27 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount27);
                        i5 |= 64;
                        i4 = 13;
                        i2 = 10;
                    case 7:
                        currencyAmount24 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount24);
                        i5 |= 128;
                        i4 = 13;
                    case 8:
                        currencyAmount25 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount25);
                        i5 |= 256;
                        i4 = 13;
                    case 9:
                        instant3 = (java.time.Instant) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (kotlinx.serialization.DeserializationStrategy) lazyArr[i3].getValue(), instant3);
                        i5 |= 512;
                        i4 = 13;
                    case 10:
                        currencyAmount13 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount13);
                        i5 |= 1024;
                        i4 = 13;
                    case 11:
                        paymentStatus3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), paymentStatus3);
                        i5 |= 2048;
                        i4 = 13;
                    case 12:
                        list2 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), list2);
                        i5 |= 4096;
                        i4 = 13;
                    case 13:
                        currencyAmount26 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount$$serializer.INSTANCE, currencyAmount26);
                        i5 |= 8192;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount32 = currencyAmount27;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount33 = currencyAmount28;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount34 = currencyAmount29;
            currencyAmount = currencyAmount24;
            currencyAmount2 = currencyAmount25;
            paymentStatus = paymentStatus3;
            instant = instant3;
            list = list2;
            currencyAmount3 = currencyAmount26;
            currencyAmount4 = currencyAmount13;
            currencyAmount5 = currencyAmount34;
            currencyAmount6 = currencyAmount30;
            currencyAmount7 = currencyAmount23;
            currencyAmount8 = currencyAmount31;
            bool = bool3;
            currencyAmount9 = currencyAmount32;
            currencyAmount10 = currencyAmount33;
            i = i5;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing(i, bool, currencyAmount6, currencyAmount8, currencyAmount7, currencyAmount5, currencyAmount10, currencyAmount9, currencyAmount, currencyAmount2, instant, currencyAmount4, paymentStatus, list, currencyAmount3, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
