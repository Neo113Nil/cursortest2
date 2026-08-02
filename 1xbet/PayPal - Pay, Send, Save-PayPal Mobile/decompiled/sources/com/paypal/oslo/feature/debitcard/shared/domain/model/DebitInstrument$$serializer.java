package com.paypal.oslo.feature.debitcard.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DebitInstrument$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument$$serializer debitInstrument$$serializer = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument$$serializer();
        INSTANCE = debitInstrument$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument", debitInstrument$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("virtualCard", false);
        pluginGeneratedSerialDescriptor.addElement("primary", false);
        pluginGeneratedSerialDescriptor.addElement("expirationDetails", false);
        pluginGeneratedSerialDescriptor.addElement("lastNChars", false);
        pluginGeneratedSerialDescriptor.addElement("productDetails", false);
        pluginGeneratedSerialDescriptor.addElement("shipmentDetails", false);
        pluginGeneratedSerialDescriptor.addElement("cardHolder", false);
        pluginGeneratedSerialDescriptor.addElement("pinStatus", false);
        pluginGeneratedSerialDescriptor.addElement("pinOrigin", false);
        pluginGeneratedSerialDescriptor.addElement("operations", false);
        pluginGeneratedSerialDescriptor.addElement("limits", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DebitInstrument$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus$$serializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails$$serializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails$$serializer.INSTANCE, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails$$serializer.INSTANCE, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder$$serializer.INSTANCE, lazyArr[10].getValue(), lazyArr[11].getValue(), lazyArr[12].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.lang.String str;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin debitInstrumentPinOrigin;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails debitInstrumentProductDetails;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails debitInstrumentShipmentDetails;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder debitInstrumentCardHolder;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus debitInstrumentPinStatus;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits debitInstrumentLimits;
        java.util.List list;
        boolean z;
        boolean z2;
        java.lang.String str2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails debitInstrumentExpirationDetails;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus debitInstrumentStatus;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument.$childSerializers;
        int i2 = 9;
        int i3 = 10;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus debitInstrumentStatus2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus$$serializer.INSTANCE, null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails debitInstrumentExpirationDetails2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails$$serializer.INSTANCE, null);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 6);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails debitInstrumentProductDetails2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails) beginStructure.decodeSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails debitInstrumentShipmentDetails2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails) beginStructure.decodeSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder debitInstrumentCardHolder2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder) beginStructure.decodeSerializableElement(serialDescriptor, 9, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus debitInstrumentPinStatus2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus) beginStructure.decodeSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin debitInstrumentPinOrigin2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin) beginStructure.decodeSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), null);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), null);
            debitInstrumentPinOrigin = debitInstrumentPinOrigin2;
            debitInstrumentCardHolder = debitInstrumentCardHolder2;
            debitInstrumentProductDetails = debitInstrumentProductDetails2;
            str = decodeStringElement3;
            debitInstrumentShipmentDetails = debitInstrumentShipmentDetails2;
            z2 = decodeBooleanElement2;
            str2 = decodeStringElement2;
            debitInstrumentLimits = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits$$serializer.INSTANCE, null);
            i = 16383;
            debitInstrumentPinStatus = debitInstrumentPinStatus2;
            str3 = decodeStringElement;
            debitInstrumentStatus = debitInstrumentStatus2;
            debitInstrumentExpirationDetails = debitInstrumentExpirationDetails2;
            z = decodeBooleanElement;
        } else {
            int i4 = 13;
            i = 0;
            boolean z3 = false;
            boolean z4 = true;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin debitInstrumentPinOrigin3 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails debitInstrumentShipmentDetails3 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder debitInstrumentCardHolder3 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus debitInstrumentPinStatus3 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits debitInstrumentLimits2 = null;
            java.util.List list2 = null;
            str = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails debitInstrumentProductDetails3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus debitInstrumentStatus3 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails debitInstrumentExpirationDetails3 = null;
            boolean z5 = false;
            while (z4) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z4 = false;
                        i2 = 9;
                        i4 = 13;
                        i3 = 10;
                    case 0:
                        str5 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i2 = 9;
                        i4 = 13;
                        i3 = 10;
                    case 1:
                        debitInstrumentStatus3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus) beginStructure.decodeSerializableElement(serialDescriptor, 1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus$$serializer.INSTANCE, debitInstrumentStatus3);
                        i |= 2;
                        i2 = 9;
                        i4 = 13;
                        i3 = 10;
                    case 2:
                        str4 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i2 = 9;
                        i4 = 13;
                    case 3:
                        i |= 8;
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i2 = 9;
                        i4 = 13;
                    case 4:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i |= 16;
                        i2 = 9;
                        i4 = 13;
                    case 5:
                        debitInstrumentExpirationDetails3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails$$serializer.INSTANCE, debitInstrumentExpirationDetails3);
                        i |= 32;
                        i2 = 9;
                        i4 = 13;
                    case 6:
                        str = beginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        i2 = 9;
                        i4 = 13;
                    case 7:
                        debitInstrumentProductDetails3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails) beginStructure.decodeSerializableElement(serialDescriptor, 7, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails$$serializer.INSTANCE, debitInstrumentProductDetails3);
                        i |= 128;
                        i2 = 9;
                        i4 = 13;
                    case 8:
                        debitInstrumentShipmentDetails3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails) beginStructure.decodeSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails$$serializer.INSTANCE, debitInstrumentShipmentDetails3);
                        i |= 256;
                        i2 = 9;
                        i4 = 13;
                    case 9:
                        debitInstrumentCardHolder3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder) beginStructure.decodeSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder$$serializer.INSTANCE, debitInstrumentCardHolder3);
                        i |= 512;
                        i4 = 13;
                    case 10:
                        debitInstrumentPinStatus3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus) beginStructure.decodeSerializableElement(serialDescriptor, i3, (kotlinx.serialization.DeserializationStrategy) lazyArr[i3].getValue(), debitInstrumentPinStatus3);
                        i |= 1024;
                        i4 = 13;
                    case 11:
                        debitInstrumentPinOrigin3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin) beginStructure.decodeSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), debitInstrumentPinOrigin3);
                        i |= 2048;
                        i4 = 13;
                    case 12:
                        list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), list2);
                        i |= 4096;
                        i4 = 13;
                    case 13:
                        debitInstrumentLimits2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLimits$$serializer.INSTANCE, debitInstrumentLimits2);
                        i |= 8192;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            debitInstrumentPinOrigin = debitInstrumentPinOrigin3;
            debitInstrumentProductDetails = debitInstrumentProductDetails3;
            debitInstrumentShipmentDetails = debitInstrumentShipmentDetails3;
            debitInstrumentCardHolder = debitInstrumentCardHolder3;
            debitInstrumentPinStatus = debitInstrumentPinStatus3;
            debitInstrumentLimits = debitInstrumentLimits2;
            list = list2;
            z = z5;
            z2 = z3;
            str2 = str4;
            debitInstrumentExpirationDetails = debitInstrumentExpirationDetails3;
            debitInstrumentStatus = debitInstrumentStatus3;
            str3 = str5;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument(i, str3, debitInstrumentStatus, str2, z, z2, debitInstrumentExpirationDetails, str, debitInstrumentProductDetails, debitInstrumentShipmentDetails, debitInstrumentCardHolder, debitInstrumentPinStatus, debitInstrumentPinOrigin, list, debitInstrumentLimits, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument.write$Self$debit_card_prodRelease(value, beginStructure, serialDescriptor);
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
