package com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DebitCardFundingSource$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource$$serializer debitCardFundingSource$$serializer = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource$$serializer();
        INSTANCE = debitCardFundingSource$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource", debitCardFundingSource$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("fundingSourceType", false);
        pluginGeneratedSerialDescriptor.addElement("issuerName", false);
        pluginGeneratedSerialDescriptor.addElement("lastNChars", false);
        pluginGeneratedSerialDescriptor.addElement("classification", false);
        pluginGeneratedSerialDescriptor.addElement("image", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("contingencyDetails", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DebitCardFundingSource$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[6].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[7].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus debitCardFundingSourceStatus;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fundingSourceType;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource.$childSerializers;
        int i2 = 5;
        int i3 = 3;
        java.lang.String str6 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fundingSourceType2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus debitCardFundingSourceStatus2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            debitCardFundingSourceContingencyType = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            str4 = str10;
            str3 = str8;
            str5 = str9;
            str = str7;
            debitCardFundingSourceStatus = debitCardFundingSourceStatus2;
            fundingSourceType = fundingSourceType2;
            str2 = decodeStringElement;
            i = 255;
        } else {
            int i4 = 0;
            boolean z = true;
            java.lang.String str11 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus debitCardFundingSourceStatus3 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType2 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fundingSourceType3 = null;
            java.lang.String str14 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                        i3 = 3;
                    case 0:
                        str14 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 5;
                        i3 = 3;
                    case 1:
                        fundingSourceType3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), fundingSourceType3);
                        i4 |= 2;
                        i2 = 5;
                        i3 = 3;
                    case 2:
                        str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str11);
                        i4 |= 4;
                        i2 = 5;
                    case 3:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        i4 |= 8;
                    case 4:
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i4 |= 16;
                    case 5:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i4 |= 32;
                    case 6:
                        debitCardFundingSourceStatus3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), debitCardFundingSourceStatus3);
                        i4 |= 64;
                    case 7:
                        debitCardFundingSourceContingencyType2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), debitCardFundingSourceContingencyType2);
                        i4 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fundingSourceType4 = fundingSourceType3;
            i = i4;
            debitCardFundingSourceStatus = debitCardFundingSourceStatus3;
            fundingSourceType = fundingSourceType4;
            java.lang.String str15 = str6;
            str = str11;
            str2 = str14;
            debitCardFundingSourceContingencyType = debitCardFundingSourceContingencyType2;
            str3 = str15;
            java.lang.String str16 = str13;
            str4 = str12;
            str5 = str16;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource(i, str2, fundingSourceType, str, str3, str5, str4, debitCardFundingSourceStatus, debitCardFundingSourceContingencyType, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource.write$Self$debit_card_prodRelease(value, beginStructure, serialDescriptor);
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
