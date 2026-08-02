package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FundingInstrument$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument$$serializer fundingInstrument$$serializer = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument$$serializer();
        INSTANCE = fundingInstrument$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument", fundingInstrument$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("usability", false);
        pluginGeneratedSerialDescriptor.addElement("contingency", true);
        pluginGeneratedSerialDescriptor.addElement("lastDigits", false);
        pluginGeneratedSerialDescriptor.addElement("bankSubtype", true);
        pluginGeneratedSerialDescriptor.addElement("cardSubtype", true);
        pluginGeneratedSerialDescriptor.addElement("cardBrand", true);
        pluginGeneratedSerialDescriptor.addElement("creditOffer", false);
        pluginGeneratedSerialDescriptor.addElement("smartAuthAmount", true);
        pluginGeneratedSerialDescriptor.addElement("contingencies", true);
        pluginGeneratedSerialDescriptor.addElement("formattedSmartAuthAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FundingInstrument$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData$$serializer.INSTANCE), com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[5].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[7].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[8].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[12].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer creditOffer;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability fundingSelectionUsability;
        int i;
        java.lang.String str4;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType;
        java.lang.String str5;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData imageUrlData;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity;
        java.lang.String str6;
        java.util.List list;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType;
        kotlin.Lazy[] lazyArr2;
        java.lang.String str7;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability fundingSelectionUsability2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData imageUrlData2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType2;
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument.$childSerializers;
        int i4 = 10;
        char c = '\t';
        java.util.List list2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType3 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData imageUrlData3 = (com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability fundingSelectionUsability3 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability) beginStructure.decodeSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType4 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType5 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer creditOffer2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer$$serializer.INSTANCE, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), null);
            fISubType2 = fISubType5;
            str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            creditOffer = creditOffer2;
            i = 16383;
            contingencyEntity = contingencyEntity2;
            fISubType = fISubType4;
            str5 = str8;
            fundingInstrumentType = fundingInstrumentType3;
            str = str9;
            str6 = decodeStringElement;
            str4 = str10;
            imageUrlData = imageUrlData3;
            str2 = decodeStringElement2;
            fundingSelectionUsability = fundingSelectionUsability3;
        } else {
            int i5 = 13;
            boolean z = true;
            java.lang.String str11 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType6 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer creditOffer3 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            java.lang.String str16 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability fundingSelectionUsability4 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData imageUrlData4 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType7 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType4 = null;
            int i6 = 0;
            com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        str7 = str11;
                        fundingSelectionUsability2 = fundingSelectionUsability4;
                        imageUrlData2 = imageUrlData4;
                        fISubType3 = fISubType7;
                        fundingInstrumentType2 = fundingInstrumentType4;
                        z = false;
                        fundingInstrumentType4 = fundingInstrumentType2;
                        fundingSelectionUsability4 = fundingSelectionUsability2;
                        fISubType7 = fISubType3;
                        imageUrlData4 = imageUrlData2;
                        lazyArr = lazyArr2;
                        str11 = str7;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 0:
                        lazyArr2 = lazyArr;
                        str7 = str11;
                        fundingSelectionUsability2 = fundingSelectionUsability4;
                        imageUrlData2 = imageUrlData4;
                        fISubType3 = fISubType7;
                        fundingInstrumentType2 = fundingInstrumentType4;
                        str16 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        fundingInstrumentType4 = fundingInstrumentType2;
                        fundingSelectionUsability4 = fundingSelectionUsability2;
                        fISubType7 = fISubType3;
                        imageUrlData4 = imageUrlData2;
                        lazyArr = lazyArr2;
                        str11 = str7;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 1:
                        str7 = str11;
                        lazyArr2 = lazyArr;
                        fundingInstrumentType4 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), fundingInstrumentType4);
                        i6 |= 2;
                        lazyArr = lazyArr2;
                        str11 = str7;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 2:
                        str7 = str11;
                        fundingSelectionUsability2 = fundingSelectionUsability4;
                        imageUrlData2 = imageUrlData4;
                        fISubType3 = fISubType7;
                        str15 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        lazyArr2 = lazyArr;
                        fundingInstrumentType2 = fundingInstrumentType4;
                        fundingInstrumentType4 = fundingInstrumentType2;
                        fundingSelectionUsability4 = fundingSelectionUsability2;
                        fISubType7 = fISubType3;
                        imageUrlData4 = imageUrlData2;
                        lazyArr = lazyArr2;
                        str11 = str7;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 3:
                        str7 = str11;
                        imageUrlData4 = (com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData$$serializer.INSTANCE, imageUrlData4);
                        i6 |= 8;
                        str11 = str7;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 4:
                        fundingSelectionUsability4 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability) beginStructure.decodeSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability$$serializer.INSTANCE, fundingSelectionUsability4);
                        i6 |= 16;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 5:
                        contingencyEntity3 = (com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), contingencyEntity3);
                        i6 |= 32;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 6:
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i6 |= 64;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 7:
                        fISubType7 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), fISubType7);
                        i6 |= 128;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 8:
                        fISubType6 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), fISubType6);
                        i2 = i6 | 256;
                        lazyArr2 = lazyArr;
                        str7 = str11;
                        i6 = i2;
                        fundingSelectionUsability2 = fundingSelectionUsability4;
                        imageUrlData2 = imageUrlData4;
                        fISubType3 = fISubType7;
                        fundingInstrumentType2 = fundingInstrumentType4;
                        fundingInstrumentType4 = fundingInstrumentType2;
                        fundingSelectionUsability4 = fundingSelectionUsability2;
                        fISubType7 = fISubType3;
                        imageUrlData4 = imageUrlData2;
                        lazyArr = lazyArr2;
                        str11 = str7;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 9:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i3 = i6 | 512;
                        i2 = i3;
                        lazyArr2 = lazyArr;
                        str7 = str11;
                        i6 = i2;
                        fundingSelectionUsability2 = fundingSelectionUsability4;
                        imageUrlData2 = imageUrlData4;
                        fISubType3 = fISubType7;
                        fundingInstrumentType2 = fundingInstrumentType4;
                        fundingInstrumentType4 = fundingInstrumentType2;
                        fundingSelectionUsability4 = fundingSelectionUsability2;
                        fISubType7 = fISubType3;
                        imageUrlData4 = imageUrlData2;
                        lazyArr = lazyArr2;
                        str11 = str7;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 10:
                        creditOffer3 = (com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer$$serializer.INSTANCE, creditOffer3);
                        i3 = i6 | 1024;
                        i2 = i3;
                        lazyArr2 = lazyArr;
                        str7 = str11;
                        i6 = i2;
                        fundingSelectionUsability2 = fundingSelectionUsability4;
                        imageUrlData2 = imageUrlData4;
                        fISubType3 = fISubType7;
                        fundingInstrumentType2 = fundingInstrumentType4;
                        fundingInstrumentType4 = fundingInstrumentType2;
                        fundingSelectionUsability4 = fundingSelectionUsability2;
                        fISubType7 = fISubType3;
                        imageUrlData4 = imageUrlData2;
                        lazyArr = lazyArr2;
                        str11 = str7;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 11:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i3 = i6 | 2048;
                        i2 = i3;
                        lazyArr2 = lazyArr;
                        str7 = str11;
                        i6 = i2;
                        fundingSelectionUsability2 = fundingSelectionUsability4;
                        imageUrlData2 = imageUrlData4;
                        fISubType3 = fISubType7;
                        fundingInstrumentType2 = fundingInstrumentType4;
                        fundingInstrumentType4 = fundingInstrumentType2;
                        fundingSelectionUsability4 = fundingSelectionUsability2;
                        fISubType7 = fISubType3;
                        imageUrlData4 = imageUrlData2;
                        lazyArr = lazyArr2;
                        str11 = str7;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 12:
                        list2 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), list2);
                        i3 = i6 | 4096;
                        i2 = i3;
                        lazyArr2 = lazyArr;
                        str7 = str11;
                        i6 = i2;
                        fundingSelectionUsability2 = fundingSelectionUsability4;
                        imageUrlData2 = imageUrlData4;
                        fISubType3 = fISubType7;
                        fundingInstrumentType2 = fundingInstrumentType4;
                        fundingInstrumentType4 = fundingInstrumentType2;
                        fundingSelectionUsability4 = fundingSelectionUsability2;
                        fISubType7 = fISubType3;
                        imageUrlData4 = imageUrlData2;
                        lazyArr = lazyArr2;
                        str11 = str7;
                        i4 = 10;
                        c = '\t';
                        i5 = 13;
                    case 13:
                        str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str11);
                        i6 |= 8192;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str12;
            creditOffer = creditOffer3;
            str2 = str15;
            str3 = str11;
            fundingSelectionUsability = fundingSelectionUsability4;
            i = i6;
            str4 = str14;
            fISubType = fISubType7;
            str5 = str13;
            imageUrlData = imageUrlData4;
            contingencyEntity = contingencyEntity3;
            str6 = str16;
            list = list2;
            fISubType2 = fISubType6;
            fundingInstrumentType = fundingInstrumentType4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument(i, str6, fundingInstrumentType, str2, imageUrlData, fundingSelectionUsability, contingencyEntity, str5, fISubType, fISubType2, str, creditOffer, str4, list, str3, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument.write$Self$inappcheckout_prodRelease(value, beginStructure, serialDescriptor);
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
