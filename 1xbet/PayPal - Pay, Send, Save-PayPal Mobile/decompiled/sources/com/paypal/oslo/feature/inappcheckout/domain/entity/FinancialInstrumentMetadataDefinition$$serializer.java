package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataDefinition;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FinancialInstrumentMetadataDefinition$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition$$serializer financialInstrumentMetadataDefinition$$serializer = new com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition$$serializer();
        INSTANCE = financialInstrumentMetadataDefinition$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition", financialInstrumentMetadataDefinition$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("brand", false);
        pluginGeneratedSerialDescriptor.addElement("localizedBrandName", false);
        pluginGeneratedSerialDescriptor.addElement("grouping", false);
        pluginGeneratedSerialDescriptor.addElement("regex", false);
        pluginGeneratedSerialDescriptor.addElement("firstName", false);
        pluginGeneratedSerialDescriptor.addElement("lastName", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, false);
        pluginGeneratedSerialDescriptor.addElement("expiryMonth", false);
        pluginGeneratedSerialDescriptor.addElement("expiryYear", false);
        pluginGeneratedSerialDescriptor.addElement(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, false);
        pluginGeneratedSerialDescriptor.addElement("addressRequired", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FinancialInstrumentMetadataDefinition$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[3].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute;
        int i;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute4;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute5;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute6;
        java.util.List list;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute7;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute8 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.util.List list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 4);
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute9 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute10 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute11 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute12 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute13 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute14 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, 10, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, null);
            metadataAttribute5 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, 11, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, null);
            metadataAttribute2 = metadataAttribute14;
            metadataAttribute4 = metadataAttribute13;
            metadataAttribute = metadataAttribute11;
            metadataAttribute7 = metadataAttribute10;
            metadataAttribute6 = metadataAttribute9;
            metadataAttribute3 = metadataAttribute12;
            str = decodeStringElement4;
            i = 4095;
            str4 = decodeStringElement;
            str2 = decodeStringElement3;
            str3 = decodeStringElement2;
            list = list2;
        } else {
            int i5 = 11;
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute15 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute16 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute17 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute18 = null;
            java.util.List list3 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            int i6 = 0;
            boolean z = true;
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute19 = null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute20 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                    case 0:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                    case 1:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                    case 2:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                    case 3:
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), list3);
                        i6 |= 8;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                    case 4:
                        str5 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        i5 = 11;
                        i2 = 10;
                    case 5:
                        i6 |= 32;
                        metadataAttribute18 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, metadataAttribute18);
                        i5 = 11;
                        i2 = 10;
                    case 6:
                        metadataAttribute15 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, metadataAttribute15);
                        i6 |= 64;
                        i5 = 11;
                    case 7:
                        metadataAttribute8 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, metadataAttribute8);
                        i6 |= 128;
                    case 8:
                        metadataAttribute17 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, metadataAttribute17);
                        i6 |= 256;
                    case 9:
                        metadataAttribute19 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, i3, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, metadataAttribute19);
                        i6 |= 512;
                    case 10:
                        metadataAttribute16 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, metadataAttribute16);
                        i6 |= 1024;
                    case 11:
                        metadataAttribute20 = (com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute) beginStructure.decodeSerializableElement(serialDescriptor, i5, com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute$$serializer.INSTANCE, metadataAttribute20);
                        i6 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.inappcheckout.domain.entity.MetadataAttribute metadataAttribute21 = metadataAttribute18;
            metadataAttribute = metadataAttribute8;
            i = i6;
            metadataAttribute2 = metadataAttribute16;
            metadataAttribute3 = metadataAttribute17;
            metadataAttribute4 = metadataAttribute19;
            metadataAttribute5 = metadataAttribute20;
            str = str5;
            str2 = str7;
            str3 = str8;
            metadataAttribute6 = metadataAttribute21;
            list = list3;
            java.lang.String str9 = str6;
            metadataAttribute7 = metadataAttribute15;
            str4 = str9;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition(i, str4, str3, str2, list, str, metadataAttribute6, metadataAttribute7, metadataAttribute, metadataAttribute3, metadataAttribute4, metadataAttribute2, metadataAttribute5, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition.write$Self$inappcheckout_prodRelease(value, beginStructure, serialDescriptor);
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
