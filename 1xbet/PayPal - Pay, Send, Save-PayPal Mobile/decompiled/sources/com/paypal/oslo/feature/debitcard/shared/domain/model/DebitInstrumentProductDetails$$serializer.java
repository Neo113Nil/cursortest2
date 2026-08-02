package com.paypal.oslo.feature.debitcard.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentProductDetails$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentProductDetails;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentProductDetails;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentProductDetails;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DebitInstrumentProductDetails$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails$$serializer debitInstrumentProductDetails$$serializer = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails$$serializer();
        INSTANCE = debitInstrumentProductDetails$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails", debitInstrumentProductDetails$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("legalName", false);
        pluginGeneratedSerialDescriptor.addElement("longName", false);
        pluginGeneratedSerialDescriptor.addElement("shortName", false);
        pluginGeneratedSerialDescriptor.addElement("brand", false);
        pluginGeneratedSerialDescriptor.addElement("largeImage", false);
        pluginGeneratedSerialDescriptor.addElement("smallImage", false);
        pluginGeneratedSerialDescriptor.addElement("links", false);
        pluginGeneratedSerialDescriptor.addElement("actionLinks", true);
        pluginGeneratedSerialDescriptor.addElement("maxAdditionalCardsAllowed", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DebitInstrumentProductDetails$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[4].getValue(), com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls$$serializer.INSTANCE, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls$$serializer.INSTANCE, lazyArr[7].getValue(), lazyArr[8].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.Integer num;
        java.util.List list;
        java.util.List list2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand debitInstrumentCardBrand;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails.$childSerializers;
        int i2 = 9;
        int i3 = 6;
        java.util.List list3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 3);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand debitInstrumentCardBrand2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls4 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls) beginStructure.decodeSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls$$serializer.INSTANCE, null);
            java.util.List list4 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            str4 = decodeStringElement;
            num = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            debitInstrumentImageUrls2 = debitInstrumentImageUrls4;
            debitInstrumentImageUrls = debitInstrumentImageUrls3;
            str = decodeStringElement4;
            str2 = decodeStringElement3;
            list2 = list4;
            str3 = decodeStringElement2;
            debitInstrumentCardBrand = debitInstrumentCardBrand2;
            i = 1023;
        } else {
            int i4 = 0;
            boolean z = true;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls5 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls debitInstrumentImageUrls6 = null;
            java.lang.Integer num2 = null;
            java.util.List list5 = null;
            java.lang.String str5 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand debitInstrumentCardBrand3 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i3 = 6;
                    case 0:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 9;
                        i3 = 6;
                    case 1:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 9;
                        i3 = 6;
                    case 2:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i2 = 9;
                        i3 = 6;
                    case 3:
                        str5 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        i2 = 9;
                        i3 = 6;
                    case 4:
                        debitInstrumentCardBrand3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), debitInstrumentCardBrand3);
                        i4 |= 16;
                        i2 = 9;
                        i3 = 6;
                    case 5:
                        debitInstrumentImageUrls5 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls$$serializer.INSTANCE, debitInstrumentImageUrls5);
                        i4 |= 32;
                    case 6:
                        debitInstrumentImageUrls6 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls) beginStructure.decodeSerializableElement(serialDescriptor, i3, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls$$serializer.INSTANCE, debitInstrumentImageUrls6);
                        i4 |= 64;
                    case 7:
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), list3);
                        i4 |= 128;
                    case 8:
                        list5 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), list5);
                        i4 |= 256;
                    case 9:
                        num2 = (java.lang.Integer) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.IntSerializer.INSTANCE, num2);
                        i4 |= 512;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand debitInstrumentCardBrand4 = debitInstrumentCardBrand3;
            num = num2;
            list = list5;
            list2 = list3;
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            i = i4;
            debitInstrumentCardBrand = debitInstrumentCardBrand4;
            debitInstrumentImageUrls = debitInstrumentImageUrls5;
            debitInstrumentImageUrls2 = debitInstrumentImageUrls6;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails(i, str4, str3, str2, str, debitInstrumentCardBrand, debitInstrumentImageUrls, debitInstrumentImageUrls2, list2, list, num, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails.write$Self$debit_card_prodRelease(value, beginStructure, serialDescriptor);
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
