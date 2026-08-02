package com.paypal.oslo.feature.debitcard.servicing.domain.activatecard;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DebitCardActivationInfo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo$$serializer debitCardActivationInfo$$serializer = new com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo$$serializer();
        INSTANCE = debitCardActivationInfo$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo", debitCardActivationInfo$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("instrumentId", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("cardImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("lastFourDigits", false);
        pluginGeneratedSerialDescriptor.addElement("isPinSet", false);
        pluginGeneratedSerialDescriptor.addElement("displayAddress", false);
        pluginGeneratedSerialDescriptor.addElement("lifecycleState", false);
        pluginGeneratedSerialDescriptor.addElement("billingAddressId", true);
        pluginGeneratedSerialDescriptor.addElement("expectedArrivalDate", true);
        pluginGeneratedSerialDescriptor.addElement("primary", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DebitCardActivationInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[6].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, lazyArr[10].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType;
        java.lang.String str;
        int i;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        boolean z;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState;
        boolean z2;
        java.lang.String str6;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 5;
        int i5 = 0;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            debitCardProductName = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 3);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 4);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 8);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 9);
            i = 2047;
            debitCardActivationResultType = (com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType) beginStructure.decodeSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            z = decodeBooleanElement2;
            str = str7;
            str4 = decodeStringElement4;
            str3 = decodeStringElement3;
            str2 = decodeStringElement5;
            z2 = decodeBooleanElement;
            str6 = decodeStringElement2;
            debitInstrumentLifecycleState = debitInstrumentLifecycleState2;
            str5 = decodeStringElement;
        } else {
            boolean z3 = true;
            com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType2 = null;
            java.lang.String str8 = null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState3 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName2 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            boolean z4 = false;
            boolean z5 = false;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 9;
                        i3 = 7;
                        i4 = 5;
                    case 0:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = 9;
                        i3 = 7;
                        i4 = 5;
                    case 1:
                        debitCardProductName2 = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), debitCardProductName2);
                        i5 |= 2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 5;
                    case 2:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i2 = 9;
                    case 3:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        i2 = 9;
                    case 4:
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i5 |= 16;
                    case 5:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 32;
                    case 6:
                        debitInstrumentLifecycleState3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), debitInstrumentLifecycleState3);
                        i5 |= 64;
                    case 7:
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i5 |= 128;
                    case 8:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 |= 256;
                    case 9:
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i5 |= 512;
                    case 10:
                        debitCardActivationResultType2 = (com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType) beginStructure.decodeSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), debitCardActivationResultType2);
                        i5 |= 1024;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName3 = debitCardProductName2;
            debitCardActivationResultType = debitCardActivationResultType2;
            str = str8;
            i = i5;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            str5 = str13;
            z = z4;
            debitInstrumentLifecycleState = debitInstrumentLifecycleState3;
            z2 = z5;
            str6 = str12;
            debitCardProductName = debitCardProductName3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo(i, str5, debitCardProductName, str6, str3, z2, str4, debitInstrumentLifecycleState, str, str2, z, debitCardActivationResultType, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo.write$Self$debit_card_prodRelease(value, beginStructure, serialDescriptor);
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
