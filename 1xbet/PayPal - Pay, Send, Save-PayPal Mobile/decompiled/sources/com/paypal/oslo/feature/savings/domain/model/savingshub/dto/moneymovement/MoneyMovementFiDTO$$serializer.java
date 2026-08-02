package com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class MoneyMovementFiDTO$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO$$serializer moneyMovementFiDTO$$serializer = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO$$serializer();
        INSTANCE = moneyMovementFiDTO$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO", moneyMovementFiDTO$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("mode", false);
        pluginGeneratedSerialDescriptor.addElement("source", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("fees", true);
        pluginGeneratedSerialDescriptor.addElement("isDefault", true);
        pluginGeneratedSerialDescriptor.addElement("tags", true);
        pluginGeneratedSerialDescriptor.addElement("limits", true);
        pluginGeneratedSerialDescriptor.addElement("isPreSelected", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MoneyMovementFiDTO$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO$$serializer.INSTANCE, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.DestinationDTO$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FeesDTO$$serializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, lazyArr[6].getValue(), lazyArr[7].getValue(), kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO sourceDTO;
        int i;
        java.lang.String str;
        java.util.List list;
        boolean z;
        boolean z2;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.DestinationDTO destinationDTO;
        java.lang.String str2;
        java.util.List list2;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FeesDTO feesDTO;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.$childSerializers;
        int i2 = 5;
        int i3 = 8;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO sourceDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.DestinationDTO destinationDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.DestinationDTO) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.DestinationDTO$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FeesDTO feesDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FeesDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FeesDTO$$serializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 5);
            java.util.List list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            z2 = decodeBooleanElement;
            z = beginStructure.decodeBooleanElement(serialDescriptor, 8);
            feesDTO = feesDTO2;
            i = 511;
            list = list3;
            str = decodeStringElement2;
            destinationDTO = destinationDTO2;
            sourceDTO = sourceDTO2;
            str2 = decodeStringElement;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i4 = 0;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.DestinationDTO destinationDTO3 = null;
            java.util.List list4 = null;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FeesDTO feesDTO3 = null;
            java.lang.String str3 = null;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO sourceDTO3 = null;
            java.lang.String str4 = null;
            java.util.List list5 = null;
            boolean z5 = false;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 5;
                        i3 = 8;
                    case 0:
                        str4 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 5;
                        i3 = 8;
                    case 1:
                        str3 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 5;
                        i3 = 8;
                    case 2:
                        sourceDTO3 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO$$serializer.INSTANCE, sourceDTO3);
                        i4 |= 4;
                        i2 = 5;
                        i3 = 8;
                    case 3:
                        destinationDTO3 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.DestinationDTO) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.DestinationDTO$$serializer.INSTANCE, destinationDTO3);
                        i4 |= 8;
                        i2 = 5;
                    case 4:
                        feesDTO3 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FeesDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FeesDTO$$serializer.INSTANCE, feesDTO3);
                        i4 |= 16;
                    case 5:
                        z4 = beginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i4 |= 32;
                    case 6:
                        list4 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), list4);
                        i4 |= 64;
                    case 7:
                        list5 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), list5);
                        i4 |= 128;
                    case 8:
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i4 |= 256;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            sourceDTO = sourceDTO3;
            i = i4;
            str = str3;
            list = list4;
            z = z5;
            z2 = z4;
            destinationDTO = destinationDTO3;
            str2 = str4;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FeesDTO feesDTO4 = feesDTO3;
            list2 = list5;
            feesDTO = feesDTO4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO(i, str2, str, sourceDTO, destinationDTO, feesDTO, z2, list, list2, z, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.write$Self$savings_prodRelease(value, beginStructure, serialDescriptor);
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
