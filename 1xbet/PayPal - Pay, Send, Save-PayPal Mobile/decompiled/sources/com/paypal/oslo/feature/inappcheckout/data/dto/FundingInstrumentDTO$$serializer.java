package com.paypal.oslo.feature.inappcheckout.data.dto;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingInstrumentDTO$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingInstrumentDTO;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingInstrumentDTO;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingInstrumentDTO;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FundingInstrumentDTO$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO$$serializer fundingInstrumentDTO$$serializer = new com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO$$serializer();
        INSTANCE = fundingInstrumentDTO$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO", fundingInstrumentDTO$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("usability", true);
        pluginGeneratedSerialDescriptor.addElement("lastDigits", true);
        pluginGeneratedSerialDescriptor.addElement("cardBrand", true);
        pluginGeneratedSerialDescriptor.addElement("subtype", true);
        pluginGeneratedSerialDescriptor.addElement("contingency", true);
        pluginGeneratedSerialDescriptor.addElement("contingencies", true);
        pluginGeneratedSerialDescriptor.addElement("creditOffer", true);
        pluginGeneratedSerialDescriptor.addElement("smartAuthAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FundingInstrumentDTO$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[9].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[10].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO creditOfferDTO;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO contingencyDTO;
        com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO imageUrlDTO;
        java.lang.String str5;
        java.lang.String str6;
        int i;
        java.lang.String str7;
        java.lang.String str8;
        com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO fundingUsabilityDTO;
        kotlin.Lazy[] lazyArr2;
        java.lang.String str9;
        java.lang.String str10;
        kotlin.Lazy[] lazyArr3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO.$childSerializers;
        int i2 = 8;
        int i3 = 10;
        int i4 = 9;
        java.util.List list2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO imageUrlDTO2 = (com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO fundingUsabilityDTO2 = (com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO$$serializer.INSTANCE, null);
            java.lang.String str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str17 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO contingencyDTO2 = (com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            java.util.List list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO creditOfferDTO2 = (com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO$$serializer.INSTANCE, null);
            list = list3;
            str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str4 = str15;
            str7 = str17;
            creditOfferDTO = creditOfferDTO2;
            contingencyDTO = contingencyDTO2;
            str5 = str12;
            str2 = str16;
            fundingUsabilityDTO = fundingUsabilityDTO2;
            imageUrlDTO = imageUrlDTO2;
            str8 = str13;
            i = 8191;
            str = str14;
            str6 = str11;
        } else {
            int i5 = 12;
            boolean z = true;
            java.lang.String str18 = null;
            java.lang.String str19 = null;
            com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO contingencyDTO3 = null;
            java.lang.String str20 = null;
            com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO creditOfferDTO3 = null;
            java.lang.String str21 = null;
            com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO fundingUsabilityDTO3 = null;
            com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO imageUrlDTO3 = null;
            java.lang.String str22 = null;
            java.lang.String str23 = null;
            java.lang.String str24 = null;
            int i6 = 0;
            java.lang.String str25 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        str9 = str18;
                        str10 = str21;
                        z = false;
                        lazyArr = lazyArr2;
                        i5 = 12;
                        i2 = 8;
                        i3 = 10;
                        i4 = 9;
                        str21 = str10;
                        str18 = str9;
                    case 0:
                        lazyArr2 = lazyArr;
                        str9 = str18;
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str21);
                        i6 |= 1;
                        str23 = str23;
                        lazyArr = lazyArr2;
                        i5 = 12;
                        i2 = 8;
                        i3 = 10;
                        i4 = 9;
                        str21 = str10;
                        str18 = str9;
                    case 1:
                        lazyArr3 = lazyArr;
                        str23 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str23);
                        i6 |= 2;
                        str18 = str18;
                        lazyArr = lazyArr3;
                        i5 = 12;
                        i2 = 8;
                        i3 = 10;
                        i4 = 9;
                    case 2:
                        lazyArr3 = lazyArr;
                        str22 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str22);
                        i6 |= 4;
                        lazyArr = lazyArr3;
                        i5 = 12;
                        i2 = 8;
                        i3 = 10;
                        i4 = 9;
                    case 3:
                        str24 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str24);
                        i6 |= 8;
                        i5 = 12;
                        i2 = 8;
                        i3 = 10;
                        i4 = 9;
                    case 4:
                        imageUrlDTO3 = (com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO$$serializer.INSTANCE, imageUrlDTO3);
                        i6 |= 16;
                        i5 = 12;
                        i2 = 8;
                        i3 = 10;
                    case 5:
                        fundingUsabilityDTO3 = (com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO$$serializer.INSTANCE, fundingUsabilityDTO3);
                        i6 |= 32;
                        i5 = 12;
                        i2 = 8;
                    case 6:
                        str19 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str19);
                        i6 |= 64;
                        i5 = 12;
                    case 7:
                        str25 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str25);
                        i6 |= 128;
                        i5 = 12;
                    case 8:
                        str20 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str20);
                        i6 |= 256;
                        i5 = 12;
                    case 9:
                        contingencyDTO3 = (com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (kotlinx.serialization.DeserializationStrategy) lazyArr[i4].getValue(), contingencyDTO3);
                        i6 |= 512;
                        i5 = 12;
                    case 10:
                        list2 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (kotlinx.serialization.DeserializationStrategy) lazyArr[i3].getValue(), list2);
                        i6 |= 1024;
                        i5 = 12;
                    case 11:
                        creditOfferDTO3 = (com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO$$serializer.INSTANCE, creditOfferDTO3);
                        i6 |= 2048;
                        i5 = 12;
                    case 12:
                        str18 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str18);
                        i6 |= 4096;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            list = list2;
            creditOfferDTO = creditOfferDTO3;
            str = str24;
            str2 = str25;
            str3 = str18;
            str4 = str19;
            contingencyDTO = contingencyDTO3;
            imageUrlDTO = imageUrlDTO3;
            str5 = str23;
            str6 = str21;
            i = i6;
            str7 = str20;
            str8 = str22;
            fundingUsabilityDTO = fundingUsabilityDTO3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO(i, str6, str5, str8, str, imageUrlDTO, fundingUsabilityDTO, str4, str2, str7, contingencyDTO, list, creditOfferDTO, str3, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO.write$Self$inappcheckout_prodRelease(value, beginStructure, serialDescriptor);
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
