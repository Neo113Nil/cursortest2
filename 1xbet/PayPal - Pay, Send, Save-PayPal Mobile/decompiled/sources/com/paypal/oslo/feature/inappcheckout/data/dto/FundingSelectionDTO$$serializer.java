package com.paypal.oslo.feature.inappcheckout.data.dto;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingSelectionDTO$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingSelectionDTO;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingSelectionDTO;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingSelectionDTO;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FundingSelectionDTO$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO$$serializer fundingSelectionDTO$$serializer = new com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO$$serializer();
        INSTANCE = fundingSelectionDTO$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO", fundingSelectionDTO$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("__typename", true);
        pluginGeneratedSerialDescriptor.addElement("fundingInstruments", true);
        pluginGeneratedSerialDescriptor.addElement("config", true);
        pluginGeneratedSerialDescriptor.addElement("contingencies", true);
        pluginGeneratedSerialDescriptor.addElement(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FundingSelectionDTO$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.inappcheckout.data.dto.FundingConfigDTO$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[3].getValue()), lazyArr[4].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        com.paypal.oslo.feature.inappcheckout.data.dto.FundingConfigDTO fundingConfigDTO;
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO.$childSerializers;
        com.paypal.oslo.feature.inappcheckout.data.dto.FundingConfigDTO fundingConfigDTO2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.util.List list4 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.inappcheckout.data.dto.FundingConfigDTO fundingConfigDTO3 = (com.paypal.oslo.feature.inappcheckout.data.dto.FundingConfigDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.inappcheckout.data.dto.FundingConfigDTO$$serializer.INSTANCE, null);
            java.util.List list5 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            str = str2;
            fundingConfigDTO = fundingConfigDTO3;
            list3 = list4;
            list2 = list5;
            i = 31;
        } else {
            int i2 = 0;
            boolean z = true;
            java.util.List list6 = null;
            java.util.List list7 = null;
            java.util.List list8 = null;
            java.lang.String str3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    list8 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), list8);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    fundingConfigDTO2 = (com.paypal.oslo.feature.inappcheckout.data.dto.FundingConfigDTO) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, com.paypal.oslo.feature.inappcheckout.data.dto.FundingConfigDTO$$serializer.INSTANCE, fundingConfigDTO2);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    list7 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), list7);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    list6 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list6);
                    i2 |= 16;
                }
            }
            i = i2;
            fundingConfigDTO = fundingConfigDTO2;
            list = list6;
            list2 = list7;
            list3 = list8;
            str = str3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO(i, str, list3, fundingConfigDTO, list2, list, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO.write$Self$inappcheckout_prodRelease(value, beginStructure, serialDescriptor);
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
