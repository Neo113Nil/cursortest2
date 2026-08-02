package com.paypal.oslo.feature.qrc.domain.model.review;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class PaymentOptions$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions$$serializer paymentOptions$$serializer = new com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions$$serializer();
        INSTANCE = paymentOptions$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions", paymentOptions$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("fundingOptions", false);
        pluginGeneratedSerialDescriptor.addElement("disallowedOptions", false);
        pluginGeneratedSerialDescriptor.addElement("preferredFundingOptionId", false);
        pluginGeneratedSerialDescriptor.addElement("eligibleFiList", false);
        pluginGeneratedSerialDescriptor.addElement("eligibleFiListInOptOutCase", false);
        pluginGeneratedSerialDescriptor.addElement("currencyOverrideEligibleFiList", false);
        pluginGeneratedSerialDescriptor.addElement("currencyOverrideEligibleFiListInOptOutCase", false);
        pluginGeneratedSerialDescriptor.addElement("isMultiCurrencyTransaction", false);
        pluginGeneratedSerialDescriptor.addElement("fundingPlanFundingSourceMap", false);
        pluginGeneratedSerialDescriptor.addElement("fundingPlanFundingSourceMapInOptOutCase", false);
        pluginGeneratedSerialDescriptor.addElement("currencyOverrideFundingPlanFundingSourceMap", false);
        pluginGeneratedSerialDescriptor.addElement("currencyOverrideFundingPlanFundingSourceMapInOptOutCase", false);
        pluginGeneratedSerialDescriptor.addElement("threeDSContingencyFundingOptionIdMap", false);
        pluginGeneratedSerialDescriptor.addElement("threeDSContingency", false);
        pluginGeneratedSerialDescriptor.addElement("hasFundingInstrumentContingency", true);
        pluginGeneratedSerialDescriptor.addElement("totalAmount", true);
        pluginGeneratedSerialDescriptor.addElement("paymentAmount", true);
        pluginGeneratedSerialDescriptor.addElement("tipAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentOptions$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[3].getValue(), lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue(), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, lazyArr[8].getValue(), lazyArr[9].getValue(), lazyArr[10].getValue(), lazyArr[11].getValue(), lazyArr[12].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        java.util.Map map;
        java.util.Map map2;
        java.lang.String str;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney;
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2;
        java.util.List list2;
        java.util.List list3;
        java.util.List list4;
        java.util.Map map3;
        java.util.Map map4;
        boolean z;
        int i;
        java.util.List list5;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney3;
        java.util.List list6;
        boolean z2;
        java.util.Map map5;
        java.util.Map map6;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney4;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney5;
        int i2;
        java.util.Map map7;
        java.util.List list7;
        java.util.List list8;
        kotlin.Lazy[] lazyArr2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            java.util.List list9 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            java.util.List list10 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.List list11 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            java.util.List list12 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.util.List list13 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            java.util.List list14 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 7);
            java.util.Map map8 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            java.util.Map map9 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            java.util.Map map10 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            java.util.Map map11 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), null);
            java.util.Map map12 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), null);
            com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency2 = (com.paypal.oslo.feature.qrc.domain.model.review.Contingency) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE, null);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 14);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney6 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, null);
            qrcMoney2 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 16, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, null);
            qrcMoney = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 17, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, null);
            list2 = list13;
            map3 = map8;
            z2 = decodeBooleanElement;
            map2 = map10;
            map5 = map9;
            z = decodeBooleanElement2;
            qrcMoney3 = qrcMoney6;
            map4 = map11;
            contingency = contingency2;
            map = map12;
            list4 = list12;
            list5 = list10;
            list3 = list11;
            str = str2;
            i = 262143;
            list6 = list14;
            list = list9;
        } else {
            int i3 = 0;
            int i4 = 17;
            boolean z3 = false;
            boolean z4 = true;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney7 = null;
            java.util.Map map13 = null;
            java.util.List list15 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney8 = null;
            java.util.Map map14 = null;
            java.util.Map map15 = null;
            java.util.List list16 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney9 = null;
            com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency3 = null;
            java.lang.String str3 = null;
            java.util.List list17 = null;
            java.util.Map map16 = null;
            java.util.Map map17 = null;
            java.util.List list18 = null;
            java.util.List list19 = null;
            java.util.List list20 = null;
            boolean z5 = false;
            while (z4) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        map7 = map13;
                        list7 = list15;
                        list8 = list19;
                        lazyArr2 = lazyArr;
                        z4 = false;
                        map13 = map7;
                        lazyArr = lazyArr2;
                        i4 = 17;
                        list19 = list8;
                        list15 = list7;
                    case 0:
                        map7 = map13;
                        list7 = list15;
                        list8 = list19;
                        lazyArr2 = lazyArr;
                        list20 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), list20);
                        i3 |= 1;
                        qrcMoney7 = qrcMoney7;
                        map13 = map7;
                        lazyArr = lazyArr2;
                        i4 = 17;
                        list19 = list8;
                        list15 = list7;
                    case 1:
                        map6 = map13;
                        list19 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), list19);
                        i3 |= 2;
                        qrcMoney7 = qrcMoney7;
                        list15 = list15;
                        map13 = map6;
                        i4 = 17;
                    case 2:
                        map6 = map13;
                        str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str3);
                        i3 |= 4;
                        qrcMoney7 = qrcMoney7;
                        list17 = list17;
                        map13 = map6;
                        i4 = 17;
                    case 3:
                        map6 = map13;
                        list17 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), list17);
                        i3 |= 8;
                        qrcMoney7 = qrcMoney7;
                        list18 = list18;
                        map13 = map6;
                        i4 = 17;
                    case 4:
                        map6 = map13;
                        list18 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list18);
                        i3 |= 16;
                        qrcMoney7 = qrcMoney7;
                        map17 = map17;
                        map13 = map6;
                        i4 = 17;
                    case 5:
                        qrcMoney4 = qrcMoney7;
                        map6 = map13;
                        list15 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), list15);
                        i3 |= 32;
                        qrcMoney7 = qrcMoney4;
                        map13 = map6;
                        i4 = 17;
                    case 6:
                        qrcMoney4 = qrcMoney7;
                        map6 = map13;
                        list16 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), list16);
                        i3 |= 64;
                        qrcMoney7 = qrcMoney4;
                        map13 = map6;
                        i4 = 17;
                    case 7:
                        qrcMoney4 = qrcMoney7;
                        map6 = map13;
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i3 |= 128;
                        qrcMoney7 = qrcMoney4;
                        map13 = map6;
                        i4 = 17;
                    case 8:
                        qrcMoney4 = qrcMoney7;
                        map6 = map13;
                        map17 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), map17);
                        i3 |= 256;
                        qrcMoney7 = qrcMoney4;
                        map13 = map6;
                        i4 = 17;
                    case 9:
                        qrcMoney5 = qrcMoney7;
                        map16 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), map16);
                        i3 |= 512;
                        qrcMoney7 = qrcMoney5;
                        i4 = 17;
                    case 10:
                        map15 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), map15);
                        i3 |= 1024;
                        qrcMoney7 = qrcMoney7;
                        i4 = 17;
                    case 11:
                        qrcMoney5 = qrcMoney7;
                        map13 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), map13);
                        i3 |= 2048;
                        qrcMoney7 = qrcMoney5;
                        i4 = 17;
                    case 12:
                        qrcMoney5 = qrcMoney7;
                        map14 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), map14);
                        i3 |= 4096;
                        qrcMoney7 = qrcMoney5;
                        i4 = 17;
                    case 13:
                        qrcMoney5 = qrcMoney7;
                        contingency3 = (com.paypal.oslo.feature.qrc.domain.model.review.Contingency) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE, contingency3);
                        i3 |= 8192;
                        qrcMoney7 = qrcMoney5;
                        i4 = 17;
                    case 14:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, 14);
                        i3 |= 16384;
                        i4 = 17;
                    case 15:
                        qrcMoney8 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, qrcMoney8);
                        i2 = 32768;
                        i3 |= i2;
                        i4 = 17;
                    case 16:
                        qrcMoney7 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, 16, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, qrcMoney7);
                        i2 = 65536;
                        i3 |= i2;
                        i4 = 17;
                    case 17:
                        qrcMoney9 = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney$$serializer.INSTANCE, qrcMoney9);
                        i3 |= 131072;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str4 = str3;
            java.util.Map map18 = map16;
            java.util.Map map19 = map17;
            list = list20;
            map = map14;
            map2 = map15;
            str = str4;
            qrcMoney = qrcMoney9;
            contingency = contingency3;
            qrcMoney2 = qrcMoney7;
            list2 = list15;
            list3 = list17;
            list4 = list18;
            map3 = map19;
            map4 = map13;
            z = z3;
            i = i3;
            list5 = list19;
            qrcMoney3 = qrcMoney8;
            list6 = list16;
            z2 = z5;
            map5 = map18;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions(i, list, list5, str, list3, list4, list2, list6, z2, map3, map5, map2, map4, map, contingency, z, qrcMoney3, qrcMoney2, qrcMoney, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions.write$Self$qrc_prodRelease(value, beginStructure, serialDescriptor);
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
