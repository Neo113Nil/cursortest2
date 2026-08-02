package com.paypal.oslo.feature.debitcard.servicing.di;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/di/DebitCardServicingDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/debitcard/servicing/di/DebitCardServicingDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/debitcard/servicing/di/DebitCardServicingDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/debitcard/servicing/di/DebitCardServicingDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DebitCardServicingDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination$$serializer debitCardServicingDestination$$serializer = new com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination$$serializer();
        INSTANCE = debitCardServicingDestination$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination", debitCardServicingDestination$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, true);
        pluginGeneratedSerialDescriptor.addElement("cardId", true);
        pluginGeneratedSerialDescriptor.addElement("flowIntent", true);
        pluginGeneratedSerialDescriptor.addElement("entryPoint", true);
        pluginGeneratedSerialDescriptor.addElement("debitCardActivationResultType", true);
        pluginGeneratedSerialDescriptor.addElement("acquisitionOnArrivalAction", true);
        pluginGeneratedSerialDescriptor.addElement("postEnrollmentAction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DebitCardServicingDestination$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[5].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[6].getValue()), lazyArr[7].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction debitCardAcquisitionOnArrivalAction;
        com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType;
        char c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination.$childSerializers;
        int i2 = 3;
        int i3 = 4;
        java.lang.String str4 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName2 = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            str3 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType2 = (com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction debitCardAcquisitionOnArrivalAction2 = (com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            debitCardPostEnrollmentAction = (com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            str4 = str6;
            str = str7;
            str2 = str5;
            debitCardAcquisitionOnArrivalAction = debitCardAcquisitionOnArrivalAction2;
            debitCardActivationResultType = debitCardActivationResultType2;
            debitCardProductName = debitCardProductName2;
            i = 255;
        } else {
            boolean z = true;
            int i4 = 0;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction2 = null;
            com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction debitCardAcquisitionOnArrivalAction3 = null;
            com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType3 = null;
            java.lang.String str10 = null;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 3;
                    case 0:
                        debitCardProductName3 = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), debitCardProductName3);
                        i4 |= 1;
                        i2 = 3;
                        i3 = 4;
                    case 1:
                        c = 2;
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 3;
                    case 2:
                        c = 2;
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i4 |= 4;
                        i2 = 3;
                    case 3:
                        str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str4);
                        i4 |= 8;
                    case 4:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i4 |= 16;
                    case 5:
                        debitCardActivationResultType3 = (com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), debitCardActivationResultType3);
                        i4 |= 32;
                    case 6:
                        debitCardAcquisitionOnArrivalAction3 = (com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), debitCardAcquisitionOnArrivalAction3);
                        i4 |= 64;
                    case 7:
                        debitCardPostEnrollmentAction2 = (com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), debitCardPostEnrollmentAction2);
                        i4 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i4;
            debitCardProductName = debitCardProductName3;
            debitCardPostEnrollmentAction = debitCardPostEnrollmentAction2;
            str = str9;
            str2 = str8;
            str3 = str10;
            com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType4 = debitCardActivationResultType3;
            debitCardAcquisitionOnArrivalAction = debitCardAcquisitionOnArrivalAction3;
            debitCardActivationResultType = debitCardActivationResultType4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination(i, debitCardProductName, str3, str2, str4, str, debitCardActivationResultType, debitCardAcquisitionOnArrivalAction, debitCardPostEnrollmentAction, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination.write$Self$debit_card_prodRelease(value, beginStructure, serialDescriptor);
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
