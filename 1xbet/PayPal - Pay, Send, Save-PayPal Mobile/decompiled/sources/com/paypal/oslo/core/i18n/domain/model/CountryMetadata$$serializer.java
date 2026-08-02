package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CountryMetadata$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/CountryMetadata;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/core/i18n/domain/model/CountryMetadata;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/core/i18n/domain/model/CountryMetadata;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CountryMetadata$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.core.i18n.domain.model.CountryMetadata> {
    public static final com.paypal.oslo.core.i18n.domain.model.CountryMetadata$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.core.i18n.domain.model.CountryMetadata$$serializer countryMetadata$$serializer = new com.paypal.oslo.core.i18n.domain.model.CountryMetadata$$serializer();
        INSTANCE = countryMetadata$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.core.i18n.domain.model.CountryMetadata", countryMetadata$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("primaryScript", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, false);
        pluginGeneratedSerialDescriptor.addElement("hidden", false);
        pluginGeneratedSerialDescriptor.addElement("validationRegex", true);
        pluginGeneratedSerialDescriptor.addElement("conditionalRequiredFieldData", false);
        pluginGeneratedSerialDescriptor.addElement("layouts", false);
        pluginGeneratedSerialDescriptor.addElement("presetValue", false);
        pluginGeneratedSerialDescriptor.addElement("subDivisionData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CountryMetadata$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.core.i18n.domain.model.CountryMetadata.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), lazyArr[2].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[3].getValue()), kotlinx.serialization.internal.StringSerializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.Layout$$serializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.Code$$serializer.INSTANCE, lazyArr[7].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.core.i18n.domain.model.CountryMetadata deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.Map map;
        java.lang.String str;
        com.paypal.oslo.core.i18n.domain.model.Layout layout;
        java.util.Map map2;
        com.paypal.oslo.core.i18n.domain.model.Code code;
        java.lang.String str2;
        int i;
        java.util.Map map3;
        java.util.Map map4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.core.i18n.domain.model.CountryMetadata.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        java.util.Map map5 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.util.Map map6 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.util.Map map7 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.util.Map map8 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 4);
            com.paypal.oslo.core.i18n.domain.model.Layout layout2 = (com.paypal.oslo.core.i18n.domain.model.Layout) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.paypal.oslo.core.i18n.domain.model.Layout$$serializer.INSTANCE, null);
            com.paypal.oslo.core.i18n.domain.model.Code code2 = (com.paypal.oslo.core.i18n.domain.model.Code) beginStructure.decodeSerializableElement(serialDescriptor, 6, com.paypal.oslo.core.i18n.domain.model.Code$$serializer.INSTANCE, null);
            map2 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), null);
            str2 = decodeStringElement;
            code = code2;
            layout = layout2;
            str = decodeStringElement2;
            i = 255;
            map3 = map8;
            map4 = map6;
            map = map7;
        } else {
            int i4 = 0;
            boolean z = true;
            java.util.Map map9 = null;
            com.paypal.oslo.core.i18n.domain.model.Layout layout3 = null;
            com.paypal.oslo.core.i18n.domain.model.Code code3 = null;
            java.util.Map map10 = null;
            map = null;
            java.lang.String str3 = null;
            str = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 5;
                    case 0:
                        str3 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        map9 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), map9);
                        i4 |= 2;
                        i2 = 6;
                        i3 = 5;
                    case 2:
                        map = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), map);
                        i4 |= 4;
                        i2 = 6;
                    case 3:
                        map10 = (java.util.Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), map10);
                        i4 |= 8;
                    case 4:
                        str = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                    case 5:
                        layout3 = (com.paypal.oslo.core.i18n.domain.model.Layout) beginStructure.decodeSerializableElement(serialDescriptor, i3, com.paypal.oslo.core.i18n.domain.model.Layout$$serializer.INSTANCE, layout3);
                        i4 |= 32;
                    case 6:
                        code3 = (com.paypal.oslo.core.i18n.domain.model.Code) beginStructure.decodeSerializableElement(serialDescriptor, i2, com.paypal.oslo.core.i18n.domain.model.Code$$serializer.INSTANCE, code3);
                        i4 |= 64;
                    case 7:
                        map5 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 7, (kotlinx.serialization.DeserializationStrategy) lazyArr[7].getValue(), map5);
                        i4 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            layout = layout3;
            map2 = map5;
            code = code3;
            str2 = str3;
            i = i4;
            map3 = map10;
            map4 = map9;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.core.i18n.domain.model.CountryMetadata(i, str2, map4, map, map3, str, layout, code, map2, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.core.i18n.domain.model.CountryMetadata value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.core.i18n.domain.model.CountryMetadata.write$Self$i18n_release(value, beginStructure, serialDescriptor);
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
