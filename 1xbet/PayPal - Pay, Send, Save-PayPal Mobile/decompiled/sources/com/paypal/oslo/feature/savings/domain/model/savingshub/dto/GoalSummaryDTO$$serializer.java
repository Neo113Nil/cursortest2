package com.paypal.oslo.feature.savings.domain.model.savingshub.dto;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class GoalSummaryDTO$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO$$serializer goalSummaryDTO$$serializer = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO$$serializer();
        INSTANCE = goalSummaryDTO$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO", goalSummaryDTO$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("iconName", false);
        pluginGeneratedSerialDescriptor.addElement("currentAmountFormatted", false);
        pluginGeneratedSerialDescriptor.addElement("targetAmountFormatted", false);
        pluginGeneratedSerialDescriptor.addElement("progress", false);
        pluginGeneratedSerialDescriptor.addElement("isAutoSaveEnabled", false);
        pluginGeneratedSerialDescriptor.addElement("isGeneralSavingsTile", true);
        pluginGeneratedSerialDescriptor.addElement("transferSettings", true);
        pluginGeneratedSerialDescriptor.addElement("targetAmount", true);
        pluginGeneratedSerialDescriptor.addElement("isSmartRouteEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("currentAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GoalSummaryDTO$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.DoubleSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.savings.domain.model.TransferSettingsData$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[9].getValue()), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[11].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        boolean z;
        com.paypal.oslo.feature.savings.domain.model.transfers.Money money;
        int i;
        com.paypal.oslo.feature.savings.domain.model.transfers.Money money2;
        boolean z2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettingsData;
        boolean z3;
        java.lang.String str5;
        double d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.$childSerializers;
        int i2 = 10;
        int i3 = 0;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            double decodeDoubleElement = beginStructure.decodeDoubleElement(serialDescriptor, 5);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 7);
            com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettingsData2 = (com.paypal.oslo.feature.savings.domain.model.TransferSettingsData) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.savings.domain.model.TransferSettingsData$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.savings.domain.model.transfers.Money money3 = (com.paypal.oslo.feature.savings.domain.model.transfers.Money) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(serialDescriptor, 10);
            money = (com.paypal.oslo.feature.savings.domain.model.transfers.Money) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), null);
            z2 = decodeBooleanElement3;
            z3 = decodeBooleanElement2;
            transferSettingsData = transferSettingsData2;
            money2 = money3;
            str4 = str6;
            i = 4095;
            d = decodeDoubleElement;
            str5 = decodeStringElement;
            z = decodeBooleanElement;
            str = decodeStringElement4;
            str2 = decodeStringElement3;
            str3 = decodeStringElement2;
        } else {
            int i4 = 11;
            boolean z4 = true;
            java.lang.String str7 = null;
            com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettingsData3 = null;
            com.paypal.oslo.feature.savings.domain.model.transfers.Money money4 = null;
            com.paypal.oslo.feature.savings.domain.model.transfers.Money money5 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            double d2 = 0.0d;
            boolean z5 = false;
            boolean z6 = false;
            z = false;
            while (z4) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z4 = false;
                        i4 = 11;
                    case 0:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i4 = 11;
                        i2 = 10;
                    case 1:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i4 = 11;
                        i2 = 10;
                    case 2:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i4 = 11;
                        i2 = 10;
                    case 3:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i4 = 11;
                        i2 = 10;
                    case 4:
                        str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                        i3 |= 16;
                        i4 = 11;
                        i2 = 10;
                    case 5:
                        d2 = beginStructure.decodeDoubleElement(serialDescriptor, 5);
                        i3 |= 32;
                    case 6:
                        z = beginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i3 |= 64;
                    case 7:
                        z6 = beginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i3 |= 128;
                    case 8:
                        transferSettingsData3 = (com.paypal.oslo.feature.savings.domain.model.TransferSettingsData) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, com.paypal.oslo.feature.savings.domain.model.TransferSettingsData$$serializer.INSTANCE, transferSettingsData3);
                        i3 |= 256;
                    case 9:
                        money5 = (com.paypal.oslo.feature.savings.domain.model.transfers.Money) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), money5);
                        i3 |= 512;
                    case 10:
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i3 |= 1024;
                    case 11:
                        money4 = (com.paypal.oslo.feature.savings.domain.model.transfers.Money) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (kotlinx.serialization.DeserializationStrategy) lazyArr[i4].getValue(), money4);
                        i3 |= 2048;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            money = money4;
            i = i3;
            money2 = money5;
            z2 = z5;
            str = str8;
            str2 = str9;
            str3 = str11;
            str4 = str7;
            transferSettingsData = transferSettingsData3;
            z3 = z6;
            str5 = str10;
            d = d2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO(i, str5, str3, str2, str, str4, d, z, z3, transferSettingsData, money2, z2, money, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.write$Self$savings_prodRelease(value, beginStructure, serialDescriptor);
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
